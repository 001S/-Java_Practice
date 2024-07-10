package ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListReteriveElement {
    public static void main(String[] args){
        List<String> countryList = new ArrayList<>();
        System.out.println("Is large country list empty? " + countryList.isEmpty());
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of required countries");
        int n = sc.nextInt();
        System.out.println("Enter top "+n+" large countries");
        for(int i=0;i<n;i++){
            countryList.add(sc.next());
        }
     System.out.println("Top countries added by user " +countryList.size());
        String FirstLargeCountry = countryList.get(0);
        String SecondLargeCountry = countryList.get(1);
        String LastLargeCountry = countryList.get(countryList.size()-1);

        System.out.println("First large country "+FirstLargeCountry);
        System.out.println("Second large country "+SecondLargeCountry);
        System.out.println("Last Large country  "+LastLargeCountry);

        countryList.set(3,"UK");
        System.out.println("Modified country List "+ countryList);

    }
}
