package com.google.gson.internal;

import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.NoSuchElementException;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final Type[] f54742a = new Type[0];

    /* access modifiers changed from: package-private */
    public static final class a implements Serializable, GenericArrayType {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        static {
            Covode.recordClassIndex(33946);
        }

        public final Type getGenericComponentType() {
            return this.componentType;
        }

        public final int hashCode() {
            return this.componentType.hashCode();
        }

        public final String toString() {
            return b.d(this.componentType) + "[]";
        }

        public a(Type type) {
            this.componentType = b.b(type);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !b.a(this, (Type) obj)) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: com.google.gson.internal.b$b  reason: collision with other inner class name */
    public static final class C1246b implements Serializable, ParameterizedType {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        static {
            Covode.recordClassIndex(33947);
        }

        public final Type getOwnerType() {
            return this.ownerType;
        }

        public final Type getRawType() {
            return this.rawType;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        public final int hashCode() {
            int i2;
            int hashCode = Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode();
            Type type = this.ownerType;
            if (type != null) {
                i2 = type.hashCode();
            } else {
                i2 = 0;
            }
            return hashCode ^ i2;
        }

        public final String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return b.d(this.rawType);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(b.d(this.rawType)).append("<").append(b.d(this.typeArguments[0]));
            for (int i2 = 1; i2 < length; i2++) {
                sb.append(", ").append(b.d(this.typeArguments[i2]));
            }
            return sb.append(">").toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !b.a(this, (Type) obj)) {
                return false;
            }
            return true;
        }

        public C1246b(Type type, Type type2, Type... typeArr) {
            Type b2;
            boolean z;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z2 = true;
                if (Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (type == null && !z) {
                    z2 = false;
                }
                a.a(z2);
            }
            if (type == null) {
                b2 = null;
            } else {
                b2 = b.b(type);
            }
            this.ownerType = b2;
            this.rawType = b.b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                a.a(this.typeArguments[i2]);
                b.e(this.typeArguments[i2]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i2] = b.b(typeArr3[i2]);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements Serializable, WildcardType {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        static {
            Covode.recordClassIndex(33948);
        }

        public final Type[] getLowerBounds() {
            Type type = this.lowerBound;
            if (type == null) {
                return b.f54742a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public final int hashCode() {
            int i2;
            Type type = this.lowerBound;
            if (type != null) {
                i2 = type.hashCode() + 31;
            } else {
                i2 = 1;
            }
            return i2 ^ (this.upperBound.hashCode() + 31);
        }

        public final String toString() {
            if (this.lowerBound != null) {
                return "? super " + b.d(this.lowerBound);
            }
            if (this.upperBound == Object.class) {
                return "?";
            }
            return "? extends " + b.d(this.upperBound);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !b.a(this, (Type) obj)) {
                return false;
            }
            return true;
        }

        public c(Type[] typeArr, Type[] typeArr2) {
            boolean z;
            boolean z2;
            boolean z3 = true;
            if (typeArr2.length <= 1) {
                z = true;
            } else {
                z = false;
            }
            a.a(z);
            if (typeArr.length == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            a.a(z2);
            if (typeArr2.length == 1) {
                a.a(typeArr2[0]);
                b.e(typeArr2[0]);
                a.a(typeArr[0] != Object.class ? false : z3);
                this.lowerBound = b.b(typeArr2[0]);
                this.upperBound = Object.class;
                return;
            }
            a.a(typeArr[0]);
            b.e(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = b.b(typeArr[0]);
        }
    }

    static {
        Covode.recordClassIndex(33945);
    }

    public static GenericArrayType a(Type type) {
        return new a(type);
    }

    public static String d(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    static void e(Type type) {
        boolean z;
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            z = true;
        } else {
            z = false;
        }
        a.a(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.gson.internal.b$a] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.reflect.Type b(java.lang.reflect.Type r4) {
        /*
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 == 0) goto L_0x001d
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r0 = r4.isArray()
            if (r0 == 0) goto L_0x001a
            com.google.gson.internal.b$a r1 = new com.google.gson.internal.b$a
            java.lang.Class r0 = r4.getComponentType()
            java.lang.reflect.Type r0 = b(r0)
            r1.<init>(r0)
            r4 = r1
        L_0x001a:
            java.lang.reflect.Type r4 = (java.lang.reflect.Type) r4
            return r4
        L_0x001d:
            boolean r0 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L_0x0035
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            com.google.gson.internal.b$b r3 = new com.google.gson.internal.b$b
            java.lang.reflect.Type r2 = r4.getOwnerType()
            java.lang.reflect.Type r1 = r4.getRawType()
            java.lang.reflect.Type[] r0 = r4.getActualTypeArguments()
            r3.<init>(r2, r1, r0)
            return r3
        L_0x0035:
            boolean r0 = r4 instanceof java.lang.reflect.GenericArrayType
            if (r0 == 0) goto L_0x0045
            java.lang.reflect.GenericArrayType r4 = (java.lang.reflect.GenericArrayType) r4
            com.google.gson.internal.b$a r1 = new com.google.gson.internal.b$a
            java.lang.reflect.Type r0 = r4.getGenericComponentType()
            r1.<init>(r0)
            return r1
        L_0x0045:
            boolean r0 = r4 instanceof java.lang.reflect.WildcardType
            if (r0 == 0) goto L_0x0059
            java.lang.reflect.WildcardType r4 = (java.lang.reflect.WildcardType) r4
            com.google.gson.internal.b$c r2 = new com.google.gson.internal.b$c
            java.lang.reflect.Type[] r1 = r4.getUpperBounds()
            java.lang.reflect.Type[] r0 = r4.getLowerBounds()
            r2.<init>(r1, r0)
            return r2
        L_0x0059:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.b.b(java.lang.reflect.Type):java.lang.reflect.Type");
    }

    public static Class<?> c(Type type) {
        String name;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                a.a(rawType instanceof Class);
                return (Class) rawType;
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(c(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    if (type == null) {
                        name = "null";
                    } else {
                        name = type.getClass().getName();
                    }
                    throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
                }
            }
        }
        return (Class) type;
    }

    public static Type a(Type type, Class<?> cls) {
        Type a2 = a(type, cls, (Class<?>) Collection.class);
        if (a2 instanceof WildcardType) {
            a2 = ((WildcardType) a2).getUpperBounds()[0];
        }
        if (a2 instanceof ParameterizedType) {
            return ((ParameterizedType) a2).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static boolean a(Type type, Type type2) {
        while (type != type2) {
            if (type instanceof Class) {
                return type.equals(type2);
            }
            if (type instanceof ParameterizedType) {
                if (!(type2 instanceof ParameterizedType)) {
                    return false;
                }
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                Type ownerType = parameterizedType.getOwnerType();
                Type ownerType2 = parameterizedType2.getOwnerType();
                if ((ownerType == ownerType2 || (ownerType != null && ownerType.equals(ownerType2))) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                    return true;
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                if (!(type2 instanceof GenericArrayType)) {
                    return false;
                }
                type = ((GenericArrayType) type).getGenericComponentType();
                type2 = ((GenericArrayType) type2).getGenericComponentType();
            } else if (type instanceof WildcardType) {
                if (!(type2 instanceof WildcardType)) {
                    return false;
                }
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                    return false;
                }
                return true;
            } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
                return false;
            } else {
                TypeVariable typeVariable = (TypeVariable) type;
                TypeVariable typeVariable2 = (TypeVariable) type2;
                if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }

    public static ParameterizedType a(Type type, Type type2, Type... typeArr) {
        return new C1246b(type, type2, typeArr);
    }

    public static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        a.a(cls2.isAssignableFrom(cls));
        return a(type, cls, b(type, cls, cls2));
    }

    public static Type a(Type type, Class<?> cls, Type type2) {
        return a(type, cls, type2, new HashSet());
    }

    private static Type b(Type type, Class<?> cls, Class<?> cls2) {
        Class<?> cls3;
        while (cls2 != cls) {
            if (cls2.isInterface()) {
                Class<?>[] interfaces = cls.getInterfaces();
                int i2 = 0;
                int length = interfaces.length;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (interfaces[i2] == cls2) {
                        return cls.getGenericInterfaces()[i2];
                    } else {
                        if (cls2.isAssignableFrom(interfaces[i2])) {
                            type = cls.getGenericInterfaces()[i2];
                            cls3 = interfaces[i2];
                            break;
                        }
                        i2++;
                    }
                }
            }
            if (!cls.isInterface()) {
                while (cls != Object.class) {
                    cls3 = cls.getSuperclass();
                    if (cls3 == cls2) {
                        return cls.getGenericSuperclass();
                    }
                    if (cls2.isAssignableFrom(cls3)) {
                        type = cls.getGenericSuperclass();
                        cls = cls3;
                    } else {
                        cls = cls3;
                    }
                }
            }
            return cls2;
        }
        return type;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:91:? */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:90:0x003d */
    private static Type a(Type type, Class<?> cls, Type type2, Collection<TypeVariable> collection) {
        boolean z;
        TypeVariable typeVariable;
        Class cls2;
        do {
            int i2 = 0;
            if (type2 instanceof TypeVariable) {
                typeVariable = (TypeVariable) type2;
                if (collection.contains(typeVariable)) {
                    return type2;
                }
                collection.add(typeVariable);
                GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
                if (genericDeclaration instanceof Class) {
                    cls2 = (Class) genericDeclaration;
                } else {
                    cls2 = null;
                }
                if (cls2 != null) {
                    Type b2 = b(type, cls, cls2);
                    if (b2 instanceof ParameterizedType) {
                        TypeVariable[] typeParameters = cls2.getTypeParameters();
                        int length = typeParameters.length;
                        while (i2 < length) {
                            if (typeVariable.equals(typeParameters[i2])) {
                                type2 = ((ParameterizedType) b2).getActualTypeArguments()[i2];
                                continue;
                            } else {
                                i2++;
                            }
                        }
                        throw new NoSuchElementException();
                    }
                }
                type2 = typeVariable;
                continue;
            } else {
                if (type2 instanceof Class) {
                    Class cls3 = (Class) type2;
                    if (cls3.isArray()) {
                        Class<?> componentType = cls3.getComponentType();
                        Type a2 = a(type, cls, componentType, collection);
                        if (componentType == a2) {
                            return cls3;
                        }
                        return a(a2);
                    }
                }
                if (type2 instanceof GenericArrayType) {
                    GenericArrayType genericArrayType = (GenericArrayType) type2;
                    Type genericComponentType = genericArrayType.getGenericComponentType();
                    Type a3 = a(type, cls, genericComponentType, collection);
                    if (genericComponentType == a3) {
                        return genericArrayType;
                    }
                    return a(a3);
                } else if (type2 instanceof ParameterizedType) {
                    ParameterizedType parameterizedType = (ParameterizedType) type2;
                    Type ownerType = parameterizedType.getOwnerType();
                    Type a4 = a(type, cls, ownerType, collection);
                    if (a4 != ownerType) {
                        z = true;
                    } else {
                        z = false;
                    }
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    int length2 = actualTypeArguments.length;
                    while (i2 < length2) {
                        Type a5 = a(type, cls, actualTypeArguments[i2], collection);
                        if (a5 != actualTypeArguments[i2]) {
                            if (!z) {
                                actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                z = true;
                            }
                            actualTypeArguments[i2] = a5;
                        }
                        i2++;
                    }
                    if (z) {
                        return a(a4, parameterizedType.getRawType(), actualTypeArguments);
                    }
                    return parameterizedType;
                } else {
                    boolean z2 = type2 instanceof WildcardType;
                    WildcardType wildcardType = type2;
                    if (z2) {
                        WildcardType wildcardType2 = (WildcardType) type2;
                        Type[] lowerBounds = wildcardType2.getLowerBounds();
                        Type[] upperBounds = wildcardType2.getUpperBounds();
                        if (lowerBounds.length == 1) {
                            Type a6 = a(type, cls, lowerBounds[0], collection);
                            wildcardType = wildcardType2;
                            if (a6 != lowerBounds[0]) {
                                return new c(new Type[]{Object.class}, a6 instanceof WildcardType ? ((WildcardType) a6).getLowerBounds() : new Type[]{a6});
                            }
                        } else {
                            wildcardType = wildcardType2;
                            if (upperBounds.length == 1) {
                                Type a7 = a(type, cls, upperBounds[0], collection);
                                wildcardType = wildcardType2;
                                if (a7 != upperBounds[0]) {
                                    return new c(a7 instanceof WildcardType ? ((WildcardType) a7).getUpperBounds() : new Type[]{a7}, f54742a);
                                }
                            }
                        }
                    }
                    return wildcardType;
                }
            }
        } while (type2 != typeVariable);
        return type2;
    }
}
