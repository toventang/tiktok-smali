package com.ss.android.ugc.aweme.im.sdk.chat.data.model;

import com.bytedance.covode.number.Covode;

public final class Range {
    private int from;
    private int to;

    static {
        Covode.recordClassIndex(64055);
    }

    public final int getFrom() {
        return this.from;
    }

    public final int getTo() {
        return this.to;
    }

    public final int hashCode() {
        return (this.from * 31) + this.to;
    }

    public final void setFrom(int i2) {
        this.from = i2;
    }

    public final void setTo(int i2) {
        this.to = i2;
    }

    public final int getAnchorPosition(int i2) {
        int i3 = this.from;
        int i4 = this.to;
        if ((i2 - i3) - (i4 - i2) >= 0) {
            return i4;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        if (this.from == range.from && this.to == range.to) {
            return true;
        }
        return false;
    }

    public Range(int i2, int i3) {
        this.from = i2;
        this.to = i3;
    }

    public final boolean contains(int i2, int i3) {
        if (this.from > i2 || this.to < i3) {
            return false;
        }
        return true;
    }

    public final boolean isEqual(int i2, int i3) {
        int i4 = this.from;
        if (i4 == i2 && this.to == i3) {
            return true;
        }
        if (i4 == i3 && this.to == i2) {
            return true;
        }
        return false;
    }

    public final boolean isWrappedBy(int i2, int i3) {
        int i4 = this.from;
        int i5 = i4 + 1;
        int i6 = this.to;
        if ((i5 > i2 || i6 <= i2) && (i4 + 1 > i3 || i6 <= i3)) {
            return false;
        }
        return true;
    }
}
