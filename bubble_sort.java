public class Bubblesort {    
    public static void bubble_sort(int nums[]) {
        int n = nums.length;
        for (int i = 0 ; i < n ; i++){
            for(int j =0 ; j < n-i-1 ; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
    public static void print_arr(int nums[]) {

        for(int i = 0 ; i< nums.length; i++){
            System.out.println(nums[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {10,9,8,7,6,5,4,3,2,1,0};
        bubble_sort(nums);
        print_arr(nums);
        // System.out.println(find_target_elemeint_in_array(nums, 2));
    
    }
}
