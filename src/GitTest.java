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

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "GitTest{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public int minElement() {
        int result = arr[0];
        for (int i = 1; i < size; i++) {
            if(arr[i] < result) {
                result = arr[i];
            }
        }
        return result;
    }

    public int[] increaseByTwo () {
        for (int i = 0; i < size; i++) {
            arr[i] *= 2;
        }
        return arr;
    }

}
