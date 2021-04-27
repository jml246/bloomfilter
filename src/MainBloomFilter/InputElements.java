/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainBloomFilter;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class is for inputting elements in the bloom filter
 * @author jose
 */
public class InputElements {
    private ArrayList<Integer> arr;
    
    public InputElements(){
        this.arr = new ArrayList<Integer>();
    Scanner myScanner = new Scanner(System.in);
    System.out.println("How many elements?: ");
    Integer ArrSize = Integer.valueOf(myScanner.nextLine());
    for(int i = ArrSize; i <= ArrSize; i++){
        Integer element = Integer.valueOf(myScanner.nextLine());
        arr.add(element);         
    }
    
    
    }
}
