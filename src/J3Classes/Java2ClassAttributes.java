package J3Classes;

public class Java2ClassAttributes {
    int x = 5;
    int y = 3;
    int z;

    public static void main(String[] args) {
        // Attributes are the variables that are declared inside a class but outside any method.
        // Attributes are also known as fields or class variables.
        // Attributes are used to store data.
        // In the example above, x, y, and z are attributes of the Java2ClassAttributes class.
        Java2ClassAttributes myObj = new Java2ClassAttributes();
        myObj.y=8;
        myObj.z = 10;
        System.out.println("x = "+myObj.x);
        System.out.println("y = "+myObj.y); // 8 will be printed instead of 3
        System.out.println("z = "+myObj.z);

        // You can also create an object of a class and assign it to another object.
        Java2ClassAttributes myObj2 = new Java2ClassAttributes();
        myObj2 = myObj;
        System.out.println("x = "+myObj2.x);
        System.out.println("y = "+myObj2.y); // 8 will be printed instead of 3
        System.out.println("z = "+myObj2.z);

        // You can create multiple objects of one class.
        // You can create multiple objects of one class and assign them to different objects.
        Java2ClassAttributes myObj3 = new Java2ClassAttributes();
        myObj3.x = 10;
        Java2ClassAttributes myObj4 = new Java2ClassAttributes();
        myObj4.x = 20;
        System.out.println("x = "+myObj3.x);
        System.out.println("x = "+myObj4.x);



    }
}
