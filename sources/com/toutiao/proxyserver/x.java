package com.toutiao.proxyserver;

import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

final class x {

    /* renamed from: a  reason: collision with root package name */
    final RandomAccessFile f155049a;

    static {
        Covode.recordClassIndex(103214);
    }

    static class a extends Exception {
        static {
            Covode.recordClassIndex(103215);
        }

        a() {
        }

        a(Throwable th) {
            super(th);
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(byte[] bArr) {
        try {
            return this.f155049a.read(bArr);
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2) {
        try {
            this.f155049a.seek(j2);
        } catch (IOException e2) {
            throw new a(e2);
        }
    }

    x(File file, String str) {
        try {
            this.f155049a = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e2) {
            throw new a(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(byte[] bArr, int i2, int i3) {
        try {
            this.f155049a.write(bArr, i2, i3);
        } catch (IOException e2) {
            throw new a(e2);
        }
    }
}
