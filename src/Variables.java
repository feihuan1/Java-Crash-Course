class Variables {
    static String name = "feihuan";// static is required

    
    public static void main(String[] args) {
        int age; 
        age = 27; 

        System.out.println("I am " + name + " and I'm " + age + " years old!");
        Datatypes("hello");
    }

    public static void Datatypes (String args) {
        // interger type
        byte aSingleByte = 127; // -128 to 127 
        short aSmallNumber = 32767; // -32768 to 32767 
        int anInterger = 2147483647; //-2147483648 to 2147483647
        long aLargeNumber = 9223372036854775807l; // -9223372036854775808 to 9223372036854775807 !!! l or L is required!!!

        //decimal types 
        double aLongDecimal = 1.79769313; // very long decimal, double size of float, default decimal type in java 
        float aShortDecimal = 1.1f; // short decimal number, same as C# !!!!!add f or F!!!!!!

        // explicit conversion
        int num1 = 3;
        double num2 = num1;
        System.out.println(num2); // 3.0 can assign int as velue of double cuz int is smaller in memory!(science, it is science) 
        // double num3 = 3.8;
        // int num4 = num3;
        // System.out.println(num4); // error, cant convert double to int becuase it will be a overflow~
        double num3 = 3.8;
        int num4 = (int)num3;
        System.out.println(num4); // 3, this will tell the compiler just make this double a int, no Problem, it will be runtime error if it overflows


        // booleans 
        boolean isWeekend = true;
        boolean isWorkday = false;

        // characters 
        char copyrightSymbol = '\u00A9'; // -> no idea why prints out a ?...
        System.out.println("This should be a copy right symbol " + copyrightSymbol);
    }
}