package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class ImageInsufficientQualityException extends IllegalArgumentException {
    static {
        Covode.recordClassIndex(33081);
    }

    public ImageInsufficientQualityException() {
    }

    public ImageInsufficientQualityException(String str) {
        super(str);
    }
}
