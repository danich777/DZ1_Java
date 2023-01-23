import java.util.Scanner;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getNum();
        int num2 = getNum();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат: "+result);
    }

    public static int getNum(){
        System.out.println("Введите число:");
        int num = 0;
        if (scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе");
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation = 0;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе");
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result = 0;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Повторите");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}

