package com.ss.bytertc.engine;

import com.bytedance.covode.number.Covode;

public final class BuildConfig {
    public static final boolean DEBUG = Boolean.parseBoolean("true");
    public static final int VERSION_CODE = 1;
    public static final String VERSION_NAME = "NativeSDK";

    static {
        Covode.recordClassIndex(100738);
    }
}
