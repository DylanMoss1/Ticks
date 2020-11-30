public class NatSciStudent extends Student{

    NatSciStudent(){
        super();
    }

    @Override
    public Boolean pass(){
        if(ticksPasses == 10){
            return true;
        } else {
            return false;
        }
    }
}
