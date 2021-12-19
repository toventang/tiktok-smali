package com.ss.android.ugc.aweme.compliance.business.serviceimpl;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.LinearLayout;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.a;
import com.bytedance.ies.dmt.ui.dialog.dialogmanager.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.model.LegalEntityChangeInfo;
import com.ss.android.ugc.aweme.compliance.api.model.PolicyBodyLinkList;
import com.ss.android.ugc.aweme.compliance.api.model.i;
import com.ss.android.ugc.aweme.compliance.api.model.j;
import com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService;
import com.ss.android.ugc.aweme.compliance.business.policynotice.ui.c;
import com.ss.android.ugc.aweme.compliance.common.a;
import h.f.b.l;
import h.f.b.m;
import h.z;
import java.util.List;

public final class PolicyNoticeServiceImpl implements IPolicyNoticeService {
    static {
        Covode.recordClassIndex(47708);
    }

    static final class b extends m implements h.f.a.a<z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f77166a = new b();

        static {
            Covode.recordClassIndex(47710);
        }

        b() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* bridge */ /* synthetic */ z invoke() {
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void a() {
        if (com.ss.android.ugc.aweme.compliance.business.policynotice.a.f77072f == 1) {
            a.C0732a.f33434a.a(b.a.POLICY_NOTICE);
        } else {
            com.ss.android.ugc.aweme.compliance.business.policynotice.a.a().a(0);
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void b() {
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.f77068b = null;
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.f77067a = null;
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.f77069c = null;
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.f77070d = null;
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.f77071e = h.a.z.INSTANCE;
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.c();
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.a().a(1);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final String c() {
        LegalEntityChangeInfo legalEntityChangeInfo;
        String title;
        ComplianceSetting c2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.c();
        if (c2 == null || (legalEntityChangeInfo = c2.getLegalEntityChangeInfo()) == null || (title = legalEntityChangeInfo.getTitle()) == null) {
            return "";
        }
        return title;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final String d() {
        LegalEntityChangeInfo legalEntityChangeInfo;
        String body;
        ComplianceSetting c2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.c();
        if (c2 == null || (legalEntityChangeInfo = c2.getLegalEntityChangeInfo()) == null || (body = legalEntityChangeInfo.getBody()) == null) {
            return "";
        }
        return body;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final List<PolicyBodyLinkList> e() {
        LegalEntityChangeInfo legalEntityChangeInfo;
        List<PolicyBodyLinkList> bodyLinkList;
        ComplianceSetting c2 = com.ss.android.ugc.aweme.compliance.common.b.f77288b.c();
        if (c2 == null || (legalEntityChangeInfo = c2.getLegalEntityChangeInfo()) == null || (bodyLinkList = legalEntityChangeInfo.getBodyLinkList()) == null) {
            return h.a.z.INSTANCE;
        }
        return bodyLinkList;
    }

    public static IPolicyNoticeService f() {
        MethodCollector.i(4686);
        Object a2 = com.ss.android.ugc.b.a(IPolicyNoticeService.class, false);
        if (a2 != null) {
            IPolicyNoticeService iPolicyNoticeService = (IPolicyNoticeService) a2;
            MethodCollector.o(4686);
            return iPolicyNoticeService;
        }
        if (com.ss.android.ugc.b.aH == null) {
            synchronized (IPolicyNoticeService.class) {
                try {
                    if (com.ss.android.ugc.b.aH == null) {
                        com.ss.android.ugc.b.aH = new PolicyNoticeServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(4686);
                    throw th;
                }
            }
        }
        PolicyNoticeServiceImpl policyNoticeServiceImpl = (PolicyNoticeServiceImpl) com.ss.android.ugc.b.aH;
        MethodCollector.o(4686);
        return policyNoticeServiceImpl;
    }

    static final class a extends m implements h.f.a.b<j, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f77165a = new a();

        static {
            Covode.recordClassIndex(47709);
        }

        a() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(j jVar) {
            l.d(jVar, "");
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final View a(View view) {
        l.d(view, "");
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        Context context = view.getContext();
        l.b(context, "");
        c cVar = new c(context, (byte) 0);
        cVar.setVisibility(8);
        cVar.setLayoutParams(layoutParams);
        return cVar;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void a(int i2) {
        String str;
        d dVar = new d();
        if (i2 == 2) {
            str = "on";
        } else {
            str = "off";
        }
        r.a("tns_trending_setting", dVar.a("trending", str).f66730a);
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(new i("kr_consent_market_message", "v20200629", "bottom", null, null, null, null, null, null, null, 1016, null), new j(null, null, null, null, Integer.valueOf(i2), null, null, null, null, 1983), 0);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void a(Activity activity) {
        if (!com.ss.android.ugc.aweme.compliance.api.services.depend.a.a().a()) {
            if (!(activity instanceof e)) {
                activity = null;
            }
            e eVar = (e) activity;
            if (eVar != null) {
                eVar.runOnUiThread(new a.f(eVar));
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(new i(str, str2, "pop", null, null, null, null, null, null, null, 1016, null), new j(null, null, null, null, 2, null, null, null, true, 959), 0);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.policynotice.IPolicyNoticeService
    public final SpannableStringBuilder a(Context context, String str, List<PolicyBodyLinkList> list) {
        l.d(context, "");
        return com.ss.android.ugc.aweme.compliance.business.policynotice.a.a(context, str, list, a.f77165a, b.f77166a);
    }
}
