package com.bytedance.bdlocation.traceroute.a;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.bf.d;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static a f26355b;

    /* renamed from: a  reason: collision with root package name */
    public SharedPreferences f26356a;

    static {
        Covode.recordClassIndex(15490);
    }

    private a(Context context) {
        this.f26356a = d.a(context, "TraceRouterCache", 0);
    }

    public static a a(Context context) {
        MethodCollector.i(2011);
        if (f26355b == null) {
            synchronized (a.class) {
                try {
                    if (f26355b == null) {
                        f26355b = new a(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2011);
                    throw th;
                }
            }
        }
        a aVar = f26355b;
        MethodCollector.o(2011);
        return aVar;
    }
}
