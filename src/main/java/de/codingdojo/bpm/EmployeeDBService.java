package de.codingdojo.bpm;


import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import de.codingdojo.bpm.entities.Employee;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
public class EmployeeDBService {

    private static ObjectMapper objectMapper = new ObjectMapper();

    public String getEmployeeHomeSite(String user) throws IOException {
        for (Employee employee : getEmployeeDB()) {
            if (employee.getUser().equals(user)) {
                return employee.getHomeSite();
            }
        }
        return null;
    }

    private Employee[] getEmployeeDB() throws IOException {
        InputStream stream = getClass().getClassLoader().getResourceAsStream("employeeDB.json");
        JsonParser parser = new JsonFactory().createParser(stream);
        return objectMapper.readValue(parser, Employee[].class);
    }
}
