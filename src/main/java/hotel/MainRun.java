package hotel;

import java.util.Scanner;
public class MainRun {
    private static String[][] rooms;// 表示房间
    //private static ListHome lh=new ListHome();
    private static InHotel ih=new InHotel();
    private static OutHotel oh=new OutHotel();
    public static void main(String[] args) {
        iniRooms();
        Command();
    }
    public static void iniRooms() {
        rooms = new String[10][12];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[0].length; j++) {
                rooms[i][j] = "EMPTY";
            }
        }
    }
    private static  void Command() {
        String comm;// 表示用户输入的命令
        while (true) {
            System.out.println("请输入命令：");
            Scanner sca = new Scanner(System.in);
            System.gc();
            comm = sca.next();
            if ("search".equalsIgnoreCase(comm)) {
                //lh.search();
            } else if ("in".equalsIgnoreCase(comm)) {
                int roomNo = sca.nextInt();
                try{
                    if( validRoomNo(roomNo)){
                        String name = sca.next();
                        System.out.println(ih.in(roomNo, name));
                    }else
                        System.out.println("房间号错!");
                }catch(Exception e)
                {
                    System.out.println("房间号错!");
                }
            } else if ("out".equalsIgnoreCase(comm)) {
                int roomNo = sca.nextInt();
                if( validRoomNo(roomNo)){
                    System.out.println(oh.out(roomNo));
                }else
                    System.out.println("房间号错!");

            } else if ("exit".equalsIgnoreCase(comm)) {
                System.out.println("程序退出...");
                break;
            } else {
                System.out.println("命令输入错误，请重新输入：");
            }
        }

    }
    private static  boolean validRoomNo(int roomNo){
        if((roomNo/100>10)||(roomNo/100<1)||(roomNo%100>12)||(roomNo%100<1))
            return false;
        else
            return true;
    }
    public String[][] getRoom(){
        return rooms;
    }
}

