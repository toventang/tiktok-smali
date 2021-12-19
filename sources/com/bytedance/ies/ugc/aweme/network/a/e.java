package com.bytedance.ies.ugc.aweme.network.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f34999a;

    static {
        Covode.recordClassIndex(21001);
    }

    public e() {
        this.f34999a = new ArrayList();
    }

    public final e b() {
        return new e(a());
    }

    public final synchronized List<a> a() {
        List<a> unmodifiableList;
        MethodCollector.i(4097);
        unmodifiableList = Collections.unmodifiableList(this.f34999a);
        MethodCollector.o(4097);
        return unmodifiableList;
    }

    private e(List<a> list) {
        this.f34999a = list;
    }

    public final synchronized void a(a aVar) {
        MethodCollector.i(4095);
        this.f34999a.add(aVar);
        MethodCollector.o(4095);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public int f35000a;

        /* renamed from: b  reason: collision with root package name */
        public int f35001b;

        /* renamed from: c  reason: collision with root package name */
        public long f35002c;

        /* renamed from: d  reason: collision with root package name */
        public long f35003d = System.currentTimeMillis();

        static {
            Covode.recordClassIndex(21002);
        }

        public a(long j2, int i2, int i3) {
            this.f35000a = i3;
            this.f35001b = i2;
            this.f35002c = j2;
        }
    }
}
