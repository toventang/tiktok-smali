package com.twitter.sdk.android.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class TwitterAuthToken extends a implements Parcelable {
    public static final Parcelable.Creator<TwitterAuthToken> CREATOR = new Parcelable.Creator<TwitterAuthToken>() {
        /* class com.twitter.sdk.android.core.TwitterAuthToken.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103583);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ TwitterAuthToken[] newArray(int i2) {
            return new TwitterAuthToken[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TwitterAuthToken createFromParcel(Parcel parcel) {
            return new TwitterAuthToken(parcel, (byte) 0);
        }
    };
    @c(a = "token")

    /* renamed from: b  reason: collision with root package name */
    public final String f155894b;
    @c(a = "secret")

    /* renamed from: c  reason: collision with root package name */
    public final String f155895c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(103582);
    }

    public int hashCode() {
        int i2;
        String str = this.f155894b;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        String str2 = this.f155895c;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    public String toString() {
        return "token=" + this.f155894b + ",secret=" + this.f155895c;
    }

    private TwitterAuthToken(Parcel parcel) {
        this.f155894b = parcel.readString();
        this.f155895c = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TwitterAuthToken)) {
            return false;
        }
        TwitterAuthToken twitterAuthToken = (TwitterAuthToken) obj;
        String str = this.f155895c;
        if (str == null ? twitterAuthToken.f155895c != null : !str.equals(twitterAuthToken.f155895c)) {
            return false;
        }
        String str2 = this.f155894b;
        String str3 = twitterAuthToken.f155894b;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    /* synthetic */ TwitterAuthToken(Parcel parcel, byte b2) {
        this(parcel);
    }

    public TwitterAuthToken(String str, String str2) {
        this.f155894b = str;
        this.f155895c = str2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f155894b);
        parcel.writeString(this.f155895c);
    }
}
