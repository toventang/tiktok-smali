package com.facebook.login;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import com.a;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.FacebookRequestError;
import com.facebook.ab;
import com.facebook.b;
import com.facebook.c;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.facebook.j;
import com.facebook.l;
import com.facebook.login.LoginClient;
import com.facebook.m;
import com.facebook.o;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Locale;

public abstract class WebLoginMethodHandler extends LoginMethodHandler {

    /* renamed from: a  reason: collision with root package name */
    private String f48845a;

    static {
        Covode.recordClassIndex(29450);
    }

    /* access modifiers changed from: package-private */
    public abstract c b();

    /* access modifiers changed from: protected */
    public String d() {
        return null;
    }

    /* access modifiers changed from: protected */
    public String c() {
        StringBuilder sb = new StringBuilder("fb");
        ae.a();
        return sb.append(m.f48915a).append("://authorize").toString();
    }

    WebLoginMethodHandler(Parcel parcel) {
        super(parcel);
    }

    WebLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* access modifiers changed from: protected */
    public final Bundle b(LoginClient.Request request) {
        String str;
        Bundle bundle = new Bundle();
        if (!ad.a(request.f48812b)) {
            String join = TextUtils.join(",", request.f48812b);
            bundle.putString("scope", join);
            a("scope", join);
        }
        bundle.putString("default_audience", request.f48813c.getNativeProtocolAudience());
        bundle.putString("state", a(request.f48815e));
        AccessToken accessToken = b.a().f46926b;
        if (accessToken != null) {
            str = accessToken.f46498e;
        } else {
            str = null;
        }
        String str2 = "0";
        if (str == null || !str.equals(d.a(this.f48844c.f48801c.getActivity(), "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).getString("TOKEN", ""))) {
            try {
                ad.b(this.f48844c.f48801c.getActivity());
            } catch (Exception unused) {
            }
            a("access_token", str2);
        } else {
            bundle.putString("access_token", str);
            a("access_token", "1");
        }
        bundle.putString("cbt", String.valueOf(System.currentTimeMillis()));
        if (ab.b()) {
            str2 = "1";
        }
        bundle.putString("ies", str2);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final Bundle a(Bundle bundle, LoginClient.Request request) {
        String str;
        bundle.putString("redirect_uri", c());
        bundle.putString("client_id", request.f48814d);
        bundle.putString("e2e", LoginClient.e());
        bundle.putString("response_type", "token,signed_request,graph_domain");
        bundle.putString("return_scopes", "true");
        bundle.putString("auth_type", request.f48818h);
        bundle.putString("login_behavior", request.f48811a.name());
        bundle.putString("sdk", a.a(Locale.ROOT, "android-%s", new Object[]{"9.0.0"}));
        if (d() != null) {
            bundle.putString("sso", d());
        }
        if (m.f48923i) {
            str = "1";
        } else {
            str = "0";
        }
        bundle.putString("cct_prefetching", str);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final void a(LoginClient.Request request, Bundle bundle, j jVar) {
        LoginClient.Result result;
        String str;
        this.f48845a = null;
        if (bundle != null) {
            if (bundle.containsKey("e2e")) {
                this.f48845a = bundle.getString("e2e");
            }
            try {
                AccessToken a2 = a(request.f48812b, bundle, b(), request.f48814d);
                result = LoginClient.Result.a(this.f48844c.f48805g, a2);
                CookieSyncManager.createInstance(this.f48844c.f48801c.getActivity()).sync();
                d.a(this.f48844c.f48801c.getActivity(), "com.facebook.login.AuthorizationClient.WebViewAuthHandler.TOKEN_STORE_KEY", 0).edit().putString("TOKEN", a2.f46498e).apply();
            } catch (j e2) {
                result = LoginClient.Result.a(this.f48844c.f48805g, null, e2.getMessage(), null);
            }
        } else if (jVar instanceof l) {
            result = LoginClient.Result.a(this.f48844c.f48805g, "User canceled log in.");
        } else {
            this.f48845a = null;
            String message = jVar.getMessage();
            if (jVar instanceof o) {
                FacebookRequestError requestError = ((o) jVar).getRequestError();
                str = a.a(Locale.ROOT, "%d", new Object[]{Integer.valueOf(requestError.f46526d)});
                message = requestError.toString();
            } else {
                str = null;
            }
            result = LoginClient.Result.a(this.f48844c.f48805g, null, message, str);
        }
        if (!ad.a(this.f48845a)) {
            b(this.f48845a);
        }
        this.f48844c.a(result);
    }
}
