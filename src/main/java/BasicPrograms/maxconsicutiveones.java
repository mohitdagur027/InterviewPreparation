package BasicPrograms;

public class maxconsicutiveones {

    /* find the maximum length subarry with number of zeros =k
    where k=2
    and string contains 0 and 1
     */
    public static void main(String[] args) {
        int[] arr={1,1,1,1,0,0,0,1,1,1,1,0};
        int k=2;
        int maxlen=0;
        int r=0, l=0, zerocount=0;
        while(r<arr.length){
            if(arr[r]==0){
                zerocount++;
            }

            while(zerocount>k){
                if(arr[l]==0){
                    zerocount--;
                }
                l++;
            }
            if(zerocount<=k){
                int len=r-l+1;
                maxlen=Math.max(maxlen,len);
            }
            r++;
        }
        System.out.println(maxlen);

    }
}
