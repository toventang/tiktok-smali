package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;

public class LooperProtectEnhanceThrowable extends Throwable {
    static {
        Covode.recordClassIndex(93252);
    }

    public LooperProtectEnhanceThrowable(String str, Throwable th) {
        super(str, th);
    }
}
