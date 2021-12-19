package com.bytedance.ies.bullet.service.base.b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.bullet.service.a.b;
import com.bytedance.ies.bullet.service.a.d;
import com.bytedance.ies.bullet.service.base.a.c;
import com.bytedance.ies.bullet.service.base.a.l;
import com.bytedance.ies.bullet.service.base.b.f;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class e implements l {

    /* renamed from: a  reason: collision with root package name */
    public static volatile l f32577a = new d();

    /* renamed from: b  reason: collision with root package name */
    public static final a f32578b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<String, f> f32579c;

    public static final class a {
        static {
            Covode.recordClassIndex(19337);
        }

        private a() {
        }

        public static l a() {
            l lVar;
            MethodCollector.i(13541);
            synchronized (e.f32577a) {
                try {
                    lVar = e.f32577a;
                    if (lVar instanceof d) {
                        lVar = new e((byte) 0);
                        e.f32577a = lVar;
                    }
                } finally {
                    MethodCollector.o(13541);
                }
            }
            return lVar;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static f a(String str, ConcurrentHashMap<String, f> concurrentHashMap) {
            f fVar = concurrentHashMap.get(str);
            if (fVar != null) {
                return fVar;
            }
            f a2 = new f.a().a(str).a();
            concurrentHashMap.put(str, a2);
            return a2;
        }
    }

    private e() {
        this.f32579c = new ConcurrentHashMap<>();
    }

    static {
        Covode.recordClassIndex(19336);
    }

    public /* synthetic */ e(byte b2) {
        this();
    }

    @Override // com.bytedance.ies.bullet.service.base.a.l
    public final <T extends c> T a(Class<T> cls) {
        h.f.b.l.c(cls, "");
        return (T) l.a.a(this, cls);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.g
    public final com.bytedance.ies.bullet.service.a.e<String, Object> a(String str) {
        h.f.b.l.c(str, "");
        com.bytedance.ies.bullet.service.a.c d2 = d(str);
        if (d2 != null) {
            return d2.b();
        }
        return null;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.g
    public final com.bytedance.ies.bullet.service.a.e<String, Object> b(String str) {
        h.f.b.l.c(str, "");
        com.bytedance.ies.bullet.service.a.c d2 = d(str);
        if (d2 != null) {
            return d2.c();
        }
        return null;
    }

    private static com.bytedance.ies.bullet.service.a.c d(String str) {
        b bVar;
        String str2;
        h.f.b.l.c(str, "");
        d dVar = d.f32498b;
        h.f.b.l.c(str, "");
        SoftReference<b> softReference = dVar.f32501a.get(str);
        if (softReference == null || (bVar = softReference.get()) == null) {
            if (str.length() == 0) {
                str2 = d.f32499c.invoke();
            } else {
                str2 = str;
            }
            SoftReference<b> softReference2 = new SoftReference<>(new com.bytedance.ies.bullet.service.a.c(str2));
            dVar.f32501a.put(str, softReference2);
            bVar = softReference2.get();
        }
        if (!(bVar instanceof com.bytedance.ies.bullet.service.a.c)) {
            bVar = null;
        }
        return (com.bytedance.ies.bullet.service.a.c) bVar;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.g
    public final void c(String str) {
        b bVar;
        h.f.b.l.c(str, "");
        d dVar = d.f32498b;
        h.f.b.l.c(str, "");
        if (str.length() == 0) {
            Iterator<T> it = dVar.f32501a.values().iterator();
            while (it.hasNext()) {
                b bVar2 = (b) it.next().get();
                if (bVar2 != null) {
                    bVar2.a();
                }
            }
            dVar.f32501a.clear();
            return;
        }
        SoftReference<b> softReference = dVar.f32501a.get(str);
        if (!(softReference == null || (bVar = softReference.get()) == null)) {
            bVar.a();
        }
        dVar.f32501a.remove(str);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.l
    public final <T extends c> T a(String str, Class<T> cls) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(cls, "");
        f a2 = a.a(str, this.f32579c);
        String name = cls.getName();
        h.f.b.l.a((Object) name, "");
        T t = (T) a2.a(name);
        if (t != null) {
            return t;
        }
        f a3 = a.a("default_bid", this.f32579c);
        String name2 = cls.getName();
        h.f.b.l.a((Object) name2, "");
        T t2 = (T) a3.a(name2);
        if (!(t2 instanceof c)) {
            return null;
        }
        return t2;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.l
    public final <T extends c> l a(Class<T> cls, T t) {
        h.f.b.l.c(cls, "");
        h.f.b.l.c(t, "");
        return l.a.a(this, cls, t);
    }

    @Override // com.bytedance.ies.bullet.service.base.a.l
    public final l a(String str, f fVar) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(fVar, "");
        f a2 = a.a(str, this.f32579c);
        h.f.b.l.c(fVar, "");
        for (Map.Entry<String, c> entry : fVar.f32580a.entrySet()) {
            a2.a(entry.getKey(), entry.getValue());
        }
        return this;
    }

    @Override // com.bytedance.ies.bullet.service.base.a.g
    public final void a(String str, Context context) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(context, "");
        com.bytedance.ies.bullet.service.a.c d2 = d(str);
        if (d2 != null) {
            h.f.b.l.c(context, "");
            if (d2.f32492a == null) {
                d2.f32492a = context;
            }
        }
    }

    @Override // com.bytedance.ies.bullet.service.base.a.l
    public final <T extends c> l a(String str, Class<T> cls, T t) {
        h.f.b.l.c(str, "");
        h.f.b.l.c(cls, "");
        h.f.b.l.c(t, "");
        f a2 = a.a(str, this.f32579c);
        String name = cls.getName();
        h.f.b.l.a((Object) name, "");
        a2.a(name, t);
        return this;
    }
}
