package com.bytedance.sdk.xbridge.registry.core_api.c;

import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.xbridge.registry.core.annotation.DefaultType;
import com.bytedance.sdk.xbridge.registry.core.annotation.e;
import com.bytedance.sdk.xbridge.registry.core.h;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import h.a.i;
import h.f.b.ab;
import h.f.b.l;
import h.f.b.m;
import h.p;
import h.w;
import h.z;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c implements com.bytedance.sdk.xbridge.registry.core.a.a<JSONObject> {
    static {
        Covode.recordClassIndex(26933);
    }

    public static int a(Object obj) {
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        if (obj == null) {
            throw new com.bytedance.sdk.xbridge.registry.core.b.a("the key is null");
        }
        throw new com.bytedance.sdk.xbridge.registry.core.b.a("the key is not a number");
    }

    /* access modifiers changed from: package-private */
    public static final class a extends m implements h.f.a.b<p<? extends String, ? extends Object>, z> {
        final /* synthetic */ Map.Entry $it;
        final /* synthetic */ int[] $option;
        final /* synthetic */ JSONObject $params$inlined;
        final /* synthetic */ Object $value;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(26934);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(int[] iArr, Map.Entry entry, Object obj, c cVar, JSONObject jSONObject) {
            super(1);
            this.$option = iArr;
            this.$it = entry;
            this.$value = obj;
            this.this$0 = cVar;
            this.$params$inlined = jSONObject;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p<? extends String, ? extends Object> pVar) {
            p<? extends String, ? extends Object> pVar2 = pVar;
            l.c(pVar2, "");
            if (i.a(this.$option, c.a(pVar2.getSecond()))) {
                return z.f158842a;
            }
            throw new com.bytedance.sdk.xbridge.registry.core.b.a(((String) this.$it.getKey()) + " has wrong value.should be one of " + i.a(this.$option) + " but got " + this.$value);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends m implements h.f.a.b<p<? extends String, ? extends Object>, z> {
        final /* synthetic */ Map.Entry $it;
        final /* synthetic */ String[] $option;
        final /* synthetic */ Object $value;

        static {
            Covode.recordClassIndex(26935);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(String[] strArr, Map.Entry entry, Object obj) {
            super(1);
            this.$option = strArr;
            this.$it = entry;
            this.$value = obj;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(p<? extends String, ? extends Object> pVar) {
            p<? extends String, ? extends Object> pVar2 = pVar;
            l.c(pVar2, "");
            if (i.a(this.$option, pVar2.getSecond())) {
                return z.f158842a;
            }
            throw new com.bytedance.sdk.xbridge.registry.core.b.a(((String) this.$it.getKey()) + " has wrong value.should be one of " + i.a(this.$option) + " but got " + this.$value);
        }
    }

    /* renamed from: com.bytedance.sdk.xbridge.registry.core_api.c.c$c  reason: collision with other inner class name */
    static final class C1076c extends m implements h.f.a.b<p<? extends String, ? extends Object>, Object> {
        final /* synthetic */ HashMap $classMap;
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(26936);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C1076c(c cVar, HashMap hashMap) {
            super(1);
            this.this$0 = cVar;
            this.$classMap = hashMap;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ Object invoke(p<? extends String, ? extends Object> pVar) {
            Class<?> cls;
            com.bytedance.sdk.xbridge.registry.core.annotation.c cVar;
            Method method;
            p<? extends String, ? extends Object> pVar2 = pVar;
            l.c(pVar2, "");
            p pVar3 = (p) this.$classMap.get(pVar2.getFirst());
            Class<? extends XBaseModel> cls2 = null;
            if (pVar3 == null || (method = (Method) pVar3.getFirst()) == null) {
                cls = null;
            } else {
                cls = method.getReturnType();
            }
            if (!(pVar2.getSecond() instanceof JSONObject) || !(!l.a(cls, Map.class)) || !(!l.a(cls, Object.class))) {
                Object second = pVar2.getSecond();
                if (second instanceof JSONArray) {
                    Object second2 = pVar2.getSecond();
                    if (second2 != null) {
                        return com.bytedance.sdk.xbridge.registry.core.c.a.a((JSONArray) second2);
                    }
                    throw new w("null cannot be cast to non-null type");
                } else if (!(second instanceof JSONObject)) {
                    return pVar2.getSecond();
                } else {
                    Object second3 = pVar2.getSecond();
                    if (second3 != null) {
                        return com.bytedance.sdk.xbridge.registry.core.c.a.a((JSONObject) second3);
                    }
                    throw new w("null cannot be cast to non-null type");
                }
            } else {
                c cVar2 = this.this$0;
                p pVar4 = (p) this.$classMap.get(pVar2.getFirst());
                if (!(pVar4 == null || (cVar = (com.bytedance.sdk.xbridge.registry.core.annotation.c) pVar4.getSecond()) == null)) {
                    cls2 = cVar.c();
                }
                Object second4 = pVar2.getSecond();
                if (second4 != null) {
                    return cVar2.a(cls2, (JSONObject) second4);
                }
                throw new w("null cannot be cast to non-null type");
            }
        }
    }

    private static <R> Map<String, R> a(JSONObject jSONObject, h.f.a.b<? super p<String, ? extends Object>, ? extends R> bVar) {
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        l.a((Object) keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            l.a((Object) next, "");
            hashMap.put(next, bVar.invoke(new p(next, jSONObject.opt(next))));
        }
        return hashMap;
    }

    public static Object a(Method method, com.bytedance.sdk.xbridge.registry.core.annotation.c cVar) {
        Class<?> returnType = method.getReturnType();
        if (l.a(returnType, Number.class)) {
            int i2 = d.f44074a[cVar.f().a().ordinal()];
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

    public final Object a(Class<? extends XBaseModel> cls, JSONObject jSONObject) {
        Method[] declaredMethods;
        if (cls == null || (declaredMethods = cls.getDeclaredMethods()) == null) {
            throw new com.bytedance.sdk.xbridge.registry.core.b.a("class is null.");
        }
        HashMap<String, p<Method, com.bytedance.sdk.xbridge.registry.core.annotation.c>> hashMap = new HashMap<>();
        for (Method method : declaredMethods) {
            com.bytedance.sdk.xbridge.registry.core.annotation.c cVar = (com.bytedance.sdk.xbridge.registry.core.annotation.c) method.getAnnotation(com.bytedance.sdk.xbridge.registry.core.annotation.c.class);
            if (cVar != null) {
                String b2 = cVar.b();
                l.a((Object) method, "");
                hashMap.put(b2, new p<>(method, cVar));
            }
        }
        a(hashMap, jSONObject);
        Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new d(this, jSONObject, cls));
        l.a(newProxyInstance, "");
        return newProxyInstance;
    }

    public final JSONObject b(Class<? extends XBaseModel> cls, JSONObject jSONObject) {
        Method[] declaredMethods;
        Object opt;
        if (!(cls == null || (declaredMethods = cls.getDeclaredMethods()) == null)) {
            ArrayList arrayList = new ArrayList();
            for (Method method : declaredMethods) {
                com.bytedance.sdk.xbridge.registry.core.annotation.c cVar = (com.bytedance.sdk.xbridge.registry.core.annotation.c) method.getAnnotation(com.bytedance.sdk.xbridge.registry.core.annotation.c.class);
                if (cVar != null && cVar.e()) {
                    arrayList.add(method);
                }
            }
            ArrayList<Method> arrayList2 = arrayList;
            if (arrayList2 != null) {
                JSONObject jSONObject2 = new JSONObject();
                for (Method method2 : arrayList2) {
                    com.bytedance.sdk.xbridge.registry.core.annotation.c cVar2 = (com.bytedance.sdk.xbridge.registry.core.annotation.c) method2.getAnnotation(com.bytedance.sdk.xbridge.registry.core.annotation.c.class);
                    Object opt2 = jSONObject.opt(cVar2.b());
                    if (opt2 == null && cVar2.f().a() != DefaultType.NONE) {
                        l.a((Object) method2, "");
                        l.a((Object) cVar2, "");
                        jSONObject.put(cVar2.b(), a(method2, cVar2));
                    }
                    String b2 = cVar2.b();
                    if (!(!l.a(ab.a(cVar2.c()), ab.a(XBaseModel.a.class))) || opt2 == null) {
                        opt = jSONObject.opt(cVar2.b());
                    } else {
                        opt = b(cVar2.c(), (JSONObject) opt2);
                    }
                    jSONObject2.put(b2, opt);
                }
                return jSONObject2;
            }
        }
        return new JSONObject();
    }

    private final void a(HashMap<String, p<Method, com.bytedance.sdk.xbridge.registry.core.annotation.c>> hashMap, JSONObject jSONObject) {
        for (Map.Entry<String, p<Method, com.bytedance.sdk.xbridge.registry.core.annotation.c>> entry : hashMap.entrySet()) {
            com.bytedance.sdk.xbridge.registry.core.annotation.c second = entry.getValue().getSecond();
            Method first = entry.getValue().getFirst();
            Object opt = jSONObject.opt(entry.getKey());
            if (second.a()) {
                if (opt == null) {
                    throw new com.bytedance.sdk.xbridge.registry.core.b.a(entry.getKey() + " param is missing from input");
                }
            } else if (opt == null) {
                continue;
            }
            if (second.d()) {
                Class<?> returnType = first.getReturnType();
                if (l.a(returnType, String.class)) {
                    String[] a2 = ((e) first.getAnnotation(e.class)).a();
                    if (!i.a(a2, opt)) {
                        throw new com.bytedance.sdk.xbridge.registry.core.b.a(entry.getKey() + " has wrong type.should be one of " + i.a(a2) + " but got " + opt);
                    }
                } else if (l.a(returnType, Number.class)) {
                    int[] a3 = ((com.bytedance.sdk.xbridge.registry.core.annotation.b) first.getAnnotation(com.bytedance.sdk.xbridge.registry.core.annotation.b.class)).a();
                    if (!i.a(a3, a(opt))) {
                        throw new com.bytedance.sdk.xbridge.registry.core.b.a(entry.getKey() + " has wrong value.should be one of " + i.a(a3) + " but got " + opt);
                    }
                } else if (l.a(returnType, Map.class)) {
                    e eVar = (e) first.getAnnotation(e.class);
                    if (eVar != null) {
                        a((JSONObject) opt, new b(eVar.a(), entry, opt));
                    } else {
                        com.bytedance.sdk.xbridge.registry.core.annotation.b bVar = (com.bytedance.sdk.xbridge.registry.core.annotation.b) first.getAnnotation(com.bytedance.sdk.xbridge.registry.core.annotation.b.class);
                        if (bVar != null) {
                            a((JSONObject) opt, new a(bVar.a(), entry, opt, this, jSONObject));
                        }
                    }
                }
            } else {
                continue;
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Class] */
    @Override // com.bytedance.sdk.xbridge.registry.core.a.a
    public final /* synthetic */ Map a(JSONObject jSONObject, Class cls) {
        JSONObject jSONObject2 = jSONObject;
        l.c(jSONObject2, "");
        l.c(cls, "");
        Class<? extends XBaseParamModel> a2 = h.a(cls);
        if (a2 == null) {
            return null;
        }
        Method[] declaredMethods = a2.getDeclaredMethods();
        l.a((Object) declaredMethods, "");
        HashMap<String, p<Method, com.bytedance.sdk.xbridge.registry.core.annotation.c>> hashMap = new HashMap<>();
        for (Method method : declaredMethods) {
            com.bytedance.sdk.xbridge.registry.core.annotation.c cVar = (com.bytedance.sdk.xbridge.registry.core.annotation.c) method.getAnnotation(com.bytedance.sdk.xbridge.registry.core.annotation.c.class);
            if (cVar != null) {
                String b2 = cVar.b();
                l.a((Object) method, "");
                hashMap.put(b2, new p<>(method, cVar));
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, p<Method, com.bytedance.sdk.xbridge.registry.core.annotation.c>> entry : hashMap.entrySet()) {
            if (!jSONObject2.has(entry.getKey()) && entry.getValue().getSecond().f().a() != DefaultType.NONE) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            jSONObject2.put((String) entry2.getKey(), a((Method) ((p) entry2.getValue()).getFirst(), (com.bytedance.sdk.xbridge.registry.core.annotation.c) ((p) entry2.getValue()).getSecond()));
        }
        a(hashMap, jSONObject2);
        return a(jSONObject2, new C1076c(this, hashMap));
    }

    /* access modifiers changed from: package-private */
    public static final class d implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f44071a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ JSONObject f44072b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Class f44073c;

        static {
            Covode.recordClassIndex(26937);
        }

        d(c cVar, JSONObject jSONObject, Class cls) {
            this.f44071a = cVar;
            this.f44072b = jSONObject;
            this.f44073c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) {
            com.bytedance.sdk.xbridge.registry.core.annotation.c cVar = (com.bytedance.sdk.xbridge.registry.core.annotation.c) method.getAnnotation(com.bytedance.sdk.xbridge.registry.core.annotation.c.class);
            if (cVar != null) {
                Object opt = this.f44072b.opt(cVar.b());
                if (opt != null || cVar.f().a() == DefaultType.NONE) {
                    boolean z = opt instanceof JSONObject;
                    if (z && (!l.a(ab.a(cVar.c()), ab.a(XBaseModel.a.class)))) {
                        return this.f44071a.a(cVar.c(), (JSONObject) opt);
                    } else if (opt instanceof JSONArray) {
                        return com.bytedance.sdk.xbridge.registry.core.c.a.a((JSONArray) opt);
                    } else {
                        if (z) {
                            return com.bytedance.sdk.xbridge.registry.core.c.a.a((JSONObject) opt);
                        }
                        return opt;
                    }
                } else {
                    l.a((Object) method, "");
                    return c.a(method, cVar);
                }
            } else {
                l.a((Object) method, "");
                if (l.a((Object) method.getName(), (Object) "toJSON")) {
                    return this.f44071a.b(this.f44073c, this.f44072b);
                }
                return z.f158842a;
            }
        }
    }
}
