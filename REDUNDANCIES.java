/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redundancies;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author S653957
 */
public class REDUNDANCIES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //I meant to make a loop that allowed the user to input numbers but I was too lazy when writing this :/
        int[] numArray = {1, 2, 5, 5, 7, 8, 7, 3, 6, 6, 2, 4, 5};
        ArrayList<Integer> rList = new ArrayList<>();
        HashMap<Integer, Integer> tracker = new HashMap<>();
        for (int index = 0; index < numArray.length; index++) {
            if(tracker.containsKey(numArray[index])){
                tracker.put(numArray[index], tracker.get(numArray[index])+1);
                rList.add(numArray[index]);
            }else{
                tracker.put(numArray[index], 1);
            }
        }
        /*now all the array values are mapped to the number of times that they
        appear in case you want to check and also all of the redundancies
        are in their own list, but not in order which could be easily done, but
        that would require a sort function which would not work in n time
        */
        System.out.print("Original list: ");
        for (int index = 0; index < numArray.length; index++) {
            System.out.print(numArray[index] + " ");
        }
        System.out.print("\nRedundancies as they occur: ");
        for (int index = 0; index < rList.size(); index++) {
            System.out.print(rList.get(index) + " ");
        }
        /*this one serves no purpose except my IDE shows a completed message
        and I wanted it on the next line
        */
        System.out.println("");
    }
    
}
