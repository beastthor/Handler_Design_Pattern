package org.example;

public class ConcreteHandlerC implements Handler{
    @Override
    public void handleRequest(Request request){
        System.out.println("ConcreteHandlerC handles the request. ");
    }
}
