package com.google.c.g;

import com.bytedance.covode.number.Covode;
import com.google.c.a.g;
import com.google.c.a.k;
import com.google.c.c.ab;
import com.google.c.g.i;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final b f54133a;

    static {
        Covode.recordClassIndex(33573);
    }

    /* access modifiers changed from: package-private */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final TypeVariable<?> f54142a;

        static {
            Covode.recordClassIndex(33578);
        }

        public final String toString() {
            return this.f54142a.toString();
        }

        public final int hashCode() {
            return Arrays.hashCode(new Object[]{this.f54142a.getGenericDeclaration(), this.f54142a.getName()});
        }

        c(TypeVariable<?> typeVariable) {
            this.f54142a = (TypeVariable) k.a(typeVariable);
        }

        static c a(Type type) {
            if (type instanceof TypeVariable) {
                return new c((TypeVariable) type);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final boolean b(Type type) {
            if (type instanceof TypeVariable) {
                return a((TypeVariable) type);
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof c) {
                return a(((c) obj).f54142a);
            }
            return false;
        }

        private boolean a(TypeVariable<?> typeVariable) {
            if (!this.f54142a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) || !this.f54142a.getName().equals(typeVariable.getName())) {
                return false;
            }
            return true;
        }
    }

    static class d {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f54143a;

        static {
            Covode.recordClassIndex(33579);
        }

        private d a() {
            return new d(this.f54143a);
        }

        d() {
            this(new AtomicInteger());
        }

        private d(AtomicInteger atomicInteger) {
            this.f54143a = atomicInteger;
        }

        /* access modifiers changed from: package-private */
        public TypeVariable<?> a(Type[] typeArr) {
            return i.a(d.class, "capture#" + this.f54143a.incrementAndGet() + "-of ? extends " + new g("&").a((Object[]) typeArr), typeArr);
        }

        /* access modifiers changed from: package-private */
        public final Type a(Type type) {
            Type a2;
            k.a(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return i.a(a().a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                Class cls = (Class) parameterizedType.getRawType();
                TypeVariable[] typeParameters = cls.getTypeParameters();
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                    final TypeVariable typeVariable = typeParameters[i2];
                    actualTypeArguments[i2] = new d(this.f54143a) {
                        /* class com.google.c.g.f.d.AnonymousClass1 */

                        static {
                            Covode.recordClassIndex(33580);
                        }

                        /* access modifiers changed from: package-private */
                        @Override // com.google.c.g.f.d
                        public final TypeVariable<?> a(Type[] typeArr) {
                            LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                            linkedHashSet.addAll(Arrays.asList(typeVariable.getBounds()));
                            if (linkedHashSet.size() > 1) {
                                linkedHashSet.remove(Object.class);
                            }
                            return super.a((Type[]) linkedHashSet.toArray(new Type[0]));
                        }
                    }.a(actualTypeArguments[i2]);
                }
                d a3 = a();
                Type ownerType = parameterizedType.getOwnerType();
                if (ownerType == null) {
                    a2 = null;
                } else {
                    a2 = a3.a(ownerType);
                }
                return i.a(a2, cls, actualTypeArguments);
            } else if (type instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                if (wildcardType.getLowerBounds().length == 0) {
                    return a(wildcardType.getUpperBounds());
                }
                return type;
            } else {
                throw new AssertionError("must have been one of the known types");
            }
        }

        /* synthetic */ d(AtomicInteger atomicInteger, byte b2) {
            this(atomicInteger);
        }
    }

    static final class a extends h {

        /* renamed from: a  reason: collision with root package name */
        static final d f54136a = new d();

        /* renamed from: b  reason: collision with root package name */
        final Map<c, Type> f54137b = new HashMap();

        static {
            Covode.recordClassIndex(33575);
        }

        a() {
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

        /* access modifiers changed from: package-private */
        @Override // com.google.c.g.h
        public final void a(Class<?> cls) {
            a(cls.getGenericSuperclass());
            a(cls.getGenericInterfaces());
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.g.h
        public final void a(ParameterizedType parameterizedType) {
            boolean z;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            if (typeParameters.length == actualTypeArguments.length) {
                z = true;
            } else {
                z = false;
            }
            k.b(z);
            for (int i2 = 0; i2 < typeParameters.length; i2++) {
                c cVar = new c(typeParameters[i2]);
                Type type = actualTypeArguments[i2];
                if (!this.f54137b.containsKey(cVar)) {
                    Type type2 = type;
                    while (true) {
                        if (type2 == null) {
                            this.f54137b.put(cVar, type);
                            break;
                        } else if (cVar.b(type2)) {
                            while (type != null) {
                                type = this.f54137b.remove(c.a(type));
                            }
                        } else {
                            type2 = this.f54137b.get(c.a(type2));
                        }
                    }
                }
            }
            a(cls);
            a(parameterizedType.getOwnerType());
        }
    }

    /* access modifiers changed from: package-private */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private final ab<c, Type> f54138a;

        static {
            Covode.recordClassIndex(33576);
        }

        b() {
            this.f54138a = ab.of();
        }

        private b(ab<c, Type> abVar) {
            this.f54138a = abVar;
        }

        /* access modifiers changed from: package-private */
        public final b a(Map<c, ? extends Type> map) {
            ab.a builder = ab.builder();
            builder.a(this.f54138a.entrySet());
            for (Map.Entry<c, ? extends Type> entry : map.entrySet()) {
                c key = entry.getKey();
                Type type = (Type) entry.getValue();
                k.a(!key.b(type), "Type variable %s bound to itself", key);
                builder.a(key, type);
            }
            return new b(builder.a());
        }

        /* access modifiers changed from: package-private */
        public Type a(TypeVariable<?> typeVariable, b bVar) {
            Type type = this.f54138a.get(new c(typeVariable));
            if (type != null) {
                return new f(bVar, (byte) 0).a(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length == 0) {
                return typeVariable;
            }
            Type[] a2 = new f(bVar, (byte) 0).a(bounds);
            if (!i.d.f54181a || !Arrays.equals(bounds, a2)) {
                return i.a(typeVariable.getGenericDeclaration(), typeVariable.getName(), a2);
            }
            return typeVariable;
        }
    }

    public f() {
        this.f54133a = new b();
    }

    private f(b bVar) {
        this.f54133a = bVar;
    }

    /* access modifiers changed from: package-private */
    public final f a(Map<c, ? extends Type> map) {
        return new f(this.f54133a.a(map));
    }

    public final Type a(Type type) {
        Type a2;
        k.a(type);
        if (type instanceof TypeVariable) {
            b bVar = this.f54133a;
            TypeVariable<?> typeVariable = (TypeVariable) type;
            return bVar.a(typeVariable, new b(typeVariable, bVar) {
                /* class com.google.c.g.f.b.AnonymousClass1 */

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ TypeVariable f54139a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ b f54140b;

                static {
                    Covode.recordClassIndex(33577);
                }

                @Override // com.google.c.g.f.b
                public final Type a(TypeVariable<?> typeVariable, b bVar) {
                    if (typeVariable.getGenericDeclaration().equals(this.f54139a.getGenericDeclaration())) {
                        return typeVariable;
                    }
                    return this.f54140b.a(typeVariable, bVar);
                }

                {
                    this.f54139a = r2;
                    this.f54140b = r3;
                }
            });
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Type ownerType = parameterizedType.getOwnerType();
            if (ownerType == null) {
                a2 = null;
            } else {
                a2 = a(ownerType);
            }
            return i.a(a2, (Class) a(parameterizedType.getRawType()), a(parameterizedType.getActualTypeArguments()));
        } else if (type instanceof GenericArrayType) {
            return i.a(a(((GenericArrayType) type).getGenericComponentType()));
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new i.h(a(wildcardType.getLowerBounds()), a(wildcardType.getUpperBounds()));
        }
    }

    public final Type[] a(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i2 = 0; i2 < typeArr.length; i2++) {
            typeArr2[i2] = a(typeArr[i2]);
        }
        return typeArr2;
    }

    /* synthetic */ f(b bVar, byte b2) {
        this(bVar);
    }

    public static <T> T a(Class<T> cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(obj + " is not a " + cls.getSimpleName());
        }
    }

    public static void a(final Map<c, Type> map, Type type, final Type type2) {
        if (!type.equals(type2)) {
            new h() {
                /* class com.google.c.g.f.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(33574);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.g.h
                public final void a(TypeVariable<?> typeVariable) {
                    map.put(new c(typeVariable), type2);
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.g.h
                public final void a(Class<?> cls) {
                    if (!(type2 instanceof WildcardType)) {
                        throw new IllegalArgumentException("No type mapping from " + cls + " to " + type2);
                    }
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.g.h
                public final void a(GenericArrayType genericArrayType) {
                    boolean z;
                    Type type = type2;
                    if (!(type instanceof WildcardType)) {
                        Type c2 = i.c(type);
                        if (c2 != null) {
                            z = true;
                        } else {
                            z = false;
                        }
                        k.a(z, "%s is not an array type.", type2);
                        f.a(map, genericArrayType.getGenericComponentType(), c2);
                    }
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.g.h
                public final void a(ParameterizedType parameterizedType) {
                    boolean z;
                    Type type = type2;
                    if (!(type instanceof WildcardType)) {
                        ParameterizedType parameterizedType2 = (ParameterizedType) f.a(ParameterizedType.class, type);
                        if (!(parameterizedType.getOwnerType() == null || parameterizedType2.getOwnerType() == null)) {
                            f.a(map, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
                        }
                        k.a(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, type2);
                        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                        Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                        if (actualTypeArguments.length == actualTypeArguments2.length) {
                            z = true;
                        } else {
                            z = false;
                        }
                        k.a(z, "%s not compatible with %s", parameterizedType, parameterizedType2);
                        for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                            f.a(map, actualTypeArguments[i2], actualTypeArguments2[i2]);
                        }
                    }
                }

                /* access modifiers changed from: package-private */
                @Override // com.google.c.g.h
                public final void a(WildcardType wildcardType) {
                    boolean z;
                    Type type = type2;
                    if (type instanceof WildcardType) {
                        WildcardType wildcardType2 = (WildcardType) type;
                        Type[] upperBounds = wildcardType.getUpperBounds();
                        Type[] upperBounds2 = wildcardType2.getUpperBounds();
                        Type[] lowerBounds = wildcardType.getLowerBounds();
                        Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                        if (upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length) {
                            z = true;
                        } else {
                            z = false;
                        }
                        k.a(z, "Incompatible type: %s vs. %s", wildcardType, type2);
                        for (int i2 = 0; i2 < upperBounds.length; i2++) {
                            f.a(map, upperBounds[i2], upperBounds2[i2]);
                        }
                        for (int i3 = 0; i3 < lowerBounds.length; i3++) {
                            f.a(map, lowerBounds[i3], lowerBounds2[i3]);
                        }
                    }
                }
            }.a(type);
        }
    }
}
