package ProblemSolving;

public class QuestionTwo {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int num = 30;
        int divider = 3;
        for (int i = 0; i <= num; i++) {
          if (i % divider == 0){
              sum +=i;
              System.out.println(i);
          }
        }
        System.out.println(sum);
    }
}
