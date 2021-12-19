package com.bytedance.android.livesdk.init;

import android.app.Application;
import android.content.Context;
import com.bytedance.android.live.annotation.a;
import com.bytedance.android.live.core.performance.b;
import com.bytedance.android.livesdk.livesetting.other.LiveChainMonitorExcludeErrorCodesSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableTimeCostSetting;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.android.livesdkapi.session.d;
import com.bytedance.android.monitor.HybridMonitor;
import com.bytedance.covode.number.Covode;
import java.util.List;

@a(a = 3)
public class MonitorInitTask extends com.bytedance.android.livesdk.y.a {
    static {
        Covode.recordClassIndex(10141);
    }

    @Override // com.bytedance.android.livesdk.y.a
    public String getTaskName() {
        return "monitor_init_task";
    }

    @Override // com.bytedance.android.livesdk.y.a
    public void run() {
        try {
            b.f9252a = LiveEnableTimeCostSetting.INSTANCE.enable();
            List<Integer> value = LiveChainMonitorExcludeErrorCodesSetting.INSTANCE.getValue();
            if (value != null && value.size() > 0) {
                d.f23360a = value;
            }
            initHybridMonitor();
        } catch (Throwable unused) {
        }
    }

    private void initHybridMonitor() {
        IHostContext iHostContext = (IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class);
        if (iHostContext != null && iHostContext.context() != null && com_bytedance_android_livesdk_init_MonitorInitTask_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(iHostContext.context()) != null && (com_bytedance_android_livesdk_init_MonitorInitTask_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(iHostContext.context()) instanceof Application)) {
            HybridMonitor.getInstance().init((Application) com_bytedance_android_livesdk_init_MonitorInitTask_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(iHostContext.context()));
        }
    }

    public static Context com_bytedance_android_livesdk_init_MonitorInitTask_com_ss_android_ugc_aweme_lancet_launch_ApplicationContextLancet_getApplicationContext(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            return com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        return applicationContext;
    }
}
