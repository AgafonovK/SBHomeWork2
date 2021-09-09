package com.company;

import com.company.document.FiredHROrder;
import com.company.document.HiredHROrder;
import com.company.document.Letter;
import com.company.document.StatusHROrder;

public class Main {

    public static void main(String[] args) {
        boolean simpleKey = false;
        if (args.length>0 && args[0].equals("-simple")){simpleKey = true;}
        HiredHROrder hiredHROrder = new HiredHROrder(23,"Order of hired",
                "Konstantin", "Agafonov");
        hiredHROrder.setTextOrder("Applied this employee");
        hiredHROrder.setStatusHROrder(StatusHROrder.CREATE);
        hiredHROrder.print(simpleKey);

        FiredHROrder firedHROrder = new FiredHROrder(1032,"Order of fired",
                "Konstantin", "Agafonov");
        firedHROrder.setReasonFired("many reasons.");
        firedHROrder.setTextOrder("Fired Agafonov Konstantin because "+ firedHROrder.getReasonFired() );
        firedHROrder.setStatusHROrder(StatusHROrder.CREATE);
        firedHROrder.print(simpleKey);

        Letter letter = new Letter(543, "Letter of information");
        letter.setFrom("HR office");
        letter.setWho("Administration office");
        letter.print(simpleKey);

        hiredHROrder.setStatusHROrder(StatusHROrder.EXECUTED);
        firedHROrder.setStatusHROrder(StatusHROrder.EXECUTED);
        hiredHROrder.print(simpleKey);
        firedHROrder.print(simpleKey);
        simpleKey = true;
        hiredHROrder.print(simpleKey);
        firedHROrder.print(simpleKey);
        letter.print(simpleKey);

    }
}
