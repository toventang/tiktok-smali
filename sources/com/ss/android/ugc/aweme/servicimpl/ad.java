package com.ss.android.ugc.aweme.servicimpl;

import com.bytedance.covode.number.Covode;
import com.zhiliaoapp.musically.R;

/* JADX WARN: Init of enum RECORD_COMBINE_LIGHTENING can be incorrect */
public enum ad {
    PHOTO_SHORT(R.string.f_f, R.string.f_g),
    RECORD_COMBINE(R.string.f_1, R.string.f_5),
    RECORD_COMBINE_60(R.string.f9r, R.string.f_4),
    RECORD_COMBINE_15(R.string.f9q, R.string.f_2),
    RECORD_COMBINE_180(R.string.gff, R.string.f_3),
    RECORD_STATUS(R.string.b0k, R.string.f_h),
    RECORD_SPLIT_3min(R.string.b7k, R.string.f_3),
    RECORD_SPLIT_LIGHTENING(R.string.g93, R.string.f_3),
    RECORD_LIGHTENING_QUICK(R.string.g90, R.string.f_9),
    RECORD_LIGHTENING_VIDEO(R.string.g92, R.string.f__),
    RECORD_LIGHTENING_PHOTO(R.string.g91, R.string.f_8),
    RECORD_COMBINE_LIGHTENING(R.string.h9s, r6.tagResId);
    
    private final int nameResId;
    private final int tagResId;

    public final int getNameResId() {
        return this.nameResId;
    }

    public final int getTagResId() {
        return this.tagResId;
    }

    static {
        Covode.recordClassIndex(79900);
    }

    private ad(int i2, int i3) {
        this.nameResId = i2;
        this.tagResId = i3;
    }
}
