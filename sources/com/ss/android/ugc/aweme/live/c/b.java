package com.ss.android.ugc.aweme.live.c;

import android.content.Context;
import com.bytedance.android.livesdk.utils.h;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.live.ab;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f108347a;

    static {
        Covode.recordClassIndex(69415);
    }

    private b() {
    }

    public static b a() {
        MethodCollector.i(10313);
        if (f108347a == null) {
            synchronized (b.class) {
                try {
                    if (f108347a == null) {
                        f108347a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(10313);
                    throw th;
                }
            }
        }
        b bVar = f108347a;
        MethodCollector.o(10313);
        return bVar;
    }

    @Override // com.ss.android.ugc.aweme.live.c.a
    public final String a(String str) {
        return h.a(str);
    }

    @Override // com.ss.android.ugc.aweme.live.c.a
    public final String a(Context context, String str) {
        return ab.a(context, str);
    }
}
