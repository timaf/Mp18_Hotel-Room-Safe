package at.refugeescode.Mp18_HotelRoomSafe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mp18HotelRoomSafeApplication {

	public static void main(String[] args) {
		SpringApplication.run(Mp18HotelRoomSafeApplication.class, args);
	}
}
/*	The Hotel Room Safe application has one page that shows the belongings of the customer of that room.
This page can only be accessed with one html login page where the customer can write the credentials
with the username as “guest” and the password as “secret”.
The application must provide its own implementation of the login form and encrypt the password
of the in memory user details manager with the bcrypt password encoding algorithm.*/
