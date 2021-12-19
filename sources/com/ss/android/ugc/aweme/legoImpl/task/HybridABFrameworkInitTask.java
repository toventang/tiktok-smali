package com.ss.android.ugc.aweme.legoImpl.task;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.s;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.logger.a;
import f.a.d.f;
import f.a.t;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.List;

public final class HybridABFrameworkInitTask implements w {

    /* renamed from: a  reason: collision with root package name */
    public static f.a.b.b f108003a;

    /* renamed from: b  reason: collision with root package name */
    public static final long f108004b = SystemClock.elapsedRealtime();

    /* renamed from: c  reason: collision with root package name */
    public static final h f108005c = i.a((h.f.a.a) c.f108014a);

    /* renamed from: d  reason: collision with root package name */
    public static final f<z> f108006d = e.f108016a;

    /* renamed from: e  reason: collision with root package name */
    public static final f<Throwable> f108007e = d.f108015a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f108008f = new a((byte) 0);

    /* renamed from: g  reason: collision with root package name */
    private static boolean f108009g;

    /* renamed from: h  reason: collision with root package name */
    private static final DeviceRegisterManager.a f108010h = new b();

    public interface HybridApi {

        /* renamed from: a  reason: collision with root package name */
        public static final a f108011a = a.f108012a;

        static {
            Covode.recordClassIndex(69250);
        }

        @l.b.f(a = "/tiktok/v1/hybrid/ab/")
        t<z> request(@l.b.t(a = "group_num") int i2);

        public static final class a {

            /* renamed from: a  reason: collision with root package name */
            static final /* synthetic */ a f108012a = new a();

            private a() {
            }

            static {
                Covode.recordClassIndex(69251);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    public static final class a {
        static {
            Covode.recordClassIndex(69252);
        }

        public static int a() {
            return ((Number) HybridABFrameworkInitTask.f108005c.getValue()).intValue();
        }

        private a() {
        }

        public static void b() {
            HybridABFrameworkInitTask.f108003a = ((HybridApi) RetrofitFactory.a().b(com.ss.android.c.b.f59141e).d().a(HybridApi.class)).request(a()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.h.a.b(f.a.k.a.f158006c)).a(HybridABFrameworkInitTask.f108006d, HybridABFrameworkInitTask.f108007e);
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static void a(int i2, int i3) {
            r.a("ab_backend_response_received", new com.ss.android.ugc.aweme.app.f.d().a("group_num", i2).a("duration", i3).f66730a);
        }
    }

    public static final class b implements DeviceRegisterManager.a {

        /* renamed from: a  reason: collision with root package name */
        private boolean f108013a;

        static {
            Covode.recordClassIndex(69253);
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z, boolean z2) {
        }

        b() {
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(boolean z) {
            if (z && !this.f108013a) {
                this.f108013a = true;
                a.b();
            }
        }

        @Override // com.ss.android.deviceregister.DeviceRegisterManager.a
        public final void a(String str, String str2) {
            if (!this.f108013a) {
                this.f108013a = true;
                a.b();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.BACKGROUND;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    static final class c extends m implements h.f.a.a<Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f108014a = new c();

        static {
            Covode.recordClassIndex(69254);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(b.a());
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    static {
        Covode.recordClassIndex(69249);
    }

    static final class d<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final d f108015a = new d();

        static {
            Covode.recordClassIndex(69255);
        }

        d() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            HybridABInfoService.b().a(true);
            a.a(a.a(), (int) (SystemClock.elapsedRealtime() - HybridABFrameworkInitTask.f108004b));
            f.a.b.b bVar = HybridABFrameworkInitTask.f108003a;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    static final class e<T> implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f108016a = new e();

        static {
            Covode.recordClassIndex(69256);
        }

        e() {
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            HybridABInfoService.b().a(true);
            a.a(a.a(), (int) (SystemClock.elapsedRealtime() - HybridABFrameworkInitTask.f108004b));
            f.a.b.b bVar = HybridABFrameworkInitTask.f108003a;
            if (bVar != null) {
                bVar.dispose();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        a.b.f109011a.a("method_hybrid_ab_run_duration", false);
        if (!f108009g) {
            f108009g = true;
            if (s.a().booleanValue() && (b.a() == b.f108023b || b.a() == b.f108024c)) {
                HybridABInfoService.b().a(false);
                a.b();
            } else if (s.a().booleanValue() && b.a() == b.f108022a) {
                HybridABInfoService.b().a(false);
                DeviceRegisterManager.addOnDeviceConfigUpdateListener(f108010h);
            }
            a.b.f109011a.b("method_hybrid_ab_run_duration", false);
        }
    }
}
