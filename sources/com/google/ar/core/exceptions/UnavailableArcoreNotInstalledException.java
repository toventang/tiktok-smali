package com.google.ar.core.exceptions;

import com.bytedance.covode.number.Covode;

public class UnavailableArcoreNotInstalledException extends UnavailableException {
    static {
        Covode.recordClassIndex(33095);
    }

    public UnavailableArcoreNotInstalledException() {
    }

    public UnavailableArcoreNotInstalledException(String str) {
        super(str);
    }
}
