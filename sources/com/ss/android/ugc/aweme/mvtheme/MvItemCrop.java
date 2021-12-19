package com.ss.android.ugc.aweme.mvtheme;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class MvItemCrop implements Parcelable, Serializable {
    public static final Parcelable.Creator<MvItemCrop> CREATOR = new a();
    @c(a = "lowerRightX")
    private final float lowerRightX;
    @c(a = "lowerRightY")
    private final float lowerRightY;
    @c(a = "upperLeftX")
    private final float upperLeftX;
    @c(a = "upperLeftY")
    private final float upperLeftY;

    static {
        Covode.recordClassIndex(72092);
    }

    public static /* synthetic */ MvItemCrop copy$default(MvItemCrop mvItemCrop, float f2, float f3, float f4, float f5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            f2 = mvItemCrop.upperLeftX;
        }
        if ((i2 & 2) != 0) {
            f3 = mvItemCrop.upperLeftY;
        }
        if ((i2 & 4) != 0) {
            f4 = mvItemCrop.lowerRightX;
        }
        if ((i2 & 8) != 0) {
            f5 = mvItemCrop.lowerRightY;
        }
        return mvItemCrop.copy(f2, f3, f4, f5);
    }

    public final float component1() {
        return this.upperLeftX;
    }

    public final float component2() {
        return this.upperLeftY;
    }

    public final float component3() {
        return this.lowerRightX;
    }

    public final float component4() {
        return this.lowerRightY;
    }

    public final MvItemCrop copy(float f2, float f3, float f4, float f5) {
        return new MvItemCrop(f2, f3, f4, f5);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MvItemCrop)) {
            return false;
        }
        MvItemCrop mvItemCrop = (MvItemCrop) obj;
        return Float.compare(this.upperLeftX, mvItemCrop.upperLeftX) == 0 && Float.compare(this.upperLeftY, mvItemCrop.upperLeftY) == 0 && Float.compare(this.lowerRightX, mvItemCrop.lowerRightX) == 0 && Float.compare(this.lowerRightY, mvItemCrop.lowerRightY) == 0;
    }

    public final int hashCode() {
        return (((((Float.floatToIntBits(this.upperLeftX) * 31) + Float.floatToIntBits(this.upperLeftY)) * 31) + Float.floatToIntBits(this.lowerRightX)) * 31) + Float.floatToIntBits(this.lowerRightY);
    }

    public final String toString() {
        return "MvItemCrop(upperLeftX=" + this.upperLeftX + ", upperLeftY=" + this.upperLeftY + ", lowerRightX=" + this.lowerRightX + ", lowerRightY=" + this.lowerRightY + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeFloat(this.upperLeftX);
        parcel.writeFloat(this.upperLeftY);
        parcel.writeFloat(this.lowerRightX);
        parcel.writeFloat(this.lowerRightY);
    }

    public final float getLowerRightX() {
        return this.lowerRightX;
    }

    public final float getLowerRightY() {
        return this.lowerRightY;
    }

    public final float getUpperLeftX() {
        return this.upperLeftX;
    }

    public final float getUpperLeftY() {
        return this.upperLeftY;
    }

    public static class a implements Parcelable.Creator<MvItemCrop> {
        static {
            Covode.recordClassIndex(72093);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MvItemCrop[] newArray(int i2) {
            return new MvItemCrop[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MvItemCrop createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new MvItemCrop(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), parcel.readFloat());
        }
    }

    public MvItemCrop(float f2, float f3, float f4, float f5) {
        this.upperLeftX = f2;
        this.upperLeftY = f3;
        this.lowerRightX = f4;
        this.lowerRightY = f5;
    }
}
