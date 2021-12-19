package com.bytedance.retrofit2;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.retrofit2.b.aa;
import com.bytedance.retrofit2.b.ab;
import com.bytedance.retrofit2.b.af;
import com.bytedance.retrofit2.b.ag;
import com.bytedance.retrofit2.b.d;
import com.bytedance.retrofit2.b.e;
import com.bytedance.retrofit2.b.f;
import com.bytedance.retrofit2.b.k;
import com.bytedance.retrofit2.b.l;
import com.bytedance.retrofit2.b.m;
import com.bytedance.retrofit2.b.p;
import com.bytedance.retrofit2.b.v;
import com.bytedance.retrofit2.b.w;
import com.bytedance.retrofit2.b.x;
import com.bytedance.retrofit2.b.z;
import com.bytedance.retrofit2.c;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.client.a;
import com.bytedance.retrofit2.client.b;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.retrofit2.o;
import com.ss.android.ugc.aweme.cs.e;
import com.ss.android.ugc.aweme.cs.g;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import l.b.i;
import l.b.j;
import l.b.q;
import l.b.r;
import l.b.s;
import l.b.u;
import okhttp3.Headers;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.json.JSONObject;

/* access modifiers changed from: package-private */
public final class t<T> {

    /* renamed from: a  reason: collision with root package name */
    static final Pattern f42603a = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");

    /* renamed from: b  reason: collision with root package name */
    static final Pattern f42604b = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");
    private List<b> A;
    private String B;

    /* renamed from: c  reason: collision with root package name */
    final a.AbstractC1037a f42605c;

    /* renamed from: d  reason: collision with root package name */
    final c<?> f42606d;

    /* renamed from: e  reason: collision with root package name */
    final List<com.bytedance.retrofit2.c.a> f42607e;

    /* renamed from: f  reason: collision with root package name */
    final Executor f42608f;

    /* renamed from: g  reason: collision with root package name */
    final int f42609g;

    /* renamed from: h  reason: collision with root package name */
    final int f42610h;

    /* renamed from: i  reason: collision with root package name */
    final String f42611i;

    /* renamed from: j  reason: collision with root package name */
    final boolean f42612j;

    /* renamed from: k  reason: collision with root package name */
    final int f42613k;

    /* renamed from: l  reason: collision with root package name */
    final boolean f42614l;

    /* renamed from: m  reason: collision with root package name */
    final Object f42615m;
    final Method n;
    final com.bytedance.retrofit2.a.a o;
    public s p;
    public Object q;
    private final g r;
    private final e<TypedInput, T> s;
    private final String t;
    private final String u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final boolean y;
    private final o<?>[] z;

    /* access modifiers changed from: package-private */
    public static final class a<T> {
        List<b> A;
        String B;
        Set<String> C;
        String D;
        o<?>[] E;
        e<TypedInput, T> F;
        c<?> G;

        /* renamed from: a  reason: collision with root package name */
        final q f42616a;

        /* renamed from: b  reason: collision with root package name */
        final Method f42617b;

        /* renamed from: c  reason: collision with root package name */
        final Annotation[] f42618c;

        /* renamed from: d  reason: collision with root package name */
        final Annotation[][] f42619d;

        /* renamed from: e  reason: collision with root package name */
        final Type[] f42620e;

        /* renamed from: f  reason: collision with root package name */
        int f42621f = 1;

        /* renamed from: g  reason: collision with root package name */
        String f42622g = "";

        /* renamed from: h  reason: collision with root package name */
        boolean f42623h;

        /* renamed from: i  reason: collision with root package name */
        int f42624i = -1;

        /* renamed from: j  reason: collision with root package name */
        boolean f42625j = true;

        /* renamed from: k  reason: collision with root package name */
        boolean f42626k;

        /* renamed from: l  reason: collision with root package name */
        Object f42627l;

        /* renamed from: m  reason: collision with root package name */
        int f42628m = 3;
        Type n;
        boolean o;
        boolean p;
        boolean q;
        boolean r;
        boolean s;
        boolean t;
        boolean u;
        String v;
        boolean w;
        boolean x;
        boolean y;
        String z;

        static {
            Covode.recordClassIndex(26092);
        }

