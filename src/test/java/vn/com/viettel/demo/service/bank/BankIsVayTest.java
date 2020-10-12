package vn.com.viettel.demo.service.bank;

import org.junit.Assert;
import org.junit.Test;
import vn.com.viettel.demo.model.entity.CongDan;
import vn.com.viettel.demo.service.BankService;
import vn.com.viettel.demo.service.impl.BankServicecImpl;


public class BankIsVayTest {
    BankService bankService = new BankServicecImpl();

    @Test(expected = NullPointerException.class)
    public void isVayNull() {
        boolean result = bankService.isVay(null);
    }

    @Test()
    public void isVayOK() {
        boolean result = bankService.isVay(null);
        Assert.assertEquals(result, true);
    }
}
