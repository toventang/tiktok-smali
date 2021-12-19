package com.squareup.a.a.b;

import com.bytedance.covode.number.Covode;
import com.squareup.a.a.j;
import java.net.ProtocolException;
import k.ab;
import k.f;
import k.y;

public final class o implements y {

    /* renamed from: a  reason: collision with root package name */
    public final f f57700a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f57701b;

    /* renamed from: c  reason: collision with root package name */
    private final int f57702c;

    static {
        Covode.recordClassIndex(35958);
    }

    @Override // k.y, java.io.Flushable
    public final void flush() {
    }

    @Override // k.y
    public final ab timeout() {
        return ab.NONE;
    }

    public o() {
        this(-1);
    }

    @Override // k.y, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.f57701b) {
            this.f57701b = true;
            if (this.f57700a.f158864b < ((long) this.f57702c)) {
                throw new ProtocolException("content-length promised " + this.f57702c + " bytes, but received " + this.f57700a.f158864b);
            }
        }
    }

    public o(int i2) {
        this.f57700a = new f();
        this.f57702c = i2;
    }

    public final void a(y yVar) {
        f fVar = new f();
        f fVar2 = this.f57700a;
        fVar2.a(fVar, 0, fVar2.f158864b);
        yVar.write(fVar, fVar.f158864b);
    }

    @Override // k.y
    public final void write(f fVar, long j2) {
        if (!this.f57701b) {
            j.a(fVar.f158864b, j2);
            if (this.f57702c == -1 || this.f57700a.f158864b <= ((long) this.f57702c) - j2) {
                this.f57700a.write(fVar, j2);
                return;
            }
            throw new ProtocolException("exceeded content-length limit of " + this.f57702c + " bytes");
        }
        throw new IllegalStateException("closed");
    }
}
