package com.ss.android.ugc.aweme.setting;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.xelement.pickview.b.b;
import com.google.gson.a.c;
import h.a.z;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;
import java.util.List;

public final class EoyHighlightConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<EoyHighlightConfig> CREATOR = new a();
    @c(a = b.f37372a)
    private final String color;
    @c(a = "effect_id")
    private final String effectId;
    @c(a = "url")
    private final String hubUrl;
    @c(a = "is_eoy_campaign")
    private final boolean isEoyCampaign;
    @c(a = "text")
    private final List<String> text;

    static {
        Covode.recordClassIndex(79962);
    }

    public EoyHighlightConfig() {
        this(null, null, false, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.ss.android.ugc.aweme.setting.EoyHighlightConfig */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ EoyHighlightConfig copy$default(EoyHighlightConfig eoyHighlightConfig, List list, String str, boolean z, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            list = eoyHighlightConfig.text;
        }
        if ((i2 & 2) != 0) {
            str = eoyHighlightConfig.color;
        }
        if ((i2 & 4) != 0) {
            z = eoyHighlightConfig.isEoyCampaign;
        }
        if ((i2 & 8) != 0) {
            str2 = eoyHighlightConfig.effectId;
        }
        if ((i2 & 16) != 0) {
            str3 = eoyHighlightConfig.hubUrl;
        }
        return eoyHighlightConfig.copy(list, str, z, str2, str3);
    }

    public final List<String> component1() {
        return this.text;
    }

    public final String component2() {
        return this.color;
    }

    public final boolean component3() {
        return this.isEoyCampaign;
    }

    public final String component4() {
        return this.effectId;
    }

    public final String component5() {
        return this.hubUrl;
    }

    public final EoyHighlightConfig copy(List<String> list, String str, boolean z, String str2, String str3) {
        l.d(list, "");
        l.d(str, "");
        return new EoyHighlightConfig(list, str, z, str2, str3);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EoyHighlightConfig)) {
            return false;
        }
        EoyHighlightConfig eoyHighlightConfig = (EoyHighlightConfig) obj;
        return l.a(this.text, eoyHighlightConfig.text) && l.a(this.color, eoyHighlightConfig.color) && this.isEoyCampaign == eoyHighlightConfig.isEoyCampaign && l.a(this.effectId, eoyHighlightConfig.effectId) && l.a(this.hubUrl, eoyHighlightConfig.hubUrl);
    }

    public final int hashCode() {
        List<String> list = this.text;
        int i2 = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.color;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        boolean z = this.isEoyCampaign;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode2 + i3) * 31;
        String str2 = this.effectId;
        int hashCode3 = (i6 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.hubUrl;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        return "EoyHighlightConfig(text=" + this.text + ", color=" + this.color + ", isEoyCampaign=" + this.isEoyCampaign + ", effectId=" + this.effectId + ", hubUrl=" + this.hubUrl + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeStringList(this.text);
        parcel.writeString(this.color);
        parcel.writeInt(this.isEoyCampaign ? 1 : 0);
        parcel.writeString(this.effectId);
        parcel.writeString(this.hubUrl);
    }

    public final String getColor() {
        return this.color;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final String getHubUrl() {
        return this.hubUrl;
    }

    public final List<String> getText() {
        return this.text;
    }

    public final boolean isEoyCampaign() {
        return this.isEoyCampaign;
    }

    public static class a implements Parcelable.Creator<EoyHighlightConfig> {
        static {
            Covode.recordClassIndex(79963);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ EoyHighlightConfig[] newArray(int i2) {
            return new EoyHighlightConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ EoyHighlightConfig createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new EoyHighlightConfig(parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }
    }

    public EoyHighlightConfig(List<String> list, String str, boolean z, String str2, String str3) {
        l.d(list, "");
        l.d(str, "");
        this.text = list;
        this.color = str;
        this.isEoyCampaign = z;
        this.effectId = str2;
        this.hubUrl = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EoyHighlightConfig(List list, String str, boolean z, String str2, String str3, int i2, g gVar) {
        this((i2 & 1) != 0 ? z.INSTANCE : list, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : str2, (i2 & 16) == 0 ? str3 : null);
    }
}
