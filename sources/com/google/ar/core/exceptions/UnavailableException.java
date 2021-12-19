package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class UnavailableException extends Exception {
    static {
        Covode.recordClassIndex(33097);
    }

    public UnavailableException() {
    }

    public UnavailableException(String str) {
        super(str);
    }
}
