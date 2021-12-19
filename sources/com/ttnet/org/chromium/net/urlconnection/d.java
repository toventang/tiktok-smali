package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* access modifiers changed from: package-private */
public final class d extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    private final CronetHttpURLConnection f155873a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f155874b;

    /* renamed from: c  reason: collision with root package name */
    private ByteBuffer f155875c;

    /* renamed from: d  reason: collision with root package name */
    private IOException f155876d;

    static {
        Covode.recordClassIndex(103565);
    }

    private boolean b() {
        ByteBuffer byteBuffer = this.f155875c;
        if (byteBuffer == null || !byteBuffer.hasRemaining()) {
            return false;
        }
        return true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.io.InputStream
    public final void close() {
        CronetHttpURLConnection cronetHttpURLConnection = this.f155873a;
        if (cronetHttpURLConnection != null) {
            cronetHttpURLConnection.disconnect();
        }
        super.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        a();
        if (b()) {
            return this.f155875c.get() & 255;
        }
        return -1;
    }

    private void a() {
        if (this.f155874b) {
            IOException iOException = this.f155876d;
            if (iOException != null) {
                throw iOException;
            }
        } else if (!b()) {
            if (this.f155875c == null) {
                int i2 = 32768;
                if (this.f155873a.f155847k > 32768) {
                    i2 = this.f155873a.f155847k;
                }
                this.f155875c = ByteBuffer.allocateDirect(i2);
            }
            this.f155875c.clear();
            this.f155873a.a(this.f155875c);
            IOException iOException2 = this.f155876d;
            if (iOException2 == null) {
                ByteBuffer byteBuffer = this.f155875c;
                if (byteBuffer != null) {
                    byteBuffer.flip();
                    return;
                }
                return;
            }
            throw iOException2;
        }
    }

    public d(CronetHttpURLConnection cronetHttpURLConnection) {
        MethodCollector.i(11849);
        this.f155873a = cronetHttpURLConnection;
        MethodCollector.o(11849);
    }

    /* access modifiers changed from: package-private */
    public final void a(IOException iOException) {
        this.f155876d = iOException;
        this.f155874b = true;
        this.f155875c = null;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        if (i2 < 0 || i3 < 0 || i2 + i3 > bArr.length) {
            throw new IndexOutOfBoundsException();
        } else if (i3 == 0) {
            return 0;
        } else {
            a();
            if (!b()) {
                return -1;
            }
            int min = Math.min(this.f155875c.limit() - this.f155875c.position(), i3);
            this.f155875c.get(bArr, i2, min);
            return min;
        }
    }
}
