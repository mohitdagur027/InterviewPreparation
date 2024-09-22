package BasicPrograms;

import java.util.HashMap;

public class TwoFruitBasket {
    public static void main(String[] args) {
        int[] arr={3,3,3,1,2,1,1,2,3,3,4};
        int basket=2;
        int l=0,r=0,maxlen=0;
        int first=0,last=0;
        HashMap<Integer,Integer> map=new HashMap<>();
         while(r<arr.length){
             if(map.containsKey(arr[r])){
                 int count=map.get(arr[r]);
                 map.replace(arr[r],count, count+1);
             }else{
                 map.put(arr[r],1);
             }
             while(map.size()>basket){
                 int count2=map.get(arr[l]);
                 if(count2>1){
                     map.replace(arr[l],count2,count2-1);
                 }else{
                     map.remove(arr[l]);
                 }
                 l++;
             }

             if(map.size()<=basket){
                 int len=r-l+1;
                 if(len>maxlen) {
                     maxlen = len;
                     first=l;
                     last=r;
                 }


             }
             r++;
         }
        System.out.println(maxlen);
         for(int i=first;i<=last;i++){
        System.out.println(arr[i]);
         }
    }
}
