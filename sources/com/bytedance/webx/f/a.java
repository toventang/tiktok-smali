package com.bytedance.webx.f;

import com.bytedance.covode.number.Covode;
import com.bytedance.webx.d.b;
import com.bytedance.webx.d.c;

public abstract class a<T extends c> {

    /* renamed from: a  reason: collision with root package name */
    private T f45990a;

    /* renamed from: b  reason: collision with root package name */
    private b f45991b;

    static {
        Covode.recordClassIndex(28125);
    }

    /* access modifiers changed from: protected */
    public abstract com.bytedance.webx.a a();

    /* access modifiers changed from: protected */
    public final b y() {
        if (this.f45991b == null) {
            this.f45991b = a().f45902e;
        }
        return this.f45991b;
    }

    /* access modifiers changed from: protected */
    public final T x() {
        if (this.f45990a == null) {
            this.f45990a = (T) ((c) a().b());
        }
        return this.f45990a;
    }
}
