package com.google.android.play.core.common;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.HashMap;
import java.util.Map;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, Object> f53187a = new HashMap();

    static {
        Covode.recordClassIndex(32872);
    }

    public final synchronized void a(Bundle bundle) {
        MethodCollector.i(7399);
        for (String str : bundle.keySet()) {
            Object a2 = a(bundle, str);
            if (a2 != null && this.f53187a.get(str) == null) {
                this.f53187a.put(str, a2);
            }
        }
        MethodCollector.o(7399);
    }

    private static Object a(Bundle bundle, String str) {
        try {
            return bundle.get(str);
        } catch (Exception | OutOfMemoryError unused) {
            return null;
        }
    }
}
