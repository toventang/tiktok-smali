package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.likedlist;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.h;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import com.ss.android.ugc.aweme.setting.ui.bv;
import com.ss.android.ugc.d.a.c;
import f.a.t;
import h.f.b.l;
import org.greenrobot.eventbus.j;

public final class LikedListViewModel extends BasePrivacyUserSettingViewModel implements j {
    static {
        Covode.recordClassIndex(48135);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final Integer a(q qVar) {
        l.d(qVar, "");
        h hVar = qVar.f76687c;
        if (hVar != null) {
            return Integer.valueOf(hVar.f76667a);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    public final t<BaseResponse> b(int i2) {
        t<BaseResponse> a2 = a.f77475a.setLikedList("favorite_list", i2).b(a.i.f77485a).a(a.j.f77486a);
        l.b(a2, "");
        return a2;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(q qVar, int i2) {
        l.d(qVar, "");
        h hVar = qVar.f76687c;
        if (hVar != null) {
            hVar.f76667a = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(int i2, BaseResponse baseResponse) {
        String str;
        l.d(baseResponse, "");
        super.a(i2, baseResponse);
        s sVar = s.a.f66880a;
        l.b(sVar, "");
        aj<Integer> c2 = sVar.c();
        l.b(c2, "");
        c2.b(Integer.valueOf(i2));
        c.a(new bv());
        if (i2 == 0) {
            str = "Everyone";
        } else {
            str = "Only_me";
        }
        r.a("change_liked_permission", new d().a("enter_from", "liked_permission").a("to_status", str).f66730a);
    }
}
