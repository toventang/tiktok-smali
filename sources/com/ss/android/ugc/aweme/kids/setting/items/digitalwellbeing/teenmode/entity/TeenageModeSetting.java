package com.ss.android.ugc.aweme.kids.setting.items.digitalwellbeing.teenmode.entity;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public final class TeenageModeSetting implements Serializable {
    private int timeLockSelfInMin;

    static {
        Covode.recordClassIndex(68396);
    }

    public final int getTimeLockSelfInMin() {
        return this.timeLockSelfInMin;
    }

    public final void setTimeLockSelfInMin(int i2) {
        this.timeLockSelfInMin = i2;
    }

    public TeenageModeSetting(int i2) {
        this.timeLockSelfInMin = i2;
    }
}
