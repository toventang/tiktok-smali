package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.helios.sdk.a;
import com.bytedance.ies.ugc.appcontext.d;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.video.e;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class JacocoUtils {
    private static boolean ReleaseMode = true;
    public static int TimeInterval = 60;
    public static Object coverageMonitor;
    public static Method dataUploadMethod;
    public static Method dataWriteNowMethod;
    public static Method getDeviceIDMethod;
    public static Method getInstrumentStatusMethod;
    private static int sHasJacocoUtilsInited;
    private static boolean sUploadCoverageDataTaskInited;
    private static Method setAppVersionMethod;
    public static Method setDeviceIDMethod;

    private static Object com_ss_android_ugc_aweme_utils_JacocoUtils_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_utils_JacocoUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        if (((Boolean) a2.first).booleanValue()) {
            return a2.second;
        }
        Object invoke = method.invoke(obj, objArr);
        a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_utils_JacocoUtils_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
        return invoke;
    }

    static {
        Covode.recordClassIndex(93246);
    }

    public static void uploadCoverageFileNow() {
        if (sHasJacocoUtilsInited == 0) {
            jacocoInit();
        }
        uploadCoverageDataCore(true);
    }

    private static boolean isLocalTest() {
        String str = d.s;
        if (TextUtils.equals(str, "local_test") || TextUtils.equals(str, "daily_monkey_test") || TextUtils.equals(str, "monkey")) {
            return true;
        }
        return false;
    }

    public static void uploadCoverageFileTask() {
        if (sHasJacocoUtilsInited == 0) {
            jacocoInit();
        }
        if (!sUploadCoverageDataTaskInited) {
            sUploadCoverageDataTaskInited = true;
            uploadCoverageDataCore(false);
        }
    }

    private static String getLogFilePath() {
        Context a2 = d.a();
        File b2 = e.b(a2);
        if (!e.e()) {
            b2 = com_ss_android_ugc_aweme_utils_JacocoUtils_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(a2);
        }
        if (b2 == null) {
            return null;
        }
        File file = new File(b2, "jacoco");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file.getAbsolutePath();
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0047 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:41:? A[ADDED_TO_REGION, ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void writeCoverageData() {
        /*
        // Method dump skipped, instructions count: 124
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.utils.JacocoUtils.writeCoverageData():void");
    }

    private static void jacocoInit() {
        if (!isLocalTest()) {
            sHasJacocoUtilsInited = 2;
        }
        if (sHasJacocoUtilsInited == 0) {
            d.a();
            try {
                Class<?> cls = Class.forName("com.bytedance.test.codecoverage.CodeCoverageMonitor");
                coverageMonitor = cls.getConstructor(String.class, Boolean.TYPE, Context.class, Boolean.TYPE).newInstance(getLogFilePath(), Boolean.valueOf(ReleaseMode), d.a(), false);
                Method declaredMethod = cls.getDeclaredMethod("setAppVersion", String.class);
                setAppVersionMethod = declaredMethod;
                declaredMethod.setAccessible(true);
                setAppVersionMethod.invoke(coverageMonitor, String.valueOf(d.e()));
                Method declaredMethod2 = cls.getDeclaredMethod("setDeviceID", String.class);
                setDeviceIDMethod = declaredMethod2;
                declaredMethod2.setAccessible(true);
                setDeviceIDMethod.invoke(coverageMonitor, String.valueOf(AppLog.getServerDeviceId()));
                Method declaredMethod3 = cls.getDeclaredMethod("getInstrumentStatus", new Class[0]);
                getInstrumentStatusMethod = declaredMethod3;
                declaredMethod3.setAccessible(true);
                Method declaredMethod4 = cls.getDeclaredMethod("getDeviceID", new Class[0]);
                getDeviceIDMethod = declaredMethod4;
                declaredMethod4.setAccessible(true);
                Method declaredMethod5 = cls.getDeclaredMethod("dataWriteNow", new Class[0]);
                dataWriteNowMethod = declaredMethod5;
                declaredMethod5.setAccessible(true);
                Method declaredMethod6 = cls.getDeclaredMethod("dataUpload", new Class[0]);
                dataUploadMethod = declaredMethod6;
                declaredMethod6.setAccessible(true);
                sHasJacocoUtilsInited = 1;
            } catch (ClassNotFoundException e2) {
                e2.printStackTrace();
            } catch (InstantiationException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            } catch (NoSuchMethodException e5) {
                e5.printStackTrace();
            } catch (IllegalAccessException e6) {
                e6.printStackTrace();
            }
        }
    }

    public static File com_ss_android_ugc_aweme_utils_JacocoUtils_com_ss_android_ugc_aweme_lancet_ContextLancet_getCacheDir(Context context) {
        if (com.ss.android.ugc.aweme.lancet.d.f107194b != null && com.ss.android.ugc.aweme.lancet.d.f107197e) {
            return com.ss.android.ugc.aweme.lancet.d.f107194b;
        }
        File cacheDir = context.getCacheDir();
        com.ss.android.ugc.aweme.lancet.d.f107194b = cacheDir;
        return cacheDir;
    }

    private static void uploadCoverageDataCore(final boolean z) {
        if (coverageMonitor != null && isLocalTest()) {
            try {
                if (sHasJacocoUtilsInited == 1) {
                    Method method = getInstrumentStatusMethod;
                    if (method != null && !((Boolean) com_ss_android_ugc_aweme_utils_JacocoUtils_java_lang_reflect_Method_invoke(method, coverageMonitor, new Object[0])).booleanValue()) {
                        return;
                    }
                    new com.bytedance.common.utility.b.e() {
                        /* class com.ss.android.ugc.aweme.utils.JacocoUtils.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(93247);
                        }

                        private static Object a(Method method, Object obj, Object[] objArr) {
                            Pair<Boolean, Object> a2 = a.a(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_ss_android_ugc_aweme_utils_JacocoUtils$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                            if (((Boolean) a2.first).booleanValue()) {
                                return a2.second;
                            }
                            Object invoke = method.invoke(obj, objArr);
                            a.a(invoke, method, new Object[]{obj, objArr}, "com_ss_android_ugc_aweme_utils_JacocoUtils$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                            return invoke;
                        }

                        @Override // com.bytedance.common.utility.b.e
                        public final void run() {
                            MethodCollector.i(2025);
                            try {
                                if (!z) {
                                    while (true) {
                                        if (!(JacocoUtils.getDeviceIDMethod == null || !TextUtils.isEmpty((String) a(JacocoUtils.getDeviceIDMethod, JacocoUtils.coverageMonitor, new Object[0])) || JacocoUtils.setDeviceIDMethod == null)) {
                                            a(JacocoUtils.setDeviceIDMethod, JacocoUtils.coverageMonitor, new Object[]{AppLog.getServerDeviceId()});
                                        }
                                        if (JacocoUtils.dataWriteNowMethod != null) {
                                            a(JacocoUtils.dataWriteNowMethod, JacocoUtils.coverageMonitor, new Object[0]);
                                        }
                                        if (JacocoUtils.dataUploadMethod != null) {
                                            a(JacocoUtils.dataUploadMethod, JacocoUtils.coverageMonitor, new Object[0]);
                                        }
                                        if (JacocoUtils.getInstrumentStatusMethod != null && !((Boolean) a(JacocoUtils.getInstrumentStatusMethod, JacocoUtils.coverageMonitor, new Object[0])).booleanValue()) {
                                            break;
                                        }
                                        try {
                                            Thread.sleep((long) (JacocoUtils.TimeInterval * 1000));
                                        } catch (InterruptedException e2) {
                                            e2.printStackTrace();
                                        }
                                    }
                                } else {
                                    if (!(JacocoUtils.getDeviceIDMethod == null || !TextUtils.isEmpty((String) a(JacocoUtils.getDeviceIDMethod, JacocoUtils.coverageMonitor, new Object[0])) || JacocoUtils.setDeviceIDMethod == null)) {
                                        a(JacocoUtils.setDeviceIDMethod, JacocoUtils.coverageMonitor, new Object[]{AppLog.getServerDeviceId()});
                                    }
                                    if (JacocoUtils.dataWriteNowMethod != null) {
                                        a(JacocoUtils.dataWriteNowMethod, JacocoUtils.coverageMonitor, new Object[0]);
                                    }
                                    if (JacocoUtils.dataUploadMethod != null) {
                                        a(JacocoUtils.dataUploadMethod, JacocoUtils.coverageMonitor, new Object[0]);
                                        MethodCollector.o(2025);
                                        return;
                                    }
                                }
                                MethodCollector.o(2025);
                            } catch (Throwable unused) {
                                MethodCollector.o(2025);
                            }
                        }
                    }.a();
                }
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
            }
        }
    }
}
