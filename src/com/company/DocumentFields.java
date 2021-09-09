package com.company;

public class DocumentFields {

    private final Integer numberDocuments;
    private String nameDocuments;

    public DocumentFields(Integer numberDocuments, String nameDocuments) {
        this.numberDocuments = numberDocuments;
        this.nameDocuments = nameDocuments;
    }

    public Integer getNumberDocuments() {
        return numberDocuments;
    }

    public String getNameDocuments() {
        return nameDocuments;
    }

    public void setNameDocuments(String nameDocuments) {
        this.nameDocuments = nameDocuments;
    }
}
