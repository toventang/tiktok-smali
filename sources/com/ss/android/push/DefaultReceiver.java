package com.ss.android.push;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.bytedance.covode.number.Covode;

public class DefaultReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(37113);
    }

    public void onReceive(Context context, Intent intent) {
    }
}
