package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class DeadlineExceededException extends IllegalStateException {
    static {
        Covode.recordClassIndex(33078);
    }

    public DeadlineExceededException() {
    }

    public DeadlineExceededException(String str) {
        super(str);
    }
}
