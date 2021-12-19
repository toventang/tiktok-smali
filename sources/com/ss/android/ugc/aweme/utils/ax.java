package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.lego.f.a;

public final class ax {

    /* renamed from: a  reason: collision with root package name */
    private static volatile boolean f142652a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f142653b;

    /* renamed from: c  reason: collision with root package name */
    private static Object f142654c = new Object();

    static {
        Covode.recordClassIndex(93319);
    }

    public static boolean a(Context context) {
        b(context);
        return f142652a;
    }

    public static void b(Context context) {
        boolean z;
        MethodCollector.i(9525);
        if (f142653b || context == null) {
            MethodCollector.o(9525);
            return;
        }
        synchronized (f142654c) {
            try {
                if (!f142653b) {
                    Keva repo = Keva.getRepo("keva_new_user_repo_".concat(String.valueOf(a.b(context))));
                    if (!repo.getBoolean("is_new_user", true) || !com.ss.android.ugc.aweme.logger.a.b()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    f142652a = z;
                    f142653b = true;
                    repo.storeBoolean("is_new_user", false);
                }
            } finally {
                MethodCollector.o(9525);
            }
        }
    }
}
