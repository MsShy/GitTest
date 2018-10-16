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

    //Multiply
    public int mulp(){

        int result = 1;
        for (int i=0; i<size; i++){
            result*=arr[i];
        }
        return result;
    }

    //amount of odds
    public int odds(){
        int result = 0;

        for(int i=0;i<size;i++){
            if(arr[i]%2 != 0){
                result++;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "GitTest{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public int sum() {
        int sum = 0;
        for (int i = 0; i < size; i++){
            sum += arr[i];
        }
        return sum;
    }

    public int evenNumber() {
        int evenCounter = 0;
        for (int i = 0; i < size; i++){
            if ((arr[i] % 2) == 0){
                evenCounter++;
            }
        }
        return evenCounter;
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
