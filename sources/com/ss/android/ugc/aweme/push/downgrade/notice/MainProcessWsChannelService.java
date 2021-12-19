package com.ss.android.ugc.aweme.push.downgrade.notice;

import android.content.Intent;
import com.bytedance.common.wschannel.server.WsChannelService;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.utils.ServiceLifecycle;

public class MainProcessWsChannelService extends WsChannelService {
    static {
        Covode.recordClassIndex(77238);
    }

    @Override // com.bytedance.common.wschannel.server.WsChannelService
    public int onStartCommand(Intent intent, int i2, int i3) {
        ServiceLifecycle.onStartCommand(this, intent, i2, i3);
        return super.onStartCommand(intent, i2, i3);
    }
}
