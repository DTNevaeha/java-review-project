import static org.assertj.core.api.Assertions.assertThat;

import com.hr.personnel.Employee;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;


public class EmployeeTest {

  private Employee employee;

  @Before
  public void setUp() throws Exception {
    employee = new Employee("Blake",
        LocalDate.of(2020, 01, 03));
  }

  @Test
  public void getEmployeeInfo_should_return_name_and_hireDate() {
    String employeeInfo = employee.getEmployeeInfo();

    // assert
    Assert.assertEquals("name = Blake, hireDate = 2020-01-03", employeeInfo);
    assertThat(employeeInfo).isEqualTo("name = Blake, hireDate = 2020-01-03");
  }

  @Test
  public void work_should_return_name_worked_string() {

  String work = employee.work();

    assertThat(work).isEqualTo("Blake worked");
  }
}
