package BasicPrograms;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;

public class Getthenumbersthosehavesalphabtebothsides {
    public static void main(String[] args) {
        String str="11yz1b53i7o99z";
        char[] arr=str.toCharArray();
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();
        for(int i=1; i<arr.length-2;i++){
            if(isLetter(arr[i-1])&& isDigit(arr[i]) && isLetter(arr[i+1])){
                System.out.println(arr[i]);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                int count=map.get(arr[i]);
                map.replace(arr[i],count,count+1);

            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"     "+entry.getValue());
        }
    }
}
