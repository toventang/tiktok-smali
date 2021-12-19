package com.kakao.common;

import com.bytedance.covode.number.Covode;

public enum KakaoPhase {
    DEV("dev"),
    SANDBOX("sandbox"),
    CBT("cbt"),
    PRODUCTION("production");
    
    private final String phaseName;

    public final String phaseName() {
        return this.phaseName;
    }

    static {
        Covode.recordClassIndex(34348);
    }

    public static KakaoPhase ofName(String str) {
        switch (str.hashCode()) {
            case 98293:
                if (str.equals("cbt")) {
                    return CBT;
                }
                break;
            case 99349:
                if (str.equals("dev")) {
                    return DEV;
                }
                break;
            case 1753018553:
                if (str.equals("production")) {
                }
                break;
            case 1865400007:
                if (str.equals("sandbox")) {
                    return SANDBOX;
                }
                break;
        }
        return PRODUCTION;
    }

    private KakaoPhase(String str) {
        this.phaseName = str;
    }
}
