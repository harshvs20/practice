package com.is.harsh.practice;

/**
 * Created by hshrivastava on 10/5/16.
 */
public class UseDoubleLinkedListByStack {

    public static void main(String args[]){
        DoubleLinkedList list = new DoubleLinkedList();
        list.insertInBeginning(4);
        list.insertInBeginning(3);
        list.insertInBeginning(2);
        list.insertInBeginning(1);

        list.insertAtEnd(5);
        list.insertAtEnd(6);
        list.insertAtEnd(7);

        list.moveBackward();
        list.moveForward();

        list.delete(5);

        list.moveBackward();
        list.moveForward();

        System.out.print(list);

    }
}
