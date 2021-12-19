package com.bytedance.common.wschannel;

import android.content.Context;
import com.bytedance.common.wschannel.WsChannelMultiProcessSharedProvider;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.lancet.a.a;

public class l {

    /* renamed from: b  reason: collision with root package name */
    private static volatile l f27242b;

    /* renamed from: a  reason: collision with root package name */
    public final WsChannelMultiProcessSharedProvider.b f27243a;

    static {
        Covode.recordClassIndex(16055);
    }

    public final boolean a() {
        return this.f27243a.a("frontier_enabled", true);
    }

    public final boolean b() {
        return this.f27243a.a("enableAppStateChangeReport", false);
    }

    private l(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (a.f107168c && applicationContext == null) {
            applicationContext = a.f107166a;
        }
        this.f27243a = WsChannelMultiProcessSharedProvider.a(applicationContext);
    }

    public static l a(Context context) {
        MethodCollector.i(6604);
        if (f27242b == null) {
            synchronized (l.class) {
                try {
                    if (f27242b == null) {
                        f27242b = new l(context);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(6604);
                    throw th;
                }
            }
        }
        l lVar = f27242b;
        MethodCollector.o(6604);
        return lVar;
    }
}
