package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class DataUnsupportedVersionException extends IllegalArgumentException {
    static {
        Covode.recordClassIndex(33077);
    }

    public DataUnsupportedVersionException() {
    }

    public DataUnsupportedVersionException(String str) {
        super(str);
    }
}
