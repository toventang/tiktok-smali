package com.ss.android.ugc.effectmanager.common.exception;

import com.bytedance.covode.number.Covode;

public class UrlNotExistException extends Exception {
    static {
        Covode.recordClassIndex(95295);
    }

    public UrlNotExistException(String str) {
        super(str);
    }
}
