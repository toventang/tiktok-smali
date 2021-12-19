package com.ss.android.ugc.effectmanager.common.exception;

import com.bytedance.covode.number.Covode;

public class MD5Exception extends Exception {
    static {
        Covode.recordClassIndex(95291);
    }

    public MD5Exception(String str) {
        super(str);
    }
}
