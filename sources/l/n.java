package l;

import com.bytedance.covode.number.Covode;
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
import l.b.c;
import l.b.d;
import l.b.j;
import l.b.q;
import l.b.r;
import l.b.s;
import l.b.t;
import l.b.u;
import l.b.v;
import l.b.x;
import l.i;
import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;

/* access modifiers changed from: package-private */
public final class n<R, T> {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f159325a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b  reason: collision with root package name */
    static final Pattern f159326b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

    /* renamed from: c  reason: collision with root package name */
    final Call.Factory f159327c;

    /* renamed from: d  reason: collision with root package name */
    final c<R, T> f159328d;

    /* renamed from: e  reason: collision with root package name */
    final e<ResponseBody, R> f159329e;

    /* renamed from: f  reason: collision with root package name */
    private final HttpUrl f159330f;

    /* renamed from: g  reason: collision with root package name */
    private final String f159331g;

    /* renamed from: h  reason: collision with root package name */
    private final String f159332h;

    /* renamed from: i  reason: collision with root package name */
    private final Headers f159333i;

    /* renamed from: j  reason: collision with root package name */
    private final MediaType f159334j;

    /* renamed from: k  reason: collision with root package name */
    private final boolean f159335k;

    /* renamed from: l  reason: collision with root package name */
    private final boolean f159336l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f159337m;
    private final i<?>[] n;

    /* access modifiers changed from: package-private */
    public static final class a<T, R> {

        /* renamed from: a  reason: collision with root package name */
        final m f159338a;

        /* renamed from: b  reason: collision with root package name */
        final Method f159339b;

        /* renamed from: c  reason: collision with root package name */
        final Annotation[] f159340c;

        /* renamed from: d  reason: collision with root package name */
        final Annotation[][] f159341d;

        /* renamed from: e  reason: collision with root package name */
        final Type[] f159342e;

        /* renamed from: f  reason: collision with root package name */
        Type f159343f;

        /* renamed from: g  reason: collision with root package name */
        boolean f159344g;

        /* renamed from: h  reason: collision with root package name */
        boolean f159345h;

        /* renamed from: i  reason: collision with root package name */
        boolean f159346i;

        /* renamed from: j  reason: collision with root package name */
        boolean f159347j;

        /* renamed from: k  reason: collision with root package name */
        boolean f159348k;

        /* renamed from: l  reason: collision with root package name */
        boolean f159349l;

        /* renamed from: m  reason: collision with root package name */
        String f159350m;
        boolean n;
        boolean o;
        boolean p;
        String q;
        Headers r;
        MediaType s;
        Set<String> t;
        i<?>[] u;
        e<ResponseBody, T> v;
        c<T, R> w;

        static {
            Covode.recordClassIndex(105802);
        }

