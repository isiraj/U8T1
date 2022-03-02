public class Runner {

    public static void main(String arg[]){
        String[][] names = {{"Abby", "Don", "George", "Kim"}, {"Brian", "Elenor", "Harry", "Lenny"}, {"Cathy", "Fred", "Jill", "Matt"}};
        names[1][2] = "Paul";

        String temp = names[0][0];

        names[0][0] = names[2][3];

        names[2][3] = temp;

        String[] tempArr = names[0];

        names[0] = names[1];

        names[1] = tempArr;

        int[][] arr1 = new int[2][3];

        int[][] arr2 = new int[3][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;






    }
}
