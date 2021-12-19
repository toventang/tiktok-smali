package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class CameraNotAvailableException extends Exception {
    static {
        Covode.recordClassIndex(33074);
    }

    public CameraNotAvailableException() {
    }

    public CameraNotAvailableException(String str) {
        super(str);
    }
}
