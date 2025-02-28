package collectionJava;

public class RemoveMethod<T> {
    private Integer size;
    private Object[] array;
    private Integer DefaultCapacity=10;
    private Integer index;


    public RemoveMethod(int size) {
        this.size = size;
        if ( size<DefaultCapacity){
            array=new Object[DefaultCapacity];
            index=0;
        }
    }

    public Integer getSize() {
        return size;
    }

    public void setNumbers(T number) {
        if (index<DefaultCapacity){
            array[index++]=number;
        }


    }

    public void defineRemoveMethod(T tempt) {
        boolean txt = true;
        int nomber = 0;
        T type;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(tempt)) {
                txt = false;
                nomber = i;
                break;
            }
        }
        if (!txt) {
            for (int i = nomber; i < array.length-1; i++) {
                type= (T) array[i];
                array[i]=array[i+1];
                array[i+1]=type;

            }
            array[array.length-1]=null;
        }
        for (Object s:array){
            System.out.print(s+" ");
        }
        System.out.println();
    }

}
