//You have a set of integers s, which originally contains all the numbers from 1 to n. 
// Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, 
// which results in repetition of one number and loss of another number.
//You are given an integer array nums representing the data status of this set after the error.
//Find the number that occurs twice and the number that is missing and return them in the form of an array.
//Example 1:
//Input: nums = [1,2,2,4]
//Output: [2,3]


public class setmismatch {
     public int[] findErrorNums(int[] nums) {
        int n=nums.length;
        int[] freq=new int[n+1];
        int dup=-1 , mis=-1;

        for(int num:nums){
            freq[num]++;
        }
        for(int i=0; i<=n; i++){
           if(freq[i]==2){
            dup=i;
           }
           if(freq[i]==0){
            mis=i;
           }
        }
        return new int[]{dup,mis};
    }
}
