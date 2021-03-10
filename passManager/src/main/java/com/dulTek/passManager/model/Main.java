package com.dulTek.passManager.model;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Password_generator p = new Password_generator(15, 6);
		//p.randomPassword();
		String[] pass = p.getRandomPasswords();
		for(int i = 0; i < pass.length; i++) {
		      System.out.println(pass[i]);
		    }
	}
	}

