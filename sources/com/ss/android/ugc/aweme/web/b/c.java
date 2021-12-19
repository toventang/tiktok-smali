package com.ss.android.ugc.aweme.web.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.dmt.ui.widget.util.b;
import java.util.Map;

public final class c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile c f144887c;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, String> f144888a;

    /* renamed from: b  reason: collision with root package name */
    public Context f144889b;

    static {
        Covode.recordClassIndex(94737);
    }

    private c() {
    }

    public static c a() {
        MethodCollector.i(11506);
        if (f144887c == null) {
            synchronized (b.class) {
                try {
                    if (f144887c == null) {
                        f144887c = new c();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(11506);
                    throw th;
                }
            }
        }
        c cVar = f144887c;
        MethodCollector.o(11506);
        return cVar;
    }
}
