package com.ss.android.ugc.aweme.shortvideo.model;

import com.bytedance.covode.number.Covode;

public enum BehaviorType {
    START("ST"),
    SUCCESS("SU"),
    FAILED("FA"),
    CANCEL("CC"),
    EVENT("EV");
    
    private final String simpleName;

    public final String getSimpleName() {
        return this.simpleName;
    }

    static {
        Covode.recordClassIndex(84414);
    }

    private BehaviorType(String str) {
        this.simpleName = str;
    }
}
