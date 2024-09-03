package BasicPrograms;

import static java.lang.Character.isLetter;

public class ReverseOnlyCharactersfromString {
    public static void main(String[] args) {
        String str="moh87*mn#g";
        char[] arr=str.toCharArray();
        StringBuffer revstr=new StringBuffer();
        for (int i=arr.length-1;i>=0;i--){
            if(isLetter(arr[i])){
                revstr.append(arr[i]);
            }
        }
        StringBuffer rev=new StringBuffer();
        int i=0;
        for(char c:str.toCharArray()){
            if(isLetter(c)){
                rev.append(revstr.charAt(i));
                i++;
            }else{
                rev.append(c);
            }
        }
        System.out.println(rev);

    }
}
