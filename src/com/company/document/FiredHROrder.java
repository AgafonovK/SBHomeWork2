package com.company.document;

public class FiredHROrder extends AbstractHRDocument implements Document {

    private DocumentFields documentFields;
    private final Employee employee;
    private String textOrder;
    private StatusHROrder statusHROrder;
    private String reasonFired;

    public FiredHROrder(int numberDocuments, String nameDocuments, String employeeName, String employeeSecondname) {
        this.documentFields = new DocumentFields(numberDocuments,nameDocuments);
        this.employee = new Employee(employeeName,employeeSecondname);

    }

    public StatusHROrder getStatusHROrder() {
        return statusHROrder;
    }

    public void setStatusHROrder(StatusHROrder statusHROrder) {
        super.setStatusHROrder(statusHROrder);
        this.statusHROrder = super.getStatusHROrder();
    }

    public DocumentFields getDocumentFields() {
        return documentFields;
    }

    public void setDocumentFields(DocumentFields documentFields) {
        this.documentFields = documentFields;
    }

    public String getTextOrder() {
        return textOrder;
    }

    public void setTextOrder(String textOrder) {
        this.textOrder = textOrder;
    }

    public void setReasonFired(String reasonFired) {
        this.reasonFired = reasonFired;
    }

    public String getReasonFired() {
        return reasonFired;
    }

    @Override
    public void print(boolean simpleKey) {
        if (!simpleKey) {
            System.out.println("DocumentName " + documentFields.getNameDocuments() +
                    ",\n documentNumber " + documentFields.getNumberDocuments() +
                    ",\n employeeName " + employee.getEmployeeName() +
                    ",\n employeeSecondName " + employee.getEmployeeSecondName() +
                    ",\n textOrder '" + textOrder + '\'' +
                    ",\n statusHROrder " + statusHROrder +
                    ",\n reasonFired " + reasonFired);
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
