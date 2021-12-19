package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class LineAccessToken implements Parcelable {
    public static final Parcelable.Creator<LineAccessToken> CREATOR = new Parcelable.Creator<LineAccessToken>() {
        /* class com.linecorp.linesdk.LineAccessToken.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34500);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LineAccessToken[] newArray(int i2) {
            return new LineAccessToken[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LineAccessToken createFromParcel(Parcel parcel) {
            return new LineAccessToken(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f54926a;

    /* renamed from: b  reason: collision with root package name */
    public final long f54927b;

    /* renamed from: c  reason: collision with root package name */
    public final long f54928c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(34499);
    }

    public int hashCode() {
        long j2 = this.f54927b;
        long j3 = this.f54928c;
        return (((this.f54926a.hashCode() * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public String toString() {
        return "LineAccessToken{accessToken='#####', expiresInMillis=" + this.f54927b + ", issuedClientTimeMillis=" + this.f54928c + '}';
    }

    private LineAccessToken(Parcel parcel) {
        this.f54926a = parcel.readString();
        this.f54927b = parcel.readLong();
        this.f54928c = parcel.readLong();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineAccessToken lineAccessToken = (LineAccessToken) obj;
        if (this.f54927b == lineAccessToken.f54927b && this.f54928c == lineAccessToken.f54928c) {
            return this.f54926a.equals(lineAccessToken.f54926a);
        }
        return false;
    }

    /* synthetic */ LineAccessToken(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f54926a);
        parcel.writeLong(this.f54927b);
        parcel.writeLong(this.f54928c);
    }

    public LineAccessToken(String str, long j2, long j3) {
        this.f54926a = str;
        this.f54927b = j2;
        this.f54928c = j3;
    }
}
