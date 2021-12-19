package com.ss.android.ugc.asve.recorder.reaction.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ReactionWindowInfo implements Parcelable, Serializable {
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
        Covode.recordClassIndex(38298);
    }

    public ReactionWindowInfo() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public static /* synthetic */ ReactionWindowInfo copy$default(ReactionWindowInfo reactionWindowInfo, int i2, int i3, float f2, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i2 = reactionWindowInfo.width;
        }
        if ((i5 & 2) != 0) {
            i3 = reactionWindowInfo.height;
        }
        if ((i5 & 4) != 0) {
            f2 = reactionWindowInfo.angle;
        }
        if ((i5 & 8) != 0) {
            i4 = reactionWindowInfo.type;
        }
        return reactionWindowInfo.copy(i2, i3, f2, i4);
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

    public final ReactionWindowInfo copy(int i2, int i3, float f2, int i4) {
        return new ReactionWindowInfo(i2, i3, f2, i4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReactionWindowInfo)) {
            return false;
        }
        ReactionWindowInfo reactionWindowInfo = (ReactionWindowInfo) obj;
        return this.width == reactionWindowInfo.width && this.height == reactionWindowInfo.height && Float.compare(this.angle, reactionWindowInfo.angle) == 0 && this.type == reactionWindowInfo.type;
    }

    public final int hashCode() {
        return (((((this.width * 31) + this.height) * 31) + Float.floatToIntBits(this.angle)) * 31) + this.type;
    }

    public final String toString() {
        return "ReactionWindowInfo(width=" + this.width + ", height=" + this.height + ", angle=" + this.angle + ", type=" + this.type + ")";
    }

    public static final class a implements Parcelable.Creator<ReactionWindowInfo> {
        static {
            Covode.recordClassIndex(38299);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ReactionWindowInfo[] newArray(int i2) {
            return new ReactionWindowInfo[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReactionWindowInfo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ReactionWindowInfo(parcel);
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
    public ReactionWindowInfo(Parcel parcel) {
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

    public ReactionWindowInfo(int i2, int i3, float f2, int i4) {
        this.width = i2;
        this.height = i3;
        this.angle = f2;
        this.type = i4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ReactionWindowInfo(int i2, int i3, float f2, int i4, int i5, g gVar) {
        this((i5 & 1) != 0 ? 0 : i2, (i5 & 2) != 0 ? 0 : i3, (i5 & 4) != 0 ? 0.0f : f2, (i5 & 8) != 0 ? 0 : i4);
    }
}
