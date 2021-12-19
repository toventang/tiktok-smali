package com.bytedance.helios.sdk.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.helios.a.a.g;
import com.bytedance.helios.sdk.HeliosEnvImpl;
import com.ss.android.agilelogger.ALog;
import h.f.b.l;
import h.m.p;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public final class f {

    /* renamed from: a */
    static final ConcurrentLinkedQueue<e> f31008a = new ConcurrentLinkedQueue<>();

    /* renamed from: b */
    static AtomicBoolean f31009b = new AtomicBoolean(false);

    /* renamed from: c */
    public static final f f31010c = new f();

    public static final void a(String str, String str2) {
        a(str, str2, (String) null, 12);
    }

    private f() {
    }

    static {
        Covode.recordClassIndex(18009);
    }

    public static final class a implements Runnable {

        /* renamed from: a */
        public static final a f31011a = new a();

        static {
            Covode.recordClassIndex(18010);
        }

        a() {
        }

        public final void run() {
            while (!f.f31008a.isEmpty()) {
                e poll = f.f31008a.poll();
                if (poll != null) {
                    String str = "(" + g.a(poll.f31007e) + ") ";
                    String str2 = poll.f31004b;
                    if (str2 == null || !p.b(str2, str, false)) {
                        poll.f31004b = str + poll.f31004b;
                    }
                    f.a(poll);
                }
            }
            f.f31009b.set(false);
        }
    }

    private static void b(e eVar) {
        ConcurrentLinkedQueue<e> concurrentLinkedQueue = f31008a;
        if (concurrentLinkedQueue.size() > 1000) {
            concurrentLinkedQueue.poll();
        }
        concurrentLinkedQueue.offer(eVar);
    }

    public static final void a(e eVar) {
        l.c(eVar, "");
        if (HeliosEnvImpl.INSTANCE.getAlogEnabled()) {
            if (ALog.sConfig == null) {
                b(eVar);
                return;
            }
            a(true);
            d(eVar);
        } else if (HeliosEnvImpl.INSTANCE.isOffLineEnv()) {
            c(eVar);
        }
    }

    private static void c(e eVar) {
        String str = eVar.f31005c;
        int hashCode = str.hashCode();
        if (hashCode == 100) {
            if (str.equals("d")) {
            }
        } else if (hashCode != 101) {
            if (hashCode == 105) {
                str.equals("i");
            } else if (hashCode != 119 || !str.equals("w")) {
            }
        } else if (!str.equals("e")) {
        }
    }

    public static void a(boolean z) {
        if ((!f31008a.isEmpty()) && !f31009b.getAndSet(true)) {
            a aVar = a.f31011a;
            if (z) {
                com.bytedance.helios.a.a.a.b().post(aVar);
            } else {
                aVar.run();
            }
        }
    }

    private static void d(e eVar) {
        String str = eVar.f31005c;
        int hashCode = str.hashCode();
        String str2 = "";
        if (hashCode != 100) {
            if (hashCode != 101) {
                if (hashCode != 105) {
                    if (hashCode == 119 && str.equals("w")) {
                        String str3 = eVar.f31003a;
                        String str4 = eVar.f31004b;
                        if (str4 != null) {
                            str2 = str4;
                        }
                        ALog.w(str3, str2);
                    }
                } else if (str.equals("i")) {
                    String str5 = eVar.f31003a;
                    String str6 = eVar.f31004b;
                    if (str6 != null) {
                        str2 = str6;
                    }
                    ALog.i(str5, str2);
                }
            } else if (str.equals("e")) {
                ALog.e(eVar.f31003a, eVar.f31004b, eVar.f31006d);
            }
        } else if (str.equals("d")) {
            String str7 = eVar.f31003a;
            String str8 = eVar.f31004b;
            if (str8 != null) {
                str2 = str8;
            }
            ALog.d(str7, str2);
        }
    }

    public static final void b(String str, String str2) {
        l.c(str, "");
        l.c(str2, "");
        HeliosEnvImpl.INSTANCE.isOffLineEnv();
    }

    public static /* synthetic */ void a(String str, String str2, String str3, int i2) {
        if ((i2 & 4) != 0) {
            str3 = "i";
        }
        a(str, str2, str3, (Throwable) null);
    }

    public static final void a(String str, String str2, String str3, Throwable th) {
        l.c(str, "");
        l.c(str3, "");
        a(new e(str, str2, str3, th));
    }
}
