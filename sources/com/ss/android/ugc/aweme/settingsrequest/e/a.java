package com.ss.android.ugc.aweme.settingsrequest.e;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.SettingsRequestServiceImpl;
import com.ss.android.ugc.aweme.common.c;
import com.ss.android.ugc.aweme.profile.ae;
import com.ss.android.ugc.aweme.setting.serverpush.a.f;
import h.c.b.a.k;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.r;
import h.z;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.am;
import kotlinx.coroutines.ay;
import kotlinx.coroutines.bs;
import kotlinx.coroutines.bz;
import kotlinx.coroutines.internal.o;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f123216a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static List<com.ss.android.ugc.aweme.setting.serverpush.a> f123217b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private static com.ss.android.ugc.aweme.setting.serverpush.a f123218c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f123219d = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    /* renamed from: e  reason: collision with root package name */
    private static final h f123220e = i.a((h.f.a.a) C3191a.f123221a);

    private static c<com.ss.android.ugc.aweme.common.b<f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> b() {
        return (c) f123220e.getValue();
    }

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.settingsrequest.e.a$a  reason: collision with other inner class name */
    static final class C3191a extends m implements h.f.a.a<c<com.ss.android.ugc.aweme.common.b<f>, com.ss.android.ugc.aweme.setting.serverpush.b.c>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C3191a f123221a = new C3191a();

        static {
            Covode.recordClassIndex(80924);
        }

        C3191a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ c<com.ss.android.ugc.aweme.common.b<f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> invoke() {
            c<com.ss.android.ugc.aweme.common.b<f>, com.ss.android.ugc.aweme.setting.serverpush.b.c> providePushSettingFetchPresenter = com.ss.android.ugc.aweme.setting.services.f.f122672a.providePushSettingFetchPresenter();
            providePushSettingFetchPresenter.a_(new com.ss.android.ugc.aweme.setting.serverpush.b.c() {
                /* class com.ss.android.ugc.aweme.settingsrequest.e.a.C3191a.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(80925);
                }

                @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
                public final void a(f fVar) {
                    l.d(fVar, "");
                    a.a(fVar);
                }

                @Override // com.ss.android.ugc.aweme.setting.serverpush.b.c
                public final void a(Exception exc) {
                    l.d(exc, "");
                    a.a(exc);
                }
            });
            return providePushSettingFetchPresenter;
        }
    }

    static {
        Covode.recordClassIndex(80923);
        a();
        if (com.ss.android.common.util.f.a(d.a())) {
        }
    }

    private static void a() {
        f123217b.addAll(com.ss.android.ugc.aweme.setting.services.f.f122672a.a());
        Object a2 = com.ss.android.ugc.aweme.compliance.api.a.d().a();
        com.ss.android.ugc.aweme.setting.serverpush.a aVar = null;
        if (!(a2 instanceof com.ss.android.ugc.aweme.setting.serverpush.a)) {
            a2 = null;
        }
        com.ss.android.ugc.aweme.setting.serverpush.a aVar2 = (com.ss.android.ugc.aweme.setting.serverpush.a) a2;
        if (aVar2 != null) {
            a(aVar2);
        }
        Object f2 = com.ss.android.ugc.aweme.compliance.api.a.e().f();
        if (!(f2 instanceof com.ss.android.ugc.aweme.setting.serverpush.a)) {
            f2 = null;
        }
        com.ss.android.ugc.aweme.setting.serverpush.a aVar3 = (com.ss.android.ugc.aweme.setting.serverpush.a) f2;
        if (aVar3 != null) {
            a(aVar3);
        }
        Object pushSettingCallback = ae.f115954a.getPushSettingCallback();
        if (!(pushSettingCallback instanceof com.ss.android.ugc.aweme.setting.serverpush.a)) {
            pushSettingCallback = null;
        }
        com.ss.android.ugc.aweme.setting.serverpush.a aVar4 = (com.ss.android.ugc.aweme.setting.serverpush.a) pushSettingCallback;
        if (aVar4 != null) {
            a(aVar4);
        }
        for (com.ss.android.ugc.aweme.setting.serverpush.a aVar5 : SettingsRequestServiceImpl.i().a()) {
            a(aVar5);
        }
        Object j2 = com.ss.android.ugc.aweme.compliance.api.a.d().j();
        if (j2 instanceof com.ss.android.ugc.aweme.setting.serverpush.a) {
            aVar = j2;
        }
        com.ss.android.ugc.aweme.setting.serverpush.a aVar6 = aVar;
        if (aVar6 != null) {
            a(aVar6);
        }
    }

    private static void a(com.ss.android.ugc.aweme.setting.serverpush.a aVar) {
        f123217b.add(aVar);
    }

    /* access modifiers changed from: package-private */
    public static final class b extends k implements h.f.a.m<am, h.c.d<? super z>, Object> {
        final /* synthetic */ com.ss.android.ugc.aweme.setting.serverpush.a $callback;
        int label;

        static {
            Covode.recordClassIndex(80926);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(com.ss.android.ugc.aweme.setting.serverpush.a aVar, h.c.d dVar) {
            super(2, dVar);
            this.$callback = aVar;
        }

        @Override // h.c.b.a.a
        public final h.c.d<z> create(Object obj, h.c.d<?> dVar) {
            l.d(dVar, "");
            return new b(this.$callback, dVar);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
        @Override // h.f.a.m
        public final Object invoke(am amVar, h.c.d<? super z> dVar) {
            return ((b) create(amVar, dVar)).invokeSuspend(z.f158842a);
        }

        @Override // h.c.b.a.a
        public final Object invokeSuspend(Object obj) {
            h.c.a.a aVar = h.c.a.a.COROUTINE_SUSPENDED;
            int i2 = this.label;
            if (i2 == 0) {
                r.a(obj);
                long millis = TimeUnit.SECONDS.toMillis(1);
                this.label = 1;
                if (ay.a(millis, this) == aVar) {
                    return aVar;
                }
            } else if (i2 == 1) {
                r.a(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            a.a(this.$callback, true);
            return z.f158842a;
        }
    }

    public static void a(f fVar) {
        l.d(fVar, "");
        Iterator<T> it = f123217b.iterator();
        while (it.hasNext()) {
            it.next().a(fVar);
        }
        com.ss.android.ugc.aweme.setting.serverpush.a aVar = f123218c;
        if (aVar != null) {
            aVar.a(fVar);
        }
        f123218c = null;
    }

    public static void a(Exception exc) {
        Iterator<T> it = f123217b.iterator();
        while (it.hasNext()) {
            it.next().a(exc);
        }
        com.ss.android.ugc.aweme.setting.serverpush.a aVar = f123218c;
        if (aVar != null) {
            aVar.a(exc);
        }
        f123218c = null;
    }

    public static void a(com.ss.android.ugc.aweme.setting.serverpush.a aVar, boolean z) {
        f123218c = aVar;
        try {
            b().a(new Object[0]);
        } catch (Exception unused) {
            if (!z) {
                bz unused2 = kotlinx.coroutines.i.a(bs.f159054a, o.f159148a, null, new b(aVar, null), 2);
            } else {
                a(new Exception());
            }
        }
    }
}
