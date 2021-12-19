package com.squareup.a.a;

import com.bytedance.covode.number.Covode;
import java.io.IOException;
import k.f;
import k.k;
import k.y;

class c extends k {

    /* renamed from: a  reason: collision with root package name */
    private boolean f57723a;

    static {
        Covode.recordClassIndex(35963);
    }

    /* access modifiers changed from: protected */
    public void a() {
    }

    @Override // k.y, java.io.Closeable, k.k, java.lang.AutoCloseable
    public void close() {
        if (!this.f57723a) {
            try {
                super.close();
            } catch (IOException unused) {
                this.f57723a = true;
                a();
            }
        }
    }

    @Override // k.y, k.k, java.io.Flushable
    public void flush() {
        if (!this.f57723a) {
            try {
                super.flush();
            } catch (IOException unused) {
                this.f57723a = true;
                a();
            }
        }
    }

    public c(y yVar) {
        super(yVar);
    }

    @Override // k.y, k.k
    public void write(f fVar, long j2) {
        if (this.f57723a) {
            fVar.l(j2);
            return;
        }
        try {
            super.write(fVar, j2);
        } catch (IOException unused) {
            this.f57723a = true;
            a();
        }
    }
}
