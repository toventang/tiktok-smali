package com.twitter.sdk.android.core.internal.oauth;

import com.bytedance.covode.number.Covode;
import com.google.gson.a.c;

public class GuestAuthToken extends OAuth2Token {
    @c(a = "guest_token")

    /* renamed from: b  reason: collision with root package name */
    public final String f155994b;

    static {
        Covode.recordClassIndex(103644);
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public final boolean a() {
        if (System.currentTimeMillis() >= this.f155896a + 10800000) {
            return true;
        }
        return false;
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public int hashCode() {
        int i2;
        int hashCode = super.hashCode() * 31;
        String str = this.f155994b;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return hashCode + i2;
    }

    @Override // com.twitter.sdk.android.core.internal.oauth.OAuth2Token
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        String str = this.f155994b;
        String str2 = ((GuestAuthToken) obj).f155994b;
        if (str == null ? str2 == null : str.equals(str2)) {
            return true;
        }
        return false;
    }

    public GuestAuthToken(String str, String str2, String str3) {
        super(str, str2);
        this.f155994b = str3;
    }
}
