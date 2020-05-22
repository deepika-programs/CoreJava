package com.deepika;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Scanner;

import com.deepika.dto.UserInfoDTO;
import com.deepika.service.AuthenticationService;
import com.deepika.service.RegistrationService;
import com.deepika.service.impl.AuthServImpl;
import com.deepika.service.impl.RegistrationServiceImpl;

public class Main {

	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws ParseException, SQLException {

		Main obj = new Main();
		int mainOption = obj.dispMainMenus();

		while (mainOption <= 0 || mainOption > 2) {
			System.out.println("Invalid entry. Please try again with the given options.");
			mainOption = obj.dispMainMenus();
		}
		System.out.println("Selected option is: " + mainOption);

		switch (mainOption) {
		case 1:
			// obj.register();
			System.out.println("****Registration Form****");
			boolean reg = obj.register();
			while (!reg) {
				System.out.println("Registration is not successful. Try with vaid input again.");
				reg = obj.register();
			}
			System.out.println("Registration successful");
			break;
		case 2:
			System.out.println("Authentication Process...");
			// get username and password then validate with db
			boolean auth = obj.login();
			while (!auth) {
				System.out.println("Login is not successful. Try with vaid input again.");
				auth = obj.login();
			}
			System.out.println("Login successful");

			System.out.println("choose any option:");
			int submenu = obj.submenus();
			while (submenu <= 0 || submenu > 3) {
				System.out.println("Invalid option..try again");
				obj.submenus();
			}
			System.out.println("selected option is:" + submenu);
			switch (submenu) {
			case 1:
				String updatedPassword = obj.resetpwd();
				System.out.println("Updated Password is : " + updatedPassword);
				break;
			case 2:
				obj.listUsers();
				break;
			case 3:
				String user = obj.findUserByEmail();
				System.out.println(user);
				break;
			}
		}

	}

	public int dispMainMenus() {
		System.out.println("1. Register");
		System.out.println("2. Login");
		return sc.nextInt();
	}

	public int submenus() {
		System.out.println("1. Reset Password");
		System.out.println("2. ListAllUsers");
		System.out.println("3. FindUsersbyEmail");
		return sc.nextInt();
	}

	private boolean register() throws ParseException {

		UserInfoDTO userinf = new UserInfoDTO();
		RegistrationService reg = new RegistrationServiceImpl();

		System.out.println("enter the name:");
		userinf.setName(sc.next());

		System.out.println("enter the dob:");
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		userinf.setDob(format.parse(sc.next()));

		System.out.println("enter the phoneno:");
		userinf.setPhnno(sc.next());

		System.out.println("enter the email:");
		userinf.setEmail(sc.next());

		System.out.println("enter the userid:");
		userinf.setUsername(sc.next());

		System.out.println("enter the password:");
		userinf.setPasswd(sc.next());

		boolean result = reg.register(userinf);
		if (result) {
			System.out.println(userinf);
		}
		return result;

	}

	private boolean login() throws SQLException {
		AuthenticationService authser = new AuthServImpl();
		System.out.println("enter the username:");
		String username = sc.next();
		System.out.println("enter the password:");
		String passwd = sc.next();
		return authser.login(username, passwd);
	}

	private List<UserInfoDTO> listUsers() {
		AuthenticationService authser = new AuthServImpl();
		authser.listUsers();
		return null;
	}

	private String findUserByEmail() {
		System.out.println("Enter email:");
		String email = sc.next();
		AuthenticationService authser = new AuthServImpl();
		authser.findUserByEmail(email);
		return null;
	}

	private String resetpwd() {
		System.out.println("enter email:");
		String email = sc.next();
		AuthenticationService authser = new AuthServImpl();
		return authser.resetpassword(email);

	}

}