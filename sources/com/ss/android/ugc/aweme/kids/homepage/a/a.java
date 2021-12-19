package com.ss.android.ugc.aweme.kids.homepage.a;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import h.z;
import java.lang.reflect.Field;
import java.util.Objects;
import java.util.concurrent.Callable;

public final class a extends BroadcastReceiver {
    static {
        Covode.recordClassIndex(68082);
    }

    /* renamed from: com.ss.android.ugc.aweme.kids.homepage.a.a$a  reason: collision with other inner class name */
    static final class CallableC2720a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final CallableC2720a f106539a = new CallableC2720a();

        static {
            Covode.recordClassIndex(68083);
        }

        CallableC2720a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            Object a2 = a(d.a(), "connectivity");
            Objects.requireNonNull(a2, "null cannot be cast to non-null type android.net.ConnectivityManager");
            f.a.f68431a.a(a((ConnectivityManager) a2));
            return z.f158842a;
        }

        private static NetworkInfo a(ConnectivityManager connectivityManager) {
            try {
                return connectivityManager.getActiveNetworkInfo();
            } catch (Exception e2) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
                return com.ss.android.ugc.aweme.net.e.a.a();
            }
        }

        private static Object a(Context context, String str) {
            Object obj;
            MethodCollector.i(10088);
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
                                com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                            }
                        }
                        i.f107219a = false;
                    } finally {
                        MethodCollector.o(10088);
                    }
                }
            } else {
                obj = context.getSystemService(str);
            }
            return obj;
        }
    }

    public final void onReceive(Context context, Intent intent) {
        l.d(context, "");
        l.d(intent, "");
        if (l.a((Object) "android.net.conn.CONNECTIVITY_CHANGE", (Object) intent.getAction())) {
            try {
                b.i.b(CallableC2720a.f106539a, g.a());
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }
}
