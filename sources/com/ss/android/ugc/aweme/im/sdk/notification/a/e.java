package com.ss.android.ugc.aweme.im.sdk.notification.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.im.core.api.b.f;
import com.bytedance.im.core.d.ai;
import com.bytedance.im.core.d.u;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.sdk.notification.a.c;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.bf;
import kotlinx.coroutines.bz;

public final class e implements al, g {

    /* renamed from: b  reason: collision with root package name */
    public static final e f102841b = b.f102850a;

    /* renamed from: c  reason: collision with root package name */
    public static final a f102842c = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f102843a;

    /* renamed from: d  reason: collision with root package name */
    private final HashSet<String> f102844d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Integer> f102845e;

    /* renamed from: f  reason: collision with root package name */
    private int f102846f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f102847g;

    /* renamed from: h  reason: collision with root package name */
    private final h f102848h;

    /* renamed from: i  reason: collision with root package name */
    private final h f102849i;

    public final h c() {
        return (h) this.f102848h.getValue();
    }

    public final f d() {
        return (f) this.f102849i.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(65938);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class b {

        /* renamed from: a  reason: collision with root package name */
        static final e f102850a = new e((byte) 0);

        /* renamed from: b  reason: collision with root package name */
        public static final b f102851b = new b();

        private b() {
        }

        static {
            Covode.recordClassIndex(65939);
        }
    }

    static final class c extends m implements h.f.a.a<h> {
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(65940);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(e eVar) {
            super(0);
            this.this$0 = eVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ h invoke() {
            return new h(this.this$0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.notification.a.e$e  reason: collision with other inner class name */
    static final class C2598e extends m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2598e f102855a = new C2598e();

        static {
            Covode.recordClassIndex(65942);
        }

        C2598e() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return new f();
        }
    }

    public final boolean f() {
        if (c().f102858a == 0) {
            return true;
        }
        return false;
    }

    public final void g() {
        c.b();
        this.f102844d.clear();
        this.f102845e.clear();
    }

    static {
        Covode.recordClassIndex(65937);
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void a() {
        this.f102843a = false;
        String name = getClass().getName();
        l.b(name, "");
        a(name, 0, false);
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void b() {
        this.f102843a = true;
        String name = getClass().getName();
        l.b(name, "");
        a(name, 1, false);
    }

    private e() {
        this.f102844d = new HashSet<>();
        this.f102845e = new LinkedHashMap();
        this.f102843a = true;
        this.f102847g = true;
        this.f102848h = i.a((h.f.a.a) new c(this));
        this.f102849i = i.a((h.f.a.a) C2598e.f102855a);
        e();
        com.ss.android.ugc.aweme.im.service.e b2 = com.ss.android.ugc.aweme.im.sdk.common.controller.e.b.b();
        if (b2 != null) {
            b2.registerAppStateCallback(this);
        }
    }

    public final void e() {
        n a2 = n.a();
        l.b(a2, "");
        this.f102846f = a2.b();
        n a3 = n.a();
        l.b(a3, "");
        Set<String> c2 = a3.c();
        if (c2 != null) {
            this.f102844d.addAll(c2);
        }
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    public final void a(String str) {
        if (str != null && this.f102845e.containsKey(str)) {
            this.f102845e.remove(str);
        }
    }

    public static final class d implements com.bytedance.im.core.a.a.b<com.bytedance.im.core.d.h> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f102852a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f102853b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ai f102854c;

        static {
            Covode.recordClassIndex(65941);
        }

        @Override // com.bytedance.im.core.a.a.b
        public final void a(u uVar) {
            Throwable th;
            com.ss.android.ugc.aweme.im.service.m.a.e("DmHelper", "onGetModifyPropertyMsg add fail cause:" + this.f102854c.getMsgId() + ",error:" + uVar);
            if (uVar != null && (th = uVar.f38030h) != null) {
                com.ss.android.ugc.aweme.im.service.m.a.a(th);
            }
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // com.bytedance.im.core.a.a.b
        public final /* synthetic */ void a(com.bytedance.im.core.d.h hVar) {
            List<n> list;
            int i2;
            com.bytedance.im.core.d.h hVar2 = hVar;
            if (!(hVar2 == null || hVar2.isMute() || (list = this.f102853b.f102834a) == null)) {
                ArrayList arrayList = new ArrayList();
                for (T t : list) {
                    if (t.f102885b == a.ADD) {
                        arrayList.add(t);
                    }
                }
                ArrayList<n> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(h.a.n.a((Iterable) arrayList2, 10));
                for (n nVar : arrayList2) {
                    arrayList3.add(nVar.f102884a);
                }
                ArrayList<l> arrayList4 = arrayList3;
                if (!(arrayList4 == null || arrayList4.isEmpty())) {
                    com.ss.android.ugc.aweme.im.service.m.a.c("DmHelper", "onGetModifyPropertyMsg start:" + this.f102854c.getMsgId());
                    if (!this.f102852a.c().a() && c.a(this.f102854c)) {
                        for (l lVar : arrayList4) {
                            ai aiVar = this.f102854c;
                            Integer num = this.f102853b.f102835b;
                            if (num != null) {
                                i2 = num.intValue();
                            } else {
                                i2 = 0;
                            }
                            l.d(aiVar, "");
                            l.d(lVar, "");
                            c.a(new i(j.Property, aiVar, lVar, Integer.valueOf(i2), null, 16));
                        }
                        c.a();
                        this.f102852a.a(1000L);
                    }
                }
            }
        }

        public d(e eVar, b bVar, ai aiVar) {
            this.f102852a = eVar;
            this.f102853b = bVar;
            this.f102854c = aiVar;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ long $delayTime;
        int label;
        final /* synthetic */ e this$0;

        static {
            Covode.recordClassIndex(65943);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(e eVar, long j2, h.c.d dVar) {
            super(2, dVar);
            this.this$0 = eVar;
            this.$delayTime = j2;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new f(this.this$0, this.$delayTime, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((f) create(amVar, dVar)).invokeSuspend(z.f158842a);
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
                com.ss.android.ugc.aweme.im.sdk.notification.a.e$f$1 r1 = new com.ss.android.ugc.aweme.im.sdk.notification.a.e$f$1
                r0 = 0
                r1.<init>(r5, r0)
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
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.notification.a.e.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Override // com.ss.android.ugc.aweme.im.sdk.notification.a.g
    public final void a(int i2) {
        if (i2 == 0) {
            d().f102856a = false;
            if (this.f102847g) {
                a(30000L);
                this.f102847g = false;
                return;
            }
            a(1000L);
        } else if (i2 != 1) {
            if (i2 == 2) {
                c.b();
                c.a();
            }
        } else if (this.f102843a) {
            c.b();
        }
    }

    public final void a(long j2) {
        bz unused = kotlinx.coroutines.i.a(an.a(bf.f159040a), null, null, new f(this, j2, null), 3);
    }

    public final void a(List<ai> list, int i2) {
        l.d(list, "");
        if (!list.isEmpty() && !c().a()) {
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                T t2 = t;
                l.d(t2, "");
                if (t2.getReadStatus() != 1 && f.a.a().a(t2) && !t2.isSelf() && !l.a((Object) "1", (Object) t2.getExt().get("a:disable_inner_push")) && c.a((ai) t2)) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if ((!arrayList2.isEmpty()) && arrayList2 != null) {
                if (this.f102843a) {
                    c.a(c.a.ASSEMBLE, arrayList2);
                } else if (i2 == 3) {
                    c.a(c.a.ASSEMBLE, arrayList2);
                    a(30000L);
                } else {
                    c.a(c.a.NORMAL, arrayList2);
                    c.a();
                    a(1000L);
                }
            }
        }
    }

    public final void a(String str, int i2, boolean z) {
        l.d(str, "");
        if (z) {
            d().a();
        }
        c().a(str, i2);
    }
}
