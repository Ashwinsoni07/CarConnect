package com.Model;

public class Review {
	 private int customer_id;
	    private int vehicle_id;
	    private String review_comment;
	    private int review_id;
	    private int review_rating;
		/*Constructor*/
		public Review(int customer_id, int vehicle_id, String review_comment, int review_id, int review_rating) {
			
			this.customer_id = customer_id;
			this.vehicle_id = vehicle_id;
			this.review_comment = review_comment;
			this.review_id = review_id;
			this.review_rating = review_rating;
		}
		
		
		public Review() {
			
		}

		/*Overrided toString Method*/
		@Override
		public String toString() {
			return "Review [customer_id=" + customer_id + ", vehicle_id=" + vehicle_id + ", review_comment="
					+ review_comment + ", review_id=" + review_id + ", review_rating=" + review_rating + "]";
		}
		
		/*Getters and Setters for variables*/
		public int getCustomer_id() {
			return customer_id;
		}
		public void setCustomer_id(int customer_id) {
			this.customer_id = customer_id;
		}
		public int getVehicle_id() {
			return vehicle_id;
		}
		public void setVehicle_id(int vehicle_id) {
			this.vehicle_id = vehicle_id;
		}
		public String getReview_comment() {
			return review_comment;
		}
		public void setReview_comment(String review_comment) {
			this.review_comment = review_comment;
		}
		public int getReview_id() {
			return review_id;
		}
		public void setReview_id(int review_id) {
			this.review_id = review_id;
		}
		public int getReview_rating() {
			return review_rating;
		}
		public void setReview_rating(int review_rating) {
			this.review_rating = review_rating;
		}
}
