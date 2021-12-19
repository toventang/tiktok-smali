package com.ss.android.ugc.aweme.ecommerce.pdp.repository.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.ecommerce.api.model.Icon;
import h.f.b.l;

public final class ShopPolicy implements Parcelable {
    public static final Parcelable.Creator<ShopPolicy> CREATOR = new a();
    @c(a = StringSet.name)

    /* renamed from: a  reason: collision with root package name */
    public final String f86664a;
    @c(a = "description")

    /* renamed from: b  reason: collision with root package name */
    public final String f86665b;
    @c(a = "logo")

    /* renamed from: c  reason: collision with root package name */
    public final Icon f86666c;

    static {
        Covode.recordClassIndex(54276);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.f86664a);
        parcel.writeString(this.f86665b);
        Icon icon = this.f86666c;
        if (icon != null) {
            parcel.writeInt(1);
            icon.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    public static class a implements Parcelable.Creator<ShopPolicy> {
        static {
            Covode.recordClassIndex(54277);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShopPolicy[] newArray(int i2) {
            return new ShopPolicy[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShopPolicy createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ShopPolicy(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Icon.CREATOR.createFromParcel(parcel) : null);
        }
    }

    public ShopPolicy(String str, String str2, Icon icon) {
        this.f86664a = str;
        this.f86665b = str2;
        this.f86666c = icon;
    }
}
