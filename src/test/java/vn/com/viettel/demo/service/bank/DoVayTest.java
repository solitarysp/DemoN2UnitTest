package vn.com.viettel.demo.service.bank;

import org.junit.Assert;
import org.junit.Test;
import vn.com.viettel.demo.model.entity.CongDan;
import vn.com.viettel.demo.service.BankService;
import vn.com.viettel.demo.service.impl.BankServicecImpl;

public class DoVayTest {
    BankService bankService = new BankServicecImpl();

    @Test(expected = NullPointerException.class)
    public void doVayNull() {
        boolean result = bankService.doVay(null);
    }
    @Test()
    public void doVayOK() {
        boolean result = bankService.doVay(null);
        Assert.assertEquals(result, true);
    }
}
