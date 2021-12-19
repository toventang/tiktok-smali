package com.ss.android.ugc.aweme.lancet.a;

import android.app.Application;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.s.c;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static Application f107166a;

    /* renamed from: b  reason: collision with root package name */
    public static Context f107167b;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f107168c;

    static {
        Covode.recordClassIndex(68557);
    }

    public static void a(Application application, Context context) {
        f107166a = application;
        f107167b = context;
        f107168c = c.a(context, "optimize_cold_boot_hook_app_context");
    }
}
