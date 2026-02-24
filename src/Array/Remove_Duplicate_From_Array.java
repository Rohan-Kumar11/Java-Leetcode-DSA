package Arrays;

public class Remove_Duplicate_From_Array {
    static void main(String[] args) {
        int[] nums = {1,1,2};
        System.out.println(removeDuplicates(nums));

    }
    static public int removeDuplicates(int[] nums) {
       int[] arr= new int[nums.length];
        int count =1;
        int check=nums[0];
        arr[0]=nums[0];
        int i=0;
        int j=1;
        while(i<nums.length){
            count++;
            if(check==nums[i]){
                i++;
            }
            else{
                check=nums[i];
                arr[j]=nums[i];
                j++;
            }
        }
        int[] nums = new int[j];
        for(int k=0 ; k<j ;k++){
            nums[k]=arr[k];
        }
        
        return count;

    }
}
