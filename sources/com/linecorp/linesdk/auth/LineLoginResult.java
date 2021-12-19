package com.linecorp.linesdk.auth;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.linecorp.linesdk.LineAccessToken;
import com.linecorp.linesdk.LineApiError;
import com.linecorp.linesdk.LineCredential;
import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.b;

public class LineLoginResult implements Parcelable {
    public static final Parcelable.Creator<LineLoginResult> CREATOR = new Parcelable.Creator<LineLoginResult>() {
        /* class com.linecorp.linesdk.auth.LineLoginResult.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34535);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LineLoginResult[] newArray(int i2) {
            return new LineLoginResult[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LineLoginResult createFromParcel(Parcel parcel) {
            return new LineLoginResult(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public static final LineLoginResult f54996a = new LineLoginResult(b.CANCEL, LineApiError.f54929a);

    /* renamed from: b  reason: collision with root package name */
    public final b f54997b;

    /* renamed from: c  reason: collision with root package name */
    public final LineProfile f54998c;

    /* renamed from: d  reason: collision with root package name */
    public final LineCredential f54999d;

    /* renamed from: e  reason: collision with root package name */
    public final LineApiError f55000e;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(34534);
    }

    public int hashCode() {
        int i2;
        int hashCode = this.f54997b.hashCode() * 31;
        LineProfile lineProfile = this.f54998c;
        int i3 = 0;
        if (lineProfile != null) {
            i2 = lineProfile.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (hashCode + i2) * 31;
        LineCredential lineCredential = this.f54999d;
        if (lineCredential != null) {
            i3 = lineCredential.hashCode();
        }
        return ((i4 + i3) * 31) + this.f55000e.hashCode();
    }

    public String toString() {
        return "LineLoginResult{errorData=" + this.f55000e + ", responseCode=" + this.f54997b + ", lineProfile=" + this.f54998c + ", lineCredential=" + this.f54999d + '}';
    }

    private LineLoginResult(Parcel parcel) {
        this.f54997b = (b) parcel.readSerializable();
        this.f54998c = (LineProfile) parcel.readParcelable(LineProfile.class.getClassLoader());
        this.f54999d = (LineCredential) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        this.f55000e = (LineApiError) parcel.readParcelable(LineApiError.class.getClassLoader());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineLoginResult lineLoginResult = (LineLoginResult) obj;
        if (this.f54997b != lineLoginResult.f54997b) {
            return false;
        }
        LineProfile lineProfile = this.f54998c;
        if (lineProfile == null ? lineLoginResult.f54998c != null : !lineProfile.equals(lineLoginResult.f54998c)) {
            return false;
        }
        LineCredential lineCredential = this.f54999d;
        if (lineCredential == null ? lineLoginResult.f54999d == null : lineCredential.equals(lineLoginResult.f54999d)) {
            return this.f55000e.equals(lineLoginResult.f55000e);
        }
        return false;
    }

    /* synthetic */ LineLoginResult(Parcel parcel, byte b2) {
        this(parcel);
    }

    public LineLoginResult(LineProfile lineProfile, LineCredential lineCredential) {
        this(b.SUCCESS, lineProfile, lineCredential, LineApiError.f54929a);
    }

    public LineLoginResult(b bVar, LineApiError lineApiError) {
        this(bVar, null, null, lineApiError);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeSerializable(this.f54997b);
        parcel.writeParcelable(this.f54998c, i2);
        parcel.writeParcelable(this.f54999d, i2);
        parcel.writeParcelable(this.f55000e, i2);
    }

    private LineLoginResult(b bVar, LineProfile lineProfile, LineCredential lineCredential, LineApiError lineApiError) {
        this.f54997b = bVar;
        this.f54998c = lineProfile;
        this.f54999d = lineCredential;
        this.f55000e = lineApiError;
    }
}
