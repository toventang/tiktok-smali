package com.ss.android.ugc.asve.f;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;
import h.f.b.ab;
import h.f.b.l;

public final class a {

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f62079b;

    /* renamed from: c  reason: collision with root package name */
    public static final C1354a f62080c = new C1354a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f62081a;

    static {
        Covode.recordClassIndex(38156);
    }

    /* renamed from: com.ss.android.ugc.asve.f.a$a  reason: collision with other inner class name */
    public static final class C1354a {
        static {
            Covode.recordClassIndex(38157);
        }

        private C1354a() {
        }

        public /* synthetic */ C1354a(byte b2) {
            this();
        }

        public static a a(Context context) {
            MethodCollector.i(9782);
            l.d(context, "");
            if (a.f62079b == null) {
                synchronized (ab.a(a.class)) {
                    try {
                        if (a.f62079b == null) {
                            a.f62079b = new a(context, (byte) 0);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(9782);
                        throw th;
                    }
                }
            }
            a aVar = a.f62079b;
            if (aVar == null) {
                l.b();
            }
            MethodCollector.o(9782);
            return aVar;
        }
    }

    public final int a() {
        return this.f62081a.getInt("key_camera_wide_mode", 0);
    }

    public final int b() {
        return this.f62081a.getInt("key_camera_shake_mode", 0);
    }

    private a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        SharedPreferences a2 = d.a(applicationContext, "asve_sp", 0);
        l.b(a2, "");
        this.f62081a = a2;
    }

    public final void a(int i2) {
        this.f62081a.edit().putInt("key_camera_wide_mode", i2).apply();
    }

    public final void b(int i2) {
        this.f62081a.edit().putInt("key_camera_shake_mode", i2).apply();
    }

    public /* synthetic */ a(Context context, byte b2) {
        this(context);
    }
}
