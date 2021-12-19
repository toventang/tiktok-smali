package com.bytedance.platform.godzilla;

import android.app.Application;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.platform.godzilla.a.e;
import com.bytedance.platform.godzilla.a.f;
import com.bytedance.platform.godzilla.a.g;
import com.bytedance.platform.godzilla.c.b;
import com.bytedance.platform.godzilla.c.d;
import com.bytedance.platform.godzilla.d.c;
import java.util.HashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static volatile a f41939a;

    /* renamed from: b  reason: collision with root package name */
    private final Application f41940b;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, com.bytedance.platform.godzilla.c.a> f41941c;

    static {
        Covode.recordClassIndex(25614);
    }

    /* renamed from: com.bytedance.platform.godzilla.a$a  reason: collision with other inner class name */
    public static class C1028a {

        /* renamed from: a  reason: collision with root package name */
        public g.a f41942a;

        /* renamed from: b  reason: collision with root package name */
        private final Application f41943b;

        /* renamed from: c  reason: collision with root package name */
        private final HashMap<String, com.bytedance.platform.godzilla.c.a> f41944c = new HashMap<>();

        /* renamed from: d  reason: collision with root package name */
        private e f41945d;

        /* renamed from: e  reason: collision with root package name */
        private f f41946e;

        static {
            Covode.recordClassIndex(25615);
        }

        public final a a() {
            return new a(this.f41943b, this.f41944c, this.f41945d, this.f41942a, this.f41946e, (byte) 0);
        }

        public C1028a(Application application) {
            if (application != null) {
                this.f41943b = application;
                return;
            }
            throw new RuntimeException("Godzilla init, application is null");
        }

        public final C1028a a(com.bytedance.platform.godzilla.c.a aVar) {
            String b2 = aVar.b();
            if (TextUtils.isEmpty(b2)) {
                throw new RuntimeException(com.a.a("%s plugin name is null", new Object[]{aVar.getClass().getName()}));
            } else if (this.f41944c.get(b2) == null) {
                this.f41944c.put(b2, aVar);
                return this;
            } else {
                throw new RuntimeException(com.a.a("%s plugin is already exist", new Object[]{b2}));
            }
        }
    }

    public static a a(a aVar) {
        MethodCollector.i(2377);
        if (aVar != null) {
            synchronized (a.class) {
                try {
                    if (f41939a == null) {
                        f41939a = aVar;
                    } else {
                        g.a(g.a.ERROR);
                    }
                } catch (Throwable th) {
                    MethodCollector.o(2377);
                    throw th;
                }
            }
            a aVar2 = f41939a;
            MethodCollector.o(2377);
            return aVar2;
        }
        RuntimeException runtimeException = new RuntimeException("Godzilla should not be null.");
        MethodCollector.o(2377);
        throw runtimeException;
    }

    public final void a(d dVar) {
        for (com.bytedance.platform.godzilla.c.a aVar : this.f41941c.values()) {
            if (aVar instanceof b) {
                for (com.bytedance.platform.godzilla.c.a aVar2 : ((b) aVar).f41979b) {
                    if (aVar2.d() == dVar) {
                        aVar2.a();
                    }
                }
            } else if (aVar.d() == dVar) {
                aVar.a();
            }
        }
    }

    private a(Application application, HashMap<String, com.bytedance.platform.godzilla.c.a> hashMap, e eVar, g.a aVar, f fVar) {
        this.f41940b = application;
        this.f41941c = hashMap;
        b.INSTANCE.init(application, eVar, aVar);
        for (com.bytedance.platform.godzilla.c.a aVar2 : hashMap.values()) {
            aVar2.a(this.f41940b);
        }
        c.f41986a = fVar;
    }

    /* synthetic */ a(Application application, HashMap hashMap, e eVar, g.a aVar, f fVar, byte b2) {
        this(application, hashMap, eVar, aVar, fVar);
    }
}
