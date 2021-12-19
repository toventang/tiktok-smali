package com.lynx.tasm.provider;

import com.bytedance.covode.number.Covode;

public final class j<T> {

    /* renamed from: a  reason: collision with root package name */
    public Throwable f56823a;

    /* renamed from: b  reason: collision with root package name */
    public int f56824b;

    /* renamed from: c  reason: collision with root package name */
    public T f56825c;

    static {
        Covode.recordClassIndex(35389);
    }

    public final boolean a() {
        if (this.f56825c != null) {
            return true;
        }
        return false;
    }

    private j(T t) {
        this.f56825c = t;
    }

    public static j a(Throwable th) {
        return new j(th);
    }

    private j(Throwable th) {
        this.f56824b = -1;
        this.f56823a = th;
    }

    public static <T> j<T> a(T t) {
        j<T> jVar = new j<>((Object) t);
        jVar.f56824b = 0;
        return jVar;
    }
}
