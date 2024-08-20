package com.example.demo.model;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String roomNumber;
    private String roomType; // e.g., Single, Double
    private String roomPhotoUrl;
    private String roomDescription;
    private double price;

    @OneToMany(mappedBy = "room")
    private List<Booking> bookings = new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public String getRoomPhotoUrl() {
		return roomPhotoUrl;
	}

	public void setRoomPhotoUrl(String roomPhotoUrl) {
		this.roomPhotoUrl = roomPhotoUrl;
	}

	public String getRoomDescription() {
		return roomDescription;
	}

	public void setRoomDescription(String roomDescription) {
		this.roomDescription = roomDescription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Room(Long id, String roomNumber, String roomType, String roomPhotoUrl, String roomDescription, double price,
			List<Booking> bookings) {
		super();
		this.id = id;
		this.roomNumber = roomNumber;
		this.roomType = roomType;
		this.roomPhotoUrl = roomPhotoUrl;
		this.roomDescription = roomDescription;
		this.price = price;
		this.bookings = bookings;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", roomNumber=" + roomNumber + ", roomType=" + roomType + ", roomPhotoUrl="
				+ roomPhotoUrl + ", roomDescription=" + roomDescription + ", price=" + price + ", bookings=" + bookings
				+ "]";
	}
    
}

