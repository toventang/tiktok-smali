package com.ss.android.ugc.aweme.live.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class LiveVerifyChecklist implements Parcelable {
    public static final Parcelable.Creator<LiveVerifyChecklist> CREATOR = new Parcelable.Creator<LiveVerifyChecklist>() {
        /* class com.ss.android.ugc.aweme.live.model.LiveVerifyChecklist.AnonymousClass1 */

        static {
            Covode.recordClassIndex(69547);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ LiveVerifyChecklist[] newArray(int i2) {
            return new LiveVerifyChecklist[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ LiveVerifyChecklist createFromParcel(Parcel parcel) {
            return new LiveVerifyChecklist(parcel);
        }
    };
    public boolean is_phone_binded;
    public boolean live_agreement;
    public boolean live_answer = true;
    public int realname_verify;

    public int describeContents() {
        return 0;
    }

    public LiveVerifyChecklist() {
    }

    static {
        Covode.recordClassIndex(69546);
    }

    protected LiveVerifyChecklist(Parcel parcel) {
        boolean z;
        boolean z2 = true;
        this.realname_verify = parcel.readInt();
        if (parcel.readByte() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.is_phone_binded = z;
        this.live_agreement = parcel.readByte() == 0 ? false : z2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.realname_verify);
        parcel.writeByte(this.is_phone_binded ? (byte) 1 : 0);
        parcel.writeByte(this.live_agreement ? (byte) 1 : 0);
    }
}
