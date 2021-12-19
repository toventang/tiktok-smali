package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class NotTrackingException extends RuntimeException {
    static {
        Covode.recordClassIndex(33085);
    }

    public NotTrackingException() {
    }

    public NotTrackingException(String str) {
        super(str);
    }
}
