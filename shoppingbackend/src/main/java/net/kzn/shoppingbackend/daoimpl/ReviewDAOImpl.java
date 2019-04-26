package net.kzn.shoppingbackend.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import net.kzn.shoppingbackend.dao.ReviewDAO;
import net.kzn.shoppingbackend.dto.CartLine;
import net.kzn.shoppingbackend.dto.Product;
import net.kzn.shoppingbackend.dto.Review;
import net.kzn.shoppingbackend.dto.User;

@Repository("reviewDAO")
@Transactional
public class ReviewDAOImpl implements ReviewDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	


	@Override
	public List<Review> getProduct(long productId , int id) {
		String query = "FROM Review WHERE id = : id AND product.id = :productId";
		try{
		return sessionFactory
				.getCurrentSession()
					.createQuery(query,Review.class)
						.setParameter("productId", productId)
						.setParameter("id", id)
						.getResultList();
		}
		catch(Exception ex) {
			return null;
		}
		
	}

	
	@Override
	public boolean add(Review review) {
		try {			
			sessionFactory.getCurrentSession().persist(review);			
			return true;
		}
		catch(Exception ex) {
			return false;
		}
	}


	@Override
	public List<Review> getProduct(Product productId) {
		// TODO Auto-generated method stub
		return (List<Review>) sessionFactory.getCurrentSession().get(Review.class, productId);
	}
	

}
