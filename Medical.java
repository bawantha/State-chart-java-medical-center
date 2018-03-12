
public class Medical {

      
      
     
        State state;
        public void setstate(State s){
            this.state=s;
        }




}

abstract class State{
}

class Patient_counselling extends State{
    public void doneCounselling(Medical m){
        m.setstate(new MediclReciptIssued());
    }
}

class MediclReciptIssued extends State{
    public MediclReciptIssued(Medical m,Patient p){
        if(p.getWillingToBuyMedcineFromCenter){
            m.setstate(new PhramistIssueMedicine());
        }

        else{
            m.setstate(new PrintMedicneList());
        }
    }
}


class PhramistIssueMedicine extends State{
    private boolean isInventryEmpty;


    public void setIsInvetryEmpty(boolean b){
        this.isInventryEmpty=b;
    }
    

    public boolean getIsInventryEmpty(){
        return this.isInventryEmpty;
    }




    public PhramistIssueMedicine(Medical m){
        if(m.getIsInventryEmpty()){
            m.setstate(new InventryEmpty());
            if(m.getHasMoreMedicneInStorage()){
                m.
            }
        }
    }
}


class InventryEmpty extends State{
    private boolean hasMoreMediceInStorage;
    public void sethasMoreMedicneInSotrage(boolean b){
        this.hasMoreMediceInStorage=b;
    }

    public boolean getHasMoreMedicneInStorage(){
        return this.hasMoreMediceInStorage;
    }
}

class Patient{
    private boolean willingToBuyMedcineFromCenter;
    public void SetwillingToBuyMedcineFromCenter(boolean b){
        this.willingToBuyMedcineFromCenter=b;
    }
    public boolean getWillingToBuyMedcineFromCenter(){
        return this.willingToBuyMedcineFromCenter;
    }

}

class 