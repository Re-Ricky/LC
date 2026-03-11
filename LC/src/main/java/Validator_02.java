import java.lang.reflect.Array;
import java.util.Arrays;

public class Validator_02 {

    public static void main(String[] args) {
        System.out.println("hello");

        // 随机数组长度
        int N = 10;
        int V = 20;

        // 测试次数
        int testTimes = 10;
        System.out.println("测试开始");

        for (int i = 0; i < testTimes; i++) {
            // 随机得到一个长度，长度在 [0, N-1]
            int n = (int) (Math.random() * N);
            // 得到随机数组
            int[] arr = randomArray(n, V);
            int[] arr1 = copyArray(arr);
            int[] arr2 = copyArray(arr);
            arr1 = bubbleSort(arr1);
            Arrays.sort(arr2);
            if (!sameArray(arr1, arr2)) {
                System.out.println("出错了，出错数组为: ");
                printArray(arr);
            }

        }
        System.out.println("测试结束！");
    }

    /**
     * 得到一个长度为 n 的数组
     *
     * @param n 数组长度
     * @param v 元素值，取值范围 1 ~ n-1
     * @return 数组
     */
    public static int[] randomArray(int n, int v) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * v) + 1;
        }
        return arr;
    }

    // 拷贝数组
    public static int[] copyArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] = arr[i];
        }
        return ans;
    }

    // 验证
    public static boolean sameArray(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int j : arr) {
            stringBuilder.append(j).append(", ");
        }

        stringBuilder.delete(stringBuilder.length()-2, stringBuilder.length());
        System.out.println(stringBuilder.toString());
    }

    public static int[] bubbleSort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length - 1; j++) {
                if (arr[i] > arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }

        return arr;
    }

}
