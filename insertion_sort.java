public static void insertion_sort(int nums[]) {
        // code srtucture 
        // for loop
        // current position
        // previous position
        // while loop
        // condition check 
        // swap
        // reassign prev to current position

        int n = nums.length;
        for (int i = 1 ; i< n ; i++){
            int start = nums[i]; 
            int prev = i-1;       
            while(prev >=0 && nums[prev] > start){
                nums[prev +1] = nums[prev];
                prev--;
            }
            nums[prev+1] = start;
        }
    }
    public static void print_arr(int nums[]) {

        for(int i = 0 ; i< nums.length; i++){
            System.out.print(nums[i]+ " ");
        }
    }
    public static void main(String[] args) {
        int nums[] = {10,9,8,7,6,5,4,3,2,1,0};
        insertion_sort(nums);
        print_arr(nums);

    }
