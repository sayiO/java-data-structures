import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        //array creation
       /* int []numbers = new int[5];
        numbers[0] = 34;
        numbers[1] = 12;
        numbers[2] = 35;
        numbers[3] = 40;
        System.out.println(Arrays.toString(numbers));
        String[] colors = {"purple", "beige", "cyan", "yellow", "grey"};
        //printing array contents
        System.out.println(Arrays.toString(colors));

        //looping through arrays

        for(int i =0; i<colors.length; i++){
            System.out.println(colors[i]);

        }
        //enhanced for loop
        for(int num: numbers){
            System.out.print(num + " ");
        }
        */
        //2d arrays
        char[][] board = new char[3][3];
        for(int i = 0; i<3; i++){
            for(int j= 0; j<3;j++){
                board[i][j] = '*';
            }
        }
        System.out.println(Arrays.deepToString(board));

    }
}
