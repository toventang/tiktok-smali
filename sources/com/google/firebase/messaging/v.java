package com.google.firebase.messaging;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import androidx.c.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.c.h;
import com.google.android.gms.c.i;
import com.google.android.gms.c.k;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.ae;
import com.google.firebase.iid.q;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

final class v {

    /* renamed from: b  reason: collision with root package name */
    private static final long f54640b = TimeUnit.HOURS.toSeconds(8);

    /* renamed from: a  reason: collision with root package name */
    final u f54641a;

    /* renamed from: c  reason: collision with root package name */
    private final FirebaseInstanceId f54642c;

    /* renamed from: d  reason: collision with root package name */
    private final Context f54643d;

    /* renamed from: e  reason: collision with root package name */
    private final ae f54644e;

    /* renamed from: f  reason: collision with root package name */
    private final q f54645f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<String, ArrayDeque<i<Void>>> f54646g = new a();

    /* renamed from: h  reason: collision with root package name */
    private final ScheduledExecutorService f54647h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f54648i = false;

    /* access modifiers changed from: package-private */
    public final synchronized boolean b() {
        boolean z;
        MethodCollector.i(6492);
        z = this.f54648i;
        MethodCollector.o(6492);
        return z;
    }

    static {
        Covode.recordClassIndex(33902);
    }

    private static boolean c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        if (Build.VERSION.SDK_INT != 23 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (a(r1) != false) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001b, code lost:
        com.bytedance.frameworks.apm.trace.MethodCollector.o(6310);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        r6.f54641a.a(r1);
        r4 = r6.f54646g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r1.f54635c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0030, code lost:
        if (r6.f54646g.containsKey(r3) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        r2 = r6.f54646g.get(r3);
        r1 = r2.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0042, code lost:
        if (r1 == null) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r1.a((java.lang.Void) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r2.isEmpty() == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004e, code lost:
        r6.f54646g.remove(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0053, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0059, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
        // Method dump skipped, instructions count: 101
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.v.a():boolean");
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(boolean z) {
        MethodCollector.i(6493);
        this.f54648i = z;
        MethodCollector.o(6493);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        a(new x(this, this.f54643d, this.f54644e, Math.min(Math.max(30L, j2 << 1), f54640b)), j2);
        a(true);
    }

    private static <T> T a(h<T> hVar) {
        try {
            return (T) k.a(hVar, 30, TimeUnit.SECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw cause;
            } else if (cause instanceof RuntimeException) {
                throw cause;
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException e3) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e3);
        }
    }

    private boolean a(t tVar) {
        String str;
        String str2;
        String str3;
        String str4;
        try {
            String str5 = tVar.f54634b;
            char c2 = 65535;
            int hashCode = str5.hashCode();
            if (hashCode != 83) {
                if (hashCode == 85) {
                    if (str5.equals("U")) {
                        c2 = 1;
                    }
                }
            } else if (str5.equals("S")) {
                c2 = 0;
            }
            if (c2 == 0) {
                String str6 = tVar.f54633a;
                com.google.firebase.iid.v vVar = (com.google.firebase.iid.v) a(this.f54642c.getInstanceId());
                q qVar = this.f54645f;
                String a2 = vVar.a();
                String b2 = vVar.b();
                Bundle bundle = new Bundle();
                String valueOf = String.valueOf(str6);
                if (valueOf.length() != 0) {
                    str = "/topics/".concat(valueOf);
                } else {
                    str = new String("/topics/");
                }
                bundle.putString("gcm.topic", str);
                String valueOf2 = String.valueOf(str6);
                if (valueOf2.length() != 0) {
                    str2 = "/topics/".concat(valueOf2);
                } else {
                    str2 = new String("/topics/");
                }
                a(qVar.a(qVar.a(a2, b2, str2, bundle)));
                if (c()) {
                    String.valueOf(tVar.f54633a).length();
                }
            } else if (c2 == 1) {
                String str7 = tVar.f54633a;
                com.google.firebase.iid.v vVar2 = (com.google.firebase.iid.v) a(this.f54642c.getInstanceId());
                q qVar2 = this.f54645f;
                String a3 = vVar2.a();
                String b3 = vVar2.b();
                Bundle bundle2 = new Bundle();
                String valueOf3 = String.valueOf(str7);
                if (valueOf3.length() != 0) {
                    str3 = "/topics/".concat(valueOf3);
                } else {
                    str3 = new String("/topics/");
                }
                bundle2.putString("gcm.topic", str3);
                bundle2.putString("delete", "1");
                String valueOf4 = String.valueOf(str7);
                if (valueOf4.length() != 0) {
                    str4 = "/topics/".concat(valueOf4);
                } else {
                    str4 = new String("/topics/");
                }
                a(qVar2.a(qVar2.a(a3, b3, str4, bundle2)));
                if (c()) {
                    String.valueOf(tVar.f54633a).length();
                }
            } else if (c()) {
                String.valueOf(String.valueOf(tVar)).length();
            }
            return true;
        } catch (IOException e2) {
            if ("SERVICE_NOT_AVAILABLE".equals(e2.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e2.getMessage())) {
                String.valueOf(e2.getMessage()).length();
                return false;
            } else if (e2.getMessage() == null) {
                return false;
            } else {
                throw e2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(Runnable runnable, long j2) {
        this.f54647h.schedule(runnable, j2, TimeUnit.SECONDS);
    }

    v(FirebaseInstanceId firebaseInstanceId, ae aeVar, u uVar, q qVar, Context context, ScheduledExecutorService scheduledExecutorService) {
        this.f54642c = firebaseInstanceId;
        this.f54644e = aeVar;
        this.f54641a = uVar;
        this.f54645f = qVar;
        this.f54643d = context;
        this.f54647h = scheduledExecutorService;
    }
}
