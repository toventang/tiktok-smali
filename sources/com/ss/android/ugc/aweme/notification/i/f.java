package com.ss.android.ugc.aweme.notification.i;

import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.notification.h.as;
import com.ss.android.ugc.aweme.notification.i.i;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class f extends i.a implements as.b {
    static {
        Covode.recordClassIndex(73140);
    }

    @Override // com.ss.android.ugc.aweme.notification.h.as.b
    public final void x() {
        e l2 = l();
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        User curUser = g2.getCurUser();
        l.b(curUser, "");
        SmartRouter.buildRoute(l2, "aweme://user/qna/profile/" + curUser.getUid()).withParam("enter_from", "notification_page").withParam("enter_method", "click_turn_on_qna").open();
    }
}
