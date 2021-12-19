package com.google.firebase.iid;

import android.content.Intent;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.Callable;

final /* synthetic */ class u implements Callable {

    /* renamed from: a  reason: collision with root package name */
    private final Intent f54488a;

    static {
        Covode.recordClassIndex(33818);
    }

    u(Intent intent) {
        this.f54488a = intent;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Intent intent = this.f54488a;
        String a2 = t.a(intent, "CMD");
        if (a2 != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(t.b(intent));
                String.valueOf(a2).length();
                String.valueOf(valueOf).length();
            }
            if ("RST".equals(a2) || "RST_FULL".equals(a2)) {
                FirebaseInstanceId.getInstance().resetStorageAndScheduleSync();
            } else if ("SYNC".equals(a2)) {
                FirebaseInstanceId.getInstance().forceTokenRefresh();
            }
        }
        return -1;
    }
}
