package com.ss.android.ugc.aweme.story.base.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ETParams implements Parcelable, Serializable {
    public static final Parcelable.Creator<ETParams> CREATOR = new a();
    private final long compileTime;
    private final String enterMethod;
    private final String recordWay;
    private final String shootWay;
    private final long startTime;
    private final float zoom;

    static {
        Covode.recordClassIndex(89472);
    }

    public ETParams() {
        this(null, null, null, 0, 0, 0.0f, 63, null);
    }

    public static int com_ss_android_ugc_aweme_story_base_model_ETParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }

    public static /* synthetic */ ETParams copy$default(ETParams eTParams, String str, String str2, String str3, long j2, long j3, float f2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = eTParams.shootWay;
        }
        if ((i2 & 2) != 0) {
            str2 = eTParams.enterMethod;
        }
        if ((i2 & 4) != 0) {
            str3 = eTParams.recordWay;
        }
        if ((i2 & 8) != 0) {
            j2 = eTParams.startTime;
        }
        if ((i2 & 16) != 0) {
            j3 = eTParams.compileTime;
        }
        if ((i2 & 32) != 0) {
            f2 = eTParams.zoom;
        }
        return eTParams.copy(str, str2, str3, j2, j3, f2);
    }

    public final String component1() {
        return this.shootWay;
    }

    public final String component2() {
        return this.enterMethod;
    }

    public final String component3() {
        return this.recordWay;
    }

    public final long component4() {
        return this.startTime;
    }

    public final long component5() {
        return this.compileTime;
    }

    public final float component6() {
        return this.zoom;
    }

    public final ETParams copy(String str, String str2, String str3, long j2, long j3, float f2) {
        return new ETParams(str, str2, str3, j2, j3, f2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ETParams)) {
            return false;
        }
        ETParams eTParams = (ETParams) obj;
        return l.a(this.shootWay, eTParams.shootWay) && l.a(this.enterMethod, eTParams.enterMethod) && l.a(this.recordWay, eTParams.recordWay) && this.startTime == eTParams.startTime && this.compileTime == eTParams.compileTime && Float.compare(this.zoom, eTParams.zoom) == 0;
    }

    public final int hashCode() {
        String str = this.shootWay;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.enterMethod;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.recordWay;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((((((hashCode2 + i2) * 31) + com_ss_android_ugc_aweme_story_base_model_ETParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.startTime)) * 31) + com_ss_android_ugc_aweme_story_base_model_ETParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.compileTime)) * 31) + com_ss_android_ugc_aweme_story_base_model_ETParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.zoom);
    }

    public final String toString() {
        return "ETParams(shootWay=" + this.shootWay + ", enterMethod=" + this.enterMethod + ", recordWay=" + this.recordWay + ", startTime=" + this.startTime + ", compileTime=" + this.compileTime + ", zoom=" + this.zoom + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.shootWay);
        parcel.writeString(this.enterMethod);
        parcel.writeString(this.recordWay);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.compileTime);
        parcel.writeFloat(this.zoom);
    }

    public final long getCompileTime() {
        return this.compileTime;
    }

    public final String getEnterMethod() {
        return this.enterMethod;
    }

    public final String getRecordWay() {
        return this.recordWay;
    }

    public final String getShootWay() {
        return this.shootWay;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public final float getZoom() {
        return this.zoom;
    }

    public static class a implements Parcelable.Creator<ETParams> {
        static {
            Covode.recordClassIndex(89473);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ETParams[] newArray(int i2) {
            return new ETParams[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ETParams createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ETParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readFloat());
        }
    }

    public static int com_ss_android_ugc_aweme_story_base_model_ETParams_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(float f2) {
        return Float.floatToIntBits(f2);
    }

    public ETParams(String str, String str2, String str3, long j2, long j3, float f2) {
        this.shootWay = str;
        this.enterMethod = str2;
        this.recordWay = str3;
        this.startTime = j2;
        this.compileTime = j3;
        this.zoom = f2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ETParams(String str, String str2, String str3, long j2, long j3, float f2, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) == 0 ? str3 : null, (i2 & 8) != 0 ? 0 : j2, (i2 & 16) == 0 ? j3 : 0, (i2 & 32) != 0 ? -1.0f : f2);
    }
}
