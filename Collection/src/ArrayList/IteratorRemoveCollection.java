package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class IteratorRemoveCollection {
    public static void main(String[] args){
        List<Integer> lt = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the require number ");
        int n = sc.nextInt();
        System.out.println("Enter required element ");
        for(int i=0;i<n;i++){
            lt.add(sc.nextInt());
        }
        Iterator<Integer> numberInteger = lt.iterator();
        while(numberInteger.hasNext()){
            Integer num = numberInteger.next();
            if(num%2 !=0){
                numberInteger.remove();
            }
        }
        System.out.println(lt);
    }
}
