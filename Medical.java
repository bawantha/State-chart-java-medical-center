public /**
 * Medical
 */
public class Medical {

      
        private boolean willingToBuyMedcineFromCenter;
        private boolean isInventryEmpty;
        State state;
        public void setstate(State s){
            this.state=s;
        }

        public void SetwillingToBuyMedcineFromCenter(boolean b){
            this.willingToBuyMedcineFromCenter=b;
        }

        public void setIsInvetryEmpty(boolean b){
            this.isInventryEmpty=b;
        }
        
        public boolean getWillingToBuyMedcineFromCenter(){
            return this.willingToBuyMedcineFromCenter;
        }

        public boolean getIsInventryEmpty(){
            return this.isInventryEmpty;
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
    public process(Medical m){
        if(m.getWillingToBuyMedcineFromCenter){
            m.setstate(new PhramistIssueMedicine());
        }

        else{
            m.setstate(new PrintMedicneList());
        }
    }
}


class PhramistIssueMedicine extends State{
    public PhramistIssueMedicine(Medical m){
        if(m.getIsInventryEmpty()){
            m.setstate(new InventryEmpty);
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
    
}