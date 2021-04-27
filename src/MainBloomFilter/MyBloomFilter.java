/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainBloomFilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class MyBloomFilter {
    private int mInsertions;
    private float mFpp;
    protected ArrayList<Integer> arr;
    protected BloomFilter<Integer> filter;
    
    public MyBloomFilter(String pInsertions, String pFpp){
    mInsertions = Integer.valueOf(pInsertions);
    mFpp = Float.valueOf(pFpp);    
        filter = BloomFilter.create(
        Funnels.integerFunnel(),
  mInsertions,
  mFpp);
    }
    
    public void InputElements(){
        this.arr = new ArrayList<Integer>();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How many elements?: ");
        Integer ArrSize = Integer.valueOf(myScanner.nextLine());
        System.out.println("Type the elements: ");
        for(int i = 0; i < ArrSize; i++){
            Integer element = Integer.valueOf(myScanner.nextLine());
            arr.add(element);         
        }
        for(Integer i: arr)
         filter.put(i);
    }
    
    public boolean testArray(int pElement)
    {
        return this.filter.mightContain(pElement);
    }
     
}
