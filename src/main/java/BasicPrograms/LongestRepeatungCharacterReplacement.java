package BasicPrograms;

public class LongestRepeatungCharacterReplacement {
    public static void main(String[] args) {
        String str="AABAAAABAACCCCCCA";
        int k=2;
        char[] arr=str.toCharArray();

        int maxlen=0;
        int first=0;
        int last=0;
        for (int i=0; i<arr.length;i++){
            int[] count=new int[26];
            int maxfreq=0;
            for (int j=i;j<arr.length;j++){
                count[arr[j]-'A']++;
                maxfreq=Math.max(maxfreq,count[arr[j]-'A']);

                if(j-i+1-maxfreq<=k){
                    int len=j-i+1;
                    //maxlen=Math.max(maxlen,len);
                    if(len>maxlen){
                        maxlen=len;
                        first=i;
                        last=j;

                    }
                }
            }
        }
        System.out.println(maxlen);
        System.out.println(str.substring(first, last+1));

    }

}
