package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class CloudAnchorsNotConfiguredException extends IllegalStateException {
    static {
        Covode.recordClassIndex(33075);
    }

    public CloudAnchorsNotConfiguredException() {
    }

    public CloudAnchorsNotConfiguredException(String str) {
        super(str);
    }
}
