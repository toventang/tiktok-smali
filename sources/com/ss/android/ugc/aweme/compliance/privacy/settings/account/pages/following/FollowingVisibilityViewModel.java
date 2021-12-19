package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.following;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.c;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import f.a.t;
import h.f.b.l;
import org.greenrobot.eventbus.j;

public final class FollowingVisibilityViewModel extends BasePrivacyUserSettingViewModel implements j {
    static {
        Covode.recordClassIndex(48120);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final Integer a(q qVar) {
        l.d(qVar, "");
        c cVar = qVar.f76688d;
        if (cVar != null) {
            return Integer.valueOf(cVar.f76646a);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    public final t<BaseResponse> b(int i2) {
        t<BaseResponse> a2 = a.f77475a.setFollowList("following_list", i2).b(a.C1790a.f77477a).a(a.b.f77478a);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(q qVar, int i2) {
        l.d(qVar, "");
        c cVar = qVar.f76688d;
        if (cVar != null) {
            cVar.f76646a = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(int i2, BaseResponse baseResponse) {
        String str;
        l.d(baseResponse, "");
        super.a(i2, baseResponse);
        if (i2 != 1) {
            str = "me";
        } else if (com.ss.android.ugc.aweme.compliance.privacy.a.a.b()) {
            str = "followers";
        } else {
            str = "everyone";
        }
        r.a("switch_following_list_setting", new d().a("enter_from", "privacy_setting").a("to_status", str).f66730a);
    }
}
