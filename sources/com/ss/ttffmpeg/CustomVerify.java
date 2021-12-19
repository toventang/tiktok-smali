package com.ss.ttffmpeg;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;

public class CustomVerify {

    /* renamed from: a  reason: collision with root package name */
    public static String f151875a = "custom_verify_ffmpeg";

    /* renamed from: b  reason: collision with root package name */
    private static Method f151876b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f151877c = true;

    /* renamed from: d  reason: collision with root package name */
    private static Class<?> f151878d;

    /* renamed from: e  reason: collision with root package name */
    private static Method f151879e;

    static final native void _init();

    private static Object a(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_ttffmpeg_CustomVerify_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_ttffmpeg_CustomVerify_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(101273);
        try {
            f151876b = Class.forName("com.ttnet.org.chromium.net.X509Util").getMethod("a", byte[][].class, String.class, String.class);
            Class<?> cls = Class.forName("com.ttnet.org.chromium.net.AndroidCertVerifyResult");
            f151878d = cls;
            f151879e = cls.getMethod("getStatus", new Class[0]);
        } catch (Exception e2) {
            e2.getMessage();
        }
    }

    public static int doVerify(byte[][] bArr, String str, String str2) {
        Method method = f151876b;
        if (method == null || f151878d == null || f151879e == null) {
            return -99995;
        }
        try {
            return ((Integer) a(f151879e, a(method, null, new Object[]{bArr, str, str2}), new Object[0])).intValue();
        } catch (Throwable th) {
            th.getMessage();
            return -99996;
        }
    }
}
