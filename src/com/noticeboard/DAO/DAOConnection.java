package com.noticeboard.DAO;

import com.mongodb.MongoClient;

public class DAOConnection {
    private static final String host = "127.0.0.1";
    private static final int port = 27017;
    
    public static MongoClient getMongoClient() {
        MongoClient client=null;
        try{
            client = new MongoClient(host,port);
        }catch(Exception e){
            e.printStackTrace();
        }
        return client;
    }
    
}
