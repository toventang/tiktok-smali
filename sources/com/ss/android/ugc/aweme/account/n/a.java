package com.ss.android.ugc.aweme.account.n;

import android.content.Context;
import android.os.Build;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.m.b;
import com.ss.android.ugc.aweme.account.util.e;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.cj;
import h.f.b.l;
import h.z;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f65159a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f65160b = false;

    private a() {
    }

    /* renamed from: com.ss.android.ugc.aweme.account.n.a$a  reason: collision with other inner class name */
    public static final class CallableC1451a<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static final CallableC1451a f65161a = new CallableC1451a();

        static {
            Covode.recordClassIndex(40059);
        }

        CallableC1451a() {
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            try {
                if (Build.VERSION.SDK_INT >= 21) {
                    CookieManager.getInstance().flush();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            return z.f158842a;
        }
    }

    static {
        Covode.recordClassIndex(40058);
    }

    public static final void a(Context context) {
        if (context != null && !cj.d()) {
            JSONObject a2 = new c().a("enter_from", "normal").a();
            l.b(a2, "");
            b.a("monitor_clear_cookie", 1, a2);
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(context);
            }
            CookieManager a3 = e.a();
            if (a3 != null) {
                a3.removeAllCookie();
                if (Build.VERSION.SDK_INT >= 21) {
                    a3.flush();
                } else {
                    CookieSyncManager.getInstance().sync();
                }
            }
        }
    }
}
