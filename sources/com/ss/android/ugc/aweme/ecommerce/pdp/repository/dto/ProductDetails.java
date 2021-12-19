package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;
import java.util.List;

public final class ProductDetails implements Parcelable {
    public static final Parcelable.Creator<ProductDetails> CREATOR = new a();
    @c(a = StringSet.type)

    /* renamed from: a  reason: collision with root package name */
    public final String f86633a;
    @c(a = "image")

    /* renamed from: b  reason: collision with root package name */
    public final Image f86634b;
    @c(a = "text")

    /* renamed from: c  reason: collision with root package name */
    public final String f86635c;
    @c(a = "content")

    /* renamed from: d  reason: collision with root package name */
    public final List<String> f86636d;

    static {
        Covode.recordClassIndex(54265);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetails)) {
            return false;
        }
        ProductDetails productDetails = (ProductDetails) obj;
        return l.a(this.f86633a, productDetails.f86633a) && l.a(this.f86634b, productDetails.f86634b) && l.a(this.f86635c, productDetails.f86635c) && l.a(this.f86636d, productDetails.f86636d);
    }

    public final int hashCode() {
        String str = this.f86633a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Image image = this.f86634b;
        int hashCode2 = (hashCode + (image != null ? image.hashCode() : 0)) * 31;
        String str2 = this.f86635c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<String> list = this.f86636d;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "ProductDetails(type=" + this.f86633a + ", image=" + this.f86634b + ", text=" + this.f86635c + ", content=" + this.f86636d + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86633a);
        Image image = this.f86634b;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f86635c);
        parcel.writeStringList(this.f86636d);
    }

    public static class a implements Parcelable.Creator<ProductDetails> {
        static {
            Covode.recordClassIndex(54266);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductDetails[] newArray(int i2) {
            return new ProductDetails[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductDetails createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ProductDetails(parcel.readString(), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.createStringArrayList());
        }
    }

    public ProductDetails(String str, Image image, String str2, List<String> list) {
        this.f86633a = str;
        this.f86634b = image;
        this.f86635c = str2;
        this.f86636d = list;
    }
}
