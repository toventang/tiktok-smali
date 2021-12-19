package com.bytedance.apm.internal;

import android.content.SharedPreferences;
import com.bytedance.apm.c;
import com.bytedance.apm.core.d;
import com.bytedance.covode.number.Covode;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f25048a;

    static {
        Covode.recordClassIndex(14628);
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f25049a = new b((byte) 0);

        static {
            Covode.recordClassIndex(14629);
        }
    }

    private b() {
        this.f25048a = d.a(c.f24685a, "monitor_config");
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final String a(String str) {
        return this.f25048a.getString(str, null);
    }

    public final long b(String str) {
        return this.f25048a.getLong(str, 0);
    }

    public final void a(String str, long j2) {
        this.f25048a.edit().putLong(str, j2).apply();
    }

    public final void a(String str, String str2) {
        this.f25048a.edit().putString(str, str2).apply();
    }
}
