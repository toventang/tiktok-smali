package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class AnchorNotSupportedForHostingException extends UnsupportedOperationException {
    static {
        Covode.recordClassIndex(33073);
    }

    public AnchorNotSupportedForHostingException() {
    }

    public AnchorNotSupportedForHostingException(String str) {
        super(str);
    }
}
