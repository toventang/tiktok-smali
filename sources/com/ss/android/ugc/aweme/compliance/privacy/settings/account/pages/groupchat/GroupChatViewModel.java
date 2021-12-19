package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.groupchat;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.d;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import f.a.t;
import h.f.b.l;
import org.greenrobot.eventbus.j;

public final class GroupChatViewModel extends BasePrivacyUserSettingViewModel implements j {
    static {
        Covode.recordClassIndex(48126);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    public final t<BaseResponse> b(int i2) {
        return a.b("group_chat_invite", i2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final Integer a(q qVar) {
        l.d(qVar, "");
        d dVar = qVar.f76689e;
        if (dVar != null) {
            return Integer.valueOf(dVar.f76648b);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(q qVar, int i2) {
        l.d(qVar, "");
        d dVar = qVar.f76689e;
        if (dVar != null) {
            dVar.f76648b = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(int i2, BaseResponse baseResponse) {
        String str;
        l.d(baseResponse, "");
        super.a(i2, baseResponse);
        if (i2 == 1) {
            str = "Friends";
        } else if (i2 != 2) {
            str = null;
        } else {
            str = "No_one";
        }
        r.a("change_group_chat_permission", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "group_chat_permission").a("to_status", str).a("is_private", com.ss.android.ugc.aweme.compliance.privacy.a.a.b() ? 1 : 0).f66730a);
    }
}
