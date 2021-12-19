package com.bytedance.common.a;

import android.content.Context;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.lancet.d;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Context f26688a;

    /* renamed from: b  reason: collision with root package name */
    static String f26689b;

    /* renamed from: c  reason: collision with root package name */
    static String f26690c;

    /* renamed from: d  reason: collision with root package name */
    static String f26691d;

    /* renamed from: e  reason: collision with root package name */
    static WeakReference<List<String>> f26692e;

    static {
        Covode.recordClassIndex(15746);
    }

    public static Context a() {
        Context context = f26688a;
        if (context != null) {
            return context;
        }
        throw new RuntimeException("Please make sure Deximage.init(...) first");
    }

    public static String b() {
        if (f26689b == null) {
            f26689b = a().getPackageName();
        }
        return f26689b;
    }

    private static String g() {
        if (f26691d == null) {
            f26691d = a().getPackageCodePath();
        }
        return f26691d;
    }

    public static File c() {
        File file;
        if (Build.VERSION.SDK_INT >= 21) {
            file = a().getCodeCacheDir();
        } else {
            Context a2 = a();
            if (d.f107194b == null || !d.f107197e) {
                d.f107194b = a2.getCacheDir();
            }
            file = d.f107194b;
        }
        File file2 = new File(file, "app_profiles");
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }

    public static String d() {
        return new File(g()).getParentFile().getAbsolutePath() + "/oat/" + f() + "/base.art";
    }

    public static List<String> e() {
        WeakReference<List<String>> weakReference = f26692e;
        if (weakReference == null) {
            List<String> a2 = b.a(g());
            f26692e = new WeakReference<>(a2);
            return a2;
        }
        List<String> list = weakReference.get();
        if (list != null) {
            return list;
        }
        List<String> a3 = b.a(g());
        f26692e = new WeakReference<>(a3);
        return a3;
    }

    private static String f() {
        if (f26690c == null) {
            try {
                Method declaredMethod = Class.forName("dalvik.system.VMRuntime").getDeclaredMethod("getCurrentInstructionSet", new Class[0]);
                declaredMethod.setAccessible(true);
                f26690c = (String) declaredMethod.invoke(null, new Object[0]);
            } catch (Exception e2) {
                e2.printStackTrace();
                return "";
            }
        }
        return f26690c;
    }
}
