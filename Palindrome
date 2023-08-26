public class Palindrome{
public static boolean is_palindrome(int numbers) {
        
        int rev = 0 ;
        int pal = numbers;

        while(numbers != 0){
            int reminder = numbers % 10 ;
            System.out.println(reminder);
            rev = rev * 10 + reminder;
            System.out.println(rev);
            numbers = numbers/10;
            System.out.println(numbers);
        }
        System.out.println(rev);
        if(pal == rev){
            return true;
        }return false;
    }


    public static void main(String[] args) {
        int numbers = 121;
        System.out.println(is_palindrome(numbers));
    }
}
