package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;

public class MaskLayerOption {
    public boolean mDoOrCancel;
    public int mIconResId;
    public int mTextResId;
    public int mType;

    static {
        Covode.recordClassIndex(59418);
    }

    public MaskLayerOption(int i2, int i3, int i4) {
        this.mType = i2;
        this.mIconResId = i3;
        this.mTextResId = i4;
    }

    public MaskLayerOption(int i2, int i3, int i4, boolean z) {
        this.mType = i2;
        this.mIconResId = i3;
        this.mTextResId = i4;
        this.mDoOrCancel = z;
    }
}
