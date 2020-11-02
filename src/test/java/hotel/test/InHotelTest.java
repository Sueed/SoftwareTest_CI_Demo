package hotel.test;

import hotel.InHotel;
import hotel.IData;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InHotelTest {

    private final Mockery context = new Mockery();
    private final IData iData = context.mock(IData.class);
    private final InHotel ih = new InHotel();

    @Before
    public void setUp(){
        context.checking(new Expectations(){{
                oneOf(iData).in_Out_Room(702, "CST");
                will( returnValue("CST成功入住702房间！"));
            }});
    }

    @Test
    void in() {
        assertEquals("CST成功入住702房间！",ih.in(702,"CST"));
    }
}