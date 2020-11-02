package hotel;

public class OutHotel {

    IData iData;

    public OutHotel(IData iData){

        this.iData = iData;
    }

    public OutHotel(){

    }
    public String out(int roomNo){

        return iData.in_Out_Room(roomNo, HotelConstant.EMPTY);
    }
}
