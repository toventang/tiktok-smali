package com.ss.android.ugc.aweme.ecommerce.ab;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class PDPImageConfig implements Parcelable {
    public static final Parcelable.Creator<PDPImageConfig> CREATOR = new a();
    @c(a = "pdp_header_progressive_switch")

    /* renamed from: a  reason: collision with root package name */
    public final int f84202a;

    static {
        Covode.recordClassIndex(52515);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof PDPImageConfig) && this.f84202a == ((PDPImageConfig) obj).f84202a;
        }
        return true;
    }

    public final int hashCode() {
        return this.f84202a;
    }

    public final String toString() {
        return "PDPImageConfig(progressiveSwitch=" + this.f84202a + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeInt(this.f84202a);
    }

    public static class a implements Parcelable.Creator<PDPImageConfig> {
        static {
            Covode.recordClassIndex(52516);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PDPImageConfig[] newArray(int i2) {
            return new PDPImageConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PDPImageConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new PDPImageConfig(parcel.readInt());
        }
    }

    public /* synthetic */ PDPImageConfig() {
        this(0);
    }

    public PDPImageConfig(int i2) {
        this.f84202a = i2;
    }
}
