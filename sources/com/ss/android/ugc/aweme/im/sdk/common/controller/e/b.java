package com.ss.android.ugc.aweme.im.sdk.common.controller.e;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.net.f;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.DefaultMainProxy;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IImplService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMServiceProvider;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.ImplService;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.n;
import com.ss.android.ugc.aweme.im.sdk.common.controller.utils.t;
import com.ss.android.ugc.aweme.im.sdk.privacy.data.api.UserSettingService;
import com.ss.android.ugc.aweme.im.service.e;
import h.c.b.a.k;
import h.c.d;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.r;
import h.z;
import java.util.HashMap;
import java.util.Map;
import kotlinx.coroutines.am;
import kotlinx.coroutines.an;
import kotlinx.coroutines.ay;
import kotlinx.coroutines.bf;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;

public final class b implements i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final am f102228a = an.a(bf.f159040a);

    /* renamed from: b  reason: collision with root package name */
    public static e f102229b;

    /* renamed from: c  reason: collision with root package name */
    public static com.ss.android.ugc.aweme.im.service.a f102230c;

    /* renamed from: d  reason: collision with root package name */
    public static volatile boolean f102231d;

    /* renamed from: e  reason: collision with root package name */
    public static final b f102232e = new b();

    /* renamed from: f  reason: collision with root package name */
    private static final h f102233f = h.i.a((h.f.a.a) C2556b.f102235a);

    /* renamed from: g  reason: collision with root package name */
    private static final long f102234g = System.currentTimeMillis();

    public static d a() {
        return (d) f102233f.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(183, new g(b.class, "onEvent", f.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    private b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.common.controller.e.b$b  reason: collision with other inner class name */
    static final class C2556b extends m implements h.f.a.a<d> {

        /* renamed from: a  reason: collision with root package name */
        public static final C2556b f102235a = new C2556b();

        static {
            Covode.recordClassIndex(65411);
        }

        C2556b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ d invoke() {
            return new d();
        }
    }

    public static void f() {
        com.bytedance.ies.im.core.api.b.a().a();
    }

    public static e b() {
        e eVar = f102229b;
        if (eVar == null) {
            return new DefaultMainProxy();
        }
        return eVar;
    }

    public static final IImplService d() {
        IImplService createIImplServicebyMonsterPlugin = ImplService.createIImplServicebyMonsterPlugin(false);
        l.b(createIImplServicebyMonsterPlugin, "");
        return createIImplServicebyMonsterPlugin;
    }

    static {
        Covode.recordClassIndex(65409);
    }

    public static boolean c() {
        try {
            com.ss.android.ugc.aweme.im.sdk.iescore.b.f.f102816a.a(com.ss.android.ugc.aweme.im.sdk.common.controller.k.a.f102341a);
            com.bytedance.ies.im.core.api.b.a().a(com.ss.android.ugc.aweme.im.sdk.chat.b.b.f100116a);
            com.bytedance.ies.im.core.api.b.a().a();
            return true;
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.im.service.m.a.a("AwemeImManager", "initInSubThread error", e2);
            return false;
        }
    }

    public static void e() {
        boolean z;
        if (com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a()) {
            long e2 = com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.e();
            n a2 = n.a();
            l.b(a2, "");
            if (e2 != a2.f102429b.getLong("userid", -1)) {
                z = true;
            } else {
                z = false;
            }
            n a3 = n.a();
            l.b(a3, "");
            a3.f102429b.edit().putLong("userid", e2).commit();
            com.ss.android.ugc.aweme.im.service.m.a.b("AwemeImManager", "refresh login: true, user changed ".concat(String.valueOf(z)));
            if (z) {
                com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.b.a(com.ss.android.ugc.aweme.im.sdk.relations.data.core.fetch.a.a.COLDUP_FULL, true);
            }
            IMServiceProvider.INSTANCE.getFamiliarService().a();
            UserSettingService.a.a().getUserSettings("").b(f.a.h.a.b(f.a.k.a.f158006c)).b(c.f102236a);
            return;
        }
        com.ss.android.ugc.aweme.im.service.m.a.b("AwemeImManager", "refresh login: false");
        n.a().f102429b.edit().remove("userid").remove("token").commit();
        g.c();
    }

    public static final class a extends k implements h.f.a.m<am, d<? super z>, Object> {
        final /* synthetic */ long $delayTime;
        int label;

        static {
            Covode.recordClassIndex(65410);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(long j2, d dVar) {
            super(2, dVar);
            this.$delayTime = j2;
        }

        @Override // h.c.b.a.a
        public final d<z> create(Object obj, d<?> dVar) {
            l.d(dVar, "");
            return new a(this.$delayTime, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, d<? super z> dVar) {
            return ((a) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                long j2 = this.$delayTime;
                this.label = 1;
                if (ay.a(j2, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.c();
            return z.f158842a;
        }
    }

    @org.greenrobot.eventbus.r
    public final void onEvent(f fVar) {
        l.d(fVar, "");
        com.ss.android.ugc.aweme.im.service.m.a.b("AwemeImManager", "onEvent");
        if (fVar.f76473a != 0 && com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a() && System.currentTimeMillis() - f102234g >= 5000) {
            t.a();
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<T1, T2> implements f.a.d.b {

        /* renamed from: a  reason: collision with root package name */
        public static final c f102236a = new c();

        static {
            Covode.recordClassIndex(65412);
        }

        c() {
        }

        @Override // f.a.d.b
        public final /* synthetic */ void a(Object obj, Object obj2) {
            com.ss.android.ugc.aweme.setting.serverpush.a.f fVar = (com.ss.android.ugc.aweme.setting.serverpush.a.f) obj;
            if (fVar != null) {
                n a2 = n.a();
                l.b(a2, "");
                a2.a(new com.ss.android.ugc.aweme.im.sdk.privacy.data.a.a(fVar.C, fVar.D, fVar.E));
            }
        }
    }
}
