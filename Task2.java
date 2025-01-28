/* Assign the result of checking if 10 is equal to 15 to a variable isEqual.:
Assign the result of checking if 20 is not equal to 25 to a variable isNotEqual.:
Assign the result of checking if 30 is greater than 25 to a variable isGreater.:
Assign the result of checking if 12 is less than 18 to a variable isLess.:
Assign the result of checking if 40 is greater than or equal to 40 to a variable isGreaterOrEqual.:
Assign the result of checking if 7 is less than or equal to 10 to a variable isLessOrEqual.:
Assign the result of checking if the string "hello" is equal to "world" to a variable areStringsEqual.:
Assign the result of checking if the string "apple" is not equal to "orange" to a variable areStringsNotEqual. */
class Task2 {

    public static void main(String[] args) {
        boolean Equal = (10 == 15);
        System.out.println("Equal = " + Equal);
        boolean NotEqual = (20 != 25);
        System.out.println("Not Equal = " + NotEqual);
        boolean Greater = (30 > 25);
        System.out.println("Greater = " + Greater);
        boolean Less = (12 < 18);
        System.out.println("Less = " + Less);
        boolean GreaterOrEqual = (40 >= 40);
        System.out.println("GreaterOrEqual = " + GreaterOrEqual);
        boolean LessOrEqual = (7 <= 10);
        System.out.println("LessOrEqual = " + LessOrEqual);
        String fname = "Ali";
        String lname = "Ahmed";
        System.out.println(("Strings Equal = " + (fname == lname)));
        String aname = "apple";
        String bname = "orange";
        System.out.println(("Strings Not Equal = " + (aname != bname)));
    }
}
