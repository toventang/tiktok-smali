package com.ss.android.ugc.aweme.base.h;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Set;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f68136a;

    /* renamed from: b  reason: collision with root package name */
    private SharedPreferences.Editor f68137b;

    static {
        Covode.recordClassIndex(41980);
    }

    public final SharedPreferences.Editor a() {
        if (this.f68137b == null) {
            this.f68137b = this.f68136a.edit();
        }
        return this.f68137b;
    }

    public final long a(String str) {
        return this.f68136a.getLong(str, 0);
    }

    public final int a(String str, int i2) {
        return this.f68136a.getInt(str, i2);
    }

    public e(Context context, String str) {
        this.f68136a = d.a(context, str, 0);
    }

    public final void b(String str, int i2) {
        a().putInt(str, i2).apply();
    }

    public final void b(String str, String str2) {
        a().putString(str, str2).apply();
    }

    public final String a(String str, String str2) {
        return this.f68136a.getString(str, str2);
    }

    public final void b(String str, boolean z) {
        a().putBoolean(str, z).apply();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> java.util.List<T> a(java.lang.String r3, java.lang.Class<T> r4) {
        /*
            r2 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r2.a(r3, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0015
            java.util.List r0 = com.ss.android.ugc.aweme.utils.dw.b(r1, r4)     // Catch:{ Exception -> 0x0011 }
            goto L_0x0016
        L_0x0011:
            r0 = move-exception
            r0.printStackTrace()
        L_0x0015:
            r0 = 0
        L_0x0016:
            if (r0 != 0) goto L_0x001d
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.h.e.a(java.lang.String, java.lang.Class):java.util.List");
    }

    public final void a(String str, long j2) {
        a().putLong(str, j2).apply();
    }

    public final void a(String str, Set<String> set) {
        a().putStringSet(str, set).apply();
    }

    public final boolean a(String str, boolean z) {
        return this.f68136a.getBoolean(str, z);
    }
}
