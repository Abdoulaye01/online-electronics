package net.kzn.shoppingbackend.dao;

import java.util.List;

import net.kzn.shoppingbackend.dto.Product;
import net.kzn.shoppingbackend.dto.Review;

public interface ReviewDAO {
	
	
	public List<Review> getProduct(Product productId);

	boolean add(Review review);

	List<Review> getProduct(long productId, int userId);	
	
	
}
