package com.ss.android.ugc.aweme.request_combine.request;

import b.i;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.compliance.api.model.ComplianceSetting;
import com.ss.android.ugc.aweme.compliance.api.services.settings.IComplianceSettingsService;
import com.ss.android.ugc.aweme.lego.aa;
import com.ss.android.ugc.aweme.lego.f;
import com.ss.android.ugc.aweme.lego.r;
import com.ss.android.ugc.aweme.request_combine.model.ComplianceSettingCombineModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineDataModel;
import com.ss.android.ugc.aweme.request_combine.model.SettingCombineModel;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;

public final class d extends b {

    /* renamed from: a  reason: collision with root package name */
    private final String f120667a = "/aweme/v1/compliance/settings/";

    /* renamed from: b  reason: collision with root package name */
    private com.ss.android.ugc.aweme.request_combine.a f120668b;

    static {
        Covode.recordClassIndex(78590);
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final String a() {
        return this.f120667a;
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final com.ss.android.ugc.aweme.request_combine.a b() {
        return this.f120668b;
    }

    static final class a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ComplianceSettingCombineModel f120669a;

        static {
            Covode.recordClassIndex(78591);
        }

        a(ComplianceSettingCombineModel complianceSettingCombineModel) {
            this.f120669a = complianceSettingCombineModel;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            IComplianceSettingsService j2 = com.ss.android.ugc.aweme.compliance.api.a.j();
            ComplianceSetting complianceSetting = this.f120669a.getComplianceSetting();
            if (complianceSetting == null) {
                l.b();
            }
            j2.a(complianceSetting);
            return z.f158842a;
        }
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final void a(f.b bVar) {
        l.d(bVar, "");
        bVar.b((r) new com.ss.android.ugc.aweme.request_combine.request.a.a(aa.IDLE));
    }

    @Override // com.ss.android.ugc.aweme.request_combine.request.b
    public final boolean a(SettingCombineModel settingCombineModel) {
        ComplianceSettingCombineModel complianceSettingCombineModel;
        ComplianceSetting complianceSetting;
        SettingCombineDataModel data;
        if (settingCombineModel == null || (data = settingCombineModel.getData()) == null) {
            complianceSettingCombineModel = null;
        } else {
            complianceSettingCombineModel = data.getComplianceSetting();
        }
        if (!(complianceSettingCombineModel == null || (complianceSetting = complianceSettingCombineModel.getComplianceSetting()) == null || complianceSetting.status_code != 0)) {
            this.f120668b = complianceSettingCombineModel;
            if (complianceSettingCombineModel.getComplianceSetting() != null) {
                i.b(new a(complianceSettingCombineModel), i.f4824a);
            }
            com.ss.android.ugc.aweme.request_combine.a aVar = this.f120668b;
            if (aVar == null || aVar.httpCode != 200) {
                return false;
            }
            return true;
        }
        return false;
    }
}
