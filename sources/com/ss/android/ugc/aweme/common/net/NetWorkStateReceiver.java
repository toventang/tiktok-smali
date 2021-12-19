package com.ss.android.ugc.aweme.common.net;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import b.i;
import com.bytedance.common.utility.l;
import com.bytedance.common.wschannel.e.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.bytedance.platform.godzilla.b.b.b;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.cw.g;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.video.q;
import java.lang.reflect.Field;

public class NetWorkStateReceiver extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f76466a;

    /* renamed from: b  reason: collision with root package name */
    boolean f76467b;

    /* renamed from: c  reason: collision with root package name */
    private l.a f76468c = l.a.UNKNOWN;

    static {
        Covode.recordClassIndex(47214);
    }

    public NetWorkStateReceiver() {
        if (d.a(com.bytedance.ies.ugc.appcontext.d.a())) {
            this.f76467b = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a() {
        f.a.f68431a.a(a((ConnectivityManager) a(com.bytedance.ies.ugc.appcontext.d.a(), "connectivity")));
        l.a aVar = f.a.f68431a.f68429a;
        if (aVar != this.f76468c) {
            q.b();
        }
        if (this.f76468c != l.a.UNKNOWN) {
            f76466a = true;
        }
        this.f76468c = aVar;
        return null;
    }

    private static NetworkInfo a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetworkInfo();
        } catch (Exception e2) {
            a.a((Throwable) e2);
            return com.ss.android.ugc.aweme.net.e.a.a();
        }
    }

    public void onReceive(Context context, Intent intent) {
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
            try {
                i.b(new d(this), g.a()).a(new e(this), i.f4826c, null);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6307);
        if (Build.VERSION.SDK_INT > 27 || !"clipboard".equals(str)) {
            if (!com.ss.android.ugc.aweme.lancet.i.f107220b && "connectivity".equals(str)) {
                try {
                    new b().a();
                    com.ss.android.ugc.aweme.lancet.i.f107220b = true;
                    obj = context.getSystemService(str);
                } catch (Throwable unused) {
                }
            }
            obj = context.getSystemService(str);
        } else if (com.ss.android.ugc.aweme.lancet.i.f107219a) {
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
                    com.ss.android.ugc.aweme.lancet.i.f107219a = false;
                } finally {
                    MethodCollector.o(6307);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
