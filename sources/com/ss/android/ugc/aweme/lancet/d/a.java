package com.ss.android.ugc.aweme.lancet.d;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lego.p;
import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f107198a = new AtomicBoolean(false);

    /* renamed from: b  reason: collision with root package name */
    public static C2754a f107199b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f107200c = false;

    /* renamed from: com.ss.android.ugc.aweme.lancet.d.a$a  reason: collision with other inner class name */
    public static class C2754a {

        /* renamed from: a  reason: collision with root package name */
        TelephonyManager f107201a;

        /* renamed from: b  reason: collision with root package name */
        public final AtomicInteger f107202b;

        /* renamed from: c  reason: collision with root package name */
        public volatile int f107203c;

        /* renamed from: d  reason: collision with root package name */
        private PhoneStateListener f107204d;

        static {
            Covode.recordClassIndex(68573);
        }

        private C2754a() {
            this.f107202b = new AtomicInteger(-1);
            this.f107203c = -1;
        }

        public final void a() {
            p.f107614a.post(new b(this));
        }

        /* synthetic */ C2754a(byte b2) {
            this();
        }

        public final void a(int i2) {
            this.f107201a.createForSubscriptionId(i2);
            this.f107203c = i2;
            this.f107202b.set(this.f107201a.getNetworkType());
            PhoneStateListener phoneStateListener = this.f107204d;
            if (phoneStateListener != null) {
                this.f107201a.listen(phoneStateListener, 0);
            } else {
                this.f107204d = new PhoneStateListener() {
                    /* class com.ss.android.ugc.aweme.lancet.d.a.C2754a.AnonymousClass2 */

                    static {
                        Covode.recordClassIndex(68575);
                    }

                    public final void onDataConnectionStateChanged(int i2, int i3) {
                        super.onDataConnectionStateChanged(i2, i3);
                        C2754a.this.f107202b.set(i3);
                    }
                };
            }
            this.f107201a.listen(this.f107204d, 64);
        }

        public static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(6084);
            if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
                if (!i.f107220b && "connectivity".equals(str)) {
                    try {
                        new b().a();
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
                        MethodCollector.o(6084);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    static {
        Covode.recordClassIndex(68572);
    }

    public static C2754a a() {
        MethodCollector.i(6039);
        if (f107199b == null) {
            synchronized (a.class) {
                try {
                    if (f107199b == null) {
                        f107199b = new C2754a((byte) 0);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6039);
                    throw th;
                }
            }
        }
        C2754a aVar = f107199b;
        MethodCollector.o(6039);
        return aVar;
    }
}
