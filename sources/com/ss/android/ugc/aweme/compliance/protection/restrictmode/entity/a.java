package com.ss.android.ugc.aweme.compliance.protection.restrictmode.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import java.io.Serializable;

public final class a implements Serializable {
    @c(a = "isTeenageModeSelf")
    private boolean isRestrictModeSelf;
    @c(a = "timeLockSelfInMin")
    private int timeLockSelfInMin;

    static {
        Covode.recordClassIndex(48362);
    }

    public final int getTimeLockSelfInMin() {
        return this.timeLockSelfInMin;
    }

    public final boolean isRestrictModeSelf() {
        return this.isRestrictModeSelf;
    }

    public final void setRestrictModeSelf(boolean z) {
        this.isRestrictModeSelf = z;
    }

    public final void setTimeLockSelfInMin(int i2) {
        this.timeLockSelfInMin = i2;
    }

    public a(boolean z, int i2) {
        this.isRestrictModeSelf = z;
        this.timeLockSelfInMin = i2;
    }
}
