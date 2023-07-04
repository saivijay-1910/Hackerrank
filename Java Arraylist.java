import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList <ArrayList<Integer>> al=new ArrayList<ArrayList<Integer>>();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            ArrayList<Integer> list=new ArrayList<Integer>();
            int m=in.nextInt();
            for(int j=0;j<m;j++){
                int m1=in.nextInt();
                list.add(m1);
            }
            al.add(list);
        }
        int p=in.nextInt();
        for(int c = 0; c<p; c++){
        int x, y;
        x = in.nextInt();
        y = in.nextInt();
        try{
           System.out.println(al.get(x-1).get(y-1)); 
        } catch (IndexOutOfBoundsException e){
            System.out.println("ERROR!");
        }
        }
    in.close();
    }
}
