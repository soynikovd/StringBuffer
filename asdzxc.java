package homework18;

public class asdzxc {
    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 56;
        StringBuilder result = new StringBuilder();

        result.append(num1).append(" + ").append(num2).append(" = ").append(num1 + num2).append("\n");
        result.append(num1).append(" - ").append(num2).append(" = ").append(num1 - num2).append("\n");
        result.append(num1).append(" * ").append(num2).append(" = ").append(num1 * num2);

        String input = " = ";

        System.out.println(result.toString().replace(input, " рівно "));

        }
    }
