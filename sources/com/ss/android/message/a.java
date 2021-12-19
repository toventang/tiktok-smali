package com.ss.android.message;

import android.app.Application;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Application f59817a;

    /* renamed from: b  reason: collision with root package name */
    private static final AtomicBoolean f59818b = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(36973);
    }

    public static int a() {
        return f59817a.getApplicationInfo().targetSdkVersion;
    }

    public static void a(Application application) {
        if (!f59818b.getAndSet(true)) {
            f59817a = application;
            if (com.ss.android.message.a.a.a(application)) {
                f59817a.registerActivityLifecycleCallbacks(com.bytedance.common.b.a.a());
            }
        }
    }
}
