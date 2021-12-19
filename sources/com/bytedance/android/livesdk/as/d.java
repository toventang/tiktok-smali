package com.bytedance.android.livesdk.as;

import com.bytedance.android.livesdk.livesetting.message.LiveUplinkStrategySetting;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.covode.number.Covode;
import com.ss.ugc.live.sdk.msg.a.a;

public final class d implements a {
    static {
        Covode.recordClassIndex(7804);
    }

    @Override // com.ss.ugc.live.sdk.msg.a.a
    public final boolean b() {
        return LiveUplinkStrategySetting.INSTANCE.supportWSUplink();
    }

    @Override // com.ss.ugc.live.sdk.msg.a.a
    public final boolean c() {
        return LiveUplinkStrategySetting.INSTANCE.supportHttpUplink();
    }

    @Override // com.ss.ugc.live.sdk.msg.a.a
    public final long d() {
        return LiveUplinkStrategySetting.INSTANCE.getWsUplinkWaitTimeout();
    }

    @Override // com.ss.ugc.live.sdk.msg.a.a
    public final String a() {
        return "https://" + ((IHostNetwork) com.bytedance.android.live.t.a.a(IHostNetwork.class)).getHostDomain() + "/webcast/im/gw/uplink/message/";
    }
}
