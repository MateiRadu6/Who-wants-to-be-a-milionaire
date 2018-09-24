package ro.jademy.milionaire;

import java.util.*;

public class Game {

    //questions, level/score, helping hands
    //start() , answer(), 50/50(), give up()
    //initializam intrebarle si jocul
    private int currentLevel = 1;
    private List<Question> questions = new ArrayList<>();
    private int maxLevel = questions.size();
    Random random = new Random();

    public Game(List<Question> questions) {
        this.questions.addAll(questions);
    }

    public void startGame(List<Question> questions) {
        //initialize game
    }

    public void askQuestion() {
        //show question on screen

        for (Question question : questions) {
            if(question.getDifficultyLevel() == currentLevel){
                System.out.println(question.getQuestion());
            }
        }

    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void answerQuestion() {
        //get user input and check if its correct
    }

    public void showHelpingHands() {

    }

    public void fiftyFifty() {
        //show the same question but only with 2 possible answers
    }

    public boolean isFinished(){
        if(){

        }
    }


}
