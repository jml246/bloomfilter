/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainBloomFilter;

import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;
import java.util.Scanner;

/**
 *
 * @author jose
 */
public class MainBloomFilter {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ans;
        MyBloomFilter myBloomFilter = new MyBloomFilter(args[0], args[1]);
        myBloomFilter.InputElements();

        
        Scanner myScanner = new Scanner(System.in);
        Scanner testScanner = new Scanner(System.in);
        while(true){
        System.out.println("Test?: y/n");
        ans = myScanner.nextLine();
            if(ans.contains("y")){
               System.out.println("Input element to test?: ");
               String t = testScanner.nextLine();
               Integer testEl = Integer.valueOf(t);
               System.out.println(myBloomFilter.filter.mightContain(testEl));
            }
            else{break;}
        }
        System.out.println("You replied: " + ans);
        
        System.out.println("Good bye");
        //end main
    }
    
}
