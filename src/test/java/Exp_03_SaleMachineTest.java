import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exp_03_SaleMachineTest {

    @Test
    void sale() {
        Exp_03_SaleMachine sm = new Exp_03_SaleMachine();
        assertEquals("请取走啤酒",sm.sale("啤酒",5));
        assertEquals("请取走橙汁",sm.sale("橙汁",5));
        assertEquals("拿好5元，请取走橙汁", sm.sale("橙汁",10));
        for(int i = 0 ; i < 4; i++) {
            assertEquals("拿好5元，请取走啤酒", sm.sale("啤酒", 10));
        }
        assertEquals("很抱歉，没有啤酒",sm.sale("啤酒",10));
        for(int i = 0 ; i < 2; i++) {
            assertEquals("拿好5元，请取走橙汁", sm.sale("橙汁", 10));
        }
        assertEquals("没有零钱找，退您10元",sm.sale("橙汁",10));
        assertEquals("错误指令！",sm.sale("橙汁",4));
        assertEquals("错误指令！",sm.sale("橙",5));
    }
}