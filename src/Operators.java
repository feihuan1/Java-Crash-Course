public class Operators {
    static int num1 = 6;
    static int num2 = 12;

    public static void main(String[] args) {
        System.out.println("Quit coding if can't undcerstand these: + - * / %"); // dont divide a int with a int, unless you want truncate the result
        System.out.println("and these: += -= *= /= %= ++ --"); // ++ and -- changes value in memory but if print number++/number-- it will show original value before change, print ++number/--number will print the actual value immediately
        System.out.println("also these: && ||"); 
        System.out.println("finally these: == != > < >= <="); 
        System.out.println(num1 > num2); // false
    }
}
