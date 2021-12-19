package com.bytedance.ies.im.core.f;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.im.core.internal.utils.q;
import com.bytedance.im.core.proto.IMCMD;
import com.google.gson.o;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.r;
import h.z;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.i;
import org.json.JSONException;
import org.json.JSONObject;

public final class d implements com.bytedance.ies.im.core.api.a.b, com.bytedance.ies.im.core.api.j.a, com.bytedance.ies.im.core.b.b {

    /* renamed from: a  reason: collision with root package name */
    static boolean f34135a;

    /* renamed from: b  reason: collision with root package name */
    public static final d f34136b = new d();

    /* renamed from: c  reason: collision with root package name */
    private static final am f34137c = an.a(bf.f159040a);

    /* renamed from: d  reason: collision with root package name */
    private static volatile int f34138d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile boolean f34139e;

    /* access modifiers changed from: package-private */
    public static final class a implements com.bytedance.im.core.c.a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f34140a = new a();

        static {
            Covode.recordClassIndex(20327);
        }

        a() {
        }
    }

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(String str) {
    }

    private d() {
    }

    static {
        Covode.recordClassIndex(20326);
    }

    private static com.bytedance.im.core.a.f d() {
        com.bytedance.im.core.a.f fVar = new com.bytedance.im.core.a.f();
        com.bytedance.ies.im.core.api.d.d a2 = com.bytedance.ies.im.core.api.a.a();
        fVar.f37597e = a2.c();
        fVar.f37598f = a2.f();
        fVar.f37604l = 0;
        fVar.f37593a = a2.g();
        fVar.f37595c = a2.g();
        fVar.f37600h = a2.h();
        fVar.f37594b = 2;
        fVar.v = 1;
        fVar.f37603k = 1000;
        fVar.D = true;
        fVar.M = "1000";
        fVar.aa = com.bytedance.ies.im.core.c.c.a();
        com.bytedance.ies.im.core.api.a.f();
        fVar.N = true;
        fVar.f37596d = !a2.g();
        com.bytedance.ies.im.core.api.f.a a3 = com.bytedance.ies.im.core.api.a.f().a();
        fVar.t = a3.f33962a;
        fVar.s = a3.f33963b;
        fVar.ae = a3.f33965d;
        fVar.W = a3.f33964c;
        fVar.aw = a3.f33966e;
        fVar.E = a3.f33968g;
        fVar.aN = false;
        fVar.aP = a3.f33970i;
        com.bytedance.ies.im.core.e.f.a(fVar);
        return fVar;
    }

    public final void a() {
        MethodCollector.i(332);
        try {
            if (((Boolean) com.bytedance.ies.im.core.e.d.f34056a.getValue()).booleanValue()) {
                synchronized (this) {
                    try {
                        f34136b.c();
                    } finally {
                        MethodCollector.o(332);
                    }
                }
                return;
            }
            c();
            MethodCollector.o(332);
        } catch (Throwable th) {
            com.bytedance.ies.im.core.api.a.b().a("SDKManager", "init error", th);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("error_msg", com.bytedance.im.core.g.b.a(th));
            jSONObject.put("error_stack", com.bytedance.im.core.g.b.b(th));
            com.bytedance.ies.im.core.api.a.b().c("im_sdk_init_error", jSONObject);
            MethodCollector.o(332);
        }
    }

    public final void b() {
        com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
        StringBuilder append = new StringBuilder("ensure: ").append(f34139e).append(", ").append(f34138d).append(", ");
        com.bytedance.im.core.a.d a2 = com.bytedance.im.core.a.d.a();
        l.b(a2, "");
        b2.b("SDKManager", append.append(a2.f37564d).toString());
        a();
        if (f34138d != 1) {
            com.bytedance.im.core.a.d a3 = com.bytedance.im.core.a.d.a();
            l.b(a3, "");
            if (!a3.f37564d) {
                e();
            }
        }
    }

    private void c() {
        Context a2 = com.bytedance.ies.im.core.api.a.a().a();
        com.bytedance.ies.im.core.api.a.b().b("SDKManager", "init: " + f34139e + ", " + com.bytedance.ies.im.core.api.a.e().a() + ", " + com.bytedance.ies.im.core.api.a.e().d() + ", " + a2);
        if (!f34139e) {
            com.bytedance.ies.im.core.b.e.a(this);
            com.bytedance.ies.im.core.i.a.f34189a.a(this);
            com.bytedance.im.core.a.d a3 = com.bytedance.im.core.a.d.a();
            q.a().f38787a = com.bytedance.ies.im.core.b.a.f33999a;
            a3.a(a2, d(), a.f34131a);
            l.b(a3, "");
            a3.a(b.f34132a);
            a3.f37563c = a.f34140a;
            try {
                o a4 = com.bytedance.ies.im.core.c.d.a();
                if (a4 != null) {
                    com.bytedance.im.core.internal.a.a(new JSONObject(a4.toString()));
                } else {
                    com.bytedance.ies.im.core.api.a.b().b("SDKManager", "init update settings empty config");
                }
            } catch (JSONException e2) {
                com.bytedance.ies.im.core.api.a.b().a("SDKManager", "init update settings error ", e2);
            }
            f34139e = true;
            g.a(a3);
            a3.f37568h = b.f34141a;
            com.bytedance.im.core.c.e.f37627a = e.f34144a;
            e();
        }
    }

    private static void f() {
        com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
        StringBuilder append = new StringBuilder("logoutSDK: ").append(com.bytedance.ies.im.core.api.a.e().d()).append(", ").append(com.bytedance.ies.im.core.b.e.c()).append(", ").append(com.bytedance.ies.im.core.api.a.e().a()).append(", ").append(f34138d);
        com.bytedance.im.core.a.d a2 = com.bytedance.im.core.a.d.a();
        l.b(a2, "");
        b2.b("SDKManager", append.append(a2.f37564d).append(", ").toString());
        f34138d = 0;
        com.bytedance.im.core.a.d a3 = com.bytedance.im.core.a.d.a();
        l.b(a3, "");
        if (a3.f37564d) {
            com.bytedance.ies.im.core.api.a.b().b("SDKManager", "logoutSDK real");
            com.bytedance.ies.im.core.g.c.c();
            com.bytedance.im.core.a.d.a().d();
            com.bytedance.ies.im.core.api.a.f().a(f.f34143a);
        }
    }

    private final void e() {
        if (!f34139e) {
            com.bytedance.ies.im.core.api.a.b().c("SDKManager", "loginSDK before init!");
            a();
            return;
        }
        if (f34135a) {
            com.bytedance.im.core.a.d a2 = com.bytedance.im.core.a.d.a();
            l.b(a2, "");
            a2.b().N = true;
        }
        if (com.bytedance.ies.im.core.api.a.e().e()) {
            com.bytedance.ies.im.core.api.a.b().b("SDKManager", "loginSDK forbid by ftc");
            return;
        }
        com.bytedance.ies.im.core.api.a.e();
        com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
        StringBuilder append = new StringBuilder("loginSDK: ").append(com.bytedance.ies.im.core.api.a.e().d()).append(", ").append(com.bytedance.ies.im.core.b.e.c()).append(", ").append(com.bytedance.ies.im.core.api.a.e().a()).append(", ").append(f34138d);
        com.bytedance.im.core.a.d a3 = com.bytedance.im.core.a.d.a();
        l.b(a3, "");
        b2.b("SDKManager", append.append(a3.f37564d).append(", ").append(com.bytedance.ies.im.core.c.a.a()).toString());
        com.bytedance.im.core.a.d a4 = com.bytedance.im.core.a.d.a();
        l.b(a4, "");
        if (!a4.f37564d && com.bytedance.ies.im.core.api.a.e().a() && com.bytedance.ies.im.core.b.e.c().length() != 0) {
            com.bytedance.ies.im.core.api.a.b().b("SDKManager", "loginSDK real");
            f34138d = 1;
            com.bytedance.ies.im.core.api.a.f().a(c.f34142a);
            if (com.bytedance.ies.im.core.c.a.a()) {
                bz unused = i.a(f34137c, null, null, new C0754d(null), 3);
            } else {
                com.bytedance.im.core.a.d.a().c();
            }
            if (!f34135a) {
                com.bytedance.im.core.a.d a5 = com.bytedance.im.core.a.d.a();
                l.b(a5, "");
                if (!a5.b().N) {
                    com.bytedance.ies.im.core.api.a.f();
                    com.bytedance.im.core.a.d.a().a(0);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f34142a = new c();

        static {
            Covode.recordClassIndex(20329);
        }

        c() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.c cVar) {
            com.bytedance.ies.im.core.api.b.c cVar2 = cVar;
            l.d(cVar2, "");
            cVar2.b();
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends m implements h.f.a.b<com.bytedance.ies.im.core.api.b.c, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final f f34143a = new f();

        static {
            Covode.recordClassIndex(20333);
        }

        f() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.ies.im.core.api.b.c cVar) {
            com.bytedance.ies.im.core.api.b.c cVar2 = cVar;
            l.d(cVar2, "");
            cVar2.c();
            return z.f158842a;
        }
    }

    @Override // com.bytedance.ies.im.core.api.j.a
    public final void a(com.bytedance.ies.im.core.api.j.b bVar) {
        l.d(bVar, "");
        l.d(bVar, "");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.ies.im.core.f.d$d  reason: collision with other inner class name */
    public static final class C0754d extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        int label;

        static {
            Covode.recordClassIndex(20330);
        }

        C0754d(h.c.d dVar) {
            super(2, dVar);
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new C0754d(dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((C0754d) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            if (this.label == 0) {
                r.a(obj);
                com.bytedance.im.core.a.d.a().c();
                return z.f158842a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements com.bytedance.im.core.a.i {

        /* renamed from: a  reason: collision with root package name */
        public static final b f34141a = new b();

        static {
            Covode.recordClassIndex(20328);
        }

        b() {
        }

        @Override // com.bytedance.im.core.a.i
        public final boolean a(Integer num) {
            int value = IMCMD.REPORT_CLIENT_METRICS.getValue();
            if (num != null && num.intValue() == value) {
                return true;
            }
            int value2 = IMCMD.GET_CONVERSATION_PARTICIPANTS_READ_INDEX_V3.getValue();
            if (num != null && num.intValue() == value2) {
                return true;
            }
            return false;
        }
    }

    static final class e extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ long $delayTime;
        int label;

        static {
            Covode.recordClassIndex(20331);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(long j2, h.c.d dVar) {
            super(2, dVar);
            this.$delayTime = j2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new e(this.$delayTime, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((e) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
        @Override // h.c.b.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                h.c.a.a r4 = h.c.a.a.COROUTINE_SUSPENDED
                int r0 = r5.label
                r3 = 2
                r2 = 1
                if (r0 == 0) goto L_0x0012
                if (r0 == r2) goto L_0x0020
                if (r0 != r3) goto L_0x0034
                h.r.a(r6)
            L_0x000f:
                h.z r0 = h.z.f158842a
                return r0
            L_0x0012:
                h.r.a(r6)
                long r0 = r5.$delayTime
                r5.label = r2
                java.lang.Object r0 = kotlinx.coroutines.ay.a(r0, r5)
                if (r0 != r4) goto L_0x0023
                return r4
            L_0x0020:
                h.r.a(r6)
            L_0x0023:
                kotlinx.coroutines.ci r2 = kotlinx.coroutines.internal.o.f159148a
                com.bytedance.ies.im.core.f.d$e$1 r1 = new com.bytedance.ies.im.core.f.d$e$1
                r0 = 0
                r1.<init>(r0)
                r5.label = r3
                java.lang.Object r0 = kotlinx.coroutines.i.a(r2, r1, r5)
                if (r0 != r4) goto L_0x000f
                return r4
            L_0x0034:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.im.core.f.d.e.invokeSuspend(java.lang.Object):java.lang.Object");
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
        b2.b("SDKManager", append.append(str).toString());
        f34135a = true;
        if (aVar == com.bytedance.ies.im.core.api.a.a.LOGOUT || aVar == com.bytedance.ies.im.core.api.a.a.SWITCH) {
            f();
        } else if (com.bytedance.ies.im.core.b.e.c().length() > 0) {
            e();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bd, code lost:
        if (r1 == -1) goto L_0x01bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01cd  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d0  */
    @Override // com.bytedance.ies.im.core.api.j.a
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.bytedance.common.wschannel.model.WsChannelMsg r13, com.bytedance.im.core.d.bd r14) {
        /*
        // Method dump skipped, instructions count: 502
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.im.core.f.d.a(com.bytedance.common.wschannel.model.WsChannelMsg, com.bytedance.im.core.d.bd):void");
    }

    @Override // com.bytedance.ies.im.core.b.b
    public final void a(String str, String str2) {
        com.bytedance.ies.im.core.api.d.b b2 = com.bytedance.ies.im.core.api.a.b();
        StringBuilder append = new StringBuilder("onTokenChanged: ").append(str).append(", ").append(str2).append(", ");
        com.bytedance.im.core.a.d a2 = com.bytedance.im.core.a.d.a();
        l.b(a2, "");
        b2.b("SDKManager", append.append(a2.f37564d).toString());
        if (str2 == null || str2.length() == 0) {
            com.bytedance.im.core.a.d a3 = com.bytedance.im.core.a.d.a();
            l.b(a3, "");
            if (a3.f37564d) {
                f();
                return;
            }
            return;
        }
        com.bytedance.im.core.a.d a4 = com.bytedance.im.core.a.d.a();
        l.b(a4, "");
        if (a4.f37564d) {
            com.bytedance.ies.im.core.api.a.b().b("SDKManager", "refreshSDKToken: " + com.bytedance.ies.im.core.b.e.c());
            com.bytedance.ies.im.core.e.e.a();
            return;
        }
        e();
    }
}
