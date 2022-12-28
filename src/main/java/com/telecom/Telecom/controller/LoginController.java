package com.telecom.Telecom.controller;

import java.util.HashMap;

public class LoginController {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("ram", 500);
		map.put("rohit", 1000);
		map.put("manoj", 1500);

		map.forEach((k, v) -> System.out.println("Key = " + k + " Value = " + v));
	}
}
