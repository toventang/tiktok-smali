package com.ss.android.socialbase.downloader.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;

public class HttpHeader implements Parcelable, Comparable {
    public static final Parcelable.Creator<HttpHeader> CREATOR = new Parcelable.Creator<HttpHeader>() {
        /* class com.ss.android.socialbase.downloader.model.HttpHeader.AnonymousClass1 */

        static {
            Covode.recordClassIndex(37541);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ HttpHeader[] newArray(int i2) {
            return new HttpHeader[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ HttpHeader createFromParcel(Parcel parcel) {
            return new HttpHeader(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f60856a;

    /* renamed from: b  reason: collision with root package name */
    public final String f60857b;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(37540);
    }

    public int hashCode() {
        int hashCode;
        String str = this.f60856a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i3 = hashCode * 31;
        String str2 = this.f60857b;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i3 + i2;
    }

    public String toString() {
        return "HttpHeader{name='" + this.f60856a + '\'' + ", value='" + this.f60857b + '\'' + '}';
    }

    protected HttpHeader(Parcel parcel) {
        this.f60856a = parcel.readString();
        this.f60857b = parcel.readString();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof HttpHeader)) {
            return 1;
        }
        HttpHeader httpHeader = (HttpHeader) obj;
        if (TextUtils.equals(this.f60856a, httpHeader.f60856a)) {
            return 0;
        }
        String str = this.f60856a;
        if (str == null) {
            return -1;
        }
        int compareTo = str.compareTo(httpHeader.f60856a);
        if (compareTo > 0) {
            return 1;
        }
        if (compareTo < 0) {
            return -1;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            HttpHeader httpHeader = (HttpHeader) obj;
            if (!TextUtils.equals(this.f60856a, httpHeader.f60856a) || !TextUtils.equals(this.f60857b, httpHeader.f60857b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public HttpHeader(String str, String str2) {
        this.f60856a = str;
        this.f60857b = str2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f60856a);
        parcel.writeString(this.f60857b);
    }
}
