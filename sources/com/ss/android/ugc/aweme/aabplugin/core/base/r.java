package com.ss.android.ugc.aweme.aabplugin.core.base;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.j;

public final class r extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(38471);
    }

    private static boolean a() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            if (!j.f107229h || !j.b() || j.c()) {
                j.f107229h = a();
            }
            if (j.f107229h) {
                a.a().b();
                if (NetworkUtils.isWifi(context)) {
                    a.a().f62465f.sendEmptyMessage(1024);
                }
            }
        }
    }
}
