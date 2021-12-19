package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class ResourceExhaustedException extends RuntimeException {
    static {
        Covode.recordClassIndex(33089);
    }

    public ResourceExhaustedException() {
    }

    public ResourceExhaustedException(String str) {
        super(str);
    }
}
