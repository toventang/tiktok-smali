package com.facebook;

import android.content.SharedPreferences;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.internal.ad;
import com.facebook.internal.ae;
import com.ss.android.ugc.aweme.bf.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f46573a;

    /* renamed from: b  reason: collision with root package name */
    private final C1156a f46574b;

    /* renamed from: c  reason: collision with root package name */
    private t f46575c;

    static {
        Covode.recordClassIndex(28405);
    }

    /* renamed from: com.facebook.a$a  reason: collision with other inner class name */
    static class C1156a {
        static {
            Covode.recordClassIndex(28406);
        }

        C1156a() {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public a() {
        this(d.a(m.f48921g, "com.facebook.AccessTokenManager.SharedPreferences", 0), new C1156a());
        ae.a();
    }

    public final void b() {
        this.f46573a.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (m.f48920f) {
            d().b();
        }
    }

    private t d() {
        MethodCollector.i(3807);
        if (this.f46575c == null) {
            synchronized (this) {
                try {
                    if (this.f46575c == null) {
                        ae.a();
                        this.f46575c = new t(m.f48921g);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3807);
                    throw th;
                }
            }
        }
        t tVar = this.f46575c;
        MethodCollector.o(3807);
        return tVar;
    }

    public final AccessToken a() {
        Bundle a2;
        String string;
        if (this.f46573a.contains("com.facebook.AccessTokenManager.CachedAccessToken")) {
            return c();
        }
        if (!m.f48920f || (a2 = d().a()) == null || (string = a2.getString("com.facebook.TokenCachingStrategy.Token")) == null || string.length() == 0 || a2.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) == 0) {
            return null;
        }
        AccessToken a3 = AccessToken.a(a2);
        if (a3 == null) {
            return a3;
        }
        a(a3);
        d().b();
        return a3;
    }

    private AccessToken c() {
        Collection b2;
        String string = this.f46573a.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.getInt("version") <= 1) {
                String string2 = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                c valueOf = c.valueOf(jSONObject.getString("source"));
                String string3 = jSONObject.getString("application_id");
                String string4 = jSONObject.getString("user_id");
                try {
                    Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0));
                    String optString = jSONObject.optString("graph_domain", null);
                    List<String> b3 = ad.b(jSONArray);
                    List<String> b4 = ad.b(jSONArray2);
                    if (optJSONArray == null) {
                        b2 = new ArrayList();
                    } else {
                        b2 = ad.b(optJSONArray);
                    }
                    return new AccessToken(string2, string3, string4, b3, b4, b2, valueOf, date, date2, date3, optString);
                } catch (JSONException unused) {
                    return null;
                }
            } else {
                throw new j("Unknown AccessToken serialization format.");
            }
        } catch (JSONException unused2) {
            return null;
        }
    }

    public final void a(AccessToken accessToken) {
        ae.a(accessToken, "accessToken");
        try {
            this.f46573a.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", accessToken.c().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    private a(SharedPreferences sharedPreferences, C1156a aVar) {
        this.f46573a = sharedPreferences;
        this.f46574b = aVar;
    }
}
