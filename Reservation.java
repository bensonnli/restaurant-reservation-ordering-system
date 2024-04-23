public class Reservation {

    String name;
    String phone;
    String time;
    int partySize;

    Reservation(String name, String phone, String time, int partySize){
        this.name = name;
        this.phone = phone;
        this.time = time;
        this.partySize = partySize;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getPhone(){
        return phone;
    }

    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getTime(){
        return time;
    }

    public void setTime(String time){
        this.time = time;
    }

    public int getPartySize(){
        return partySize;
    }

    public void setPartySize(int partySize){
        this.partySize = partySize;
    }
}
