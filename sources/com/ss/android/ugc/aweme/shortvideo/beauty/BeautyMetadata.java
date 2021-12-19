package com.ss.android.ugc.aweme.shortvideo.beauty;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class BeautyMetadata implements Parcelable, Serializable {
    public static final a CREATOR = new a((byte) 0);
    @c(a = "te_record_beauty_id")
    private String beautyId;
    @c(a = "te_record_beauty_name")
    private String beautyName;
    @c(a = "te_record_beauty_res")
    private String beautyRes;
    @c(a = "te_record_beauty_strength")
    private String beautyStrength;
    @c(a = "te_record_beauty_res_valid")
    private String beautyValid;

    static {
        Covode.recordClassIndex(82112);
    }

    public final int describeContents() {
        return 0;
    }

    public static final class a implements Parcelable.Creator<BeautyMetadata> {
        static {
            Covode.recordClassIndex(82113);
        }

        private a() {
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BeautyMetadata[] newArray(int i2) {
            return new BeautyMetadata[i2];
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BeautyMetadata createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new BeautyMetadata(parcel);
        }
    }

    public final String getBeautyId() {
        return this.beautyId;
    }

    public final String getBeautyName() {
        return this.beautyName;
    }

    public final String getBeautyRes() {
        return this.beautyRes;
    }

    public final String getBeautyStrength() {
        return this.beautyStrength;
    }

    public final String getBeautyValid() {
        return this.beautyValid;
    }

    public BeautyMetadata() {
        this.beautyName = "";
        this.beautyStrength = "";
        this.beautyId = "";
        this.beautyRes = "";
        this.beautyValid = "";
    }

    public final String toString() {
        return "BeautyMetadata:id=" + this.beautyId + ",name=" + this.beautyName + ",strength=" + this.beautyStrength + ",res=" + this.beautyRes + ",valid=" + this.beautyValid;
    }

    public final void setBeautyId(String str) {
        l.d(str, "");
        this.beautyId = str;
    }

    public final void setBeautyName(String str) {
        l.d(str, "");
        this.beautyName = str;
    }

    public final void setBeautyRes(String str) {
        l.d(str, "");
        this.beautyRes = str;
    }

    public final void setBeautyStrength(String str) {
        l.d(str, "");
        this.beautyStrength = str;
    }

    public final void setBeautyValid(String str) {
        l.d(str, "");
        this.beautyValid = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BeautyMetadata(Parcel parcel) {
        this();
        String str = "";
        l.d(parcel, str);
        String readString = parcel.readString();
        this.beautyName = readString == null ? str : readString;
        String readString2 = parcel.readString();
        this.beautyStrength = readString2 == null ? str : readString2;
        String readString3 = parcel.readString();
        this.beautyId = readString3 == null ? str : readString3;
        String readString4 = parcel.readString();
        this.beautyRes = readString4 == null ? str : readString4;
        String readString5 = parcel.readString();
        this.beautyValid = readString5 != null ? readString5 : str;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        if (parcel != null) {
            parcel.writeString(this.beautyName);
            parcel.writeString(this.beautyStrength);
            parcel.writeString(this.beautyId);
            parcel.writeString(this.beautyRes);
            parcel.writeString(this.beautyValid);
        }
    }
}
