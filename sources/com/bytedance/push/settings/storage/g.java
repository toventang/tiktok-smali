package com.bytedance.push.settings.storage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.push.settings.a;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

class g implements i {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f42345a;

    /* renamed from: b  reason: collision with root package name */
    private Map<a, SharedPreferences.OnSharedPreferenceChangeListener> f42346b = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(25866);
    }

    @Override // com.bytedance.push.settings.storage.i
    public SharedPreferences.Editor a() {
        return this.f42345a.edit();
    }

    @Override // com.bytedance.push.settings.storage.i
    public final int b(String str) {
        return a(str, 0);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final long c(String str) {
        return a(str, 0L);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final float d(String str) {
        return a(str, 0.0f);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final boolean e(String str) {
        return a(str, false);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final boolean f(String str) {
        return this.f42345a.contains(str);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final String a(String str) {
        return a(str, (String) null);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final void a(a aVar) {
        SharedPreferences.OnSharedPreferenceChangeListener remove;
        if (aVar != null && (remove = this.f42346b.remove(aVar)) != null) {
            this.f42345a.unregisterOnSharedPreferenceChangeListener(remove);
        }
    }

    @Override // com.bytedance.push.settings.storage.i
    public final float a(String str, float f2) {
        try {
            return this.f42345a.getFloat(str, f2);
        } catch (Exception unused) {
            return f2;
        }
    }

    @Override // com.bytedance.push.settings.storage.i
    public final int a(String str, int i2) {
        try {
            return this.f42345a.getInt(str, i2);
        } catch (Exception unused) {
            return i2;
        }
    }

    g(Context context, String str) {
        this.f42345a = d.a(context, str, 0);
    }

    @Override // com.bytedance.push.settings.storage.i
    public final long a(String str, long j2) {
        try {
            return this.f42345a.getLong(str, j2);
        } catch (Exception unused) {
            return j2;
        }
    }

    @Override // com.bytedance.push.settings.storage.i
    public final String a(String str, String str2) {
        try {
            return this.f42345a.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    @Override // com.bytedance.push.settings.storage.i
    public final boolean a(String str, boolean z) {
        try {
            return this.f42345a.getBoolean(str, z);
        } catch (Exception unused) {
            return z;
        }
    }

    @Override // com.bytedance.push.settings.storage.i
    public final void a(Context context, final String str, String str2, final a aVar) {
        if (aVar != null) {
            AnonymousClass1 r1 = new SharedPreferences.OnSharedPreferenceChangeListener() {
                /* class com.bytedance.push.settings.storage.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(25867);
                }

                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
                    TextUtils.equals(str, str);
                }
            };
            this.f42346b.put(aVar, r1);
            this.f42345a.registerOnSharedPreferenceChangeListener(r1);
        }
    }
}
