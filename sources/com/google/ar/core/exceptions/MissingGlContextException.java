package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class MissingGlContextException extends IllegalStateException {
    static {
        Covode.recordClassIndex(33084);
    }

    public MissingGlContextException() {
    }

    public MissingGlContextException(String str) {
        super(str);
    }
}
