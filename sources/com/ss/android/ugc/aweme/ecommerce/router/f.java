package com.ss.android.ugc.aweme.ecommerce.router;

import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.google.gson.o;
import com.ss.android.ugc.aweme.ecommerce.eventcenter.EventCenter;
import com.ss.android.ugc.aweme.ecommerce.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.utils.dg;
import com.zhiliaoapp.musically.R;
import f.a.z;
import h.f.b.l;
import h.f.b.m;
import java.util.LinkedHashMap;
import java.util.Map;

public final class f implements IInterceptor, IEventCenter.b {

    /* renamed from: c  reason: collision with root package name */
    public static final b f87150c = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public int f87151a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f87152b;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f87153d = h.i.a((h.f.a.a) new c(this));

    public static final class a {
        @com.google.gson.a.c(a = "cashier_id")

        /* renamed from: a  reason: collision with root package name */
        public final String f87154a;

        static {
            Covode.recordClassIndex(54690);
        }

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof a) && l.a(this.f87154a, ((a) obj).f87154a);
            }
            return true;
        }

        public final int hashCode() {
            String str = this.f87154a;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            return "CashierParams(cashierId=" + this.f87154a + ")";
        }
    }

    static {
        Covode.recordClassIndex(54689);
    }

    public final Map<String, o> a() {
        return (Map) this.f87153d.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(54691);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public static final class d implements z<com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.payment.a.c>> {
        static {
            Covode.recordClassIndex(54693);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        d() {
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            EventCenter.a().a("ec_send_caisher", "{}");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.payment.a.c> aVar) {
            o oVar;
            String str;
            com.ss.android.ugc.aweme.ecommerce.api.model.a<com.ss.android.ugc.aweme.ecommerce.payment.a.c> aVar2 = aVar;
            l.d(aVar2, "");
            T t = aVar2.data;
            if (t != null) {
                oVar = t.f86281a;
            } else {
                oVar = null;
            }
            IEventCenter a2 = EventCenter.a();
            if (oVar == null || (str = oVar.toString()) == null) {
                str = "{}";
            }
            l.b(str, "");
            a2.a("ec_send_caisher", str);
        }
    }

    static final class c extends m implements h.f.a.a<Map<String, o>> {
        final /* synthetic */ f this$0;

        static {
            Covode.recordClassIndex(54692);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(f fVar) {
            super(0);
            this.this$0 = fVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Map<String, o> invoke() {
            EventCenter.a().a("ec_fetch_caisher", this.this$0);
            return new LinkedHashMap();
        }
    }

    @Override // com.bytedance.router.interceptor.IInterceptor
    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        String str;
        if (routeIntent != null) {
            str = routeIntent.getHost();
        } else {
            str = null;
        }
        return l.a((Object) str, (Object) "ec");
    }

    /* renamed from: com.ss.android.ugc.aweme.ecommerce.router.f$f  reason: collision with other inner class name */
    static final class C2103f<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f87157a;

        static {
            Covode.recordClassIndex(54695);
        }

        C2103f(f fVar) {
            this.f87157a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f87157a.f87151a = 2;
            if (this.f87157a.f87152b) {
                this.f87157a.a(null);
            }
        }
    }

    static final class h<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f87160a;

        static {
            Covode.recordClassIndex(54697);
        }

        h(f fVar) {
            this.f87160a = fVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f87160a.f87151a = 2;
            if (this.f87160a.f87152b) {
                this.f87160a.a(null);
            }
        }
    }

    static final class i extends m implements h.f.a.b<com.bytedance.tux.dialog.b.b, h.z> {

        /* renamed from: a  reason: collision with root package name */
        public static final i f87161a = new i();

        static {
            Covode.recordClassIndex(54698);
        }

        i() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ h.z invoke(com.bytedance.tux.dialog.b.b bVar) {
            com.bytedance.tux.dialog.b.b bVar2 = bVar;
            l.d(bVar2, "");
            bVar2.a(R.string.bit, (h.f.a.b<? super com.bytedance.tux.dialog.b.a, h.z>) null);
            return h.z.f158842a;
        }
    }

    static final class e<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f87155a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f87156b;

        static {
            Covode.recordClassIndex(54694);
        }

        e(f fVar, String str) {
            this.f87155a = fVar;
            this.f87156b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            T t = ((com.ss.android.ugc.aweme.ecommerce.api.model.a) obj).data;
            this.f87155a.f87151a = 2;
            o oVar = null;
            if (this.f87155a.f87152b) {
                f fVar = this.f87155a;
                if (t != null) {
                    oVar = t.f86281a;
                }
                fVar.a(oVar);
                return;
            }
            Map<String, o> a2 = this.f87155a.a();
            String str = this.f87156b;
            if (t != null) {
                oVar = t.f86281a;
            }
            a2.put(str, oVar);
        }
    }

    static final class g<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f87158a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f87159b;

        static {
            Covode.recordClassIndex(54696);
        }

        g(f fVar, String str) {
            this.f87158a = fVar;
            this.f87159b = str;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            T t = ((com.ss.android.ugc.aweme.ecommerce.api.model.a) obj).data;
            this.f87158a.f87151a = 2;
            o oVar = null;
            if (this.f87158a.f87152b) {
                f fVar = this.f87158a;
                if (t != null) {
                    oVar = t.f86281a;
                }
                fVar.a(oVar);
                return;
            }
            Map<String, o> a2 = this.f87158a.a();
            String str = this.f87159b;
            if (t != null) {
                oVar = t.f86281a;
            }
            a2.put(str, oVar);
        }
    }

    public final synchronized void a(o oVar) {
        String str;
        MethodCollector.i(5182);
        if (this.f87151a == 2) {
            IEventCenter a2 = EventCenter.a();
            if (oVar == null || (str = oVar.toString()) == null) {
                str = "{}";
            }
            l.b(str, "");
            a2.a("ec_send_caisher", str);
            this.f87152b = false;
            this.f87151a = 0;
        }
        MethodCollector.o(5182);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.service.IEventCenter.b
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        if (str.hashCode() != 2045788583 || !str.equals("ec_fetch_caisher")) {
            return;
        }
        if (this.f87151a == 0) {
            PaymentApi.a.a().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new d());
            return;
        }
        this.f87152b = true;
        a(a().get(((a) dg.a(str2, a.class)).f87154a));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v22, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x032d, code lost:
        if (r0 == null) goto L_0x032f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b4, code lost:
        if (r5.equals("orderdetail") != false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013d, code lost:
        if (r5.equals("viewcode") != false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0146, code lost:
        if (r5.equals("orderlist") != false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0148, code lost:
        r5 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        r0 = r23.getExtra();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0154, code lost:
        if (r0 == null) goto L_0x01a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0156, code lost:
        r0 = a(r0, "url");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x015a, code lost:
        r9 = android.net.Uri.parse(r0).buildUpon().appendQueryParameter("cashier_id", r5);
        r0 = r23.getExtra();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x016a, code lost:
        if (r0 == null) goto L_0x01a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x016c, code lost:
        r0 = a(r0, "source");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0170, code lost:
        r7 = r9.appendQueryParameter("source", r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0174, code lost:
        if (r8 == null) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x017b, code lost:
        if ((!h.m.p.a((java.lang.CharSequence) r8)) == false) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x017d, code lost:
        r7.appendQueryParameter("trackParams", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0180, code lost:
        if (r22 == null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0182, code lost:
        r2 = com.ss.android.ugc.aweme.bullet.impl.BulletService.f();
        r0 = r7.build().toString();
        h.f.b.l.b(r0, r4);
        r2.a(r22, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0194, code lost:
        r2 = r23.getExtra();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0198, code lost:
        if (r2 == null) goto L_0x01a5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x019a, code lost:
        r7 = a(r2, "requestParams");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01a1, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01a3, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01a5, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r2 = com.ss.android.ugc.aweme.ecommerce.router.j.a().a(r7, java.util.HashMap.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b1, code lost:
        r2 = null;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x021e  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001a  */
    @Override // com.bytedance.router.interceptor.IInterceptor
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptRoute(android.content.Context r22, com.bytedance.router.RouteIntent r23) {
        /*
        // Method dump skipped, instructions count: 988
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.router.f.onInterceptRoute(android.content.Context, com.bytedance.router.RouteIntent):boolean");
    }
}
