package net.kzn.onlineshopping.service;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.kzn.shoppingbackend.dao.ProductDAO;
import net.kzn.shoppingbackend.dao.ReviewDAO;
import net.kzn.shoppingbackend.dto.Product;
import net.kzn.shoppingbackend.dto.Review;

@Service("reviewService")
public class ReviewService {
	
	@Autowired
	private ProductDAO productDAO;
	
//	@Autowired
//	private ReviewDAO reviewDAO;
		
	@Autowired
	private HttpSession session;
	
//	public String addReview(int id) {
//		
//		String response = null;
//		Review review = reviewDAO.get( id);
//		
//		
//			
//	}
//		
	

}
