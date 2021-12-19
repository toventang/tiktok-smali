package com.ss.android.ugc.aweme.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;

public class NewUserCount extends BaseResponse implements Parcelable {
    public static final Parcelable.Creator<NewUserCount> CREATOR = new Parcelable.Creator<NewUserCount>() {
        /* class com.ss.android.ugc.aweme.profile.model.NewUserCount.AnonymousClass1 */

        static {
            Covode.recordClassIndex(75244);
        }

        @Override // android.os.Parcelable.Creator
        public final NewUserCount[] newArray(int i2) {
            return new NewUserCount[i2];
        }

        @Override // android.os.Parcelable.Creator
        public final NewUserCount createFromParcel(Parcel parcel) {
            return new NewUserCount(parcel);
        }
    };
    public int count;

    public int describeContents() {
        return 0;
    }

    public NewUserCount() {
    }

    static {
        Covode.recordClassIndex(75243);
    }

    public NewUserCount(int i2) {
        this.count = i2;
    }

    protected NewUserCount(Parcel parcel) {
        this.count = parcel.readInt();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.count);
    }
}
