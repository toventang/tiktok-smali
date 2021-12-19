package com.ss.android.ugc.aweme.df;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import com.ss.android.ugc.aweme.lancet.a.a;

public final class p {

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f80062a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences.Editor f80063b;

    static {
        Covode.recordClassIndex(49837);
    }

    public final SharedPreferences.Editor a() {
        if (this.f80063b == null) {
            this.f80063b = this.f80062a.edit();
        }
        return this.f80063b;
    }

    public final int a(String str) {
        return this.f80062a.getInt(str, 0);
    }

    public final boolean b(String str) {
        return this.f80062a.getBoolean(str, true);
    }

    public final void c(String str) {
        a().putBoolean(str, false).apply();
    }

    public p(Context context, String str) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f80062a = d.a(applicationContext, str, 0);
    }

    public final String a(String str, String str2) {
        return this.f80062a.getString(str, str2);
    }

    public final void a(String str, int i2) {
        a().putInt(str, i2).apply();
    }
}
