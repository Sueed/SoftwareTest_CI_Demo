package hotel;

public class InHotel {

    DP dp = new DP();
    IData iData = dp;

    public String in(int roomNo, String name){
        return iData.in_Out_Room(roomNo, name);
    }
}
