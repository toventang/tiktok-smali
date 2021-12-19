package com.ss.android.ugc.aweme.turbo.vi;

import android.content.Context;
import b.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.turbo.api.brand.ITurboViApi;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class TurboViImpl implements ITurboViApi {

    /* renamed from: a  reason: collision with root package name */
    public final int f141469a = 1000;

    /* renamed from: b  reason: collision with root package name */
    public final int f141470b = 10000;

    /* renamed from: c  reason: collision with root package name */
    public final int f141471c = 3;

    /* renamed from: d  reason: collision with root package name */
    public volatile boolean f141472d;

    static {
        Covode.recordClassIndex(92395);
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void applicationOnCreate(Context context, String str) {
        l.d(context, "");
        l.d(str, "");
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void openCamera() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void recordEnd() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void recordStart() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void videoComposeEnd() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void videoPlayEnd() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void waterMarkEnd() {
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void mainOnCreate() {
        b();
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void videoComposeStart() {
        c();
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void videoPlayStart() {
        b();
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void waterMarkStart() {
        c();
    }

    /* access modifiers changed from: package-private */
    public static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TurboViImpl f141474a;

        static {
            Covode.recordClassIndex(92397);
        }

        b(TurboViImpl turboViImpl) {
            this.f141474a = turboViImpl;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.g.a.b.a(11, this.f141474a.f141470b, this.f141474a.f141471c);
            return z.f158842a;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TurboViImpl f141475a;

        static {
            Covode.recordClassIndex(92398);
        }

        c(TurboViImpl turboViImpl) {
            this.f141475a = turboViImpl;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.g.a.b.a(12, this.f141475a.f141469a, this.f141475a.f141471c);
            return z.f158842a;
        }
    }

    private final void b() {
        if (this.f141472d) {
            i.b(new c(this), i.f4824a);
        }
    }

    private final void c() {
        if (this.f141472d) {
            i.b(new b(this), i.f4824a);
        }
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ TurboViImpl f141473a;

        static {
            Covode.recordClassIndex(92396);
        }

        a(TurboViImpl turboViImpl) {
            this.f141473a = turboViImpl;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            this.f141473a.f141472d = com.g.a.b.a("692acdfd902192d5fb014b72e301626c9964e620e9c56f6a6071f2ef4cc9bd0b");
            r.a("turbo_perf_init_result", new d().a("is_success", Boolean.valueOf(this.f141473a.f141472d)).a("brand", "vivo").f66730a);
            return z.f158842a;
        }
    }

    public static ITurboViApi a() {
        MethodCollector.i(6834);
        Object a2 = com.ss.android.ugc.b.a(ITurboViApi.class, false);
        if (a2 != null) {
            ITurboViApi iTurboViApi = (ITurboViApi) a2;
            MethodCollector.o(6834);
            return iTurboViApi;
        }
        if (com.ss.android.ugc.b.es == null) {
            synchronized (ITurboViApi.class) {
                try {
                    if (com.ss.android.ugc.b.es == null) {
                        com.ss.android.ugc.b.es = new TurboViImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6834);
                    throw th;
                }
            }
        }
        TurboViImpl turboViImpl = (TurboViImpl) com.ss.android.ugc.b.es;
        MethodCollector.o(6834);
        return turboViImpl;
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void startNewPage(String str) {
        l.d(str, "");
        b();
    }

    @Override // com.ss.android.ugc.aweme.turbo.api.ITurboApi
    public final void bootFinish(Context context) {
        l.d(context, "");
        if (((Boolean) com.ss.android.ugc.aweme.turbo.a.a.f141463a.getValue()).booleanValue()) {
            i.b(new a(this), i.f4824a);
        }
    }
}
