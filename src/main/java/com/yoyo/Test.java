package com.yoyo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		System.out.println("a");
		System.out.println("c");
		System.out.println("d");
		System.out.println("e");
		System.out.println("f");
		System.out.println("g");
		System.out.println("h");
		System.out.println("i");
		System.out.println("j");
		System.out.println("k");
		System.out.println("m");
		Collection<String> coll = new HashSet<String>();
		coll.add("asdf");
		coll.add(null);
		coll.add("asdf");
		coll.add(null);
		coll.add("asdf");
		for (String string : coll) {
			System.out.println(string);
		}
		List<String> list = new ArrayList<String>();
		list.add(null);
		coll.removeAll(list);
		System.out.println("***************************************");
		for (String string : coll) {
			System.out.println(string);
		}
	}
}
