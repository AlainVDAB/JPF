package be.vdab.jpfhfdst8.oef;

public class StudentMain {
    public static void main(String[] args) {
        var studentA = new Student("Alain");
        var studentB = new Student("Karen",83);

        System.out.println(studentA.getNaam());
        System.out.println(studentA.getScore());
        System.out.println(studentB.getNaam());
        System.out.println(studentB.getScore());

        studentA.setScore(69);
        studentB.setNaam("Tilda");
        studentB.setScore(75);



        System.out.println("\n"+studentA.getNaam());
        System.out.println(studentA.getScore());
        System.out.println(studentB.getNaam());
        System.out.println(studentB.getScore());

    }
}
