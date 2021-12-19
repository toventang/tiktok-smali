package com.ss.android.ugc.aweme.compliance.common.serviceimpl;

import android.app.Activity;
import com.appsflyer.AppsFlyerLib;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.compliance.api.c.e;
import com.ss.android.ugc.aweme.compliance.api.c.i;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.compliance.common.b;
import com.ss.android.ugc.aweme.compliance.common.d.a;
import h.f.b.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class ComplianceSettingsServiceImpl implements IComplianceSettingsService {
    static {
        Covode.recordClassIndex(47827);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void a() {
        b.f77288b.a((ComplianceSetting) null);
        b.f77295i = null;
        b.f77294h = true;
        b.a((com.ss.android.ugc.aweme.compliance.api.services.agegate.b) null);
    }

    public static IComplianceSettingsService b() {
        MethodCollector.i(5548);
        Object a2 = com.ss.android.ugc.b.a(IComplianceSettingsService.class, false);
        if (a2 != null) {
            IComplianceSettingsService iComplianceSettingsService = (IComplianceSettingsService) a2;
            MethodCollector.o(5548);
            return iComplianceSettingsService;
        }
        if (com.ss.android.ugc.b.aO == null) {
            synchronized (IComplianceSettingsService.class) {
                try {
                    if (com.ss.android.ugc.b.aO == null) {
                        com.ss.android.ugc.b.aO = new ComplianceSettingsServiceImpl();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(5548);
                    throw th;
                }
            }
        }
        ComplianceSettingsServiceImpl complianceSettingsServiceImpl = (ComplianceSettingsServiceImpl) com.ss.android.ugc.b.aO;
        MethodCollector.o(5548);
        return complianceSettingsServiceImpl;
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void a(com.ss.android.ugc.aweme.compliance.api.services.agegate.b bVar) {
        b.a(bVar);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void a(e eVar) {
        l.d(eVar, "");
        l.d(eVar, "");
        b.f77296j.add(eVar);
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void a(int i2) {
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONObject().put("field", "pers_ad_1p_mode").put("value", String.valueOf(i2)));
        String jSONArray2 = jSONArray.toString();
        l.b(jSONArray2, "");
        b.a(jSONArray2, new b.d(i2));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void a(i iVar) {
        l.d(iVar, "");
        l.d(iVar, "");
        a aVar = b.f77287a;
        l.d(iVar, "");
        aVar.f77319a.getUltimateComplianceSettings().b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new a.c(iVar), new a.d(iVar));
    }

    @Override // com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService
    public final void a(ComplianceSetting complianceSetting) {
        l.d(complianceSetting, "");
        l.d(complianceSetting, "");
        if (complianceSetting.getAgeGateInfo() != null) {
            b.a(complianceSetting);
            b.e();
            if (b.d()) {
                AppsFlyerLib.getInstance().setSharingFilterForAllPartners();
            }
            Activity j2 = f.j();
            if (j2 != null && (j2 instanceof androidx.fragment.app.e)) {
                j2.runOnUiThread(new b.a(j2));
            }
        }
    }
}
