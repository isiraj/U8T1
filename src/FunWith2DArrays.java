public class FunWith2DArrays {
    public static int totalElements(int[][] intArr){
        int total = 0;
        for(int i = 0; i < intArr.length; i++){
            total += intArr[i].length;
        }
        return total;
    }

    public static void fourCorners(String[][] strArr){
        System.out.println(strArr[0][0]);
        System.out.println(strArr[0][strArr[0].length - 1]);

        System.out.println(strArr[strArr.length - 1][0]);
        System.out.println(strArr[strArr.length - 1][strArr[strArr.length - 1].length - 1]);
    }
}
