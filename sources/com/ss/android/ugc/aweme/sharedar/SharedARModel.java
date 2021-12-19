package com.ss.android.ugc.aweme.sharedar;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class SharedARModel implements Parcelable, Serializable {
    public static final Parcelable.Creator<SharedARModel> CREATOR = new a();
    @c(a = "is_current_user_host")
    private boolean isCurrentUserHost;
    @c(a = "shared_ar_multi_player_user_id")
    private String sharedARMultiPlayerUserId;
    @c(a = "shared_ar_multi_player_user_name")
    private String sharedARMultiPlayerUserName;
    @c(a = "shared_ar_session_id")
    private String sharedARSessionId;
    @c(a = "shared_ar_telco")
    private String sharedARTelco;

    static {
        Covode.recordClassIndex(81699);
    }

    public SharedARModel() {
        this(null, null, null, false, null, 31, null);
    }

    public static /* synthetic */ SharedARModel copy$default(SharedARModel sharedARModel, String str, String str2, String str3, boolean z, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = sharedARModel.sharedARMultiPlayerUserId;
        }
        if ((i2 & 2) != 0) {
            str2 = sharedARModel.sharedARMultiPlayerUserName;
        }
        if ((i2 & 4) != 0) {
            str3 = sharedARModel.sharedARSessionId;
        }
        if ((i2 & 8) != 0) {
            z = sharedARModel.isCurrentUserHost;
        }
        if ((i2 & 16) != 0) {
            str4 = sharedARModel.sharedARTelco;
        }
        return sharedARModel.copy(str, str2, str3, z, str4);
    }

    public final String component1() {
        return this.sharedARMultiPlayerUserId;
    }

    public final String component2() {
        return this.sharedARMultiPlayerUserName;
    }

    public final String component3() {
        return this.sharedARSessionId;
    }

    public final boolean component4() {
        return this.isCurrentUserHost;
    }

    public final String component5() {
        return this.sharedARTelco;
    }

    public final SharedARModel copy(String str, String str2, String str3, boolean z, String str4) {
        return new SharedARModel(str, str2, str3, z, str4);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SharedARModel)) {
            return false;
        }
        SharedARModel sharedARModel = (SharedARModel) obj;
        return l.a(this.sharedARMultiPlayerUserId, sharedARModel.sharedARMultiPlayerUserId) && l.a(this.sharedARMultiPlayerUserName, sharedARModel.sharedARMultiPlayerUserName) && l.a(this.sharedARSessionId, sharedARModel.sharedARSessionId) && this.isCurrentUserHost == sharedARModel.isCurrentUserHost && l.a(this.sharedARTelco, sharedARModel.sharedARTelco);
    }

    public final int hashCode() {
        String str = this.sharedARMultiPlayerUserId;
        int i2 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sharedARMultiPlayerUserName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.sharedARSessionId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        boolean z = this.isCurrentUserHost;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode3 + i3) * 31;
        String str4 = this.sharedARTelco;
        if (str4 != null) {
            i2 = str4.hashCode();
        }
        return i6 + i2;
    }

    public final String toString() {
        return "SharedARModel(sharedARMultiPlayerUserId=" + this.sharedARMultiPlayerUserId + ", sharedARMultiPlayerUserName=" + this.sharedARMultiPlayerUserName + ", sharedARSessionId=" + this.sharedARSessionId + ", isCurrentUserHost=" + this.isCurrentUserHost + ", sharedARTelco=" + this.sharedARTelco + ")";
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        l.d(parcel, "");
        parcel.writeString(this.sharedARMultiPlayerUserId);
        parcel.writeString(this.sharedARMultiPlayerUserName);
        parcel.writeString(this.sharedARSessionId);
        parcel.writeInt(this.isCurrentUserHost ? 1 : 0);
        parcel.writeString(this.sharedARTelco);
    }

    public final String getSharedARMultiPlayerUserId() {
        return this.sharedARMultiPlayerUserId;
    }

    public final String getSharedARMultiPlayerUserName() {
        return this.sharedARMultiPlayerUserName;
    }

    public final String getSharedARSessionId() {
        return this.sharedARSessionId;
    }

    public final String getSharedARTelco() {
        return this.sharedARTelco;
    }

    public final boolean isCurrentUserHost() {
        return this.isCurrentUserHost;
    }

    public static class a implements Parcelable.Creator<SharedARModel> {
        static {
            Covode.recordClassIndex(81700);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ SharedARModel[] newArray(int i2) {
            return new SharedARModel[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SharedARModel createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new SharedARModel(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }
    }

    public final void setCurrentUserHost(boolean z) {
        this.isCurrentUserHost = z;
    }

    public final void setSharedARMultiPlayerUserId(String str) {
        this.sharedARMultiPlayerUserId = str;
    }

    public final void setSharedARMultiPlayerUserName(String str) {
        this.sharedARMultiPlayerUserName = str;
    }

    public final void setSharedARSessionId(String str) {
        this.sharedARSessionId = str;
    }

    public final void setSharedARTelco(String str) {
        this.sharedARTelco = str;
    }

    public SharedARModel(String str, String str2, String str3, boolean z, String str4) {
        this.sharedARMultiPlayerUserId = str;
        this.sharedARMultiPlayerUserName = str2;
        this.sharedARSessionId = str3;
        this.isCurrentUserHost = z;
        this.sharedARTelco = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SharedARModel(String str, String str2, String str3, boolean z, String str4, int i2, g gVar) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? false : z, (i2 & 16) == 0 ? str4 : null);
    }
}
