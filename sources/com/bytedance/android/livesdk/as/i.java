package com.bytedance.android.livesdk.as;

import com.bytedance.android.livesdk.as.g;
import com.bytedance.covode.number.Covode;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ad;
import com.bytedance.retrofit2.b.ae;
import com.bytedance.retrofit2.b.af;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.h;
import com.bytedance.retrofit2.b.j;
import com.bytedance.retrofit2.b.k;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.m;
import com.bytedance.retrofit2.b.n;
import com.bytedance.retrofit2.b.o;
import com.bytedance.retrofit2.b.p;
import com.bytedance.retrofit2.b.r;
import com.bytedance.retrofit2.b.s;
import com.bytedance.retrofit2.b.u;
import com.bytedance.retrofit2.b.v;
import com.bytedance.retrofit2.b.w;
import com.bytedance.retrofit2.b.x;
import com.bytedance.retrofit2.b.y;
import com.bytedance.retrofit2.b.z;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.g;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.q;
import f.a.ab;
import f.a.t;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import okhttp3.RequestBody;

/* access modifiers changed from: package-private */
public final class i<T> {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f14091a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b  reason: collision with root package name */
    public long f14092b;

    /* renamed from: c  reason: collision with root package name */
    final String f14093c;

    /* renamed from: d  reason: collision with root package name */
    final String f14094d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f14095e;

    /* renamed from: f  reason: collision with root package name */
    final c<?> f14096f;

    /* renamed from: g  reason: collision with root package name */
    final Type f14097g;

    /* renamed from: h  reason: collision with root package name */
    final g<?>[] f14098h;

    /* renamed from: i  reason: collision with root package name */
    final g f14099i;

    /* renamed from: j  reason: collision with root package name */
    public final b f14100j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f14101k;

    static {
        Covode.recordClassIndex(7817);
    }

    public enum b {
        Unknown,
        Observable,
        Single;

        static {
            Covode.recordClassIndex(7819);
        }
    }

    /* access modifiers changed from: package-private */
    public static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        final q f14102a;

        /* renamed from: b  reason: collision with root package name */
        final Method f14103b;

        /* renamed from: c  reason: collision with root package name */
        final Annotation[] f14104c;

        /* renamed from: d  reason: collision with root package name */
        final Annotation[][] f14105d;

        /* renamed from: e  reason: collision with root package name */
        final Type[] f14106e;

        /* renamed from: f  reason: collision with root package name */
        c<?> f14107f;

        /* renamed from: g  reason: collision with root package name */
        Type f14108g;

        /* renamed from: h  reason: collision with root package name */
        boolean f14109h;

        /* renamed from: i  reason: collision with root package name */
        boolean f14110i;

        /* renamed from: j  reason: collision with root package name */
        boolean f14111j;

        /* renamed from: k  reason: collision with root package name */
        boolean f14112k;

        /* renamed from: l  reason: collision with root package name */
        boolean f14113l;

        /* renamed from: m  reason: collision with root package name */
        boolean f14114m;
        String n;
        boolean o;
        boolean p;
        boolean q;
        String r;
        Set<String> s;
        String t;
        g<?>[] u;
        b v;
        long w = -1;

        static {
            Covode.recordClassIndex(7818);
        }

