package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.recommend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.api.model.s;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import f.a.t;
import h.f.b.l;
import org.greenrobot.eventbus.j;

public final class RecommendViewModel extends BasePrivacyUserSettingViewModel implements j {
    static {
        Covode.recordClassIndex(48165);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final Integer a(q qVar) {
        l.d(qVar, "");
        s sVar = qVar.f76691g;
        if (sVar != null) {
            return Integer.valueOf(sVar.f76694a);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    public final t<BaseResponse> b(int i2) {
        l.d("upvote", "");
        t<BaseResponse> a2 = a.f77475a.setRecommendSetting("upvote", i2).b(a.k.f77487a).a(a.l.f77488a);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(q qVar, int i2) {
        l.d(qVar, "");
        s sVar = qVar.f76691g;
        if (sVar != null) {
            sVar.f76694a = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(int i2, BaseResponse baseResponse) {
        String str;
        l.d(baseResponse, "");
        super.a(i2, baseResponse);
        if (i2 == 1) {
            str = "on";
        } else {
            str = "off";
        }
        r.a("change_recommend_permission", new d().a("enter_from", "recommend_permission").a("to_status", str).f66730a);
    }
}
