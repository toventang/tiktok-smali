package com.ss.android.ugc.aweme.infoSticker.customsticker.helper;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public final class Coordinate {
    @c(a = "x")
    private float x;
    @c(a = "y")
    private float y;

    static {
        Covode.recordClassIndex(67070);
    }

    public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, float f2, float f3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = coordinate.x;
        }
        if ((i2 & 2) != 0) {
            f3 = coordinate.y;
        }
        return coordinate.copy(f2, f3);
    }

    public final float component1() {
        return this.x;
    }

    public final float component2() {
        return this.y;
    }

    public final Coordinate copy(float f2, float f3) {
        return new Coordinate(f2, f3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Coordinate)) {
            return false;
        }
        Coordinate coordinate = (Coordinate) obj;
        return Float.compare(this.x, coordinate.x) == 0 && Float.compare(this.y, coordinate.y) == 0;
    }

    public final int hashCode() {
        return (com_ss_android_ugc_aweme_infoSticker_customsticker_helper_Coordinate_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.x) * 31) + com_ss_android_ugc_aweme_infoSticker_customsticker_helper_Coordinate_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.y);
    }

    public final float getX() {
        return this.x;
    }

    public final float getY() {
        return this.y;
    }

    public final String toString() {
        return "[" + this.x + ", " + this.y + ']';
    }

    public final void setX(float f2) {
        this.x = f2;
    }

    public final void setY(float f2) {
        this.y = f2;
    }

    public static int com_ss_android_ugc_aweme_infoSticker_customsticker_helper_Coordinate_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public Coordinate(float f2, float f3) {
        this.x = f2;
        this.y = f3;
    }
}
