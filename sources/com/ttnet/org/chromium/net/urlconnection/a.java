package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.aa;
import com.ttnet.org.chromium.net.z;
import java.net.ProtocolException;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    public final int f155851a;

    /* renamed from: b  reason: collision with root package name */
    public ByteBuffer f155852b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f155853c;

    /* renamed from: d  reason: collision with root package name */
    private final CronetHttpURLConnection f155854d;

    /* renamed from: e  reason: collision with root package name */
    private final z f155855e = new C4118a(this, (byte) 0);

    static {
        Covode.recordClassIndex(103559);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.e
    public final void b() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.e
    public final z c() {
        return this.f155855e;
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.e
    public final void a() {
        this.f155853c = true;
        if (this.f155852b.position() >= this.f155851a) {
            this.f155852b.flip();
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length");
    }

    /* renamed from: com.ttnet.org.chromium.net.urlconnection.a$a  reason: collision with other inner class name */
    class C4118a extends z {
        static {
            Covode.recordClassIndex(103560);
        }

        @Override // com.ttnet.org.chromium.net.z
        public final long a() {
            int i2;
            if (a.this.f155851a != -1) {
                i2 = a.this.f155851a;
            } else if (a.this.f155853c) {
                i2 = a.this.f155852b.limit();
            } else {
                i2 = a.this.f155852b.position();
            }
            return (long) i2;
        }

        private C4118a() {
        }

        @Override // com.ttnet.org.chromium.net.z
        public final void a(aa aaVar) {
            a.this.f155852b.position(0);
            aaVar.a();
        }

        /* synthetic */ C4118a(a aVar, byte b2) {
            this();
        }

        @Override // com.ttnet.org.chromium.net.z
        public final void a(aa aaVar, ByteBuffer byteBuffer) {
            int remaining = byteBuffer.remaining();
            if (remaining < a.this.f155852b.remaining()) {
                byteBuffer.put(a.this.f155852b.array(), a.this.f155852b.position(), remaining);
                a.this.f155852b.position(a.this.f155852b.position() + remaining);
            } else {
                byteBuffer.put(a.this.f155852b);
            }
            aaVar.a(false);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        d();
        a(1);
        this.f155852b.put((byte) i2);
    }

    a(CronetHttpURLConnection cronetHttpURLConnection) {
        this.f155854d = cronetHttpURLConnection;
        this.f155851a = -1;
        this.f155852b = ByteBuffer.allocate(16384);
    }

    private void a(int i2) {
        if (this.f155851a != -1 && this.f155852b.position() + i2 > this.f155851a) {
            throw new ProtocolException("exceeded content-length limit of " + this.f155851a + " bytes");
        } else if (this.f155853c) {
            throw new IllegalStateException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for writing after connect");
        } else if (this.f155851a == -1 && this.f155852b.limit() - this.f155852b.position() <= i2) {
            ByteBuffer allocate = ByteBuffer.allocate(Math.max(this.f155852b.capacity() * 2, this.f155852b.capacity() + i2));
            this.f155852b.flip();
            allocate.put(this.f155852b);
            this.f155852b = allocate;
        }
    }

    a(CronetHttpURLConnection cronetHttpURLConnection, long j2) {
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException("Use setFixedLengthStreamingMode() or setChunkedStreamingMode() for requests larger than 2GB.");
        } else if (j2 >= 0) {
            this.f155854d = cronetHttpURLConnection;
            int i2 = (int) j2;
            this.f155851a = i2;
            this.f155852b = ByteBuffer.allocate(i2);
        } else {
            throw new IllegalArgumentException("Content length < 0.");
        }
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        d();
        a(i3);
        this.f155852b.put(bArr, i2, i3);
    }
}
