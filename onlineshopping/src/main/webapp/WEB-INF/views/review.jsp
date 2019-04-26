<%@taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!------ Include the above in your HEAD tag ---------->

<div class="container">
	<div class="row" style="margin-top: 40px;">
		<div class="col-md-6">
			<div class="well well-sm">
				<div class="text-right">
					<a class="btn btn-success btn-green" href="#reviews-anchor"
						id="open-review-box">Leave a Review</a>
				</div>

				<div class="row" id="post-review-box" style="display: none;">
					<div class="col-md-12">
						<form accept-charset="UTF-8" action="" method="post"
							action="/manage/review" modelAttribute="review">
							<input id="ratings-hidden" id="rating" path="rating"
								type="hidden" />
							<textarea class="form-control animated" cols="50" id="new-review"
								id="comment" path="comment"
								placeholder="Enter your review here..." rows="5"></textarea>

							<div class="text-right">
								<div class="stars starrr" data-rating="0"></div>
								<a class="btn btn-danger btn-sm" href="#" id="close-review-box"
									style="display: none; margin-right: 10px;"> <span
									class="glyphicon glyphicon-remove"></span>Cancel
								</a>
								<button class="btn btn-success btn-lg" type="submit">Save</button>
							</div>
						</form>
					</div>
				</div>
			</div>

		</div>
	</div>
<!-- 
	<div class="tab-content">

		<div class="tab-pane fade " id="review">
			<div class="aa-product-review-area">
				<h4>${reviewCommentList.size()}Reviews</h4>
				<ul class="aa-review-nav">
					<c:forEach items="${reviewCommentList}" var="productComment">
						<li>
							<div class="media">
								<div class="media-body">
									<h4 class="media-heading">
										<strong>${review.user.firstName}</strong> - <span>${review.created}</span>
									</h4>
									<div class="aa-product-rating">
										<c:forEach begin="1" end="${review.rating}">
											<span class="fa fa-star"></span>
										</c:forEach>
										<c:forEach begin="1" end="${review.rating}">
											<span class="fa fa-star-o"></span>
										</c:forEach>
									</div>
									<p>${review.comment}</p>
								</div>
							</div>
						</li>
					</c:forEach>
				</ul>
			</div>
			-->