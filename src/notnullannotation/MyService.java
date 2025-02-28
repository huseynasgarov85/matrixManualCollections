package notnullannotation;

public class MyService extends MyAnnotation{

    public static void a(){
        System.out.println("A");
    }
    private static void b(){
        System.out.println("B");
    }

    static void c(){
        System.out.println("C");
    }
    protected static void d(){
        System.out.println("D");
    }
}
