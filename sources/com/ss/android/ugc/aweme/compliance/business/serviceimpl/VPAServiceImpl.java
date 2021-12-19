package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService;
import com.ss.android.ugc.aweme.compliance.common.api.ComplianceApi;
import com.ss.android.ugc.aweme.compliance.common.b;
import f.a.t;
import f.a.z;
import h.f.b.l;
import org.json.JSONObject;

public final class VPAServiceImpl implements IVPAService {
    static {
        Covode.recordClassIndex(47715);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    public final Object f() {
        return com.ss.android.ugc.aweme.compliance.business.e.a.f76918a;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    public final int d() {
        return b.f77288b.d();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    public final void e() {
        b.f77288b.a(0);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    public final boolean a() {
        Boolean enableVpa;
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 == null || (enableVpa = c2.getEnableVpa()) == null) {
            return false;
        }
        return enableVpa.booleanValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    public final String b() {
        String vpaInfoBarUrl;
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 == null || (vpaInfoBarUrl = c2.getVpaInfoBarUrl()) == null) {
            return "";
        }
        return vpaInfoBarUrl;
    }

    public static IVPAService h() {
        MethodCollector.i(5673);
        Object a2 = com.ss.android.ugc.b.a(IVPAService.class, false);
        if (a2 != null) {
            IVPAService iVPAService = (IVPAService) a2;
            MethodCollector.o(5673);
            return iVPAService;
        }
        if (com.ss.android.ugc.b.aM == null) {
            synchronized (IVPAService.class) {
                try {
                    if (com.ss.android.ugc.b.aM == null) {
                        com.ss.android.ugc.b.aM = new VPAServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5673);
                    throw th;
                }
            }
        }
        VPAServiceImpl vPAServiceImpl = (VPAServiceImpl) com.ss.android.ugc.b.aM;
        MethodCollector.o(5673);
        return vPAServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    public final int c() {
        Integer defaultVpaContentChoice;
        if (b.f77288b.d() != 0) {
            return b.f77288b.d();
        }
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 == null || (defaultVpaContentChoice = c2.getDefaultVpaContentChoice()) == null) {
            return 1;
        }
        return defaultVpaContentChoice.intValue();
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    public final Integer g() {
        Integer defaultVpaContentChoice;
        ComplianceSetting c2 = b.f77288b.c();
        if (c2 != null && (defaultVpaContentChoice = c2.getDefaultVpaContentChoice()) != null && defaultVpaContentChoice.intValue() == 0) {
            return 1;
        }
        ComplianceSetting c3 = b.f77288b.c();
        if (c3 != null) {
            return c3.getDefaultVpaContentChoice();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    public final void a(int i2) {
        b.f77288b.a(i2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    public final t<BaseResponse> b(int i2) {
        return ComplianceApi.b.a(ComplianceApi.a.a(), i2);
    }

    public static final class a implements z<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f77167a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f77168b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h.f.a.a f77169c;

        static {
            Covode.recordClassIndex(47716);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            l.d(th, "");
            b.f77288b.a(this.f77168b);
            n.a("opt_out_failed", "", (JSONObject) null);
            this.f77169c.invoke();
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            l.d(baseResponse2, "");
            if (baseResponse2.error_code == 0) {
                b.f77288b.a(3);
                this.f77167a.invoke();
                return;
            }
            b.f77288b.a(this.f77168b);
            n.a("opt_out_failed", "", (JSONObject) null);
            this.f77169c.invoke();
        }

        a(h.f.a.a aVar, int i2, h.f.a.a aVar2) {
            this.f77167a = aVar;
            this.f77168b = i2;
            this.f77169c = aVar2;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.vpa.IVPAService
    public final void a(h.f.a.a<h.z> aVar, h.f.a.a<h.z> aVar2) {
        l.d(aVar, "");
        l.d(aVar2, "");
        int d2 = b.f77288b.d();
        IAccountUserService g2 = com.ss.android.ugc.aweme.account.b.g();
        l.b(g2, "");
        if (!g2.isLogin()) {
            b.f77288b.a(3);
            aVar.invoke();
            return;
        }
        ComplianceApi.b.a(ComplianceApi.a.a(), 3).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b((z) new a(aVar, d2, aVar2));
    }
}
