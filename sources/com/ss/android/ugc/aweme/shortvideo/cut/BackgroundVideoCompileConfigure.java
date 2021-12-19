package com.ss.android.ugc.aweme.shortvideo.cut;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;

public final class BackgroundVideoCompileConfigure implements Parcelable {
    public static final Parcelable.Creator<BackgroundVideoCompileConfigure> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f125324a;

    /* renamed from: b  reason: collision with root package name */
    public final String f125325b;

    static {
        Covode.recordClassIndex(82275);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BackgroundVideoCompileConfigure)) {
            return false;
        }
        BackgroundVideoCompileConfigure backgroundVideoCompileConfigure = (BackgroundVideoCompileConfigure) obj;
        return l.a(this.f125324a, backgroundVideoCompileConfigure.f125324a) && l.a(this.f125325b, backgroundVideoCompileConfigure.f125325b);
    }

    public final int hashCode() {
        String str = this.f125324a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f125325b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "BackgroundVideoCompileConfigure(videoOutputPath=" + this.f125324a + ", audioOutputPath=" + this.f125325b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f125324a);
        parcel.writeString(this.f125325b);
    }

    public static class a implements Parcelable.Creator<BackgroundVideoCompileConfigure> {
        static {
            Covode.recordClassIndex(82276);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BackgroundVideoCompileConfigure[] newArray(int i2) {
            return new BackgroundVideoCompileConfigure[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BackgroundVideoCompileConfigure createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new BackgroundVideoCompileConfigure(parcel.readString(), parcel.readString());
        }
    }

    private /* synthetic */ BackgroundVideoCompileConfigure() {
        this("", "");
    }

    public BackgroundVideoCompileConfigure(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f125324a = str;
        this.f125325b = str2;
    }
}
