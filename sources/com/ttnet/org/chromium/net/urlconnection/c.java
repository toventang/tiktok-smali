package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.aa;
import com.ttnet.org.chromium.net.z;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class c extends e {

    /* renamed from: f  reason: collision with root package name */
    private static int f155863f = 16384;

    /* renamed from: a  reason: collision with root package name */
    public final f f155864a;

    /* renamed from: b  reason: collision with root package name */
    public final long f155865b;

    /* renamed from: c  reason: collision with root package name */
    public final ByteBuffer f155866c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f155867d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f155868e;

    /* renamed from: g  reason: collision with root package name */
    private final CronetHttpURLConnection f155869g;

    /* renamed from: h  reason: collision with root package name */
    private final z f155870h = new a(this, (byte) 0);

    /* renamed from: i  reason: collision with root package name */
    private long f155871i;

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.e
    public final void a() {
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.e
    public final z c() {
        return this.f155870h;
    }

    class a extends z {
        static {
            Covode.recordClassIndex(103564);
        }

        @Override // com.ttnet.org.chromium.net.z
        public final long a() {
            return c.this.f155865b;
        }

        private a() {
        }

        @Override // com.ttnet.org.chromium.net.z
        public final void a(aa aaVar) {
            if (c.this.f155867d) {
                c.this.f155868e = true;
                c.this.f155866c.rewind();
                aaVar.a();
                return;
            }
            aaVar.a(new HttpRetryException("Cannot retry streamed Http body", -1));
        }

        /* synthetic */ a(c cVar, byte b2) {
            this();
        }

        @Override // com.ttnet.org.chromium.net.z
        public final void a(aa aaVar, ByteBuffer byteBuffer) {
            if (byteBuffer.remaining() >= c.this.f155866c.remaining()) {
                byteBuffer.put(c.this.f155866c);
                c.this.f155866c.clear();
                aaVar.a(false);
                if (!c.this.f155868e) {
                    c.this.f155864a.b();
                    return;
                }
                return;
            }
            int limit = c.this.f155866c.limit();
            c.this.f155866c.limit(c.this.f155866c.position() + byteBuffer.remaining());
            byteBuffer.put(c.this.f155866c);
            c.this.f155866c.limit(limit);
            aaVar.a(false);
        }
    }

    static {
        Covode.recordClassIndex(103563);
    }

    private void f() {
        if (!this.f155866c.hasRemaining()) {
            this.f155867d = false;
            h();
        }
    }

    private void g() {
        if (this.f155871i == this.f155865b) {
            h();
        }
    }

    private void h() {
        d();
        this.f155866c.flip();
        a(this.f155869g.getReadTimeout());
        e();
    }

    /* access modifiers changed from: package-private */
    @Override // com.ttnet.org.chromium.net.urlconnection.e
    public final void b() {
        if (this.f155871i < this.f155865b) {
            throw new ProtocolException("Content received is less than Content-Length.");
        }
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        d();
        b(1);
        f();
        this.f155866c.put((byte) i2);
        this.f155871i++;
        g();
    }

    private void a(int i2) {
        try {
            this.f155864a.a(i2);
        } catch (SocketTimeoutException unused) {
            CronetHttpURLConnection cronetHttpURLConnection = this.f155869g;
            if (cronetHttpURLConnection != null) {
                cronetHttpURLConnection.a();
                this.f155864a.a();
                this.f155864a.a(i2 / 2);
            }
        } catch (Exception e2) {
            CronetHttpURLConnection cronetHttpURLConnection2 = this.f155869g;
            if (cronetHttpURLConnection2 != null) {
                cronetHttpURLConnection2.setException(new IOException("Unexpected request usage, caught in CronetFixedModeOutputStream, caused by ".concat(String.valueOf(e2))));
                this.f155864a.a();
                this.f155864a.a(i2 / 2);
            }
        }
    }

    private void b(int i2) {
        if (this.f155871i + ((long) i2) > this.f155865b) {
            throw new ProtocolException("expected " + (this.f155865b - this.f155871i) + " bytes but received " + i2);
        }
    }

    c(CronetHttpURLConnection cronetHttpURLConnection, long j2, f fVar) {
        if (j2 >= 0) {
            this.f155865b = j2;
            this.f155866c = ByteBuffer.allocate((int) Math.min(j2, (long) f155863f));
            this.f155869g = cronetHttpURLConnection;
            this.f155864a = fVar;
            this.f155871i = 0;
            this.f155867d = true;
            this.f155868e = false;
            return;
        }
        throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        d();
        if (bArr.length - i2 < i3 || i2 < 0 || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        b(i3);
        int i4 = i3;
        while (i4 > 0) {
            f();
            int min = Math.min(i4, this.f155866c.remaining());
            this.f155866c.put(bArr, (i2 + i3) - i4, min);
            i4 -= min;
        }
        this.f155871i += (long) i3;
        g();
    }
}
