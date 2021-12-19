package com.ss.android.ugc.aweme.sp;

import android.app.Instrumentation;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.d;
import com.ss.android.ugc.aweme.logger.a;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SharedPreferencesManager {
    private Constructor constructor;
    private boolean hasObtained;
    private HashMap lockMap;
    private Map<String, File> mOrignalSharedPrefsPaths;
    private File mPreferencesDir;
    private Map<String, File> mSharedPrefsPaths;
    private Map<File, SharedPreferences> sSharedPrefsCache;
    private Class<?> sharedPreferencesImplClass;

    /* renamed from: com.ss.android.ugc.aweme.sp.SharedPreferencesManager$1  reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static {
            Covode.recordClassIndex(87656);
        }
    }

    static {
        Covode.recordClassIndex(87655);
    }

    public static int com_ss_android_ugc_aweme_sp_SharedPreferencesManager_com_ss_android_ugc_aweme_lancet_LogLancet_e(String str, String str2) {
        return 0;
    }

    public static SharedPreferencesManager getInstance() {
        return a.f133972a;
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static SharedPreferencesManager f133972a = new SharedPreferencesManager(null);

        static {
            Covode.recordClassIndex(87657);
        }
    }

    private SharedPreferencesManager() {
        this.sSharedPrefsCache = Collections.synchronizedMap(new HashMap());
        this.mSharedPrefsPaths = Collections.synchronizedMap(new HashMap());
        this.lockMap = new HashMap();
    }

    public static void hookInstrumentation() {
        Field declaredField;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (declaredField = invoke.getClass().getDeclaredField("mInstrumentation")) != null) {
                    declaredField.setAccessible(true);
                    Instrumentation instrumentation = (Instrumentation) declaredField.get(invoke);
                    if (instrumentation != null && !(instrumentation instanceof i)) {
                        declaredField.set(invoke, new i(instrumentation));
                    }
                }
            }
        } catch (Exception unused) {
            com_ss_android_ugc_aweme_sp_SharedPreferencesManager_com_ss_android_ugc_aweme_lancet_LogLancet_e("SharedPreferencesManage", "Hook Method Instrumentation Failed!!!");
        }
    }

    /* synthetic */ SharedPreferencesManager(AnonymousClass1 r1) {
        this();
    }

    private File getDataDirAbove24(Context context) {
        return context.getDataDir();
    }

    private static File ensurePrivateDirExists(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    public static File com_ss_android_ugc_aweme_sp_SharedPreferencesManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(Context context) {
        if (d.f107195c != null && d.f107197e) {
            return d.f107195c;
        }
        File filesDir = context.getFilesDir();
        d.f107195c = filesDir;
        return filesDir;
    }

    private File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return getDataDirAbove24(context);
        }
        return com_ss_android_ugc_aweme_sp_SharedPreferencesManager_com_ss_android_ugc_aweme_lancet_ContextLancet_getFilesDir(context).getParentFile();
    }

    private File getPreferencesDir(Context context) {
        if (this.mPreferencesDir == null) {
            this.mPreferencesDir = new File(getDataDir(context), "shared_prefs");
        }
        return ensurePrivateDirExists(this.mPreferencesDir);
    }

    private File getSharedPreferencesPath(Context context, String str) {
        return makeFilename(getPreferencesDir(context), str + ".xml");
    }

    private File makeFilename(File file, String str) {
        if (str.indexOf(File.separatorChar) < 0) {
            return new File(file, str);
        }
        throw new IllegalArgumentException("File " + str + " contains a path separator");
    }

    public SharedPreferences getSharedPreferences(Context context, String str) {
        MethodCollector.i(9617);
        if (context == null || TextUtils.isEmpty(str)) {
            MethodCollector.o(9617);
            return null;
        }
        File file = this.mSharedPrefsPaths.get(str);
        long j2 = 0;
        if (file == null) {
            j2 = SystemClock.uptimeMillis();
            Object obj = this.lockMap.get(str);
            if (obj == null) {
                synchronized (this.lockMap) {
                    try {
                        obj = this.lockMap.get(str);
                        if (obj == null) {
                            obj = new Object();
                            this.lockMap.put(str, obj);
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(9617);
                        throw th;
                    }
                }
            }
            synchronized (obj) {
                try {
                    file = this.mSharedPrefsPaths.get(str);
                    if (file == null) {
                        file = getSharedPreferencesPath(context, str);
                        if (!this.hasObtained && this.mOrignalSharedPrefsPaths == null) {
                            Context a2 = e.a(context);
                            if (a2 == null) {
                                a2 = (Context) com.bytedance.common.utility.reflect.a.a(context, "mBase");
                            }
                            if (a2 != null) {
                                Map<String, File> b2 = e.b(a2);
                                if (b2 == null) {
                                    b2 = (Map) com.bytedance.common.utility.reflect.a.a(a2, "mSharedPrefsPaths");
                                }
                                this.mOrignalSharedPrefsPaths = b2;
                            }
                            this.hasObtained = true;
                        }
                        Map<String, File> map = this.mOrignalSharedPrefsPaths;
                        if (map != null && map.containsValue(file)) {
                            return null;
                        }
                        this.mSharedPrefsPaths.put(str, file);
                    }
                } finally {
                    MethodCollector.o(9617);
                }
            }
        }
        SharedPreferences sharedPreferences = getSharedPreferences(str, file, j2);
        MethodCollector.o(9617);
        return sharedPreferences;
    }

    public SharedPreferences getSharedPreferences(String str, File file, long j2) {
        MethodCollector.i(9791);
        SharedPreferences sharedPreferences = this.sSharedPrefsCache.get(file);
        if (sharedPreferences == null) {
            if (j2 == 0) {
                j2 = SystemClock.uptimeMillis();
            }
            synchronized (file) {
                try {
                    sharedPreferences = this.sSharedPrefsCache.get(file);
                    if (sharedPreferences == null) {
                        sharedPreferences = new g(str, file);
                        this.sSharedPrefsCache.put(file, sharedPreferences);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(9791);
                    throw th;
                }
            }
        }
        com.ss.android.ugc.aweme.logger.a aVar = a.b.f109011a;
        if (j2 > 0 && Looper.getMainLooper() == Looper.myLooper()) {
            aVar.f109009j.put(str, Long.valueOf(SystemClock.uptimeMillis() - j2));
        }
        MethodCollector.o(9791);
        return sharedPreferences;
    }
}
