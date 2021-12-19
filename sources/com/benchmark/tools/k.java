package com.benchmark.tools;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;

public class k {

    /* renamed from: b  reason: collision with root package name */
    private static k f6391b;

    /* renamed from: a  reason: collision with root package name */
    public String f6392a = "default_config";

    static {
        Covode.recordClassIndex(3072);
    }

    private k() {
    }

    private void b() {
        if (TextUtils.isEmpty(this.f6392a)) {
            throw new IllegalStateException("filename can not bo null");
        }
    }

    public static k a() {
        MethodCollector.i(1537);
        if (f6391b == null) {
            synchronized (k.class) {
                try {
                    if (f6391b == null) {
                        f6391b = new k();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(1537);
                    throw th;
                }
            }
        }
        k kVar = f6391b;
        MethodCollector.o(1537);
        return kVar;
    }

    private SharedPreferences a(Context context) {
        if (context == null) {
            return null;
        }
        b();
        return d.a(context, this.f6392a, 0);
    }

    public final String a(Context context, String str) {
        SharedPreferences a2 = a(context);
        if (a2 == null) {
            return null;
        }
        return a2.getString(str, "");
    }

    public final void a(Context context, String str, String str2) {
        SharedPreferences a2 = a(context);
        if (a2 != null) {
            SharedPreferences.Editor edit = a2.edit();
            edit.putString(str, str2);
            edit.apply();
        }
    }
}
