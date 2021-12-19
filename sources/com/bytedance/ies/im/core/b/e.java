package com.bytedance.ies.im.core.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.f.d;
import com.bytedance.ies.im.core.c.g;
import com.bytedance.im.core.d.u;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class e extends Handler implements com.bytedance.ies.im.core.api.a.b {

    /* renamed from: a  reason: collision with root package name */
    static volatile boolean f34005a;

    /* renamed from: b  reason: collision with root package name */
    static volatile boolean f34006b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final e f34007c = new e();

    /* renamed from: d  reason: collision with root package name */
    private static volatile int f34008d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f34009e;

    /* renamed from: f  reason: collision with root package name */
    private static final h f34010f = i.a((h.f.a.a) a.f34011a);

    private static CopyOnWriteArraySet<b> g() {
        return (CopyOnWriteArraySet) f34010f.getValue();
    }

    static final class a extends m implements h.f.a.a<CopyOnWriteArraySet<b>> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34011a = new a();

        static {
            Covode.recordClassIndex(20255);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ CopyOnWriteArraySet<b> invoke() {
            return new CopyOnWriteArraySet();
        }
    }

    private e() {
        super(Looper.getMainLooper());
    }

    public final void e() {
        f34008d = 0;
        removeMessages(1);
    }

    static {
        Covode.recordClassIndex(20254);
    }

    public final void a() {
        if (!f34009e) {
            f34009e = true;
            com.bytedance.ies.im.core.api.a.b().b("TokenManager", "init");
            f34006b = true;
            f();
        }
    }

    public static String c() {
        if (!com.bytedance.ies.im.core.api.a.e().a()) {
            com.bytedance.ies.im.core.api.a.b().b("TokenManager", "getToken not login");
            return "";
        }
        String a2 = com.bytedance.ies.im.core.h.a.a();
        String c2 = com.bytedance.ies.im.core.api.a.e().c();
        if (c2 == null) {
            c2 = "";
        }
        com.bytedance.ies.im.core.api.a.b().b("TokenManager", "getToken: " + a2 + ", " + c2 + ", " + g.a());
        if (a2.length() > 0) {
            return a2;
        }
        if (g.a()) {
            return c2;
        }
        return "";
    }

    public final void b() {
        String a2 = com.bytedance.ies.im.core.h.a.a();
        com.bytedance.ies.im.core.api.a.b().b("TokenManager", "ensure: " + f34009e + ", " + f34006b + ", " + a2 + ' ' + com.bytedance.ies.im.core.api.a.e().c());
        if (!f34009e) {
            a();
        }
        if (a2.length() == 0) {
            f();
        }
    }

    public final void d() {
        com.bytedance.ies.im.core.api.a.b().b("TokenManager", "retryTokenTask: " + f34005a + ", " + f34008d);
        if (!f34005a && f34008d < 10) {
            f34008d++;
            removeMessages(1);
            sendEmptyMessageDelayed(1, ((long) f34008d) * 3000);
        }
    }

    public final void f() {
        if (com.bytedance.ies.im.core.api.a.e().e()) {
            com.bytedance.ies.im.core.api.a.b().b("TokenManager", "doFetchTask forbid by ftc");
            return;
        }
        com.bytedance.ies.im.core.api.a.e();
        com.bytedance.ies.im.core.api.a.b().b("TokenManager", "doFetchTask start: " + f34005a + ", " + com.bytedance.ies.im.core.api.a.e().a());
        if (!f34005a) {
            if (!com.bytedance.ies.im.core.api.a.e().a()) {
                e();
                a("");
                return;
            }
            f34005a = true;
            com.bytedance.ies.im.core.api.a.c().a(f34006b, com.bytedance.ies.im.core.api.e.a.a(b.f34012a, c.f34013a));
        }
    }

    public static void a(b bVar) {
        l.d(bVar, "");
        g().add(bVar);
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<u, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34013a = new c();

        static {
            Covode.recordClassIndex(20257);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(u uVar) {
            com.bytedance.ies.im.core.api.a.b().c("TokenManager", "doFetchTask onError=".concat(String.valueOf(uVar)));
            e.f34005a = false;
            e.f34007c.d();
            return z.f158842a;
        }
    }

    public final void handleMessage(Message message) {
        l.d(message, "");
        removeMessages(1);
        com.bytedance.ies.im.core.api.a.b().b("TokenManager", "handleMessage: " + f34008d);
        if (message.what == 1) {
            f();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<d, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34012a = new b();

        static {
            Covode.recordClassIndex(20256);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(d dVar) {
            String imToken;
            d dVar2 = dVar;
            com.bytedance.ies.im.core.api.a.b().b("TokenManager", "doFetchTask onResult=".concat(String.valueOf(dVar2)));
            e.f34006b = false;
            if (dVar2 == null || (imToken = dVar2.getImToken()) == null || imToken.length() == 0) {
                e.f34005a = false;
                e.f34007c.d();
            } else {
                e eVar = e.f34007c;
                if (dVar2 == null) {
                    l.b();
                }
                String imToken2 = dVar2.getImToken();
                if (imToken2 == null) {
                    imToken2 = "";
                }
                eVar.a(imToken2);
                e.f34007c.e();
                e.f34005a = false;
            }
            return z.f158842a;
        }
    }

    public final void a(String str) {
        String a2 = com.bytedance.ies.im.core.h.a.a();
        com.bytedance.ies.im.core.h.a.a(str);
        if (!l.a((Object) a2, (Object) str)) {
            a(a2, str);
        }
        com.bytedance.ies.im.core.api.a.b().b("TokenManager", "updateLocalToken: " + a2 + ", " + str);
    }

    private static void a(String str, String str2) {
        Iterator<T> it = g().iterator();
        while (it.hasNext()) {
            it.next().a(str, str2);
        }
    }

    @Override // com.bytedance.ies.im.core.api.a.b
    public final void a(com.bytedance.ies.im.core.api.a.a aVar, com.bytedance.ies.im.core.api.a.c cVar) {
        String str;
        l.d(aVar, "");
        com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
        StringBuilder append = new StringBuilder("onAccountChange: ").append(aVar).append(", ");
        if (cVar != null) {
            str = cVar.f33946a;
        } else {
            str = null;
        }
        b2.b("TokenManager", append.append(str).toString());
        a("");
        if (aVar == com.bytedance.ies.im.core.api.a.a.LOGIN || aVar == com.bytedance.ies.im.core.api.a.a.SWITCH) {
            f34006b = true;
            f();
        }
    }
}
