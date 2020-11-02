package hotel.test;

import hotel.OutHotel;
import hotel.IData;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OutHotelTest {

    private final Mockery context = new Mockery();
    private final IData idata = context.mock(IData.class);
    private final OutHotel oh = new OutHotel(idata);

    @Before
    public void setUp() throws Exception{
        context.checking(new Expectations(){
            {
                allowing(idata).in_Out_Room(701, "EMPTY");
                will(returnValue("701退房成功！"));
            }
        });
    }

    @Test
    void out() {
        assertEquals("701退房成功！", oh.out(701));
    }
}