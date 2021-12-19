package com.bytedance.im.core.internal.c;

import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.a.d;
import com.bytedance.im.core.c.f;
import com.bytedance.im.core.internal.a.i;
import com.bytedance.im.core.internal.e.c;
import com.bytedance.im.core.internal.utils.s;
import java.lang.ref.SoftReference;

public class a {

    /* renamed from: b  reason: collision with root package name */
    public static boolean f38680b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f38681c;

    /* renamed from: d  reason: collision with root package name */
    private static a f38682d;

    /* renamed from: a  reason: collision with root package name */
    public boolean f38683a;

    static {
        Covode.recordClassIndex(23071);
    }

    public static boolean b() {
        if (!f38680b || f38681c) {
            return false;
        }
        return true;
    }

    public static a a() {
        MethodCollector.i(11304);
        if (f38682d == null) {
            synchronized (a.class) {
                try {
                    f38682d = new a();
                } catch (Throwable th) {
                    MethodCollector.o(11304);
                    throw th;
                }
            }
        }
        a aVar = f38682d;
        MethodCollector.o(11304);
        return aVar;
    }

    public final void c() {
        boolean z = d.a().b().aC;
        s.a();
        boolean l2 = s.l();
        f.b("MultiTableQueryOptManager", "notifySyncDone: " + this.f38683a + ", " + z + ", " + l2, (Throwable) null);
        if (this.f38683a && z && !l2) {
            AnonymousClass1 r1 = new c<Void>() {
                /* class com.bytedance.im.core.internal.c.a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(23072);
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                @Override // com.bytedance.im.core.internal.e.c
                public final /* synthetic */ Void a() {
                    String str;
                    boolean z = d.a().b().aC;
                    s.a();
                    boolean l2 = s.l();
                    f.b("MultiTableQueryOptManager", "notifySyncDone onRun: " + a.f38680b + ", " + a.this.f38683a + ", " + z + ", " + l2, (Throwable) null);
                    if (a.this.f38683a && z && !l2) {
                        long currentTimeMillis = System.currentTimeMillis();
                        a.f38681c = false;
                        boolean b2 = i.b();
                        com.bytedance.im.core.c.i a2 = new com.bytedance.im.core.c.i().a("im_sdk_msg_update_flag").a("cost_time", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
                        if (b2) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        a2.a("is_success", str).c();
                        if (b2) {
                            s.a();
                            s.m();
                        }
                        f.b("MultiTableQueryOptManager", "notifySyncDone, update result: " + b2 + ", current thread: " + Thread.currentThread(), (Throwable) null);
                    }
                    return null;
                }
            };
            boolean z2 = d.a().f37564d;
            if (z2) {
                com.bytedance.im.core.internal.e.d dVar = new com.bytedance.im.core.internal.e.d(r1, null, com.bytedance.im.core.internal.e.a.a());
                if (dVar.f38746a != null) {
                    Message obtain = Message.obtain();
                    obtain.what = 100003;
                    obtain.obj = dVar;
                    dVar.f38746a.sendMessageDelayed(obtain, 60000);
                }
                com.bytedance.im.core.internal.e.d.f38745b.put(Integer.valueOf(dVar.hashCode()), new SoftReference<>(dVar));
                return;
            }
            f.b("imsdk", "Task executorDelay not start, isLogin:".concat(String.valueOf(z2)), (Throwable) null);
        }
    }
}
