package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CollectionSortingArrayList {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required number of element which have to be sort ");
        int n = sc.nextInt();
        System.out.println("Enter the elements");
        List<Integer> lt =new ArrayList<>();
        for(int i=0;i<n;i++){
            lt.add(sc.nextInt());
        }
        System.out.println("element enter by user before sort "+lt);
        Collections.addAll(lt, 123,45,67,3,44);
        System.out.println("element entered in class "+lt);
        Collections.sort(lt);
        System.out.println("Sorted array list "+lt);
    }
}