        private c<?> b() {
            b bVar;
            Type genericReturnType = this.f14103b.getGenericReturnType();
            if (l.d(genericReturnType)) {
                throw a((Throwable) null, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                Class<?> a2 = l.a(genericReturnType);
                if (a2 == t.class) {
                    bVar = b.Observable;
                } else if (a2 == ab.class) {
                    bVar = b.Single;
                } else {
                    bVar = b.Unknown;
                }
                this.v = bVar;
                if (bVar != b.Unknown) {
                    try {
                        return this.f14102a.a((c.a) null, genericReturnType, this.f14103b.getAnnotations());
                    } catch (RuntimeException e2) {
                        throw a(e2, "Unable to create call adapter for %s", genericReturnType);
                    }
                } else {
                    throw a((Throwable) null, "Uplink Service only support Observable and Single", new Object[0]);
                }
            } else {
                throw a((Throwable) null, "Service methods cannot return void.", new Object[0]);
            }
        }

        public final i a() {
            c<?> b2 = b();
            this.f14107f = b2;
            this.f14108g = b2.a();
            Annotation[] annotationArr = this.f14104c;
            for (Annotation annotation : annotationArr) {
                if (!(annotation instanceof com.bytedance.retrofit2.b.c)) {
                    if (annotation instanceof h) {
                        a("GET", ((h) annotation).a(), false);
                    } else if (annotation instanceof com.bytedance.retrofit2.b.i) {
                        throw a("HEAD", new Object[0]);
                    } else if (annotation instanceof s) {
                        throw a("PATCH", new Object[0]);
                    } else if (annotation instanceof com.bytedance.retrofit2.b.t) {
                        a("POST", ((com.bytedance.retrofit2.b.t) annotation).a(), true);
                    } else if (annotation instanceof u) {
                        throw a(com.bytedance.d.a.a.a.a.a.f28513c, new Object[0]);
                    } else if (annotation instanceof r) {
                        throw a(com.bytedance.d.a.a.a.a.a.f28515e, new Object[0]);
                    } else if (annotation instanceof j) {
                        throw a("HTTP", new Object[0]);
                    } else if (annotation instanceof n) {
                        throw a("Headers", new Object[0]);
                    } else if (annotation instanceof com.bytedance.retrofit2.b.q) {
                        throw a("Multipart", new Object[0]);
                    } else if (annotation instanceof com.bytedance.retrofit2.b.g) {
                        if (!this.q) {
                            this.p = true;
                        } else {
                            throw a((Throwable) null, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                    } else if (annotation instanceof ae) {
                        throw a("Streaming", new Object[0]);
                    } else if (annotation instanceof y) {
                        throw a("Priority", new Object[0]);
                    } else if (annotation instanceof ad) {
                        throw a("ServiceType", new Object[0]);
                    } else if (annotation instanceof com.bytedance.android.live.network.a.b) {
                        this.w = ((com.bytedance.android.live.network.a.b) annotation).a();
                    }
                } else {
                    throw a(com.bytedance.d.a.a.a.a.a.f28514d, new Object[0]);
                }
            }
            if (this.n != null) {
                if (!this.o) {
                    if (this.q) {
                        throw a((Throwable) null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    } else if (this.p) {
                        throw a((Throwable) null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f14105d.length;
                this.u = new g[length];
                for (int i2 = 0; i2 < length; i2++) {
                    Type type = this.f14106e[i2];
                    if (!l.d(type)) {
                        Annotation[] annotationArr2 = this.f14105d[i2];
                        if (annotationArr2 != null) {
                            g<?>[] gVarArr = this.u;
                            g<?> gVar = null;
                            for (Annotation annotation2 : annotationArr2) {
                                g<?> a2 = a(i2, type, annotationArr2, annotation2);
                                if (a2 != null) {
                                    if (gVar == null) {
                                        gVar = a2;
                                    } else {
                                        throw a(i2, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                    }
                                }
                            }
                            if (gVar != null) {
                                gVarArr[i2] = gVar;
                            } else {
                                throw a(i2, "No Retrofit annotation found.", new Object[0]);
                            }
                        } else {
                            throw a(i2, "No Retrofit annotation found.", new Object[0]);
                        }
                    } else {
                        throw a(i2, "Parameter type must not include a type variable or wildcard: %s", type);
                    }
                }
                if (this.r != null || this.f14114m) {
                    if (!this.p) {
                        if (!this.q && !this.o && this.f14111j) {
                            throw a((Throwable) null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                        }
                    } else if (!this.f14109h) {
                        throw a((Throwable) null, "Form-encode method must contain at least one @Field.", new Object[0]);
                    }
                    if (!this.q || this.f14110i) {
                        return new i(this);
                    }
                    throw a((Throwable) null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                throw a((Throwable) null, "Missing either @%s URL or @Url parameter.", this.n);
            }
            throw a((Throwable) null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }

        private RuntimeException a(String str, Object... objArr) {
            return a((Throwable) null, "uplink not support annotation: ".concat(String.valueOf(str)), objArr);
        }

        public a(q qVar, Method method) {
            this.f14102a = qVar;
            this.f14103b = method;
            this.f14104c = method.getAnnotations();
            this.f14106e = method.getGenericParameterTypes();
            this.f14105d = method.getParameterAnnotations();
        }

        private RuntimeException a(int i2, String str, Object... objArr) {
            return a((Throwable) null, str + " (parameter #" + (i2 + 1) + ")", objArr);
        }

        private RuntimeException a(Throwable th, String str, Object... objArr) {
            return new IllegalArgumentException(com.a.a(str, objArr) + "\n    for method " + this.f14103b.getDeclaringClass().getSimpleName() + "." + this.f14103b.getName(), th);
        }

        private void a(String str, String str2, boolean z) {
            String str3 = this.n;
            if (str3 == null) {
                this.n = str;
                this.t = i.b(str);
                this.o = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (i.f14091a.matcher(substring).find()) {
                            throw a((Throwable) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.r = str2;
                    this.s = i.a(str2);
                    return;
                }
                return;
            }
            throw a((Throwable) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        private g<?> a(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof ag) {
                if (this.f14114m) {
                    throw a(i2, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f14112k) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f14113l) {
                    throw a(i2, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.r == null) {
                    this.f14114m = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new g.f();
                    }
                    throw a(i2, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw a(i2, "@Url cannot be used with @%s URL", this.n);
                }
            } else if (annotation instanceof x) {
                throw a("Path", new Object[0]);
            } else if (annotation instanceof z) {
                z zVar = (z) annotation;
                String a2 = zVar.a();
                boolean b2 = zVar.b();
                Class<?> a3 = l.a(type);
                this.f14113l = true;
                if (Iterable.class.isAssignableFrom(a3)) {
                    if (type instanceof ParameterizedType) {
                        return new g.d(a2, this.f14102a.b(l.a(0, (ParameterizedType) type), annotationArr), b2).a();
                    }
                    throw a(i2, a3.getSimpleName() + " must include generic type (e.g., " + a3.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a3.isArray()) {
                    return new g.d(a2, this.f14102a.b(type, annotationArr), b2);
                } else {
                    return new g.d(a2, this.f14102a.b(i.a(a3.getComponentType()), annotationArr), b2).b();
                }
            } else if (annotation instanceof com.bytedance.retrofit2.b.ab) {
                throw a("QueryName", new Object[0]);
            } else if (annotation instanceof aa) {
                Class<?> a4 = l.a(type);
                if (Map.class.isAssignableFrom(a4)) {
                    Type a5 = l.a(type, a4, (Class<?>) Map.class);
                    if (a5 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a5;
                        Type a6 = l.a(0, parameterizedType);
                        if (String.class == a6) {
                            return new g.e(this.f14102a.b(l.a(1, parameterizedType), annotationArr), ((aa) annotation).a());
                        }
                        throw a(i2, "@QueryMap keys must be of type String: ".concat(String.valueOf(a6)), new Object[0]);
                    }
                    throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw a(i2, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof k) {
                throw a("Header", new Object[0]);
            } else if (annotation instanceof l) {
                throw a("HeaderList", new Object[0]);
            } else if (annotation instanceof m) {
                throw a("HeaderMap", new Object[0]);
            } else if (annotation instanceof e) {
                if (this.p) {
                    e eVar = (e) annotation;
                    String a7 = eVar.a();
                    boolean b3 = eVar.b();
                    this.f14109h = true;
                    Class<?> a8 = l.a(type);
                    if (Iterable.class.isAssignableFrom(a8)) {
                        if (type instanceof ParameterizedType) {
                            return new g.b(a7, this.f14102a.b(l.a(0, (ParameterizedType) type), annotationArr), b3).a();
                        }
                        throw a(i2, a8.getSimpleName() + " must include generic type (e.g., " + a8.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a8.isArray()) {
                        return new g.b(a7, this.f14102a.b(type, annotationArr), b3);
                    } else {
                        return new g.b(a7, this.f14102a.b(i.a(a8.getComponentType()), annotationArr), b3).b();
                    }
                } else {
                    throw a(i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof f) {
                if (this.p) {
                    Class<?> a9 = l.a(type);
                    if (Map.class.isAssignableFrom(a9)) {
                        Type a10 = l.a(type, a9, (Class<?>) Map.class);
                        if (a10 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) a10;
                            Type a11 = l.a(0, parameterizedType2);
                            if (String.class == a11) {
                                com.bytedance.retrofit2.e<T, String> b4 = this.f14102a.b(l.a(1, parameterizedType2), annotationArr);
                                this.f14109h = true;
                                return new g.c(b4, ((f) annotation).a());
                            }
                            throw a(i2, "@FieldMap keys must be of type String: ".concat(String.valueOf(a11)), new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw a(i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof v) {
                throw a("Part", new Object[0]);
            } else if (annotation instanceof w) {
                throw a("PartMap", new Object[0]);
            } else if (annotation instanceof com.bytedance.retrofit2.b.b) {
                if (this.p || this.q) {
                    throw a(i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (this.f14111j) {
                    throw a(i2, "Multiple @Body method annotations found.", new Object[0]);
                } else if (!RequestBody.class.isAssignableFrom(l.a(type))) {
                    try {
                        com.bytedance.retrofit2.e<T, TypedOutput> a12 = this.f14102a.a(type, annotationArr, this.f14104c);
                        this.f14111j = true;
                        return new g.a(a12);
                    } catch (RuntimeException e2) {
                        throw a(e2, "Unable to create @Body converter for %s" + " (parameter #" + (i2 + 1) + ")", type);
                    }
                } else {
                    throw a((Throwable) null, "uplink not support RequestBody", new Object[0]);
                }
            } else if (annotation instanceof p) {
                throw a("Method", new Object[0]);
            } else if (annotation instanceof o) {
                throw a("MaxLength", new Object[0]);
            } else if (annotation instanceof com.bytedance.retrofit2.b.a) {
                throw a("AddCommonParam", new Object[0]);
            } else if (annotation instanceof d) {
                throw a("ExtraInfo", new Object[0]);
            } else if (annotation instanceof com.bytedance.retrofit2.b.a.a) {
                throw a("QueryObject", new Object[0]);
            } else if (annotation instanceof af) {
                throw a("Tag", new Object[0]);
            } else {
                throw a(annotation.toString(), new Object[0]);
            }
        }
    }

    static Set<String> a(String str) {
        Matcher matcher = f14091a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    static String b(String str) {
        Matcher matcher = f14091a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    i(a<T> aVar) {
        this.f14092b = aVar.w;
        this.f14093c = aVar.n;
        this.f14094d = aVar.r;
        this.f14101k = aVar.o;
        this.f14095e = aVar.p;
        this.f14096f = aVar.f14107f;
        this.f14097g = aVar.f14108g;
        this.f14098h = aVar.u;
        this.f14099i = aVar.f14102a.f42567b;
        this.f14100j = aVar.v;
    }

    static Class<?> a(Class<?> cls) {
        if (Boolean.TYPE == cls) {
            return Boolean.class;
        }
        if (Byte.TYPE == cls) {
            return Byte.class;
        }
        if (Character.TYPE == cls) {
            return Character.class;
        }
        if (Double.TYPE == cls) {
            return Double.class;
        }
        if (Float.TYPE == cls) {
            return Float.class;
        }
        if (Integer.TYPE == cls) {
            return Integer.class;
        }
        if (Long.TYPE == cls) {
            return Long.class;
        }
        if (Short.TYPE == cls) {
            return Short.class;
        }
        return cls;
    }
}
