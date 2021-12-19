package com.bytedance.sdk.xbridge.registry.core_api.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.annotation.b;
import com.bytedance.sdk.xbridge.registry.core.annotation.c;
import com.bytedance.sdk.xbridge.registry.core.annotation.e;
import com.bytedance.sdk.xbridge.registry.core.h;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.lynx.react.bridge.ReadableMap;
import h.a.ag;
import h.a.i;
import h.f.b.ab;
import h.f.b.l;
import h.p;
import h.w;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

public final class a implements com.bytedance.sdk.xbridge.registry.core.a.a<ReadableMap> {
    static {
        Covode.recordClassIndex(26930);
    }

    private static int a(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj == null) {
            throw new com.bytedance.sdk.xbridge.registry.core.b.a("the key is null");
        }
        throw new com.bytedance.sdk.xbridge.registry.core.b.a("the key is not a number");
    }

    private final Object b(Class<? extends XBaseModel> cls, HashMap<String, Object> hashMap) {
        c(cls, hashMap);
        if (cls == null) {
            l.a();
        }
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C1075a(this, cls, hashMap));
        l.a(newProxyInstance, "");
        return newProxyInstance;
    }

    public final Object a(Object obj, c cVar) {
        Class<? extends XBaseModel> cls;
        if (!b(obj, cVar)) {
            return obj;
        }
        if (cVar != null) {
            cls = cVar.c();
        } else {
            cls = null;
        }
        if (obj != null) {
            HashMap<String, Object> hashMap = ((ReadableMap) obj).toHashMap();
            l.a((Object) hashMap, "");
            return b(cls, hashMap);
        }
        throw new w("null cannot be cast to non-null type");
    }

    private static Object a(Method method, c cVar) {
        Class<?> returnType = method.getReturnType();
        if (l.a(returnType, Number.class)) {
            int i2 = b.f44070a[cVar.f().a().ordinal()];
            if (i2 == 1) {
                return Double.valueOf(cVar.f().b());
            }
            if (i2 == 2) {
                return Long.valueOf(cVar.f().f());
            }
            if (i2 != 3) {
                return Integer.valueOf(cVar.f().d());
            }
            return Integer.valueOf(cVar.f().d());
        } else if (l.a(returnType, Boolean.TYPE) || l.a(returnType, Boolean.class)) {
            return Boolean.valueOf(cVar.f().e());
        } else {
            return cVar.f().c();
        }
    }

    private static boolean b(Object obj, c cVar) {
        h.k.c cVar2;
        if (!(obj instanceof Map)) {
            return false;
        }
        if (cVar != null) {
            cVar2 = ab.a(cVar.c());
        } else {
            cVar2 = null;
        }
        if (!l.a(cVar2, ab.a(XBaseModel.a.class))) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: java.util.HashMap<java.lang.String, java.lang.Object> */
    /* JADX WARN: Multi-variable type inference failed */
    private static HashMap<String, p<Method, c>> c(Class<? extends XBaseModel> cls, HashMap<String, Object> hashMap) {
        Method[] declaredMethods;
        if (cls == null || (declaredMethods = cls.getDeclaredMethods()) == null) {
            throw new com.bytedance.sdk.xbridge.registry.core.b.a("class is null.");
        }
        HashMap<String, p<Method, c>> hashMap2 = new HashMap<>();
        for (Method method : declaredMethods) {
            c cVar = (c) method.getAnnotation(c.class);
            if (cVar != null) {
                String b2 = cVar.b();
                l.a((Object) method, "");
                hashMap2.put(b2, new p<>(method, cVar));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, p<Method, c>> entry : hashMap2.entrySet()) {
            if (hashMap.get(entry.getKey()) == null && entry.getValue().getSecond().f().a() != DefaultType.NONE) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            hashMap.put(entry2.getKey(), a((Method) ((p) entry2.getValue()).getFirst(), (c) ((p) entry2.getValue()).getSecond()));
        }
        a(hashMap2, hashMap);
        return hashMap2;
    }

    public final HashMap<String, Object> a(Class<? extends XBaseModel> cls, HashMap<String, Object> hashMap) {
        Method[] declaredMethods;
        Object obj;
        if (!(cls == null || (declaredMethods = cls.getDeclaredMethods()) == null)) {
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                c cVar = (c) method.getAnnotation(c.class);
                if (cVar != null && cVar.e()) {
                    arrayList.add(method);
                }
            }
            ArrayList<Method> arrayList2 = arrayList;
            if (arrayList2 != null) {
                HashMap<String, Object> hashMap2 = new HashMap<>();
                for (Method method2 : arrayList2) {
                    c cVar2 = (c) method2.getAnnotation(c.class);
                    Object obj2 = hashMap.get(cVar2.b());
                    if (obj2 == null && cVar2.f().a() != DefaultType.NONE) {
                        l.a((Object) method2, "");
                        l.a((Object) cVar2, "");
                        hashMap.put(cVar2.b(), a(method2, cVar2));
                    }
                    String b2 = cVar2.b();
                    if (!(!l.a(ab.a(cVar2.c()), ab.a(XBaseModel.a.class))) || obj2 == null) {
                        obj = hashMap.get(cVar2.b());
                    } else {
                        Class<? extends XBaseModel> c2 = cVar2.c();
                        HashMap<String, Object> hashMap3 = ((ReadableMap) obj2).toHashMap();
                        l.a((Object) hashMap3, "");
                        obj = a(c2, hashMap3);
                    }
                    hashMap2.put(b2, obj);
                }
                return hashMap2;
            }
        }
        return null;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Class] */
    @Override // com.bytedance.sdk.xbridge.registry.core.a.a
    public final /* synthetic */ Map a(ReadableMap readableMap, Class cls) {
        ReadableMap readableMap2 = readableMap;
        l.c(readableMap2, "");
        l.c(cls, "");
        Class<? extends XBaseParamModel> a2 = h.a(cls);
        if (a2 == null) {
            return null;
        }
        HashMap<String, Object> hashMap = readableMap2.toHashMap();
        l.a((Object) hashMap, "");
        HashMap<String, p<Method, c>> c2 = c(a2, hashMap);
        LinkedHashMap linkedHashMap = new LinkedHashMap(ag.a(hashMap.size()));
        for (T t : hashMap.entrySet()) {
            Object key = t.getKey();
            p<Method, c> pVar = c2.get(t.getKey());
            linkedHashMap.put(key, a(t.getValue(), pVar != null ? pVar.getSecond() : null));
        }
        return linkedHashMap;
    }

    private static void a(HashMap<String, p<Method, c>> hashMap, HashMap<String, Object> hashMap2) {
        for (Map.Entry<String, p<Method, c>> entry : hashMap.entrySet()) {
            c second = entry.getValue().getSecond();
            Method first = entry.getValue().getFirst();
            Object obj = hashMap2.get(entry.getKey());
            if (!second.a() || obj != null) {
                Class<?> returnType = first.getReturnType();
                if (l.a(returnType, String.class)) {
                    if (obj == null) {
                        continue;
                    } else if (!(obj instanceof String)) {
                        throw new com.bytedance.sdk.xbridge.registry.core.b.a(entry.getKey() + " param has wrong declared type. except string,but " + obj.getClass());
                    }
                } else if (l.a(returnType, Number.class)) {
                    if (obj == null) {
                        continue;
                    } else if (!(obj instanceof Number)) {
                        throw new com.bytedance.sdk.xbridge.registry.core.b.a(entry.getKey() + " param has wrong declared type. except number,but " + obj.getClass());
                    }
                } else if (l.a(returnType, Boolean.class) || l.a(returnType, Boolean.TYPE)) {
                    if (obj == null) {
                        continue;
                    } else if (!(obj instanceof Boolean)) {
                        throw new com.bytedance.sdk.xbridge.registry.core.b.a(entry.getKey() + " param has wrong declared type. except boolean,but " + obj.getClass());
                    }
                } else if (obj == null) {
                    continue;
                }
                if (second.d()) {
                    Class<?> returnType2 = first.getReturnType();
                    if (l.a(returnType2, String.class)) {
                        String[] a2 = ((e) first.getAnnotation(e.class)).a();
                        if (!i.a(a2, obj)) {
                            throw new com.bytedance.sdk.xbridge.registry.core.b.a(entry.getKey() + " has wrong type.should be one of " + i.a(a2) + " but got " + obj);
                        }
                    } else if (l.a(returnType2, Number.class)) {
                        int[] a3 = ((b) first.getAnnotation(b.class)).a();
                        if (!i.a(a3, a(obj))) {
                            throw new com.bytedance.sdk.xbridge.registry.core.b.a(entry.getKey() + " has wrong value.should be one of " + i.a(a3) + " but got " + obj);
                        }
                    } else if (!l.a(returnType2, Map.class)) {
                        continue;
                    } else {
                        e eVar = (e) first.getAnnotation(e.class);
                        if (eVar != null) {
                            String[] a4 = eVar.a();
                            Map map = (Map) obj;
                            if (!map.isEmpty()) {
                                for (Map.Entry entry2 : map.entrySet()) {
                                    if (!i.a(a4, entry2.getValue())) {
                                        throw new com.bytedance.sdk.xbridge.registry.core.b.a(entry.getKey() + " has wrong type.should be one of " + i.a(a4) + " but got " + obj);
                                    }
                                }
                                continue;
                            } else {
                                continue;
                            }
                        } else {
                            b bVar = (b) first.getAnnotation(b.class);
                            if (bVar != null) {
                                int[] a5 = bVar.a();
                                Map map2 = (Map) obj;
                                if (!map2.isEmpty()) {
                                    for (Map.Entry entry3 : map2.entrySet()) {
                                        if (!i.a(a5, a(entry3.getValue()))) {
                                            throw new com.bytedance.sdk.xbridge.registry.core.b.a(entry.getKey() + " has wrong value.should be one of " + i.a(a5) + " but got " + obj);
                                        }
                                    }
                                    continue;
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                } else {
                    continue;
                }
            } else {
                throw new com.bytedance.sdk.xbridge.registry.core.b.a(entry.getKey() + " param is missing from input");
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.bytedance.sdk.xbridge.registry.core_api.c.a$a  reason: collision with other inner class name */
    public static final class C1075a implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f44067a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Class f44068b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ HashMap f44069c;

        static {
            Covode.recordClassIndex(26931);
        }

        C1075a(a aVar, Class cls, HashMap hashMap) {
            this.f44067a = aVar;
            this.f44068b = cls;
            this.f44069c = hashMap;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            l.a((Object) method, "");
            if (l.a((Object) method.getName(), (Object) "toJSON")) {
                return new JSONObject(this.f44067a.a(this.f44068b, this.f44069c));
            }
            c cVar = (c) method.getAnnotation(c.class);
            return this.f44067a.a(this.f44069c.get(cVar.b()), cVar);
        }
    }
}
