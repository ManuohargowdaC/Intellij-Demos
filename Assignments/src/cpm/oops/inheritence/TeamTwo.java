package cpm.oops.inheritence;

public class TeamTwo extends Project{
    String[] tools;


    public TeamTwo(String projectName, int durationInMounths, String domain, String projectManager, String[] tools) {
        super(projectName, durationInMounths, domain, projectManager);
        this.tools = tools;
    }
    void showTools(){
        for (String tool:tools) {
            System.out.println(tool);
            
        }
        System.out.println();
    }
}
