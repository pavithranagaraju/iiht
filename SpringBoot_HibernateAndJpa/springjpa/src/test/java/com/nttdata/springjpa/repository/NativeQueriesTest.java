package com.nttdata.springjpa.repository;


	


	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertNull;

	import java.util.List;

	import javax.persistence.EntityManager;
	import javax.persistence.Query;
	import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.slf4j.Logger;
	import org.slf4j.LoggerFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.boot.test.context.SpringBootTest;
	import org.springframework.test.annotation.DirtiesContext;
	import org.springframework.test.context.junit4.SpringRunner;


import com.nttdata.springjpa.SpringjpaApplication;
	import com.nttdata.springjpa.entity.Course;
	@RunWith(SpringRunner.class)
	@SpringBootTest(classes=SpringjpaApplication.class)
	public class NativeQueriesTest {
		
		private Logger logger = LoggerFactory.getLogger(this.getClass());
		
		@Autowired
		EntityManager em;
		
		@Test
		public void native_queries_basic() {
			Query query = em.createNativeQuery("Select  *  From Course c where id=?",Course.class);
			query.setParameter(1, 10001L);
			List resultList = query.getResultList();
			logger.info("Select  *  From Course c where id=?-> {}",resultList);
		}
		

		@Test
		public void native_queries_with_named_parameter() {
			Query query = em.createNativeQuery("Select  *  From course c where id=:id",Course.class);
			query.setParameter("id", 10001L);
			List resultList = query.getResultList();
			logger.info("Select  *  From Course c where id=:id-> {}",resultList);
			
		}
		@Test
		@Transactional
		public void native_queries_to_update() {
			Query query = em.createNativeQuery("Update  course set   lastupdatedate=sysdate()",Course.class);
			int noOfRowsUpdated=query.executeUpdate();
			logger.info("noOfRowsUpdated ->{}",noOfRowsUpdated);
			
			
		}
		
		
		

		/*@Test
		public void jpql_typed() {
			TypedQuery<Course> query = 
						em.createNamedQuery("query_get_all_courses", Course.class);
			
			List<Course> resultList = query.getResultList();
			
			logger.info("Select  c  From Course c -> {}",resultList);
		}

		@Test
		public void jpql_where() {
			TypedQuery<Course> query = 
						em.createNamedQuery("Select  c  From Course c where name like '%100 Steps'", Course.class);
			
			List<Course> resultList = query.getResultList();
			
			logger.info("Select  c  From Course c where name like '%100 Steps'-> {}",resultList);
			//[Course[Web Services in 100 Steps], Course[Spring Boot in 100 Steps]]
		}

	*/


}
