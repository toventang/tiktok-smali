package com.google.android.gms.internal.measurement;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.android.gms.internal.measurement.gm;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class fy {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f50894a = true;

    /* renamed from: b  reason: collision with root package name */
    private static volatile fy f50895b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile fy f50896c;

    /* renamed from: d  reason: collision with root package name */
    private static final fy f50897d = new fy((byte) 0);

    /* renamed from: e  reason: collision with root package name */
    private final Map<a, gm.d<?, ?>> f50898e;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f50899a;

        /* renamed from: b  reason: collision with root package name */
        private final int f50900b;

        static {
            Covode.recordClassIndex(31805);
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f50899a) * 65535) + this.f50900b;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f50899a == aVar.f50899a && this.f50900b == aVar.f50900b) {
                return true;
            }
            return false;
        }

        a(Object obj, int i2) {
            this.f50899a = obj;
            this.f50900b = i2;
        }
    }

    fy() {
        this.f50898e = new HashMap();
    }

    static {
        Covode.recordClassIndex(31804);
    }

    public static fy a() {
        MethodCollector.i(6381);
        fy fyVar = f50895b;
        if (fyVar == null) {
            synchronized (fy.class) {
                try {
                    fyVar = f50895b;
                    if (fyVar == null) {
                        fyVar = f50897d;
                        f50895b = fyVar;
                    }
                } finally {
                    MethodCollector.o(6381);
                }
            }
        }
        return fyVar;
    }

    public static fy b() {
        MethodCollector.i(6385);
        fy fyVar = f50896c;
        if (fyVar != null) {
            MethodCollector.o(6385);
            return fyVar;
        }
        synchronized (fy.class) {
            try {
                fy fyVar2 = f50896c;
                if (fyVar2 != null) {
                    return fyVar2;
                }
                fy a2 = gl.a(fy.class);
                f50896c = a2;
                MethodCollector.o(6385);
                return a2;
            } finally {
                MethodCollector.o(6385);
            }
        }
    }

    private fy(byte b2) {
        this.f50898e = Collections.emptyMap();
    }

    public final <ContainingType extends ht> gm.d<ContainingType, ?> a(ContainingType containingtype, int i2) {
        return (gm.d<ContainingType, ?>) this.f50898e.get(new a(containingtype, i2));
    }
}
