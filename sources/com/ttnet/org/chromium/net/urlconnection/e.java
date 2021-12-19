package com.ttnet.org.chromium.net.urlconnection;

import com.bytedance.covode.number.Covode;
import com.ttnet.org.chromium.net.z;
import java.io.IOException;
import java.io.OutputStream;

public abstract class e extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private IOException f155877a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f155878b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f155879c;

    static {
        Covode.recordClassIndex(103566);
    }

    /* access modifiers changed from: package-private */
    public abstract void a();

    /* access modifiers changed from: package-private */
    public abstract void b();

    /* access modifiers changed from: package-private */
    public abstract z c();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f155878b = true;
    }

    e() {
    }

    /* access modifiers changed from: protected */
    public final void e() {
        IOException iOException = this.f155877a;
        if (iOException != null) {
            throw iOException;
        }
    }

    /* access modifiers changed from: protected */
    public final void d() {
        if (this.f155879c) {
            e();
            throw new IOException("Writing after request completed.");
        } else if (this.f155878b) {
            throw new IOException("Stream has been closed.");
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(IOException iOException) {
        this.f155877a = iOException;
        this.f155879c = true;
    }
}
