package com.squareup.a.a;

import com.a;
import com.bytedance.covode.number.Covode;

public abstract class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected final String f57753a;

    static {
        Covode.recordClassIndex(35975);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.f57753a);
        try {
            a();
        } finally {
            Thread.currentThread().setName(name);
        }
    }

    public f(String str, Object... objArr) {
        this.f57753a = a.a(str, objArr);
    }
}
