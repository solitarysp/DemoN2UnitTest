package vn.com.viettel.demo.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(value = Suite.class)
@Suite.SuiteClasses(value = {BankSuite.class, CongDanSuite.class})
public class AllSuite {
}
