/*
 * 
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that 
 * each unique element appears only once. The relative order of the elements should be kept the same. 
 * Then return the number of unique elements in nums.
 * 
 * Input: nums = [1,1,2]
Output: 2, nums = [1,2,_]


Input: nums = [0,0,1,1,1,2,2,3,3,4]
Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]



 * 
 */


public class RemoveDuplicateFromSortedArray_26 {

    public int removeDuplicates(int[] a){

        if(a==null || a.length==0)
            return 0;
        int writeIndex=1;

        for (int i=1; i<a.length; i++ ){
            if (a[i-1]!=a[i]){
                a[writeIndex]=a[i];
                writeIndex++;
            }
        }
        return writeIndex;
    }


    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray_26 obj=new RemoveDuplicateFromSortedArray_26();
        int[] a=new int[] { 1, 1, 2, 2, 3, 3, 4};

        System.out.println("No of Unique Elements; "+ obj.removeDuplicates(a));
    }
    
}
