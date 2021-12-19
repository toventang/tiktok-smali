package com.ss.texturerender.a;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import com.ss.texturerender.k;
import com.ss.texturerender.l;
import java.lang.reflect.Method;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    Object f151786a;

    /* renamed from: b  reason: collision with root package name */
    Method f151787b;

    /* renamed from: c  reason: collision with root package name */
    Method f151788c;

    /* renamed from: d  reason: collision with root package name */
    Method f151789d;

    /* renamed from: e  reason: collision with root package name */
    Method f151790e;

    /* renamed from: f  reason: collision with root package name */
    private Method f151791f;

    static {
        Covode.recordClassIndex(101228);
    }

    public final void a() {
        Method method;
        Object obj = this.f151786a;
        if (!(obj == null || (method = this.f151791f) == null)) {
            a(method, obj, new Object[0]);
            l.a("TR_AdaptiveSharpenWrapper", "ReleaseAdaptiveSharpen");
        }
        this.f151786a = null;
    }

    public c() {
        l.a("TR_AdaptiveSharpenWrapper", "new AdaptiveSharpenWrapper");
        try {
            Class<?> a2 = k.a("com.ss.lens.algorithm.AdaptiveSharpen");
            if (a2 != null) {
                this.f151787b = a2.getDeclaredMethod("InitAdaptiveSharpen", Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
                this.f151788c = a2.getDeclaredMethod("AdaptiveSharpenProcess", Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE);
                this.f151789d = a2.getDeclaredMethod("AdaptiveSharpenOesProcess", Integer.TYPE, Integer.TYPE, Integer.TYPE, float[].class, Boolean.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Integer.TYPE);
                this.f151790e = a2.getDeclaredMethod("GetAdaptiveSharpenOutput", new Class[0]);
                this.f151791f = a2.getDeclaredMethod("ReleaseAdaptiveSharpen", new Class[0]);
                this.f151786a = a2.newInstance();
            }
        } catch (Exception e2) {
            l.a("TR_AdaptiveSharpenWrapper", "AdaptiveSharpen get fail:" + e2.toString());
            this.f151786a = null;
            this.f151787b = null;
            this.f151788c = null;
            this.f151790e = null;
            this.f151791f = null;
        }
    }

    static Object a(Method method, Object obj, Object... objArr) {
        if (method == null || obj == null) {
            return null;
        }
        try {
            Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_texturerender_effect_AdaptiveSharpenWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            if (((Boolean) a2.first).booleanValue()) {
                return a2.second;
            }
            Object invoke = method.invoke(obj, objArr);
            a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_texturerender_effect_AdaptiveSharpenWrapper_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
            return invoke;
        } catch (Exception e2) {
            l.a("TR_AdaptiveSharpenWrapper", e2.toString());
            return null;
        }
    }
}
