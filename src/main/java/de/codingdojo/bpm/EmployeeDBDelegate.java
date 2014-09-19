package de.codingdojo.bpm;

import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.Expression;
import org.activiti.engine.delegate.JavaDelegate;

/**
 * @author Gregor Tudan, Cofinpro AG
 */
public class EmployeeDBDelegate implements JavaDelegate{

    private Expression user;

    @Override
    public void execute(DelegateExecution delegateExecution) throws Exception {
        String employeeNameString = (String) user.getValue(delegateExecution);

        // Einstellungsort bestimmen
        String einstellungsort = new EmployeeDBService().getEmployeeHomeSite(employeeNameString);
        delegateExecution.setVariable("einstellungsort", einstellungsort);
    }
}
