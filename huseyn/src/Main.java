import MentorLambdaTask.Animal;
import collectionJava.AddMethod;
import collectionJava.MyStack;
import mentorAnnotation.Annotation;
import mentorAnnotation.MyFieldAnnotation;
import mentorString.MentorStringTask;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchFieldException {
//        ArrayList<String> strings = new ArrayList<>(3);
//        strings.add("H");
//        strings.add("E");
//        strings.add("L");
//        strings.add("L");
//        for (String s : strings) {
//            System.out.print(s);
//        }

//
//       AddMethod<Integer> addMethod=new AddMethod<>(3);
//       addMethod.addElements(1);
//       addMethod.addElements(2);
//       addMethod.addElements(3);
//       addMethod.addElements(4);
//       addMethod.addElements(5);
//       addMethod.addElements(6);
//       addMethod.addElements(7);
//       addMethod.addElements(8);
//       addMethod.addElements(9);
//       addMethod.addElements(10);
//       addMethod.addElements(11);
//       addMethod.addElements(12);
//       addMethod.addElements(13);
//       addMethod.addElements(14);
//       addMethod.addElements(15);
//       addMethod.addElements(16);

//       addMethod.printArr();


        //remove method in ArrayList
//       RemoveMethod<String>removeMethod=new RemoveMethod(3);
//       removeMethod.setNumbers("H");
//       removeMethod.setNumbers("E");
//       removeMethod.setNumbers("L");
//       removeMethod.setNumbers("L");
//       removeMethod.setNumbers("O");
//
//       removeMethod.defineRemoveMethod("H");
//       removeMethod.defineRemoveMethod("E");
//       removeMethod.defineRemoveMethod("L");

//        Annotation annotation=new Annotation();
//        annotation.setSize(10);
//        annotation.setValue("ali");
//        System.out.println(annotation);
//        Main.changeValue("size",7,annotation);
//        Main.changeValue("value","Huseyn",annotation);
//        System.out.println(annotation);


//        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();
//        myLinkedList.addList(1);
//        myLinkedList.addList(19);
//        myLinkedList.addList(2);
//        myLinkedList.addList(3);
//        myLinkedList.addList(4);


//stack task
//        MyStack myStack=new MyStack();
//        myStack.fillArray(1);
//        myStack.fillArray(2);
//        myStack.fillArray(3);
//        myStack.fillArray(4);
//        myStack.fillArray(5);
//        myStack.fillArray(6);
//        myStack.fillArray(7);
//        myStack.fillArray(8);
//        myStack.fillArray(9);
//        myStack.fillArray(10);
//        myStack.fillArray(11);
//        myStack.popArray();
//        myStack.popArray();
//        myStack.popArray();
//        myStack.popArray();


//        MyPriorityQueue myPriorityQueue=new MyPriorityQueue();
//        myPriorityQueue.fillArray(5);
//        myPriorityQueue.fillArray(4);
//        myPriorityQueue.fillArray(3);
//        myPriorityQueue.fillArray(2);
//        myPriorityQueue.fillArray(1);
//        System.out.println(myPriorityQueue.polArray());


//        HashSetTask hashSetTask = new HashSetTask();
//        hashSetTask.fillInHashSet(1);
//        hashSetTask.fillInHashSet(2);
//        hashSetTask.fillInHashSet(3);
//        hashSetTask.fillInHashSet(4);
//        hashSetTask.fillInHashSet(11);
//        hashSetTask.fillInHashSet(555);
//        hashSetTask.fillInHashSet(18);
//        hashSetTask.fillInHashSet(34);
//        hashSetTask.fillInHashSet(17);
//        hashSetTask.fillInHashSet(33);


//        Student student = new Student(19, 200.0, "Huseyn", 4);
//        Student student1 = new Student(20, 120.0, "Ali", 4);
//        Student student2 = new Student(27, 340.0, "Elnur", 5);
//        Student student3 = new Student(15, 80.0, "Nihad", 4);
//        Student student4 = new Student(28, 220.0, "Rasim", 3);
//        Student student5 = new Student(13, 123.0, "Elmar", 1);
//        Student student6 = new Student(30, 201.0, "Nahid", 4);
//
//
//        List<Student> list = new ArrayList<>();
//        list.add(student);
//        list.add(student1);
//        list.add(student2);
//        list.add(student3);
//        list.add(student4);
//        list.add(student5);
//        list.add(student6);
//
//        list.forEach(System.out::println);
//        System.out.println("---------------------------------------------");
//        Student student7 = list.stream().
//                filter(num -> num.getCourse() == 4).
//                sorted(Comparator.comparing(Student::getAge)).
//                max(Comparator.comparing(Student::getScore)).
//                get();
//        System.out.println(student7);


//        System.out.println(MentorStringTask.myStack());

//        System.out.println( MentorStringTask.sezarSifreleme("abc",50));


//        Animal<Object> animal = new Animal<>();
//        animal.setAge(5);
//        animal.setName("Tom");
//        updateField(animal, "name", "dog");
//        System.out.println(animal.getName()+"-"+animal.getAge());

//        Animal animal=new Animal();
//        myListMethod(animal.getClass());
//        List<Integer> arrayList=List.of(1,2,3);
        // reverseInteger();

        String value = "hello world";
        String[] deyer = value.split(" ");
        System.out.println(deyer.length);
        for (int i = 0; i < deyer.length; i++) {
            System.out.println("ladlm");
        }
    }

    public static void myListMethod(Class<?> clazz) {
        ArrayList<Method> arrayList = new ArrayList<>();
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            arrayList.add(method);
        }
    }

    public static <T> void updateField(T object, String fieldName, Object newValue) throws NoSuchFieldException, IllegalAccessException {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(object, newValue);
    }

    public static void changeValue(String fieldName, Object value, Annotation annotation) throws NoSuchFieldException, IllegalAccessException {
        Field field = annotation.getClass().getDeclaredField(fieldName);
        MyFieldAnnotation myFieldAnnotation = field.getAnnotation(MyFieldAnnotation.class);
        if (myFieldAnnotation != null) {
            field.setAccessible(true);
            field.set(annotation, value);
            field.setAccessible(false);
        }


//        public void fillArray(Integer value) {
//            array = new Object[defaultCapacity];
//            if (index <= defaultCapacity)
//                array[index++] = value;
//            else {
//                Object[] arr = new Object[index + index / 2];
//                for (int i = 0; i < array.length; i++) {
//                    arr[i] = array[i];
//                }
//                array = arr;
//            }
//            this.value = value;
//        }

    }

    public static void reverseInteger() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  number :");
        int number = scanner.nextInt(); // 123
        String sameNumber = Integer.toString(number);
        int num = number;
        int tempt = 1;
        for (int i = 0; i < sameNumber.length() - 1; i++) {
            tempt *= 10;
        }
        List<Integer> list = new ArrayList<>();
        while (number != 0) {
            number %= 10;
            list.add(number);
            num /= 10;
        }
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            count += list.get(i) * tempt;
            tempt /= 10;
        }
        System.out.println(count);

    }
}