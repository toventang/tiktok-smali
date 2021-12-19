package com.ss.android.ugc.aweme.commercialize;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.aweme.commercialize.splash.topview.d;
import com.ss.android.ugc.aweme.commerce.i;
import com.ss.android.ugc.aweme.commercialize.feed.ax;
import com.ss.android.ugc.aweme.commercialize.feed.ba;
import com.ss.android.ugc.aweme.commercialize.feed.bc;
import com.ss.android.ugc.aweme.commercialize.feed.be;
import com.ss.android.ugc.aweme.commercialize.link.a;
import com.ss.android.ugc.aweme.commercialize.link.c;
import com.ss.android.ugc.aweme.commercialize.utils.ae;
import com.ss.android.ugc.aweme.commercialize.utils.ao;
import com.ss.android.ugc.aweme.commercialize.utils.az;
import com.ss.android.ugc.aweme.commercialize.utils.bb;
import com.ss.android.ugc.aweme.commercialize.utils.bd;
import com.ss.android.ugc.aweme.commercialize.utils.bt;
import com.ss.android.ugc.aweme.commercialize.utils.y;
import com.ss.android.ugc.aweme.services.CommerceDataServiceImpl;
import com.ss.android.ugc.b;

public class LegacyCommercializeServiceImpl implements ILegacyCommercializeService {

    /* renamed from: a  reason: collision with root package name */
    private be f73616a;

    /* renamed from: b  reason: collision with root package name */
    private bc f73617b;

    /* renamed from: c  reason: collision with root package name */
    private ba f73618c;

    /* renamed from: d  reason: collision with root package name */
    private az f73619d;

    /* renamed from: e  reason: collision with root package name */
    private a f73620e;

    /* renamed from: f  reason: collision with root package name */
    private bd f73621f;

    /* renamed from: g  reason: collision with root package name */
    private bb f73622g;

    static {
        Covode.recordClassIndex(45310);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final d g() {
        return com.ss.android.ugc.aweme.commercialize.splash.d.f75287e;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final com.ss.android.ugc.aweme.commercialize.utils.ba j() {
        return ao.f75591d;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final i e() {
        return com.ss.android.ugc.aweme.commerce.a.a.d();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final com.ss.android.ugc.aweme.commercialize.feed.bb i() {
        return com.ss.android.ugc.aweme.commercialize.feed.d.a();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final be a() {
        if (this.f73616a == null) {
            this.f73616a = new ax();
        }
        return this.f73616a;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final bc b() {
        if (this.f73617b == null) {
            this.f73617b = new CommerceDataServiceImpl();
        }
        return this.f73617b;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final ba c() {
        if (this.f73618c == null) {
            this.f73618c = new y();
        }
        return this.f73618c;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final az d() {
        if (this.f73619d == null) {
            this.f73619d = new ae();
        }
        return this.f73619d;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final a f() {
        if (this.f73620e == null) {
            this.f73620e = new c();
        }
        return this.f73620e;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final bd h() {
        if (this.f73621f == null) {
            this.f73621f = new bt();
        }
        return this.f73621f;
    }

    @Override // com.ss.android.ugc.aweme.commercialize.ILegacyCommercializeService
    public final bb k() {
        if (this.f73622g == null) {
            this.f73622g = new com.ss.android.ugc.aweme.commercialize.utils.b.c();
        }
        return this.f73622g;
    }

    public static ILegacyCommercializeService l() {
        MethodCollector.i(2506);
        Object a2 = b.a(ILegacyCommercializeService.class, false);
        if (a2 != null) {
            ILegacyCommercializeService iLegacyCommercializeService = (ILegacyCommercializeService) a2;
            MethodCollector.o(2506);
            return iLegacyCommercializeService;
        }
        if (b.aj == null) {
            synchronized (ILegacyCommercializeService.class) {
                try {
                    if (b.aj == null) {
                        b.aj = new LegacyCommercializeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2506);
                    throw th;
                }
            }
        }
        LegacyCommercializeServiceImpl legacyCommercializeServiceImpl = (LegacyCommercializeServiceImpl) b.aj;
        MethodCollector.o(2506);
        return legacyCommercializeServiceImpl;
    }
}
