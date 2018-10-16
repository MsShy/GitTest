import java.util.Arrays;

public class GitTest {

    private int[] arr = new int[100];
    private int size;

    public GitTest(){}

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public int searchByValue(int value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        return count;
    }

    @Override
    public String toString() {
        return "GitTest{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public int minElement(int[] array, int size) {
        int result = array[0];
        for (int i = 1; i < size; i++) {
            if(array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

}
