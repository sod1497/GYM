package connection_test;

import dataManager.connection;
import objects.*;

public class connection_test{
    public static void main(String[] args) {
    	String r = null;
    	connection.select("select * from Exercise", r);
        System.out.println(r);
    }
}

