package com.bytedance.android.live.share;

import android.content.Context;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.a;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.p.f;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.i;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import f.a.t;

public interface c extends a {
    static {
        Covode.recordClassIndex(7026);
    }

    f getShareBehavior(e eVar, Context context, i iVar, m mVar);

    LiveWidget getShareWidget();

    b provideShareCountManager();

    t<d<ShareReportResult>> sendShare(long j2, String str, int i2, String str2, String str3);

    a share();

    boolean shareable(Room room);
}
