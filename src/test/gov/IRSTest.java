package gov;

import com.hr.corp.Corporation;
import com.hr.personnel.HourlyEmployee;
import com.hr.personnel.SalariedEmployee;
import gov.irs.IRS;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class IRSTest {

  @Test
  public void computeTotalMonthlyTaxToCollect() {
    IRS irs = new IRS();
    irs.register(new SalariedEmployee("sang",
        LocalDate.of(2020, 1, 23), 2000.0));
    irs.register(new HourlyEmployee("joe",
        LocalDate.of(2019, 04, 23),
        10.0, 100));
    irs.register(new Corporation("acme", 10_000));
    double totalMonthlyTaxToCollect = irs.computeTotalMonthlyTaxToCollect();
    Assert.assertEquals(1350.0, totalMonthlyTaxToCollect, 0.01);
  }
}