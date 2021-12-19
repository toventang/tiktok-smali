package com.ss.android.a.b;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f58161a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static com.ss.android.a.e.a f58162b;

    private a() {
    }

    static {
        Covode.recordClassIndex(36154);
    }

    public static com.ss.android.a.e.a a() {
        com.ss.android.a.e.a aVar = f58162b;
        if (aVar != null) {
            return aVar;
        }
        try {
            Method declaredMethod = Class.forName("com.ss.android.anywheredoor.core.AnyDoorServiceImpl").getDeclaredMethod("inst", new Class[0]);
            declaredMethod.setAccessible(true);
            f58162b = (com.ss.android.a.e.a) declaredMethod.invoke(null, new Object[0]);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return f58162b;
    }
}
