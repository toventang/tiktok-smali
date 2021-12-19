package com.bytedance.liko.leakdetector;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import leakcanary.internal.InternalLeakCanary;

public final class TriggerLeakCanaryReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(24710);
    }

    public final void onReceive(Context context, Intent intent) {
        l.c("on receive trigger LeakCanary", "");
        InternalLeakCanary.INSTANCE.onDumpHeapReceived();
    }
}
