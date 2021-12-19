package com.ss.android.push.window.oppo;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;

public class ScreenReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(37118);
    }

    public void onReceive(Context context, Intent intent) {
        try {
            String action = intent.getAction();
            Logger.debug();
            if ("android.intent.action.USER_PRESENT".equals(action) && c.a(context).b() && c.a(context).f60078k) {
                c.a(context).c();
            }
        } catch (Exception e2) {
            if (Logger.debug()) {
                e2.printStackTrace();
            }
        }
    }
}
