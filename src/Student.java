public class Student {

    public int ticksPasses;

    public static void main(String[] args) {

        CompSciStudent compSciStudent = new CompSciStudent();
        compSciStudent.completedTick(10);
        System.out.println(compSciStudent.pass());
        compSciStudent.completedTick(10);
        System.out.println(compSciStudent.pass());

        System.out.println("");

        NatSciStudent natSciStudent = new NatSciStudent();
        natSciStudent.completedTick(10);
        System.out.println(natSciStudent.pass());
    }

    Student(){
        ticksPasses = 0;
    }

    public Boolean pass(){
        if(ticksPasses == 20){
            return true;
        } else {
            return false;
        }
    }

    public void completedTick(int number){
        for(int i=0; i<number; i++) {
            ticksPasses++;
        }
    }
}
