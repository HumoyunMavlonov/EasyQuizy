package uz.gita.quizappeasyquizy.mvp.main.test;

import java.util.ArrayList;
import java.util.List;

import uz.gita.quizappeasyquizy.data.Questions;
import uz.gita.quizappeasyquizy.repository.Repository;

public class TestModel implements TestContract.Model{

    Repository repository=Repository.getInstance();

    List<Questions> questions=new  ArrayList<>();

    public List<Questions> getQuestions(){
        if (questions.isEmpty()){
            questions.addAll(repository.getQuestions());
        }
        return questions;
    }
    public List<Questions> getQuestions10(){
        if (questions.isEmpty()){
            questions.addAll(repository.getQuestions10());
        }
        return questions;
    }
    public List<Questions> getQuestions15(){
        if (questions.isEmpty()){
            questions.addAll(repository.getQuestions15());
        }
        return questions;
    }
}
