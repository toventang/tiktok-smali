package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class SimpleEffect implements Parcelable, Serializable {
    public static final Parcelable.Creator<SimpleEffect> CREATOR = new Creator();
    private final String designerUid;
    private final String extra;
    private final UrlModel iconUrl;
    private final String name;

    public static class Creator implements Parcelable.Creator<SimpleEffect> {
        static {
            Covode.recordClassIndex(84482);
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleEffect createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new SimpleEffect((UrlModel) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SimpleEffect[] newArray(int i2) {
            return new SimpleEffect[i2];
        }
    }

    static {
        Covode.recordClassIndex(84481);
    }

    public static /* synthetic */ SimpleEffect copy$default(SimpleEffect simpleEffect, UrlModel urlModel, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            urlModel = simpleEffect.iconUrl;
        }
        if ((i2 & 2) != 0) {
            str = simpleEffect.name;
        }
        if ((i2 & 4) != 0) {
            str2 = simpleEffect.extra;
        }
        if ((i2 & 8) != 0) {
            str3 = simpleEffect.designerUid;
        }
        return simpleEffect.copy(urlModel, str, str2, str3);
    }

    public final UrlModel component1() {
        return this.iconUrl;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.extra;
    }

    public final String component4() {
        return this.designerUid;
    }

    public final SimpleEffect copy(UrlModel urlModel, String str, String str2, String str3) {
        l.d(urlModel, "");
        l.d(str, "");
        return new SimpleEffect(urlModel, str, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SimpleEffect)) {
            return false;
        }
        SimpleEffect simpleEffect = (SimpleEffect) obj;
        return l.a(this.iconUrl, simpleEffect.iconUrl) && l.a(this.name, simpleEffect.name) && l.a(this.extra, simpleEffect.extra) && l.a(this.designerUid, simpleEffect.designerUid);
    }

    public final int hashCode() {
        UrlModel urlModel = this.iconUrl;
        int i2 = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.extra;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.designerUid;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "SimpleEffect(iconUrl=" + this.iconUrl + ", name=" + this.name + ", extra=" + this.extra + ", designerUid=" + this.designerUid + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeSerializable(this.iconUrl);
        parcel.writeString(this.name);
        parcel.writeString(this.extra);
        parcel.writeString(this.designerUid);
    }

    public final String getDesignerUid() {
        return this.designerUid;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getName() {
        return this.name;
    }

    public SimpleEffect(UrlModel urlModel, String str, String str2, String str3) {
        l.d(urlModel, "");
        l.d(str, "");
        this.iconUrl = urlModel;
        this.name = str;
        this.extra = str2;
        this.designerUid = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleEffect(UrlModel urlModel, String str, String str2, String str3, int i2, g gVar) {
        this(urlModel, str, str2, (i2 & 8) != 0 ? null : str3);
    }
}
