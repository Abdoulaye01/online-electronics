//package net.kzn.shoppingbackend.test;
//
//import static org.junit.Assert.assertEquals;
//
//import java.util.Date;
//
//import org.junit.BeforeClass;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import net.kzn.shoppingbackend.dao.ProductDAO;
//import net.kzn.shoppingbackend.dao.ReviewDAO;
//import net.kzn.shoppingbackend.dto.Product;
//import net.kzn.shoppingbackend.dto.Review;
//
//public class ReviewTestCase {
//	
//	private static AnnotationConfigApplicationContext context;
//	private static ReviewDAO reviewDAO;
//	
//	private ProductDAO productDAO;
//	
//	
//	@BeforeClass
//	public static void init() {
//		context = new AnnotationConfigApplicationContext();
//
//		context.scan("net.kzn.shoppingbackend");
//		context.refresh();
//		reviewDAO = (ReviewDAO) context.getBean("reviewDAO");
//	}
//	
//	
//	public void AddReviewTest() {
//		
//		Review review = new Review();
//		
//		
//		review.setCreated(new Date());
//		review.setComment("nice product");
//		Product product = new Product();
//		
//		product.setId(2);
//	
//		review.setRating(4);
//		review.setProduct(product);
//		assertEquals("Successfully added a category inside the table!",true,reviewDAO.add(review));
//		
//		
//		
//	}
//}
