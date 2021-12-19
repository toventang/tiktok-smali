package com.bytedance.android.livesdk.init;

import com.bytedance.android.live.core.b;
import com.bytedance.android.livesdk.ab.d.c;
import com.bytedance.android.livesdk.ao.e;
import com.bytedance.android.livesdk.livesetting.other.LiveFakeRegionChannelSettings;
import com.bytedance.android.livesdk.utils.i;
import com.bytedance.android.livesdk.y.a;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.covode.number.Covode;
import java.util.Arrays;

public class SDKServiceInitTask extends a {
    static {
        Covode.recordClassIndex(10143);
    }

    @Override // com.bytedance.android.livesdk.y.a
    public int getTaskId() {
        return 0;
    }

    @Override // com.bytedance.android.livesdk.y.a
    public String getTaskName() {
        return "sdk_service_init_task";
    }

    private static boolean isDebug() {
        if (com.bytedance.android.live.t.a.a(IHostContext.class) == null || !((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).isLocalTest()) {
            return false;
        }
        return true;
    }

    @Override // com.bytedance.android.livesdk.y.a
    public void run() {
        c.f13554a = System.currentTimeMillis();
        if (f.a.h.a.f157962a == null && !isDebug()) {
            f.a.h.a.a(b.f18254a);
        }
        if (Arrays.asList(LiveFakeRegionChannelSettings.INSTANCE.getValue()).contains(((IHostContext) com.bytedance.android.live.t.a.a(IHostContext.class)).getChannel())) {
            e.f13998b = true;
        } else {
            e.f13998b = false;
        }
        b.f8922a = new com.bytedance.android.live.core.a() {
            /* class com.bytedance.android.livesdk.init.SDKServiceInitTask.AnonymousClass1 */

            static {
                Covode.recordClassIndex(10144);
            }
        };
        com.bytedance.android.livesdkapi.m.a.f23260a = new i();
    }

    static final /* synthetic */ void lambda$run$0$SDKServiceInitTask(Throwable th) {
        if (th == null) {
            th = new UnknownError("unknown error");
        }
        com.bytedance.android.live.core.c.a.a(6, "RxJava", "message = " + th.getMessage());
        if (th.getStackTrace() != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            for (int i2 = 0; i2 < length; i2++) {
                com.bytedance.android.live.core.c.a.a(6, "RxJava", "\t\t" + stackTrace[i2].toString());
            }
        }
    }
}
