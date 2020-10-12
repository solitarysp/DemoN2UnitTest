package vn.com.viettel.demo.service.congdan;

import org.junit.Assert;
import org.junit.Test;
import vn.com.viettel.demo.service.CongDanService;
import vn.com.viettel.demo.service.impl.CongDanServiceImpl;

public class CongDanVayTest {
    CongDanService congDanService = new CongDanServiceImpl();

    @Test()
    public void doVayOK() {
        boolean result = congDanService.Vay();
        Assert.assertEquals(result, true);
    }
}
