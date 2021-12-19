package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class UnavailableSdkTooOldException extends UnavailableException {
    static {
        Covode.recordClassIndex(33098);
    }

    public UnavailableSdkTooOldException() {
    }

    public UnavailableSdkTooOldException(String str) {
        super(str);
    }
}
