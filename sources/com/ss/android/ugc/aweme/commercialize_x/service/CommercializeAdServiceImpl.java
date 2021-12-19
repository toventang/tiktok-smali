package com.ss.android.ugc.aweme.commercialize_x.service;

import android.app.Application;
import android.content.Context;
import android.util.SparseArray;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.ss.android.ugc.aweme.commercialize.service.CommercializeAdOutService;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.b;
import com.ss.android.ugc.aweme.commercialize_ad_api.a.c;
import com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdOutService;
import com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService;
import com.ss.android.ugc.aweme.utils.dz;
import com.ss.android.ugc.aweme.utils.eb;
import h.f.b.l;
import h.f.b.m;

public final class CommercializeAdServiceImpl implements ICommercializeAdService {

    /* renamed from: a  reason: collision with root package name */
    private final dz f76344a = eb.a(a.f76346a);

    /* renamed from: b  reason: collision with root package name */
    private boolean f76345b;

    static {
        Covode.recordClassIndex(47110);
    }

    static final class a extends m implements h.f.a.a<b> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f76346a = new a();

        static {
            Covode.recordClassIndex(47111);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            ICommercializeAdOutService commercializeAdOutService;
            Object a2 = com.ss.android.ugc.b.a(ICommercializeAdOutService.class, false);
            if (a2 != null) {
                commercializeAdOutService = (ICommercializeAdOutService) a2;
                if (commercializeAdOutService == null) {
                    return null;
                }
            } else {
                commercializeAdOutService = new CommercializeAdOutService();
            }
            return commercializeAdOutService.a();
        }
    }

    public static ICommercializeAdService a() {
        MethodCollector.i(7738);
        Object a2 = com.ss.android.ugc.b.a(ICommercializeAdService.class, false);
        if (a2 != null) {
            ICommercializeAdService iCommercializeAdService = (ICommercializeAdService) a2;
            MethodCollector.o(7738);
            return iCommercializeAdService;
        }
        if (com.ss.android.ugc.b.ay == null) {
            synchronized (ICommercializeAdService.class) {
                try {
                    if (com.ss.android.ugc.b.ay == null) {
                        com.ss.android.ugc.b.ay = new CommercializeAdServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(7738);
                    throw th;
                }
            }
        }
        CommercializeAdServiceImpl commercializeAdServiceImpl = (CommercializeAdServiceImpl) com.ss.android.ugc.b.ay;
        MethodCollector.o(7738);
        return commercializeAdServiceImpl;
    }

    private final void b() {
        MethodCollector.i(7666);
        if (!this.f76345b) {
            synchronized (this) {
                try {
                    if (!this.f76345b) {
                        com.ss.android.ugc.aweme.commercialize_x.a.a.a();
                        this.f76345b = true;
                    }
                } finally {
                    MethodCollector.o(7666);
                }
            }
            return;
        }
        MethodCollector.o(7666);
    }

    private final com.ss.android.ugc.aweme.commercialize_ad_api.service.b a(c cVar) {
        b();
        return com.ss.android.ugc.aweme.commercialize_x.a.a.a(cVar.a());
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService
    public final com.ss.android.ugc.aweme.commercialize_ad_api.a.a a(int i2) {
        SparseArray<com.ss.android.ugc.aweme.commercialize_ad_api.a.a> b2;
        b bVar = (b) this.f76344a.a();
        if (bVar == null || (b2 = bVar.b()) == null) {
            return null;
        }
        return b2.get(i2);
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService
    public final Widget b(Context context, c cVar) {
        l.d(cVar, "");
        com.ss.android.ugc.aweme.commercialize_ad_api.service.b a2 = a(cVar);
        if (a2 != null) {
            return a2.b(context, cVar);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService
    public final com.ss.android.ugc.aweme.commercialize_ad_api.b.a c(Context context, c cVar) {
        l.d(cVar, "");
        com.ss.android.ugc.aweme.commercialize_ad_api.service.b a2 = a(cVar);
        if (a2 != null) {
            return a2.c(context, cVar);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService
    public final com.ss.android.ugc.aweme.commercialize_ad_api.b.b<?> a(Context context, c cVar) {
        l.d(context, "");
        l.d(cVar, "");
        com.ss.android.ugc.aweme.commercialize_ad_api.service.b a2 = a(cVar);
        if (a2 != null) {
            return a2.a(context, cVar);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService
    public final void a(Application application, b bVar, boolean z) {
        l.d(application, "");
        l.d(bVar, "");
        this.f76344a.a(bVar);
        if (z) {
            b();
        }
    }
}
