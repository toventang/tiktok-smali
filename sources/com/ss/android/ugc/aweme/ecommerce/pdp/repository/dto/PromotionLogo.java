package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import h.f.b.l;

public final class PromotionLogo implements Parcelable {
    public static final Parcelable.Creator<PromotionLogo> CREATOR = new a();
    @c(a = "image")

    /* renamed from: a  reason: collision with root package name */
    public final Image f86655a;
    @c(a = "promotion_id")

    /* renamed from: b  reason: collision with root package name */
    public final String f86656b;

    static {
        Covode.recordClassIndex(54272);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionLogo)) {
            return false;
        }
        PromotionLogo promotionLogo = (PromotionLogo) obj;
        return l.a(this.f86655a, promotionLogo.f86655a) && l.a(this.f86656b, promotionLogo.f86656b);
    }

    public final int hashCode() {
        Image image = this.f86655a;
        int i2 = 0;
        int hashCode = (image != null ? image.hashCode() : 0) * 31;
        String str = this.f86656b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "PromotionLogo(image=" + this.f86655a + ", promotionId=" + this.f86656b + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        Image image = this.f86655a;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.f86656b);
    }

    public static class a implements Parcelable.Creator<PromotionLogo> {
        static {
            Covode.recordClassIndex(54273);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ PromotionLogo[] newArray(int i2) {
            return new PromotionLogo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PromotionLogo createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new PromotionLogo(parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }
    }

    public PromotionLogo(Image image, String str) {
        this.f86655a = image;
        this.f86656b = str;
    }
}
