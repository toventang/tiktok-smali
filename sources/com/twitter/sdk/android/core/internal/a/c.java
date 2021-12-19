package com.twitter.sdk.android.core.internal.a;

import com.bytedance.covode.number.Covode;
import com.twitter.sdk.android.core.d;
import com.twitter.sdk.android.core.e;
import com.twitter.sdk.android.core.internal.oauth.GuestAuthToken;
import okhttp3.Authenticator;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;

public final class c implements Authenticator {

    /* renamed from: a  reason: collision with root package name */
    final e f155950a;

    static {
        Covode.recordClassIndex(103619);
    }

    public c(e eVar) {
        this.f155950a = eVar;
    }

    @Override // okhttp3.Authenticator
    public final Request authenticate(Route route, Response response) {
        d dVar;
        GuestAuthToken guestAuthToken;
        boolean z = true;
        Response response2 = response;
        int i2 = 1;
        while (true) {
            response2 = response2.priorResponse();
            if (response2 == null) {
                break;
            }
            i2++;
        }
        if (i2 >= 2) {
            z = false;
        }
        if (z) {
            e eVar = this.f155950a;
            Headers headers = response.request().headers();
            String str = headers.get("Authorization");
            String str2 = headers.get("x-guest-token");
            if (str == null || str2 == null) {
                dVar = null;
            } else {
                dVar = new d(new GuestAuthToken("bearer", str.replace("bearer ", ""), str2));
            }
            d a2 = eVar.a(dVar);
            if (!(a2 == null || (guestAuthToken = (GuestAuthToken) a2.f155913a) == null)) {
                Request.Builder newBuilder = response.request().newBuilder();
                a.a(newBuilder, guestAuthToken);
                return newBuilder.build();
            }
        }
        return null;
    }
}
