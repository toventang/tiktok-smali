package com.bytedance.geckox.utils;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;

public class n {

    /* renamed from: b  reason: collision with root package name */
    private static n f30132b;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f30133a;

    static {
        Covode.recordClassIndex(17506);
    }

    private n() {
    }

    public static n a() {
        MethodCollector.i(7290);
        if (f30132b == null) {
            synchronized (n.class) {
                try {
                    if (f30132b == null) {
                        f30132b = new n();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7290);
                    throw th;
                }
            }
        }
        n nVar = f30132b;
        MethodCollector.o(7290);
        return nVar;
    }

    public void a(Context context) {
        if (this.f30133a == null) {
            this.f30133a = d.a(context, "sp_gecko", 0);
        }
    }

    public final void a(Context context, String str) {
        a(context);
        this.f30133a.edit().remove(str).apply();
    }

    public final String b(Context context, String str, String str2) {
        a(context);
        return this.f30133a.getString(str, str2);
    }

    public final void a(Context context, String str, String str2) {
        a(context);
        this.f30133a.edit().putString(str, str2).apply();
    }
}
