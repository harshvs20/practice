package com.is.harsh.practice;

/**
 * Created by hshrivastava on 10/5/16.
 */
import java.util.Stack;

class DoubleLinkedList{
    Stack<Integer> s;
    Stack<Integer> t;
    int count;
    DoubleLinkedList(){
        s = new Stack<Integer>();
        t = new Stack<Integer>();
        
        count = 0;
    }

    public void insertInBeginning(int data){
        while(!s.isEmpty()){
            t.push(s.pop());
        }
        s.push(data);
        count++;
    }

    public void insertAtEnd(int data){
        while(!t.isEmpty()){
            s.push(t.pop());
        }
        t.push(data);
        count++;
    }

    public void moveForward(){
        while(!t.isEmpty()){
            int temp = t.pop();
            System.out.println(temp);
            s.push(temp);
        }
    }

    public void moveBackward(){
        while(!s.isEmpty()){
            int temp = s.pop();
            System.out.println(temp);
            t.push(temp);
        }
    }

    public void delete(int data){
        while(!s.isEmpty()){
            t.push(s.pop());
        }
        while(!t.isEmpty()){
            if(t.peek() == data){
                t.pop();
                return;
            }
            else{
                s.push(t.pop());
            }
        }
    }

    public void deleteFirst(){
        while(!s.isEmpty()){
            int temp = s.pop();
            if(s.peek() == null){
                return;
            }
            t.push(temp);
        }
    }

    public void deleteLast(){
        while(!t.isEmpty()){
            int temp = t.pop();
            if(t.peek() == null){
                return;
            }
            s.push(temp);
        }
    }
}