        /* access modifiers changed from: package-private */
        public final c<?> a() {
            Type genericReturnType = this.f42617b.getGenericReturnType();
            if (w.d(genericReturnType)) {
                throw a((Throwable) null, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
            } else if (genericReturnType != Void.TYPE) {
                try {
                    return this.f42616a.a((c.a) null, genericReturnType, this.f42617b.getAnnotations());
                } catch (RuntimeException e2) {
                    throw a(e2, "Unable to create call adapter for %s", genericReturnType);
                }
            } else {
                throw a((Throwable) null, "Service methods cannot return void.", new Object[0]);
            }
        }

        /* access modifiers changed from: package-private */
        public final void a(String str, String str2, boolean z2) {
            String str3 = this.v;
            if (str3 == null) {
                this.v = str;
                if (str != null) {
                    this.D = t.b(str);
                }
                if (this.D != null) {
                    this.f42626k = true;
                }
                this.w = z2;
                if (!str2.isEmpty()) {
                    int indexOf = str2.indexOf(63);
                    if (indexOf != -1 && indexOf < str2.length() - 1) {
                        String substring = str2.substring(indexOf + 1);
                        if (t.f42603a.matcher(substring).find()) {
                            throw a((Throwable) null, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                        }
                    }
                    this.z = str2;
                    this.C = t.a(str2);
                    return;
                }
                return;
            }
            throw a((Throwable) null, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        /* access modifiers changed from: package-private */
        public final List<b> a(String[] strArr) {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw a((Throwable) null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    this.B = trim;
                } else {
                    arrayList.add(new b(substring, trim));
                }
            }
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        public final o<?> a(int i2, Type type, Annotation[] annotationArr) {
            o<?> oVar = null;
            for (Annotation annotation : annotationArr) {
                o<?> a2 = a(i2, type, annotationArr, annotation);
                if (a2 != null || (p.f42561b && (a2 = b(i2, type, annotationArr, annotation)) != null)) {
                    if (oVar == null) {
                        oVar = a2;
                    } else {
                        throw a(i2, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                    }
                }
            }
            if (oVar != null) {
                return oVar;
            }
            throw a(i2, "No Retrofit annotation found.", new Object[0]);
        }

        private void a(int i2, String str) {
            if (!t.f42604b.matcher(str).matches()) {
                throw a(i2, "@Path parameter name must match %s. Found: %s", t.f42603a.pattern(), str);
            } else if (!this.C.contains(str)) {
                throw a(i2, "URL \"%s\" does not contain \"{%s}\".", this.z, str);
            }
        }

        /* access modifiers changed from: package-private */
        public final RuntimeException a(Throwable th, String str, Object... objArr) {
            return new IllegalArgumentException(com.a.a(str, objArr) + "\n    for method " + this.f42617b.getDeclaringClass().getSimpleName() + "." + this.f42617b.getName(), th);
        }

        /* access modifiers changed from: package-private */
        public final RuntimeException a(int i2, String str, Object... objArr) {
            return a((Throwable) null, str + " (parameter #" + (i2 + 1) + ")", objArr);
        }

        /* access modifiers changed from: package-private */
        public final e<TypedInput, T> b() {
            Annotation[] annotations = this.f42617b.getAnnotations();
            try {
                q qVar = this.f42616a;
                Type type = this.n;
                w.a(type, "type == null");
                w.a(annotations, "annotations == null");
                int indexOf = qVar.f42568c.indexOf(null) + 1;
                int size = qVar.f42568c.size();
                for (int i2 = indexOf; i2 < size; i2++) {
                    e<TypedInput, T> eVar = (e<TypedInput, T>) qVar.f42568c.get(i2).a(type, annotations, qVar);
                    if (eVar != null) {
                        return eVar;
                    }
                }
                StringBuilder append = new StringBuilder("Could not locate TypeInput converter for ").append(type).append(".\n");
                append.append("  Tried:");
                int size2 = qVar.f42568c.size();
                while (indexOf < size2) {
                    append.append("\n   * ").append(qVar.f42568c.get(indexOf).getClass().getName());
                    indexOf++;
                }
                throw new IllegalArgumentException(append.toString());
            } catch (RuntimeException e2) {
                throw a(e2, "Unable to create converter for %s", this.n);
            }
        }

        private static o<?> a(Type type) {
            if (RequestBody.class.isAssignableFrom(w.a(type))) {
                return o.c.f42528a;
            }
            return null;
        }

        private static o<?> a(ParameterizedType parameterizedType, Annotation annotation) {
            if (RequestBody.class.isAssignableFrom(w.a(w.a(1, parameterizedType)))) {
                return new o.e(((w) annotation).a());
            }
            return null;
        }

        public a(q qVar, Method method) {
            this.f42616a = qVar;
            this.f42617b = method;
            this.f42618c = method.getAnnotations();
            this.f42620e = method.getGenericParameterTypes();
            this.f42619d = method.getParameterAnnotations();
        }

        private static Headers a(String str, String str2) {
            return Headers.of("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", str2);
        }

        private static o<?> a(Type type, String str, String str2) {
            Class<?> a2 = w.a(type);
            if (TextUtils.isEmpty(str)) {
                if (Iterable.class.isAssignableFrom(a2)) {
                    if ((type instanceof ParameterizedType) && MultipartBody.Part.class.isAssignableFrom(w.a(w.a(0, (ParameterizedType) type)))) {
                        return o.f.f42531a.a();
                    }
                } else if (a2.isArray()) {
                    if (MultipartBody.Part.class.isAssignableFrom(a2.getComponentType())) {
                        return o.f.f42531a.b();
                    }
                } else if (MultipartBody.Part.class.isAssignableFrom(a2)) {
                    return o.f.f42531a;
                }
            } else if (Iterable.class.isAssignableFrom(a2)) {
                if ((type instanceof ParameterizedType) && RequestBody.class.isAssignableFrom(w.a(w.a(0, (ParameterizedType) type)))) {
                    return new o.d(a(str, str2)).a();
                }
            } else if (a2.isArray()) {
                if (RequestBody.class.isAssignableFrom(t.a(a2.getComponentType()))) {
                    return new o.d(a(str, str2)).b();
                }
            } else if (RequestBody.class.isAssignableFrom(a2)) {
                return new o.d(a(str, str2));
            }
            return null;
        }

        private RuntimeException a(Throwable th, int i2, String str, Object... objArr) {
            return a(th, str + " (parameter #" + (i2 + 1) + ")", objArr);
        }

        private o<?> a(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof ag) {
                if (this.t) {
                    throw a(i2, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.r) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.s) {
                    throw a(i2, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.z == null) {
                    this.t = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new o.v();
                    }
                    throw a(i2, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw a(i2, "@Url cannot be used with @%s URL", this.v);
                }
            } else if (annotation instanceof x) {
                if (this.s) {
                    throw a(i2, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.t) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.z != null) {
                    this.r = true;
                    x xVar = (x) annotation;
                    String a2 = xVar.a();
                    a(i2, a2);
                    return new o.q(a2, this.f42616a.b(type, annotationArr), xVar.b());
                } else {
                    throw a(i2, "@Path can only be used with relative url on @%s", this.v);
                }
            } else if (annotation instanceof z) {
                z zVar = (z) annotation;
                return a(i2, type, annotationArr, false, zVar.a(), zVar.b());
            } else if (annotation instanceof ab) {
                return a(i2, type, annotationArr, true, null, ((ab) annotation).a());
            } else {
                if (annotation instanceof aa) {
                    Class<?> a3 = w.a(type);
                    if (Map.class.isAssignableFrom(a3)) {
                        Type a4 = w.a(type, a3, (Class<?>) Map.class);
                        if (a4 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType = (ParameterizedType) a4;
                            Type a5 = w.a(0, parameterizedType);
                            if (String.class == a5) {
                                return new o.s(this.f42616a.b(w.a(1, parameterizedType), annotationArr), ((aa) annotation).a());
                            }
                            throw a(i2, "@QueryMap keys must be of type String: ".concat(String.valueOf(a5)), new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@QueryMap parameter type must be Map.", new Object[0]);
                } else if (annotation instanceof k) {
                    String a6 = ((k) annotation).a();
                    Class<?> a7 = w.a(type);
                    if (Iterable.class.isAssignableFrom(a7)) {
                        if (type instanceof ParameterizedType) {
                            return new o.j(a6, this.f42616a.b(w.a(0, (ParameterizedType) type), annotationArr)).a();
                        }
                        throw a(i2, a7.getSimpleName() + " must include generic type (e.g., " + a7.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a7.isArray()) {
                        return new o.j(a6, this.f42616a.b(type, annotationArr));
                    } else {
                        return new o.j(a6, this.f42616a.b(t.a(a7.getComponentType()), annotationArr)).b();
                    }
                } else if (annotation instanceof l) {
                    Class<?> a8 = w.a(type);
                    if (List.class.isAssignableFrom(a8)) {
                        Type a9 = w.a(type, a8, (Class<?>) List.class);
                        if (a9 instanceof ParameterizedType) {
                            Type a10 = w.a(0, (ParameterizedType) a9);
                            if (b.class == a10) {
                                return new o.k(this.f42616a.c(a10, annotationArr));
                            }
                            throw a(i2, "@HeaderList keys must be of type retrofit.client.Header: ".concat(String.valueOf(a10)), new Object[0]);
                        }
                        throw a(i2, "List must include generic types (e.g., List<Header>)", new Object[0]);
                    }
                    throw a(i2, "@HeaderList parameter type must be List.", new Object[0]);
                } else if (annotation instanceof m) {
                    Class<?> a11 = w.a(type);
                    if (Map.class.isAssignableFrom(a11)) {
                        Type a12 = w.a(type, a11, (Class<?>) Map.class);
                        if (a12 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType2 = (ParameterizedType) a12;
                            Type a13 = w.a(0, parameterizedType2);
                            if (String.class == a13) {
                                return new o.l(this.f42616a.b(w.a(1, parameterizedType2), annotationArr));
                            }
                            throw a(i2, "@HeaderMap keys must be of type String: ".concat(String.valueOf(a13)), new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@HeaderMap parameter type must be Map.", new Object[0]);
                } else if (annotation instanceof e) {
                    if (this.x) {
                        e eVar = (e) annotation;
                        String a14 = eVar.a();
                        boolean b2 = eVar.b();
                        this.o = true;
                        Class<?> a15 = w.a(type);
                        if (Iterable.class.isAssignableFrom(a15)) {
                            if (type instanceof ParameterizedType) {
                                return new o.h(a14, this.f42616a.b(w.a(0, (ParameterizedType) type), annotationArr), b2).a();
                            }
                            throw a(i2, a15.getSimpleName() + " must include generic type (e.g., " + a15.getSimpleName() + "<String>)", new Object[0]);
                        } else if (!a15.isArray()) {
                            return new o.h(a14, this.f42616a.b(type, annotationArr), b2);
                        } else {
                            return new o.h(a14, this.f42616a.b(t.a(a15.getComponentType()), annotationArr), b2).b();
                        }
                    } else {
                        throw a(i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                    }
                } else if (annotation instanceof f) {
                    if (this.x) {
                        Class<?> a16 = w.a(type);
                        if (Map.class.isAssignableFrom(a16)) {
                            Type a17 = w.a(type, a16, (Class<?>) Map.class);
                            if (a17 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType3 = (ParameterizedType) a17;
                                Type a18 = w.a(0, parameterizedType3);
                                if (String.class == a18) {
                                    e<T, String> b3 = this.f42616a.b(w.a(1, parameterizedType3), annotationArr);
                                    this.o = true;
                                    return new o.i(b3, ((f) annotation).a());
                                }
                                throw a(i2, "@FieldMap keys must be of type String: ".concat(String.valueOf(a18)), new Object[0]);
                            }
                            throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw a(i2, "@FieldMap parameter type must be Map.", new Object[0]);
                    }
                    throw a(i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                } else if (annotation instanceof v) {
                    if (this.y) {
                        v vVar = (v) annotation;
                        this.p = true;
                        o<?> a19 = a(type, vVar.a(), vVar.b());
                        if (a19 != null) {
                            return a19;
                        }
                        return new o.C1039o(vVar.a(), this.f42616a.a(type, annotationArr, this.f42618c));
                    }
                    throw a(i2, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                } else if (annotation instanceof w) {
                    if (this.y) {
                        this.p = true;
                        Class<?> a20 = w.a(type);
                        if (Map.class.isAssignableFrom(a20)) {
                            Type a21 = w.a(type, a20, (Class<?>) Map.class);
                            if (a21 instanceof ParameterizedType) {
                                ParameterizedType parameterizedType4 = (ParameterizedType) a21;
                                Type a22 = w.a(0, parameterizedType4);
                                if (String.class == a22) {
                                    o<?> a23 = a(parameterizedType4, annotation);
                                    if (a23 != null) {
                                        return a23;
                                    }
                                    return new o.p(this.f42616a.a(w.a(1, parameterizedType4), annotationArr, this.f42618c), ((w) annotation).a());
                                }
                                throw a(i2, "@PartMap keys must be of type String: ".concat(String.valueOf(a22)), new Object[0]);
                            }
                            throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                        }
                        throw a(i2, "@PartMap parameter type must be Map.", new Object[0]);
                    }
                    throw a(i2, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                } else if (annotation instanceof com.bytedance.retrofit2.b.b) {
                    if (this.x || this.y) {
                        throw a(i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                    } else if (!this.q) {
                        o<?> a24 = a(type);
                        if (a24 != null) {
                            this.q = true;
                            return a24;
                        }
                        try {
                            e<T, TypedOutput> a25 = this.f42616a.a(type, annotationArr, this.f42618c);
                            this.q = true;
                            return new o.b(this.f42626k, a25);
                        } catch (RuntimeException e2) {
                            throw a(e2, i2, "Unable to create @Body converter for %s", type);
                        }
                    } else {
                        throw a(i2, "Multiple @Body method annotations found.", new Object[0]);
                    }
                } else if (annotation instanceof p) {
                    if (!this.u) {
                        this.u = true;
                        String a26 = ((p) annotation).a();
                        if (t.f42604b.matcher(a26).matches()) {
                            String str = this.D;
                            if (str == null || str.equals(a26)) {
                                return new o.n(a26, this.f42616a.b(type, annotationArr));
                            }
                            throw a(i2, "Method \"%s\" does not contain \"{%s}\".", this.v, a26);
                        }
                        throw a(i2, "@Method parameter name must match %s. Found: %s", t.f42603a.pattern(), a26);
                    }
                    throw a(i2, "Multiple @Method method annotations found.", new Object[0]);
                } else if (annotation instanceof com.bytedance.retrofit2.b.o) {
                    try {
                        return new o.m(this.f42616a.b(type, annotationArr));
                    } catch (RuntimeException e3) {
                        throw a(e3, i2, "Unable to create @MaxLength converter for %s", type);
                    }
                } else if (annotation instanceof com.bytedance.retrofit2.b.a) {
                    try {
                        return new o.a(this.f42616a.b(type, annotationArr));
                    } catch (RuntimeException e4) {
                        throw a(e4, i2, "Unable to create @AddCommonParam converter for %s", type);
                    }
                } else if (annotation instanceof d) {
                    try {
                        return new o.g(this.f42616a.a(type, annotationArr));
                    } catch (RuntimeException e5) {
                        throw a(e5, i2, "Unable to create @ExtraInfo converter for %s", type);
                    }
                } else if (annotation instanceof com.bytedance.retrofit2.b.a.a) {
                    if (com.bytedance.retrofit2.b.a.b.class.isAssignableFrom(w.a(type))) {
                        return new o.u();
                    }
                    throw a(i2, "Unable to create @QueryObject for %s not QueryParamObject type", type);
                } else if (!(annotation instanceof af)) {
                    return null;
                } else {
                    Class<?> a27 = w.a(type);
                    for (int i3 = i2 - 1; i3 >= 0; i3--) {
                        o<?> oVar = this.E[i3];
                        if ((oVar instanceof o.w) && ((o.w) oVar).f42559a.equals(a27)) {
                            throw a(i2, "@Tag type " + a27.getName() + " is duplicate of parameter #" + (i3 + 1) + " and would always overwrite its value.", new Object[0]);
                        }
                    }
                    return new o.w(a27);
                }
            }
        }

        private o<?> b(int i2, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof l.b.x) {
                if (this.t) {
                    throw a(i2, "Multiple @Url method annotations found.", new Object[0]);
                } else if (this.r) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.s) {
                    throw a(i2, "A @Url parameter must not come after a @Query", new Object[0]);
                } else if (this.z == null) {
                    this.t = true;
                    if (type == String.class || type == URI.class || ((type instanceof Class) && "android.net.Uri".equals(((Class) type).getName()))) {
                        return new o.v();
                    }
                    throw a(i2, "@Url must be String, java.net.URI, or android.net.Uri type.", new Object[0]);
                } else {
                    throw a(i2, "@Url cannot be used with @%s URL", this.v);
                }
            } else if (annotation instanceof s) {
                if (this.s) {
                    throw a(i2, "A @Path parameter must not come after a @Query.", new Object[0]);
                } else if (this.t) {
                    throw a(i2, "@Path parameters may not be used with @Url.", new Object[0]);
                } else if (this.z != null) {
                    this.r = true;
                    s sVar = (s) annotation;
                    String a2 = sVar.a();
                    a(i2, a2);
                    return new o.q(a2, this.f42616a.b(type, annotationArr), !sVar.b());
                } else {
                    throw a(i2, "@Path can only be used with relative url on @%s", this.v);
                }
            } else if (annotation instanceof l.b.t) {
                l.b.t tVar = (l.b.t) annotation;
                String a3 = tVar.a();
                boolean b2 = tVar.b();
                Class<?> a4 = w.a(type);
                this.s = true;
                if (Iterable.class.isAssignableFrom(a4)) {
                    if (type instanceof ParameterizedType) {
                        return new o.r(a3, this.f42616a.b(w.a(0, (ParameterizedType) type), annotationArr), !b2).a();
                    }
                    throw a(i2, a4.getSimpleName() + " must include generic type (e.g., " + a4.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a4.isArray()) {
                    return new o.r(a3, this.f42616a.b(type, annotationArr), !b2);
                } else {
                    return new o.r(a3, this.f42616a.b(t.a(a4.getComponentType()), annotationArr), !b2).b();
                }
            } else if (annotation instanceof l.b.v) {
                boolean a5 = ((l.b.v) annotation).a();
                Class<?> a6 = w.a(type);
                this.s = true;
                if (Iterable.class.isAssignableFrom(a6)) {
                    if (type instanceof ParameterizedType) {
                        return new o.t(this.f42616a.b(w.a(0, (ParameterizedType) type), annotationArr), a5).a();
                    }
                    throw a(i2, a6.getSimpleName() + " must include generic type (e.g., " + a6.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a6.isArray()) {
                    return new o.t(this.f42616a.b(type, annotationArr), a5);
                } else {
                    return new o.t(this.f42616a.b(t.a(a6.getComponentType()), annotationArr), a5).b();
                }
            } else if (annotation instanceof u) {
                Class<?> a7 = w.a(type);
                if (Map.class.isAssignableFrom(a7)) {
                    Type a8 = w.a(type, a7, (Class<?>) Map.class);
                    if (a8 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) a8;
                        Type a9 = w.a(0, parameterizedType);
                        if (String.class == a9) {
                            return new o.s(this.f42616a.b(w.a(1, parameterizedType), annotationArr), !((u) annotation).a());
                        }
                        throw a(i2, "@QueryMap keys must be of type String: ".concat(String.valueOf(a9)), new Object[0]);
                    }
                    throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw a(i2, "@QueryMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof i) {
                String a10 = ((i) annotation).a();
                Class<?> a11 = w.a(type);
                if (Iterable.class.isAssignableFrom(a11)) {
                    if (type instanceof ParameterizedType) {
                        return new o.j(a10, this.f42616a.b(w.a(0, (ParameterizedType) type), annotationArr)).a();
                    }
                    throw a(i2, a11.getSimpleName() + " must include generic type (e.g., " + a11.getSimpleName() + "<String>)", new Object[0]);
                } else if (!a11.isArray()) {
                    return new o.j(a10, this.f42616a.b(type, annotationArr));
                } else {
                    return new o.j(a10, this.f42616a.b(t.a(a11.getComponentType()), annotationArr)).b();
                }
            } else if (annotation instanceof j) {
                Class<?> a12 = w.a(type);
                if (Map.class.isAssignableFrom(a12)) {
                    Type a13 = w.a(type, a12, (Class<?>) Map.class);
                    if (a13 instanceof ParameterizedType) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) a13;
                        Type a14 = w.a(0, parameterizedType2);
                        if (String.class == a14) {
                            return new o.l(this.f42616a.b(w.a(1, parameterizedType2), annotationArr));
                        }
                        throw a(i2, "@HeaderMap keys must be of type String: ".concat(String.valueOf(a14)), new Object[0]);
                    }
                    throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                throw a(i2, "@HeaderMap parameter type must be Map.", new Object[0]);
            } else if (annotation instanceof l.b.c) {
                if (this.x) {
                    l.b.c cVar = (l.b.c) annotation;
                    String a15 = cVar.a();
                    boolean b3 = cVar.b();
                    this.o = true;
                    Class<?> a16 = w.a(type);
                    if (Iterable.class.isAssignableFrom(a16)) {
                        if (type instanceof ParameterizedType) {
                            return new o.h(a15, this.f42616a.b(w.a(0, (ParameterizedType) type), annotationArr), !b3).a();
                        }
                        throw a(i2, a16.getSimpleName() + " must include generic type (e.g., " + a16.getSimpleName() + "<String>)", new Object[0]);
                    } else if (!a16.isArray()) {
                        return new o.h(a15, this.f42616a.b(type, annotationArr), !b3);
                    } else {
                        return new o.h(a15, this.f42616a.b(t.a(a16.getComponentType()), annotationArr), !b3).b();
                    }
                } else {
                    throw a(i2, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
            } else if (annotation instanceof l.b.d) {
                if (this.x) {
                    Class<?> a17 = w.a(type);
                    if (Map.class.isAssignableFrom(a17)) {
                        Type a18 = w.a(type, a17, (Class<?>) Map.class);
                        if (a18 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType3 = (ParameterizedType) a18;
                            Type a19 = w.a(0, parameterizedType3);
                            if (String.class == a19) {
                                e<T, String> b4 = this.f42616a.b(w.a(1, parameterizedType3), annotationArr);
                                this.o = true;
                                return new o.i(b4, !((l.b.d) annotation).a());
                            }
                            throw a(i2, "@FieldMap keys must be of type String: ".concat(String.valueOf(a19)), new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                throw a(i2, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
            } else if (annotation instanceof q) {
                if (this.y) {
                    q qVar = (q) annotation;
                    this.p = true;
                    o<?> a20 = a(type, qVar.a(), qVar.b());
                    if (a20 != null) {
                        return a20;
                    }
                    return new o.C1039o(qVar.a(), this.f42616a.a(type, annotationArr, this.f42618c));
                }
                throw a(i2, "@Part parameters can only be used with multipart encoding.", new Object[0]);
            } else if (annotation instanceof r) {
                if (this.y) {
                    this.p = true;
                    Class<?> a21 = w.a(type);
                    if (Map.class.isAssignableFrom(a21)) {
                        Type a22 = w.a(type, a21, (Class<?>) Map.class);
                        if (a22 instanceof ParameterizedType) {
                            ParameterizedType parameterizedType4 = (ParameterizedType) a22;
                            Type a23 = w.a(0, parameterizedType4);
                            if (String.class == a23) {
                                o<?> a24 = a(parameterizedType4, annotation);
                                if (a24 != null) {
                                    return a24;
                                }
                                return new o.p(this.f42616a.a(w.a(1, parameterizedType4), annotationArr, this.f42618c), ((r) annotation).a());
                            }
                            throw a(i2, "@PartMap keys must be of type String: ".concat(String.valueOf(a23)), new Object[0]);
                        }
                        throw a(i2, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                    }
                    throw a(i2, "@PartMap parameter type must be Map.", new Object[0]);
                }
                throw a(i2, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
            } else if (!(annotation instanceof l.b.a)) {
                return null;
            } else {
                if (this.x || this.y) {
                    throw a(i2, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                } else if (!this.q) {
                    o<?> a25 = a(type);
                    if (a25 != null) {
                        this.q = true;
                        return a25;
                    }
                    try {
                        e<T, TypedOutput> a26 = this.f42616a.a(type, annotationArr, this.f42618c);
                        this.q = true;
                        return new o.b(this.f42626k, a26);
                    } catch (RuntimeException e2) {
                        throw a(e2, i2, "Unable to create @Body converter for %s", type);
                    }
                } else {
                    throw a(i2, "Multiple @Body method annotations found.", new Object[0]);
                }
            }
        }

        private o a(int i2, Type type, Annotation[] annotationArr, boolean z2, String str, boolean z3) {
            Class<?> a2 = w.a(type);
            this.s = true;
            if (Iterable.class.isAssignableFrom(a2)) {
                if (type instanceof ParameterizedType) {
                    e<T, String> b2 = this.f42616a.b(w.a(0, (ParameterizedType) type), annotationArr);
                    if (z2) {
                        return new o.t(b2, z3).a();
                    }
                    return new o.r(str, b2, z3).a();
                }
                throw a(i2, a2.getSimpleName() + " must include generic type (e.g., " + a2.getSimpleName() + "<String>)", new Object[0]);
            } else if (a2.isArray()) {
                e<T, String> b3 = this.f42616a.b(t.a(a2.getComponentType()), annotationArr);
                if (z2) {
                    return new o.t(b3, z3).b();
                }
                return new o.r(str, b3, z3).b();
            } else {
                e<T, String> b4 = this.f42616a.b(type, annotationArr);
                if (z2) {
                    return new o.t(b4, z3);
                }
                return new o.r(str, b4, z3);
            }
        }
    }

    static {
        Covode.recordClassIndex(26091);
    }

    static Set<String> a(String str) {
        Matcher matcher = f42603a.matcher(str);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (matcher.find()) {
            linkedHashSet.add(matcher.group(1));
        }
        return linkedHashSet;
    }

    static String b(String str) {
        Matcher matcher = f42603a.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
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

    t(a<T> aVar) {
        this.f42605c = aVar.f42616a.f42566a;
        this.f42606d = aVar.G;
        this.f42607e = aVar.f42616a.f42572g;
        this.f42608f = aVar.f42616a.f42571f;
        this.r = aVar.f42616a.f42567b;
        this.s = aVar.F;
        this.t = aVar.v;
        this.u = aVar.z;
        this.w = aVar.w;
        this.x = aVar.x;
        this.y = aVar.y;
        this.z = aVar.E;
        this.A = aVar.A;
        this.B = aVar.B;
        this.f42609g = aVar.f42621f;
        this.f42610h = aVar.f42628m;
        this.f42611i = aVar.f42622g;
        this.f42612j = aVar.f42623h;
        this.f42613k = aVar.f42624i;
        this.f42614l = aVar.f42625j;
        this.v = aVar.f42626k;
        this.f42615m = aVar.f42627l;
        this.n = aVar.f42617b;
        this.o = aVar.f42616a.f42573i;
    }

    private static boolean a(File file) {
        MethodCollector.i(3193);
        try {
            e.c cVar = (e.c) SettingsManager.a().a("storage_intercepter_key", e.c.class, g.f79058a);
            if (com.ss.android.ugc.aweme.cs.e.a(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_delete_log", com.ss.android.ugc.aweme.cs.e.a(cVar));
            }
            if (com.ss.android.ugc.aweme.cs.e.c(file.getAbsolutePath(), cVar)) {
                com.ss.android.ugc.aweme.cs.e.a(file, new RuntimeException(), "exception_handle", com.ss.android.ugc.aweme.cs.e.a(cVar));
                MethodCollector.o(3193);
                return false;
            }
        } catch (Throwable unused) {
        }
        boolean delete = file.delete();
        MethodCollector.o(3193);
        return delete;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r15v0, resolved type: com.bytedance.retrofit2.RequestBuilder */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: package-private */
    public final Request a(Object... objArr) {
        int i2;
        RequestBuilder requestBuilder = new RequestBuilder(this.t, this.r, this.u, this.A, this.B, this.f42609g, this.f42610h, this.f42612j, this.f42613k, this.f42614l, this.f42615m, this.w, this.x, this.y, this.f42611i);
        o<?>[] oVarArr = this.z;
        if (objArr != null) {
            i2 = objArr.length;
        } else {
            i2 = 0;
        }
        if (i2 == oVarArr.length) {
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(objArr[i3]);
                oVarArr[i3].a(requestBuilder, objArr[i3]);
            }
            requestBuilder.a(n.class, new n(this.n, arrayList));
            Request a2 = requestBuilder.a();
            if (com.ss.android.ugc.aweme.network.a.a.a() && com.ss.android.ugc.aweme.feed.k.f93535i) {
                a2.getPath();
                ArrayList arrayList2 = new ArrayList(a2.getHeaders());
                arrayList2.add(new b("x-tt-request-tag", "feed=0"));
                Request.a newBuilder = a2.newBuilder();
                newBuilder.f42460c = arrayList2;
                a2 = newBuilder.a();
            }
            this.q = a2.getPath();
            return a2;
        }
        throw new IllegalArgumentException("Argument count (" + i2 + ") doesn't match expected count (" + oVarArr.length + ")");
    }

    public static Object a(t tVar, TypedInput typedInput) {
        BufferedOutputStream bufferedOutputStream;
        Throwable th;
        FileNotFoundException e2;
        IOException e3;
        Exception e4;
        BufferedInputStream bufferedInputStream;
        MethodCollector.i(3187);
        try {
            T a2 = tVar.s.a(typedInput);
            MethodCollector.o(3187);
            return a2;
        } catch (Exception e5) {
            if (!(typedInput == null || typedInput.mimeType() == null || !(typedInput.mimeType().contains("application/json") || typedInput.mimeType().contains("application/x-protobuf")))) {
                String str = (String) tVar.q;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("urlpath", str);
                    jSONObject.put("errorDesc", e5.getMessage());
                } catch (Exception e6) {
                    e6.printStackTrace();
                }
                com.bytedance.apm.b.a("parser_err", jSONObject);
                BufferedInputStream bufferedInputStream2 = null;
                try {
                    StringBuilder sb = new StringBuilder();
                    Context a3 = com.bytedance.ies.ugc.appcontext.d.a();
                    if (com.ss.android.ugc.aweme.lancet.d.f107194b == null || !com.ss.android.ugc.aweme.lancet.d.f107197e) {
                        com.ss.android.ugc.aweme.lancet.d.f107194b = a3.getCacheDir();
                    }
                    File file = new File(sb.append(com.ss.android.ugc.aweme.lancet.d.f107194b.getAbsolutePath()).append(File.separator).append("parser").toString());
                    if (!file.exists()) {
                        file.mkdir();
                    } else {
                        File[] listFiles = file.listFiles();
                        if (listFiles != null && listFiles.length > 0) {
                            for (File file2 : listFiles) {
                                if (file2.isFile() && file2.exists() && file2.lastModified() + 86400000 < System.currentTimeMillis()) {
                                    a(file2);
                                }
                            }
                        }
                    }
                    File[] listFiles2 = file.listFiles();
                    if (listFiles2 == null || listFiles2.length < 10) {
                        File file3 = new File(file + File.separator + str.hashCode() + "_" + System.currentTimeMillis() + "_" + Thread.currentThread().getId() + ".txt");
                        if (!file3.exists()) {
                            bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
                            try {
                                bufferedInputStream = new BufferedInputStream(typedInput.in());
                            } catch (FileNotFoundException e7) {
                                e2 = e7;
                                e2.printStackTrace();
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                MethodCollector.o(3187);
                                throw e5;
                            } catch (IOException e8) {
                                e3 = e8;
                                e3.printStackTrace();
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                MethodCollector.o(3187);
                                throw e5;
                            } catch (Exception e9) {
                                e4 = e9;
                                try {
                                    e4.printStackTrace();
                                    bufferedInputStream2.close();
                                    bufferedOutputStream.close();
                                    MethodCollector.o(3187);
                                    throw e5;
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        bufferedInputStream2.close();
                                        bufferedOutputStream.close();
                                    } catch (Exception e10) {
                                        e10.printStackTrace();
                                    }
                                    MethodCollector.o(3187);
                                    throw th;
                                }
                            }
                            try {
                                byte[] bArr = new byte[4096];
                                while (true) {
                                    int read = bufferedInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    bufferedOutputStream.write(bArr, 0, read);
                                }
                                bufferedInputStream2 = bufferedInputStream;
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                            } catch (FileNotFoundException e11) {
                                e2 = e11;
                                bufferedInputStream2 = bufferedInputStream;
                                e2.printStackTrace();
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                MethodCollector.o(3187);
                                throw e5;
                            } catch (IOException e12) {
                                e3 = e12;
                                bufferedInputStream2 = bufferedInputStream;
                                e3.printStackTrace();
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                MethodCollector.o(3187);
                                throw e5;
                            } catch (Exception e13) {
                                e4 = e13;
                                bufferedInputStream2 = bufferedInputStream;
                                e4.printStackTrace();
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                MethodCollector.o(3187);
                                throw e5;
                            } catch (Throwable th3) {
                                th = th3;
                                bufferedInputStream2 = bufferedInputStream;
                                bufferedInputStream2.close();
                                bufferedOutputStream.close();
                                MethodCollector.o(3187);
                                throw th;
                            }
                        }
                    }
                    bufferedOutputStream = null;
                    try {
                        bufferedInputStream2.close();
                        bufferedOutputStream.close();
                    } catch (Exception e14) {
                        e14.printStackTrace();
                    }
                } catch (FileNotFoundException e15) {
                    e2 = e15;
                    bufferedOutputStream = null;
                    e2.printStackTrace();
                    bufferedInputStream2.close();
                    bufferedOutputStream.close();
                    MethodCollector.o(3187);
                    throw e5;
                } catch (IOException e16) {
                    e3 = e16;
                    bufferedOutputStream = null;
                    e3.printStackTrace();
                    bufferedInputStream2.close();
                    bufferedOutputStream.close();
                    MethodCollector.o(3187);
                    throw e5;
                } catch (Exception e17) {
                    e4 = e17;
                    bufferedOutputStream = null;
                    e4.printStackTrace();
                    bufferedInputStream2.close();
                    bufferedOutputStream.close();
                    MethodCollector.o(3187);
                    throw e5;
                } catch (Throwable th4) {
                    th = th4;
                    bufferedOutputStream = null;
                    bufferedInputStream2.close();
                    bufferedOutputStream.close();
                    MethodCollector.o(3187);
                    throw th;
                }
            }
            MethodCollector.o(3187);
            throw e5;
        }
    }
}
