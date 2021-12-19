package com.bytedance.retrofit2;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Objects;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    static final Type[] f42633a = new Type[0];

    /* access modifiers changed from: package-private */
    public static final class a implements GenericArrayType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f42635a;

        static {
            Covode.recordClassIndex(26097);
        }

        public final Type getGenericComponentType() {
            return this.f42635a;
        }

        public final int hashCode() {
            return this.f42635a.hashCode();
        }

        public final String toString() {
            return w.b(this.f42635a) + "[]";
        }

        public a(Type type) {
            this.f42635a = type;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof GenericArrayType) || !w.a(this, (Type) obj)) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b implements ParameterizedType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f42636a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f42637b;

        /* renamed from: c  reason: collision with root package name */
        private final Type[] f42638c;

        static {
            Covode.recordClassIndex(26098);
        }

        public final Type getOwnerType() {
            return this.f42636a;
        }

        public final Type getRawType() {
            return this.f42637b;
        }

        public final Type[] getActualTypeArguments() {
            return (Type[]) this.f42638c.clone();
        }

        public final int hashCode() {
            int i2;
            int hashCode = Arrays.hashCode(this.f42638c) ^ this.f42637b.hashCode();
            Type type = this.f42636a;
            if (type != null) {
                i2 = type.hashCode();
            } else {
                i2 = 0;
            }
            return hashCode ^ i2;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder((this.f42638c.length + 1) * 30);
            sb.append(w.b(this.f42637b));
            if (this.f42638c.length == 0) {
                return sb.toString();
            }
            sb.append("<").append(w.b(this.f42638c[0]));
            for (int i2 = 1; i2 < this.f42638c.length; i2++) {
                sb.append(", ").append(w.b(this.f42638c[i2]));
            }
            return sb.append(">").toString();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType) || !w.a(this, (Type) obj)) {
                return false;
            }
            return true;
        }

        public b(Type type, Type type2, Type... typeArr) {
            boolean z;
            if (type2 instanceof Class) {
                boolean z2 = true;
                if (type == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z != (((Class) type2).getEnclosingClass() != null ? false : z2)) {
                    throw new IllegalArgumentException();
                }
            }
            this.f42636a = type;
            this.f42637b = type2;
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f42638c = typeArr2;
            for (Type type3 : typeArr2) {
                Objects.requireNonNull(type3);
                w.c(type3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c implements WildcardType {

        /* renamed from: a  reason: collision with root package name */
        private final Type f42639a;

        /* renamed from: b  reason: collision with root package name */
        private final Type f42640b;

        static {
            Covode.recordClassIndex(26099);
        }

        public final Type[] getLowerBounds() {
            Type type = this.f42640b;
            if (type == null) {
                return w.f42633a;
            }
            return new Type[]{type};
        }

        public final Type[] getUpperBounds() {
            return new Type[]{this.f42639a};
        }

        public final int hashCode() {
            int i2;
            Type type = this.f42640b;
            if (type != null) {
                i2 = type.hashCode() + 31;
            } else {
                i2 = 1;
            }
            return i2 ^ (this.f42639a.hashCode() + 31);
        }

        public final String toString() {
            if (this.f42640b != null) {
                return "? super " + w.b(this.f42640b);
            }
            if (this.f42639a == Object.class) {
                return "?";
            }
            return "? extends " + w.b(this.f42639a);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof WildcardType) || !w.a(this, (Type) obj)) {
                return false;
            }
            return true;
        }

        public c(Type[] typeArr, Type[] typeArr2) {
            if (typeArr2.length > 1) {
                throw new IllegalArgumentException();
            } else if (typeArr2.length == 1) {
                Objects.requireNonNull(typeArr2[0]);
                w.c(typeArr2[0]);
                if (typeArr[0] == Object.class) {
                    this.f42640b = typeArr2[0];
                    this.f42639a = Object.class;
                    return;
                }
                throw new IllegalArgumentException();
            } else {
                Objects.requireNonNull(typeArr[0]);
                w.c(typeArr[0]);
                this.f42640b = null;
                this.f42639a = typeArr[0];
            }
        }
    }

    static {
        Covode.recordClassIndex(26095);
    }

    static String b(Type type) {
        if (type instanceof Class) {
            return ((Class) type).getName();
        }
        return type.toString();
    }

    static void c(Type type) {
        if ((type instanceof Class) && ((Class) type).isPrimitive()) {
            throw new IllegalArgumentException();
        }
    }

    static Type e(Type type) {
        if (type instanceof ParameterizedType) {
            return a(0, (ParameterizedType) type);
        }
        throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
    }

    static <T> void a(Class<T> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        } else if (cls.getInterfaces().length > 0) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    public static boolean b(String str) {
        if (a(str) || str.equals(com.bytedance.d.a.a.a.a.a.f28515e) || str.equals(com.bytedance.d.a.a.a.a.a.f28514d) || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK")) {
            return true;
        }
        return false;
    }

    public static Class<?> a(Type type) {
        while (true) {
            Objects.requireNonNull(type, "type == null");
            if (type instanceof Class) {
                return (Class) type;
            }
            if (type instanceof ParameterizedType) {
                Type rawType = ((ParameterizedType) type).getRawType();
                if (rawType instanceof Class) {
                    return (Class) rawType;
                }
                throw new IllegalArgumentException();
            } else if (type instanceof GenericArrayType) {
                return Array.newInstance(a(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
            } else {
                if (type instanceof TypeVariable) {
                    return Object.class;
                }
                if (type instanceof WildcardType) {
                    type = ((WildcardType) type).getUpperBounds()[0];
                } else {
                    throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
                }
            }
        }
    }

    static boolean d(Type type) {
        String name;
        while (!(type instanceof Class)) {
            if (type instanceof ParameterizedType) {
                for (Type type2 : ((ParameterizedType) type).getActualTypeArguments()) {
                    if (d(type2)) {
                        return true;
                    }
                }
                return false;
            } else if (type instanceof GenericArrayType) {
                type = ((GenericArrayType) type).getGenericComponentType();
            } else if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
                return true;
            } else {
                if (type == null) {
                    name = "null";
                } else {
                    name = type.getClass().getName();
                }
                throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
            }
        }
        return false;
    }

    public static boolean a(String str) {
        if (str.equals("POST") || str.equals(com.bytedance.d.a.a.a.a.a.f28513c) || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("REPORT")) {
            return true;
        }
        return false;
    }

    static <T> T a(T t, String str) {
        Objects.requireNonNull(t, str);
        return t;
    }

    public static Type a(int i2, ParameterizedType parameterizedType) {
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i2 < 0 || i2 >= actualTypeArguments.length) {
            throw new IllegalArgumentException("Index " + i2 + " not in range [0," + actualTypeArguments.length + ") for " + parameterizedType);
        }
        Type type = actualTypeArguments[i2];
        if (type instanceof WildcardType) {
            return ((WildcardType) type).getUpperBounds()[0];
        }
        return type;
    }

    static boolean a(Type type, Type type2) {
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

    static Type a(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return a(type, cls, b(type, cls, cls2));
        }
        throw new IllegalArgumentException();
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

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:79:? */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0035 A[LOOP:0: B:0:0x0000->B:16:0x0035, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0034 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type a(java.lang.reflect.Type r7, java.lang.Class<?> r8, java.lang.reflect.Type r9) {
        /*
        // Method dump skipped, instructions count: 256
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.retrofit2.w.a(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type):java.lang.reflect.Type");
    }
}
