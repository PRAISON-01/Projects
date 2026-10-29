package Reflection.PeopleProblem;

import java.util.ArrayList;
public class Person {
    private ArrayList<Problem> problemList = new ArrayList<>();


    public Person() {
        this.problemList = new ArrayList<>();
    }

    public void createProblem(String name, String description,  ProblemTypes types) {
        Problem problem = new Problem(name, description);
        problemList.add(problem);
    }

    public void getSolution(Problem problem) {
        if(this.problemList.contains(problem)) {
            problem.solve();
        }
    }

    public int problemCount() {

        int count= 0;
        for(Problem problem : problemList) {
            count += 1;
        }
        return count;
    }

}
