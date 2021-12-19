package com.ttnet.org.chromium.net;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.lancet.i;
import com.ttnet.org.chromium.base.ApplicationStatus;
import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.c;
import java.lang.reflect.Field;

public class AndroidCellularSignalStrength {

    /* renamed from: b  reason: collision with root package name */
    private static final AndroidCellularSignalStrength f155347b = new AndroidCellularSignalStrength();

    /* renamed from: a  reason: collision with root package name */
    public volatile int f155348a = Integer.MIN_VALUE;

    class a extends PhoneStateListener implements ApplicationStatus.b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ boolean f155350a = true;

        /* renamed from: c  reason: collision with root package name */
        private final TelephonyManager f155352c;

        private void a() {
            this.f155352c.listen(this, 256);
        }

        static {
            Covode.recordClassIndex(103361);
        }

        private void b() {
            AndroidCellularSignalStrength.this.f155348a = Integer.MIN_VALUE;
            this.f155352c.listen(this, 0);
        }

        @Override // com.ttnet.org.chromium.base.ApplicationStatus.b
        public final void a(int i2) {
            if (i2 == 1) {
                a();
            } else if (i2 == 2) {
                b();
            }
        }

        a() {
            if (ThreadUtils.f155197a || ThreadUtils.f155198b || !ThreadUtils.b()) {
                TelephonyManager telephonyManager = (TelephonyManager) a(c.f155223a, "phone");
                this.f155352c = telephonyManager;
                if (telephonyManager.getSimState() == 5) {
                    ApplicationStatus.a(this);
                    a(ApplicationStatus.getStateForApplication());
                    return;
                }
                return;
            }
            throw new AssertionError("Must be called on a thread other than UI.");
        }

        public final void onSignalStrengthsChanged(SignalStrength signalStrength) {
            if (ApplicationStatus.getStateForApplication() == 1) {
                try {
                    AndroidCellularSignalStrength.this.f155348a = signalStrength.getLevel();
                } catch (SecurityException unused) {
                    AndroidCellularSignalStrength.this.f155348a = Integer.MIN_VALUE;
                    if (!f155350a) {
                        throw new AssertionError();
                    }
                }
            }
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(12412);
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
                        MethodCollector.o(12412);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    private static int getSignalStrengthLevel() {
        return f155347b.f155348a;
    }

    static {
        Covode.recordClassIndex(103359);
    }

    private AndroidCellularSignalStrength() {
        if (Build.VERSION.SDK_INT >= 23) {
            HandlerThread handlerThread = new HandlerThread("AndroidCellularSignalStrength");
            handlerThread.start();
            new Handler(handlerThread.getLooper()).post(new Runnable() {
                /* class com.ttnet.org.chromium.net.AndroidCellularSignalStrength.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(103360);
                }

                public final void run() {
                    new a();
                }
            });
        }
    }
}
