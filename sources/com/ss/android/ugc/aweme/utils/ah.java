package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

public class ah {

    /* renamed from: b  reason: collision with root package name */
    private static ah f142629b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f142630a;

    static {
        Covode.recordClassIndex(93302);
    }

    public static ah a() {
        MethodCollector.i(2289);
        if (f142629b == null) {
            synchronized (ah.class) {
                try {
                    if (f142629b == null) {
                        f142629b = new ah();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2289);
                    throw th;
                }
            }
        }
        ah ahVar = f142629b;
        MethodCollector.o(2289);
        return ahVar;
    }
}
