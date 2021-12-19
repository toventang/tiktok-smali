package com.google.c.g;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.Arrays;

public abstract class b<T, R> extends a implements GenericDeclaration {
    static {
        Covode.recordClassIndex(33567);
    }

    /* access modifiers changed from: package-private */
    public abstract Type[] b();

    /* renamed from: com.google.c.g.b$b  reason: collision with other inner class name */
    static class C1235b<T> extends b<T, Object> {

        /* renamed from: a  reason: collision with root package name */
        final Method f54131a;

        static {
            Covode.recordClassIndex(33569);
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.g.b
        public Type[] b() {
            return this.f54131a.getGenericParameterTypes();
        }

        @Override // java.lang.reflect.GenericDeclaration
        public final TypeVariable<?>[] getTypeParameters() {
            return this.f54131a.getTypeParameters();
        }

        C1235b(Method method) {
            super(method);
            this.f54131a = method;
        }
    }

    @Override // com.google.c.g.a, java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        return (Class<? super T>) super.getDeclaringClass();
    }

    @Override // com.google.c.g.a
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.c.g.a
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.c.g.a
    public g<T> a() {
        return g.of((Class) getDeclaringClass());
    }

    static class a<T> extends b<T, T> {

        /* renamed from: a  reason: collision with root package name */
        final Constructor<?> f54130a;

        static {
            Covode.recordClassIndex(33568);
        }

        @Override // java.lang.reflect.GenericDeclaration
        public final TypeVariable<?>[] getTypeParameters() {
            TypeVariable<Class<? super T>>[] typeParameters = getDeclaringClass().getTypeParameters();
            TypeVariable<Constructor<?>>[] typeParameters2 = this.f54130a.getTypeParameters();
            TypeVariable<?>[] typeVariableArr = new TypeVariable[(typeParameters.length + typeParameters2.length)];
            System.arraycopy(typeParameters, 0, typeVariableArr, 0, typeParameters.length);
            System.arraycopy(typeParameters2, 0, typeVariableArr, typeParameters.length, typeParameters2.length);
            return typeVariableArr;
        }

        /* access modifiers changed from: package-private */
        @Override // com.google.c.g.b
        public Type[] b() {
            Type[] genericParameterTypes = this.f54130a.getGenericParameterTypes();
            if (genericParameterTypes.length <= 0) {
                return genericParameterTypes;
            }
            Class<?> declaringClass = this.f54130a.getDeclaringClass();
            if (declaringClass.getEnclosingConstructor() == null) {
                Method enclosingMethod = declaringClass.getEnclosingMethod();
                if (enclosingMethod != null) {
                    if (Modifier.isStatic(enclosingMethod.getModifiers())) {
                        return genericParameterTypes;
                    }
                } else if (declaringClass.getEnclosingClass() == null || Modifier.isStatic(declaringClass.getModifiers())) {
                    return genericParameterTypes;
                }
            }
            Class<?>[] parameterTypes = this.f54130a.getParameterTypes();
            if (genericParameterTypes.length == parameterTypes.length && parameterTypes[0] == getDeclaringClass().getEnclosingClass()) {
                return (Type[]) Arrays.copyOfRange(genericParameterTypes, 1, genericParameterTypes.length);
            }
            return genericParameterTypes;
        }

        a(Constructor<?> constructor) {
            super(constructor);
            this.f54130a = constructor;
        }
    }

    <M extends AccessibleObject & Member> b(M m2) {
        super(m2);
    }

    @Override // com.google.c.g.a
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }
}
