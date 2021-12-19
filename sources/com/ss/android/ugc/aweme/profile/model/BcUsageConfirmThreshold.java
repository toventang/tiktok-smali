package com.ss.android.ugc.aweme.profile.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class BcUsageConfirmThreshold implements Serializable {
    @c(a = "app")
    private final boolean app;
    @c(a = "h5")
    private final boolean h5;

    static {
        Covode.recordClassIndex(75206);
    }

    public final boolean getApp() {
        return this.app;
    }

    public final boolean getH5() {
        return this.h5;
    }
}
