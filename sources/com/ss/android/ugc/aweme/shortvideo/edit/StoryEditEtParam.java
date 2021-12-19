package com.ss.android.ugc.aweme.shortvideo.edit;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.io.Serializable;

public final class StoryEditEtParam implements Parcelable, Serializable {
    public static final Parcelable.Creator<StoryEditEtParam> CREATOR = new a();
    private final int clipCount;
    private final String contentSource;
    private final String contentType;
    private final boolean isMultiContent;
    private final String shootPage;
    private final String shootTabName;

    static {
        Covode.recordClassIndex(83111);
    }

    public static int com_ss_android_ugc_aweme_shortvideo_edit_StoryEditEtParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(int i2) {
        return i2;
    }

    public static /* synthetic */ StoryEditEtParam copy$default(StoryEditEtParam storyEditEtParam, String str, String str2, String str3, String str4, boolean z, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = storyEditEtParam.shootPage;
        }
        if ((i3 & 2) != 0) {
            str2 = storyEditEtParam.shootTabName;
        }
        if ((i3 & 4) != 0) {
            str3 = storyEditEtParam.contentSource;
        }
        if ((i3 & 8) != 0) {
            str4 = storyEditEtParam.contentType;
        }
        if ((i3 & 16) != 0) {
            z = storyEditEtParam.isMultiContent;
        }
        if ((i3 & 32) != 0) {
            i2 = storyEditEtParam.clipCount;
        }
        return storyEditEtParam.copy(str, str2, str3, str4, z, i2);
    }

    public final String component1() {
        return this.shootPage;
    }

    public final String component2() {
        return this.shootTabName;
    }

    public final String component3() {
        return this.contentSource;
    }

    public final String component4() {
        return this.contentType;
    }

    public final boolean component5() {
        return this.isMultiContent;
    }

    public final int component6() {
        return this.clipCount;
    }

    public final StoryEditEtParam copy(String str, String str2, String str3, String str4, boolean z, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        return new StoryEditEtParam(str, str2, str3, str4, z, i2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StoryEditEtParam)) {
            return false;
        }
        StoryEditEtParam storyEditEtParam = (StoryEditEtParam) obj;
        return l.a(this.shootPage, storyEditEtParam.shootPage) && l.a(this.shootTabName, storyEditEtParam.shootTabName) && l.a(this.contentSource, storyEditEtParam.contentSource) && l.a(this.contentType, storyEditEtParam.contentType) && this.isMultiContent == storyEditEtParam.isMultiContent && this.clipCount == storyEditEtParam.clipCount;
    }

    public final int hashCode() {
        String str = this.shootPage;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.shootTabName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.contentSource;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.contentType;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        int i3 = (hashCode3 + i2) * 31;
        boolean z = this.isMultiContent;
        if (z) {
            z = true;
        }
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = z ? 1 : 0;
        return ((i3 + i4) * 31) + com_ss_android_ugc_aweme_shortvideo_edit_StoryEditEtParam_com_ss_android_ugc_aweme_lancet_HashCodeLancet_hashCode(this.clipCount);
    }

    public final String toString() {
        return "StoryEditEtParam(shootPage=" + this.shootPage + ", shootTabName=" + this.shootTabName + ", contentSource=" + this.contentSource + ", contentType=" + this.contentType + ", isMultiContent=" + this.isMultiContent + ", clipCount=" + this.clipCount + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.shootPage);
        parcel.writeString(this.shootTabName);
        parcel.writeString(this.contentSource);
        parcel.writeString(this.contentType);
        parcel.writeInt(this.isMultiContent ? 1 : 0);
        parcel.writeInt(this.clipCount);
    }

    public final int getClipCount() {
        return this.clipCount;
    }

    public final String getContentSource() {
        return this.contentSource;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final String getShootPage() {
        return this.shootPage;
    }

    public final String getShootTabName() {
        return this.shootTabName;
    }

    public final boolean isMultiContent() {
        return this.isMultiContent;
    }

    public static class a implements Parcelable.Creator<StoryEditEtParam> {
        static {
            Covode.recordClassIndex(83112);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ StoryEditEtParam[] newArray(int i2) {
            return new StoryEditEtParam[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StoryEditEtParam createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new StoryEditEtParam(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt());
        }
    }

    public StoryEditEtParam(String str, String str2, String str3, String str4, boolean z, int i2) {
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        l.d(str4, "");
        this.shootPage = str;
        this.shootTabName = str2;
        this.contentSource = str3;
        this.contentType = str4;
        this.isMultiContent = z;
        this.clipCount = i2;
    }
}
