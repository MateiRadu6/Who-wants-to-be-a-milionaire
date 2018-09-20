package ro.jademy.milionaire;

import java.util.Objects;

public class Answer {

    private boolean correct = false;
    private String answer;

    public Answer(String answer) {
    this.answer =answer;
    }

    public Answer(String answer, boolean hjhjij) {


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Answer answer1 = (Answer) o;
        return Objects.equals(answer, answer1.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answer);
    }

    public boolean isCorrect() {
        return correct;
    }
}
