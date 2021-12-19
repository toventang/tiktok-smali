package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.TwitterAuthToken;

public class OAuthResponse implements Parcelable {
    public static final Parcelable.Creator<OAuthResponse> CREATOR = new Parcelable.Creator<OAuthResponse>() {
        /* class com.twitter.sdk.android.core.internal.oauth.OAuthResponse.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103655);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OAuthResponse[] newArray(int i2) {
            return new OAuthResponse[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OAuthResponse createFromParcel(Parcel parcel) {
            return new OAuthResponse(parcel, (byte) 0);
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final TwitterAuthToken f156005a;

    /* renamed from: b  reason: collision with root package name */
    public final String f156006b;

    /* renamed from: c  reason: collision with root package name */
    public final long f156007c;

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(103654);
    }

    public String toString() {
        return "authToken=" + this.f156005a + ",userName=" + this.f156006b + ",userId=" + this.f156007c;
    }

    private OAuthResponse(Parcel parcel) {
        this.f156005a = (TwitterAuthToken) parcel.readParcelable(TwitterAuthToken.class.getClassLoader());
        this.f156006b = parcel.readString();
        this.f156007c = parcel.readLong();
    }

    /* synthetic */ OAuthResponse(Parcel parcel, byte b2) {
        this(parcel);
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeParcelable(this.f156005a, i2);
        parcel.writeString(this.f156006b);
        parcel.writeLong(this.f156007c);
    }

    public OAuthResponse(TwitterAuthToken twitterAuthToken, String str, long j2) {
        this.f156005a = twitterAuthToken;
        this.f156006b = str;
        this.f156007c = j2;
    }
}
