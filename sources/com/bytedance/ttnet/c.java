package com.bytedance.ttnet;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.frameworks.baselib.network.http.cronet.b;
import com.bytedance.frameworks.baselib.network.http.cronet.b.h;
import com.bytedance.frameworks.baselib.network.http.d.a.o;
import com.bytedance.frameworks.baselib.network.http.g.f;
import com.bytedance.retrofit2.client.Request;
import java.net.MalformedURLException;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static volatile b f44544a;

    /* renamed from: b  reason: collision with root package name */
    public static final C1089c f44545b = new C1089c((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    public static final a f44546c = new a((byte) 0);

    /* renamed from: d  reason: collision with root package name */
    static boolean f44547d;

    /* renamed from: e  reason: collision with root package name */
    public static volatile boolean f44548e;

    /* renamed from: f  reason: collision with root package name */
    static String f44549f;

    public interface b {
        static {
            Covode.recordClassIndex(27262);
        }

        boolean g();
    }

    /* renamed from: com.bytedance.ttnet.c$c  reason: collision with other inner class name */
    public static class C1089c {
        static {
            Covode.recordClassIndex(27263);
        }

        private C1089c() {
        }

        public com.bytedance.frameworks.baselib.network.http.c a() {
            Context a2 = TTNetInit.getTTNetDepend().a();
            o a3 = o.a(a2);
            if (f.a(a2)) {
                o.f29282j = com.bytedance.ttnet.f.c.a();
            }
            return a3;
        }

        /* synthetic */ C1089c(byte b2) {
            this();
        }
    }

    public static class a extends C1089c {
        static {
            Covode.recordClassIndex(27261);
        }

        private a() {
            super((byte) 0);
        }

        @Override // com.bytedance.ttnet.c.C1089c
        public final com.bytedance.frameworks.baselib.network.http.c a() {
            return d.a(h.a(TTNetInit.getTTNetDepend().a()));
        }

        /* synthetic */ a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(27260);
    }

    public static boolean a() {
        if (f44544a == null) {
            o.f29274b = 9;
            return false;
        } else if (!f44544a.g()) {
            return false;
        } else {
            TTNetInit.getTTNetDepend();
            if (!f44547d || f44548e) {
                return true;
            }
            o.f29274b = 7;
            o.f29275c = f44549f;
            return false;
        }
    }

    static class d implements com.bytedance.frameworks.baselib.network.http.c {

        /* renamed from: a  reason: collision with root package name */
        private static volatile d f44553a;

        /* renamed from: b  reason: collision with root package name */
        private h f44554b;

        /* renamed from: c  reason: collision with root package name */
        private volatile int f44555c;

        static {
            Covode.recordClassIndex(27264);
        }

        private d(h hVar) {
            this.f44554b = hVar;
        }

        public static d a(h hVar) {
            MethodCollector.i(7994);
            if (f44553a == null) {
                synchronized (d.class) {
                    try {
                        if (f44553a == null) {
                            f44553a = new d(hVar);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(7994);
                        throw th;
                    }
                }
            }
            d dVar = f44553a;
            MethodCollector.o(7994);
            return dVar;
        }

        @Override // com.bytedance.retrofit2.client.a
        public final com.bytedance.retrofit2.client.d a(Request request) {
            boolean z;
            try {
                return this.f44554b.a(request);
            } catch (Throwable th) {
                if (!(th instanceof MalformedURLException) && (th.getMessage() == null || !th.getMessage().contains("MalformedURLException"))) {
                    com.bytedance.frameworks.baselib.network.http.cronet.b a2 = com.bytedance.frameworks.baselib.network.http.cronet.b.a();
                    if (a2.f29000b == b.a.PRE_INIT || a2.f29000b == b.a.FORCE_INIT) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        int i2 = this.f44555c + 1;
                        this.f44555c = i2;
                        if (i2 > 5) {
                            c.f44547d = true;
                            String a3 = com.bytedance.ttnet.utils.d.a(th);
                            c.f44549f = a3;
                            if (a3.length() > 2048) {
                                c.f44549f = c.f44549f.substring(0, 2048);
                            }
                        }
                    }
                }
                TTNetInit.notifyColdStartFinish();
                return c.f44545b.a().a(request);
            }
        }
    }
}
