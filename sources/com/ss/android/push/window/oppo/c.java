package com.ss.android.push.window.oppo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.common.utility.Logger;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.b.b.b;
import com.kakao.usermgmt.StringSet;
import com.ss.android.push.window.oppo.d;
import com.ss.android.ugc.aweme.lancet.a.a;
import com.ss.android.ugc.aweme.lancet.i;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static a f60068a;
    private static c p;

    /* renamed from: b  reason: collision with root package name */
    public WindowManager f60069b;

    /* renamed from: c  reason: collision with root package name */
    public View f60070c;

    /* renamed from: d  reason: collision with root package name */
    public Context f60071d;

    /* renamed from: e  reason: collision with root package name */
    public Handler f60072e = new Handler(Looper.getMainLooper());

    /* renamed from: f  reason: collision with root package name */
    public String f60073f;

    /* renamed from: g  reason: collision with root package name */
    public boolean f60074g = false;

    /* renamed from: h  reason: collision with root package name */
    public int f60075h = 2005;

    /* renamed from: i  reason: collision with root package name */
    public int f60076i;

    /* renamed from: j  reason: collision with root package name */
    public int f60077j = 2;

    /* renamed from: k  reason: collision with root package name */
    public boolean f60078k;

    /* renamed from: l  reason: collision with root package name */
    public boolean f60079l = false;

    /* renamed from: m  reason: collision with root package name */
    public boolean f60080m = false;
    public boolean n = false;
    public int o = 0;
    private int q;
    private boolean r = true;
    private Runnable s = new Runnable() {
        /* class com.ss.android.push.window.oppo.c.AnonymousClass3 */

        static {
            Covode.recordClassIndex(37124);
        }

        public final void run() {
            c cVar = c.this;
            cVar.n = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(cVar.f60070c, "translationY", (float) cVar.o, (float) (-cVar.f60070c.getMeasuredHeight()));
            ofFloat.addListener(new AnimatorListenerAdapter() {
                /* class com.ss.android.push.window.oppo.c.AnonymousClass2 */

                static {
                    Covode.recordClassIndex(37123);
                }

                public final void onAnimationCancel(Animator animator) {
                    super.onAnimationCancel(animator);
                    try {
                        c.this.n = false;
                        c.this.f60079l = false;
                        c.this.f60069b.removeViewImmediate(c.this.f60070c);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    try {
                        c.this.n = false;
                        c.this.f60079l = false;
                        c.this.f60069b.removeViewImmediate(c.this.f60070c);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                }
            });
            ofFloat.setDuration(200L);
            ofFloat.start();
        }
    };

    static {
        Covode.recordClassIndex(37121);
    }

    public final boolean b() {
        if (!this.f60074g || e.a(this.f60071d) != 0) {
            return false;
        }
        return true;
    }

    public final d.a c() {
        d a2 = d.a(this.f60071d);
        LinkedList linkedList = new LinkedList();
        if (!a(a2.f60085a).f60078k) {
            a2.f60086b.a();
        } else {
            Map<Integer, d.a> b2 = a2.f60086b.b();
            if (!b2.isEmpty()) {
                for (Map.Entry<Integer, d.a> entry : b2.entrySet()) {
                    if (entry != null) {
                        linkedList.add(entry.getValue());
                    }
                }
            }
        }
        Logger.debug();
        if (!linkedList.isEmpty()) {
            return (d.a) linkedList.get(0);
        }
        return null;
    }

    public final void a() {
        boolean z;
        boolean z2;
        if (!TextUtils.isEmpty(this.f60073f)) {
            try {
                JSONObject jSONObject = new JSONObject(this.f60073f);
                boolean z3 = false;
                if (jSONObject.optInt("is_show", 0) == 1) {
                    z = true;
                } else {
                    z = false;
                }
                this.f60074g = z;
                if (jSONObject.optInt("is_cache_message", 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f60078k = z2;
                this.q = jSONObject.optInt("show_time_mill", 5000);
                if (jSONObject.optInt("is_auto_dismiss", 1) == 1) {
                    z3 = true;
                }
                this.r = z3;
                this.f60077j = jSONObject.optInt("cache_size", 2);
                this.f60075h = jSONObject.optInt(StringSet.type, 2005);
                this.f60076i = jSONObject.optInt("flag", 1160);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static synchronized c a(Context context) {
        c cVar;
        synchronized (c.class) {
            MethodCollector.i(6793);
            if (f60068a != null) {
                if (p == null) {
                    p = new c(context);
                }
                cVar = p;
                MethodCollector.o(6793);
            } else {
                RuntimeException runtimeException = new RuntimeException("should call init(context, pushWindowDepend) in Application");
                MethodCollector.o(6793);
                throw runtimeException;
            }
        }
        return cVar;
    }

    private c(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f60071d = applicationContext;
        this.f60069b = (WindowManager) a(context, "window");
        this.f60072e.postDelayed(new Runnable() {
            /* class com.ss.android.push.window.oppo.c.AnonymousClass1 */

            static {
                Covode.recordClassIndex(37122);
            }

            public final void run() {
                if (c.this.b() && c.this.f60078k) {
                    c.a(c.this.f60071d).c();
                }
            }
        }, 10000);
    }

    public static synchronized c a(Context context, a aVar) {
        c a2;
        synchronized (c.class) {
            MethodCollector.i(6792);
            f60068a = aVar;
            a2 = a(context);
            MethodCollector.o(6792);
        }
        return a2;
    }

    private static Object a(Context context, String str) {
        Object obj;
        MethodCollector.i(6801);
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
                    MethodCollector.o(6801);
                }
            }
        } else {
            obj = context.getSystemService(str);
        }
        return obj;
    }
}
