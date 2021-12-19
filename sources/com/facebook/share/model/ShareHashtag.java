package com.facebook.share.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class ShareHashtag implements ShareModel {
    public static final Parcelable.Creator<ShareHashtag> CREATOR = new Parcelable.Creator<ShareHashtag>() {
        /* class com.facebook.share.model.ShareHashtag.AnonymousClass1 */

        static {
            Covode.recordClassIndex(30703);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ShareHashtag[] newArray(int i2) {
            return new ShareHashtag[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ShareHashtag createFromParcel(Parcel parcel) {
            return new ShareHashtag(parcel);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f49109a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public String f49110a;

        static {
            Covode.recordClassIndex(30704);
        }
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(30702);
    }

    private ShareHashtag(a aVar) {
        this.f49109a = aVar.f49110a;
    }

    ShareHashtag(Parcel parcel) {
        this.f49109a = parcel.readString();
    }

    /* synthetic */ ShareHashtag(a aVar, byte b2) {
        this(aVar);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f49109a);
    }
}
