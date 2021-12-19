package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class BoxData implements Serializable {
    @c(a = "box")
    private final Coordinate box;
    @c(a = "timestamp_MS")
    private final int timestampMS;

    static {
        Covode.recordClassIndex(59353);
    }

    public BoxData() {
        this(null, 0, 3, null);
    }

    public static int com_ss_android_ugc_aweme_feed_model_BoxData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ BoxData copy$default(BoxData boxData, Coordinate coordinate, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            coordinate = boxData.box;
        }
        if ((i3 & 2) != 0) {
            i2 = boxData.timestampMS;
        }
        return boxData.copy(coordinate, i2);
    }

    public final Coordinate component1() {
        return this.box;
    }

    public final int component2() {
        return this.timestampMS;
    }

    public final BoxData copy(Coordinate coordinate, int i2) {
        return new BoxData(coordinate, i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoxData)) {
            return false;
        }
        BoxData boxData = (BoxData) obj;
        return l.a(this.box, boxData.box) && this.timestampMS == boxData.timestampMS;
    }

    public final int hashCode() {
        Coordinate coordinate = this.box;
        return ((coordinate != null ? coordinate.hashCode() : 0) * 31) + com_ss_android_ugc_aweme_feed_model_BoxData_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.timestampMS);
    }

    public final String toString() {
        return "BoxData(box=" + this.box + ", timestampMS=" + this.timestampMS + ")";
    }

    public final Coordinate getBox() {
        return this.box;
    }

    public final int getTimestampMS() {
        return this.timestampMS;
    }

    public BoxData(Coordinate coordinate, int i2) {
        this.box = coordinate;
        this.timestampMS = i2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BoxData(Coordinate coordinate, int i2, int i3, g gVar) {
        this((i3 & 1) != 0 ? null : coordinate, (i3 & 2) != 0 ? 0 : i2);
    }
}
