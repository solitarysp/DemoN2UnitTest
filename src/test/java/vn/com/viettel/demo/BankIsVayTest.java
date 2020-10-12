package vn.com.viettel.demo;

import org.junit.Assert;
import org.junit.Test;
import vn.com.viettel.demo.model.entity.CongDan;
import vn.com.viettel.demo.service.BankService;
import vn.com.viettel.demo.service.impl.BankServicecImpl;


public class BankIsVayTest {
    BankService bankService = new BankServicecImpl();

    @Test(expected = NullPointerException.class)
    public void findCongDanByIdNull() {
        CongDan result = bankService.findCongDanByID(null);
        Assert.assertEquals(result, null);
    }
}
