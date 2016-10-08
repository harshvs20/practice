package com.is.harsh.practice;

/**
 * Created by hshrivastava on 9/8/16.
 */
public class AlgorithmsPractice {

    public AlgorithmsPractice(){}

    public static void main(String[] args){
//        int[] anArray = {5,2,4,6,1,3,7,13,11,6,90};
//        printArray(insertionSort(anArray));

        Node n4 = new Node(10, null);
        Node n3 = new Node(5, n4);
        Node n2 = new Node(3, n3);
        Node n1 = new Node(1, n2);

        Node n8 = new Node(11, null);
        Node n7 = new Node(6, n8);
        Node n6 = new Node(4, n7);
        Node n5 = new Node(2, n6);

        System.out.print(merge(n1,n5).next.value);
    }

    /*
     Insertion Sort
    * */
    public static int[] insertionSort(int[] arr){
        for(int j = 1 ; j < arr.length; j++){
            int key = arr[j];
            int i = j-1;
            while(i >= 0 && arr[i] > key){
                arr[i+1] = arr[i];
                i = i -1;
            }
            arr[i+1] = key;
        }
        return arr;
    }

    private static void printArray(int[] anArray) {
        for (int i = 0; i < anArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(anArray[i]);
        }
    }

    /*
    * Linked list merge
    * */
    public static Node merge(Node node1, Node node2){
        if(node1 == null && node2 != null) return node2;
        if(node2 == null && node1 != null) return node1;
        if (node1 == null && node2 == null) return null;

        if(node1.value < node2.value){
            node1.next = merge(node1.next, node2);
            return node1;
        }
        else{
            node2.next = merge(node1, node2.next);
            return node2;
        }
    }


    public static class Node {
        public int value;
        public Node next;
        public Node head;
        public Node tail;
        int size = 0;

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

        public boolean isEmpty(){return size == 0;}
        public void addFirst(Node newNode){
            if(head==null){
                head = newNode;
                head.next = null;
                tail = head;
                size++;
            }
            else if(newNode!=null){
                newNode.next = head;
                head = newNode;
                size++;
            }
        }

        public void addLast(Node newNode){
            if(tail == null && head == null){
                addFirst(newNode);
            }
            else if(newNode!=null){
                tail.next = newNode;
                newNode.next = null;
                tail = newNode;
                size++;
            }
        }

        public Node(){}
    }


}
