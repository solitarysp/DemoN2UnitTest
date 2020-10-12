package vn.com.viettel.demo.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import vn.com.viettel.demo.BankTestFindById;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {BankTestFindById.class})
public class BankSuite {
}
