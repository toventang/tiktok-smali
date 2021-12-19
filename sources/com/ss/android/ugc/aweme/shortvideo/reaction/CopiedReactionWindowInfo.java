package com.ss.android.ugc.aweme.shortvideo.reaction;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class CopiedReactionWindowInfo implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    @c(a = "react_angle")
    private final float angle;
    @c(a = "react_height")
    private final int height;
    @c(a = "react_type")
    private final int type;
    @c(a = "react_width")
    private final int width;

    static {
        Covode.recordClassIndex(85295);
    }

    public CopiedReactionWindowInfo() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public static /* synthetic */ CopiedReactionWindowInfo copy$default(CopiedReactionWindowInfo copiedReactionWindowInfo, int i2, int i3, float f2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = copiedReactionWindowInfo.width;
        }
        if ((i5 & 2) != 0) {
            i3 = copiedReactionWindowInfo.height;
        }
        if ((i5 & 4) != 0) {
            f2 = copiedReactionWindowInfo.angle;
        }
        if ((i5 & 8) != 0) {
            i4 = copiedReactionWindowInfo.type;
        }
        return copiedReactionWindowInfo.copy(i2, i3, f2, i4);
    }

    public final int component1() {
        return this.width;
    }

    public final int component2() {
        return this.height;
    }

    public final float component3() {
        return this.angle;
    }

    public final int component4() {
        return this.type;
    }

    public final CopiedReactionWindowInfo copy(int i2, int i3, float f2, int i4) {
        return new CopiedReactionWindowInfo(i2, i3, f2, i4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopiedReactionWindowInfo)) {
            return false;
        }
        CopiedReactionWindowInfo copiedReactionWindowInfo = (CopiedReactionWindowInfo) obj;
        return this.width == copiedReactionWindowInfo.width && this.height == copiedReactionWindowInfo.height && Float.compare(this.angle, copiedReactionWindowInfo.angle) == 0 && this.type == copiedReactionWindowInfo.type;
    }

    public final int hashCode() {
        return (((((this.width * 31) + this.height) * 31) + Float.floatToIntBits(this.angle)) * 31) + this.type;
    }

    public final String toString() {
        return "CopiedReactionWindowInfo(width=" + this.width + ", height=" + this.height + ", angle=" + this.angle + ", type=" + this.type + ")";
    }

    public static final class a implements Parcelable.Creator<CopiedReactionWindowInfo> {
        static {
            Covode.recordClassIndex(85296);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CopiedReactionWindowInfo[] newArray(int i2) {
            return new CopiedReactionWindowInfo[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CopiedReactionWindowInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new CopiedReactionWindowInfo(parcel);
        }
    }

    public final float getAngle() {
        return this.angle;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getType() {
        return this.type;
    }

    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CopiedReactionWindowInfo(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt());
        l.d(parcel, "");
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
        parcel.writeFloat(this.angle);
        parcel.writeInt(this.type);
    }

    public CopiedReactionWindowInfo(int i2, int i3, float f2, int i4) {
        this.width = i2;
        this.height = i3;
        this.angle = f2;
        this.type = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CopiedReactionWindowInfo(int i2, int i3, float f2, int i4, int i5, g gVar) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? 0.0f : f2, (i5 & 8) != 0 ? 0 : i4);
    }
}
