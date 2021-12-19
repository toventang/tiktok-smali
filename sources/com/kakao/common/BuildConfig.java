package com.kakao.common;

import com.bytedance.covode.number.Covode;

public final class BuildConfig {
    public static final String APPLICATION_ID = "com.kakao.common";
    public static final int VERSION_CODE = 93;
    public static final String VERSION_NAME = "1.30.1";

    static {
        Covode.recordClassIndex(34343);
    }
}
