package com.ss.android.ugc.aweme.newfollow.c;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.al;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.lancet.i;
import h.f.b.l;
import java.lang.reflect.Field;

public final class a implements al {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f112573a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final C2879a f112574b = new C2879a((byte) 0);

    @Override // com.ss.android.ugc.aweme.al
    public final void b() {
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.c.a$a  reason: collision with other inner class name */
    public static final class C2879a {
        static {
            Covode.recordClassIndex(72347);
        }

        private C2879a() {
        }

        public /* synthetic */ C2879a(byte b2) {
            this();
        }
    }

    static {
        Covode.recordClassIndex(72346);
    }

    @Override // com.ss.android.ugc.aweme.al
    public final void a() {
        try {
            if (b.g() == null || f112573a) {
                f112573a = false;
                return;
            }
            IAccountUserService g2 = b.g();
            l.b(g2, "");
            if (g2.isLogin()) {
                com.ss.android.ugc.aweme.compliance.api.a.c().d();
            }
            f112573a = false;
            try {
                Object a2 = a(d.a(), "connectivity");
                if (a2 != null) {
                    f.a.f68431a.a(a((ConnectivityManager) a2));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.net.ConnectivityManager");
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
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
        MethodCollector.i(4246);
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
                            com.bytedance.crash.d.a(e2, "ClipboardManager Handler Reflect Fail");
                        }
                    }
                    i.f107219a = false;
                } finally {
                    MethodCollector.o(4246);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
