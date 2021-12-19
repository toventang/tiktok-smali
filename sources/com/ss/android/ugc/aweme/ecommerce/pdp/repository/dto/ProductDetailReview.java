package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.review.repo.dto.ReviewItemStruct;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class ProductDetailReview implements Parcelable {
    public static final Parcelable.Creator<ProductDetailReview> CREATOR = new a();
    @c(a = "product_rating")

    /* renamed from: a  reason: collision with root package name */
    public final Float f86630a;
    @c(a = "review_count")

    /* renamed from: b  reason: collision with root package name */
    public final Integer f86631b;
    @c(a = "review_items")

    /* renamed from: c  reason: collision with root package name */
    public final List<ReviewItemStruct> f86632c;

    static {
        Covode.recordClassIndex(54263);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailReview)) {
            return false;
        }
        ProductDetailReview productDetailReview = (ProductDetailReview) obj;
        return l.a(this.f86630a, productDetailReview.f86630a) && l.a(this.f86631b, productDetailReview.f86631b) && l.a(this.f86632c, productDetailReview.f86632c);
    }

    public final int hashCode() {
        Float f2 = this.f86630a;
        int i2 = 0;
        int hashCode = (f2 != null ? f2.hashCode() : 0) * 31;
        Integer num = this.f86631b;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        List<ReviewItemStruct> list = this.f86632c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "ProductDetailReview(rating=" + this.f86630a + ", reviewCount=" + this.f86631b + ", reviewItems=" + this.f86632c + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        Float f2 = this.f86630a;
        if (f2 != null) {
            parcel.writeInt(1);
            parcel.writeFloat(f2.floatValue());
        } else {
            parcel.writeInt(0);
        }
        Integer num = this.f86631b;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        List<ReviewItemStruct> list = this.f86632c;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (ReviewItemStruct reviewItemStruct : list) {
                reviewItemStruct.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<ProductDetailReview> {
        static {
            Covode.recordClassIndex(54264);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductDetailReview[] newArray(int i2) {
            return new ProductDetailReview[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductDetailReview createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            ArrayList arrayList = null;
            Float valueOf = parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : null;
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(ReviewItemStruct.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new ProductDetailReview(valueOf, valueOf2, arrayList);
        }
    }

    public ProductDetailReview(Float f2, Integer num, List<ReviewItemStruct> list) {
        this.f86630a = f2;
        this.f86631b = num;
        this.f86632c = list;
    }
}
