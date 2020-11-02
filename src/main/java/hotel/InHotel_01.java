package hotel;

public class InHotel_01 {
    MainRun mr = new MainRun();


    public String in(int roomNo, String name){
        if("EMPTY".equals(mr.getRoom()[(roomNo/100)-1][(roomNo%100)-1])){
            mr.getRoom()[(roomNo / 100) - 1][(roomNo % 100) - 1] = name;
            return name+"成功入住"+roomNo;
        }else {
            return "该房间已有人入住";
        }
    }
}
