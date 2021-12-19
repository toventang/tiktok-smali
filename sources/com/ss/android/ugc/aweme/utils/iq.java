package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.keva.Keva;
import com.ss.android.ttve.nativePort.d;
import java.lang.reflect.Method;

public final class iq {

    /* renamed from: a  reason: collision with root package name */
    static String[] f143107a;

    /* renamed from: b  reason: collision with root package name */
    public static final iq f143108b = new iq();

    /* renamed from: c  reason: collision with root package name */
    private static final Keva f143109c = Keva.getRepo("repo_ve_hook");

    private iq() {
    }

    public static void b() {
        d.f61346d = a.f143110a;
    }

    static {
        Covode.recordClassIndex(93678);
    }

    public static boolean a() {
        return f143109c.getBoolean("key_ve_hook_switch", false);
    }

    public static void c() {
        Method declaredMethod;
        String[] strArr = f143107a;
        if (strArr != null) {
            try {
                Class<?> cls = Class.forName("com.ss.android.VEHook");
                if (cls != null && (declaredMethod = cls.getDeclaredMethod("hook", String[].class, Integer.TYPE)) != null) {
                    declaredMethod.invoke(cls, strArr, 0);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a implements d.c {

        /* renamed from: a  reason: collision with root package name */
        public static final a f143110a = new a();

        static {
            Covode.recordClassIndex(93679);
        }

        a() {
        }

        @Override // com.ss.android.ttve.nativePort.d.c
        public final void a(String[] strArr) {
            iq.f143107a = strArr;
            if (iq.a()) {
                iq.c();
            }
        }
    }

    public static void a(boolean z) {
        b(z);
        if (z) {
            c();
        }
    }

    private static void b(boolean z) {
        f143109c.storeBoolean("key_ve_hook_switch", z);
    }
}
