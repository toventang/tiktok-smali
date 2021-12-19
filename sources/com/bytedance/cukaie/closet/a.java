package com.bytedance.cukaie.closet;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.internal.ReflectiveClosetFactory;
import com.bytedance.cukaie.closet.internal.b;
import com.bytedance.cukaie.closet.internal.f;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import h.f.b.z;
import h.m.p;
import h.w;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final C0609a f28503a = new C0609a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<Class<?>, b> f28504c = new LinkedHashMap();

    /* renamed from: b  reason: collision with root package name */
    private final f f28505b;

    public a(byte b2) {
        this();
    }

    /* renamed from: com.bytedance.cukaie.closet.a$a  reason: collision with other inner class name */
    public static final class C0609a {
        static {
            Covode.recordClassIndex(16744);
        }

        private C0609a() {
        }

        public /* synthetic */ C0609a(byte b2) {
            this();
        }
    }

    public /* synthetic */ a() {
        this(new f());
    }

    static {
        Covode.recordClassIndex(16743);
    }

    public a(f fVar) {
        l.c(fVar, "");
        this.f28505b = fVar;
    }

    private static b a(Class<?> cls) {
        T t;
        b bVar;
        MethodCollector.i(666);
        Map<Class<?>, b> map = f28504c;
        synchronized (map) {
            try {
                t = map.get(cls);
            } finally {
                MethodCollector.o(666);
            }
        }
        if (t == null) {
            Constructor<? extends b> b2 = b(cls);
            if (b2 != null) {
                try {
                    bVar = (b) b2.newInstance(new Object[0]);
                    l.a((Object) bVar, "");
                } catch (NoSuchMethodException e2) {
                    c cVar = new c(e2);
                    MethodCollector.o(666);
                    throw cVar;
                } catch (InstantiationException e3) {
                    c cVar2 = new c(e3);
                    MethodCollector.o(666);
                    throw cVar2;
                } catch (IllegalAccessException e4) {
                    c cVar3 = new c(e4);
                    MethodCollector.o(666);
                    throw cVar3;
                } catch (InvocationTargetException e5) {
                    c cVar4 = new c(e5);
                    MethodCollector.o(666);
                    throw cVar4;
                }
            } else {
                bVar = new ReflectiveClosetFactory(cls);
            }
            z.e eVar = new z.e();
            synchronized (map) {
                try {
                    b bVar2 = map.get(cls);
                    if (bVar2 == null) {
                        map.put(cls, bVar);
                    } else {
                        bVar = bVar2;
                    }
                    eVar.element = (T) bVar;
                } finally {
                    MethodCollector.o(666);
                }
            }
            t = eVar.element;
        }
        return t;
    }

    private static Constructor<? extends b> b(Class<?> cls) {
        String str;
        boolean z;
        boolean z2;
        try {
            String canonicalName = cls.getCanonicalName();
            if (canonicalName == null) {
                return null;
            }
            Package r0 = cls.getPackage();
            if (r0 == null || (str = r0.getName()) == null) {
                str = "";
            }
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                canonicalName = canonicalName.substring(str.length() + 1);
                l.a((Object) canonicalName, "");
            }
            l.c(canonicalName, "");
            String str2 = p.a(canonicalName, ".", "_") + "_CukaieClosetFactory";
            if (str.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                str2 = str + '.' + str2;
            }
            Class<?> cls2 = Class.forName(str2, true, cls.getClassLoader());
            if (cls2 != null) {
                Constructor declaredConstructor = cls2.getDeclaredConstructor(new Class[0]);
                l.a((Object) declaredConstructor, "");
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
                return declaredConstructor;
            }
            throw new w("null cannot be cast to non-null type");
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final <T> T a(Context context, Class<T> cls) {
        l.c(context, "");
        l.c(cls, "");
        b a2 = a(cls);
        return (T) a2.createCloset(this.f28505b.a(context, a2.closetName()));
    }
}
