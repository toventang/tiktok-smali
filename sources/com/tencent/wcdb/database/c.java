package com.tencent.wcdb.database;

import com.bytedance.covode.number.Covode;
import java.io.Closeable;

public abstract class c implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private int f154598a = 1;

    static {
        Covode.recordClassIndex(103050);
    }

    /* access modifiers changed from: protected */
    public abstract void c();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        e();
    }

    public final void d() {
        synchronized (this) {
            int i2 = this.f154598a;
            if (i2 > 0) {
                this.f154598a = i2 + 1;
            } else {
                throw new IllegalStateException("attempt to re-open an already-closed object: ".concat(String.valueOf(this)));
            }
        }
    }

    public final void e() {
        boolean z;
        synchronized (this) {
            z = true;
            int i2 = this.f154598a - 1;
            this.f154598a = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            c();
        }
    }
}
