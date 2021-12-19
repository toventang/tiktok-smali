package com.ss.android.socialbase.downloader.a;

import android.app.Activity;
import android.app.Application;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Application f60265a;

    /* renamed from: b  reason: collision with root package name */
    public final List<AbstractC1310a> f60266b;

    /* renamed from: c  reason: collision with root package name */
    public int f60267c;

    /* renamed from: d  reason: collision with root package name */
    public WeakReference<Activity> f60268d;

    /* renamed from: e  reason: collision with root package name */
    volatile int f60269e;

    /* renamed from: f  reason: collision with root package name */
    public volatile boolean f60270f;

    /* renamed from: g  reason: collision with root package name */
    public final Application.ActivityLifecycleCallbacks f60271g;

    /* renamed from: com.ss.android.socialbase.downloader.a.a$a  reason: collision with other inner class name */
    public interface AbstractC1310a {
        static {
            Covode.recordClassIndex(37218);
        }

        void a();

        void b();
    }

    static {
        Covode.recordClassIndex(37216);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f60273a = new a((byte) 0);

        static {
            Covode.recordClassIndex(37219);
        }
    }

    private a() {
        this.f60266b = new ArrayList();
        this.f60269e = -1;
        this.f60270f = false;
        this.f60271g = new Application.ActivityLifecycleCallbacks() {
            /* class com.ss.android.socialbase.downloader.a.a.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37217);
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            public final void onActivityDestroyed(Activity activity) {
            }

            public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            }

            public final void onActivityPaused(Activity activity) {
                a.this.f60270f = true;
                if (a.this.f60267c == 0 && activity != null) {
                    a.this.f60267c = activity.hashCode();
                }
            }

            public final void onActivityResumed(Activity activity) {
                int i2;
                int i3 = a.this.f60267c;
                a.this.f60270f = false;
                a aVar = a.this;
                if (activity != null) {
                    i2 = activity.hashCode();
                } else {
                    i2 = i3;
                }
                aVar.f60267c = i2;
                if (i3 == 0) {
                    a.this.c();
                }
            }

            public final void onActivityStarted(Activity activity) {
                int i2;
                a.this.f60268d = new WeakReference<>(activity);
                int i3 = a.this.f60267c;
                a aVar = a.this;
                if (activity != null) {
                    i2 = activity.hashCode();
                } else {
                    i2 = i3;
                }
                aVar.f60267c = i2;
                a.this.f60270f = false;
                if (i3 == 0) {
                    a.this.c();
                }
            }

            public final void onActivityStopped(Activity activity) {
                if (activity != null && activity.hashCode() == a.this.f60267c) {
                    a.this.f60267c = 0;
                    a aVar = a.this;
                    aVar.f60269e = 0;
                    Object[] b2 = aVar.b();
                    if (b2 != null) {
                        for (Object obj : b2) {
                            ((AbstractC1310a) obj).b();
                        }
                    }
                }
                a.this.f60270f = false;
            }
        };
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a() {
        /*
            r2 = this;
            int r1 = r2.f60269e
            r0 = -1
            if (r1 != r0) goto L_0x000b
            boolean r1 = r2.d()
            r2.f60269e = r1
        L_0x000b:
            r0 = 1
            if (r1 != r0) goto L_0x000f
            return r0
        L_0x000f:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.a.a.a():boolean");
    }

    public final void c() {
        this.f60269e = 1;
        Object[] b2 = b();
        if (b2 != null) {
            for (Object obj : b2) {
                ((AbstractC1310a) obj).a();
            }
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 123
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.processBlocksTree(BlockProcessor.java:72)
        	at jadx.core.dex.visitors.blocksmaker.BlockProcessor.visit(BlockProcessor.java:46)
        */
    private boolean d() {
        /*
            r6 = this;
            r5 = 0
            android.app.Application r1 = r6.f60265a     // Catch:{ all -> 0x0022 }
            if (r1 != 0) goto L_0x0006
            return r5
        L_0x0006:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = a(r1, r0)     // Catch:{ all -> 0x0022 }
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch:{ all -> 0x0022 }
            java.lang.String r4 = r1.getPackageName()     // Catch:{ all -> 0x0022 }
            java.util.List r1 = r0.getRunningAppProcesses()     // Catch:{ all -> 0x0022 }
            if (r1 == 0) goto L_0x0022
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x0023
            goto L_0x0022
        L_0x001f:
            if (r0 == 0) goto L_0x0027
            r5 = 1
        L_0x0022:
            return r5
        L_0x0023:
            java.util.Iterator r3 = r1.iterator()
        L_0x0027:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r2 = r3.next()
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2
            int r1 = r2.importance
            r0 = 100
            if (r1 != r0) goto L_0x0027
            java.lang.String r0 = r2.processName
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.a.a.d():boolean");
    }

    /* access modifiers changed from: package-private */
    public final Object[] b() {
        Object[] objArr;
        MethodCollector.i(14599);
        synchronized (this.f60266b) {
            try {
                if (this.f60266b.size() > 0) {
                    objArr = this.f60266b.toArray();
                } else {
                    objArr = null;
                }
            } finally {
                MethodCollector.o(14599);
            }
        }
        return objArr;
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(14609);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!i.f107220b && "connectivity".equals(str)) {
                try {
                    new com.bytedance.platform.godzilla.b.b.b().a();
                    i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (i.f107219a) {
            synchronized (ClipboardManager.class) {
                try {
                    obj = context.getSystemService(str);
                    if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
                        try {
                            Field declaredField = ClipboardManager.class.getDeclaredField("mHandler");
                            declaredField.setAccessible(true);
                            declaredField.set(obj, new i.a((Handler) declaredField.get(obj)));
                        } catch (Exception e2) {
                            d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(14609);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
