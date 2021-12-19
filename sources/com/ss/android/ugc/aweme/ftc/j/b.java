package com.ss.android.ugc.aweme.ftc.j;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

public enum b {
    RECORD_COMBINE_60(R.string.f9r, R.string.f_4),
    RECORD_COMBINE_15(R.string.f9q, R.string.f_2);
    
    private final int nameResId;
    private final int tagResId;

    public final int getNameResId() {
        return this.nameResId;
    }

    public final int getTagResId() {
        return this.tagResId;
    }

    static {
        Covode.recordClassIndex(62722);
    }

    private b(int i2, int i3) {
        this.nameResId = i2;
        this.tagResId = i3;
    }
}
