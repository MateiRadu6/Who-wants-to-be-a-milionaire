package ro.jademy.milionaire;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static ArrayList<Question> questionList = new ArrayList<>();

    public static void main(String[] args) {

        initQuestions();


        System.out.println("Do you want to play?");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();

        do {
            ArrayList<Question> gameQuestions = getGameQuestionList();
            Game game = new Game(gameQuestions);
            game.startGame();
            game.currentLevel += 1;
        } while (a.equalsIgnoreCase("Yes")/*&&game.currentLevel!=*/);

        game.end();
    }

    private static void initQuestions(){

        Answer q1a1 = new Answer("Da");
        Answer q1a2 = new Answer("Nu");
        Answer q1a3 = new Answer("Probabil");
        Answer q1a4 = new Answer("Nu are sens", true);
        Question question1 = new Question("1?", 1, Arrays.asList(q1a1, q1a2, q1a3, q1a4));
        questionList.add(question1);

        Answer q2a1 = new Answer("Da");
        Answer q2a2 = new Answer("Nu");
        Answer q2a3 = new Answer("Probabil");
        Answer q2a4 = new Answer("Nu are sens", true);
        Question question2 = new Question("2?", 2, Arrays.asList(q2a1, q2a2, q2a3, q2a4));
        questionList.add(question2);

        Answer q3a1 = new Answer("Da");
        Answer q3a2 = new Answer("Nu");
        Answer q3a3 = new Answer("Probabil");
        Answer q3a4 = new Answer("Nu are sens", true);
        Question question3 = new Question("3?", 3, Arrays.asList(q3a1, q3a2, q3a3, q3a4));
        questionList.add(question3);


        // Question question4 = new Question("4?",4, Arrays.asList(q4a1, q2a2, q2a3, q2a4));
    }

    private static ArrayList<Question> getGameQuestionList() {
        // TODO: implement randomization algorithm
        // 0 question level 1
        // 1 question level 2

        return questionList;
    }
}
