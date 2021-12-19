package com.ss.android.ugc.aweme.newfollow.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.a;
import com.bytedance.covode.number.Covode;

public final class f extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(72355);
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            a.a("onReceive: action=%s", new Object[]{intent.getAction()});
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
        }
    }
}
