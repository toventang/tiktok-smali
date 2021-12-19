package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.suggestaccount;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import f.a.t;
import h.f.b.l;
import org.greenrobot.eventbus.j;

public final class SugToContactsViewModel extends BasePrivacyUserSettingViewModel implements j {
    static {
        Covode.recordClassIndex(48174);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    public final t<BaseResponse> b(int i2) {
        return a.c("to_contacts", i2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final Integer a(q qVar) {
        l.d(qVar, "");
        com.ss.android.ugc.aweme.compliance.api.model.t tVar = qVar.f76686b;
        if (tVar != null) {
            return Integer.valueOf(tVar.f76695a);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(q qVar, int i2) {
        l.d(qVar, "");
        com.ss.android.ugc.aweme.compliance.api.model.t tVar = qVar.f76686b;
        if (tVar != null) {
            tVar.f76695a = i2;
        }
    }
}
