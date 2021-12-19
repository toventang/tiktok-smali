package com.ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;

public class ShopOrderShareStructInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<ShopOrderShareStructInfo> CREATOR = new Parcelable.Creator<ShopOrderShareStructInfo>() {
        /* class com.ss.android.ugc.aweme.shortvideo.edit.ShopOrderShareStructInfo.AnonymousClass1 */

        static {
            Covode.recordClassIndex(83110);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShopOrderShareStructInfo[] newArray(int i2) {
            return new ShopOrderShareStructInfo[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShopOrderShareStructInfo createFromParcel(Parcel parcel) {
            return new ShopOrderShareStructInfo(parcel);
        }
    };
    ShopOrderShareStruct shopOrderShareStruct;
    String title;

    public int describeContents() {
        return 0;
    }

    public ShopOrderShareStructInfo() {
    }

    public ShopOrderShareStruct getShopOrderShareStruct() {
        return this.shopOrderShareStruct;
    }

    public String getTitle() {
        return this.title;
    }

    static {
        Covode.recordClassIndex(83109);
    }

    public void setShopOrderShareStruct(ShopOrderShareStruct shopOrderShareStruct2) {
        this.shopOrderShareStruct = shopOrderShareStruct2;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    protected ShopOrderShareStructInfo(Parcel parcel) {
        this.shopOrderShareStruct = (ShopOrderShareStruct) parcel.readParcelable(ShopOrderShareStruct.class.getClassLoader());
        this.title = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.shopOrderShareStruct, i2);
        parcel.writeString(this.title);
    }
}
