package com.ss.android.ugc.aweme.i18n.musically.cut;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteParser;
import h.f.b.g;
import h.f.b.l;

public final class AvatarCutActivityArgs implements IRouteArg {
    public static final Parcelable.Creator<AvatarCutActivityArgs> CREATOR = new a();
    private String filePath;

    static {
        Covode.recordClassIndex(63650);
    }

    public AvatarCutActivityArgs() {
        this(null, 1, null);
    }

    public static AvatarCutActivityArgs __fromBundle(Bundle bundle) {
        String str;
        if (bundle == null) {
            return null;
        }
        int i2 = 0;
        if (bundle.containsKey("file_path")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("file_path"), String.class);
        } else {
            i2 = 1;
            str = null;
        }
        return new AvatarCutActivityArgs(str, i2, null);
    }

    public static /* synthetic */ AvatarCutActivityArgs copy$default(AvatarCutActivityArgs avatarCutActivityArgs, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = avatarCutActivityArgs.filePath;
        }
        return avatarCutActivityArgs.copy(str);
    }

    public final String component1() {
        return this.filePath;
    }

    public final AvatarCutActivityArgs copy(String str) {
        return new AvatarCutActivityArgs(str);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof AvatarCutActivityArgs) && l.a(this.filePath, ((AvatarCutActivityArgs) obj).filePath);
        }
        return true;
    }

    public final int hashCode() {
        String str = this.filePath;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        return "AvatarCutActivityArgs(filePath=" + this.filePath + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.filePath);
    }

    public final String getFilePath() {
        return this.filePath;
    }

    public static class a implements Parcelable.Creator<AvatarCutActivityArgs> {
        static {
            Covode.recordClassIndex(63651);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ AvatarCutActivityArgs[] newArray(int i2) {
            return new AvatarCutActivityArgs[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AvatarCutActivityArgs createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new AvatarCutActivityArgs(parcel.readString());
        }
    }

    public final void setFilePath(String str) {
        this.filePath = str;
    }

    public AvatarCutActivityArgs(String str) {
        this.filePath = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarCutActivityArgs(String str, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str);
    }
}
