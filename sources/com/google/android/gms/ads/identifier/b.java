package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.common.g;
import com.ss.android.ugc.aweme.bf.d;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f49683a;

    static {
        Covode.recordClassIndex(31048);
    }

    public b(Context context) {
        try {
            Context d2 = g.d(context);
            this.f49683a = d2 == null ? null : d.a(d2, "google_ads_flags", 0);
        } catch (Throwable unused) {
            this.f49683a = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final String a(String str, String str2) {
        try {
            SharedPreferences sharedPreferences = this.f49683a;
            return sharedPreferences == null ? str2 : sharedPreferences.getString(str, str2);
        } catch (Throwable unused) {
            return str2;
        }
    }

    public final boolean a(String str) {
        try {
            SharedPreferences sharedPreferences = this.f49683a;
            if (sharedPreferences == null) {
                return false;
            }
            return sharedPreferences.getBoolean(str, false);
        } catch (Throwable unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public final float b(String str) {
        try {
            SharedPreferences sharedPreferences = this.f49683a;
            if (sharedPreferences == null) {
                return 0.0f;
            }
            return sharedPreferences.getFloat(str, 0.0f);
        } catch (Throwable unused) {
            return 0.0f;
        }
    }
}
