public class Task2 {
    public Task2() {}

    public static int[] CopyArrayFromFour(int[] arr) throws RuntimeException{
        int i;
        for (i = arr.length - 1; i>=0; i--) {
            if (arr[i] == 4) {break;}
        }
        if (i == -1) {
            throw new RuntimeException("4 not found");
        }
        else {
            int[] resArr = new int[arr.length - i];
            System.arraycopy(arr, i+1, resArr, 0, resArr.length);
            return resArr;
        }
    }
}
