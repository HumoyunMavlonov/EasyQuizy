package uz.gita.quizappeasyquizy.mvp.main.test;

public class TestPresenter  implements TestContract.Presenter{
    TestContract.Model model ;
    TestContract.View view ;
    int currentPosition ;
    int correctAnswer ;
    int wrongAnswer;

    public TestPresenter(TestContract.View view) {
        model = new TestModel() ;
        this.view = view ;
    }

    @Override
    public void showQuestionsForView() {

        if (currentPosition < model.getQuestions().size()) {
            view.showView(model.getQuestions().get(currentPosition));
        }else {
            view.changeActivity(correctAnswer,wrongAnswer);
        }

    }
    public void showQuestionsForView10() {

        if (currentPosition < model.getQuestions10().size()) {
            view.showView(model.getQuestions10().get(currentPosition));
        }else {
            view.changeActivity(correctAnswer,wrongAnswer);
        }

    }
    public void showQuestionsForView15() {

        if (currentPosition < model.getQuestions15().size()) {
            view.showView(model.getQuestions15().get(currentPosition));
        }else {
            view.changeActivity(correctAnswer,wrongAnswer);
        }

    }


    @Override
    public void checkUserAnswer(String answer) {
        if (answer.equals(model.getQuestions().get(currentPosition).getAnswer())) correctAnswer++ ;
         else wrongAnswer++;

        currentPosition++;
        showQuestionsForView();
    }
    public void checkUserAnswer10(String answer) {
        if (answer.equals(model.getQuestions10().get(currentPosition).getAnswer())) correctAnswer++ ;
        else wrongAnswer++;

        currentPosition++;
        showQuestionsForView();
    } public void checkUserAnswer15(String answer) {
        if (answer.equals(model.getQuestions15().get(currentPosition).getAnswer())) correctAnswer++ ;
        else wrongAnswer++;

        currentPosition++;
        showQuestionsForView();
    }

    @Override
    public void skipCurrentTest() {
        currentPosition++;
        showQuestionsForView();
    }
    public void skipCurrentTest10() {
        currentPosition++;
        showQuestionsForView10();
    }
    public void skipCurrentTest15() {
        currentPosition++;
        showQuestionsForView15();
    }
}

