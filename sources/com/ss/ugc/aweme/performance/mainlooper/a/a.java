package com.ss.ugc.aweme.performance.mainlooper.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.LinkedList;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f153384a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static LinkedList<com.ss.ugc.aweme.performance.mainlooper.monitor.a.a> f153385b = new LinkedList<>();

    /* renamed from: c  reason: collision with root package name */
    private static final int f153386c = 4;

    private a() {
    }

    static {
        Covode.recordClassIndex(101826);
    }

    public final synchronized com.ss.ugc.aweme.performance.mainlooper.monitor.a.a a() {
        com.ss.ugc.aweme.performance.mainlooper.monitor.a.a pollFirst;
        MethodCollector.i(13326);
        pollFirst = f153385b.pollFirst();
        if (pollFirst == null) {
            pollFirst = new com.ss.ugc.aweme.performance.mainlooper.monitor.a.a();
        }
        MethodCollector.o(13326);
        return pollFirst;
    }

    public final synchronized void a(com.ss.ugc.aweme.performance.mainlooper.monitor.a.a aVar) {
        MethodCollector.i(13400);
        l.c(aVar, "");
        if (f153385b.size() <= f153386c) {
            aVar.f153388b = "";
            f153385b.addLast(aVar);
        }
        MethodCollector.o(13400);
    }
}
