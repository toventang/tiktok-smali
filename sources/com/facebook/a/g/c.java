package com.facebook.a.g;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.IBinder;
import com.bytedance.covode.number.Covode;
import com.facebook.internal.ae;
import com.facebook.m;
import java.util.LinkedList;
import java.util.concurrent.CountDownLatch;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final String f46803a = c.class.getSimpleName();

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f46804b;

    /* access modifiers changed from: package-private */
    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        
        private String eventType;

        public final String toString() {
            return this.eventType;
        }

        static {
            Covode.recordClassIndex(28511);
        }

        private a(String str) {
            this.eventType = str;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        final CountDownLatch f46808a = new CountDownLatch(1);

        /* renamed from: b  reason: collision with root package name */
        IBinder f46809b;

        static {
            Covode.recordClassIndex(28512);
        }

        public final void onServiceDisconnected(ComponentName componentName) {
        }

        b() {
        }

        public final void onNullBinding(ComponentName componentName) {
            this.f46808a.countDown();
        }

        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            this.f46809b = iBinder;
            this.f46808a.countDown();
        }
    }

    static {
        Covode.recordClassIndex(28510);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.facebook.a.g.c$c  reason: collision with other inner class name */
    public enum EnumC1161c {
        OPERATION_SUCCESS,
        SERVICE_NOT_AVAILABLE,
        SERVICE_ERROR;

        static {
            Covode.recordClassIndex(28513);
        }
    }

    public static boolean a() {
        boolean z;
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return false;
        }
        try {
            if (f46804b == null) {
                ae.a();
                if (a(m.f48921g) != null) {
                    z = true;
                } else {
                    z = false;
                }
                f46804b = Boolean.valueOf(z);
            }
            return f46804b.booleanValue();
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return false;
        }
    }

    public static EnumC1161c a(String str) {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return null;
        }
        try {
            return a(a.MOBILE_APP_INSTALL, str, new LinkedList());
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }

    private static Intent a(Context context) {
        if (com.facebook.internal.a.b.a.a(c.class)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && com.facebook.internal.m.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) == null || !com.facebook.internal.m.a(context, "com.facebook.wakizashi")) {
                    return null;
                }
                return intent2;
            }
            return null;
        } catch (Throwable th) {
            com.facebook.internal.a.b.a.a(th, c.class);
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0042 A[Catch:{ RemoteException | InterruptedException -> 0x0068, all -> 0x0076 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0062 A[Catch:{ RemoteException | InterruptedException -> 0x0068, all -> 0x0076 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.facebook.a.g.c.EnumC1161c a(com.facebook.a.g.c.a r8, java.lang.String r9, java.util.List<com.facebook.a.c> r10) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.a.g.c.a(com.facebook.a.g.c$a, java.lang.String, java.util.List):com.facebook.a.g.c$c");
    }
}
