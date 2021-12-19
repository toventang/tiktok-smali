package com.ss.android.ugc.aweme.compliance.common.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.g;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.c.i;
import com.ss.android.ugc.aweme.compliance.api.model.AlgoFreeSettings;
import com.ss.android.ugc.aweme.compliance.api.model.CmplRespForEncrypt;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.u;
import com.ss.android.ugc.aweme.compliance.common.api.ComplianceApi;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import f.a.z;
import h.f.b.l;
import java.util.Objects;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final ComplianceApi f77319a = ComplianceApi.a.a();

    static {
        Covode.recordClassIndex(47812);
    }

    private static int a() {
        User currentUser;
        IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
        if (createIUserServicebyMonsterPlugin == null || (currentUser = createIUserServicebyMonsterPlugin.getCurrentUser()) == null) {
            return 0;
        }
        return currentUser.getUserMode();
    }

    /* renamed from: com.ss.android.ugc.aweme.compliance.common.d.a$a  reason: collision with other inner class name */
    public static final class C1779a implements z<AlgoFreeSettings> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.compliance.api.c.a f77320a;

        static {
            Covode.recordClassIndex(47813);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        public C1779a(com.ss.android.ugc.aweme.compliance.api.c.a aVar) {
            this.f77320a = aVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            int i2;
            l.d(th, "");
            com.ss.android.ugc.aweme.compliance.api.c.a aVar = this.f77320a;
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.a) {
                i2 = ((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode();
            } else {
                i2 = -1;
            }
            aVar.a(i2);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x006b, code lost:
            if (r2 == null) goto L_0x006d;
         */
        @Override // f.a.z
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onNext(com.ss.android.ugc.aweme.compliance.api.model.AlgoFreeSettings r33) {
            /*
            // Method dump skipped, instructions count: 181
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.compliance.common.d.a.C1779a.onNext(java.lang.Object):void");
        }
    }

    public static final class d<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f77324a;

        static {
            Covode.recordClassIndex(47816);
        }

        public d(i iVar) {
            this.f77324a = iVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            this.f77324a.a();
        }
    }

    public static final class e implements z<CmplRespForEncrypt> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f77325a;

        static {
            Covode.recordClassIndex(47817);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        e(c cVar) {
            this.f77325a = cVar;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(CmplRespForEncrypt cmplRespForEncrypt) {
            String imprId;
            CmplRespForEncrypt cmplRespForEncrypt2 = cmplRespForEncrypt;
            String str = "";
            l.d(cmplRespForEncrypt2, str);
            if (cmplRespForEncrypt2.status_code == 0) {
                com.ss.android.ugc.aweme.compliance.common.b.a(cmplRespForEncrypt2.getComplianceEncrypt());
                c cVar = this.f77325a;
                if (cVar != null) {
                    cVar.a();
                }
                com.ss.android.ugc.aweme.compliance.common.c.a.a("/aweme/v1/cmpl/set/settings/", 0);
                return;
            }
            LogPbBean logPb = cmplRespForEncrypt2.getLogPb();
            if (!(logPb == null || (imprId = logPb.getImprId()) == null)) {
                str = imprId;
            }
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/aweme/v1/cmpl/set/settings/", str, String.valueOf(cmplRespForEncrypt2.status_code));
            c cVar2 = this.f77325a;
            if (cVar2 != null) {
                cVar2.b();
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            int i2;
            String imprId;
            String str = "";
            l.d(th, str);
            StackTraceElement[] stackTrace = th.getStackTrace();
            l.b(stackTrace, str);
            String str2 = str;
            for (int i3 = 0; i3 < stackTrace.length; i3++) {
                str2 = str2 + stackTrace[i3].toString() + "\n";
            }
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                Object rawResponse = ((com.ss.android.ugc.aweme.base.api.a.b.a) th).getRawResponse();
                Objects.requireNonNull(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.api.model.CmplRespForEncrypt");
                LogPbBean logPb = ((CmplRespForEncrypt) rawResponse).getLogPb();
                if (!(logPb == null || (imprId = logPb.getImprId()) == null)) {
                    str = imprId;
                }
            }
            StringBuilder sb = new StringBuilder();
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.a) {
                i2 = ((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode();
            } else {
                i2 = -1;
            }
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/aweme/v1/cmpl/set/settings/", str, sb.append(String.valueOf(i2)).append("\n").append(th.getMessage()).append("\n").append(str2).toString());
            c cVar = this.f77325a;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    public static final class f implements z<BaseResponse> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f77326a;

        static {
            Covode.recordClassIndex(47818);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        f(d dVar) {
            this.f77326a = dVar;
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            String str;
            l.d(th, "");
            d dVar = this.f77326a;
            if (th instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
                str = ((com.ss.android.ugc.aweme.base.api.a.b.a) th).getErrorMsg();
            } else {
                str = "";
            }
            l.b(str, "");
            dVar.a(str);
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(BaseResponse baseResponse) {
            BaseResponse baseResponse2 = baseResponse;
            l.d(baseResponse2, "");
            if (baseResponse2.status_code != 0) {
                d dVar = this.f77326a;
                String str = baseResponse2.status_msg;
                l.b(str, "");
                dVar.a(str);
                return;
            }
            this.f77326a.a();
        }
    }

    public static final class c<T> implements f.a.d.f {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ i f77323a;

        static {
            Covode.recordClassIndex(47815);
        }

        public c(i iVar) {
            this.f77323a = iVar;
        }

        @Override // f.a.d.f
        public final /* synthetic */ void accept(Object obj) {
            u uVar = (u) obj;
            if (uVar.status_code == 0) {
                i iVar = this.f77323a;
                l.b(uVar, "");
                iVar.a(uVar);
                return;
            }
            this.f77323a.a();
        }
    }

    public static final class b implements z<ComplianceSetting> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f77321a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ b f77322b;

        static {
            Covode.recordClassIndex(47814);
        }

        @Override // f.a.z
        public final void onComplete() {
        }

        @Override // f.a.z
        public final void onSubscribe(f.a.b.b bVar) {
            l.d(bVar, "");
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // f.a.z
        public final /* synthetic */ void onNext(ComplianceSetting complianceSetting) {
            ComplianceSetting complianceSetting2 = complianceSetting;
            l.d(complianceSetting2, "");
            if (complianceSetting2.status_code == 0) {
                com.ss.android.ugc.aweme.compliance.common.b.a(complianceSetting2);
                b bVar = this.f77322b;
                if (bVar != null) {
                    bVar.a(complianceSetting2);
                }
                com.ss.android.ugc.aweme.compliance.common.c.a.a("/aweme/v1/compliance/settings/", 0);
                com.ss.android.ugc.aweme.compliance.common.b.f77289c = 3;
                return;
            }
            b bVar2 = this.f77322b;
            if (bVar2 != null) {
                bVar2.a();
            }
            if (com.ss.android.ugc.aweme.compliance.common.b.f77289c > 0) {
                com.ss.android.ugc.aweme.compliance.common.b.f77289c--;
                this.f77321a.a(this.f77322b);
            }
        }

        @Override // f.a.z
        public final void onError(Throwable th) {
            int i2;
            String imprId;
            String str = "";
            l.d(th, str);
            b bVar = this.f77322b;
            if (bVar != null) {
                bVar.a();
            }
            boolean z = th instanceof com.ss.android.ugc.aweme.base.api.a.b.a;
            if (z) {
                Object rawResponse = ((com.ss.android.ugc.aweme.base.api.a.b.a) th).getRawResponse();
                Objects.requireNonNull(rawResponse, "null cannot be cast to non-null type com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting");
                LogPbBean logPb = ((ComplianceSetting) rawResponse).getLogPb();
                if (!(logPb == null || (imprId = logPb.getImprId()) == null)) {
                    str = imprId;
                }
            }
            if (z) {
                i2 = ((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode();
            } else {
                i2 = 1;
            }
            com.ss.android.ugc.aweme.compliance.common.c.a.a("/aweme/v1/compliance/settings/", str, String.valueOf(i2));
            if (com.ss.android.ugc.aweme.compliance.common.b.f77289c > 0) {
                com.ss.android.ugc.aweme.compliance.common.b.f77289c--;
                this.f77321a.a(this.f77322b);
            }
        }

        b(a aVar, b bVar) {
            this.f77321a = aVar;
            this.f77322b = bVar;
        }
    }

    public final void a(b bVar) {
        if (!g.a()) {
            this.f77319a.getComplianceSetting(com.ss.android.ugc.aweme.compliance.api.a.o().h(), a()).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new b(this, bVar));
        }
    }

    public final void a(String str, c cVar) {
        l.d(str, "");
        this.f77319a.setComplianceSettings(str).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new e(cVar));
    }

    public final void a(String str, int i2, d dVar) {
        l.d(str, "");
        l.d(dVar, "");
        this.f77319a.setUserSetting(str, i2).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).b(new f(dVar));
    }
}
