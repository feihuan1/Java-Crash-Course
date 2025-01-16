public class Strings {
    
    public static void main(String[] args){
        char percentageSign = '%';
        String name = "Feihuan Peng"; // Capitalize!!!!! it is not a type, it's a CLASS
        // java will check if this value exist, if it does, all it does is change a name

        String name2 = new String("Feihuan Peng2"); // define string using constructor
        // construct a new string no matter if this value already exist or not
        System.out.println(name);
        System.out.println(name2);

        // Primitive type(literal string) vs Object type(constructor string)
        String liStr1 = "abc";
        String liStr2 = "abc";
        
        String obStr1 = new String("efg");
        String obStr2 = new String("efg");

        System.out.println(liStr1 == liStr2); // true   -> point to same reference
        System.out.println(obStr1 == obStr2); // false  -> diference reference
        System.out.println(obStr1.equals(obStr2)); // true  -> euqals check the content of object
        
        String str = "  Hello !! \"World  "; //-> escape
        // \n new line  \t tab  \\->\  


        // methods (use string. to check)
        // String in imutable, any methods mutate string will return a new string
        System.out.println(str.contains("H")); // true
        System.out.println(str.endsWith("d")); // true
        System.out.println(str.startsWith("d")); // false
        System.out.println(str.length()); // false
        System.out.println(str.indexOf("H"));// 0
        System.out.println(str.replace("!", "*"));// replace all, return new string
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.trim());
    }

}
