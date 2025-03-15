package darft.lesson1;
// Класс всегда существительное, потому что класс - объект
// Класс всегда пишется по принципу Upper Camel Case (Robot. RobotJoHn)
// Код всегда внутри объекта

public class Main { // <- объект
    public static void main(String[] args) { // <- точка входа (psvm)
        System.out.println("Welcome Java!"); //<-стандартный ввод и вывод (input/output)
        getBasicIO (); // -> вызов метода

    }

    // Как писать МЕТОД? -> Lower Camel Case
    // Первое слово ВСЕГДА глагол
    // последующее может быть и сущ
    // public static void -->  ring(), jump(), getMySum()

    public static void getBasicIO () {
        System.out.print("It's a draft of the first lesson. ");
        System.out.println("My name is Zhenya.");
        System.out.println("My surname is Lukyanova.");

        // println -> напечатай "" и переведи на новую строку
        // ln -> next line
        // \n -> переход на следующую строчку

        System.out.println("Hello. "+" How do you do?");
        // "+" -> объединяет 2 строчки

        String name = "Zhenya";
        int age = 23;
        System.out.println("My name is "+ name +" I am "+ age +" years old.");

        System.out.printf("My name is %s and I am %d years old.\n",name, age);
        // форматированный вывод -> printf
        // s -> string
        // d -> decimal (целочисленное значение)
        // c -> знак или символ (character)
        // f -> число с плавающей запятой (16,9)

        // Внутри объекта - действие [глаголы]
        // Глаголы в программировании - функции, если они не находятся в классе (объекте)
        // Если они как во всех программах Джава явл. частью объекта -> они методы


        public static void getBasicVariables() {
            // Язык строгой типизации, тип данных предопределяет возможные в нем значения
        byte myByte = 125;
        short myShort = 3245;
        int myInt = 14599;
        long myLong = 1929024900L;

        char letter = 'A';

        float myFloat = 13.4F;
        double myDouble = 456.3903;
        boolean myBoolean = true;

        String myName = "Zhenya";
        }
    }


}

