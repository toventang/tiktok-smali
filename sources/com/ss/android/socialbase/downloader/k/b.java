package com.ss.android.socialbase.downloader.k;

import com.bytedance.covode.number.Covode;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public final class b implements com.ss.android.k.b {

    /* renamed from: a  reason: collision with root package name */
    private final FileInputStream f60737a;

    /* renamed from: b  reason: collision with root package name */
    private final FileChannel f60738b;

    /* renamed from: c  reason: collision with root package name */
    private final ByteBuffer f60739c = ByteBuffer.allocate(8192);

    static {
        Covode.recordClassIndex(37478);
    }

    @Override // com.ss.android.k.b
    public final long a() {
        return this.f60738b.size();
    }

    @Override // com.ss.android.k.b
    public final void b() {
        g.a(this.f60738b, this.f60737a);
    }

    @Override // com.ss.android.k.b
    public final void a(long j2) {
        this.f60738b.position(j2);
    }

    public b(FileInputStream fileInputStream) {
        this.f60737a = fileInputStream;
        this.f60738b = fileInputStream.getChannel();
    }

    @Override // com.ss.android.k.b
    public final int a(byte[] bArr, int i2) {
        int read = this.f60738b.read(this.f60739c);
        if (read != -1) {
            this.f60739c.flip();
            this.f60739c.get(bArr, 0, read);
            this.f60739c.clear();
        }
        return read;
    }
}
