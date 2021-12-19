package com.ss.android.ugc.aweme.services.external.ui;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.t;
import java.io.Serializable;

public final class MiniAppConfig implements Serializable {
    private Serializable appClass;
    private t appInfo;
    private String stickerId;

    static {
        Covode.recordClassIndex(79705);
    }

    public final Serializable getAppClass() {
        return this.appClass;
    }

    public final t getAppInfo() {
        return this.appInfo;
    }

    public final String getStickerId() {
        return this.stickerId;
    }

    public final void setAppClass(Serializable serializable) {
        this.appClass = serializable;
    }

    public final void setAppInfo(t tVar) {
        this.appInfo = tVar;
    }

    public final void setStickerId(String str) {
        this.stickerId = str;
    }
}
