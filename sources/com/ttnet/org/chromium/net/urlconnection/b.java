package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.aa;
import com.ttnet.org.chromium.net.z;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public final f f155857a;

    /* renamed from: b  reason: collision with root package name */
    public final ByteBuffer f155858b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f155859c;

    /* renamed from: d  reason: collision with root package name */
    private final CronetHttpURLConnection f155860d;

    /* renamed from: e  reason: collision with root package name */
    private final z f155861e = new a(this, (byte) 0);

    static {
        Covode.recordClassIndex(103561);
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.e
    public final void a() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.e
    public final void b() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.e
    public final z c() {
        return this.f155861e;
    }

    private void f() {
        if (!this.f155858b.hasRemaining()) {
            g();
        }
    }

    @Override // com.ttnet.org.chromium.net.urlconnection.e, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        if (!this.f155859c) {
            this.f155859c = true;
            this.f155858b.flip();
        }
    }

    private void g() {
        d();
        this.f155858b.flip();
        a(this.f155860d.getReadTimeout());
        e();
    }

    class a extends z {
        static {
            Covode.recordClassIndex(103562);
        }

        @Override // com.ttnet.org.chromium.net.z
        public final long a() {
            return -1;
        }

        private a() {
        }

        @Override // com.ttnet.org.chromium.net.z
        public final void a(aa aaVar) {
            aaVar.a(new HttpRetryException("Cannot retry streamed Http body", -1));
        }

        /* synthetic */ a(b bVar, byte b2) {
            this();
        }

        @Override // com.ttnet.org.chromium.net.z
        public final void a(aa aaVar, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= b.this.f155858b.remaining()) {
                byteBuffer.put(b.this.f155858b);
                b.this.f155858b.clear();
                aaVar.a(b.this.f155859c);
                if (!b.this.f155859c) {
                    b.this.f155857a.b();
                    return;
                }
                return;
            }
            int limit = b.this.f155858b.limit();
            b.this.f155858b.limit(b.this.f155858b.position() + byteBuffer.remaining());
            byteBuffer.put(b.this.f155858b);
            b.this.f155858b.limit(limit);
            aaVar.a(false);
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        f();
        this.f155858b.put((byte) i2);
    }

    private void a(int i2) {
        try {
            this.f155857a.a(i2);
        } catch (SocketTimeoutException unused) {
            CronetHttpURLConnection cronetHttpURLConnection = this.f155860d;
            if (cronetHttpURLConnection != null) {
                cronetHttpURLConnection.a();
                this.f155857a.a();
                this.f155857a.a(i2 / 2);
            }
        } catch (Exception e2) {
            CronetHttpURLConnection cronetHttpURLConnection2 = this.f155860d;
            if (cronetHttpURLConnection2 != null) {
                cronetHttpURLConnection2.setException(new IOException("Unexpected request usage, caught in CronetChunkedOutputStream, caused by ".concat(String.valueOf(e2))));
                this.f155857a.a();
                this.f155857a.a(i2 / 2);
            }
        }
    }

    b(CronetHttpURLConnection cronetHttpURLConnection, int i2, f fVar) {
        if (i2 > 0) {
            this.f155858b = ByteBuffer.allocate(i2);
            this.f155860d = cronetHttpURLConnection;
            this.f155857a = fVar;
            return;
        }
        throw new IllegalArgumentException("chunkLength should be greater than 0");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        d();
        if (bArr.length - i2 < i3 || i2 < 0 || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        int i4 = i3;
        while (i4 > 0) {
            int min = Math.min(i4, this.f155858b.remaining());
            this.f155858b.put(bArr, (i2 + i3) - i4, min);
            i4 -= min;
            f();
        }
    }
}
