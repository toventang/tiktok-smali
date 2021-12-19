package com.ss.android.ugc.aweme.shortvideo;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;

public final class DuetLayoutInfo implements Parcelable {
    public static final Parcelable.Creator<DuetLayoutInfo> CREATOR = new a();
    private final int type;
    private final float x1;
    private final float x2;
    private final float y1;
    private final float y2;

    static {
        Covode.recordClassIndex(81965);
    }

    public DuetLayoutInfo() {
        this(0, 0.0f, 0.0f, 0.0f, 0.0f, 31, null);
    }

    public static /* synthetic */ DuetLayoutInfo copy$default(DuetLayoutInfo duetLayoutInfo, int i2, float f2, float f3, float f4, float f5, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = duetLayoutInfo.type;
        }
        if ((i3 & 2) != 0) {
            f2 = duetLayoutInfo.x1;
        }
        if ((i3 & 4) != 0) {
            f3 = duetLayoutInfo.y1;
        }
        if ((i3 & 8) != 0) {
            f4 = duetLayoutInfo.x2;
        }
        if ((i3 & 16) != 0) {
            f5 = duetLayoutInfo.y2;
        }
        return duetLayoutInfo.copy(i2, f2, f3, f4, f5);
    }

    public final int component1() {
        return this.type;
    }

    public final float component2() {
        return this.x1;
    }

    public final float component3() {
        return this.y1;
    }

    public final float component4() {
        return this.x2;
    }

    public final float component5() {
        return this.y2;
    }

    public final DuetLayoutInfo copy(int i2, float f2, float f3, float f4, float f5) {
        return new DuetLayoutInfo(i2, f2, f3, f4, f5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DuetLayoutInfo)) {
            return false;
        }
        DuetLayoutInfo duetLayoutInfo = (DuetLayoutInfo) obj;
        return this.type == duetLayoutInfo.type && Float.compare(this.x1, duetLayoutInfo.x1) == 0 && Float.compare(this.y1, duetLayoutInfo.y1) == 0 && Float.compare(this.x2, duetLayoutInfo.x2) == 0 && Float.compare(this.y2, duetLayoutInfo.y2) == 0;
    }

    public final int hashCode() {
        return (((((((this.type * 31) + Float.floatToIntBits(this.x1)) * 31) + Float.floatToIntBits(this.y1)) * 31) + Float.floatToIntBits(this.x2)) * 31) + Float.floatToIntBits(this.y2);
    }

    public final String toString() {
        return "DuetLayoutInfo(type=" + this.type + ", x1=" + this.x1 + ", y1=" + this.y1 + ", x2=" + this.x2 + ", y2=" + this.y2 + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.type);
        parcel.writeFloat(this.x1);
        parcel.writeFloat(this.y1);
        parcel.writeFloat(this.x2);
        parcel.writeFloat(this.y2);
    }

    public final int getType() {
        return this.type;
    }

    public final float getX1() {
        return this.x1;
    }

    public final float getX2() {
        return this.x2;
    }

    public final float getY1() {
        return this.y1;
    }

    public final float getY2() {
        return this.y2;
    }

    public static class a implements Parcelable.Creator<DuetLayoutInfo> {
        static {
            Covode.recordClassIndex(81966);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ DuetLayoutInfo[] newArray(int i2) {
            return new DuetLayoutInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DuetLayoutInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new DuetLayoutInfo(parcel.readInt(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }
    }

    public DuetLayoutInfo(int i2, float f2, float f3, float f4, float f5) {
        this.type = i2;
        this.x1 = f2;
        this.y1 = f3;
        this.x2 = f4;
        this.y2 = f5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DuetLayoutInfo(int i2, float f2, float f3, float f4, float f5, int i3, g gVar) {
        this((i3 & 1) != 0 ? -1 : i2, (i3 & 2) != 0 ? 0.0f : f2, (i3 & 4) != 0 ? 0.0f : f3, (i3 & 8) != 0 ? 0.0f : f4, (i3 & 16) == 0 ? f5 : 0.0f);
    }
}
