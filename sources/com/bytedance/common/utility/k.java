package com.bytedance.common.utility;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.l;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.j;

public final class k extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(15912);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction()) || "android.net.wifi.WIFI_STATE_CHANGED".equals(intent.getAction()) || "android.net.wifi.STATE_CHANGE".equals(intent.getAction())) {
            if (j.f107224c == l.a.UNKNOWN || !j.b() || j.c()) {
                j.f107224c = l.d(context);
            }
            l.f26950b = j.f107224c;
        }
    }
}
