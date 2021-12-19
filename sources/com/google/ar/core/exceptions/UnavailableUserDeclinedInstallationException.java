package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class UnavailableUserDeclinedInstallationException extends UnavailableException {
    static {
        Covode.recordClassIndex(33099);
    }

    public UnavailableUserDeclinedInstallationException() {
    }

    public UnavailableUserDeclinedInstallationException(String str) {
        super(str);
    }
}
