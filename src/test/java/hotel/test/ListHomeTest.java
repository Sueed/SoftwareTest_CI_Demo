package hotel.test;

import hotel.IData;
import hotel.ListHome;
import org.jmock.Expectations;
import org.jmock.Mockery;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListHomeTest {
//    上下文对象
    private final Mockery context = new Mockery();
//    通过上下文对象模拟(mock)接口调用方法
    private final IData iData = context.mock(IData.class);
    private final ListHome listhome = new ListHome();

    @Before
    public void setUp(){
        context.checking(new Expectations(){{
            allowing(iData).getStation(701);
//            oneOf(iData).getStation(701);
            will( returnValue("EMPTY"));
        }});
    }

    @Test
    void getStation() {
        assertEquals("EMPTY", listhome.getStation(701));
    }
}