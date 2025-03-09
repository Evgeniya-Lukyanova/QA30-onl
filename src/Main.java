public class Main{

    public static void main(String[] args){
        getBasicIO();
    }
    public static void getBasicIO(){
        System.out.println("Welcome to Java");
        System.out.print("This is the lesson of Java grammar.");

        String name = "Evgeniya";
        int age = 23;

        System.out.println("My name is " + name + " and I am " + age + " years old.");
        System.out.printf("My name is %s and I am %d years old.\n", name, age);
    }

}