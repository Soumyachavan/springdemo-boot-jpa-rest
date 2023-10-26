package com.myapp.spring.model;

import java.time.LocalDate;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "boot_products" )
public class Product {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "PRODUCT_ID", nullable = false)
		 private Integer productId;
	
	@Column(name = "PRODUCT_NAME", nullable = false, unique = true)
		 private String productName;
	
	@Column(name = "PRODUCT_PRICE", nullable = false)
		 private Double price;
	
	@Column(name = "PRODUCT_RATING", nullable = false)
		 private Double starRating;
	
	@Column(name = "PRODUCT_AVAILABLE", nullable = false)
		 private LocalDate productAvailable;
	
	@Column(name = "PRODUCT_IAMGE_URL", nullable = false, unique = true)
		 private String imageUrl;

		 
	 // public Product() {
		// TODO Auto-generated constructor stub
	//}


	public Product(String productName, Double price, Double starRating, LocalDate productAvailable, String imageUrl) {
		this.productName = productName;
		this.price = price;
		this.starRating = starRating;
		this.productAvailable = productAvailable;
		this.imageUrl = imageUrl;
	}


	public Integer getProductId() {
		return productId;
	}


	public void setProductId(Integer productId) {
		this.productId = productId;
	}


	public String getProductName() {
		return productName;
	}


	public void setProductName(String productName) {
		this.productName = productName;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public Double getStarRating() {
		return starRating;
	}


	public void setStarRating(Double starRating) {
		this.starRating = starRating;
	}


	public LocalDate getProductAvailable() {
		return productAvailable;
	}


	public void setProductAvailable(LocalDate productAvailable) {
		this.productAvailable = productAvailable;
	}


	public String getImageUrl() {
		return imageUrl;
	}


	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}


	@Override
	public int hashCode() {
		return Objects.hash(imageUrl, price, productAvailable, productId, productName, starRating);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(imageUrl, other.imageUrl) && Objects.equals(price, other.price)
				&& Objects.equals(productAvailable, other.productAvailable)
				&& Objects.equals(productId, other.productId) && Objects.equals(productName, other.productName)
				&& Objects.equals(starRating, other.starRating);
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [productId=");
		builder.append(productId);
		builder.append(", productName=");
		builder.append(productName);
		builder.append(", price=");
		builder.append(price);
		builder.append(", starRating=");
		builder.append(starRating);
		builder.append(", productAvailable=");
		builder.append(productAvailable);
		builder.append(", imageUrl=");
		builder.append(imageUrl);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	}

