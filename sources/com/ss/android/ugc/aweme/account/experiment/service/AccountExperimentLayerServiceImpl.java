package com.ss.android.ugc.aweme.account.experiment.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.IAccountExperimentLayerService;
import com.ss.android.ugc.aweme.cf;
import com.ss.android.ugc.aweme.feed.s;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.i.c;
import h.j.g;

public final class AccountExperimentLayerServiceImpl implements IAccountExperimentLayerService {

    /* renamed from: b  reason: collision with root package name */
    public static final a f63026b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public final Keva f63027a = Keva.getRepo("AccountExperimentLayers");

    /* renamed from: c  reason: collision with root package name */
    private final h f63028c = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(38820);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(38821);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.IAccountExperimentLayerService
    public final boolean a() {
        return SettingsManager.a().a("account_experiment_full_layer_allocation_override", false);
    }

    static final class b extends m implements h.f.a.a<Boolean> {
        final /* synthetic */ AccountExperimentLayerServiceImpl this$0;

        static {
            Covode.recordClassIndex(38822);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(AccountExperimentLayerServiceImpl accountExperimentLayerServiceImpl) {
            super(0);
            this.this$0 = accountExperimentLayerServiceImpl;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Boolean invoke() {
            if (this.this$0.f63027a.contains("AccountExperimentLayers")) {
                return Boolean.valueOf(this.this$0.f63027a.getBoolean("AccountExperimentLayers", false));
            }
            Boolean a2 = s.a();
            Keva keva = this.this$0.f63027a;
            l.b(a2, "");
            keva.storeBoolean("AccountExperimentLayers", a2.booleanValue());
            return a2;
        }
    }

    public static IAccountExperimentLayerService b() {
        MethodCollector.i(8534);
        Object a2 = com.ss.android.ugc.b.a(IAccountExperimentLayerService.class, false);
        if (a2 != null) {
            IAccountExperimentLayerService iAccountExperimentLayerService = (IAccountExperimentLayerService) a2;
            MethodCollector.o(8534);
            return iAccountExperimentLayerService;
        }
        if (com.ss.android.ugc.b.B == null) {
            synchronized (IAccountExperimentLayerService.class) {
                try {
                    if (com.ss.android.ugc.b.B == null) {
                        com.ss.android.ugc.b.B = new AccountExperimentLayerServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(8534);
                    throw th;
                }
            }
        }
        AccountExperimentLayerServiceImpl accountExperimentLayerServiceImpl = (AccountExperimentLayerServiceImpl) com.ss.android.ugc.b.B;
        MethodCollector.o(8534);
        return accountExperimentLayerServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.IAccountExperimentLayerService
    public final boolean a(cf cfVar) {
        l.d(cfVar, "");
        boolean z = false;
        if (this.f63027a.contains(cfVar.getId())) {
            return this.f63027a.getBoolean(cfVar.getId(), false);
        }
        if (!cfVar.getShouldFilterProvider().invoke().booleanValue()) {
            return false;
        }
        if (cfVar.getNewUserOnly() && !((Boolean) this.f63028c.getValue()).booleanValue()) {
            return false;
        }
        if (cfVar.getPercentAllocation().f79191b <= 0 || cfVar.getPercentAllocation().f79191b > 100) {
            throw new IllegalArgumentException("Invalid allocation percentage");
        }
        boolean z2 = true;
        if (!cfVar.getPercentAllocation().f79190a) {
            if (h.j.h.a(new g(1, 100), c.Default) <= cfVar.getPercentAllocation().f79191b) {
                z = true;
            }
            z2 = z;
        }
        this.f63027a.storeBoolean(cfVar.getId(), z2);
        return z2;
    }
}
