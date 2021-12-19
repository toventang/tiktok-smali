package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class SessionPausedException extends IllegalStateException {
    static {
        Covode.recordClassIndex(33091);
    }

    public SessionPausedException() {
    }

    public SessionPausedException(String str) {
        super(str);
    }
}
