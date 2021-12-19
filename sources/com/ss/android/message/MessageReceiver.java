package com.ss.android.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public class MessageReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(36969);
    }

    public void onReceive(Context context, Intent intent) {
    }
}
