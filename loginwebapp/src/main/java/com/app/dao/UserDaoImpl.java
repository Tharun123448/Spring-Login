package com.app.dao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;

import com.app.entites.UserRegistration;

public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	

	@Override
	public List<UserRegistration> authenticateUser(String userId, String password) {
		 
		Session session = sessionFactory.openSession();
			@SuppressWarnings("deprecation")
			Criteria criteria = session.createCriteria(UserRegistration.class);
			Criterion userID = Restrictions.lt("userId", userId);
			Criterion passWord = Restrictions.ilike("password", password);
			LogicalExpression exp = Restrictions.and(userID, passWord);
			criteria.add(exp);
			@SuppressWarnings("unchecked")
			List<UserRegistration> userList = criteria.list();
			
			return userList;
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public String saveUser(UserRegistration userRegistration) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		
		@SuppressWarnings("unchecked")
		Query<UserRegistration> query = session.createQuery("insert into UserRegistration(user_id, name, email_id, passwor)values(:userId, :userName, :EmailId, :Password)");
		query.setParameter("userId", userRegistration.getUser_id());
		query.setParameter("UserName", userRegistration.getName());
		query.setParameter("EmailId", userRegistration.getEmail_id());
		query.setParameter("Password", userRegistration.getPassword());
		int row = query.executeUpdate();
		if(row>0) {
			tx.commit();
			return "success";
		}
		else {
			tx.rollback();
			return "failed";
		}
	}

}
