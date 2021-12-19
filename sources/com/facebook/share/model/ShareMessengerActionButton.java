package com.facebook.share.model;

import android.os.Parcel;
import com.bytedance.covode.number.Covode;

public abstract class ShareMessengerActionButton implements ShareModel {

    /* renamed from: a  reason: collision with root package name */
    public final String f49124a;

    static {
        Covode.recordClassIndex(30713);
    }

    public int describeContents() {
        return 0;
    }

    ShareMessengerActionButton(Parcel parcel) {
        this.f49124a = parcel.readString();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f49124a);
    }
}
