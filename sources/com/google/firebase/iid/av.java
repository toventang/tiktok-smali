package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.c.ac;
import com.google.android.gms.c.h;
import com.google.android.gms.c.i;
import com.google.android.gms.common.util.a.b;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class av implements ServiceConnection {

    /* renamed from: a  reason: collision with root package name */
    private final Context f54440a;

    /* renamed from: b  reason: collision with root package name */
    private final Intent f54441b;

    /* renamed from: c  reason: collision with root package name */
    private final ScheduledExecutorService f54442c;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<a> f54443d;

    /* renamed from: e  reason: collision with root package name */
    private at f54444e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f54445f;

    static {
        Covode.recordClassIndex(33794);
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        final Intent f54446a;

        /* renamed from: b  reason: collision with root package name */
        final i<Void> f54447b = new i<>();

        static {
            Covode.recordClassIndex(33795);
        }

        /* access modifiers changed from: package-private */
        public final void a() {
            this.f54447b.b((Void) null);
        }

        a(Intent intent) {
            this.f54446a = intent;
        }
    }

    private void b() {
        while (!this.f54443d.isEmpty()) {
            this.f54443d.poll().a();
        }
    }

    private synchronized void a() {
        MethodCollector.i(12437);
        while (!this.f54443d.isEmpty()) {
            at atVar = this.f54444e;
            if (atVar == null || !atVar.isBinderAlive()) {
                if (!this.f54445f) {
                    this.f54445f = true;
                    try {
                        com.google.android.gms.common.stats.a.a();
                        if (com.google.android.gms.common.stats.a.b(this.f54440a, this.f54441b, this, 65)) {
                            MethodCollector.o(12437);
                            return;
                        }
                    } catch (SecurityException unused) {
                    }
                    this.f54445f = false;
                    b();
                }
                MethodCollector.o(12437);
                return;
            }
            a poll = this.f54443d.poll();
            at atVar2 = this.f54444e;
            if (Binder.getCallingUid() == Process.myUid()) {
                atVar2.f54438a.a(poll.f54446a).a(g.f54460a, new au(poll));
            } else {
                SecurityException securityException = new SecurityException("Binding only allowed within app");
                MethodCollector.o(12437);
                throw securityException;
            }
        }
        MethodCollector.o(12437);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(String.valueOf(componentName)).length();
        }
        a();
    }

    public final synchronized h<Void> a(Intent intent) {
        ac<TResult> acVar;
        MethodCollector.i(12296);
        a aVar = new a(intent);
        ScheduledExecutorService scheduledExecutorService = this.f54442c;
        aVar.f54447b.f49902a.a(scheduledExecutorService, new ax(scheduledExecutorService.schedule(new aw(aVar), 1000, TimeUnit.MILLISECONDS)));
        this.f54443d.add(aVar);
        a();
        acVar = aVar.f54447b.f49902a;
        MethodCollector.o(12296);
        return acVar;
    }

    public av(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new b("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        MethodCollector.i(12567);
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String.valueOf(String.valueOf(componentName)).length();
        }
        this.f54445f = false;
        if (!(iBinder instanceof at)) {
            String.valueOf(String.valueOf(iBinder)).length();
            b();
            MethodCollector.o(12567);
            return;
        }
        this.f54444e = (at) iBinder;
        a();
        MethodCollector.o(12567);
    }

    private av(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.f54443d = new ArrayDeque();
        this.f54445f = false;
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f54440a = applicationContext;
        this.f54441b = new Intent(str).setPackage(applicationContext.getPackageName());
        this.f54442c = scheduledExecutorService;
    }
}
