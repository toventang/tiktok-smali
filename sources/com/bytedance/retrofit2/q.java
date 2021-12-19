package com.bytedance.retrofit2;

import android.os.SystemClock;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.retrofit2.a;
import com.bytedance.retrofit2.b.ac;
import com.bytedance.retrofit2.b.ad;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.g;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.i;
import com.bytedance.retrofit2.b.j;
import com.bytedance.retrofit2.b.n;
import com.bytedance.retrofit2.b.r;
import com.bytedance.retrofit2.b.s;
import com.bytedance.retrofit2.b.u;
import com.bytedance.retrofit2.b.y;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.client.a;
import com.bytedance.retrofit2.e;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import l.b.b;
import l.b.f;
import l.b.k;
import l.b.l;
import l.b.m;
import l.b.o;
import l.b.p;
import l.b.w;

public final class q {

    /* renamed from: h  reason: collision with root package name */
    public static volatile CopyOnWriteArrayList<com.bytedance.retrofit2.c.a> f42565h;

    /* renamed from: a  reason: collision with root package name */
    public final a.AbstractC1037a f42566a;

    /* renamed from: b  reason: collision with root package name */
    public final g f42567b;

    /* renamed from: c  reason: collision with root package name */
    public final List<e.a> f42568c;

    /* renamed from: d  reason: collision with root package name */
    public final List<c.a> f42569d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f42570e;

    /* renamed from: f  reason: collision with root package name */
    public final Executor f42571f;

    /* renamed from: g  reason: collision with root package name */
    public final List<com.bytedance.retrofit2.c.a> f42572g;

    /* renamed from: i  reason: collision with root package name */
    public final com.bytedance.retrofit2.a.a f42573i;

    /* renamed from: j  reason: collision with root package name */
    private final Map<Method, t> f42574j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f42575k;

