package com.ss.android.ugc.aweme.mvtheme;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class MvNetFileBean implements Parcelable, Serializable {
    public static final Parcelable.Creator<MvNetFileBean> CREATOR = new a();
    @c(a = "algorithm")
    private final String algorithm;
    @c(a = "filePath")
    private final String filePath;
    @c(a = "jsonParams")
    private final String jsonParams;
    @c(a = "photo_path")
    private final String photonPath;

    static {
        Covode.recordClassIndex(72094);
    }

    public static /* synthetic */ MvNetFileBean copy$default(MvNetFileBean mvNetFileBean, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = mvNetFileBean.photonPath;
        }
        if ((i2 & 2) != 0) {
            str2 = mvNetFileBean.algorithm;
        }
        if ((i2 & 4) != 0) {
            str3 = mvNetFileBean.filePath;
        }
        if ((i2 & 8) != 0) {
            str4 = mvNetFileBean.jsonParams;
        }
        return mvNetFileBean.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.photonPath;
    }

    public final String component2() {
        return this.algorithm;
    }

    public final String component3() {
        return this.filePath;
    }

    public final String component4() {
        return this.jsonParams;
    }

    public final MvNetFileBean copy(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        return new MvNetFileBean(str, str2, str3, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MvNetFileBean)) {
            return false;
        }
        MvNetFileBean mvNetFileBean = (MvNetFileBean) obj;
        return l.a(this.photonPath, mvNetFileBean.photonPath) && l.a(this.algorithm, mvNetFileBean.algorithm) && l.a(this.filePath, mvNetFileBean.filePath) && l.a(this.jsonParams, mvNetFileBean.jsonParams);
    }

    public final int hashCode() {
        String str = this.photonPath;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.algorithm;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.filePath;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.jsonParams;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "MvNetFileBean(photonPath=" + this.photonPath + ", algorithm=" + this.algorithm + ", filePath=" + this.filePath + ", jsonParams=" + this.jsonParams + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.photonPath);
        parcel.writeString(this.algorithm);
        parcel.writeString(this.filePath);
        parcel.writeString(this.jsonParams);
    }

    public final String getAlgorithm() {
        return this.algorithm;
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public final String getJsonParams() {
        return this.jsonParams;
    }

    public final String getPhotonPath() {
        return this.photonPath;
    }

    public static class a implements Parcelable.Creator<MvNetFileBean> {
        static {
            Covode.recordClassIndex(72095);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ MvNetFileBean[] newArray(int i2) {
            return new MvNetFileBean[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MvNetFileBean createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new MvNetFileBean(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public MvNetFileBean(String str, String str2, String str3, String str4) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.photonPath = str;
        this.algorithm = str2;
        this.filePath = str3;
        this.jsonParams = str4;
    }
}
