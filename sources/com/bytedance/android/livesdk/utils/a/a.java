package com.bytedance.android.livesdk.utils.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.ThreadPoolOptExperiment;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveNtpServerUrlSetting;
import com.bytedance.android.livesdk.utils.an;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import f.a.aa;
import f.a.b.b;
import f.a.t;
import java.util.concurrent.TimeUnit;

public class a {

    /* renamed from: a  reason: collision with root package name */
    static volatile a f22205a;

    /* renamed from: b  reason: collision with root package name */
    e f22206b;

    /* renamed from: c  reason: collision with root package name */
    private b f22207c;

    static {
        Covode.recordClassIndex(13111);
    }

    public static long a() {
        if (f22205a == null || f22205a.f22206b == null || !f22205a.f22206b.f22213a) {
            return System.currentTimeMillis() + an.f22242a;
        }
        return f22205a.f22206b.b();
    }

    private a(Context context) {
        aa a2;
        String value = LiveNtpServerUrlSetting.INSTANCE.getValue();
        if (!TextUtils.isEmpty(value)) {
            this.f22206b = e.a(context, value);
            t<Long> b2 = com.bytedance.android.livesdk.utils.b.b.b(60, TimeUnit.MINUTES).b(2147483647L);
            if (ThreadPoolOptExperiment.INSTANCE.isEnableAll()) {
                a2 = f.a.h.a.b(f.a.k.a.f158006c);
            } else {
                a2 = f.a.h.a.a(f.a.k.a.f158005b);
            }
            this.f22207c = b2.b(a2).d(b.f22208a).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(c.f22209a, d.f22210a);
        }
    }

    public static void a(Context context) {
        MethodCollector.i(10973);
        if (f22205a == null) {
            synchronized (a.class) {
                try {
                    if (f22205a == null) {
                        f22205a = new a(context);
                    }
                } finally {
                    MethodCollector.o(10973);
                }
            }
            return;
        }
        MethodCollector.o(10973);
    }
}
