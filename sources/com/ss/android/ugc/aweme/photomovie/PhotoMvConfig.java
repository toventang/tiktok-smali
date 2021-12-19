package com.ss.android.ugc.aweme.photomovie;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class PhotoMvConfig implements Parcelable {
    public static final Parcelable.Creator<PhotoMvConfig> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f114911a;

    /* renamed from: b  reason: collision with root package name */
    public final String f114912b;

    static {
        Covode.recordClassIndex(73909);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PhotoMvConfig)) {
            return false;
        }
        PhotoMvConfig photoMvConfig = (PhotoMvConfig) obj;
        return l.a(this.f114911a, photoMvConfig.f114911a) && l.a(this.f114912b, photoMvConfig.f114912b);
    }

    public final int hashCode() {
        String str = this.f114911a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f114912b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PhotoMvConfig(anchorMvId=" + this.f114911a + ", anchorMvPanel=" + this.f114912b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f114911a);
        parcel.writeString(this.f114912b);
    }

    public static class a implements Parcelable.Creator<PhotoMvConfig> {
        static {
            Covode.recordClassIndex(73910);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PhotoMvConfig[] newArray(int i2) {
            return new PhotoMvConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PhotoMvConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new PhotoMvConfig(parcel.readString(), parcel.readString());
        }
    }

    public PhotoMvConfig(String str, String str2) {
        this.f114911a = str;
        this.f114912b = str2;
    }
}
