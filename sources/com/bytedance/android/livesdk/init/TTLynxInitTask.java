package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.annotation.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.vcloud.abrmodule.ABRConfig;

@a(a = ABRConfig.ABR_STARTUP_BANDWIDTH_PARAMETER_KEY)
public class TTLynxInitTask extends com.bytedance.android.livesdk.y.a {
    static {
        Covode.recordClassIndex(10145);
    }

    @Override // com.bytedance.android.livesdk.y.a
    public String getTaskName() {
        return "tt_lynx_init_task";
    }

    @Override // com.bytedance.android.livesdk.y.a
    public void run() {
    }
}
