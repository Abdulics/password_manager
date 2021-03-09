package com.dulTek.passManager.model;

public class password_generator {
	private int length;
	private int num_of_passwords;
	private String[] randomPasswords;

	public password_generator(int length, int num_of_password) {
		this.length = length;
		this.num_of_passwords = num_of_password;
		this.randomPasswords = new String[num_of_passwords];
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getNum_of_password() {
		return num_of_passwords;
	}

	public void setNum_of_password(int num_of_password) {
		this.num_of_passwords = num_of_password;
	}

	public String[] getRandomPasswords() {
		return randomPasswords;
	}

	public void setRandomPasswords(String[] randomPasswords) {
		this.randomPasswords = randomPasswords;
	}

	public void randomPassword() {
		System.out.println("Random password method called");
		// Randomly generate passwords total number of times
		for (int i = 0; i < num_of_passwords; i++) {
			// Create a variable to store the random password
			String randomPassword = "";
			// Randomly generate a character for the password length number of times
			for (int j = 0; j < length; j++) {
				// Add a random lowercase or UPPERCASE character to our randomPassword String
				randomPassword += randomCharacter();
			}
			// Add the random password to your array
			this.randomPasswords[i] = randomPassword;
		}
	}

	// This function generates random characters and numberr
	private static char randomCharacter() {
		int rand = (int) (Math.random() * 62);

		if (rand <= 9) {
			// Number (48-57 in ASCII)
			// To convert from 0-9 to 48-57, we can add 48 to rand because 48-0 = 48
			int number = rand + 48;
			// This way, rand = 0 => number = 48 => '0'
			// Remember to cast our int value to a char!
			return (char) (number);
		} else if (rand <= 35) {
			// Uppercase letter (65-90 in ASCII)
			// To convert from 10-35 to 65-90, we can add 55 to rand because 65-10 = 55
			int uppercase = rand + 55;
			// This way, rand = 10 => uppercase = 65 => 'A'
			// Remember to cast our int value to a char!
			return (char) (uppercase);
		} else {
			// Lowercase letter (97-122 in ASCII)
			// To convert from 36-61 to 97-122, we can add 61 to rand because 97-36 = 61
			int lowercase = rand + 61;
			// This way, rand = 36 => lowercase = 97 => 'a'
			// Remember to cast our int value to a char!
			return (char) (lowercase);
		}
	}

}
