package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.chat;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.d;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.d.a.c;
import f.a.t;
import h.f.b.l;
import org.greenrobot.eventbus.j;

public final class ChatViewModel extends BasePrivacyUserSettingViewModel implements j {
    static {
        Covode.recordClassIndex(48084);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    public final t<BaseResponse> b(int i2) {
        return a.b("direct_message", i2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final Integer a(q qVar) {
        l.d(qVar, "");
        d dVar = qVar.f76689e;
        if (dVar != null) {
            return Integer.valueOf(dVar.f76647a);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(q qVar, int i2) {
        l.d(qVar, "");
        d dVar = qVar.f76689e;
        if (dVar != null) {
            dVar.f76647a = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(int i2, BaseResponse baseResponse) {
        String str = "";
        l.d(baseResponse, str);
        super.a(i2, baseResponse);
        if (i2 == 1) {
            str = "Everyone";
        } else if (i2 == 2) {
            str = "Friends";
        } else if (i2 == 3) {
            str = "No_one";
        }
        r.a("change_message_permission", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "message_permission").a("to_status", str).f66730a);
        c.a(new com.ss.android.ugc.aweme.setting.d.a(i2));
        IMService.createIIMServicebyMonsterPlugin(false).updateChatUserSetting(i2);
    }
}
