package com.company;

import java.time.LocalDate;
import java.util.EventObject;

public class OnExcessoArgs extends EventObject {
    public String Local;
    public LocalDate Quando;
    public OnExcessoArgs(Object source, String local) {
        super(source);
        Local=local;
        Quando = LocalDate.now();
    }
}
