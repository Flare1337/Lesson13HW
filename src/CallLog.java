package com.company.src;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;

public class CallLog {
    private Instant date;
    private Exception exception;

    public CallLog(Instant date, Exception exception) {
        this.date = date;
        this.exception = exception;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }

    public static Collection<CallLog> findDate(Collection<CallLog> dateCollection, String inputDate) {
        Collection<CallLog> callLogs = new ArrayList<>();
        for (CallLog log : dateCollection) {
            if (log.getDate().toString().equals(inputDate)) {
                callLogs.add(log);
            }
        }
        return callLogs;
    }
}