    static {
        Covode.recordClassIndex(26086);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public com.bytedance.retrofit2.a.a f42579a;

        /* renamed from: b  reason: collision with root package name */
        private p f42580b;

        /* renamed from: c  reason: collision with root package name */
        private a.AbstractC1037a f42581c;

        /* renamed from: d  reason: collision with root package name */
        private g f42582d;

        /* renamed from: e  reason: collision with root package name */
        private List<com.bytedance.retrofit2.c.a> f42583e;

        /* renamed from: f  reason: collision with root package name */
        private List<e.a> f42584f;

        /* renamed from: g  reason: collision with root package name */
        private List<c.a> f42585g;

        /* renamed from: h  reason: collision with root package name */
        private Executor f42586h;

        /* renamed from: i  reason: collision with root package name */
        private Executor f42587i;

        /* renamed from: j  reason: collision with root package name */
        private boolean f42588j;

        static {
            Covode.recordClassIndex(26088);
        }

        public a() {
            this(p.f42560a);
        }

        public final q a() {
            if (this.f42582d == null) {
                throw new IllegalStateException("Endpoint may not be null.");
            } else if (this.f42581c == null) {
                throw new IllegalStateException("ClientProvider may not be null.");
            } else if (this.f42586h != null) {
                Executor executor = this.f42587i;
                if (executor == null) {
                    executor = this.f42580b.a();
                }
                ArrayList arrayList = new ArrayList(this.f42585g);
                arrayList.add(this.f42580b.a(executor));
                ArrayList arrayList2 = new ArrayList(this.f42584f);
                if (q.f42565h != null) {
                    Iterator<com.bytedance.retrofit2.c.a> it = q.f42565h.iterator();
                    while (it.hasNext()) {
                        com.bytedance.retrofit2.c.a next = it.next();
                        if (!this.f42583e.contains(next)) {
                            this.f42583e.add(next);
                        }
                    }
                }
                return new q(this.f42582d, this.f42581c, this.f42583e, arrayList2, arrayList, this.f42586h, executor, this.f42588j);
            } else {
                throw new IllegalStateException("HttpExecutor may not be null.");
            }
        }

        private a b(a.AbstractC1037a aVar) {
            this.f42581c = (a.AbstractC1037a) w.a(aVar, "provider == null");
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<com.bytedance.retrofit2.c$a> */
        /* JADX WARN: Multi-variable type inference failed */
        public final a a(c.a aVar) {
            this.f42585g.add(w.a(aVar, "factory == null"));
            return this;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.util.List<com.bytedance.retrofit2.c.a> */
        /* JADX WARN: Multi-variable type inference failed */
        public final a a(com.bytedance.retrofit2.c.a aVar) {
            this.f42583e.add(w.a(aVar, "interceptor == null"));
            return this;
        }

        private a(p pVar) {
            this.f42583e = new CopyOnWriteArrayList();
            this.f42584f = new ArrayList();
            this.f42585g = new ArrayList();
            this.f42580b = pVar;
            this.f42584f.add(new a());
        }

        public final a a(a.AbstractC1037a aVar) {
            return b((a.AbstractC1037a) w.a(aVar, "provider == null"));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<com.bytedance.retrofit2.e$a> */
        /* JADX WARN: Multi-variable type inference failed */
        public final a a(e.a aVar) {
            this.f42584f.add(w.a(aVar, "factory == null"));
            return this;
        }

        public final a a(String str) {
            if (str == null || str.trim().length() == 0) {
                throw new NullPointerException("Endpoint may not be blank.");
            }
            this.f42582d = h.a(str);
            return this;
        }

        public final a a(Executor executor) {
            this.f42586h = (Executor) w.a(executor, "httpExecutor == null");
            return this;
        }
    }

    private void b(Class<?> cls) {
        for (Method method : cls.getDeclaredMethods()) {
            a(method);
        }
    }

    public final <T> T a(final Class<T> cls) {
        w.a((Class) cls);
        if (this.f42575k) {
            b(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            /* class com.bytedance.retrofit2.q.AnonymousClass1 */

            /* renamed from: c  reason: collision with root package name */
            private final p f42578c = p.f42560a;

            static {
                Covode.recordClassIndex(26087);
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object... objArr) {
                s sVar = new s();
                sVar.f42595f = System.currentTimeMillis();
                if (method.getDeclaringClass() == Object.class) {
                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{this, objArr}, 110000, "java.lang.Object", true, "com_bytedance_retrofit2_Retrofit$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        return a2.second;
                    }
                    Object invoke = method.invoke(this, objArr);
                    com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{this, objArr}, "com_bytedance_retrofit2_Retrofit$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                }
                sVar.f42601l = SystemClock.uptimeMillis();
                t a3 = q.this.a(method);
                sVar.f42602m = SystemClock.uptimeMillis();
                a3.p = sVar;
                return a3.f42606d.a(new SsHttpCall(a3, objArr));
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final t a(Method method) {
        t tVar;
        MethodCollector.i(2806);
        t tVar2 = this.f42574j.get(method);
        if (tVar2 != null) {
            MethodCollector.o(2806);
            return tVar2;
        }
        synchronized (this.f42574j) {
            try {
                tVar = this.f42574j.get(method);
                if (tVar == null) {
                    t.a aVar = new t.a(this, method);
                    aVar.G = aVar.a();
                    aVar.n = aVar.G.a();
                    if (aVar.n != com.bytedance.retrofit2.client.c.class) {
                        aVar.F = aVar.b();
                        Annotation[] annotationArr = aVar.f42618c;
                        for (Annotation annotation : annotationArr) {
                            if (annotation instanceof com.bytedance.retrofit2.b.c) {
                                aVar.a(com.bytedance.d.a.a.a.a.a.f28514d, ((com.bytedance.retrofit2.b.c) annotation).a(), false);
                            } else if (annotation instanceof h) {
                                aVar.a("GET", ((h) annotation).a(), false);
                            } else if (annotation instanceof i) {
                                aVar.a("HEAD", ((i) annotation).a(), false);
                                if (!Void.class.equals(aVar.n)) {
                                    RuntimeException a2 = aVar.a((Throwable) null, "HEAD method must use Void as response type.", new Object[0]);
                                    MethodCollector.o(2806);
                                    throw a2;
                                }
                            } else if (annotation instanceof s) {
                                aVar.a("PATCH", ((s) annotation).a(), true);
                            } else if (annotation instanceof com.bytedance.retrofit2.b.t) {
                                aVar.a("POST", ((com.bytedance.retrofit2.b.t) annotation).a(), true);
                            } else if (annotation instanceof u) {
                                aVar.a(com.bytedance.d.a.a.a.a.a.f28513c, ((u) annotation).a(), true);
                            } else if (annotation instanceof r) {
                                aVar.a(com.bytedance.d.a.a.a.a.a.f28515e, ((r) annotation).a(), false);
                            } else if (annotation instanceof j) {
                                j jVar = (j) annotation;
                                aVar.a(jVar.a(), jVar.b(), jVar.c());
                            } else if (annotation instanceof n) {
                                String[] a3 = ((n) annotation).a();
                                if (a3.length != 0) {
                                    aVar.A = aVar.a(a3);
                                } else {
                                    RuntimeException a4 = aVar.a((Throwable) null, "@Headers annotation is empty.", new Object[0]);
                                    MethodCollector.o(2806);
                                    throw a4;
                                }
                            } else if (annotation instanceof com.bytedance.retrofit2.b.q) {
                                if (!aVar.x) {
                                    aVar.y = true;
                                } else {
                                    RuntimeException a5 = aVar.a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                                    MethodCollector.o(2806);
                                    throw a5;
                                }
                            } else if (annotation instanceof g) {
                                if (!aVar.y) {
                                    aVar.x = true;
                                } else {
                                    RuntimeException a6 = aVar.a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                                    MethodCollector.o(2806);
                                    throw a6;
                                }
                            } else if (annotation instanceof ae) {
                                aVar.f42623h = true;
                            } else if (annotation instanceof y) {
                                aVar.f42621f = ((y) annotation).a();
                            } else if (annotation instanceof ad) {
                                aVar.f42622g = ((ad) annotation).a();
                            } else if (annotation instanceof ac) {
                                aVar.f42628m = ((ac) annotation).a();
                            }
                            if (p.f42561b) {
                                if (annotation instanceof b) {
                                    aVar.a(com.bytedance.d.a.a.a.a.a.f28514d, ((b) annotation).a(), false);
                                } else if (annotation instanceof f) {
                                    aVar.a("GET", ((f) annotation).a(), false);
                                } else if (annotation instanceof l.b.g) {
                                    aVar.a("HEAD", ((l.b.g) annotation).a(), false);
                                    if (!Void.class.equals(aVar.n)) {
                                        RuntimeException a7 = aVar.a((Throwable) null, "HEAD method must use Void as response type.", new Object[0]);
                                        MethodCollector.o(2806);
                                        throw a7;
                                    }
                                } else if (annotation instanceof l.b.n) {
                                    aVar.a("PATCH", ((l.b.n) annotation).a(), true);
                                } else if (annotation instanceof o) {
                                    aVar.a("POST", ((o) annotation).a(), true);
                                } else if (annotation instanceof p) {
                                    aVar.a(com.bytedance.d.a.a.a.a.a.f28513c, ((p) annotation).a(), true);
                                } else if (annotation instanceof m) {
                                    aVar.a(com.bytedance.d.a.a.a.a.a.f28515e, ((m) annotation).a(), false);
                                } else if (annotation instanceof l.b.h) {
                                    l.b.h hVar = (l.b.h) annotation;
                                    aVar.a(hVar.a(), hVar.b(), hVar.c());
                                } else if (annotation instanceof k) {
                                    String[] a8 = ((k) annotation).a();
                                    if (a8.length != 0) {
                                        aVar.A = aVar.a(a8);
                                    } else {
                                        RuntimeException a9 = aVar.a((Throwable) null, "@Headers annotation is empty.", new Object[0]);
                                        MethodCollector.o(2806);
                                        throw a9;
                                    }
                                } else if (annotation instanceof l) {
                                    if (!aVar.x) {
                                        aVar.y = true;
                                    } else {
                                        RuntimeException a10 = aVar.a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                                        MethodCollector.o(2806);
                                        throw a10;
                                    }
                                } else if (annotation instanceof l.b.e) {
                                    if (!aVar.y) {
                                        aVar.x = true;
                                    } else {
                                        RuntimeException a11 = aVar.a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                                        MethodCollector.o(2806);
                                        throw a11;
                                    }
                                } else if (annotation instanceof w) {
                                    aVar.f42623h = true;
                                }
                            }
                        }
                        if (aVar.v != null) {
                            if (!aVar.w && !aVar.f42626k) {
                                if (aVar.y) {
                                    RuntimeException a12 = aVar.a((Throwable) null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                                    MethodCollector.o(2806);
                                    throw a12;
                                } else if (aVar.x) {
                                    RuntimeException a13 = aVar.a((Throwable) null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                                    MethodCollector.o(2806);
                                    throw a13;
                                }
                            }
                            int length = aVar.f42619d.length;
                            aVar.E = new o[length];
                            for (int i2 = 0; i2 < length; i2++) {
                                Type type = aVar.f42620e[i2];
                                if (!w.d(type)) {
                                    Annotation[] annotationArr2 = aVar.f42619d[i2];
                                    if (annotationArr2 != null) {
                                        aVar.E[i2] = aVar.a(i2, type, annotationArr2);
                                    } else {
                                        RuntimeException a14 = aVar.a(i2, "No Retrofit annotation found.", new Object[0]);
                                        MethodCollector.o(2806);
                                        throw a14;
                                    }
                                } else {
                                    RuntimeException a15 = aVar.a(i2, "Parameter type must not include a type variable or wildcard: %s", type);
                                    MethodCollector.o(2806);
                                    throw a15;
                                }
                            }
                            if (aVar.z == null && !aVar.t) {
                                RuntimeException a16 = aVar.a((Throwable) null, "Missing either @%s URL or @Url parameter.", aVar.v);
                                MethodCollector.o(2806);
                                throw a16;
                            } else if (!aVar.x && !aVar.y && !aVar.w && !aVar.f42626k && aVar.q) {
                                RuntimeException a17 = aVar.a((Throwable) null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                                MethodCollector.o(2806);
                                throw a17;
                            } else if (aVar.x && !aVar.o) {
                                RuntimeException a18 = aVar.a((Throwable) null, "Form-encode method must contain at least one @Field.", new Object[0]);
                                MethodCollector.o(2806);
                                throw a18;
                            } else if (!aVar.y || aVar.p) {
                                tVar = new t(aVar);
                                this.f42574j.put(method, tVar);
                            } else {
                                RuntimeException a19 = aVar.a((Throwable) null, "Multipart method must contain at least one @Part.", new Object[0]);
                                MethodCollector.o(2806);
                                throw a19;
                            }
                        } else {
                            RuntimeException a20 = aVar.a((Throwable) null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                            MethodCollector.o(2806);
                            throw a20;
                        }
                    } else {
                        RuntimeException a21 = aVar.a((Throwable) null, "'" + w.a(aVar.n).getName() + "' is not a valid response body type.", new Object[0]);
                        MethodCollector.o(2806);
                        throw a21;
                    }
                }
            } finally {
                MethodCollector.o(2806);
            }
        }
        return tVar;
    }

    public final <T> e<T, Object> a(Type type, Annotation[] annotationArr) {
        w.a(type, "type == null");
        w.a(annotationArr, "annotations == null");
        int size = this.f42568c.size();
        for (int i2 = 0; i2 < size; i2++) {
            e<T, Object> eVar = (e<T, Object>) this.f42568c.get(i2).a(type);
            if (eVar != null) {
                return eVar;
            }
        }
        throw new IllegalArgumentException("Could not locate object converter");
    }

    public final <T> e<T, String> b(Type type, Annotation[] annotationArr) {
        w.a(type, "type == null");
        w.a(annotationArr, "annotations == null");
        int size = this.f42568c.size();
        for (int i2 = 0; i2 < size; i2++) {
            e<T, String> eVar = (e<T, String>) this.f42568c.get(i2).b(type);
            if (eVar != null) {
                return eVar;
            }
        }
        return a.h.f42450a;
    }

    public final <T> e<T, com.bytedance.retrofit2.client.b> c(Type type, Annotation[] annotationArr) {
        w.a(type, "type == null");
        w.a(annotationArr, "annotations == null");
        int size = this.f42568c.size();
        for (int i2 = 0; i2 < size; i2++) {
            e<T, com.bytedance.retrofit2.client.b> eVar = (e<T, com.bytedance.retrofit2.client.b>) this.f42568c.get(i2).c(type);
            if (eVar != null) {
                return eVar;
            }
        }
        throw new IllegalArgumentException("Could not locate header converter");
    }

    public final <T> e<T, TypedOutput> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return b(type, annotationArr, annotationArr2);
    }

    private <T> e<T, TypedOutput> b(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        w.a(type, "type == null");
        w.a(annotationArr, "parameterAnnotations == null");
        w.a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f42568c.indexOf(null) + 1;
        int size = this.f42568c.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            e<T, TypedOutput> eVar = (e<T, TypedOutput>) this.f42568c.get(i2).a(type, annotationArr, annotationArr2, this);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder append = new StringBuilder("Could not locate RequestBody converter for ").append(type).append(".\n");
        append.append("  Tried:");
        int size2 = this.f42568c.size();
        while (indexOf < size2) {
            append.append("\n   * ").append(this.f42568c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(append.toString());
    }

    public final c<?> a(c.a aVar, Type type, Annotation[] annotationArr) {
        w.a(type, "returnType == null");
        w.a(annotationArr, "annotations == null");
        int indexOf = this.f42569d.indexOf(aVar) + 1;
        int size = this.f42569d.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            c<?> a2 = this.f42569d.get(i2).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder append = new StringBuilder("Could not locate call adapter for ").append(type).append(".\n");
        if (aVar != null) {
            append.append("  Skipped:");
            for (int i3 = 0; i3 < indexOf; i3++) {
                append.append("\n   * ").append(this.f42569d.get(i3).getClass().getName());
            }
            append.append('\n');
        }
        append.append("  Tried:");
        int size2 = this.f42569d.size();
        while (indexOf < size2) {
            append.append("\n   * ").append(this.f42569d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(append.toString());
    }

    q(g gVar, a.AbstractC1037a aVar, List<com.bytedance.retrofit2.c.a> list, List<e.a> list2, List<c.a> list3, Executor executor, Executor executor2, boolean z) {
        this(gVar, aVar, list, list2, list3, executor, executor2, z, (byte) 0);
    }

    private q(g gVar, a.AbstractC1037a aVar, List<com.bytedance.retrofit2.c.a> list, List<e.a> list2, List<c.a> list3, Executor executor, Executor executor2, boolean z, byte b2) {
        this.f42574j = new ConcurrentHashMap();
        this.f42567b = gVar;
        this.f42566a = aVar;
        this.f42572g = list;
        this.f42568c = Collections.unmodifiableList(list2);
        this.f42569d = Collections.unmodifiableList(list3);
        this.f42571f = executor;
        this.f42570e = executor2;
        this.f42575k = z;
        this.f42573i = null;
    }
}
