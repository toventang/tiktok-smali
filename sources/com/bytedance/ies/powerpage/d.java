package com.bytedance.ies.powerpage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerpage.b.a;
import com.bytedance.router.FakeFragment;
import com.bytedance.router.OnActivityResultCallback;
import com.bytedance.router.SmartRouter;
import h.f.b.ab;
import h.f.b.l;
import h.w;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f34436a = new d();

    /* renamed from: b  reason: collision with root package name */
    private static String f34437b = "";

    /* renamed from: c  reason: collision with root package name */
    private static Class<? extends e> f34438c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f34439d;

    private d() {
    }

    static {
        Covode.recordClassIndex(20579);
    }

    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? extends androidx.fragment.app.e> */
    public final void a() {
        MethodCollector.i(3693);
        f34437b = "com.ss.android.ugc.aweme.host.TikTokHostActivity";
        if (f34439d) {
            MethodCollector.o(3693);
            return;
        }
        synchronized (this) {
            try {
                if (!f34439d) {
                    Class cls = Class.forName(f34437b);
                    if (cls != null) {
                        f34438c = cls;
                        SmartRouter.addLastInterceptor(new a());
                        f34439d = true;
                    } else {
                        w wVar = new w("null cannot be cast to non-null type");
                        MethodCollector.o(3693);
                        throw wVar;
                    }
                }
            } finally {
                MethodCollector.o(3693);
            }
        }
    }

    public final Intent a(Context context, Class<? extends Fragment> cls, Bundle bundle) {
        l.c(context, "");
        l.c(cls, "");
        a();
        com.bytedance.ies.powerpage.a.a aVar = (com.bytedance.ies.powerpage.a.a) cls.getAnnotation(com.bytedance.ies.powerpage.a.a.class);
        if (aVar == null) {
            return null;
        }
        Intent intent = new Intent();
        if (l.a(ab.a(aVar.a()), ab.a(e.class))) {
            Class<? extends e> cls2 = f34438c;
            if (cls2 == null || intent.setClass(context, cls2) == null) {
                throw new RuntimeException("No default FragmentActivity!!!");
            }
        } else {
            intent.setClass(context, aVar.a());
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        intent.putExtra("POWER_FRAGMENT_CLASS_NAME", cls.getName());
        return intent;
    }

    public final Intent a(Context context, Class<? extends Fragment> cls, Bundle bundle, int i2, OnActivityResultCallback onActivityResultCallback) {
        l.c(context, "");
        l.c(cls, "");
        Intent a2 = a(context, cls, bundle);
        if (a2 == null) {
            return null;
        }
        if (i2 == Integer.MIN_VALUE) {
            com.ss.android.ugc.tiktok.security.a.a.a(a2, context);
            context.startActivity(a2);
        } else {
            if (!(context instanceof Activity)) {
                context = null;
            }
            Activity activity = (Activity) context;
            if (activity != null) {
                if (onActivityResultCallback == null || !(activity instanceof e)) {
                    activity.startActivityForResult(a2, i2);
                } else {
                    FakeFragment fakeFragment = new FakeFragment();
                    fakeFragment.setCallback(onActivityResultCallback);
                    ((e) activity).getSupportFragmentManager().a().a(fakeFragment, String.valueOf(System.currentTimeMillis())).d();
                    fakeFragment.startActivityForResult(a2, i2);
                }
            }
        }
        return a2;
    }

    public static /* synthetic */ Intent a(d dVar, Context context, Class cls, Bundle bundle, int i2, int i3) {
        if ((i3 & 4) != 0) {
            bundle = null;
        }
        if ((i3 & 8) != 0) {
            i2 = Integer.MIN_VALUE;
        }
        return dVar.a(context, cls, bundle, i2, null);
    }
}
