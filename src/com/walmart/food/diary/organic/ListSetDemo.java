package com.walmart.food.diary.organic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

// data structure  ==

public class ListSetDemo {

	private static final String Arraylist = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// List --> allows duplicates and follows the insertion order

		// Set --> no duplicates and no insertion order

		// Wrapper classes --> jdk 1.5
		// what are wrapper classes

		int a = 10; // --> stack memory --> this data will be available till the thread alive
		// Mark sweep algorithm --> dean process --> garbage collection --> heap memory

		// 100 oops =---> primitive data types === its objects
		/*
		 * 100 object oriented proigramming language --> Wrapper classes --> int stack
		 * === Integer heap char stack == Character heap long stack === Long heap
		 * boolean stack === Boolean heap byte stack === Byte heap float stack === Float
		 * heap double stack === Doub le heap
		 */
		// collectionname<Datatype/wrapperclass> objectName = new collectionname<>()
		//// java.lang --> object class

		ArrayList<Integer> studentNos = new ArrayList<>();

		// CRUD ==Operations
		// for every CRUD change ,it requires reindexing , new memory allocation takes
		// place and re shuffles
		// this leads to the performance issue == reindex

		studentNos.add(10);
		studentNos.add(1000);
		studentNos.add(1000);
		studentNos.add(1222);
		studentNos.add(10222);
		studentNos.add(10);
		studentNos.add(1000);

		System.out.println(studentNos);

		// bulk data == just read operation use ArrayList

		HashSet<Integer> studentNos2 = new HashSet<>();

		// CRUD ==Operations

		studentNos2.add(10);
		studentNos2.add(1000);
		studentNos2.add(1000);
		studentNos2.add(1222);
		studentNos2.add(10222);
		studentNos2.add(10);

		System.out.println(studentNos2);

		// Home work :
		// create data using linked list and Treeset and print
		// read all the interview questions of the programs = last three days

		// as per the java standard the declaration of the Object on the implemnetation
		// classes

		// left side interface name<warpper classes / any other class> variablename =
		// new Implmentationclass<>()

		List<Integer> studentNosList = new ArrayList<>();

		// 1. if the data is keeping changing --> shopping cart --> items / adding and
		// removing
		// // all once u create the data -0-> it wont change much

		List<String> studentNames = new LinkedList<>();

		// where data is going through insert / update/ delete Operations --> then use
		// linked
		// linked internally works on pointer concept
		// where is change happens in the neighbor node simply current node update the
		// pointer

		studentNames.add("ram");
		studentNames.add("test");
		studentNames.add("java");
		studentNames.add("kotlin");

		// Map --> 6 implementation class 1. HashTable - 2. HashMap 3. LinkedHashMap
		// 4.TreeMap(SorttedMap)

		Map<Integer, String> studentMap = new HashMap<>();

		studentMap.put(10, "rama");
		studentMap.put(11, "javaram");
		studentMap.put(12, "supriya");
		studentMap.put(13, "sai");
		studentMap.put(14, "suresh");

		System.out.println(studentMap);

		// duplicate key --> if map has duplicate key ---> what will happen

		Map<Integer, String> studentMap2 = new HashMap<>();
		studentMap2.put(10, "rama");
		studentMap2.put(10, "javaram"); // rama overiden by javaram
		studentMap2.put(12, "supriya");
		studentMap2.put(13, "sai");
		studentMap2.put(10, "suresh");// javaram overiden by suresh

		System.out.println(studentMap2);

		// duplicate value
		Map<Integer, String> studentMap3 = new HashMap<>();

		studentMap3.put(10, "rama");
		studentMap3.put(11, "suresh");
		studentMap3.put(12, "rama");
		studentMap3.put(13, "sai");
		studentMap3.put(14, "suresh");

		System.out.println(studentMap3);

	}

}
