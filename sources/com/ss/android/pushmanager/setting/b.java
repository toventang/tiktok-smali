package com.ss.android.pushmanager.setting;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.push.c.j;
import com.bytedance.push.settings.AliveOnlineSettings;
import com.bytedance.push.settings.LocalSettings;
import com.bytedance.push.settings.PushOnlineSettings;
import com.bytedance.push.settings.h;
import com.ss.android.message.a;
import com.ss.android.pushmanager.setting.PushMultiProcessSharedProvider;

public class b implements j {

    /* renamed from: a  reason: collision with root package name */
    private static b f60126a;

    /* renamed from: b  reason: collision with root package name */
    private PushMultiProcessSharedProvider.b f60127b = PushMultiProcessSharedProvider.a(a.f59817a);

    static {
        Covode.recordClassIndex(37145);
    }

    @Override // com.bytedance.push.c.j
    public final void a() {
        e().b();
    }

    private b() {
    }

    public static String d() {
        return g().b();
    }

    public static AliveOnlineSettings e() {
        return (AliveOnlineSettings) h.a(a.f59817a, AliveOnlineSettings.class);
    }

    public static PushOnlineSettings f() {
        return (PushOnlineSettings) h.a(a.f59817a, PushOnlineSettings.class);
    }

    public static LocalSettings g() {
        return (LocalSettings) h.a(a.f59817a, LocalSettings.class);
    }

    public static boolean h() {
        return f().a();
    }

    public static boolean c() {
        if (!g().c() || !h()) {
            return false;
        }
        return true;
    }

    public static b b() {
        MethodCollector.i(6217);
        if (f60126a == null) {
            synchronized (b.class) {
                try {
                    if (f60126a == null) {
                        f60126a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6217);
                    throw th;
                }
            }
        }
        b bVar = f60126a;
        MethodCollector.o(6217);
        return bVar;
    }

    @Override // com.bytedance.push.c.j
    public final void b(boolean z) {
        g().a(z);
    }

    @Override // com.bytedance.push.c.j
    public final void a(String str) {
        e().a(str);
    }

    @Override // com.bytedance.push.c.j
    public final void a(boolean z) {
        f().b(z);
    }
}
