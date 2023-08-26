public class Sorting_Algo{
  
    public static void selection_sort(int nums[]) {
        int n = nums.length;
        for(int i = 0; i< n; i++){
            int minPos = i;
            for( int j = i+1; j< n-1; j++){
                if(nums[minPos] < nums[j]) {
                    minPos = j;
                }
            }
            //swap 
            int temp = minPos;
            minPos = nums[i];
            nums[i] = temp;
        }
    }
    public static void print_arr(int nums[]) {

        for(int i = 0 ; i< nums.length; i++){
            System.out.println(nums[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {10,9,8,7,6,5,4,3,2,1,0};
        selection_sort(nums);
        print_arr(nums);
    }
}
