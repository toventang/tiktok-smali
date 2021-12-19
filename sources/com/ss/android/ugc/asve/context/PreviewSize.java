package com.ss.android.ugc.asve.context;

import com.bytedance.covode.number.Covode;

public final class PreviewSize {
    private final int height;
    private final int width;

    static {
        Covode.recordClassIndex(38085);
    }

    public static /* synthetic */ PreviewSize copy$default(PreviewSize previewSize, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = previewSize.width;
        }
        if ((i4 & 2) != 0) {
            i3 = previewSize.height;
        }
        return previewSize.copy(i2, i3);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final PreviewSize copy(int i2, int i3) {
        return new PreviewSize(i2, i3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreviewSize)) {
            return false;
        }
        PreviewSize previewSize = (PreviewSize) obj;
        return this.width == previewSize.width && this.height == previewSize.height;
    }

    public final int hashCode() {
        return (this.width * 31) + this.height;
    }

    public final String toString() {
        return "PreviewSize(width=" + this.width + ", height=" + this.height + ")";
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public PreviewSize(int i2, int i3) {
        this.width = i2;
        this.height = i3;
    }
}
