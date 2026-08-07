class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(k==0) return;
        int[] arr=new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[(i+k)%n]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
    }
}