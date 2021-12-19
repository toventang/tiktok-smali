package com.ss.android.ugc.aweme.shortvideo.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import h.f.b.g;
import h.f.b.l;
import java.io.Serializable;

public final class ShootExtraData implements Parcelable, Serializable {
    public static final Parcelable.Creator<ShootExtraData> CREATOR = new Creator();
    @c(a = "from_banner_id")
    private String fromBannerId;
    @c(a = "is_bundled")
    private Integer isBundled;
    @c(a = "shoot_enter_from")
    private String shootEnterFrom;

    public static class Creator implements Parcelable.Creator<ShootExtraData> {
        static {
            Covode.recordClassIndex(84478);
        }

        @Override // android.os.Parcelable.Creator
        public final ShootExtraData createFromParcel(Parcel parcel) {
            l.d(parcel, "");
            return new ShootExtraData(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final ShootExtraData[] newArray(int i2) {
            return new ShootExtraData[i2];
        }
    }

    static {
        Covode.recordClassIndex(84477);
    }

    public ShootExtraData() {
        this(null, null, null, 7, null);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i2) {
        int i3;
        l.d(parcel, "");
        parcel.writeString(this.shootEnterFrom);
        parcel.writeString(this.fromBannerId);
        Integer num = this.isBundled;
        if (num != null) {
            parcel.writeInt(1);
            i3 = num.intValue();
        } else {
            i3 = 0;
        }
        parcel.writeInt(i3);
    }

    public final String getFromBannerId() {
        return this.fromBannerId;
    }

    public final String getShootEnterFrom() {
        return this.shootEnterFrom;
    }

    public final Integer isBundled() {
        return this.isBundled;
    }

    public final void setBundled(Integer num) {
        this.isBundled = num;
    }

    public final void setFromBannerId(String str) {
        this.fromBannerId = str;
    }

    public final void setShootEnterFrom(String str) {
        this.shootEnterFrom = str;
    }

    public ShootExtraData(String str, String str2, Integer num) {
        this.shootEnterFrom = str;
        this.fromBannerId = str2;
        this.isBundled = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShootExtraData(String str, String str2, Integer num, int i2, g gVar) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 0 : num);
    }
}
