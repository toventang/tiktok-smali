package com.ss.optimizer.live.sdk.dns;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public final class m implements Callable<List<String>> {

    /* renamed from: a  reason: collision with root package name */
    private final List<String> f151765a;

    /* renamed from: b  reason: collision with root package name */
    private final List<String> f151766b;

    static {
        Covode.recordClassIndex(101220);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<String> call() {
        MethodCollector.i(5552);
        ArrayList arrayList = new ArrayList();
        NativeConnect nativeConnect = new NativeConnect();
        for (String str : this.f151765a) {
            if (this.f151766b.isEmpty() || !this.f151766b.contains(str)) {
                int connect = nativeConnect.connect(str, "8080");
                if (connect == -1) {
                    if (g.f151742a) {
                        g.a();
                    }
                } else if (connect == 0) {
                    arrayList.add(str);
                    if (g.f151742a) {
                        g.a();
                    }
                }
            }
        }
        MethodCollector.o(5552);
        return arrayList;
    }

    m(List<String> list, List<String> list2) {
        this.f151765a = list;
        this.f151766b = list2;
    }
}
