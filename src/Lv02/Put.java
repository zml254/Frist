package Lv02;

public class Put {
    public void put(String s) throws CanNotChangeException{
        if(s.equals("1")){
            throw new CanNotChangeException();
        }
    }
}
