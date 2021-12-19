package com.bytedance.android.live.q;

import android.content.Context;
import androidx.fragment.app.d;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdk.ui.a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import h.f.b.l;

public class b implements a {
    static {
        Covode.recordClassIndex(6933);
    }

    @Override // com.bytedance.android.live.q.a
    public void configProfileHelper(a aVar, DataChannel dataChannel, boolean z, m mVar) {
        l.d(aVar, "");
        l.d(dataChannel, "");
        l.d(mVar, "");
    }

    public d getUserCardDialog(Context context, boolean z, long j2, long j3, UserProfileEvent userProfileEvent) {
        l.d(context, "");
        return null;
    }

    @Override // com.bytedance.android.live.q.a
    public d getUserCardDialog(Context context, boolean z, long j2, Room room, User user, String str, UserProfileEvent userProfileEvent) {
        l.d(context, "");
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }
}
