package com.google.android.gms.auth.api.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.r;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.a.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    private static final Lock f49858c = new ReentrantLock();

    /* renamed from: d  reason: collision with root package name */
    private static b f49859d;

    /* renamed from: a  reason: collision with root package name */
    final Lock f49860a = new ReentrantLock();

    /* renamed from: b  reason: collision with root package name */
    final SharedPreferences f49861b;

    static {
        Covode.recordClassIndex(31116);
    }

    public final GoogleSignInAccount a() {
        return b(a("defaultGoogleSignInAccount"));
    }

    public final GoogleSignInOptions b() {
        return c(a("defaultGoogleSignInAccount"));
    }

    private b(Context context) {
        this.f49861b = d.a(context, "com.google.android.gms.signin", 0);
    }

    public final String a(String str) {
        this.f49860a.lock();
        try {
            return this.f49861b.getString(str, null);
        } finally {
            this.f49860a.unlock();
        }
    }

    public static b a(Context context) {
        r.a(context);
        Lock lock = f49858c;
        lock.lock();
        try {
            if (f49859d == null) {
                Context applicationContext = context.getApplicationContext();
                if (a.f107168c) {
                    if (applicationContext == null) {
                        applicationContext = a.f107166a;
                    }
                }
                f49859d = new b(applicationContext);
            }
            b bVar = f49859d;
            lock.unlock();
            return bVar;
        } catch (Throwable th) {
            f49858c.unlock();
            throw th;
        }
    }

    private final GoogleSignInAccount b(String str) {
        String a2;
        if (!TextUtils.isEmpty(str) && (a2 = a(b("googleSignInAccount", str))) != null) {
            try {
                if (TextUtils.isEmpty(a2)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(a2);
                String optString = jSONObject.optString("photoUrl", null);
                Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
                long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    hashSet.add(new Scope(jSONArray.getString(i2)));
                }
                String optString2 = jSONObject.optString("id");
                String optString3 = jSONObject.optString("tokenId", null);
                String optString4 = jSONObject.optString("email", null);
                String optString5 = jSONObject.optString("displayName", null);
                String optString6 = jSONObject.optString("givenName", null);
                String optString7 = jSONObject.optString("familyName", null);
                Long valueOf = Long.valueOf(parseLong);
                String string = jSONObject.getString("obfuscatedIdentifier");
                if (valueOf == null) {
                    valueOf = Long.valueOf(GoogleSignInAccount.f49796a.a() / 1000);
                }
                GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, valueOf.longValue(), r.a(string), new ArrayList((Collection) r.a(hashSet)), optString6, optString7);
                googleSignInAccount.f49802g = jSONObject.optString("serverAuthCode", null);
                return googleSignInAccount;
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    private final GoogleSignInOptions c(String str) {
        String a2;
        if (!TextUtils.isEmpty(str) && (a2 = a(b("googleSignInOptions", str))) != null) {
            try {
                if (TextUtils.isEmpty(a2)) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(a2);
                HashSet hashSet = new HashSet();
                JSONArray jSONArray = jSONObject.getJSONArray("scopes");
                int length = jSONArray.length();
                for (int i2 = 0; i2 < length; i2++) {
                    hashSet.add(new Scope(jSONArray.getString(i2)));
                }
                String optString = jSONObject.optString("accountName", null);
                return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(optString) ? new Account(optString, com.bytedance.ies.xbridge.system.b.a.b.a.f36455d) : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.optString("serverClientId", null), jSONObject.optString("hostedDomain", null), new HashMap(), (String) null);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    static String b(String str, String str2) {
        return new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(str2).length()).append(str).append(":").append(str2).toString();
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        this.f49860a.lock();
        try {
            this.f49861b.edit().putString(str, str2).apply();
        } finally {
            this.f49860a.unlock();
        }
    }
}
