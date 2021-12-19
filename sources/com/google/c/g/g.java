package com.google.c.g;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import com.google.c.a.l;
import com.google.c.c.ab;
import com.google.c.c.ai;
import com.google.c.c.aw;
import com.google.c.c.az;
import com.google.c.c.br;
import com.google.c.c.s;
import com.google.c.c.v;
import com.google.c.c.z;
import com.google.c.g.b;
import com.google.c.g.f;
import com.google.c.g.i;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public abstract class g<T> extends d<T> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private transient f f54146a;
    public final Type runtimeType;

    static {
        Covode.recordClassIndex(33581);
    }

    /* access modifiers changed from: package-private */
    public static abstract class e<K> {

        /* renamed from: a  reason: collision with root package name */
        static final e<g<?>> f54157a = new e<g<?>>() {
            /* class com.google.c.g.g.e.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33591);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.g.e
            public final /* synthetic */ Class b(g<?> gVar) {
                return gVar.getRawType();
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.g.e
            public final /* synthetic */ g<?> d(g<?> gVar) {
                g<?> gVar2 = gVar;
                if (gVar2.runtimeType instanceof TypeVariable) {
                    return g.b(((TypeVariable) gVar2.runtimeType).getBounds()[0]);
                }
                if (gVar2.runtimeType instanceof WildcardType) {
                    return g.b(((WildcardType) gVar2.runtimeType).getUpperBounds()[0]);
                }
                Type genericSuperclass = gVar2.getRawType().getGenericSuperclass();
                if (genericSuperclass == null) {
                    return null;
                }
                return gVar2.a(genericSuperclass);
            }

            /* Return type fixed from 'java.lang.Iterable' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.g.e
            public final /* synthetic */ Iterable<? extends g<?>> c(g<?> gVar) {
                g<?> gVar2 = gVar;
                if (gVar2.runtimeType instanceof TypeVariable) {
                    return g.a(((TypeVariable) gVar2.runtimeType).getBounds());
                }
                if (gVar2.runtimeType instanceof WildcardType) {
                    return g.a(((WildcardType) gVar2.runtimeType).getUpperBounds());
                }
                z.a builder = z.builder();
                for (Type type : gVar2.getRawType().getGenericInterfaces()) {
                    builder.c(gVar2.a(type));
                }
                return builder.a();
            }
        };

        /* renamed from: b  reason: collision with root package name */
        static final e<Class<?>> f54158b = new e<Class<?>>() {
            /* class com.google.c.g.g.e.AnonymousClass2 */

            static {
                Covode.recordClassIndex(33592);
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.g.e
            public final /* bridge */ /* synthetic */ Class b(Class<?> cls) {
                return cls;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.g.e
            public final /* synthetic */ Class<?> d(Class<?> cls) {
                return cls.getSuperclass();
            }

            /* Return type fixed from 'java.lang.Iterable' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.g.e
            public final /* synthetic */ Iterable<? extends Class<?>> c(Class<?> cls) {
                return Arrays.asList(cls.getInterfaces());
            }
        };

        /* access modifiers changed from: package-private */
        public abstract Class<?> b(K k2);

        /* access modifiers changed from: package-private */
        public abstract Iterable<? extends K> c(K k2);

        /* access modifiers changed from: package-private */
        public abstract K d(K k2);

        private e() {
        }

        /* access modifiers changed from: package-private */
        public final e<K> a() {
            return new a<K>(this) {
                /* class com.google.c.g.g.e.AnonymousClass3 */

                static {
                    Covode.recordClassIndex(33593);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.g.g.e, com.google.c.g.g.e.a
                public final Iterable<? extends K> c(K k2) {
                    return ai.of();
                }

                /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.google.c.g.g$e$3 */
                /* JADX WARN: Multi-variable type inference failed */
                /* access modifiers changed from: package-private */
                @Override // com.google.c.g.g.e
                public final z<K> a(Iterable<? extends K> iterable) {
                    z.a builder = z.builder();
                    for (Object obj : iterable) {
                        if (!b(obj).isInterface()) {
                            builder.c(obj);
                        }
                    }
                    return super.a((Iterable) builder.a());
                }
            };
        }

        static {
            Covode.recordClassIndex(33590);
        }

        static class a<K> extends e<K> {

            /* renamed from: c  reason: collision with root package name */
            private final e<K> f54162c;

            static {
                Covode.recordClassIndex(33595);
            }

            a(e<K> eVar) {
                super((byte) 0);
                this.f54162c = eVar;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.g.e
            public final Class<?> b(K k2) {
                return this.f54162c.b(k2);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.g.e
            public Iterable<? extends K> c(K k2) {
                return this.f54162c.c(k2);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.g.e
            public final K d(K k2) {
                return this.f54162c.d(k2);
            }
        }

        /* synthetic */ e(byte b2) {
            this();
        }

        /* access modifiers changed from: package-private */
        public final z<K> a(K k2) {
            return a((Iterable) z.of(k2));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.google.c.g.g$e<K> */
        /* JADX WARN: Multi-variable type inference failed */
        /* access modifiers changed from: package-private */
        public z<K> a(Iterable<? extends K> iterable) {
            final HashMap hashMap = new HashMap();
            Iterator<? extends K> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next(), hashMap);
            }
            final az a2 = aw.f53956a.a();
            return z.sortedCopyOf(new az<K>() {
                /* class com.google.c.g.g.e.AnonymousClass4 */

                static {
                    Covode.recordClassIndex(33594);
                }

                /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: java.util.Comparator */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.c.c.az, java.util.Comparator
                public final int compare(K k2, K k3) {
                    return a2.compare(hashMap.get(k2), hashMap.get(k3));
                }
            }, hashMap.keySet());
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v1, resolved type: int */
        /* JADX DEBUG: Multi-variable search result rejected for r2v6, resolved type: int */
        /* JADX WARN: Multi-variable type inference failed */
        private int a(K k2, Map<? super K, Integer> map) {
            Integer num = map.get(k2);
            if (num != null) {
                return num.intValue();
            }
            boolean isInterface = b(k2).isInterface();
            Iterator<? extends K> it = c(k2).iterator();
            int i2 = isInterface;
            while (it.hasNext()) {
                i2 = Math.max(i2, a(it.next(), map));
            }
            K d2 = d(k2);
            int i3 = i2;
            if (d2 != null) {
                i3 = Math.max(i2, a(d2, map));
            }
            int i4 = (i3 == 1 ? 1 : 0) + 1;
            map.put(k2, Integer.valueOf(i4));
            return i4;
        }
    }

    public final Type getType() {
        return this.runtimeType;
    }

    /* access modifiers changed from: package-private */
    public final class b extends g<T>.C1236g {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        private transient ai<g<? super T>> f54153a;

        static {
            Covode.recordClassIndex(33586);
        }

        @Override // com.google.c.g.g.C1236g
        public final g<T>.C1236g classes() {
            return this;
        }

        @Override // com.google.c.g.g.C1236g
        public final g<T>.C1236g interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        private Object readResolve() {
            return g.this.getTypes().classes();
        }

        @Override // com.google.c.g.g.C1236g
        public final Set<Class<? super T>> rawTypes() {
            return ai.copyOf((Collection) e.f54158b.a().a(g.this.getRawTypes()));
        }

        @Override // com.google.c.g.g.C1236g, com.google.c.c.v
        /* renamed from: b */
        public final Set<g<? super T>> c() {
            ai<g<? super T>> aiVar = this.f54153a;
            if (aiVar != null) {
                return aiVar;
            }
            ai<g<? super T>> copyOf = ai.copyOf(s.a(e.f54157a.a().a(g.this)).a(f.IGNORE_TYPE_VARIABLE_OR_WILDCARD).a());
            this.f54153a = copyOf;
            return copyOf;
        }

        private b() {
            super();
        }

        /* synthetic */ b(g gVar, byte b2) {
            this();
        }
    }

    /* access modifiers changed from: package-private */
    public final class c extends g<T>.C1236g {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        private final transient g<T>.C1236g f54154a;

        /* renamed from: b  reason: collision with root package name */
        private transient ai<g<? super T>> f54155b;

        static {
            Covode.recordClassIndex(33587);
        }

        @Override // com.google.c.g.g.C1236g
        public final g<T>.C1236g interfaces() {
            return this;
        }

        @Override // com.google.c.g.g.C1236g
        public final g<T>.C1236g classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        private Object readResolve() {
            return g.this.getTypes().interfaces();
        }

        @Override // com.google.c.g.g.C1236g, com.google.c.c.v
        /* renamed from: b */
        public final Set<g<? super T>> c() {
            ai<g<? super T>> aiVar = this.f54155b;
            if (aiVar != null) {
                return aiVar;
            }
            ai<g<? super T>> copyOf = ai.copyOf(s.a(this.f54154a).a(f.INTERFACE_ONLY).a());
            this.f54155b = copyOf;
            return copyOf;
        }

        @Override // com.google.c.g.g.C1236g
        public final Set<Class<? super T>> rawTypes() {
            return ai.copyOf(s.a(e.f54158b.a(g.this.getRawTypes())).a(new l<Class<?>>() {
                /* class com.google.c.g.g.c.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33588);
                }

                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // com.google.c.a.l
                public final /* synthetic */ boolean a(Class<?> cls) {
                    return cls.isInterface();
                }
            }).a());
        }

        c(g<T>.C1236g gVar) {
            super();
            this.f54154a = gVar;
        }
    }

    /* renamed from: com.google.c.g.g$g  reason: collision with other inner class name */
    public class C1236g extends v<g<? super T>> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a  reason: collision with root package name */
        private transient ai<g<? super T>> f54166a;

        static {
            Covode.recordClassIndex(33599);
        }

        public g<T>.C1236g interfaces() {
            return new c(this);
        }

        public g<T>.C1236g classes() {
            return new b(g.this, (byte) 0);
        }

        public Set<Class<? super T>> rawTypes() {
            return ai.copyOf((Collection) e.f54158b.a(g.this.getRawTypes()));
        }

        @Override // com.google.c.c.v
        /* renamed from: b */
        public Set<g<? super T>> c() {
            ai<g<? super T>> aiVar = this.f54166a;
            if (aiVar != null) {
                return aiVar;
            }
            ai<g<? super T>> copyOf = ai.copyOf(s.a(e.f54157a.a(g.this)).a(f.IGNORE_TYPE_VARIABLE_OR_WILDCARD).a());
            this.f54166a = copyOf;
            return copyOf;
        }

        C1236g() {
        }
    }

    public final g<T>.C1236g getTypes() {
        return new C1236g();
    }

    public int hashCode() {
        return this.runtimeType.hashCode();
    }

    public String toString() {
        return i.b(this.runtimeType);
    }

    public final g<?> getComponentType() {
        Type c2 = i.c(this.runtimeType);
        if (c2 == null) {
            return null;
        }
        return of(c2);
    }

    public final Class<? super T> getRawType() {
        return getRawTypes().iterator().next();
    }

    public final boolean isArray() {
        if (getComponentType() != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public Object writeReplace() {
        return of(new f().a(this.runtimeType));
    }

    public g() {
        Type a2 = a();
        this.runtimeType = a2;
        k.b(!(a2 instanceof TypeVariable), "Cannot construct a TypeToken for a type variable.\nYou probably meant to call new TypeToken<%s>(getClass()) that can resolve the type variable for you.\nIf you do need to create a TypeToken of a type variable, please use TypeToken.of() instead.", a2);
    }

    public ai<Class<? super T>> getRawTypes() {
        final ai.a builder = ai.builder();
        new h() {
            /* class com.google.c.g.g.AnonymousClass3 */

            static {
                Covode.recordClassIndex(33584);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.h
            public final void a(Class<?> cls) {
                builder.b(cls);
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.h
            public final void a(ParameterizedType parameterizedType) {
                builder.b(parameterizedType.getRawType());
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.h
            public final void a(GenericArrayType genericArrayType) {
                builder.b(i.a((Class<?>) g.of(genericArrayType.getGenericComponentType()).getRawType()));
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.h
            public final void a(TypeVariable<?> typeVariable) {
                a(typeVariable.getBounds());
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.h
            public final void a(WildcardType wildcardType) {
                a(wildcardType.getUpperBounds());
            }
        }.a(this.runtimeType);
        return builder.a();
    }

    public final boolean isPrimitive() {
        Type type = this.runtimeType;
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return false;
        }
        return true;
    }

    public final g<T> wrap() {
        if (!isPrimitive()) {
            return this;
        }
        Class<?> cls = (Class) this.runtimeType;
        k.a(cls);
        Class<?> cls2 = com.google.c.f.b.f54126a.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return of((Class) cls);
    }

    /* access modifiers changed from: package-private */
    public enum f implements l<g<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.c.a.l
            public final /* bridge */ /* synthetic */ boolean a(g<?> gVar) {
                g<?> gVar2 = gVar;
                if ((gVar2.runtimeType instanceof TypeVariable) || (gVar2.runtimeType instanceof WildcardType)) {
                    return false;
                }
                return true;
            }
        },
        INTERFACE_ONLY {
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // com.google.c.a.l
            public final /* synthetic */ boolean a(g<?> gVar) {
                return gVar.getRawType().isInterface();
            }
        };

        static {
            Covode.recordClassIndex(33596);
        }

        /* synthetic */ f(byte b2) {
            this();
        }
    }

    public final g<T> unwrap() {
        if (!com.google.c.f.b.f54127b.keySet().contains(this.runtimeType)) {
            return this;
        }
        Class<?> cls = (Class) this.runtimeType;
        k.a(cls);
        Class<?> cls2 = com.google.c.f.b.f54127b.get(cls);
        if (cls2 != null) {
            cls = cls2;
        }
        return of((Class) cls);
    }

    /* access modifiers changed from: package-private */
    public static final class d<T> extends g<T> {
        private static final long serialVersionUID = 0;

        static {
            Covode.recordClassIndex(33589);
        }

        d(Type type) {
            super(type, (byte) 0);
        }
    }

    private static a b(Type[] typeArr) {
        return new a(typeArr, false);
    }

    private static a c(Type[] typeArr) {
        return new a(typeArr, true);
    }

    public static <T> g<T> of(Class<T> cls) {
        return new d(cls);
    }

    private g(Type type) {
        this.runtimeType = (Type) k.a(type);
    }

    static g<? super T> b(Type type) {
        g<? super T> gVar = (g<? super T>) of(type);
        if (gVar.getRawType().isInterface()) {
            return null;
        }
        return gVar;
    }

    public static g<?> of(Type type) {
        return new d(type);
    }

    /* access modifiers changed from: package-private */
    public final g<?> a(Type type) {
        g<?> resolveType = resolveType(type);
        resolveType.f54146a = this.f54146a;
        return resolveType;
    }

    public final boolean isSubtypeOf(g<?> gVar) {
        return isSubtypeOf(gVar.getType());
    }

    public final boolean isSupertypeOf(g<?> gVar) {
        return gVar.isSubtypeOf(getType());
    }

    /* access modifiers changed from: package-private */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Type[] f54151a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f54152b;

        static {
            Covode.recordClassIndex(33585);
        }

        /* access modifiers changed from: package-private */
        public final boolean a(Type type) {
            for (Type type2 : this.f54151a) {
                boolean isSubtypeOf = g.of(type2).isSubtypeOf(type);
                boolean z = this.f54152b;
                if (isSubtypeOf == z) {
                    return z;
                }
            }
            if (!this.f54152b) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final boolean b(Type type) {
            g<?> of = g.of(type);
            for (Type type2 : this.f54151a) {
                boolean isSubtypeOf = of.isSubtypeOf(type2);
                boolean z = this.f54152b;
                if (isSubtypeOf == z) {
                    return z;
                }
            }
            if (!this.f54152b) {
                return true;
            }
            return false;
        }

        a(Type[] typeArr, boolean z) {
            this.f54151a = typeArr;
            this.f54152b = z;
        }
    }

    private boolean a(Class<?> cls) {
        br<Class<? super T>> it = getRawTypes().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom(it.next())) {
                return true;
            }
        }
        return false;
    }

    public final b<T, T> constructor(Constructor<?> constructor) {
        boolean z;
        if (constructor.getDeclaringClass() == getRawType()) {
            z = true;
        } else {
            z = false;
        }
        k.a(z, "%s not declared by %s", constructor, getRawType());
        return new b.a<T>(constructor) {
            /* class com.google.c.g.g.AnonymousClass2 */

            static {
                Covode.recordClassIndex(33583);
            }

            @Override // com.google.c.g.a, com.google.c.g.b
            public final g<T> a() {
                return g.this;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.b.a, com.google.c.g.b
            public final Type[] b() {
                return g.this.resolveInPlace(super.b());
            }

            @Override // com.google.c.g.a, com.google.c.g.b
            public final String toString() {
                return g.this + "(" + com.google.c.a.g.a(", ").a((Object[]) b()) + ")";
            }
        };
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.runtimeType.equals(((g) obj).runtimeType);
        }
        return false;
    }

    public final boolean isSupertypeOf(Type type) {
        return of(type).isSubtypeOf(getType());
    }

    public final b<T, Object> method(Method method) {
        k.a(a(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new b.C1235b<T>(method) {
            /* class com.google.c.g.g.AnonymousClass1 */

            static {
                Covode.recordClassIndex(33582);
            }

            @Override // com.google.c.g.a, com.google.c.g.b
            public final g<T> a() {
                return g.this;
            }

            /* access modifiers changed from: package-private */
            @Override // com.google.c.g.b.C1235b, com.google.c.g.b
            public final Type[] b() {
                return g.this.resolveInPlace(super.b());
            }

            @Override // com.google.c.g.a, com.google.c.g.b
            public final String toString() {
                return g.this + "." + super.toString();
            }
        };
    }

    public Type[] resolveInPlace(Type[] typeArr) {
        for (int i2 = 0; i2 < typeArr.length; i2++) {
            typeArr[i2] = resolveType(typeArr[i2]).getType();
        }
        return typeArr;
    }

    static z<g<? super T>> a(Type[] typeArr) {
        z.a builder = z.builder();
        for (Type type : typeArr) {
            g<?> of = of(type);
            if (of.getRawType().isInterface()) {
                builder.c(of);
            }
        }
        return builder.a();
    }

    public final g<?> resolveType(Type type) {
        k.a(type);
        f fVar = this.f54146a;
        if (fVar == null) {
            Type type2 = this.runtimeType;
            f fVar2 = new f();
            f.a aVar = new f.a();
            aVar.a(f.a.f54136a.a(type2));
            fVar = fVar2.a(ab.copyOf(aVar.f54137b));
            this.f54146a = fVar;
        }
        return of(fVar.a(type));
    }

    private static <T> g<? extends T> b(Class<T> cls) {
        Type type;
        if (cls.isArray()) {
            return (g<? extends T>) of(i.a(b((Class) cls.getComponentType()).runtimeType));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        if (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) {
            type = null;
        } else {
            type = b((Class) cls.getEnclosingClass()).runtimeType;
        }
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? (g<? extends T>) of(i.a(type, (Class<?>) cls, (Type[]) typeParameters)) : of((Class) cls);
    }

    /* JADX DEBUG: Type inference failed for r0v12. Raw type applied. Possible types: java.lang.Class<?>, java.lang.Class<? super ?> */
    public final g<? super T> getSupertype(Class<? super T> cls) {
        k.a(a((Class<?>) cls), "%s is not a super class of %s", cls, this);
        Type type = this.runtimeType;
        if (type instanceof TypeVariable) {
            return a(cls, ((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return a(cls, ((WildcardType) type).getUpperBounds());
        }
        if (!cls.isArray()) {
            return (g<? super T>) a(b((Class) cls).runtimeType);
        }
        g<?> componentType = getComponentType();
        if (componentType != null) {
            return (g<? super T>) of(i.c.JAVA7.a(componentType.getSupertype(cls.getComponentType()).runtimeType));
        }
        throw new NullPointerException(k.a("%s isn't a super type of %s", cls, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0082, code lost:
        if (r2.getRawType().getTypeParameters().length != 0) goto L_0x0084;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.c.g.g<? extends T> getSubtype(java.lang.Class<?> r6) {
        /*
        // Method dump skipped, instructions count: 189
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.c.g.g.getSubtype(java.lang.Class):com.google.c.g.g");
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:0x0001 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:93:0x0001 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX DEBUG: Type inference failed for r2v4. Raw type applied. Possible types: com.google.c.g.g<?>, com.google.c.g.g */
    public final boolean isSubtypeOf(Type type) {
        Type enclosingClass;
        g gVar = this;
        while (true) {
            k.a(type);
            if (!(type instanceof WildcardType)) {
                Type type2 = gVar.runtimeType;
                if (!(type2 instanceof WildcardType)) {
                    if (!(type2 instanceof TypeVariable)) {
                        if (!(type2 instanceof GenericArrayType)) {
                            if (!(type instanceof Class)) {
                                if (!(type instanceof ParameterizedType)) {
                                    if (!(type instanceof GenericArrayType)) {
                                        break;
                                    }
                                    GenericArrayType genericArrayType = (GenericArrayType) type;
                                    if (!(type2 instanceof Class)) {
                                        if (!(type2 instanceof GenericArrayType)) {
                                            break;
                                        }
                                        gVar = of(((GenericArrayType) type2).getGenericComponentType());
                                        type = genericArrayType.getGenericComponentType();
                                    } else {
                                        Class cls = (Class) type2;
                                        if (!cls.isArray()) {
                                            break;
                                        }
                                        gVar = of((Class) cls.getComponentType());
                                        type = genericArrayType.getGenericComponentType();
                                    }
                                } else {
                                    ParameterizedType parameterizedType = (ParameterizedType) type;
                                    Class<?> rawType = of(parameterizedType).getRawType();
                                    if (gVar.a(rawType)) {
                                        TypeVariable<Class<?>>[] typeParameters = rawType.getTypeParameters();
                                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                                        int i2 = 0;
                                        while (true) {
                                            if (i2 < typeParameters.length) {
                                                g<?> resolveType = gVar.resolveType(typeParameters[i2]);
                                                Type type3 = actualTypeArguments[i2];
                                                if (!resolveType.runtimeType.equals(type3)) {
                                                    if (!(type3 instanceof WildcardType)) {
                                                        break;
                                                    }
                                                    WildcardType wildcardType = (WildcardType) type3;
                                                    if (!b(wildcardType.getUpperBounds()).b(resolveType.runtimeType) || !b(wildcardType.getLowerBounds()).a(resolveType.runtimeType)) {
                                                        break;
                                                    }
                                                }
                                                i2++;
                                            } else {
                                                if (!Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) && parameterizedType.getOwnerType() != null) {
                                                    Type ownerType = parameterizedType.getOwnerType();
                                                    Iterator it = gVar.getTypes().iterator();
                                                    while (it.hasNext()) {
                                                        Type type4 = ((g) it.next()).runtimeType;
                                                        if (type4 instanceof ParameterizedType) {
                                                            enclosingClass = ((ParameterizedType) type4).getOwnerType();
                                                        } else if (type4 instanceof Class) {
                                                            enclosingClass = ((Class) type4).getEnclosingClass();
                                                        } else {
                                                            continue;
                                                        }
                                                        if (enclosingClass != null && of(enclosingClass).isSubtypeOf(ownerType)) {
                                                        }
                                                    }
                                                }
                                                return true;
                                            }
                                        }
                                    }
                                    return false;
                                }
                            } else {
                                return gVar.a((Class) type);
                            }
                        } else {
                            g<?> of = of(type);
                            GenericArrayType genericArrayType2 = (GenericArrayType) gVar.runtimeType;
                            Type type5 = of.runtimeType;
                            if (type5 instanceof Class) {
                                Class cls2 = (Class) type5;
                                if (!cls2.isArray()) {
                                    return cls2.isAssignableFrom(Object[].class);
                                }
                                gVar = of(genericArrayType2.getGenericComponentType());
                                type = cls2.getComponentType();
                            } else if (!(type5 instanceof GenericArrayType)) {
                                return false;
                            } else {
                                gVar = of(genericArrayType2.getGenericComponentType());
                                type = ((GenericArrayType) of.runtimeType).getGenericComponentType();
                            }
                        }
                    } else if (type2.equals(type) || c(((TypeVariable) gVar.runtimeType).getBounds()).a(type)) {
                        return true;
                    } else {
                        return false;
                    }
                } else {
                    return c(((WildcardType) type2).getUpperBounds()).a(type);
                }
            } else {
                return c(((WildcardType) type).getLowerBounds()).b(gVar.runtimeType);
            }
        }
        return false;
    }

    /* synthetic */ g(Type type, byte b2) {
        this(type);
    }

    public final <X> g<T> where(e<X> eVar, Class<X> cls) {
        return where(eVar, of((Class) cls));
    }

    public final <X> g<T> where(e<X> eVar, g<X> gVar) {
        return new d(new f().a(ab.of(new f.c(eVar.f54132a), gVar.runtimeType)).a(this.runtimeType));
    }

    private g<? super T> a(Class<? super T> cls, Type[] typeArr) {
        for (Type type : typeArr) {
            g<?> of = of(type);
            if (of.isSubtypeOf(cls)) {
                return (g<? super T>) of.getSupertype(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }
}
