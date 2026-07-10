package Reflection.PeopleProblem;

public class Problem {
    private String name;
    private String description;
    private boolean isSolved;
    private ProblemTypes type;

    public Problem(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void solve() {
        this.isSolved = true;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public String getDescription() {
        return description;
    }
}
