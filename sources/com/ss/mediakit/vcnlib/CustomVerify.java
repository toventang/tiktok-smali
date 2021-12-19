package com.ss.mediakit.vcnlib;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import java.lang.reflect.Method;

public class CustomVerify {
    private static Method getVerifyStatusMethod;
    private static boolean hasInited = true;
    private static Method verifyMethod;
    private static Class<?> verifyResultClass;

    private static final native void _init();

    public static int com_ss_mediakit_vcnlib_CustomVerify_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    private static Object com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    public static void init() {
        MethodCollector.i(4791);
        com_ss_mediakit_vcnlib_CustomVerify_com_ss_android_ugc_aweme_lancet_LogLancet_e("custom_verify", "start init native");
        _init();
        com_ss_mediakit_vcnlib_CustomVerify_com_ss_android_ugc_aweme_lancet_LogLancet_e("custom_verify", "end init native");
        MethodCollector.o(4791);
    }

    static {
        Covode.recordClassIndex(101174);
        try {
            verifyMethod = Class.forName("com.ttnet.org.chromium.net.X509Util").getMethod("a", byte[][].class, String.class, String.class);
            Class<?> cls = Class.forName("com.ttnet.org.chromium.net.AndroidCertVerifyResult");
            verifyResultClass = cls;
            getVerifyStatusMethod = cls.getMethod("getStatus", new Class[0]);
        } catch (Exception e2) {
            com_ss_mediakit_vcnlib_CustomVerify_com_ss_android_ugc_aweme_lancet_LogLancet_e("custom_verify", "found verify class or method exception:" + e2.getMessage());
        }
        if (verifyMethod != null && verifyResultClass != null) {
            com_ss_mediakit_vcnlib_CustomVerify_com_ss_android_ugc_aweme_lancet_LogLancet_e("custom_verify", "get verify method or verify result class suc");
        }
    }

    public static int doVerify(byte[][] bArr, String str, String str2) {
        if (verifyMethod == null || verifyResultClass == null || getVerifyStatusMethod == null) {
            com_ss_mediakit_vcnlib_CustomVerify_com_ss_android_ugc_aweme_lancet_LogLancet_e("custom_verify", "verify method is null ecception");
            return -99995;
        }
        try {
            com_ss_mediakit_vcnlib_CustomVerify_com_ss_android_ugc_aweme_lancet_LogLancet_e("custom_verify", "host: " + str2 + "  authType: " + str);
            Object com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke = com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke(verifyMethod, null, new Object[]{bArr, str, str2});
            com_ss_mediakit_vcnlib_CustomVerify_com_ss_android_ugc_aweme_lancet_LogLancet_e("custom_verify", "get status end");
            int intValue = ((Integer) com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke(getVerifyStatusMethod, com_ss_mediakit_vcnlib_CustomVerify_java_lang_reflect_Method_invoke, new Object[0])).intValue();
            com_ss_mediakit_vcnlib_CustomVerify_com_ss_android_ugc_aweme_lancet_LogLancet_e("custom_verify", "verify result status: ".concat(String.valueOf(intValue)));
            return intValue;
        } catch (Throwable th) {
            com_ss_mediakit_vcnlib_CustomVerify_com_ss_android_ugc_aweme_lancet_LogLancet_e("custom_verify", "verify exception stacktrace:" + th.getMessage());
            return -99996;
        }
    }
}
