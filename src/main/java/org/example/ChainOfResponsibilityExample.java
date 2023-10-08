package org.example;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ChainOfResponsibilityExample {
   public static void main(String[ ]  args){
       // Create concrete handlers
       Handler handlerA = new ConcreteHandlerA();
       Handler handlerB = new ConcreteHandlerB();
       Handler handlerC = new ConcreteHandlerC();

       // Set up the chain
       ((ConcreteHandlerA) handlerA).setNextHandler(handlerB);
       ((ConcreteHandlerB) handlerB).setNextHandler(handlerC);

       // Create the requests
       Request requestA = new Request(RequestType.TYPE_A);
         Request requestB = new Request(RequestType.TYPE_B);
            Request requestC = new Request(RequestType.TYPE_C);

            // send requests through the chain
       handlerA.handleRequest(requestA);
       handlerA.handleRequest(requestB);
       handlerA.handleRequest(requestC);
   }
}