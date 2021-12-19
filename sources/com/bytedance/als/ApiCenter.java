package com.bytedance.als;

import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ae;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

public final class ApiCenter {

    /* renamed from: a  reason: collision with root package name */
    public static final a f6444a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private final Map<Class<?>, Object> f6445b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6446c;

    /* renamed from: d  reason: collision with root package name */
    private ApiCenter f6447d;

    public static final class ApiCenterCompatViewModel extends ac {

        /* renamed from: a  reason: collision with root package name */
        public final ApiCenter f6448a = new ApiCenter((byte) 0);

        static {
            Covode.recordClassIndex(3098);
        }
    }

    static {
        Covode.recordClassIndex(3097);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(3099);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static ApiCenter a(e eVar) {
            l.d(eVar, "");
            return ((ApiCenterCompatViewModel) ae.a(eVar).a(ApiCenterCompatViewModel.class)).f6448a;
        }
    }

    private ApiCenter() {
        this.f6447d = null;
        this.f6445b = new HashMap();
    }

    public /* synthetic */ ApiCenter(byte b2) {
        this();
    }

    public final <T extends b> void b(T t) {
        l.d(t, "");
        if (!this.f6446c) {
            this.f6445b.remove(t.getClass());
        }
    }

    public final synchronized <T extends b> T b(Class<T> cls) {
        T t;
        MethodCollector.i(3857);
        l.d(cls, "");
        Object obj = this.f6445b.get(cls);
        if (obj != null) {
            T t2 = (T) ((b) obj);
            MethodCollector.o(3857);
            return t2;
        }
        Iterator<T> it = this.f6445b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (a(cls, t)) {
                break;
            }
        }
        T t3 = t;
        ApiCenter apiCenter = this.f6447d;
        if (t3 != null) {
            Object obj2 = this.f6445b.get(t3);
            if (obj2 != null) {
                T t4 = (T) ((b) obj2);
                MethodCollector.o(3857);
                return t4;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type T");
            MethodCollector.o(3857);
            throw nullPointerException;
        } else if (apiCenter != null) {
            T t5 = (T) apiCenter.b(cls);
            MethodCollector.o(3857);
            return t5;
        } else {
            MethodCollector.o(3857);
            return null;
        }
    }

    public final synchronized <T extends b> T a(Class<T> cls) {
        T t;
        MethodCollector.i(3852);
        l.d(cls, "");
        Object obj = this.f6445b.get(cls);
        if (obj != null) {
            T t2 = (T) ((b) obj);
            MethodCollector.o(3852);
            return t2;
        }
        Iterator<T> it = this.f6445b.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (a(cls, t)) {
                break;
            }
        }
        T t3 = t;
        ApiCenter apiCenter = this.f6447d;
        if (t3 != null) {
            Object obj2 = this.f6445b.get(t3);
            if (obj2 != null) {
                T t4 = (T) ((b) obj2);
                MethodCollector.o(3852);
                return t4;
            }
            NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type T");
            MethodCollector.o(3852);
            throw nullPointerException;
        } else if (apiCenter != null) {
            T t5 = (T) apiCenter.a(cls);
            MethodCollector.o(3852);
            return t5;
        } else {
            IllegalStateException illegalStateException = new IllegalStateException("not found ".concat(String.valueOf(cls)));
            MethodCollector.o(3852);
            throw illegalStateException;
        }
    }

    public final <T extends b> void a(T t) {
        l.d(t, "");
        if (!this.f6446c) {
            Class<?> cls = t.getClass();
            if (!l.a(cls, b.class)) {
                for (T t2 : this.f6445b.keySet()) {
                    if (l.a((Object) cls, (Object) t2)) {
                        throw new IllegalStateException(cls + " already register");
                    } else if (a(cls, t2)) {
                        throw new IllegalStateException(cls + " child found " + ((Object) t2));
                    } else if (a(t2, cls)) {
                        throw new IllegalStateException(cls + " parent found " + ((Object) t2));
                    }
                }
                this.f6445b.put(cls, t);
                return;
            }
            throw new IllegalArgumentException("ApiComponent can't register, use subclass instead");
        }
    }

    private final boolean a(Class<?> cls, Class<?> cls2) {
        if (cls.isInterface()) {
            Class<?>[] interfaces = cls2.getInterfaces();
            for (Class<?> cls3 : interfaces) {
                if (l.a(cls3, cls)) {
                    return true;
                }
                l.b(cls3, "");
                if (a(cls, cls3)) {
                    return true;
                }
            }
            return false;
        }
        while (!l.a(cls2, Object.class)) {
            if (l.a(cls2, cls)) {
                return true;
            }
            cls2 = cls2.getSuperclass();
            Objects.requireNonNull(cls2, "null cannot be cast to non-null type java.lang.Class<*>");
        }
        return false;
    }
}
