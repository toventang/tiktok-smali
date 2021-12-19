package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.account.experiment.MultiAccountService;
import com.ss.android.ugc.aweme.account.guestmode.GuestModeServiceImpl;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService;
import com.ss.android.ugc.aweme.compliance.api.services.agegate.c;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class AgeGateServiceImpl implements IAgeGateService {

    /* renamed from: a  reason: collision with root package name */
    public static final a f77151a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Keva f77152b = Keva.getRepo("age_gate_service_repo");

    /* renamed from: c  reason: collision with root package name */
    private final List<c> f77153c = new ArrayList();

    static {
        Covode.recordClassIndex(47693);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(47694);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean d() {
        return this.f77152b.getBoolean("age_gate_completed", false);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void b() {
        Activity j2;
        if (in.f() && (j2 = f.j()) != null && !com.ss.android.ugc.aweme.compliance.api.services.depend.a.a().a()) {
            b.d().a(j2);
        }
    }

    public static IAgeGateService e() {
        MethodCollector.i(6126);
        Object a2 = com.ss.android.ugc.b.a(IAgeGateService.class, false);
        if (a2 != null) {
            IAgeGateService iAgeGateService = (IAgeGateService) a2;
            MethodCollector.o(6126);
            return iAgeGateService;
        }
        if (com.ss.android.ugc.b.aA == null) {
            synchronized (IAgeGateService.class) {
                try {
                    if (com.ss.android.ugc.b.aA == null) {
                        com.ss.android.ugc.b.aA = new AgeGateServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6126);
                    throw th;
                }
            }
        }
        AgeGateServiceImpl ageGateServiceImpl = (AgeGateServiceImpl) com.ss.android.ugc.b.aA;
        MethodCollector.o(6126);
        return ageGateServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final int a() {
        if (GuestModeServiceImpl.d().c() || MultiAccountService.c().b()) {
            return 0;
        }
        if (com.ss.android.ugc.aweme.compliance.common.b.c() > 0) {
            return com.ss.android.ugc.aweme.compliance.common.b.c();
        }
        return 2;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final boolean c() {
        Long valueOf;
        if (com.ss.android.ugc.aweme.compliance.common.b.c() != 1) {
            return false;
        }
        com.ss.android.ugc.aweme.compliance.common.b.a aVar = com.ss.android.ugc.aweme.compliance.common.b.f77288b;
        if (aVar.f77306f != null) {
            valueOf = aVar.f77306f;
        } else {
            valueOf = Long.valueOf(aVar.f77301a.getLong("age_gate_block_device_register_expire_time", 0));
        }
        if (valueOf == null) {
            return false;
        }
        long longValue = valueOf.longValue();
        if (longValue <= 0 || System.currentTimeMillis() / 1000 > longValue) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void a(c cVar) {
        l.d(cVar, "");
        this.f77153c.add(cVar);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.agegate.IAgeGateService
    public final void a(boolean z) {
        Iterator<T> it = this.f77153c.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
        if (z) {
            this.f77152b.storeBoolean("age_gate_completed", true);
        } else {
            this.f77152b.erase("age_gate_completed");
        }
    }
}
