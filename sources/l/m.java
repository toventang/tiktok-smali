package l;

import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import l.a;
import l.b.b;
import l.b.f;
import l.b.g;
import l.b.h;
import l.b.k;
import l.b.l;
import l.b.o;
import l.b.p;
import l.c;
import l.e;
import l.n;
import okhttp3.Call;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final Call.Factory f159308a;

    /* renamed from: b  reason: collision with root package name */
    public final HttpUrl f159309b;

    /* renamed from: c  reason: collision with root package name */
    public final List<e.a> f159310c;

    /* renamed from: d  reason: collision with root package name */
    public final List<c.a> f159311d;

    /* renamed from: e  reason: collision with root package name */
    public final Executor f159312e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f159313f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Method, n<?, ?>> f159314g = new ConcurrentHashMap();

    static {
        Covode.recordClassIndex(105798);
    }

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final j f159318a;

        /* renamed from: b  reason: collision with root package name */
        private Call.Factory f159319b;

        /* renamed from: c  reason: collision with root package name */
        private HttpUrl f159320c;

        /* renamed from: d  reason: collision with root package name */
        private final List<e.a> f159321d;

        /* renamed from: e  reason: collision with root package name */
        private final List<c.a> f159322e;

        /* renamed from: f  reason: collision with root package name */
        private Executor f159323f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f159324g;

        static {
            Covode.recordClassIndex(105800);
        }

        public a() {
            this(j.f159290a);
        }

        public final m a() {
            if (this.f159320c != null) {
                Call.Factory factory = this.f159319b;
                if (factory == null) {
                    factory = new OkHttpClient();
                }
                Executor executor = this.f159323f;
                if (executor == null) {
                    executor = this.f159318a.a();
                }
                ArrayList arrayList = new ArrayList(this.f159322e);
                arrayList.add(this.f159318a.a(executor));
                return new m(factory, this.f159320c, new ArrayList(this.f159321d), arrayList, executor, this.f159324g);
            }
            throw new IllegalStateException("Base URL required.");
        }

        private a a(Call.Factory factory) {
            this.f159319b = (Call.Factory) o.a(factory, "factory == null");
            return this;
        }

        private a(j jVar) {
            ArrayList arrayList = new ArrayList();
            this.f159321d = arrayList;
            this.f159322e = new ArrayList();
            this.f159318a = jVar;
            arrayList.add(new a());
        }

        public final a a(String str) {
            o.a(str, "baseUrl == null");
            HttpUrl parse = HttpUrl.parse(str);
            if (parse != null) {
                return a(parse);
            }
            throw new IllegalArgumentException("Illegal URL: ".concat(String.valueOf(str)));
        }

        private a a(HttpUrl httpUrl) {
            o.a(httpUrl, "baseUrl == null");
            List<String> pathSegments = httpUrl.pathSegments();
            if ("".equals(pathSegments.get(pathSegments.size() - 1))) {
                this.f159320c = httpUrl;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: ".concat(String.valueOf(httpUrl)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: java.util.List<l.e$a> */
        /* JADX WARN: Multi-variable type inference failed */
        public final a a(e.a aVar) {
            this.f159321d.add(o.a(aVar, "factory == null"));
            return this;
        }

        public final a a(OkHttpClient okHttpClient) {
            return a((Call.Factory) o.a(okHttpClient, "client == null"));
        }
    }

    private void b(Class<?> cls) {
        j jVar = j.f159290a;
        Method[] declaredMethods = cls.getDeclaredMethods();
        for (Method method : declaredMethods) {
            if (!jVar.a(method)) {
                a(method);
            }
        }
    }

    public final <T> T a(final Class<T> cls) {
        o.a((Class) cls);
        if (this.f159313f) {
            b(cls);
        }
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new InvocationHandler() {
            /* class l.m.AnonymousClass1 */

            /* renamed from: c  reason: collision with root package name */
            private final j f159317c = j.f159290a;

            static {
                Covode.recordClassIndex(105799);
            }

            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) {
                if (method.getDeclaringClass() == Object.class) {
                    Pair<Boolean, Object> a2 = com.bytedance.helios.sdk.a.a(method, new Object[]{this, objArr}, 110000, "java.lang.Object", true, "retrofit2_Retrofit$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    if (((Boolean) a2.first).booleanValue()) {
                        return a2.second;
                    }
                    Object invoke = method.invoke(this, objArr);
                    com.bytedance.helios.sdk.a.a(invoke, method, new Object[]{this, objArr}, "retrofit2_Retrofit$1_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;");
                    return invoke;
                } else if (this.f159317c.a(method)) {
                    return this.f159317c.a(method, cls, obj, objArr);
                } else {
                    n<?, ?> a3 = m.this.a(method);
                    return a3.f159328d.a(new h(a3, objArr));
                }
            }
        });
    }

    /* access modifiers changed from: package-private */
    public final n<?, ?> a(Method method) {
        n<?, ?> nVar;
        MethodCollector.i(5418);
        n<?, ?> nVar2 = this.f159314g.get(method);
        if (nVar2 != null) {
            MethodCollector.o(5418);
            return nVar2;
        }
        synchronized (this.f159314g) {
            try {
                nVar = this.f159314g.get(method);
                if (nVar == null) {
                    n.a aVar = new n.a(this, method);
                    aVar.w = aVar.a();
                    aVar.f159343f = aVar.w.a();
                    if (aVar.f159343f == l.class || aVar.f159343f == Response.class) {
                        RuntimeException a2 = aVar.a((Throwable) null, "'" + o.a(aVar.f159343f).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                        MethodCollector.o(5418);
                        throw a2;
                    }
                    aVar.v = aVar.b();
                    Annotation[] annotationArr = aVar.f159340c;
                    for (Annotation annotation : annotationArr) {
                        if (annotation instanceof b) {
                            aVar.a(com.bytedance.d.a.a.a.a.a.f28514d, ((b) annotation).a(), false);
                        } else if (annotation instanceof f) {
                            aVar.a("GET", ((f) annotation).a(), false);
                        } else if (annotation instanceof g) {
                            aVar.a("HEAD", ((g) annotation).a(), false);
                            if (!Void.class.equals(aVar.f159343f)) {
                                RuntimeException a3 = aVar.a((Throwable) null, "HEAD method must use Void as response type.", new Object[0]);
                                MethodCollector.o(5418);
                                throw a3;
                            }
                        } else if (annotation instanceof l.b.n) {
                            aVar.a("PATCH", ((l.b.n) annotation).a(), true);
                        } else if (annotation instanceof o) {
                            aVar.a("POST", ((o) annotation).a(), true);
                        } else if (annotation instanceof p) {
                            aVar.a(com.bytedance.d.a.a.a.a.a.f28513c, ((p) annotation).a(), true);
                        } else if (annotation instanceof l.b.m) {
                            aVar.a(com.bytedance.d.a.a.a.a.a.f28515e, ((l.b.m) annotation).a(), false);
                        } else if (annotation instanceof h) {
                            h hVar = (h) annotation;
                            aVar.a(hVar.a(), hVar.b(), hVar.c());
                        } else if (annotation instanceof k) {
                            String[] a4 = ((k) annotation).a();
                            if (a4.length != 0) {
                                aVar.r = aVar.a(a4);
                            } else {
                                RuntimeException a5 = aVar.a((Throwable) null, "@Headers annotation is empty.", new Object[0]);
                                MethodCollector.o(5418);
                                throw a5;
                            }
                        } else if (annotation instanceof l) {
                            if (!aVar.o) {
                                aVar.p = true;
                            } else {
                                RuntimeException a6 = aVar.a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                                MethodCollector.o(5418);
                                throw a6;
                            }
                        } else if (!(annotation instanceof l.b.e)) {
                            continue;
                        } else if (!aVar.p) {
                            aVar.o = true;
                        } else {
                            RuntimeException a7 = aVar.a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                            MethodCollector.o(5418);
                            throw a7;
                        }
                    }
                    if (aVar.f159350m != null) {
                        if (!aVar.n) {
                            if (aVar.p) {
                                RuntimeException a8 = aVar.a((Throwable) null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                                MethodCollector.o(5418);
                                throw a8;
                            } else if (aVar.o) {
                                RuntimeException a9 = aVar.a((Throwable) null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                                MethodCollector.o(5418);
                                throw a9;
                            }
                        }
                        int length = aVar.f159341d.length;
                        aVar.u = new i[length];
                        for (int i2 = 0; i2 < length; i2++) {
                            Type type = aVar.f159342e[i2];
                            if (!o.d(type)) {
                                Annotation[] annotationArr2 = aVar.f159341d[i2];
                                if (annotationArr2 != null) {
                                    aVar.u[i2] = aVar.a(i2, type, annotationArr2);
                                } else {
                                    RuntimeException a10 = aVar.a(i2, "No Retrofit annotation found.", new Object[0]);
                                    MethodCollector.o(5418);
                                    throw a10;
                                }
                            } else {
                                RuntimeException a11 = aVar.a(i2, "Parameter type must not include a type variable or wildcard: %s", type);
                                MethodCollector.o(5418);
                                throw a11;
                            }
                        }
                        if (aVar.q == null && !aVar.f159349l) {
                            RuntimeException a12 = aVar.a((Throwable) null, "Missing either @%s URL or @Url parameter.", aVar.f159350m);
                            MethodCollector.o(5418);
                            throw a12;
                        } else if (!aVar.o && !aVar.p && !aVar.n && aVar.f159346i) {
                            RuntimeException a13 = aVar.a((Throwable) null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                            MethodCollector.o(5418);
                            throw a13;
                        } else if (aVar.o && !aVar.f159344g) {
                            RuntimeException a14 = aVar.a((Throwable) null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                            MethodCollector.o(5418);
                            throw a14;
                        } else if (!aVar.p || aVar.f159345h) {
                            nVar = new n<>(aVar);
                            this.f159314g.put(method, nVar);
                        } else {
                            RuntimeException a15 = aVar.a((Throwable) null, "Multipart method must contain at least one @Part.", new Object[0]);
                            MethodCollector.o(5418);
                            throw a15;
                        }
                    } else {
                        RuntimeException a16 = aVar.a((Throwable) null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                        MethodCollector.o(5418);
                        throw a16;
                    }
                }
            } finally {
                MethodCollector.o(5418);
            }
        }
        return nVar;
    }

    public final <T> e<T, String> a(Type type, Annotation[] annotationArr) {
        o.a(type, "type == null");
        o.a(annotationArr, "annotations == null");
        int size = this.f159310c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f159310c.get(i2);
        }
        return a.d.f159235a;
    }

    public final <T> e<T, RequestBody> a(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        o.a(type, "type == null");
        o.a(annotationArr, "parameterAnnotations == null");
        o.a(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f159310c.indexOf(null) + 1;
        int size = this.f159310c.size();
        for (int i2 = indexOf; i2 < size; i2++) {
            e<T, RequestBody> eVar = (e<T, RequestBody>) this.f159310c.get(i2).a(type);
            if (eVar != null) {
                return eVar;
            }
        }
        StringBuilder append = new StringBuilder("Could not locate RequestBody converter for ").append(type).append(".\n");
        append.append("  Tried:");
        int size2 = this.f159310c.size();
        while (indexOf < size2) {
            append.append("\n   * ").append(this.f159310c.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(append.toString());
    }

    m(Call.Factory factory, HttpUrl httpUrl, List<e.a> list, List<c.a> list2, Executor executor, boolean z) {
        this.f159308a = factory;
        this.f159309b = httpUrl;
        this.f159310c = Collections.unmodifiableList(list);
        this.f159311d = Collections.unmodifiableList(list2);
        this.f159312e = executor;
        this.f159313f = z;
    }
}
