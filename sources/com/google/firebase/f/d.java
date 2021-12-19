package com.google.firebase.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class d {

    /* renamed from: b  reason: collision with root package name */
    private static volatile d f54372b;

    /* renamed from: a  reason: collision with root package name */
    private final Set<f> f54373a = new HashSet();

    static {
        Covode.recordClassIndex(33753);
    }

    d() {
    }

    /* access modifiers changed from: package-private */
    public final Set<f> a() {
        Set<f> unmodifiableSet;
        MethodCollector.i(4462);
        synchronized (this.f54373a) {
            try {
                unmodifiableSet = Collections.unmodifiableSet(this.f54373a);
            } finally {
                MethodCollector.o(4462);
            }
        }
        return unmodifiableSet;
    }

    public static d b() {
        MethodCollector.i(4513);
        d dVar = f54372b;
        if (dVar == null) {
            synchronized (d.class) {
                try {
                    dVar = f54372b;
                    if (dVar == null) {
                        dVar = new d();
                        f54372b = dVar;
                    }
                } finally {
                    MethodCollector.o(4513);
                }
            }
        }
        return dVar;
    }
}
