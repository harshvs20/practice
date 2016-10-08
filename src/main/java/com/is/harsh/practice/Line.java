package com.is.harsh.practice;

/**
 * Created by hshrivastava on 9/21/16.
 */
public class Line {

    public static void main(String[] args){
        System.out.println(Line.Tickets(new int []{25,50,50,25,75}));
    }

    public static String Tickets(int[] peopleInLine)
    {
        int totalMoney = 0;
        int ticketPrice = 25;
        boolean ok = false;
        for(Integer each : peopleInLine){
            if(each==ticketPrice){
                totalMoney += each;
                ok = true;
            }
            if(each >= ticketPrice){
                if(each-ticketPrice > totalMoney){
                    ok = false;
                    break;
                }
                else{
                    totalMoney += each;
                    totalMoney -= ticketPrice;
                    ok = true;
                }
            }
            else{
                ok = false;
                break;
            }
        }
        if(ok){
            return "YES";
        }else return "NO";
    }
}
