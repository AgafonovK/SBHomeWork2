package com.company.document;

public abstract class AbstractHRDocument {

    private StatusHROrder statusHROrder;

    public StatusHROrder getStatusHROrder() {
        return this.statusHROrder;
    }

    public void setStatusHROrder(StatusHROrder statusHROrder) {
        this.statusHROrder = coolLogic(statusHROrder);
    }

    private StatusHROrder coolLogic(StatusHROrder statusHROrder) {
        if (getStatusHROrder() != null) {
            if (getStatusHROrder().equals(StatusHROrder.EXECUTED)) {
                return getStatusHROrder();
            } else {
                return statusHROrder;
            }
        } else {
            return statusHROrder;
        }
    }
}
