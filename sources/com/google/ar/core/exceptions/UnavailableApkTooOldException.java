package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class UnavailableApkTooOldException extends UnavailableException {
    static {
        Covode.recordClassIndex(33094);
    }

    public UnavailableApkTooOldException() {
    }

    public UnavailableApkTooOldException(String str) {
        super(str);
    }
}
