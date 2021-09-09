package com.company;


public class HiredHROrder extends AbstractHRDocument implements Document {

    private DocumentFields documentFields;
    private final Employee employee;
    private String textOrder;
    private StatusHROrder statusHROrder;

    public HiredHROrder(int numberDocument, String nameDocument, String employeeName, String employeeSecondname) {
        this.employee = new Employee(employeeName, employeeSecondname);
        this.documentFields = new DocumentFields(numberDocument,nameDocument);
    }

    public DocumentFields getDocumentFields() {
        return documentFields;
    }

    public void setDocumentFields(DocumentFields documentFields) {
        this.documentFields = documentFields;
    }

    public Employee getEmployee() {
        return employee;
    }

    public String getTextOrder() {
        return textOrder;
    }

    public void setTextOrder(String textOrder) {
        this.textOrder = textOrder;
    }

    public StatusHROrder getStatusHROrder() {
        return statusHROrder;
    }

    public void setStatusHROrder(StatusHROrder statusHROrder) {
        super.setStatusHROrder(statusHROrder);
        this.statusHROrder = super.getStatusHROrder();
    }

    @Override
    public void print(boolean simpleKey) {
        if (!simpleKey) {
            System.out.println("DocumentName " + documentFields.getNameDocuments() +
                    ",\n documentNumber " + documentFields.getNumberDocuments() +
                    ",\n employeeName " + employee.getEmployeeName() +
                    ",\n employeeSecondName " + employee.getEmployeeSecondName() +
                    ",\n textOrder '" + textOrder + '\'' +
                    ",\n statusHROrder " + statusHROrder);
        }else {
            printSimple();
        }
    }

    @Override
    public void printSimple() {
        System.out.println("Simple option: " + "\n DocumentName " + documentFields.getNameDocuments() +
                ",\n documentNumber " +documentFields.getNumberDocuments());
    }
}
