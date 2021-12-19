package com.bytedance.cukaie.closet.internal;

import com.bytedance.covode.number.Covode;
import com.bytedance.cukaie.closet.a.c;
import com.bytedance.cukaie.closet.b;
import com.bytedance.cukaie.closet.e;
import h.a.i;
import h.f.b.l;
import h.w;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Set;

public final class ReflectiveClosetFactory implements b {
    private final Class<?> clazz;
    private final com.bytedance.cukaie.closet.a.a closetAnnotation;

    static {
        Covode.recordClassIndex(16753);
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final String closetName() {
        return this.closetAnnotation.a();
    }

    @Override // com.bytedance.cukaie.closet.internal.b
    public final Object createCloset(e eVar) {
        l.c(eVar, "");
        Object newProxyInstance = Proxy.newProxyInstance(this.clazz.getClassLoader(), new Class[]{this.clazz}, new a(eVar));
        l.a(newProxyInstance, "");
        return newProxyInstance;
    }

    public ReflectiveClosetFactory(Class<?> cls) {
        l.c(cls, "");
        this.clazz = cls;
        com.bytedance.cukaie.closet.a.a aVar = (com.bytedance.cukaie.closet.a.a) cls.getAnnotation(com.bytedance.cukaie.closet.a.a.class);
        if (aVar != null) {
            this.closetAnnotation = aVar;
            return;
        }
        throw new b("Couldn't find @Closet annotation on class " + cls.getCanonicalName());
    }

    static final class a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ e f28506a;

        static {
            Covode.recordClassIndex(16754);
        }

        a(e eVar) {
            this.f28506a = eVar;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            Object obj2;
            Object obj3;
            com.bytedance.cukaie.closet.a.b bVar = (com.bytedance.cukaie.closet.a.b) method.getAnnotation(com.bytedance.cukaie.closet.a.b.class);
            c cVar = (c) method.getAnnotation(c.class);
            if (bVar != null) {
                e eVar = this.f28506a;
                l.a((Object) method, "");
                if (objArr == null || objArr.length != 1) {
                    throw new b("Method " + method.getName() + " with @In annotation should have at least and only One parameter.");
                }
                Class<?> cls = method.getParameterTypes()[0];
                String a2 = bVar.a();
                Object obj4 = objArr[0];
                l.a((Object) cls, "");
                if (obj4 == null && (cls.isAssignableFrom(Integer.TYPE) || cls.isAssignableFrom(Float.TYPE) || cls.isAssignableFrom(Boolean.TYPE) || cls.isAssignableFrom(Long.TYPE) || cls.isAssignableFrom(Long.class) || cls.isAssignableFrom(Integer.class) || cls.isAssignableFrom(Float.class) || cls.isAssignableFrom(Boolean.class) || cls.isAssignableFrom(Long.class))) {
                    eVar.a(a2);
                } else if (cls.isAssignableFrom(Integer.TYPE) || cls.isAssignableFrom(Integer.class)) {
                    if (obj4 != null) {
                        eVar.b(a2, ((Integer) obj4).intValue());
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else if (cls.isAssignableFrom(Float.TYPE) || cls.isAssignableFrom(Float.class)) {
                    if (obj4 != null) {
                        eVar.b(a2, ((Float) obj4).floatValue());
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else if (cls.isAssignableFrom(Boolean.TYPE) || cls.isAssignableFrom(Boolean.class)) {
                    if (obj4 != null) {
                        eVar.b(a2, ((Boolean) obj4).booleanValue());
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else if (cls.isAssignableFrom(Long.TYPE) || cls.isAssignableFrom(Long.class)) {
                    if (obj4 != null) {
                        eVar.b(a2, ((Long) obj4).longValue());
                    } else {
                        throw new w("null cannot be cast to non-null type");
                    }
                } else if (cls.isAssignableFrom(String.class)) {
                    if (!(obj4 instanceof String)) {
                        obj4 = null;
                    }
                    eVar.b(a2, (String) obj4);
                } else if (cls.isAssignableFrom(byte[].class)) {
                    if (!(obj4 instanceof byte[])) {
                        obj4 = null;
                    }
                    eVar.b(a2, (byte[]) obj4);
                } else if (cls.isAssignableFrom(Set.class)) {
                    if (!(obj4 instanceof Set)) {
                        obj4 = null;
                    }
                    eVar.b(a2, (Set) obj4);
                } else {
                    throw new b("Method " + method.getName() + " with @In annotation has incompatible parameter type " + cls.getCanonicalName() + '.');
                }
                return null;
            } else if (cVar == null) {
                return null;
            } else {
                e eVar2 = this.f28506a;
                l.a((Object) method, "");
                if (objArr == null) {
                    obj2 = null;
                } else if (objArr.length == 0 || objArr.length == 1) {
                    obj2 = i.b(objArr, 0);
                } else {
                    throw new b("Method " + method.getName() + " with @Out annotation should have One or Zero parameter.");
                }
                Class<?> returnType = method.getReturnType();
                if (returnType.isAssignableFrom(Integer.TYPE) || returnType.isAssignableFrom(Integer.class)) {
                    if (obj2 != null) {
                        return Integer.valueOf(eVar2.a(cVar.a(), ((Integer) obj2).intValue()));
                    }
                    return Integer.valueOf(eVar2.a(cVar.a(), 0));
                } else if (returnType.isAssignableFrom(Float.TYPE) || returnType.isAssignableFrom(Float.class)) {
                    if (obj2 != null) {
                        return Float.valueOf(eVar2.a(cVar.a(), ((Float) obj2).floatValue()));
                    }
                    return Float.valueOf(eVar2.a(cVar.a(), 0.0f));
                } else if (returnType.isAssignableFrom(Boolean.TYPE) || returnType.isAssignableFrom(Boolean.class)) {
                    if (obj2 != null) {
                        return Boolean.valueOf(eVar2.a(cVar.a(), ((Boolean) obj2).booleanValue()));
                    }
                    return Boolean.valueOf(eVar2.a(cVar.a(), false));
                } else if (!returnType.isAssignableFrom(Long.TYPE) && !returnType.isAssignableFrom(Long.class)) {
                    if (returnType.isAssignableFrom(String.class)) {
                        if (obj2 == null || (obj3 = eVar2.a(cVar.a(), (String) obj2)) == null) {
                            return eVar2.a(cVar.a(), (String) null);
                        }
                    } else if (returnType.isAssignableFrom(byte[].class)) {
                        if (obj2 == null || (obj3 = eVar2.a(cVar.a(), (byte[]) obj2)) == null) {
                            return eVar2.a(cVar.a(), (byte[]) null);
                        }
                    } else if (!returnType.isAssignableFrom(Set.class)) {
                        StringBuilder append = new StringBuilder("Method ").append(method.getName()).append(" with @Out annotation has incompatible return type ");
                        l.a((Object) returnType, "");
                        throw new b(append.append(returnType.getCanonicalName()).append('.').toString());
                    } else if (obj2 == null || (obj3 = eVar2.a(cVar.a(), (Set) obj2)) == null) {
                        return eVar2.a(cVar.a(), (Set<String>) null);
                    }
                    return obj3;
                } else if (obj2 != null) {
                    return Long.valueOf(eVar2.a(cVar.a(), ((Long) obj2).longValue()));
                } else {
                    return Long.valueOf(eVar2.a(cVar.a(), 0L));
                }
            }
        }
    }
}
