package com.ss.android.ugc.aweme.legoImp.task;

import android.content.ClipboardManager;
import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.bytedance.apm.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.crash.d;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.i;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import com.ss.android.ugc.aweme.network.a.c;
import h.f.b.l;
import h.q;
import h.r;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

public final class NetworkRestrictionTask implements w {
    static {
        Covode.recordClassIndex(69069);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1048575;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ad f() {
        return x.a(this);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String g() {
        return "task_";
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final boolean i() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final List j() {
        return null;
    }

    @Override // com.ss.android.ugc.aweme.lego.w
    public final ae b() {
        return ae.IDLE;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final ab k() {
        return ab.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final String h() {
        return getClass().getSimpleName();
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final void a(Context context) {
        int intValue;
        Object obj;
        if (context != null && (intValue = ((Number) c.f112535a.getValue()).intValue()) != 0) {
            try {
                Object a2 = a(context, "connectivity");
                if (!(a2 instanceof ConnectivityManager)) {
                    a2 = null;
                }
                ConnectivityManager connectivityManager = (ConnectivityManager) a2;
                if (connectivityManager != null && connectivityManager.isActiveNetworkMetered()) {
                    int restrictBackgroundStatus = connectivityManager.getRestrictBackgroundStatus();
                    int i2 = 2;
                    if (restrictBackgroundStatus != 2) {
                        if (restrictBackgroundStatus == 3) {
                            i2 = 1;
                        } else {
                            return;
                        }
                    }
                    obj = q.m223constructorimpl(Integer.valueOf(i2));
                    if (q.m229isSuccessimpl(obj)) {
                        int intValue2 = ((Number) obj).intValue();
                        if ((intValue & intValue2) == intValue2) {
                            JSONObject put = new JSONObject().put("restrict_status", intValue2);
                            l.b(put, "");
                            b.a("restrict_background_status", put, (JSONObject) null, (JSONObject) null);
                        }
                    }
                    Throwable r0 = q.m226exceptionOrNullimpl(obj);
                    if (r0 != null && (intValue & 4) == 4) {
                        JSONObject put2 = new JSONObject().put("e", r0.getMessage());
                        l.b(put2, "");
                        JSONObject put3 = new JSONObject().put("restrict_status", 4);
                        l.b(put3, "");
                        b.a("restrict_background_status", put3, (JSONObject) null, put2);
                    }
                }
            } catch (Throwable th) {
                obj = q.m223constructorimpl(r.a(th));
            }
        }
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(3350);
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
                    MethodCollector.o(3350);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
