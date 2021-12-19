package com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.comment;

import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.compliance.api.model.g;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.api.a;
import com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import f.a.t;
import h.f.b.l;
import org.greenrobot.eventbus.j;

public final class CommentViewModel extends BasePrivacyUserSettingViewModel implements j {
    static {
        Covode.recordClassIndex(48090);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel
    public final t<BaseResponse> b(int i2) {
        return a.a(UGCMonitor.EVENT_COMMENT, i2);
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final Integer a(q qVar) {
        l.d(qVar, "");
        g gVar = qVar.f76685a;
        if (gVar != null) {
            return Integer.valueOf(gVar.f76666d);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(q qVar, int i2) {
        l.d(qVar, "");
        g gVar = qVar.f76685a;
        if (gVar != null) {
            gVar.f76666d = i2;
        }
    }

    @Override // com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacySettingViewModel, com.ss.android.ugc.aweme.compliance.privacy.settings.account.pages.BasePrivacyUserSettingViewModel
    public final void a(int i2, BaseResponse baseResponse) {
        String str;
        l.d(baseResponse, "");
        super.a(i2, baseResponse);
        if (i2 != 0) {
            if (i2 == 1) {
                str = "Friends";
            } else if (i2 != 3) {
                str = null;
            } else {
                str = "No_one";
            }
        } else if (com.ss.android.ugc.aweme.compliance.privacy.a.a.b()) {
            str = "Followers";
        } else {
            str = "Everyone";
        }
        r.a("change_comment_permission", new d().a("enter_from", "comment_permission").a("to_status", str).a("is_private", com.ss.android.ugc.aweme.compliance.privacy.a.a.b() ? 1 : 0).f66730a);
        User e2 = com.ss.android.ugc.aweme.compliance.privacy.a.a.e();
        e2.setCommentSetting(i2);
        com.ss.android.ugc.aweme.compliance.privacy.a.a.f().e().updateCurUser(e2);
    }
}
