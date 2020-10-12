package vn.com.viettel.demo.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import vn.com.viettel.demo.service.bank.BankIsVayTest;
import vn.com.viettel.demo.service.bank.BankTestFindById;
import vn.com.viettel.demo.service.bank.DoVayTest;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {BankTestFindById.class, DoVayTest.class, BankIsVayTest.class})
public class BankSuite {
}
