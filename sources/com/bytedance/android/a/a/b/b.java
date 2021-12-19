package com.bytedance.android.a.a.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.bytedance.android.a.a.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import java.util.Collections;
import java.util.Map;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private Context f6605a;

    /* renamed from: b  reason: collision with root package name */
    private String f6606b;

    /* renamed from: c  reason: collision with root package name */
    private SharedPreferences f6607c;

    /* renamed from: d  reason: collision with root package name */
    private SharedPreferences.Editor f6608d;

    static {
        Covode.recordClassIndex(3182);
    }

    @Override // com.bytedance.android.a.a.b.a
    public final a b() {
        SharedPreferences.Editor d2 = d();
        if (d2 == null) {
            return this;
        }
        d2.clear();
        return this;
    }

    @Override // com.bytedance.android.a.a.b.a
    public final void c() {
        SharedPreferences.Editor d2 = d();
        if (d2 != null) {
            d2.apply();
        }
    }

    private SharedPreferences.Editor d() {
        SharedPreferences e2;
        MethodCollector.i(3541);
        if (this.f6608d == null) {
            synchronized (this) {
                try {
                    if (this.f6608d == null && (e2 = e()) != null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        this.f6608d = e2.edit();
                        c.a().b(this.f6606b, SystemClock.uptimeMillis() - uptimeMillis);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3541);
                    throw th;
                }
            }
        }
        SharedPreferences.Editor editor = this.f6608d;
        MethodCollector.o(3541);
        return editor;
    }

    private SharedPreferences e() {
        MethodCollector.i(3542);
        if (this.f6607c == null) {
            synchronized (this) {
                try {
                    if (this.f6607c == null) {
                        try {
                            long uptimeMillis = SystemClock.uptimeMillis();
                            this.f6607c = d.a(this.f6605a, this.f6606b, 0);
                            c.a().a(this.f6606b, SystemClock.uptimeMillis() - uptimeMillis);
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                } catch (Throwable th) {
                    MethodCollector.o(3542);
                    throw th;
                }
            }
        }
        SharedPreferences sharedPreferences = this.f6607c;
        MethodCollector.o(3542);
        return sharedPreferences;
    }

    @Override // com.bytedance.android.a.a.b.a
    public final Map<String, ?> a() {
        SharedPreferences e2 = e();
        if (e2 == null) {
            return Collections.emptyMap();
        }
        return e2.getAll();
    }

    @Override // com.bytedance.android.a.a.b.a
    public final int c(String str) {
        SharedPreferences e2 = e();
        if (e2 == null) {
            return 0;
        }
        return e2.getInt(str, 0);
    }

    @Override // com.bytedance.android.a.a.b.a
    public final a d(String str) {
        SharedPreferences.Editor d2 = d();
        if (d2 == null) {
            return this;
        }
        d2.remove(str);
        return this;
    }

    @Override // com.bytedance.android.a.a.b.a
    public final String a(String str) {
        SharedPreferences e2 = e();
        if (e2 == null) {
            return null;
        }
        return e2.getString(str, null);
    }

    @Override // com.bytedance.android.a.a.b.a
    public final a b(String str) {
        SharedPreferences.Editor d2 = d();
        if (d2 == null) {
            return this;
        }
        d2.putInt(str, 2);
        return this;
    }

    public b(Context context, String str) {
        this.f6605a = context;
        this.f6606b = str;
    }

    @Override // com.bytedance.android.a.a.b.a
    public final a a(String str, String str2) {
        SharedPreferences.Editor d2 = d();
        if (d2 == null) {
            return this;
        }
        d2.putString(str, str2);
        return this;
    }
}
