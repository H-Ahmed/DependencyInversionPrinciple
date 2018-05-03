package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DatabaseHandler databaseHandler = new DatabaseHandler();
        databaseHandler.connect();
        databaseHandler.disconnect();
    }
}
