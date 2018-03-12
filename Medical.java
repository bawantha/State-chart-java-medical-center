
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


    public void issue(){
        //this method foe issu th medince
    }

    public PhramistIssueMedicine(Medical m){

        if(m.getIsInventryEmpty()){
            m.setstate(new InventryEmpty());
            if(m.getHasMoreMedicneInStorage()){
                m.refill();
            }else{
                m.setstate(new ReciptPrint());
            }
        }
        else{

            m.issue();
            m.setstate(new BillPrint());
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


    public void refill(){};// this method will refill the inventry
}

class Patient{
    private boolean willingToBuyMedcineFromCenter;


    private boolean donePayment;
    public void SetwillingToBuyMedcineFromCenter(boolean b){
        this.willingToBuyMedcineFromCenter=b;
    }
    public boolean getWillingToBuyMedcineFromCenter(){
        return this.willingToBuyMedcineFromCenter;
    }

    public boolean getDonePayment(){
        return this.donePayment;
    }

    public void setDonePayment(boolean d){
        this.donePayment=d;
    }

}

class ReciptPrint extends State{
    public ReciptPrint(){
        Exit e=new Exit();
    }
}


class BillPrint extends State{
    public BillPrint(Patient p){

    }

}

class Exit{
    Exit(){
        System.out.prinln("Bye");
    }
};