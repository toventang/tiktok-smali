package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class SessionNotPausedException extends IllegalStateException {
    static {
        Covode.recordClassIndex(33090);
    }

    public SessionNotPausedException() {
    }

    public SessionNotPausedException(String str) {
        super(str);
    }
}
