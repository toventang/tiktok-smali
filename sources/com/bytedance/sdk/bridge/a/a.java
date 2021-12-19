package com.bytedance.sdk.bridge.a;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.bridge.d;
import com.bytedance.sdk.bridge.e;
import com.bytedance.sdk.bridge.g;
import com.bytedance.sdk.bridge.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static Map<Class<?>, h> f43839a = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(26801);
    }

    public static h a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        g.a("BridgeAnnotationHelper", "getInfoByReflect - " + cls.getSimpleName());
        h hVar = new h();
        LinkedList linkedList = new LinkedList();
        linkedList.add(cls);
        while (!linkedList.isEmpty()) {
            Class cls2 = (Class) linkedList.remove();
            Class<?>[] interfaces = cls2.getInterfaces();
            if (interfaces != null) {
                for (int i2 = 0; i2 < interfaces.length; i2++) {
                    if (e.class.isAssignableFrom(interfaces[i2]) && interfaces[i2] != e.class) {
                        linkedList.add(interfaces[i2]);
                    }
                }
            }
            Class superclass = cls2.getSuperclass();
            if (superclass != null) {
                String name = superclass.getName();
                if (!name.startsWith("java.") && !name.startsWith("javax.") && !name.startsWith("android.")) {
                    linkedList.add(superclass);
                }
            }
            a(cls2, hVar);
        }
        return hVar;
    }

    private static void a(Class cls, h hVar) {
        MethodCollector.i(4339);
        h hVar2 = f43839a.get(cls);
        if (hVar2 != null) {
            synchronized (hVar2) {
                try {
                    for (d dVar : hVar2.a()) {
                        if (!hVar.a(dVar.f43858b)) {
                            hVar.a(dVar.f43858b, dVar);
                        }
                    }
                } finally {
                    MethodCollector.o(4339);
                }
            }
            return;
        }
        h hVar3 = new h();
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            c cVar = (c) method.getAnnotation(c.class);
            if (cVar != null) {
                String a2 = cVar.a();
                if (!TextUtils.isEmpty(a2) && !hVar.a(a2)) {
                    method.setAccessible(true);
                    String b2 = cVar.b();
                    String c2 = cVar.c();
                    Annotation[][] parameterAnnotations = method.getParameterAnnotations();
                    Class<?>[] parameterTypes = method.getParameterTypes();
                    e[] eVarArr = new e[parameterAnnotations.length];
                    for (int i2 = 0; i2 < parameterAnnotations.length; i2++) {
                        int i3 = 0;
                        while (true) {
                            if (i3 >= parameterAnnotations[i2].length) {
                                break;
                            } else if (parameterAnnotations[i2][i3] instanceof d) {
                                d dVar2 = (d) parameterAnnotations[i2][i3];
                                Class<?> cls2 = parameterTypes[i2];
                                String a3 = dVar2.a();
                                Object obj = null;
                                if (cls2 == Integer.TYPE) {
                                    obj = Integer.valueOf(dVar2.b());
                                } else if (cls2 == Long.TYPE) {
                                    obj = Long.valueOf(dVar2.c());
                                } else if (cls2 == Boolean.TYPE) {
                                    obj = Boolean.valueOf(dVar2.f());
                                } else if (cls2 == Double.TYPE) {
                                    obj = Double.valueOf(dVar2.d());
                                } else if (cls2 == Float.TYPE) {
                                    obj = Float.valueOf(dVar2.e());
                                } else if (cls2 == String.class) {
                                    obj = dVar2.g();
                                }
                                eVarArr[i2] = new e(cls2, a3, obj, dVar2.h());
                            } else if (parameterAnnotations[i2][i3] instanceof b) {
                                eVarArr[i2] = new e();
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (eVarArr[i2] == null) {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Bridge param must be Annotated! Please check the bridge method [" + a2 + "]");
                            MethodCollector.o(4339);
                            throw illegalArgumentException;
                        }
                    }
                    d dVar3 = new d(method, a2, b2, c2, eVarArr);
                    hVar.a(a2, dVar3);
                    hVar3.a(a2, dVar3);
                }
            }
        }
        if (!hVar3.a().isEmpty()) {
            f43839a.put(cls, hVar3);
        }
        MethodCollector.o(4339);
    }
}
