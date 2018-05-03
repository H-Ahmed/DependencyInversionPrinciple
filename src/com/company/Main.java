package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        DatabaseHandler databaseHandler = new DatabaseHandler(new OracleDatabase());
        databaseHandler.connect();
        databaseHandler.disconnect();
    }
}
