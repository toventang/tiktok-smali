package com.google.android.gms.common.stats;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.common.util.d;
import java.util.Collections;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f50471a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f50472b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f50473c = false;

    /* renamed from: d  reason: collision with root package name */
    private final List<String> f50474d = Collections.EMPTY_LIST;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f50475e = Collections.EMPTY_LIST;

    /* renamed from: f  reason: collision with root package name */
    private final List<String> f50476f = Collections.EMPTY_LIST;

    /* renamed from: g  reason: collision with root package name */
    private final List<String> f50477g = Collections.EMPTY_LIST;

    static {
        Covode.recordClassIndex(31451);
    }

    private a() {
    }

    public static a a() {
        MethodCollector.i(10152);
        if (f50472b == null) {
            synchronized (f50471a) {
                try {
                    if (f50472b == null) {
                        f50472b = new a();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10152);
                    throw th;
                }
            }
        }
        a aVar = f50472b;
        MethodCollector.o(10152);
        return aVar;
    }

    public static boolean b(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        context.getClass().getName();
        return a(context, intent, serviceConnection, i2);
    }

    public static boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        ComponentName component = intent.getComponent();
        if (component != null && d.a(context, component.getPackageName())) {
            return false;
        }
        return c(context, intent, serviceConnection, i2);
    }

    private static boolean c(Context context, Intent intent, ServiceConnection serviceConnection, int i2) {
        if (context == null || !(context instanceof Context)) {
            return context.bindService(intent, serviceConnection, i2);
        }
        if (com.ss.android.ugc.aweme.push.downgrade.d.a(context, intent)) {
            return true;
        }
        return context.bindService(intent, serviceConnection, i2);
    }
}
