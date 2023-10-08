package org.example;

public class ConcreteHandlerB implements Handler{
    private Handler nextHandler;

    @Override
    public void handleRequest(Request request){
        if(request.getType() == RequestType.TYPE_B){
            System.out.println("ConcreteHandlerB handles the request. ");
        }
        else if (nextHandler != null){
            nextHandler.handleRequest(request);
        }
    }

    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }
}
