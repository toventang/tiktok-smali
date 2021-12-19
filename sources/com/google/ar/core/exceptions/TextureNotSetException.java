package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class TextureNotSetException extends IllegalStateException {
    static {
        Covode.recordClassIndex(33093);
    }

    public TextureNotSetException() {
    }

    public TextureNotSetException(String str) {
        super(str);
    }
}
