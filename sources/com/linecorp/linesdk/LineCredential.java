package com.linecorp.linesdk;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LineCredential implements Parcelable {
    public static final Parcelable.Creator<LineCredential> CREATOR = new Parcelable.Creator<LineCredential>() {
        /* class com.linecorp.linesdk.LineCredential.AnonymousClass1 */

        static {
            Covode.recordClassIndex(34504);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LineCredential[] newArray(int i2) {
            return new LineCredential[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LineCredential createFromParcel(Parcel parcel) {
            return new LineCredential(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final LineAccessToken f54932a;

    /* renamed from: b  reason: collision with root package name */
    public final List<String> f54933b;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(34503);
    }

    public int hashCode() {
        return (this.f54932a.hashCode() * 31) + this.f54933b.hashCode();
    }

    public String toString() {
        return "LineCredential{accessToken=" + ((Object) "#####") + ", permission=" + this.f54933b + '}';
    }

    private LineCredential(Parcel parcel) {
        this.f54932a = (LineAccessToken) parcel.readParcelable(LineAccessToken.class.getClassLoader());
        ArrayList arrayList = new ArrayList(8);
        parcel.readStringList(arrayList);
        this.f54933b = Collections.unmodifiableList(arrayList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineCredential lineCredential = (LineCredential) obj;
        if (!this.f54932a.equals(lineCredential.f54932a)) {
            return false;
        }
        return this.f54933b.equals(lineCredential.f54933b);
    }

    /* synthetic */ LineCredential(Parcel parcel, byte b2) {
        this(parcel);
    }

    public LineCredential(LineAccessToken lineAccessToken, List<String> list) {
        this.f54932a = lineAccessToken;
        this.f54933b = list;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f54932a, i2);
        parcel.writeStringList(this.f54933b);
    }
}
