package com.bytedance.globalpayment.a.a.a.b;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f30144b;

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f30145a;

    static {
        Covode.recordClassIndex(17519);
    }

    private a(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (com.ss.android.ugc.aweme.lancet.a.a.f107168c && applicationContext == null) {
            applicationContext = com.ss.android.ugc.aweme.lancet.a.a.f107166a;
        }
        this.f30145a = d.a(applicationContext, "e_commerce_sp", 0);
    }

    public static a a(Context context) {
        MethodCollector.i(12060);
        if (f30144b == null) {
            synchronized (a.class) {
                try {
                    if (f30144b == null) {
                        f30144b = new a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(12060);
                    throw th;
                }
            }
        }
        a aVar = f30144b;
        MethodCollector.o(12060);
        return aVar;
    }
}
