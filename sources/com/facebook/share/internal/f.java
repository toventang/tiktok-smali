package com.facebook.share.internal;

import com.bytedance.covode.number.Covode;
import com.facebook.internal.h;

public enum f implements h {
    OG_ACTION_DIALOG;
    
    private int minVersion = 20130618;

    @Override // com.facebook.internal.h
    public final String getAction() {
        return "com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG";
    }

    @Override // com.facebook.internal.h
    public final int getMinVersion() {
        return this.minVersion;
    }

    static {
        Covode.recordClassIndex(30669);
    }

    private f(String str) {
    }
}
