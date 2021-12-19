package com.ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class Promotion implements Parcelable {
    public static final Parcelable.Creator<Promotion> CREATOR = new a();
    @c(a = "promotion_id")
    private final String promotionId;

    static {
        Covode.recordClassIndex(52846);
    }

    public static /* synthetic */ Promotion copy$default(Promotion promotion, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = promotion.promotionId;
        }
        return promotion.copy(str);
    }

    public final String component1() {
        return this.promotionId;
    }

    public final Promotion copy(String str) {
        return new Promotion(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof Promotion) && l.a(this.promotionId, ((Promotion) obj).promotionId);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.promotionId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "Promotion(promotionId=" + this.promotionId + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.promotionId);
    }

    public final String getPromotionId() {
        return this.promotionId;
    }

    public static class a implements Parcelable.Creator<Promotion> {
        static {
            Covode.recordClassIndex(52847);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Promotion[] newArray(int i2) {
            return new Promotion[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Promotion createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new Promotion(parcel.readString());
        }
    }

    public Promotion(String str) {
        this.promotionId = str;
    }
}
