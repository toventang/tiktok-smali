package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class DataInvalidFormatException extends IllegalArgumentException {
    static {
        Covode.recordClassIndex(33076);
    }

    public DataInvalidFormatException() {
    }

    public DataInvalidFormatException(String str) {
        super(str);
    }
}
