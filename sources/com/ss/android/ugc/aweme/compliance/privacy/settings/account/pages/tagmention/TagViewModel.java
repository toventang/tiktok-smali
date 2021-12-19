package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.tagmention;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.f;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.b;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import f.a.t;
import h.f.b.l;
import org.greenrobot.eventbus.j;

public final class TagViewModel extends BasePrivacyUserSettingViewModel implements j {
    static {
        Covode.recordClassIndex(48219);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    public final t<BaseResponse> b(int i2) {
        return a.d("tag", i2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final Integer a(q qVar) {
        l.d(qVar, "");
        f fVar = qVar.f76690f;
        if (fVar != null) {
            return Integer.valueOf(fVar.f76660c);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(q qVar, int i2) {
        l.d(qVar, "");
        f fVar = qVar.f76690f;
        if (fVar != null) {
            fVar.f76660c = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(int i2, BaseResponse baseResponse) {
        l.d(baseResponse, "");
        super.a(i2, baseResponse);
        r.a("change_tag_permission", new d().a("enter_from", "privacy_and_safety_settings").a("to_status", b.c.a(i2)).f66730a);
    }
}
