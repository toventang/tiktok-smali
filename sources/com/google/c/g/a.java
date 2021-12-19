package com.google.c.g;

import com.bytedance.covode.number.Covode;
import com.google.c.a.k;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Member;

class a extends AccessibleObject implements Member {

    /* renamed from: a  reason: collision with root package name */
    private final AccessibleObject f54128a;

    /* renamed from: b  reason: collision with root package name */
    private final Member f54129b;

    static {
        Covode.recordClassIndex(33566);
    }

    public final Annotation[] getAnnotations() {
        return this.f54128a.getAnnotations();
    }

    public final Annotation[] getDeclaredAnnotations() {
        return this.f54128a.getDeclaredAnnotations();
    }

    @Override // java.lang.reflect.Member
    public Class<?> getDeclaringClass() {
        return this.f54129b.getDeclaringClass();
    }

    public final int getModifiers() {
        return this.f54129b.getModifiers();
    }

    public final String getName() {
        return this.f54129b.getName();
    }

    public int hashCode() {
        return this.f54129b.hashCode();
    }

    public final boolean isAccessible() {
        return this.f54128a.isAccessible();
    }

    public final boolean isSynthetic() {
        return this.f54129b.isSynthetic();
    }

    public String toString() {
        return this.f54129b.toString();
    }

    public g<?> a() {
        return g.of((Class) getDeclaringClass());
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        return (A) this.f54128a.getAnnotation(cls);
    }

    @Override // java.lang.reflect.AccessibleObject, java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        return this.f54128a.isAnnotationPresent(cls);
    }

    @Override // java.lang.reflect.AccessibleObject
    public final void setAccessible(boolean z) {
        this.f54128a.setAccessible(z);
    }

    <M extends AccessibleObject & Member> a(M m2) {
        k.a(m2);
        this.f54128a = m2;
        this.f54129b = m2;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (!a().equals(aVar.a()) || !this.f54129b.equals(aVar.f54129b)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
