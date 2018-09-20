package ro.jademy.milionaire;

import java.util.ArrayList;
import java.util.List;

public class Question {

    private static final int MAX_LEVEL = 15;

    private String question;
    private int difficultyLevel; //max = 15
    private List<Answer> answerList = new ArrayList<>();

    public Question(String question, int difficultyLevel, List<Answer> answerList) {

        this.question = question;
        this.answerList.addAll(answerList);
        this.difficultyLevel = difficultyLevel;

    }

    public Answer getCorrectAnswer() {
        for (Answer answer : answerList) {
            if (answer.isCorrect()) {
                return answer;
            }
        }
        return null;
    }

    public int getDifficultyLevel() {
        return difficultyLevel;
    }

    public String getQuestion() {
        return question;
    }


}
