import java.util.Scanner;
/*
Name : Mariah Schon
Class : 3320-001
Assignment 3
Due Date : September 22, 2016
Honor Pledge: On my honor as a student of the University
of Nebraska at Omaha, I have neither given nor received
unauthorized help on this homework assignment.

NAME: Mariah Schon
NUID: 581
EMAIL: mschon@unomaha.edu
Partners: CSLC
*/

public class prob1{
    public static int count= 0;
//    MyQueue q = new MyQueue();



    public static void main(String [] args){

        //Create scanner variable
        Scanner input = new Scanner(System.in);
        int operation = 1;

        MyQueue q = new MyQueue();

        //while the operation was not "QUIT"
        while(operation >= 1 && operation <= 4 ){
            //Operation Stuff
            System.out.printf("Enter operation for deque (1: Push, 2: Pop, 3: Inject, 4: Eject, 5: Quit): ");
            operation = input.nextInt();
            if ( operation != 5){
                //Based on operation picked, a method is called.


                switch (operation){

                    case 1:
                        System.out.printf("Enter element to push: ");
                        int pushElement = input.nextInt();
                        q.push(pushElement);
                        break;
                    case 2:
                        if (q.isEmpty()==false){
                            int front = q.pop();}
                        else
                            System.out.println("Deque is empty, nothing to pop");
                             break;
                    case 3:
                        System.out.printf("Enter element to inject: ");
                        int injElement = input.nextInt();
                        q.inject(injElement);
                        break;
                    case 4:
                        if  (q.isEmpty() == false){
                            int back = q.eject();}
                        else
                            System.out.println("Deque is empty, nothing to eject");
                        break;
                    case 5:
                        System.out.println("Bye!");
                        break;
                }
            }
            else{
                System.out.println("Bye!!");
                break;
            }

            //Prints the deque
            System.out.printf("Current Deque: ");
            System.out.printf("%s \n",q.queueToString());
        }
    }
}
                                        
