package com.ss.android.ugc.aweme.shortvideo.mvtemplate.cutsame;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class CutSameVideoImageExtraData implements Parcelable {
    public static final Parcelable.Creator<CutSameVideoImageExtraData> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f129203a;

    static {
        Covode.recordClassIndex(84815);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof CutSameVideoImageExtraData) && this.f129203a == ((CutSameVideoImageExtraData) obj).f129203a;
        }
        return true;
    }

    public final int hashCode() {
        long j2 = this.f129203a;
        return (int) (j2 ^ (j2 >>> 32));
    }

    public final String toString() {
        return "CutSameVideoImageExtraData(extraDuration=" + this.f129203a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeLong(this.f129203a);
    }

    public static class a implements Parcelable.Creator<CutSameVideoImageExtraData> {
        static {
            Covode.recordClassIndex(84816);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CutSameVideoImageExtraData[] newArray(int i2) {
            return new CutSameVideoImageExtraData[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CutSameVideoImageExtraData createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new CutSameVideoImageExtraData(parcel.readLong());
        }
    }

    public CutSameVideoImageExtraData(long j2) {
        this.f129203a = j2;
    }
}
