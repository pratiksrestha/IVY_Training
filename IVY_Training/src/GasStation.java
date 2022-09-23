//There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
//
//        You have a car with an unlimited gas tank and it costs cost[i] of gas to travel from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
//
//        Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique
//        Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
//        Output: 3

import java.util.*;
public class GasStation {
    public static void main(String[] args) {
        int size, current_station, travel;

        System.out.println("enter the number of gas stations: ");
        Scanner s=new Scanner(System.in);
        size=s.nextInt();
        System.out.println("enter the positions of gas stations: ");
        int[] gas=new int[size];
        for(int i=0; i<size; i++){
            gas[i]=s.nextInt();
        }
        System.out.println("enter the cost to travel to the corresponding gas stations: ");
        int[] cost=new int[size];
        for(int i=0; i<size; i++){
            cost[i]=s.nextInt();
        }

//        for(int i=0; i<n; i++){
//            System.out.println(gas[i] +" "+ cost[i]);
//        }
        int fuel, flag=0;

        for(int i=0; i<size; i++){
            fuel = gas[i];
            boolean capacity=true;
            for(int j=0; j<size; j++){
                current_station=(i+j)%size;
                travel=(current_station+1)%size;
                fuel=fuel-cost[current_station];

                if(fuel<0){
                    capacity=false;
                    break;
                }
                fuel=fuel+gas[travel];
            }
            if(capacity){
                System.out.println("The onboarding needs to be done in station "+i+" for a complete round trip to be possible.");
                flag++;
            }
        }
        if(flag==0) {
            System.out.println("A complete round trip is not possible. Error value -1.");
        }

    }
}
