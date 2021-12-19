package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class FatalException extends RuntimeException {
    static {
        Covode.recordClassIndex(33079);
    }

    public FatalException() {
    }

    public FatalException(String str) {
        super(str);
    }

    public FatalException(String str, Throwable th) {
        super(str, th);
    }
}
