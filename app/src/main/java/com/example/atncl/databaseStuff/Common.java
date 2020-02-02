package com.example.atncl.databaseStuff;

public class Common {
    private static String dbName = ""; //add database name
    private static String collectionName = ""; //add collection name
    private static String apiKey = ""; //add API key

    public static String getAddressSignle() {
        String bareURL = String.format("https://api.mlab/api/1/databases/%s/collections/&s", dbName, collectionName); //main URL may change to
        reutrn;
    }
}
