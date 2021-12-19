package com.bytedance.lottie.f;

import com.bytedance.covode.number.Covode;

public abstract class g<T> {

    /* renamed from: a  reason: collision with root package name */
    private T[] f40698a = a();

    static {
        Covode.recordClassIndex(24983);
    }

    /* access modifiers changed from: protected */
    public abstract T[] a();

    public final T b() {
        T[] tArr = this.f40698a;
        if (tArr[0] != null) {
            T t = tArr[0];
            tArr[0] = null;
            return t;
        } else if (tArr[1] != null) {
            T t2 = tArr[1];
            tArr[1] = null;
            return t2;
        } else if (tArr[2] == null) {
            return null;
        } else {
            T t3 = tArr[2];
            tArr[2] = null;
            return t3;
        }
    }

    public final void a(T t) {
        T[] tArr = this.f40698a;
        if (tArr[0] == null) {
            tArr[0] = t;
        } else if (tArr[1] == null) {
            tArr[1] = t;
        } else if (tArr[2] == null) {
            tArr[2] = t;
        }
    }
}
