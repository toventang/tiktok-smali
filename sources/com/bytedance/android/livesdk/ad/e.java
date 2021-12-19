package com.bytedance.android.livesdk.ad;

import android.view.View;
import com.bytedance.android.live.t.a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;

final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f13669a;

    static {
        Covode.recordClassIndex(7575);
    }

    e(c cVar) {
        this.f13669a = cVar;
    }

    public final void onClick(View view) {
        c cVar = this.f13669a;
        if (p.c()) {
            HashMap hashMap = new HashMap();
            hashMap.put("sec_user_id", cVar.f13659f.f12594b);
            ((IHostAction) a.a(IHostAction.class)).openUserProfilePage(cVar.f13659f.f12593a, hashMap);
            return;
        }
        UserProfileEvent userProfileEvent = new UserProfileEvent(cVar.f13659f.f12593a);
        userProfileEvent.mReportType = "report_user";
        com.bytedance.android.livesdk.an.a.a().a(userProfileEvent);
    }
}
