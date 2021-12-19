package com.ss.android.ugc.aweme.net.h.b;

import android.content.Context;
import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.experiment.cu;
import com.ss.android.ugc.aweme.logger.a;
import okhttp3.Request;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final String f112355a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f112356b;

    static {
        Covode.recordClassIndex(72198);
    }

    public c(String str, Context context) {
        this.f112355a = str;
        this.f112356b = context;
    }

    public final void run() {
        MethodCollector.i(7112);
        String str = this.f112355a;
        Context context = this.f112356b;
        System.currentTimeMillis();
        if (cu.a()) {
            a.b.f109011a.a("feed_boot_to_ok_pre_connection", System.currentTimeMillis() - a.b.f109011a.f109007h);
            a.b.f109011a.a("feed_ok_pre_connection_duration", false);
            com.bytedance.apm.c.a(context);
            try {
                b.a(context).newCall(new Request.Builder().url(str).build()).execute();
            } catch (Throwable th) {
                Log.getStackTraceString(th);
            }
            synchronized (com.ss.android.ugc.aweme.net.h.a.f112352c) {
                try {
                    com.ss.android.ugc.aweme.net.h.a.f112350a = true;
                    com.ss.android.ugc.aweme.net.h.a.f112352c.notifyAll();
                } catch (Throwable th2) {
                    MethodCollector.o(7112);
                    throw th2;
                }
            }
            a.b.f109011a.b("feed_ok_pre_connection_duration", false);
        }
        System.currentTimeMillis();
        MethodCollector.o(7112);
    }
}
