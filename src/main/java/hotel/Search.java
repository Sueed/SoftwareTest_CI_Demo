package hotel;

public class Search {
    MainRun mr = new MainRun();

    public String status(int homeNo){
        String homeState = mr.getRoom()[homeNo/100-1][homeNo%100-1];
        if(homeState.equals("EMPTY")){
            homeState = "该房间为空";
        }else{
            homeState = "该房间已有人入住：" + homeState;
        }
        return homeState;
    }
}
