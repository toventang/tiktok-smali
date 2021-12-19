package com.twitter.sdk.android.core.internal.oauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;
import com.twitter.sdk.android.core.a;

public class OAuth2Token extends a implements Parcelable {
    public static final Parcelable.Creator<OAuth2Token> CREATOR = new Parcelable.Creator<OAuth2Token>() {
        /* class com.twitter.sdk.android.core.internal.oauth.OAuth2Token.AnonymousClass1 */

        static {
            Covode.recordClassIndex(103653);
        }

        /* Return type fixed from 'java.lang.Object[]' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ OAuth2Token[] newArray(int i2) {
            return new OAuth2Token[i2];
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OAuth2Token createFromParcel(Parcel parcel) {
            return new OAuth2Token(parcel, (byte) 0);
        }
    };
    @c(a = "token_type")

    /* renamed from: c  reason: collision with root package name */
    public final String f156003c;
    @c(a = "access_token")

    /* renamed from: d  reason: collision with root package name */
    public final String f156004d;

    public boolean a() {
        return false;
    }

    public int describeContents() {
        return 0;
    }

    static {
        Covode.recordClassIndex(103652);
    }

    public int hashCode() {
        int i2;
        String str = this.f156003c;
        int i3 = 0;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = i2 * 31;
        String str2 = this.f156004d;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i4 + i3;
    }

    private OAuth2Token(Parcel parcel) {
        this.f156003c = parcel.readString();
        this.f156004d = parcel.readString();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OAuth2Token oAuth2Token = (OAuth2Token) obj;
        String str = this.f156004d;
        if (str == null ? oAuth2Token.f156004d != null : !str.equals(oAuth2Token.f156004d)) {
            return false;
        }
        String str2 = this.f156003c;
        String str3 = oAuth2Token.f156003c;
        if (str2 == null ? str3 == null : str2.equals(str3)) {
            return true;
        }
        return false;
    }

    /* synthetic */ OAuth2Token(Parcel parcel, byte b2) {
        this(parcel);
    }

    public OAuth2Token(String str, String str2) {
        this.f156003c = str;
        this.f156004d = str2;
    }

    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.f156003c);
        parcel.writeString(this.f156004d);
    }
}
