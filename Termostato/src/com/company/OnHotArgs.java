package com.company;

import java.time.LocalDate;
import java.util.EventObject;

public class OnHotArgs extends EventObject {
    public LocalDate quando;
    public OnHotArgs(Object source) {
        super(source);
        quando=LocalDate.now();
    }
}
