package com.bytedance.platform.godzilla.b.a.a.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.platform.godzilla.a.g;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public abstract class c extends b implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    protected static final Map<Class<?>, Class<?>> f41960a;

    /* renamed from: e  reason: collision with root package name */
    private static final Map<String, b> f41961e = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    protected HashMap<String, b> f41962b = new HashMap<>();

    /* renamed from: c  reason: collision with root package name */
    public Object f41963c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f41964d = true;

    /* renamed from: f  reason: collision with root package name */
    private boolean f41965f;

    static {
        Covode.recordClassIndex(25631);
        HashMap hashMap = new HashMap();
        f41960a = hashMap;
        hashMap.put(Boolean.class, Boolean.TYPE);
        hashMap.put(Byte.class, Byte.TYPE);
        hashMap.put(Character.class, Character.TYPE);
        hashMap.put(Short.class, Short.TYPE);
        hashMap.put(Integer.class, Integer.TYPE);
        hashMap.put(Long.class, Long.TYPE);
        hashMap.put(Double.class, Double.TYPE);
        hashMap.put(Float.class, Float.TYPE);
    }

    public final void a(Object obj) {
        this.f41965f = true;
        this.f41963c = obj;
    }

    private b a(String str) {
        b bVar = f41961e.get(str);
        if (bVar == null) {
            return this.f41962b.get(str);
        }
        return bVar;
    }

    public static void a(String str, b bVar) {
        f41961e.put(str, bVar);
    }

    @Override // com.bytedance.platform.godzilla.b.a.a.a.b
    public final Object a(Object obj, Method method, Object[] objArr) {
        b a2 = a(method.getName());
        if (a2 != null) {
            return a2.a(obj, method, objArr);
        }
        return super.a(obj, method, objArr);
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (this.f41965f) {
            if (!method.isAccessible()) {
                method.setAccessible(true);
            }
            if (!this.f41964d) {
                return method.invoke(this.f41963c, objArr);
            }
            try {
                obj2 = a(this.f41963c, method, objArr);
            } catch (Throwable unused) {
                g.a(g.a.ERROR);
                obj2 = null;
            }
            if (obj2 == null) {
                try {
                    obj2 = method.invoke(this.f41963c, objArr);
                } catch (Throwable unused2) {
                    g.a(g.a.ERROR);
                }
            }
            try {
                obj2 = a(this.f41963c, method, objArr, obj2);
            } catch (Throwable unused3) {
                g.a(g.a.ERROR);
            }
            if (obj2 != null) {
                return obj2;
            }
            Class<?> returnType = method.getReturnType();
            if (returnType == null) {
                return null;
            }
            if (!returnType.isPrimitive() && (returnType = f41960a.get(returnType)) == null) {
                return null;
            }
            if (returnType == Boolean.TYPE) {
                return false;
            }
            if (returnType == Void.TYPE) {
                return new Object();
            }
            return 0;
        }
        throw new IllegalStateException("setTarget must be invoked before this invoke");
    }

    @Override // com.bytedance.platform.godzilla.b.a.a.a.b
    public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
        b a2 = a(method.getName());
        if (a2 != null) {
            return a2.a(obj, method, objArr, obj2);
        }
        return super.a(obj, method, objArr, obj2);
    }
}
