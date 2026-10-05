package methods;
public class MethodExample {
    //[access_modifier (optional)] [non-access modifier(optional)] [return_type] [method_name](parameters(optional)){
    //  //block of code
    // }
    //Scanner sc = new Scanner(System.in)
    //sc.nextInt();
    static int a =5;
    static int b =3;
    public static void main(String[] args) {
        MethodExample obj1 = new MethodExample();
        obj1.sum();
        obj1.diff();
        addition(10,15);
        String info = obj1.name("Broadway Infosys");
        System.out.println(info);
        obj1.isTrue();
    }
    public void sum(){
        int sum = a+b;
        System.out.println("The total sum is: "+sum);
    }
    public void diff(){
        int diff = a-b;
        System.out.println("The difference is: "+diff);
    }
    public static void addition(int number1, int number2){
        int sum = number1+number2;
        System.out.println("The total sum is "+sum);
    }
    public String name(String name){
        return name;
    }
    Boolean isTrue(){
        return true;
    }
}

