package cpm.oops.inheritence;

public class TeamOne extends Project{
    String techStack;

    public TeamOne(String projectName, int durationInMounths, String domain, String projectManager, String techStack) {
        super(projectName, durationInMounths, domain, projectManager);
        this.techStack = techStack;
    }

    String[] showTechStack(){
    return  new String[]{"java","string"};
    }
}
