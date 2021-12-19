package com.ss.android.ugc.aweme.ecommerce.review.repo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class ReviewTags implements Parcelable {
    public static final Parcelable.Creator<ReviewTags> CREATOR = new a();
    @c(a = "tag_text")

    /* renamed from: a  reason: collision with root package name */
    public final String f87080a;
    @c(a = "tag_type")

    /* renamed from: b  reason: collision with root package name */
    public final int f87081b;

    static {
        Covode.recordClassIndex(54626);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReviewTags)) {
            return false;
        }
        ReviewTags reviewTags = (ReviewTags) obj;
        return l.a(this.f87080a, reviewTags.f87080a) && this.f87081b == reviewTags.f87081b;
    }

    public final int hashCode() {
        String str = this.f87080a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.f87081b;
    }

    public final String toString() {
        return "ReviewTags(text=" + this.f87080a + ", type=" + this.f87081b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f87080a);
        parcel.writeInt(this.f87081b);
    }

    public static class a implements Parcelable.Creator<ReviewTags> {
        static {
            Covode.recordClassIndex(54627);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ReviewTags[] newArray(int i2) {
            return new ReviewTags[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ReviewTags createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ReviewTags(parcel.readString(), parcel.readInt());
        }
    }

    private /* synthetic */ ReviewTags() {
        this("", 0);
    }

    public ReviewTags(String str, int i2) {
        l.d(str, "");
        this.f87080a = str;
        this.f87081b = i2;
    }
}
