package de.codingdojo.bpm;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class EmployeeDBServiceTest {

    private EmployeeDBService service = new EmployeeDBService();
    @Test
    public void testGetEmployeeHomeSite() throws Exception {
        assertThat(service.getEmployeeHomeSite("gtudan"), is("Karlsruhe"));
    }
}