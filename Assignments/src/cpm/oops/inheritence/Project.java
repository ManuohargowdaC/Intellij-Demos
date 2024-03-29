package cpm.oops.inheritence;

public class Project {
    String projectName;
    int durationInMounths;
    String domain;
    String projectManager;

    public Project(String projectName, int durationInMounths, String domain, String projectManager) {
        this.projectName = projectName;
        this.durationInMounths = durationInMounths;
        this.domain = domain;
        this.projectManager = projectManager;
    }


    void showProjectDeatils(){
        System.out.println(projectName);
        System.out.println(durationInMounths);
        System.out.println(domain);
        System.out.println(projectManager);

    }
}
