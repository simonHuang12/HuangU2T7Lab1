import java.util.Scanner;

public class pot {
    public static void main(String[] args){
       Scanner e = new Scanner(System.in);

       System.out.println("Enter the first string");
       String str1 = e.nextLine();

       int str1Length = str1.length();
       System.out.println("String length: "+str1Length);

       int halfIndex = str1Length/2;

       String half1 = str1.substring(0, halfIndex);
       String half2 = str1.substring(halfIndex);
       System.out.println("First half: "+half1);
       System.out.println("Second half: "+ half2);

       System.out.println("Enter the second string");
       String str2 = e.nextLine();

       int str2Length = str2.length();
       if (str1Length>str2Length){
           System.out.println(str1 + " is longer");
       }else if (str1Length<str2Length){
           System.out.println(str2 + " is longer");
       }else {
           System.out.println("Both strings are equal length");
       }

       if (str1.equals(str2)){
           System.out.println("Both strings are the exact same");
       }else {
           int comparison = str1.compareTo(str2);
           if (comparison<0){
               System.out.println(str1+" comes first alphabetically");
           }else {
               System.out.println(str2+" comes first alphabetically");
           }
       }
       int str2Index = str1.indexOf(str2);
       if (str2Index != -1){
           System.out.println(str2+" is found in "+str1+" at index"+str2Index);
       }else {
           System.out.println(str2+" is not found in "+str1);
       }


    }
}
