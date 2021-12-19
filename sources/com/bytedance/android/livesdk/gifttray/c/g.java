package com.bytedance.android.livesdk.gifttray.c;

import android.view.View;
import com.bytedance.android.live.n.z;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.service.c.i.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

final /* synthetic */ class g implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f18072a;

    /* renamed from: b  reason: collision with root package name */
    private final DataChannel f18073b;

    static {
        Covode.recordClassIndex(10020);
    }

    g(c cVar, DataChannel dataChannel) {
        this.f18072a = cVar;
        this.f18073b = dataChannel;
    }

    public final void onClick(View view) {
        c cVar = this.f18072a;
        DataChannel dataChannel = this.f18073b;
        if (dataChannel != null && cVar.f18053c != null) {
            a.a("portrait");
            UserProfileEvent userProfileEvent = new UserProfileEvent(cVar.f18053c.z);
            userProfileEvent.mReportType = "report_user";
            dataChannel.c(z.class, userProfileEvent);
        }
    }
}
