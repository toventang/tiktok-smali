package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.bytedance.covode.number.Covode;
import com.google.android.datatransport.runtime.e.a;
import com.google.android.datatransport.runtime.k;
import com.google.android.datatransport.runtime.p;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(31002);
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int intValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i2 = a(intent).getInt("attemptNumber");
        p.a(context);
        k.a a2 = k.d().a(queryParameter).a(a.a(intValue));
        if (queryParameter2 != null) {
            a2.a(Base64.decode(queryParameter2, 0));
        }
        p.a().f49460a.a(a2.a(), i2, b.f49557a);
    }
}
