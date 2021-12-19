package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.api.model.Video;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductBaseEpt;
import com.ss.android.ugc.aweme.ecommerce.service.vo.ProductPriceEpt;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class ProductBase implements Parcelable {
    public static final Parcelable.Creator<ProductBase> CREATOR = new a();
    @c(a = "title")

    /* renamed from: a  reason: collision with root package name */
    public final String f86623a;
    @c(a = "desc_detail")

    /* renamed from: b  reason: collision with root package name */
    public final String f86624b;
    @c(a = "desc_video")

    /* renamed from: c  reason: collision with root package name */
    public final Video f86625c;
    @c(a = "images")

    /* renamed from: d  reason: collision with root package name */
    public final List<Image> f86626d;
    @c(a = "specifications")

    /* renamed from: e  reason: collision with root package name */
    public final List<Specification> f86627e;
    @c(a = "sold_count")

    /* renamed from: f  reason: collision with root package name */
    public final String f86628f;
    @c(a = "price")

    /* renamed from: g  reason: collision with root package name */
    public final ProductPrice f86629g;

    static {
        Covode.recordClassIndex(54261);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductBase)) {
            return false;
        }
        ProductBase productBase = (ProductBase) obj;
        return l.a(this.f86623a, productBase.f86623a) && l.a(this.f86624b, productBase.f86624b) && l.a(this.f86625c, productBase.f86625c) && l.a(this.f86626d, productBase.f86626d) && l.a(this.f86627e, productBase.f86627e) && l.a(this.f86628f, productBase.f86628f) && l.a(this.f86629g, productBase.f86629g);
    }

    public final int hashCode() {
        String str = this.f86623a;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f86624b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Video video = this.f86625c;
        int hashCode3 = (hashCode2 + (video != null ? video.hashCode() : 0)) * 31;
        List<Image> list = this.f86626d;
        int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
        List<Specification> list2 = this.f86627e;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str3 = this.f86628f;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        ProductPrice productPrice = this.f86629g;
        if (productPrice != null) {
            i2 = productPrice.hashCode();
        }
        return hashCode6 + i2;
    }

    public final String toString() {
        return "ProductBase(title=" + this.f86623a + ", details=" + this.f86624b + ", video=" + this.f86625c + ", images=" + this.f86626d + ", props=" + this.f86627e + ", sales=" + this.f86628f + ", priceInfo=" + this.f86629g + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86623a);
        parcel.writeString(this.f86624b);
        Video video = this.f86625c;
        if (video != null) {
            parcel.writeInt(1);
            video.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<Image> list = this.f86626d;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Image image : list) {
                image.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        List<Specification> list2 = this.f86627e;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (Specification specification : list2) {
                specification.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f86628f);
        ProductPrice productPrice = this.f86629g;
        if (productPrice != null) {
            parcel.writeInt(1);
            productPrice.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<ProductBase> {
        static {
            Covode.recordClassIndex(54262);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ProductBase[] newArray(int i2) {
            return new ProductBase[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ProductBase createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            l.d(parcel, "");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ProductPrice productPrice = null;
            Video createFromParcel = parcel.readInt() != 0 ? Video.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(Image.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList2.add(Specification.CREATOR.createFromParcel(parcel));
                    readInt2--;
                }
            } else {
                arrayList2 = null;
            }
            String readString3 = parcel.readString();
            if (parcel.readInt() != 0) {
                productPrice = ProductPrice.CREATOR.createFromParcel(parcel);
            }
            return new ProductBase(readString, readString2, createFromParcel, arrayList, arrayList2, readString3, productPrice);
        }
    }

    public final ProductBaseEpt a() {
        ProductPriceEpt productPriceEpt;
        String str = this.f86623a;
        String str2 = this.f86624b;
        String str3 = this.f86628f;
        ProductPrice productPrice = this.f86629g;
        if (productPrice != null) {
            productPriceEpt = productPrice.a();
        } else {
            productPriceEpt = null;
        }
        return new ProductBaseEpt(str, str2, str3, productPriceEpt);
    }

    public ProductBase(String str, String str2, Video video, List<Image> list, List<Specification> list2, String str3, ProductPrice productPrice) {
        this.f86623a = str;
        this.f86624b = str2;
        this.f86625c = video;
        this.f86626d = list;
        this.f86627e = list2;
        this.f86628f = str3;
        this.f86629g = productPrice;
    }
}
