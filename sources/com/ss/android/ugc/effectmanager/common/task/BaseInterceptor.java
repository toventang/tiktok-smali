package com.ss.android.ugc.effectmanager.common.task;

import com.bytedance.covode.number.Covode;

public abstract class BaseInterceptor {
    private boolean isEnabled;

    static {
        Covode.recordClassIndex(95312);
    }

    public abstract boolean intercept(ITask iTask);

    public boolean isEnabled() {
        return this.isEnabled;
    }

    public void enable(boolean z) {
        this.isEnabled = z;
    }
}
