package com.ss.android.ugc.aweme.deeplink;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.annotation.IRouteArg;
import com.bytedance.router.arg.RouteArgExtension;
import com.bytedance.router.arg.RouteParser;
import h.f.b.g;
import h.f.b.l;

public final class UpdateTipsArgs implements IRouteArg {
    public static final Parcelable.Creator<UpdateTipsArgs> CREATOR = new b();
    public static final a Companion = new a((byte) 0);
    private String urlToGo;
    private String versionRequire;

    static {
        Covode.recordClassIndex(49322);
    }

    public UpdateTipsArgs() {
        this(null, null, 3, null);
    }

    public static UpdateTipsArgs __fromBundle(Bundle bundle) {
        String str;
        String str2;
        if (bundle == null) {
            return null;
        }
        int i2 = 0;
        if (bundle.containsKey("debug_url")) {
            str = (String) RouteParser.INSTANCE.parse(bundle.get("debug_url"), String.class);
        } else {
            i2 = 1;
            str = null;
        }
        if (bundle.containsKey("version_required")) {
            str2 = (String) RouteParser.INSTANCE.parse(bundle.get("version_required"), String.class);
        } else {
            i2 += 2;
            str2 = null;
        }
        return new UpdateTipsArgs(str, str2, i2, null);
    }

    public static /* synthetic */ UpdateTipsArgs copy$default(UpdateTipsArgs updateTipsArgs, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = updateTipsArgs.urlToGo;
        }
        if ((i2 & 2) != 0) {
            str2 = updateTipsArgs.versionRequire;
        }
        return updateTipsArgs.copy(str, str2);
    }

    public final String component1() {
        return this.urlToGo;
    }

    public final String component2() {
        return this.versionRequire;
    }

    public final UpdateTipsArgs copy(String str, String str2) {
        return new UpdateTipsArgs(str, str2);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateTipsArgs)) {
            return false;
        }
        UpdateTipsArgs updateTipsArgs = (UpdateTipsArgs) obj;
        return l.a(this.urlToGo, updateTipsArgs.urlToGo) && l.a(this.versionRequire, updateTipsArgs.versionRequire);
    }

    public final int hashCode() {
        String str = this.urlToGo;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.versionRequire;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        return "UpdateTipsArgs(urlToGo=" + this.urlToGo + ", versionRequire=" + this.versionRequire + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.urlToGo);
        parcel.writeString(this.versionRequire);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49323);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final String getUrlToGo() {
        return this.urlToGo;
    }

    public final String getVersionRequire() {
        return this.versionRequire;
    }

    public static class b implements Parcelable.Creator<UpdateTipsArgs> {
        static {
            Covode.recordClassIndex(49324);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ UpdateTipsArgs[] newArray(int i2) {
            return new UpdateTipsArgs[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UpdateTipsArgs createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new UpdateTipsArgs(parcel.readString(), parcel.readString());
        }
    }

    public final void setUrlToGo(String str) {
        this.urlToGo = str;
    }

    public final void setVersionRequire(String str) {
        this.versionRequire = str;
    }

    public static final UpdateTipsArgs getOrNew(Activity activity) {
        l.d(activity, "");
        UpdateTipsArgs updateTipsArgs = (UpdateTipsArgs) RouteArgExtension.INSTANCE.navArg(activity).getValue();
        if (updateTipsArgs == null) {
            return new UpdateTipsArgs(null, null, 3, null);
        }
        return updateTipsArgs;
    }

    public UpdateTipsArgs(String str, String str2) {
        this.urlToGo = str;
        this.versionRequire = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateTipsArgs(String str, String str2, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2);
    }
}
