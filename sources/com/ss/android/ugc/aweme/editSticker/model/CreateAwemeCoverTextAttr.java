package com.ss.android.ugc.aweme.editSticker.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;
import java.io.Serializable;

public final class CreateAwemeCoverTextAttr implements Parcelable, Serializable {
    public static final Parcelable.Creator<CreateAwemeCoverTextAttr> CREATOR = new a();
    @c(a = "cover_text_font")
    private final String coverTextFont;
    @c(a = "cover_text_id")
    private final String coverTextId;
    @c(a = "cover_text_color")
    private final String covertTextColor;

    static {
        Covode.recordClassIndex(55463);
    }

    public static /* synthetic */ CreateAwemeCoverTextAttr copy$default(CreateAwemeCoverTextAttr createAwemeCoverTextAttr, String str, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = createAwemeCoverTextAttr.coverTextId;
        }
        if ((i2 & 2) != 0) {
            str2 = createAwemeCoverTextAttr.coverTextFont;
        }
        if ((i2 & 4) != 0) {
            str3 = createAwemeCoverTextAttr.covertTextColor;
        }
        return createAwemeCoverTextAttr.copy(str, str2, str3);
    }

    public final String component1() {
        return this.coverTextId;
    }

    public final String component2() {
        return this.coverTextFont;
    }

    public final String component3() {
        return this.covertTextColor;
    }

    public final CreateAwemeCoverTextAttr copy(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        return new CreateAwemeCoverTextAttr(str, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CreateAwemeCoverTextAttr)) {
            return false;
        }
        CreateAwemeCoverTextAttr createAwemeCoverTextAttr = (CreateAwemeCoverTextAttr) obj;
        return l.a(this.coverTextId, createAwemeCoverTextAttr.coverTextId) && l.a(this.coverTextFont, createAwemeCoverTextAttr.coverTextFont) && l.a(this.covertTextColor, createAwemeCoverTextAttr.covertTextColor);
    }

    public final int hashCode() {
        String str = this.coverTextId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.coverTextFont;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.covertTextColor;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode2 + i2;
    }

    public final String toString() {
        return "CreateAwemeCoverTextAttr(coverTextId=" + this.coverTextId + ", coverTextFont=" + this.coverTextFont + ", covertTextColor=" + this.covertTextColor + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.coverTextId);
        parcel.writeString(this.coverTextFont);
        parcel.writeString(this.covertTextColor);
    }

    public final String getCoverTextFont() {
        return this.coverTextFont;
    }

    public final String getCoverTextId() {
        return this.coverTextId;
    }

    public final String getCovertTextColor() {
        return this.covertTextColor;
    }

    public static class a implements Parcelable.Creator<CreateAwemeCoverTextAttr> {
        static {
            Covode.recordClassIndex(55464);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ CreateAwemeCoverTextAttr[] newArray(int i2) {
            return new CreateAwemeCoverTextAttr[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CreateAwemeCoverTextAttr createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new CreateAwemeCoverTextAttr(parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    public CreateAwemeCoverTextAttr(String str, String str2, String str3) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        this.coverTextId = str;
        this.coverTextFont = str2;
        this.covertTextColor = str3;
    }
}
