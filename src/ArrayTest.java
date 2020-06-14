public class ArrayTest {
    public static void main(String[] args) {

        int[][] arr = new int[2][];  //2个数组
        arr[0] =new int[] {1, 2, 3};
        //int[][] arr1 ={{1,2},{3,4}};
        System.out.println(arr);
        System.out.println(arr[0][1]);
        System.out.println(arr[0]);
    }

}
