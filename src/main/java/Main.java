

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.printme();

        for (int i = 0; i <= 5; i++) {
            System.out.println("Добавим " + i);
            stack.push(i);
            stack.printme();
        }


        for (int j = 5; j >= 0; j--) {
            System.out.println("Снимем со стека \n" + j);
            stack.pop();
            stack.printme();
        }



    }


}
