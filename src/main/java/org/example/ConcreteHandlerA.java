package org.example;

public class ConcreteHandlerA implements Handler{
    private Handler nextHandler;

    @Override
    public void handleRequest(Request request){
        if(request.getType() == RequestType.TYPE_A){
            System.out.println("ConcreteHandlerA handles the request. ");
        }
        else if (nextHandler != null){
            nextHandler.handleRequest(request);
        }

    }
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }


}
