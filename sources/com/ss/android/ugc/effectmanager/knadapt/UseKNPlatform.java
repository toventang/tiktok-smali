package com.ss.android.ugc.effectmanager.knadapt;

import com.bytedance.covode.number.Covode;

public final class UseKNPlatform {
    public static final UseKNPlatform INSTANCE = new UseKNPlatform();
    public static boolean enableKNPlatform = true;

    private UseKNPlatform() {
    }

    static {
        Covode.recordClassIndex(95588);
    }
}
