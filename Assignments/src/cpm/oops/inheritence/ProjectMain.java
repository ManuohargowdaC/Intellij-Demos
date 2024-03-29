package cpm.oops.inheritence;

public class ProjectMain {
    public static void main(String[] args) {
        TeamOne teamOne = new TeamOne("policy Bazar",12,"Banking","Rahul","Java Ful Stack");
                String[] techStack = teamOne.showTechStack();
                for (String tech:techStack){
                    System.out.println(tech);

                }
                String[] tools = {"Java","MVN","git"};
                TeamTwo teamTwo = new TeamTwo("policy Bazar",12,"Banking","Rahul",tools);
                for (String tool : tools){
                    System.out.println(tool);
                }
                teamTwo.showTools();
    }
}
