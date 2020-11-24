package pages;

import java.util.*;
import java.util.stream.Collectors;

public class SimpleClass {


    public static void main(String[] args) {

        
        String input = "I love Java ";
        StringBuilder str = new StringBuilder();
        str.append(input);

        String reverseInput = str.reverse().toString();

        System.out.println(reverseInput);

        if(input.equalsIgnoreCase(reverseInput)){
            System.out.println("Reverse sentence:" +reverseInput+ "It is a palindrome");
        } else
            System.out.println("Reverse sentence: " + reverseInput+ "It is not a palindrome");



        /*
        String st="I am am not the one who is thinking I one thing at time";
        String []ar = st.split(" ");
        Map<String, Integer> mp= new HashMap<String, Integer>();
        int count=0;

        for(int i=0;i<ar.length;i++){
            count=0;

            for(int j=0;j<ar.length;j++){
                if(ar[i].equals(ar[j])){
                    count++;
                }
            }

            mp.put(ar[i], count);
        }

        System.out.println(mp);

    }
 /*

        String string = "Big black bug bit a big black dog on his big black nose";
        int count;

        //Converts the string into lowercase
        string = string.toLowerCase();

        //Split the string into words using built-in function
        String words[] = string.split(" ");

        System.out.println("Duplicate words in a given string : ");
        for(int i = 0; i < words.length; i++) {
            count = 1;
            for(int j = i+1; j < words.length; j++) {
                if(words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            //Displays the duplicate word if count is greater than 1
            if(count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
*/
   /*
    public static void main(String[] args) {
        int arr [] = {5,3,2,1,4};
        Arrays.sort(arr);
        for ( int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
        Arrays.asList(arr);
//-------------------------------------------------------------
        System.out.println();
        List<Integer> list = Arrays.asList(5,3,2,1,4,6);

        Collections.sort(list, Collections.reverseOrder());
        System.out.print(list);

        System.out.println();
//----------------------------------------------------------
        int num1=50;
        List<Integer> evenNum=new ArrayList<>();
        List<Integer> oddNum=new ArrayList<>();

        for(int w=1; w<=num1; w++){
            if (w%2==0){
                
                System.out.print(w+ " ");
                System.out.println();
            }else{
                System.out.print(w+" ");
            }

        }






        List<Integer> sList = new ArrayList<>();
        sList.add(1);
        sList.add(3);
        sList.add(2);
        sList.add(4);
        sList.add(5);
      //  Collections.sort(sList);    //sorts array list
        Collections.sort(sList, Collections.reverseOrder()); //reverse
        for(Integer num: sList)
            System.out.print(" "+num);

        System.out.println();

        List<String> slist = Arrays.asList("78", "a", "m", "b", "z", "c", "12", "l", "1");
        List<String>sortedList=slist.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        sortedList.forEach(System.out::print);


    */
    }
}









