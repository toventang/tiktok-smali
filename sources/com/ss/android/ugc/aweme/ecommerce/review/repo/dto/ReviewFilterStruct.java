package com.ss.android.ugc.aweme.ecommerce.review.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import h.f.b.l;

public final class ReviewFilterStruct implements Parcelable {
    public static final Parcelable.Creator<ReviewFilterStruct> CREATOR = new b();

    /* renamed from: e  reason: collision with root package name */
    public static final a f87050e = new a((byte) 0);
    @c(a = "filter_id")

    /* renamed from: a  reason: collision with root package name */
    public final String f87051a;
    @c(a = StringSet.name)

    /* renamed from: b  reason: collision with root package name */
    public final String f87052b;
    @c(a = "count_str")

    /* renamed from: c  reason: collision with root package name */
    public final String f87053c;
    @c(a = StringSet.type)

    /* renamed from: d  reason: collision with root package name */
    public final int f87054d;

    static {
        Covode.recordClassIndex(54615);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewFilterStruct)) {
            return false;
        }
        ReviewFilterStruct reviewFilterStruct = (ReviewFilterStruct) obj;
        return l.a(this.f87051a, reviewFilterStruct.f87051a) && l.a(this.f87052b, reviewFilterStruct.f87052b) && l.a(this.f87053c, reviewFilterStruct.f87053c) && this.f87054d == reviewFilterStruct.f87054d;
    }

    public final int hashCode() {
        String str = this.f87051a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f87052b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f87053c;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return ((hashCode2 + i2) * 31) + this.f87054d;
    }

    public final String toString() {
        return "ReviewFilterStruct(filterId=" + this.f87051a + ", name=" + this.f87052b + ", countStr=" + this.f87053c + ", type=" + this.f87054d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f87051a);
        parcel.writeString(this.f87052b);
        parcel.writeString(this.f87053c);
        parcel.writeInt(this.f87054d);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(54616);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static class b implements Parcelable.Creator<ReviewFilterStruct> {
        static {
            Covode.recordClassIndex(54617);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ReviewFilterStruct[] newArray(int i2) {
            return new ReviewFilterStruct[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReviewFilterStruct createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ReviewFilterStruct(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }
    }

    private /* synthetic */ ReviewFilterStruct() {
        this("", "", "", 0);
    }

    public ReviewFilterStruct(String str, String str2, String str3, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.f87051a = str;
        this.f87052b = str2;
        this.f87053c = str3;
        this.f87054d = i2;
    }
}
