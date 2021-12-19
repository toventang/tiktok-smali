package com.facebook;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public final class CurrentAccessTokenExpirationBroadcastReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(28380);
    }

    public final void onReceive(Context context, Intent intent) {
        if ("com.facebook.sdk.ACTION_CURRENT_ACCESS_TOKEN_CHANGED".equals(intent.getAction()) && m.a()) {
            b a2 = b.a();
            a2.a(a2.f46926b, a2.f46926b);
        }
    }
}
