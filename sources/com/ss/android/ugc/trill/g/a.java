package com.ss.android.ugc.trill.g;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.trill.abtest.b;

public final class a extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(98966);
    }

    private static String a(Intent intent, String str) {
        try {
            return intent.getStringExtra(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (TextUtils.equals(intent.getAction(), "android.intent.action.CLOSE_SYSTEM_DIALOGS") && "homekey".equals(a(intent, "reason"))) {
            b.a().a("attract_user_without_login_home");
        }
    }
}
