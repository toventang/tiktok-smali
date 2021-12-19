package com.ss.android.ugc.aweme.ecommerce.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.l;

public final class RedirectContent implements Parcelable {
    public static final Parcelable.Creator<RedirectContent> CREATOR = new a();
    @c(a = "close_page")
    private final Boolean closePage;
    @c(a = "jump_schema")
    private final String jumpSchema;

    static {
        Covode.recordClassIndex(52848);
    }

    public static /* synthetic */ RedirectContent copy$default(RedirectContent redirectContent, String str, Boolean bool, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = redirectContent.jumpSchema;
        }
        if ((i2 & 2) != 0) {
            bool = redirectContent.closePage;
        }
        return redirectContent.copy(str, bool);
    }

    public final String component1() {
        return this.jumpSchema;
    }

    public final Boolean component2() {
        return this.closePage;
    }

    public final RedirectContent copy(String str, Boolean bool) {
        return new RedirectContent(str, bool);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RedirectContent)) {
            return false;
        }
        RedirectContent redirectContent = (RedirectContent) obj;
        return l.a(this.jumpSchema, redirectContent.jumpSchema) && l.a(this.closePage, redirectContent.closePage);
    }

    public final int hashCode() {
        String str = this.jumpSchema;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Boolean bool = this.closePage;
        if (bool != null) {
            i2 = bool.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "RedirectContent(jumpSchema=" + this.jumpSchema + ", closePage=" + this.closePage + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        boolean z;
        l.d(parcel, "");
        parcel.writeString(this.jumpSchema);
        Boolean bool = this.closePage;
        if (bool != null) {
            parcel.writeInt(1);
            z = bool.booleanValue();
        } else {
            z = false;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        parcel.writeInt(i3);
    }

    public final Boolean getClosePage() {
        return this.closePage;
    }

    public final String getJumpSchema() {
        return this.jumpSchema;
    }

    public static class a implements Parcelable.Creator<RedirectContent> {
        static {
            Covode.recordClassIndex(52849);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ RedirectContent[] newArray(int i2) {
            return new RedirectContent[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RedirectContent createFromParcel(Parcel parcel) {
            Boolean bool;
            l.d(parcel, "");
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            return new RedirectContent(readString, bool);
        }
    }

    public RedirectContent(String str, Boolean bool) {
        this.jumpSchema = str;
        this.closePage = bool;
    }
}
