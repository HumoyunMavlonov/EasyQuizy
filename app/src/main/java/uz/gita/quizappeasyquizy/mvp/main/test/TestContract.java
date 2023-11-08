package uz.gita.quizappeasyquizy.mvp.main.test;

import java.util.List;

import uz.gita.quizappeasyquizy.data.Questions;

public interface TestContract {

    interface Model{
        List<Questions> getQuestions();
        List<Questions> getQuestions10();
        List<Questions> getQuestions15();

    }
    interface Presenter{
        void showQuestionsForView();
        void showQuestionsForView10();
        void showQuestionsForView15();
        void checkUserAnswer(String answer);
        void checkUserAnswer10(String answer);
        void checkUserAnswer15(String answer);

        void skipCurrentTest();
        void skipCurrentTest10();
        void skipCurrentTest15();

    }
    interface View{
        void showView(Questions questions);
        void changeActivity(int correctAnswer,int wrongAnswer);

    }
}
