package com.lynx.jsbridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.core.JSProxy;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final String f55509a;

    /* renamed from: b  reason: collision with root package name */
    private final JSProxy f55510b;

    static {
        Covode.recordClassIndex(34757);
    }

    public b(String str, JSProxy jSProxy) {
        this.f55509a = str;
        this.f55510b = jSProxy;
    }

    public final void a(String str, JavaOnlyArray javaOnlyArray) {
        MethodCollector.i(13069);
        JSProxy jSProxy = this.f55510b;
        String str2 = this.f55509a;
        jSProxy.f56541d.readLock().lock();
        if (jSProxy.f56538a != 0) {
            jSProxy.nativeCallJSFunction(jSProxy.f56538a, str2, str, javaOnlyArray);
        }
        jSProxy.f56541d.readLock().unlock();
        MethodCollector.o(13069);
    }
}
