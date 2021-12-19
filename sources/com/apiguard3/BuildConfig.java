package com.apiguard3;

import com.bytedance.covode.number.Covode;

public final class BuildConfig {
    public static final Boolean AGRequest = Boolean.FALSE;
    public static final String VERSION_NAME = "4.2.1-2";
    public static final Boolean getBody = Boolean.TRUE;
    public static final Boolean getHeaders = Boolean.TRUE;
    public static final Boolean getMethod = Boolean.FALSE;
    private static int getUrl;
    private static int method;

    static {
        Covode.recordClassIndex(2492);
        method = 1;
        int i2 = getUrl + 89;
        method = i2 % 128;
        int i3 = i2 % 2;
    }
}
