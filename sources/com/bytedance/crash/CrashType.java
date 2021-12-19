package com.bytedance.crash;

import com.bytedance.covode.number.Covode;

public enum CrashType {
    LAUNCH("launch"),
    JAVA("java"),
    NATIVE("native"),
    ASAN("asan"),
    TSAN("tsan"),
    ANR("anr"),
    BLOCK("block"),
    ENSURE("ensure"),
    DART("dart"),
    GAME("game"),
    CUSTOM_JAVA("custom_java"),
    OOM("oom"),
    ALL("all");
    
    private final String mName;

    public final String getName() {
        return this.mName;
    }

    public final String toString() {
        return getName();
    }

    static {
        Covode.recordClassIndex(16118);
    }

    private CrashType(String str) {
        this.mName = str;
    }
}
