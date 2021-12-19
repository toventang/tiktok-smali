package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.c.c;

public final class ap {

    /* renamed from: a  reason: collision with root package name */
    public static String f50350a;

    /* renamed from: b  reason: collision with root package name */
    public static int f50351b;

    /* renamed from: c  reason: collision with root package name */
    private static Object f50352c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static boolean f50353d;

    static {
        Covode.recordClassIndex(31380);
    }

    public static void a(Context context) {
        MethodCollector.i(9995);
        synchronized (f50352c) {
            try {
                if (!f50353d) {
                    f50353d = true;
                    try {
                        Bundle bundle = c.f50295a.a(context).a(context.getPackageName(), 128).metaData;
                        if (bundle == null) {
                            MethodCollector.o(9995);
                            return;
                        }
                        f50350a = bundle.getString("com.google.app.id");
                        f50351b = bundle.getInt("com.google.android.gms.version");
                        MethodCollector.o(9995);
                    } catch (PackageManager.NameNotFoundException e2) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e2);
                    }
                }
            } finally {
                MethodCollector.o(9995);
            }
        }
    }
}
