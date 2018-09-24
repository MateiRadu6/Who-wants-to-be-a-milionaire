package ro.jademy.milionaire;

public class WrongAnswer extends Answer{

    public WrongAnswer (String answer){
        super(answer);
    }

    @Override
    public boolean isCorrect(){
        return false;
    }


}
