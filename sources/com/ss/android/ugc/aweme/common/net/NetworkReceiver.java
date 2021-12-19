package com.ss.android.ugc.aweme.common.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.framework.c.a;
import com.ss.android.ugc.aweme.utils.fe;
import com.ss.android.ugc.d.a.c;

public class NetworkReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(47215);
    }

    public void onReceive(Context context, Intent intent) {
        fe.a b2 = fe.b(context);
        a.f96677b = b2;
        if (a.f96676a != null) {
            a.f96676a = b2;
        }
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            return;
        }
        if (!fe.a(context)) {
            c.a(new f(0));
        } else if (fe.c(context)) {
            c.a(new f(2));
        } else if (fe.d(context)) {
            c.a(new f(1));
        }
    }
}
