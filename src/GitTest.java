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
}
