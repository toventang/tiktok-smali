package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class UnsupportedConfigurationException extends RuntimeException {
    static {
        Covode.recordClassIndex(33100);
    }

    public UnsupportedConfigurationException() {
    }

    public UnsupportedConfigurationException(String str) {
        super(str);
    }
}
