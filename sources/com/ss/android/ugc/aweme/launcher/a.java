package com.ss.android.ugc.aweme.launcher;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public final class a extends Instrumentation {

    /* renamed from: a  reason: collision with root package name */
    private final Instrumentation f107288a;

    /* renamed from: b  reason: collision with root package name */
    private final AbstractC2756a f107289b;

    /* renamed from: com.ss.android.ugc.aweme.launcher.a$a  reason: collision with other inner class name */
    public interface AbstractC2756a {
        static {
            Covode.recordClassIndex(68642);
        }

        String a(String str, Intent intent);
    }

    static {
        Covode.recordClassIndex(68641);
    }

    public static void a(AbstractC2756a aVar) {
        Field declaredField;
        try {
            Method declaredMethod = Class.forName("android.app.ActivityThread").getDeclaredMethod("currentActivityThread", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(null, new Object[0]);
                if (invoke != null && (declaredField = invoke.getClass().getDeclaredField("mInstrumentation")) != null) {
                    declaredField.setAccessible(true);
                    Instrumentation instrumentation = (Instrumentation) declaredField.get(invoke);
                    if (instrumentation != null) {
                        declaredField.set(invoke, new a(instrumentation, aVar));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private a(Instrumentation instrumentation, AbstractC2756a aVar) {
        this.f107288a = instrumentation;
        this.f107289b = aVar;
    }

    @Override // android.app.Instrumentation
    public final Activity newActivity(ClassLoader classLoader, String str, Intent intent) {
        AbstractC2756a aVar;
        if (!(TextUtils.isEmpty(str) || intent == null || (aVar = this.f107289b) == null)) {
            str = aVar.a(str, intent);
        }
        return this.f107288a.newActivity(classLoader, str, intent);
    }
}
