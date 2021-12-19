package com.bytedance.android.live.liveinteract.multilive.a.c;

import com.bytedance.covode.number.Covode;

public enum a {
    GUEST_USER_INFO,
    GUEST_PREVIEW;
    
    private boolean goNextPage = true;

    static {
        Covode.recordClassIndex(6210);
    }

    public final boolean getGoNextPage() {
        return this.goNextPage;
    }

    public final void setGoNextPage(boolean z) {
        this.goNextPage = z;
    }

    private a() {
    }
}
