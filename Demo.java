//the course tutorial can be found @
// https://www.runoob.com/java/java-networking.html
// assume that I want to use java to get a webpage, and read the content to echo.
//1. import thing is , a class must be put in the same file with filename same with the class
//this one is to listen to a system port, and receive outputstream from the port, then transfer the outputstream to dataoutputstream. use socket to connect to a remote server port, use client getiputstream to get server response. 
//the concept in this part is , socket bind remote server port, client getoutputstream, then input streams to current host,this one is just a socket client, I will write another socket server that implements thread to accept connections of such client.
import java.net.*;
import java.io.*;

public class Demo{
    public static void main(String[] args) {
        // String serverName=args[0];
        // int port=Integer.parseInt(args[1]);
        String serverName="localhost";
        int port=90;
        try {
            Socket client=new Socket(serverName,port);


        } catch (Exception e) {
            //TODO: handle exception
        }

        System.out.println("Yes");

    }
}