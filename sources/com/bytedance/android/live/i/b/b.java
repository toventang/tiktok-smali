package com.bytedance.android.live.i.b;

import com.bytedance.android.live.n.f;
import com.bytedance.android.live.n.k;
import com.bytedance.android.live.n.m;
import com.bytedance.android.livesdk.aj.a;
import com.bytedance.android.livesdk.aj.d;
import com.bytedance.android.livesdk.aj.i;
import com.bytedance.android.livesdk.aj.n;
import com.bytedance.android.livesdk.o.b;
import com.bytedance.android.livesdk.o.c;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: a */
    private static volatile b f9907a;

    /* renamed from: b */
    private final Map<Class<?>, a<?>> f9908b = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.live.i.b.b$b */
    public interface AbstractC0153b<T> {
        static {
            Covode.recordClassIndex(5113);
        }

        a<T> a(a<T> aVar);

        /* renamed from: com.bytedance.android.live.i.b.b$b$a */
        public static final class a<R> {

            /* renamed from: a */
            public R f9912a;

            /* renamed from: b */
            public boolean f9913b;

            static {
                Covode.recordClassIndex(5114);
            }

            private a() {
            }

            /* synthetic */ a(byte b2) {
                this();
            }
        }
    }

    static {
        Covode.recordClassIndex(5111);
    }

    static b a() {
        MethodCollector.i(255);
        if (f9907a == null) {
            synchronized (b.class) {
                try {
                    if (f9907a == null) {
                        f9907a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(255);
                    throw th;
                }
            }
        }
        b bVar = f9907a;
        MethodCollector.o(255);
        return bVar;
    }

    private b() {
        a(k.class, new i.a());
        a(f.class, new b.a());
        a(m.class, new c.b());
        a(n.class, new n.a());
        a(com.bytedance.android.live.i.a.b.class, new d.a());
        a(com.bytedance.android.live.i.a.a.class, new a.C0290a());
    }

    public static final class a<T> {

        /* renamed from: a */
        public AbstractC0153b<T> f9909a;

        /* renamed from: b */
        public AbstractC0153b.a<T> f9910b;

        /* renamed from: c */
        public Object f9911c;

        static {
            Covode.recordClassIndex(5112);
        }

        private a(AbstractC0153b<T> bVar) {
            this.f9909a = bVar;
        }

        /* synthetic */ a(AbstractC0153b bVar, byte b2) {
            this(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [R, T] */
    public <T> T a(Class<T> cls) {
        MethodCollector.i(259);
        a<?> aVar = this.f9908b.get(cls);
        if (aVar == null) {
            aVar = new a<>(new c(cls), (byte) 0);
            aVar.f9910b = aVar.f9909a.a(new AbstractC0153b.a<>((byte) 0));
            aVar.f9911c = aVar.f9909a.a(aVar.f9910b).f9912a;
            this.f9908b.put(cls, aVar);
        }
        if (aVar.f9910b == null || !aVar.f9910b.f9913b) {
            aVar.f9910b = aVar.f9909a.a(new AbstractC0153b.a<>((byte) 0));
        }
        if (aVar.f9910b.f9913b) {
            if (aVar.f9911c == null) {
                synchronized (b.class) {
                    try {
                        if (aVar.f9911c == null && aVar.f9910b != null) {
                            aVar.f9911c = aVar.f9910b.f9912a;
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(259);
                        throw th;
                    }
                }
            }
            T t = (T) aVar.f9911c;
            MethodCollector.o(259);
            return t;
        }
        R r = aVar.f9910b.f9912a;
        aVar.f9910b = null;
        MethodCollector.o(259);
        return r;
    }

    private <T> a<T> a(Class<T> cls, AbstractC0153b<T> bVar) {
        a<T> aVar = new a<>(bVar, (byte) 0);
        this.f9908b.put(cls, aVar);
        return aVar;
    }

    static final /* synthetic */ AbstractC0153b.a a(Class cls, AbstractC0153b.a aVar) {
        try {
            aVar.f9912a = (R) cls.newInstance();
            return aVar;
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Requested class isn't registered in LiveImplProvider and its nullary constructor isn't accessible: " + cls.getName() + ".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
        } catch (InstantiationException unused2) {
            throw new RuntimeException("Requested class isn't registered in LiveImplProvider and doesn't have public non-param constructor: " + cls.getName() + ".\n Forgot to register in LiveImplProvider or FlavorImplProvider?");
        }
    }
}