        /* access modifiers changed from: package-private */
        public final void a(String str, String str2, boolean z) {
            String str3 = this.f159350m;
            if (str3 == null) {
                this.f159350m = str;
                this.n = z;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (n.f159325a.matcher(substring).find()) {
                            throw a((Throwable) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.q = str2;
                    this.t = n.a(str2);
                    return;
                }
                return;
            }
            throw a((Throwable) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* access modifiers changed from: package-private */
        public final c<T, R> a() {
            Type genericReturnType = this.f159339b.getGenericReturnType();
            if (o.d(genericReturnType)) {
                throw a((Throwable) null, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                Annotation[] annotations = this.f159339b.getAnnotations();
                try {
                    m mVar = this.f159338a;
                    o.a(genericReturnType, "returnType == null");
                    o.a(annotations, "annotations == null");
                    int indexOf = mVar.f159311d.indexOf(null) + 1;
                    int size = mVar.f159311d.size();
                    for (int i2 = indexOf; i2 < size; i2++) {
                        c<T, R> cVar = (c<T, R>) mVar.f159311d.get(i2).a(genericReturnType);
                        if (cVar != null) {
                            return cVar;
                        }
                    }
                    StringBuilder append = new StringBuilder("Could not locate call adapter for ").append(genericReturnType).append(".\n");
                    append.append("  Tried:");
                    int size2 = mVar.f159311d.size();
                    while (indexOf < size2) {
                        append.append("\n   * ").append(mVar.f159311d.get(indexOf).getClass().getName());
                        indexOf++;
                    }
                    throw new IllegalArgumentException(append.toString());
                } catch (RuntimeException e2) {
                    throw a(e2, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw a((Throwable) null, "Service methods cannot return void.", new Object[0]);
            }
        }

        /* access modifiers changed from: package-private */
        public final e<ResponseBody, T> b() {
            Annotation[] annotations = this.f159339b.getAnnotations();
            try {
                m mVar = this.f159338a;
                Type type = this.f159343f;
                o.a(type, "type == null");
                o.a(annotations, "annotations == null");
                int indexOf = mVar.f159310c.indexOf(null) + 1;
                int size = mVar.f159310c.size();
                for (int i2 = indexOf; i2 < size; i2++) {
                    e<ResponseBody, T> eVar = (e<ResponseBody, T>) mVar.f159310c.get(i2).a(type, annotations);
                    if (eVar != null) {
                        return eVar;
                    }
                }
                StringBuilder append = new StringBuilder("Could not locate ResponseBody converter for ").append(type).append(".\n");
                append.append("  Tried:");
                int size2 = mVar.f159310c.size();
                while (indexOf < size2) {
                    append.append("\n   * ").append(mVar.f159310c.get(indexOf).getClass().getName());
                    indexOf++;
                }
                throw new IllegalArgumentException(append.toString());
            } catch (RuntimeException e2) {
                throw a(e2, "Unable to create converter for %s", this.f159343f);
            }
        }

        /* access modifiers changed from: package-private */
        public final Headers a(String[] strArr) {
            Headers.Builder builder = new Headers.Builder();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw a((Throwable) null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    MediaType parse = MediaType.parse(trim);
                    if (parse != null) {
                        this.s = parse;
                    } else {
                        throw a((Throwable) null, "Malformed content type: %s", trim);
                    }
                } else {
                    builder.add(substring, trim);
                }
            }
            return builder.build();
        }

        a(m mVar, Method method) {
            this.f159338a = mVar;
            this.f159339b = method;
            this.f159340c = method.getAnnotations();
            this.f159342e = method.getGenericParameterTypes();
            this.f159341d = method.getParameterAnnotations();
        }

        /* access modifiers changed from: package-private */
        public final RuntimeException a(int i2, String str, Object... objArr) {
            return a((Throwable) null, str + " (parameter #" + (i2 + 1) + ")", objArr);
        }

        /* access modifiers changed from: package-private */
        public final RuntimeException a(Throwable th, String str, Object... objArr) {
            return new IllegalArgumentException(com.a.a(str, objArr) + "\n    for method " + this.f159339b.getDeclaringClass().getSimpleName() + "." + this.f159339b.getName(), th);
        }

        /* access modifiers changed from: package-private */
        public final i<?> a(int i2, Type type, Annotation[] annotationArr) {
            i<?> iVar = null;
            for (Annotation annotation : annotationArr) {
                i<?> a2 = a(i2, type, annotationArr, annotation);
                if (a2 != null) {
                    if (iVar == null) {
                        iVar = a2;
                    } else {
                        throw a(i2, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (iVar != null) {
                return iVar;
            }
            throw a(i2, "No Retrofit annotation found.", new Object[0]);
        }

        private i<?> a(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof x) {
                if (this.f159349l) {
                    throw a(i2, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.f159347j) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.f159348k) {
                    throw a(i2, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.q == null) {
                    this.f159349l = true;
                    if (type == HttpUrl.class || type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new i.m();
                    }
                    throw a(i2, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw a(i2, "@Url cannot be used with @%s URL", this.f159350m);
                }
            } else if (annotation instanceof s) {
                if (this.f159348k) {
                    throw a(i2, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.f159349l) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.q != null) {
                    this.f159347j = true;
                    s sVar = (s) annotation;
                    String a2 = sVar.a();
                    if (!n.f159326b.matcher(a2).matches()) {
                        throw a(i2, "@Path parameter name must match %s. Found: %s", n.f159325a.pattern(), a2);
                    } else if (this.t.contains(a2)) {
                        return new i.h(a2, this.f159338a.a(type, annotationArr), sVar.b());
                    } else {
                        throw a(i2, "URL \"%s\" does not contain \"{%s}\".", this.q, a2);
                    }
                } else {
                    throw a(i2, "@Path can only be used with relative url on @%s", this.f159350m);
                }
            } else if (annotation instanceof t) {
                t tVar = (t) annotation;
                String a3 = tVar.a();
                boolean b2 = tVar.b();
                Class<?> a4 = o.a(type);
                this.f159348k = true;
                if (Iterable.class.isAssignableFrom(a4)) {
                    if (type instanceof ParameterizedType) {
                        return new i.C4195i(a3, this.f159338a.a(o.a(0, (ParameterizedType) type), annotationArr), b2).a();
                    }
                    throw a(i2, a4.getSimpleName() + " must include generic type (e.g., " + a4.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a4.isArray()) {
                    return new i.C4195i(a3, this.f159338a.a(type, annotationArr), b2);
                } else {
                    return new i.C4195i(a3, this.f159338a.a(n.a(a4.getComponentType()), annotationArr), b2).b();
                }
            } else if (annotation instanceof v) {
                boolean a5 = ((v) annotation).a();
                Class<?> a6 = o.a(type);
                this.f159348k = true;
                if (Iterable.class.isAssignableFrom(a6)) {
                    if (type instanceof ParameterizedType) {
                        return new i.k(this.f159338a.a(o.a(0, (ParameterizedType) type), annotationArr), a5).a();
                    }
                    throw a(i2, a6.getSimpleName() + " must include generic type (e.g., " + a6.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a6.isArray()) {
                    return new i.k(this.f159338a.a(type, annotationArr), a5);
                } else {
                    return new i.k(this.f159338a.a(n.a(a6.getComponentType()), annotationArr), a5).b();
                }
            } else if (annotation instanceof u) {
                Class<?> a7 = o.a(type);
                if (Map.class.isAssignableFrom(a7)) {
                    Type a8 = o.a(type, a7, (Class<?>) Map.class);
                    if (a8 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a8;
                        Type a9 = o.a(0, parameterizedType);
                        if (String.class == a9) {
                            return new i.j(this.f159338a.a(o.a(1, parameterizedType), annotationArr), ((u) annotation).a());
                        }
                        throw a(i2, "@QueryMap keys must be of type String: ".concat(String.valueOf(a9)), new Object[0]);
                    }
                    throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw a(i2, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof l.b.i) {
                String a10 = ((l.b.i) annotation).a();
                Class<?> a11 = o.a(type);
                if (Iterable.class.isAssignableFrom(a11)) {
                    if (type instanceof ParameterizedType) {
                        return new i.d(a10, this.f159338a.a(o.a(0, (ParameterizedType) type), annotationArr)).a();
                    }
                    throw a(i2, a11.getSimpleName() + " must include generic type (e.g., " + a11.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a11.isArray()) {
                    return new i.d(a10, this.f159338a.a(type, annotationArr));
                } else {
                    return new i.d(a10, this.f159338a.a(n.a(a11.getComponentType()), annotationArr)).b();
                }
            } else if (annotation instanceof j) {
                Class<?> a12 = o.a(type);
                if (Map.class.isAssignableFrom(a12)) {
                    Type a13 = o.a(type, a12, (Class<?>) Map.class);
                    if (a13 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) a13;
                        Type a14 = o.a(0, parameterizedType2);
                        if (String.class == a14) {
                            return new i.e(this.f159338a.a(o.a(1, parameterizedType2), annotationArr));
                        }
                        throw a(i2, "@HeaderMap keys must be of type String: ".concat(String.valueOf(a14)), new Object[0]);
                    }
                    throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw a(i2, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof c) {
                if (this.o) {
                    c cVar = (c) annotation;
                    String a15 = cVar.a();
                    boolean b3 = cVar.b();
                    this.f159344g = true;
                    Class<?> a16 = o.a(type);
                    if (Iterable.class.isAssignableFrom(a16)) {
                        if (type instanceof ParameterizedType) {
                            return new i.b(a15, this.f159338a.a(o.a(0, (ParameterizedType) type), annotationArr), b3).a();
                        }
                        throw a(i2, a16.getSimpleName() + " must include generic type (e.g., " + a16.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a16.isArray()) {
                        return new i.b(a15, this.f159338a.a(type, annotationArr), b3);
                    } else {
                        return new i.b(a15, this.f159338a.a(n.a(a16.getComponentType()), annotationArr), b3).b();
                    }
                } else {
                    throw a(i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof d) {
                if (this.o) {
                    Class<?> a17 = o.a(type);
                    if (Map.class.isAssignableFrom(a17)) {
                        Type a18 = o.a(type, a17, (Class<?>) Map.class);
                        if (a18 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a18;
                            Type a19 = o.a(0, parameterizedType3);
                            if (String.class == a19) {
                                e<T, String> a20 = this.f159338a.a(o.a(1, parameterizedType3), annotationArr);
                                this.f159344g = true;
                                return new i.c(a20, ((d) annotation).a());
                            }
                            throw a(i2, "@FieldMap keys must be of type String: ".concat(String.valueOf(a19)), new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw a(i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof q) {
                if (this.p) {
                    q qVar = (q) annotation;
                    this.f159345h = true;
                    String a21 = qVar.a();
                    Class<?> a22 = o.a(type);
                    if (!a21.isEmpty()) {
                        Headers of = Headers.of("Content-Disposition", "form-data; name=\"" + a21 + "\"", "Content-Transfer-Encoding", qVar.b());
                        if (Iterable.class.isAssignableFrom(a22)) {
                            if (type instanceof ParameterizedType) {
                                Type a23 = o.a(0, (ParameterizedType) type);
                                if (!MultipartBody.Part.class.isAssignableFrom(o.a(a23))) {
                                    return new i.f(of, this.f159338a.a(a23, annotationArr, this.f159340c)).a();
                                }
                                throw a(i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                            }
                            throw a(i2, a22.getSimpleName() + " must include generic type (e.g., " + a22.getSimpleName() + "<String>)", new Object[0]);
                        } else if (a22.isArray()) {
                            Class<?> a24 = n.a(a22.getComponentType());
                            if (!MultipartBody.Part.class.isAssignableFrom(a24)) {
                                return new i.f(of, this.f159338a.a(a24, annotationArr, this.f159340c)).b();
                            }
                            throw a(i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        } else if (!MultipartBody.Part.class.isAssignableFrom(a22)) {
                            return new i.f(of, this.f159338a.a(type, annotationArr, this.f159340c));
                        } else {
                            throw a(i2, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                    } else if (Iterable.class.isAssignableFrom(a22)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw a(i2, a22.getSimpleName() + " must include generic type (e.g., " + a22.getSimpleName() + "<String>)", new Object[0]);
                        } else if (MultipartBody.Part.class.isAssignableFrom(o.a(o.a(0, (ParameterizedType) type)))) {
                            return i.l.f159289a.a();
                        } else {
                            throw a(i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                    } else if (a22.isArray()) {
                        if (MultipartBody.Part.class.isAssignableFrom(a22.getComponentType())) {
                            return i.l.f159289a.b();
                        }
                        throw a(i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    } else if (MultipartBody.Part.class.isAssignableFrom(a22)) {
                        return i.l.f159289a;
                    } else {
                        throw a(i2, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                } else {
                    throw a(i2, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
            } else if (annotation instanceof r) {
                if (this.p) {
                    this.f159345h = true;
                    Class<?> a25 = o.a(type);
                    if (Map.class.isAssignableFrom(a25)) {
                        Type a26 = o.a(type, a25, (Class<?>) Map.class);
                        if (a26 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) a26;
                            Type a27 = o.a(0, parameterizedType4);
                            if (String.class == a27) {
                                Type a28 = o.a(1, parameterizedType4);
                                if (!MultipartBody.Part.class.isAssignableFrom(o.a(a28))) {
                                    return new i.g(this.f159338a.a(a28, annotationArr, this.f159340c), ((r) annotation).a());
                                }
                                throw a(i2, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                            }
                            throw a(i2, "@PartMap keys must be of type String: ".concat(String.valueOf(a27)), new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw a(i2, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof l.b.a)) {
                return null;
            } else {
                if (this.o || this.p) {
                    throw a(i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.f159346i) {
                    try {
                        e<T, RequestBody> a29 = this.f159338a.a(type, annotationArr, this.f159340c);
                        this.f159346i = true;
                        return new i.a(a29);
                    } catch (RuntimeException e2) {
                        throw a(e2, "Unable to create @Body converter for %s" + " (parameter #" + (i2 + 1) + ")", type);
                    }
                } else {
                    throw a(i2, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }
    }

    static {
        Covode.recordClassIndex(105801);
    }

    static Set<String> a(String str) {
        Matcher matcher = f159325a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    /* JADX DEBUG: Type inference failed for r0v2. Raw type applied. Possible types: l.c<T, R>, l.c<R, T> */
    /* JADX DEBUG: Type inference failed for r0v5. Raw type applied. Possible types: l.e<okhttp3.ResponseBody, T>, l.e<okhttp3.ResponseBody, R> */
    n(a<R, T> aVar) {
        this.f159327c = aVar.f159338a.f159308a;
        this.f159328d = (c<T, R>) aVar.w;
        this.f159330f = aVar.f159338a.f159309b;
        this.f159329e = (e<ResponseBody, T>) aVar.v;
        this.f159331g = aVar.f159350m;
        this.f159332h = aVar.q;
        this.f159333i = aVar.r;
        this.f159334j = aVar.s;
        this.f159335k = aVar.n;
        this.f159336l = aVar.o;
        this.f159337m = aVar.p;
        this.n = aVar.u;
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

    /* access modifiers changed from: package-private */
    public final Request a(Object... objArr) {
        int i2;
        k kVar = new k(this.f159331g, this.f159330f, this.f159332h, this.f159333i, this.f159334j, this.f159335k, this.f159336l, this.f159337m);
        i<?>[] iVarArr = this.n;
        if (objArr != null) {
            i2 = objArr.length;
        } else {
            i2 = 0;
        }
        if (i2 == iVarArr.length) {
            for (int i3 = 0; i3 < i2; i3++) {
                iVarArr[i3].a(kVar, objArr[i3]);
            }
            return kVar.a();
        }
        throw new IllegalArgumentException("Argument count (" + i2 + ") doesn't match expected count (" + iVarArr.length + ")");
    }
}
