package hotel.test;

import hotel.InHotel_01;
import hotel.MainRun;
import hotel.Search;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchTest {
    MainRun mr = new MainRun();
    Search search = new Search();
    InHotel_01 ih = new InHotel_01();
    @SuppressWarnings("static-access")
    @Test
//    public void search_ini_801_is_Empty(){
//        mr.iniRooms();
//        assertEquals("该房间为空",search.status(801));
//    }
    public void search_ini_802_is_Linda(){
        mr.iniRooms();
        ih.in(802,"Linda");
        assertEquals("该房间已有人入住：Linda",search.status(802));
    }
}