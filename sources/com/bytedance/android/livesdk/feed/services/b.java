package com.bytedance.android.livesdk.feed.services;

import com.bytedance.android.livesdk.feed.h;
import com.bytedance.android.livesdk.feed.network.GsonProvider;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.google.gson.f;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f17645a;

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, a<?>> f17646b = new ConcurrentHashMap();

    /* renamed from: com.bytedance.android.livesdk.feed.services.b$b  reason: collision with other inner class name */
    public interface AbstractC0369b<T> {
        static {
            Covode.recordClassIndex(9788);
        }

        a<T> a(a<T> aVar);

        /* renamed from: com.bytedance.android.livesdk.feed.services.b$b$a */
        public static final class a<R> {

            /* renamed from: a  reason: collision with root package name */
            public R f17649a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f17650b;

            static {
                Covode.recordClassIndex(9789);
            }

            private a() {
            }

            /* synthetic */ a(byte b2) {
                this();
            }
        }
    }

    static {
        Covode.recordClassIndex(9786);
    }

    private b() {
        a(h.class, new a());
        a(com.bytedance.android.livesdk.feed.g.a.class, new e());
        a(f.class, new GsonProvider());
    }

    public static b a() {
        MethodCollector.i(2323);
        if (f17645a == null) {
            synchronized (b.class) {
                try {
                    if (f17645a == null) {
                        f17645a = new b();
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2323);
                    throw th;
                }
            }
        }
        b bVar = f17645a;
        MethodCollector.o(2323);
        return bVar;
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        public AbstractC0369b<T> f17647a;

        /* renamed from: b  reason: collision with root package name */
        public Object f17648b;

        static {
            Covode.recordClassIndex(9787);
        }

        private a(AbstractC0369b<T> bVar) {
            this.f17647a = bVar;
        }

        /* synthetic */ a(AbstractC0369b bVar, byte b2) {
            this(bVar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [R, T] */
    public final <T> T a(Class<T> cls) {
        MethodCollector.i(2324);
        a<?> aVar = this.f17646b.get(cls);
        if (aVar == null) {
            aVar = a(cls, new c(cls));
        }
        AbstractC0369b.a<T> a2 = aVar.f17647a.a(new AbstractC0369b.a<>((byte) 0));
        if (a2.f17650b) {
            if (aVar.f17648b == null) {
                synchronized (b.class) {
                    try {
                        if (aVar.f17648b == null) {
                            aVar.f17648b = a2.f17649a;
                        }
                    } catch (Throwable th) {
                        MethodCollector.o(2324);
                        throw th;
                    }
                }
            }
            T t = (T) aVar.f17648b;
            MethodCollector.o(2324);
            return t;
        }
        R r = a2.f17649a;
        MethodCollector.o(2324);
        return r;
    }

    private <T> a<T> a(Class<T> cls, AbstractC0369b<T> bVar) {
        a<T> aVar = new a<>(bVar, (byte) 0);
        this.f17646b.put(cls, aVar);
        return aVar;
    }

    static final /* synthetic */ AbstractC0369b.a a(Class cls, AbstractC0369b.a aVar) {
        try {
            aVar.f17649a = (R) cls.newInstance();
            return aVar;
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Requested class isn't registered in FeedImplProvider and its nullary constructor isn't accessible: " + cls.getName() + ".\n Forgot to register in FeedImplProvider or FlavorImplProvider?");
        } catch (InstantiationException unused2) {
            throw new RuntimeException("Requested class isn't registered in FeedImplProvider and doesn't have public non-param constructor: " + cls.getName() + ".\n Forgot to register in FeedImplProvider or FlavorImplProvider?");
        }
    }
}
