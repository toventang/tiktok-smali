package com.bytedance.android.live.q;

import android.content.Context;
import androidx.fragment.app.d;
import androidx.lifecycle.m;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;

public interface a extends com.bytedance.android.live.base.a {
    static {
        Covode.recordClassIndex(6932);
    }

    void configProfileHelper(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, boolean z, m mVar);

    d getUserCardDialog(Context context, boolean z, long j2, Room room, User user, String str, UserProfileEvent userProfileEvent);
}
