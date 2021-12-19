package com.ss.android.ugc.aweme.s;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static SharedPreferences f120772a;

    static {
        Covode.recordClassIndex(78691);
    }

    public static SharedPreferences a(Context context) {
        MethodCollector.i(7219);
        if (f120772a == null) {
            f120772a = context.getSharedPreferences("cold_boot_sp", 0);
        }
        SharedPreferences sharedPreferences = f120772a;
        MethodCollector.o(7219);
        return sharedPreferences;
    }

    public static boolean a(Context context, String str) {
        return a(context).getBoolean(str, true);
    }

    public static void a(Context context, String str, boolean z) {
        a(context).edit().putBoolean(str, z).apply();
    }
}
