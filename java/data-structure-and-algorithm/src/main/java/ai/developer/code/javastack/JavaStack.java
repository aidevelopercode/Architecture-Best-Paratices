package ai.developer.code.javastack;

public class JavaStack {
    public static void main(String[] args) {
        String str1 = "[()]";
        String str2 = "(()[])";
        String str3 = "((])";


//        boolean balanced1 = JavaStackChecker.isBalanced(str1);
//        System.out.println(str1 + " : " + balanced1);


        boolean balanced2 = JavaStackChecker.isBalanced(str2);
        System.out.println(str2 + " : " + balanced2);
//
//        boolean balanced3 = JavaStackChecker.isBalanced(str3);
//        System.out.println(str3 + " : " + balanced3);
    }
}
