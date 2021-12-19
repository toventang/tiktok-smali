package com.ss.android.ugc.aweme.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.a.a;
import h.f.b.l;

/* access modifiers changed from: package-private */
public final class ea<T> implements dz<T> {

    /* renamed from: a  reason: collision with root package name */
    private a<? extends T> f142845a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f142846b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f142847c;

    static {
        Covode.recordClassIndex(93460);
    }

    public final String toString() {
        if (this.f142846b != ih.f143099a) {
            return String.valueOf(a());
        }
        return "Lazy value not initialized yet.";
    }

    @Override // com.ss.android.ugc.aweme.utils.dz
    public final T a() {
        T t;
        MethodCollector.i(6867);
        T t2 = (T) this.f142846b;
        if (t2 != ih.f143099a) {
            MethodCollector.o(6867);
            return t2;
        }
        synchronized (this.f142847c) {
            try {
                t = (T) this.f142846b;
                if (t == ih.f143099a) {
                    a<? extends T> aVar = this.f142845a;
                    if (aVar == null) {
                        l.b();
                    }
                    t = (T) aVar.invoke();
                    this.f142846b = t;
                    this.f142845a = null;
                }
            } finally {
                MethodCollector.o(6867);
            }
        }
        return t;
    }

    private ea(a<? extends T> aVar) {
        l.d(aVar, "");
        this.f142845a = aVar;
        this.f142846b = ih.f143099a;
        this.f142847c = this;
    }

    @Override // com.ss.android.ugc.aweme.utils.dz
    public final void a(T t) {
        MethodCollector.i(6890);
        if (l.a(this.f142846b, ih.f143099a)) {
            synchronized (this.f142847c) {
                try {
                    this.f142846b = t;
                    this.f142845a = null;
                } finally {
                    MethodCollector.o(6890);
                }
            }
            return;
        }
        this.f142846b = t;
        MethodCollector.o(6890);
    }

    public /* synthetic */ ea(a aVar, byte b2) {
        this(aVar);
    }
}
