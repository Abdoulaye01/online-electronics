package net.kzn.shoppingbackend.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Review  implements Serializable{
 
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reviewId", unique = true, nullable = false)
    private Long id;    
 
    @Column(name = "user_id")
	private int userId;
 
    @Column(name = "comment", nullable = false, length = 1000)
    private String comment;
 
    @Column(name = "rating", nullable = true)
    private int rating;
 

 
    @Column(name = "created", nullable = true)
    private Date created;    
 
   @ManyToOne
   @JoinColumn
   private Product product;
    

	public Review() {
		super();
	}



	

	public Review(Long id, int userId, String comment, int rating, Date created) {
		super();
		this.id = id;
		this.userId = userId;
		this.comment = comment;
		this.rating = rating;
		this.created = created;
	}





	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}


	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	


	public Product getProduct() {
		return product;
	}





	public void setProduct(Product product) {
		this.product = product;
	}





	@Override
	public String toString() {
		return "Review [id=" + id + ", userId=" + userId + ", comment=" + comment + ", rating=" + rating + " created=" + created + "]";
	}
	
	

	
 
   
 

}
