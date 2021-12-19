package com.facebook;

import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ae;
import com.ss.android.ugc.aweme.bf.d;
import org.json.JSONException;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class v {

    /* renamed from: a  reason: collision with root package name */
    private final SharedPreferences f49232a = d.a(m.f48921g, "com.facebook.AccessTokenManager.SharedPreferences", 0);

    static {
        Covode.recordClassIndex(30782);
    }

    /* access modifiers changed from: package-private */
    public final void b() {
        this.f49232a.edit().remove("com.facebook.ProfileManager.CachedProfile").apply();
    }

    v() {
        ae.a();
    }

    /* access modifiers changed from: package-private */
    public final Profile a() {
        String string = this.f49232a.getString("com.facebook.ProfileManager.CachedProfile", null);
        if (string != null) {
            try {
                return new Profile(new JSONObject(string));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public final void a(Profile profile) {
        ae.a(profile, "profile");
        JSONObject b2 = profile.b();
        if (b2 != null) {
            this.f49232a.edit().putString("com.facebook.ProfileManager.CachedProfile", b2.toString()).apply();
        }
    }
}
