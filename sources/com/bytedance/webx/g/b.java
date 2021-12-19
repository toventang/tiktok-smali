package com.bytedance.webx.g;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.webx.b.a.a;
import com.bytedance.webx.f;
import com.bytedance.webx.g;
import com.bytedance.webx.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private static String f45994a = "WebXImpl";

    /* renamed from: b  reason: collision with root package name */
    private String f45995b;

    /* renamed from: c  reason: collision with root package name */
    private HashMap<Class<? extends f>, f> f45996c = new HashMap<>();

    static {
        Covode.recordClassIndex(28130);
    }

    public b(String str) {
        this.f45995b = str;
    }

    public static <T> T b(Class<? extends T> cls) {
        Constructor<?> constructor;
        try {
            Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
            int length = declaredConstructors.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    constructor = null;
                    break;
                }
                constructor = declaredConstructors[i2];
                if (constructor.getParameterTypes().length == 0) {
                    break;
                }
                i2++;
            }
            if (constructor != null) {
                try {
                    constructor.setAccessible(true);
                    return (T) constructor.newInstance(new Object[0]);
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InstantiationException e3) {
                    throw new RuntimeException(e3);
                } catch (InvocationTargetException e4) {
                    throw new RuntimeException(e4);
                }
            } else {
                throw new RuntimeException();
            }
        } catch (Throwable unused) {
            a.a(f45994a);
            return null;
        }
    }

    @Override // com.bytedance.webx.g.a
    public final <T extends f> T a(Class<T> cls) {
        MethodCollector.i(8813);
        f fVar = (T) this.f45996c.get(cls);
        if (fVar == null) {
            synchronized (g.class) {
                try {
                    fVar = this.f45996c.get(cls);
                    if (fVar == null) {
                        h a2 = h.a(this.f45995b, cls);
                        if (a2 != null) {
                            fVar = (f) b(a2.f46002c);
                            if (!(fVar instanceof com.bytedance.webx.e.b)) {
                                fVar = (T) null;
                            } else {
                                ((com.bytedance.webx.e.b) fVar).a(a2);
                                ((com.bytedance.webx.e.b) fVar).getExtendableContext().a(a2.f46003d);
                            }
                            HashMap<Class<? extends f>, f> hashMap = new HashMap<>(this.f45996c);
                            hashMap.put(cls, fVar);
                            this.f45996c = hashMap;
                        } else {
                            Error error = new Error("nameSpace " + this.f45995b + "& class " + cls.getCanonicalName() + " 's env is null");
                            MethodCollector.o(8813);
                            throw error;
                        }
                    }
                } finally {
                    MethodCollector.o(8813);
                }
            }
        }
        return fVar;
    }
}
