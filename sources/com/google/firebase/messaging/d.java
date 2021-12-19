package com.google.firebase.messaging;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.c.h;
import com.google.android.gms.c.i;
import com.google.android.gms.c.k;
import com.google.android.gms.common.util.a.b;
import com.google.android.gms.internal.g.a;
import com.google.firebase.iid.at;
import java.util.concurrent.ExecutorService;

public abstract class d extends Service {
    private Binder binder;
    final ExecutorService executor = a.f50602a.a(new b("Firebase-Messaging-Intent-Handle"));
    private int lastStartId;
    private final Object lock = new Object();
    private int runningTasks = 0;

    static {
        Covode.recordClassIndex(33880);
    }

    public static int com_google_firebase_messaging_EnhancedIntentService_com_ss_android_ugc_aweme_lancet_LogLancet_d(String str, String str2) {
        return 0;
    }

    /* access modifiers changed from: protected */
    public Intent getStartCommandIntent(Intent intent) {
        return intent;
    }

    public abstract void handleIntent(Intent intent);

    public boolean handleIntentOnMainThread(Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.executor.shutdown();
        super.onDestroy();
    }

    /* access modifiers changed from: package-private */
    public boolean stopSelfResultHook(int i2) {
        return stopSelfResult(i2);
    }

    public h<Void> processIntent(Intent intent) {
        if (handleIntentOnMainThread(intent)) {
            return k.a((Object) null);
        }
        i iVar = new i();
        this.executor.execute(new e(this, intent, iVar));
        return iVar.f49902a;
    }

    public final synchronized IBinder onBind(Intent intent) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            com_google_firebase_messaging_EnhancedIntentService_com_ss_android_ugc_aweme_lancet_LogLancet_d("EnhancedIntentService", "Service received bind request");
        }
        if (this.binder == null) {
            this.binder = new at(new at.a() {
                /* class com.google.firebase.messaging.d.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33881);
                }

                @Override // com.google.firebase.iid.at.a
                public final h<Void> a(Intent intent) {
                    return d.this.processIntent(intent);
                }
            });
        }
        return this.binder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0048, code lost:
        if (r3.f49884h == 1) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void finishTask(android.content.Intent r17) {
        /*
        // Method dump skipped, instructions count: 165
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.d.finishTask(android.content.Intent):void");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$onStartCommand$1$EnhancedIntentService(Intent intent, h hVar) {
        finishTask(intent);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$processIntent$0$EnhancedIntentService(Intent intent, i iVar) {
        try {
            handleIntent(intent);
        } finally {
            iVar.a((Object) null);
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        synchronized (this.lock) {
            this.lastStartId = i3;
            this.runningTasks++;
        }
        Intent startCommandIntent = getStartCommandIntent(intent);
        if (startCommandIntent == null) {
            finishTask(intent);
            return 2;
        }
        h<Void> processIntent = processIntent(startCommandIntent);
        if (processIntent.a()) {
            finishTask(intent);
            return 2;
        }
        processIntent.a(f.f54610a, new g(this, intent));
        return 3;
    }
}
