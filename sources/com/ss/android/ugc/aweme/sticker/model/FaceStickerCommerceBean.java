package com.ss.android.ugc.aweme.sticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class FaceStickerCommerceBean implements Parcelable {
    public static final Parcelable.Creator<FaceStickerCommerceBean> CREATOR = new Parcelable.Creator<FaceStickerCommerceBean>() {
        /* class com.ss.android.ugc.aweme.sticker.model.FaceStickerCommerceBean.AnonymousClass1 */

        static {
            Covode.recordClassIndex(88245);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ FaceStickerCommerceBean[] newArray(int i2) {
            return new FaceStickerCommerceBean[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FaceStickerCommerceBean createFromParcel(Parcel parcel) {
            return new FaceStickerCommerceBean(parcel);
        }
    };
    @c(a = "commerce_sticker_web_url")

    /* renamed from: a  reason: collision with root package name */
    public String f134970a;
    @c(a = "commerce_sticker_open_url")

    /* renamed from: b  reason: collision with root package name */
    public String f134971b;
    @c(a = "commerce_sticker_buy_text")

    /* renamed from: c  reason: collision with root package name */
    public String f134972c;
    @c(a = "commerce_sticker_type")

    /* renamed from: d  reason: collision with root package name */
    public int f134973d;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(88244);
    }

    protected FaceStickerCommerceBean(Parcel parcel) {
        this.f134970a = parcel.readString();
        this.f134971b = parcel.readString();
        this.f134972c = parcel.readString();
        this.f134973d = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f134970a);
        parcel.writeString(this.f134971b);
        parcel.writeString(this.f134972c);
        parcel.writeInt(this.f134973d);
    }
}
