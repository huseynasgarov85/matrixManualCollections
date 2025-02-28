package stackTask;

import java.util.Arrays;

public class Mystack<T extends Number> {
    private static Integer[] array=new Integer[10];
    public Integer index=0;
    public void getNum() {
        if (index>=0){
            System.out.println(array[index-1]);
            index--;
        }
        else {
         System.exit(0);
        }
    }

    public  void  setNum(T t) {
        array[index]=t.intValue();
        index++;
    }

}
