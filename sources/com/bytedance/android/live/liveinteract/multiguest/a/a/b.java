package com.bytedance.android.live.liveinteract.multiguest.a.a;

import android.view.View;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.f.a.h;
import com.bytedance.android.livesdk.an.a;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    static final View.OnClickListener f11039a = new b();

    static {
        Covode.recordClassIndex(5930);
    }

    private b() {
    }

    public final void onClick(View view) {
        Object a2 = h.a(view, String.valueOf(view.getId()));
        if (a2 != null) {
            UserProfileEvent userProfileEvent = new UserProfileEvent((User) a2, "guest_waiting_list");
            userProfileEvent.mReportType = "report_user";
            a.a().a(userProfileEvent);
        }
    }
}
