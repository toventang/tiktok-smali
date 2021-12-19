package com.facebook.share.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.h;

public enum a implements h {
    SHARE_CAMERA_EFFECT;
    
    private int minVersion = 20170417;

    @Override // com.facebook.internal.h
    public final String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    @Override // com.facebook.internal.h
    public final int getMinVersion() {
        return this.minVersion;
    }

    static {
        Covode.recordClassIndex(30659);
    }

    private a(String str) {
    }
}
