package k;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import h.f.b.l;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

public final class t implements g {

    /* renamed from: a  reason: collision with root package name */
    public final f f158903a = new f();

    /* renamed from: b  reason: collision with root package name */
    public boolean f158904b;

    /* renamed from: c  reason: collision with root package name */
    public final y f158905c;

    static {
        Covode.recordClassIndex(105445);
    }

    @Override // k.g
    public final f a() {
        return this.f158903a;
    }

    public static final class a extends OutputStream {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ t f158906a;

        static {
            Covode.recordClassIndex(105446);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.f158906a.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public final void flush() {
            if (!this.f158906a.f158904b) {
                this.f158906a.flush();
            }
        }

        public final String toString() {
            return this.f158906a + ".outputStream()";
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        a(t tVar) {
            this.f158906a = tVar;
            MethodCollector.i(2639);
            MethodCollector.o(2639);
        }

        @Override // java.io.OutputStream
        public final void write(int i2) {
            if (!this.f158906a.f158904b) {
                this.f158906a.f158903a.a((int) ((byte) i2));
                this.f158906a.b();
                return;
            }
            throw new IOException("closed");
        }

        @Override // java.io.OutputStream
        public final void write(byte[] bArr, int i2, int i3) {
            l.c(bArr, "");
            if (!this.f158906a.f158904b) {
                this.f158906a.f158903a.a(bArr, i2, i3);
                this.f158906a.b();
                return;
            }
            throw new IOException("closed");
        }
    }

    @Override // k.g
    public final OutputStream d() {
        return new a(this);
    }

    public final boolean isOpen() {
        if (!this.f158904b) {
            return true;
        }
        return false;
    }

    @Override // k.y
    public final ab timeout() {
        return this.f158905c.timeout();
    }

    public final String toString() {
        return "buffer(" + this.f158905c + ')';
    }

    @Override // k.g
    public final g b() {
        if (!this.f158904b) {
            long g2 = this.f158903a.g();
            if (g2 > 0) {
                this.f158905c.write(this.f158903a, g2);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public final g c() {
        if (!this.f158904b) {
            long j2 = this.f158903a.f158864b;
            if (j2 > 0) {
                this.f158905c.write(this.f158903a, j2);
            }
            return this;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.io.Closeable, k.y, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (!this.f158904b) {
            Throwable th = null;
            try {
                if (this.f158903a.f158864b > 0) {
                    y yVar = this.f158905c;
                    f fVar = this.f158903a;
                    yVar.write(fVar, fVar.f158864b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.f158905c.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.f158904b = true;
            if (th != null) {
                throw th;
            }
        }
    }

    @Override // k.g, k.y, java.io.Flushable
    public final void flush() {
        if (!this.f158904b) {
            if (this.f158903a.f158864b > 0) {
                y yVar = this.f158905c;
                f fVar = this.f158903a;
                yVar.write(fVar, fVar.f158864b);
            }
            this.f158905c.flush();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    public t(y yVar) {
        l.c(yVar, "");
        this.f158905c = yVar;
    }

    @Override // k.g
    public final long a(aa aaVar) {
        l.c(aaVar, "");
        long j2 = 0;
        while (true) {
            long read = aaVar.read(this.f158903a, 8192);
            if (read == -1) {
                return j2;
            }
            j2 += read;
            b();
        }
    }

    @Override // k.g
    public final g b(int i2) {
        if (!this.f158904b) {
            this.f158903a.b(i2);
            return b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public final g c(int i2) {
        if (!this.f158904b) {
            this.f158903a.c(i2);
            return b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public final g d(int i2) {
        if (!this.f158904b) {
            this.f158903a.d(i2);
            return b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public final g a(int i2) {
        if (!this.f158904b) {
            this.f158903a.a(i2);
            return b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        l.c(byteBuffer, "");
        if (!this.f158904b) {
            int write = this.f158903a.write(byteBuffer);
            b();
            return write;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public final g a(long j2) {
        if (!this.f158904b) {
            this.f158903a.a(j2);
            return b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public final g b(long j2) {
        if (!this.f158904b) {
            this.f158903a.b(j2);
            return b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public final g c(long j2) {
        if (!this.f158904b) {
            this.f158903a.c(j2);
            return b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public final g a(String str) {
        l.c(str, "");
        if (!this.f158904b) {
            this.f158903a.a(str);
            return b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public final g a(i iVar) {
        l.c(iVar, "");
        if (!this.f158904b) {
            this.f158903a.a(iVar);
            return b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public final g a(byte[] bArr) {
        l.c(bArr, "");
        if (!this.f158904b) {
            this.f158903a.a(bArr);
            return b();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.y
    public final void write(f fVar, long j2) {
        l.c(fVar, "");
        if (!this.f158904b) {
            this.f158903a.write(fVar, j2);
            b();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // k.g
    public final g a(byte[] bArr, int i2, int i3) {
        l.c(bArr, "");
        if (!this.f158904b) {
            this.f158903a.a(bArr, i2, i3);
            return b();
        }
        throw new IllegalStateException("closed".toString());
    }
}
