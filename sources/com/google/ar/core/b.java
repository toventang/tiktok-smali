package com.google.ar.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.bytedance.covode.number.Covode;

/* access modifiers changed from: package-private */
public final class b extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ai f53431a;

    static {
        Covode.recordClassIndex(33069);
    }

    b(ai aiVar) {
        this.f53431a = aiVar;
    }

    private static Bundle a(Intent intent) {
        try {
            return intent.getExtras();
        } catch (Exception unused) {
            return null;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Bundle a2 = a(intent);
        if ("com.google.android.play.core.install.ACTION_INSTALL_STATUS".equals(action) && a2 != null && a2.containsKey("install.status")) {
            int i2 = a2.getInt("install.status");
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                this.f53431a.a(aj.ACCEPTED);
            } else if (i2 == 4) {
                this.f53431a.a(aj.COMPLETED);
            } else if (i2 == 6) {
                this.f53431a.a(aj.CANCELLED);
            }
        }
    }
}
