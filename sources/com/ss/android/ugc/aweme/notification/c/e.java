package com.ss.android.ugc.aweme.notification.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.notification.view.template.c;
import com.ss.android.ugc.aweme.notification.view.template.d;
import com.ss.android.ugc.aweme.notification.view.template.f;
import com.ss.android.ugc.aweme.notification.view.template.h;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.l;
import java.util.List;

public final class e implements c {
    static {
        Covode.recordClassIndex(72865);
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.c
    public final void a(d dVar) {
        l.d(dVar, "");
        l.d(dVar, "");
    }

    @Override // com.ss.android.ugc.aweme.notification.view.template.c
    public final boolean a(f fVar) {
        User user;
        com.ss.android.ugc.aweme.notice.repo.list.a.c cVar;
        com.ss.android.ugc.aweme.notice.repo.list.a.f fVar2;
        List<User> list;
        l.d(fVar, "");
        if (fVar.f114034d != h.Root) {
            return false;
        }
        com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar = fVar.f114031a;
        String str = null;
        if (eVar == null || (cVar = eVar.f112844b) == null || (fVar2 = cVar.f112805d) == null || (list = fVar2.f112824a) == null) {
            user = null;
        } else {
            user = (User) n.h((List) list);
        }
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("enter_from", "notification_page");
        if (user != null) {
            str = user.getUid();
        }
        r.a("enter_personal_detail", a2.a("to_user_id", str).a("enter_method", "click_cell").f66730a);
        return false;
    }
}
