package com.google.android.play.core.c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.bytedance.covode.number.Covode;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.r;
import com.google.android.play.core.d.q;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class c<StateT> {

    /* renamed from: a  reason: collision with root package name */
    private final IntentFilter f53180a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f53181b;

    /* renamed from: c  reason: collision with root package name */
    private b f53182c = null;

    /* renamed from: d  reason: collision with root package name */
    public final b f53183d;

    /* renamed from: e  reason: collision with root package name */
    protected final Set<a<StateT>> f53184e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f53185f = false;

    static {
        Covode.recordClassIndex(32868);
    }

    public c(b bVar, IntentFilter intentFilter, Context context) {
        this.f53183d = bVar;
        this.f53180a = intentFilter;
        this.f53181b = q.a(context);
    }

    private final void b() {
        b bVar;
        if ((this.f53185f || !this.f53184e.isEmpty()) && this.f53182c == null) {
            b bVar2 = new b(this);
            this.f53182c = bVar2;
            b(this.f53181b, bVar2, this.f53180a);
        }
        if (!this.f53185f && this.f53184e.isEmpty() && (bVar = this.f53182c) != null) {
            this.f53181b.unregisterReceiver(bVar);
            this.f53182c = null;
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a(Context context, Intent intent);

    public final synchronized void a(a<StateT> aVar) {
        this.f53183d.d("registerListener", new Object[0]);
        r.a(aVar, "Registered Play Core listener should not be null.");
        this.f53184e.add(aVar);
        b();
    }

    public final synchronized void a(StateT statet) {
        Iterator it = new HashSet(this.f53184e).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(statet);
        }
    }

    public final synchronized void a(boolean z) {
        this.f53185f = z;
        b();
    }

    public final synchronized boolean a() {
        return this.f53182c != null;
    }

    public final synchronized void b(a<StateT> aVar) {
        this.f53183d.d("unregisterListener", new Object[0]);
        r.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f53184e.remove(aVar);
        b();
    }

    private static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        try {
            return context.registerReceiver(broadcastReceiver, intentFilter);
        } catch (Exception e2) {
            if (ReceiverRegisterCrashOptimizer.fixedOpen()) {
                return ReceiverRegisterCrashOptimizer.registerReceiver(broadcastReceiver, intentFilter);
            }
            throw e2;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: java.lang.IllegalArgumentException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0018, code lost:
        r0 = r2.getMessage().contains("regist too many Broadcast Receivers");
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r0 != false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        r2 = move-exception;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        com.bytedance.c.a.a.a.b.a(r2, "Register Receiver Exception");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        return com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0012, code lost:
        r0 = r2.getMessage();
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        if (r0 != null) goto L_0x0018;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:4:0x000c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.Intent b(android.content.Context r1, android.content.BroadcastReceiver r2, android.content.IntentFilter r3) {
        /*
            android.app.Application r0 = com.bytedance.ies.ugc.appcontext.g.a()
            com.ss.android.ugc.aweme.lancet.receiver.a.a(r0)
            android.content.Intent r0 = a(r1, r2, r3)     // Catch:{ Exception -> 0x000c }
            return r0
        L_0x000c:
            android.content.Intent r0 = com.ss.android.ugc.aweme.lancet.receiver.ReceiverRegisterLancetHelper.registerReceiver(r2, r3)     // Catch:{ SecurityException -> 0x0026, IllegalArgumentException -> 0x0011 }
            return r0
        L_0x0011:
            r2 = move-exception
            java.lang.String r0 = r2.getMessage()
            if (r0 == 0) goto L_0x0027
            java.lang.String r1 = r2.getMessage()
            java.lang.String r0 = "regist too many Broadcast Receivers"
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0025
            goto L_0x0027
        L_0x0025:
            throw r2
        L_0x0026:
            r2 = move-exception
        L_0x0027:
            java.lang.String r0 = "Register Receiver Exception"
            com.bytedance.c.a.a.a.b.a(r2, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.c.c.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
