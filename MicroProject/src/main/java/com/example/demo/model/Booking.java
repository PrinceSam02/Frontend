package com.example.demo.model;



import java.time.LocalDate;
import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;


@Entity
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    
    private int numOfAdults;

    private int numOfChildren;

    private int totalNumOfGuest;
    private String roomType;
    
    private double totalPrice;
    @Lob
    @Column(name = "aadharImage",length = 100000)
    
    private byte[] aadharImage;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDate getCheckInDate() {
		return checkInDate;
	}

	public void setCheckInDate(LocalDate checkInDate) {
		this.checkInDate = checkInDate;
	}

	public LocalDate getCheckOutDate() {
		return checkOutDate;
	}

	public void setCheckOutDate(LocalDate checkOutDate) {
		this.checkOutDate = checkOutDate;
	}

	public int getNumOfAdults() {
		return numOfAdults;
	}

	public void setNumOfAdults(int numOfAdults) {
		this.numOfAdults = numOfAdults;
	}

	public int getNumOfChildren() {
		return numOfChildren;
	}

	public void setNumOfChildren(int numOfChildren) {
		this.numOfChildren = numOfChildren;
	}

	public int getTotalNumOfGuest() {
		return totalNumOfGuest;
	}

	public void setTotalNumOfGuest(int totalNumOfGuest) {
		this.totalNumOfGuest = totalNumOfGuest;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public byte[] getAadharImage() {
		return aadharImage;
	}

	public void setAadharImage(byte[] aadharImage) {
		this.aadharImage = aadharImage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Booking() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Booking(Long id, LocalDate checkInDate, LocalDate checkOutDate, int numOfAdults, int numOfChildren,
			int totalNumOfGuest, String roomType, double totalPrice, byte[] aadharImage, User user, Room room) {
		super();
		this.id = id;
		this.checkInDate = checkInDate;
		this.checkOutDate = checkOutDate;
		this.numOfAdults = numOfAdults;
		this.numOfChildren = numOfChildren;
		this.totalNumOfGuest = totalNumOfGuest;
		this.roomType = roomType;
		this.totalPrice = totalPrice;
		this.aadharImage = aadharImage;
		this.user = user;
		this.room = room;
	}

	@Override
	public String toString() {
		return "Booking [id=" + id + ", checkInDate=" + checkInDate + ", checkOutDate=" + checkOutDate
				+ ", numOfAdults=" + numOfAdults + ", numOfChildren=" + numOfChildren + ", totalNumOfGuest="
				+ totalNumOfGuest + ", roomType=" + roomType + ", totalPrice=" + totalPrice + ", aadharImage="
				+ Arrays.toString(aadharImage) + ", user=" + user + ", room=" + room + "]";
	}

	

    
}
