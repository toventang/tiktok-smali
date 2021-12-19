package com.ss.android.k;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.RandomAccessFile;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final RandomAccessFile f59600a;

    static {
        Covode.recordClassIndex(36788);
    }

    @Override // com.ss.android.k.b
    public final void b() {
        this.f59600a.close();
    }

    @Override // com.ss.android.k.b
    public final long a() {
        return this.f59600a.length();
    }

    public a(File file) {
        this.f59600a = new RandomAccessFile(file, "r");
    }

    @Override // com.ss.android.k.b
    public final void a(long j2) {
        this.f59600a.seek(j2);
    }

    @Override // com.ss.android.k.b
    public final int a(byte[] bArr, int i2) {
        return this.f59600a.read(bArr, 0, i2);
    }
}
