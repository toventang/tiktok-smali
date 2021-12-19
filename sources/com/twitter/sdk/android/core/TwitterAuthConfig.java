package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;

public class TwitterAuthConfig implements Parcelable {
    public static final Parcelable.Creator<TwitterAuthConfig> CREATOR = new Parcelable.Creator<TwitterAuthConfig>() {
        /* class com.twitter.sdk.android.core.TwitterAuthConfig.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103581);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TwitterAuthConfig[] newArray(int i2) {
            return new TwitterAuthConfig[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TwitterAuthConfig createFromParcel(Parcel parcel) {
            return new TwitterAuthConfig(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final String f155892a;

    /* renamed from: b  reason: collision with root package name */
    public final String f155893b;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(103580);
    }

    private TwitterAuthConfig(Parcel parcel) {
        this.f155892a = parcel.readString();
        this.f155893b = parcel.readString();
    }

    private static String a(String str) {
        if (str != null) {
            return str.trim();
        }
        return null;
    }

    /* synthetic */ TwitterAuthConfig(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f155892a);
        parcel.writeString(this.f155893b);
    }

    public TwitterAuthConfig(String str, String str2) {
        if (str == null || str2 == null) {
            throw new IllegalArgumentException("TwitterAuthConfig must not be created with null consumer key or secret.");
        }
        this.f155892a = a(str);
        this.f155893b = a(str2);
    }
}
