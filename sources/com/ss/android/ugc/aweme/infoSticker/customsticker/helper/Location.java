package com.ss.android.ugc.aweme.infoSticker.customsticker.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class Location {
    @c(a = "h")
    private final int height;
    @c(a = "x")
    private final int left;
    @c(a = "y")
    private final int top;
    @c(a = "w")
    private final int width;

    static {
        Covode.recordClassIndex(67071);
    }

    public static int com_ss_android_ugc_aweme_infoSticker_customsticker_helper_Location_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ Location copy$default(Location location, int i2, int i3, int i4, int i5, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i2 = location.left;
        }
        if ((i6 & 2) != 0) {
            i3 = location.top;
        }
        if ((i6 & 4) != 0) {
            i4 = location.width;
        }
        if ((i6 & 8) != 0) {
            i5 = location.height;
        }
        return location.copy(i2, i3, i4, i5);
    }

    public final int component1() {
        return this.left;
    }

    public final int component2() {
        return this.top;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final Location copy(int i2, int i3, int i4, int i5) {
        return new Location(i2, i3, i4, i5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Location)) {
            return false;
        }
        Location location = (Location) obj;
        return this.left == location.left && this.top == location.top && this.width == location.width && this.height == location.height;
    }

    public final int hashCode() {
        return (((((com_ss_android_ugc_aweme_infoSticker_customsticker_helper_Location_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.left) * 31) + com_ss_android_ugc_aweme_infoSticker_customsticker_helper_Location_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.top)) * 31) + com_ss_android_ugc_aweme_infoSticker_customsticker_helper_Location_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.width)) * 31) + com_ss_android_ugc_aweme_infoSticker_customsticker_helper_Location_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.height);
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getLeft() {
        return this.left;
    }

    public final int getTop() {
        return this.top;
    }

    public final int getWidth() {
        return this.width;
    }

    public final String toString() {
        return "[" + this.left + ", " + this.top + "], width: " + this.width + ", height: " + this.height;
    }

    public Location(int i2, int i3, int i4, int i5) {
        this.left = i2;
        this.top = i3;
        this.width = i4;
        this.height = i5;
    }
}
