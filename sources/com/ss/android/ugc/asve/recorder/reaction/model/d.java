package com.ss.android.ugc.asve.recorder.reaction.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public abstract class d implements a, Serializable {
    private final int defaultHeightDP;
    private final int defaultWidthDP;
    @c(a = "react_window_resource_path")
    private final String mImagePath;
    @c(a = "react_is_circle_shape")
    private boolean mIsCircle;
    private final int minHeightDP;
    private final int minWidthDP;
    public final int outputVideoHeight;
    public final int outputVideoWidth;

    static {
        Covode.recordClassIndex(38303);
    }

    public final String getMImagePath() {
        return this.mImagePath;
    }

    public final boolean getMIsCircle() {
        return this.mIsCircle;
    }

    public final int getDefaultHeight() {
        return convertDpToHeight(this.defaultHeightDP);
    }

    public final int getDefaultWidth() {
        return convertDpToWidth(this.defaultWidthDP);
    }

    public final int getMinHeight() {
        return convertDpToWidth(this.minHeightDP);
    }

    public final int getMinWidth() {
        return convertDpToWidth(this.minWidthDP);
    }

    public float getWidthHeightRatio() {
        return ((float) this.defaultWidthDP) / ((float) this.defaultHeightDP);
    }

    public final void setMIsCircle(boolean z) {
        this.mIsCircle = z;
    }

    public d(String str, boolean z, int i2, int i3, int i4, int i5, int i6, int i7) {
        l.d(str, "");
        this.mImagePath = str;
        this.mIsCircle = z;
        this.outputVideoWidth = i2;
        this.outputVideoHeight = i3;
        this.defaultWidthDP = i4;
        this.defaultHeightDP = i5;
        this.minWidthDP = i6;
        this.minHeightDP = i7;
    }
}
