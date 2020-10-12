package vn.com.viettel.demo.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import vn.com.viettel.demo.service.bank.BankTestFindById;
import vn.com.viettel.demo.service.congdan.CongDanVayTest;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {CongDanVayTest.class})
public class CongDanSuite {
}
