package oopconcept;

public class ClassObjectExample {
//    public ClassObjectExample(){
//
//    }

    public void sum(){
        int a = 5;
        int b = 6;
        int sum = a+b;
        System.out.println("The result is: "+sum);
    }
    public static void main(String[] args) {
        // classname oje_name = new constructor-> special type of method having the same name as class
        //[access_modifier] [non-access_modifier] [return_type] [method_name] (parameter){}


        ClassObjectExample notice = new ClassObjectExample();
        ClassObjectExample notice2 = new ClassObjectExample();

        notice.sum();
        notice2.sum();
    }
}
