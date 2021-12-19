package com.google.firebase.iid;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayDeque;
import java.util.Queue;

public final class ap {

    /* renamed from: d  reason: collision with root package name */
    private static ap f54419d;

    /* renamed from: a  reason: collision with root package name */
    Boolean f54420a;

    /* renamed from: b  reason: collision with root package name */
    Boolean f54421b;

    /* renamed from: c  reason: collision with root package name */
    public final Queue<Intent> f54422c = new ArrayDeque();

    /* renamed from: e  reason: collision with root package name */
    private String f54423e;

    static {
        Covode.recordClassIndex(33785);
    }

    private ap() {
    }

    public static synchronized ap a() {
        ap apVar;
        synchronized (ap.class) {
            MethodCollector.i(12171);
            if (f54419d == null) {
                f54419d = new ap();
            }
            apVar = f54419d;
            MethodCollector.o(12171);
        }
        return apVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Context context) {
        boolean z;
        if (this.f54420a == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f54420a = Boolean.valueOf(z);
        }
        this.f54420a.booleanValue();
        return this.f54420a.booleanValue();
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.content.ComponentName b(android.content.Context r9, android.content.Intent r10) {
        /*
        // Method dump skipped, instructions count: 114
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.ap.b(android.content.Context, android.content.Intent):android.content.ComponentName");
    }

    /* access modifiers changed from: package-private */
    public final int a(Context context, Intent intent) {
        ComponentName componentName;
        String c2 = c(context, intent);
        if (c2 != null) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(c2);
                if (valueOf.length() != 0) {
                    "Restricting intent to a specific service: ".concat(valueOf);
                } else {
                    new String("Restricting intent to a specific service: ");
                }
            }
            intent.setClassName(context.getPackageName(), c2);
        }
        try {
            if (a(context)) {
                componentName = as.a(context, intent);
            } else {
                componentName = b(context, intent);
            }
            if (componentName == null) {
                return 404;
            }
            return -1;
        } catch (SecurityException unused) {
            return 401;
        } catch (IllegalStateException e2) {
            String.valueOf(String.valueOf(e2)).length();
            return 402;
        }
    }

    private synchronized String c(Context context, Intent intent) {
        String str;
        MethodCollector.i(12175);
        String str2 = this.f54423e;
        if (str2 != null) {
            MethodCollector.o(12175);
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (resolveService == null || resolveService.serviceInfo == null) {
            MethodCollector.o(12175);
            return null;
        }
        ServiceInfo serviceInfo = resolveService.serviceInfo;
        if (!context.getPackageName().equals(serviceInfo.packageName) || serviceInfo.name == null) {
            String str3 = serviceInfo.packageName;
            String str4 = serviceInfo.name;
            String.valueOf(str3).length();
            String.valueOf(str4).length();
            MethodCollector.o(12175);
            return null;
        }
        if (serviceInfo.name.startsWith(".")) {
            String valueOf = String.valueOf(context.getPackageName());
            String valueOf2 = String.valueOf(serviceInfo.name);
            if (valueOf2.length() != 0) {
                str = valueOf.concat(valueOf2);
            } else {
                str = new String(valueOf);
            }
            this.f54423e = str;
        } else {
            this.f54423e = serviceInfo.name;
        }
        String str5 = this.f54423e;
        MethodCollector.o(12175);
        return str5;
    }
}
