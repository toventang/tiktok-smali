package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lego.ab;
import com.ss.android.ugc.aweme.lego.ad;
import com.ss.android.ugc.aweme.lego.ae;
import com.ss.android.ugc.aweme.lego.w;
import com.ss.android.ugc.aweme.lego.x;
import java.lang.reflect.Method;
import java.util.List;

public class WebViewPreInitTask implements w {

    static class a {

        /* renamed from: a  reason: collision with root package name */
        static volatile boolean f142579a;

        static {
            Covode.recordClassIndex(93266);
        }
    }

    static {
        Covode.recordClassIndex(93265);
    }

    @Override // com.ss.android.ugc.aweme.lego.n
    public final int bK_() {
        return 1;
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
        return ae.BACKGROUND;
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
        if (!a.f142579a) {
            try {
                Long.valueOf(SystemClock.elapsedRealtime());
                Class<?> cls = Class.forName("android.webkit.WebViewFactory");
                Method[] declaredMethods = cls.getDeclaredMethods();
                Method method = null;
                int length = declaredMethods.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    Method method2 = declaredMethods[i2];
                    if (TextUtils.equals(method2.getName(), "getProvider")) {
                        method = method2;
                        break;
                    }
                    i2++;
                }
                method.setAccessible(true);
                Object[] objArr = new Object[0];
                Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{cls, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_utils_WebViewPreInitTask$WebViewInitHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                if (((Boolean) a2.first).booleanValue()) {
                    Object obj = a2.second;
                    return;
                }
                com.bytedance.helios.sdk.a.a(method.invoke(cls, objArr), method, new Object[]{cls, objArr}, "com_ss_android_ugc_aweme_utils_WebViewPreInitTask$WebViewInitHelper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            } catch (Throwable unused) {
            }
        }
    }
}
