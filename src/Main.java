import notnullannotation.FlyingService;
import notnullannotation.MyService;
import notnullannotation.NotNullAnnotation;
import notnullannotation.NullException;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) throws IllegalAccessException {
        //33 sualda qaldim
//        ProductProcess.productRequired();
//        Task.stringTask();


        //gecen defeki taskdir bu
//        Mystack mystack = new Mystack();
//        mystack.setNum(2);
//        mystack.setNum(3);
//        mystack.setNum(4);
//        mystack.getNum();
//        mystack.setNum(5);
//        mystack.setNum(6);
//        mystack.getNum();
//        mystack.getNum();
//        mystack.getNum();


        //bu taski genericsnen elemek
//        Mystack <Integer> mystack = new Mystack<>();
//        mystack.setNum(2);
//        mystack.setNum(3);
//        mystack.setNum(4);
//        mystack.getNum();
//        mystack.setNum(5);
//        mystack.setNum(6);
//        mystack.getNum();
//        mystack.getNum();
//        mystack.getNum();

//    W3school.getArray();

//        Customer customer = new Customer("Huseyn", "19", "123456789");
//        Field[] fields = customer.getClass().getDeclaredFields();
//        for (Field field : fields) {
//            Length length = field.getAnnotation(Length.class);
//            field.setAccessible(true);
//            if (length != null) {
//                String name = (String) field.get(customer);
//                if (length.min() > name.length() || length.max() < name.length()) {
//                    throw new ValidateException("invalide fincode");
//                }
//            }
//            field.setAccessible(false);
//        }
//        System.out.println(customer);

//        FlyingService flyingService = new FlyingService("Husey", "AA20051", "19");
//        Field[] fields = flyingService.getClass().getDeclaredFields();
////        for (Field field : fields) {
//            NotNullAnnotation notNullAnnotation = field.getAnnotation(NotNullAnnotation.class);
//            field.setAccessible(true);
//            if (notNullAnnotation != null) {
//                String fieldValue = (String) field.get(flyingService);
//                if (fieldValue.isBlank()) {
//                    throw new NullException("passportfin is null");
//                } else if (fieldValue.length() != notNullAnnotation.check()) {
//                    throw new NullException("Invalide passportfin");
//                }
//            }
//        }
//        System.out.println(flyingService);


        //add methodunu ozun yaz

    }
}
