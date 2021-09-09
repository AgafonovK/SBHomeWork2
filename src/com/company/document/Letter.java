package com.company.document;

public class Letter implements Document{

    private DocumentFields documentFields;
    private String from;
    private String who;

    public Letter(Integer numberDocuments, String nameDocuments) {
        this.documentFields = new DocumentFields(numberDocuments,nameDocuments);
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    @Override
    public void print(boolean simpleKey) {
        if (!simpleKey) {
            System.out.println(documentFields.getNameDocuments() +
                    ",\n documentNumber " + documentFields.getNumberDocuments() +
                    ",\n from " + from +
                    ",\n who " + who);
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
