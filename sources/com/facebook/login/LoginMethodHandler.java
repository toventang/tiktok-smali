package com.facebook.login;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.facebook.AccessToken;
import com.facebook.a.m;
import com.facebook.c;
import com.facebook.internal.ad;
import com.facebook.j;
import com.facebook.login.LoginClient;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class LoginMethodHandler implements Parcelable {

    /* renamed from: b  reason: collision with root package name */
    Map<String, String> f48843b;

    /* renamed from: c  reason: collision with root package name */
    protected LoginClient f48844c;

    static {
        Covode.recordClassIndex(29448);
    }

    /* access modifiers changed from: package-private */
    public abstract int a(LoginClient.Request request);

    /* access modifiers changed from: package-private */
    public abstract String a();

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject) {
    }

    /* access modifiers changed from: package-private */
    public boolean a(int i2, int i3, Intent intent) {
        return false;
    }

    public boolean e() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return false;
    }

    /* access modifiers changed from: package-private */
    public void v_() {
    }

    LoginMethodHandler(LoginClient loginClient) {
        this.f48844c = loginClient;
    }

    LoginMethodHandler(Parcel parcel) {
        this.f48843b = ad.a(parcel);
    }

    /* access modifiers changed from: package-private */
    public final void a(LoginClient loginClient) {
        if (this.f48844c == null) {
            this.f48844c = loginClient;
            return;
        }
        throw new j("Can't set LoginClient if it is already set.");
    }

    /* access modifiers changed from: protected */
    public final String a(String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", a());
            a(jSONObject);
        } catch (JSONException e2) {
            e2.getMessage();
        }
        return jSONObject.toString();
    }

    private static String c(String str) {
        if (str == null || str.isEmpty()) {
            throw new j("Authorization response does not contain the signed_request");
        }
        try {
            String[] split = str.split("\\.");
            if (split.length == 2) {
                return new JSONObject(new String(Base64.decode(split[1], 0), "UTF-8")).getString("user_id");
            }
        } catch (UnsupportedEncodingException | JSONException unused) {
        }
        throw new j("Failed to retrieve user_id from signed_request");
    }

    /* access modifiers changed from: protected */
    public final void b(String str) {
        String str2 = this.f48844c.f48805g.f48814d;
        m mVar = new m(this.f48844c.f48801c.getActivity(), str2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", str2);
        mVar.c();
    }

    public void writeToParcel(Parcel parcel, int i2) {
        ad.a(parcel, this.f48843b);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, Object obj) {
        String obj2;
        if (this.f48843b == null) {
            this.f48843b = new HashMap();
        }
        Map<String, String> map = this.f48843b;
        if (obj == null) {
            obj2 = null;
        } else {
            obj2 = obj.toString();
        }
        map.put(str, obj2);
    }

    static AccessToken a(Bundle bundle, c cVar, String str) {
        Date a2 = ad.a(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date a3 = ad.a(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0));
        if (ad.a(string)) {
            return null;
        }
        return new AccessToken(string, str, bundle.getString("com.facebook.platform.extra.USER_ID"), stringArrayList, null, null, cVar, a2, new Date(), a3, bundle.getString("graph_domain"));
    }

    public static AccessToken a(Collection<String> collection, Bundle bundle, c cVar, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        Collection<String> collection2 = collection;
        Date a2 = ad.a(bundle, "expires_in", new Date());
        String string = bundle.getString("access_token");
        Date a3 = ad.a(bundle, "data_access_expiration_time", new Date(0));
        String string2 = bundle.getString("granted_scopes");
        if (!ad.a(string2)) {
            collection2 = new ArrayList<>(Arrays.asList(string2.split(",")));
        }
        String string3 = bundle.getString("denied_scopes");
        if (!ad.a(string3)) {
            arrayList = new ArrayList(Arrays.asList(string3.split(",")));
        } else {
            arrayList = null;
        }
        String string4 = bundle.getString("expired_scopes");
        if (!ad.a(string4)) {
            arrayList2 = new ArrayList(Arrays.asList(string4.split(",")));
        } else {
            arrayList2 = null;
        }
        if (ad.a(string)) {
            return null;
        }
        return new AccessToken(string, str, c(bundle.getString("signed_request")), collection2, arrayList, arrayList2, cVar, a2, new Date(), a3, bundle.getString("graph_domain"));
    }
}
