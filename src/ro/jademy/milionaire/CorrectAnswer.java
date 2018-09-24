package ro.jademy.milionaire;

public class CorrectAnswer extends Answer {

    public CorrectAnswer (String answer){
        super(answer);
    }

    @Override
    public boolean isCorrect(){
        return true;
    }

}
