public class ProjectTest {

    public static void main(String[] args) {

        Project project1 = new Project();
        System.out.println(project1.getName());
        System.out.println(project1.getDescription());
        System.out.println(project1.elevatorPitch());

        Project project2 = new Project("BarbarianBattle");
        System.out.println(project2.getName());
        System.out.println(project2.getDescription());
        System.out.println(project2.elevatorPitch());

        Project project3 = new Project("BarbarianBattle", "Slay your foes and gain glory!");
        System.out.println(project3.getName());
        System.out.println(project3.getDescription());
        System.out.println(project3.elevatorPitch());
        project3.setDescription("Might makes right!");
        System.out.println(project3.getDescription());



    
}
    
}
