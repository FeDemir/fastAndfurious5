package Setup;

import java.util.*;



public class SortString {
    public static String sortString(String str){
        if(str.length()==0) return str;
        else{
            String[] text=str.split("");
            Arrays.sort(text);
            return Arrays.toString(text).replaceAll("\\W","");
        }
    }
    public static String print(String[] a, String[] b){
        int count=0;
        String  text="";
        String[] arr=new String[a.length+b.length];
        for (String i:a) {
            if(!i.isEmpty()){
                arr[count]=i;
                count+=2;
            }
        }
        count=1;
        for (String i:b) {
            if(!i.isEmpty()){
                arr[count]=i;
                count+=2;
            }
        }
        //System.out.println(Arrays.toString(arr));
        for (String i:arr) {
            if(i!=null)
                text+=i;
        }
        return  text;
    }


    public static void main(String[] args) {
        /*
        Enter text
        Create letters and numbers array
        sort each array's element
        check if str start with letter or number
        then based on start pick one element from each other
        put arrays' elements in order back together
         */
        String str="DC501GCCCA098911";
        //we split str in two arrays one takes letters as group, one takes numbers as group
        String[] letter=str.split("\\d+");
        String[] num=str.split("[a-zA-Z]+");
        //we sort both arrays
        for (int i = 0; i < letter.length; i++) {
            letter[i]=sortString(letter[i]);
        }
        for (int i = 0; i < num.length; i++) {
            num[i]=sortString(num[i]);
        }

        //we check if str starts with letter or number because we'll decide if we pick first from letters or numbers
        if(str.charAt(0)>64) System.out.println(print(letter,num));
        else System.out.println(print(num,letter));
        
    }
}
