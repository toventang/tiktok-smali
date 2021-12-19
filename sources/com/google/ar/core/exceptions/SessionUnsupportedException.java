package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class SessionUnsupportedException extends IllegalStateException {
    static {
        Covode.recordClassIndex(33092);
    }

    public SessionUnsupportedException() {
    }

    public SessionUnsupportedException(String str) {
        super(str);
    }
}
