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

public class MyQueue{

    private MyLinkedList queue;
    int count;

    public MyQueue(){
        queue = new MyLinkedList();
    }

 /*
Function Name:      push
Parameters:         int x (the item the user wants to insert)
Return Value(s):    NA
Partners:           CSLC
Description:        This function inserts a parameter (int x) into the front of the deque

*/


    public void push(int e){
        queue.add(0, e);
        count ++;
    }

/*
Function Name:      inject
Parameters:         int y (the item the user wants to insert)
Return Value(s):    NA
Partners:           CSLC
Description:        This function inserts a parameter (int y) into the end of the deque
*/
public void inject(int e){
        queue.add(queue.size(), e);
        count ++;
    }


/*
          Function Name:      pop()
Parameters:         NA
Return Value(s):    The object that was removed
Partners:           CSLC
Description:        This function removes the first item from the deque and returns it
*/



    public int eject(){
        int back = queue.remove(queue.size() -1);
        count --;

        return back;
    }

/*
Function Name:      eject()
Parameters:         NA
Return Value(s):    The object that was removed
Partners:           CSLC
Description:        This function removes the last item from the deque and returns it
*/


    public int pop(){
        int front = queue.remove(0);
        count --;

        return front;
    }


    public boolean isEmpty(){
        if (count == 0)
            return true;
        else
            return false;
    }
public String queueToString(){

        String words = " ";
        for(int i=0; i<count; i++)
        {
            int x = pop();
            words = words + " " + x;
            inject(x);
        }
        return words;

    }
}
             
