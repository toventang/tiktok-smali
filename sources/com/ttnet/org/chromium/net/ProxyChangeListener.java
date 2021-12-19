package com.ttnet.org.chromium.net;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sysoptimizer.ReceiverRegisterCrashOptimizer;
import com.ss.android.ugc.aweme.lancet.i;
import com.ttnet.org.chromium.base.b;
import com.ttnet.org.chromium.base.c;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ProxyChangeListener {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ boolean f155428a = true;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f155429b = true;

    /* renamed from: c  reason: collision with root package name */
    private final Looper f155430c;

    /* renamed from: d  reason: collision with root package name */
    private final Handler f155431d;

    /* renamed from: e  reason: collision with root package name */
    private long f155432e;

    /* renamed from: f  reason: collision with root package name */
    private ProxyReceiver f155433f;

    /* renamed from: g  reason: collision with root package name */
    private BroadcastReceiver f155434g;

    private native void nativeProxySettingsChanged(long j2);

    private native void nativeProxySettingsChangedTo(long j2, String str, int i2, String str2, String[] strArr);

    public static ProxyChangeListener create() {
        return new ProxyChangeListener();
    }

    static {
        Covode.recordClassIndex(103396);
    }

    private boolean a() {
        if (this.f155430c == Looper.myLooper()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f155436e = new a("", 0, "", new String[0]);

        /* renamed from: a  reason: collision with root package name */
        public final String f155437a;

        /* renamed from: b  reason: collision with root package name */
        public final int f155438b;

        /* renamed from: c  reason: collision with root package name */
        public final String f155439c;

        /* renamed from: d  reason: collision with root package name */
        public final String[] f155440d;

        static {
            Covode.recordClassIndex(103398);
        }

        public static a a(ProxyInfo proxyInfo) {
            String str = null;
            if (proxyInfo == null) {
                return null;
            }
            Uri pacFileUrl = proxyInfo.getPacFileUrl();
            String host = proxyInfo.getHost();
            int port = proxyInfo.getPort();
            if (!Uri.EMPTY.equals(pacFileUrl)) {
                str = pacFileUrl.toString();
            }
            return new a(host, port, str, proxyInfo.getExclusionList());
        }

        public a(String str, int i2, String str2, String[] strArr) {
            this.f155437a = str;
            this.f155438b = i2;
            this.f155439c = str2;
            this.f155440d = strArr;
        }
    }

    private ProxyChangeListener() {
        Looper myLooper = Looper.myLooper();
        this.f155430c = myLooper;
        this.f155431d = new Handler(myLooper);
    }

    private void b() {
        if (b.f155218a && !a()) {
            throw new IllegalStateException("Must be called on ProxyChangeListener thread.");
        }
    }

    public void stop() {
        b();
        this.f155432e = 0;
        b();
        if (f155428a || this.f155433f != null) {
            c.f155223a.unregisterReceiver(this.f155433f);
            if (this.f155434g != null) {
                c.f155223a.unregisterReceiver(this.f155434g);
            }
            this.f155433f = null;
            this.f155434g = null;
            return;
        }
        throw new AssertionError();
    }

    /* access modifiers changed from: package-private */
    public class ProxyReceiver extends BroadcastReceiver {
        static {
            Covode.recordClassIndex(103397);
        }

        private ProxyReceiver() {
        }

        private static Bundle b(Intent intent) {
            try {
                return intent.getExtras();
            } catch (Exception unused) {
                return null;
            }
        }

        static a a(Intent intent) {
            Bundle b2 = b(intent);
            if (b2 == null) {
                return null;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                return a.a((ProxyInfo) a(b2, "android.intent.extra.PROXY_INFO"));
            }
            try {
                Object a2 = a(b2, "proxy");
                if (a2 == null) {
                    return null;
                }
                Class<?> cls = Class.forName("android.net.ProxyProperties");
                Method declaredMethod = cls.getDeclaredMethod("getHost", new Class[0]);
                Method declaredMethod2 = cls.getDeclaredMethod("getPort", new Class[0]);
                Method declaredMethod3 = cls.getDeclaredMethod("getExclusionList", new Class[0]);
                String str = (String) declaredMethod.invoke(a2, new Object[0]);
                int intValue = ((Integer) declaredMethod2.invoke(a2, new Object[0])).intValue();
                String[] split = ((String) declaredMethod3.invoke(a2, new Object[0])).split(",");
                int i2 = Build.VERSION.SDK_INT;
                String str2 = (String) cls.getDeclaredMethod("getPacFileUrl", new Class[0]).invoke(a2, new Object[0]);
                if (!TextUtils.isEmpty(str2)) {
                    return new a(str, intValue, str2, split);
                }
                return new a(str, intValue, null, split);
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | NullPointerException | InvocationTargetException unused) {
                return null;
            }
        }

        /* synthetic */ ProxyReceiver(ProxyChangeListener proxyChangeListener, byte b2) {
            this();
        }

        private static Object a(Bundle bundle, String str) {
            try {
                return bundle.get(str);
            } catch (Exception | OutOfMemoryError unused) {
                return null;
            }
        }

        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.intent.action.PROXY_CHANGE")) {
                ProxyChangeListener.this.a(new p(this, intent));
            }
        }
    }

    public static String getProperty(String str) {
        return System.getProperty(str);
    }

    public final void a(a aVar) {
        MethodCollector.i(13905);
        b();
        if (!f155429b) {
            MethodCollector.o(13905);
            return;
        }
        long j2 = this.f155432e;
        if (j2 == 0) {
            MethodCollector.o(13905);
        } else if (aVar != null) {
            nativeProxySettingsChangedTo(j2, aVar.f155437a, aVar.f155438b, aVar.f155439c, aVar.f155440d);
            MethodCollector.o(13905);
        } else {
            nativeProxySettingsChanged(j2);
            MethodCollector.o(13905);
        }
    }

    public void start(long j2) {
        b();
        boolean z = f155428a;
        if (z || this.f155432e == 0) {
            this.f155432e = j2;
            b();
            if (!z) {
                if (this.f155433f != null) {
                    throw new AssertionError();
                } else if (this.f155434g != null) {
                    throw new AssertionError();
                }
            }
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.PROXY_CHANGE");
            this.f155433f = new ProxyReceiver(this, (byte) 0);
            if (Build.VERSION.SDK_INT < 23) {
                b(c.f155223a, this.f155433f, intentFilter);
                return;
            }
            b(c.f155223a, this.f155433f, new IntentFilter());
            this.f155434g = new n(this);
            b(c.f155223a, this.f155434g, intentFilter);
            return;
        }
        throw new AssertionError();
    }

    public final void a(Runnable runnable) {
        if (a()) {
            runnable.run();
        } else {
            this.f155431d.post(runnable);
        }
    }

    public static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(13956);
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
                    MethodCollector.o(13956);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
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
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.net.ProxyChangeListener.b(android.content.Context, android.content.BroadcastReceiver, android.content.IntentFilter):android.content.Intent");
    }
}
