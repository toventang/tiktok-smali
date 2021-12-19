package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class NotYetAvailableException extends Exception {
    static {
        Covode.recordClassIndex(33086);
    }

    public NotYetAvailableException() {
    }

    public NotYetAvailableException(String str) {
        super(str);
    }
}
