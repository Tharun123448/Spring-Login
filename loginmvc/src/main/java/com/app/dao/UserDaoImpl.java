package com.app.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.beans.UserRegistration;


@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void saveUser(UserRegistration userRegistration) {
		Session session = sessionFactory.openSession();
		//String sql_query = "select * from user_details";
		
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(UserRegistration.class);
		session.saveOrUpdate(userRegistration);
		System.out.println("user data saved successfully!!!");
		//System.out.println(list);
		
		
	}

	@Override
	public UserRegistration authenticateUser(UserRegistration userRegistration) {
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		String sql_query = "from com.app.beans.UserRegistration as u where u.user_id=:userId and u.password=:password";
		try {
			Query query = session.createQuery(sql_query);
			
			query.setParameter("userId", userRegistration.getUser_id());
			query.setParameter("password", userRegistration.getPassword());
			userRegistration= (UserRegistration) query.uniqueResult();
			tx.commit();
			session.close();
		}catch(Exception e) {
			tx.rollback();
			session.close();
			e.printStackTrace();
		}
		return userRegistration;
	}

	@Override
	public List<UserRegistration> getUserDetails() {
		Session session = sessionFactory.openSession();
		//String sql_query = "select * from user_details";
		@SuppressWarnings("deprecation")
		Criteria criteria = session.createCriteria(UserRegistration.class);
		List<UserRegistration> list = criteria.list();
		return list;
	}

	

}
