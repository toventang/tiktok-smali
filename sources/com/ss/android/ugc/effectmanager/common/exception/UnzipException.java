package com.ss.android.ugc.effectmanager.common.exception;

import com.bytedance.covode.number.Covode;

public class UnzipException extends Exception {
    static {
        Covode.recordClassIndex(95294);
    }

    public UnzipException(Exception exc) {
        super(exc);
    }

    public UnzipException(String str) {
        super(str);
    }
}
