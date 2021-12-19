package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

final class al extends FilterInputStream {

    /* renamed from: a  reason: collision with root package name */
    public long f52794a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f52795b = false;

    /* renamed from: c  reason: collision with root package name */
    public boolean f52796c = false;

    /* renamed from: d  reason: collision with root package name */
    private final by f52797d = new by();

    /* renamed from: e  reason: collision with root package name */
    private byte[] f52798e = new byte[4096];

    static {
        Covode.recordClassIndex(32677);
    }

    al(InputStream inputStream) {
        super(inputStream);
        MethodCollector.i(7284);
        MethodCollector.o(7284);
    }

    private final int a(byte[] bArr, int i2, int i3) {
        MethodCollector.i(7363);
        int max = Math.max(0, super.read(bArr, i2, i3));
        MethodCollector.o(7363);
        return max;
    }

    private final boolean a(int i2) {
        int a2 = a(this.f52798e, 0, i2);
        if (a2 != i2) {
            int i3 = i2 - a2;
            if (a(this.f52798e, a2, i3) != i3) {
                this.f52797d.a(this.f52798e, 0, a2);
                return false;
            }
        }
        this.f52797d.a(this.f52798e, 0, i2);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final cs a() {
        byte[] bArr;
        if (this.f52794a > 0) {
            do {
                bArr = this.f52798e;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (this.f52795b || this.f52796c) {
            return new cs(null, -1, -1, false, false, null);
        }
        if (!a(30)) {
            this.f52795b = true;
            return this.f52797d.a();
        }
        cs a2 = this.f52797d.a();
        if (a2.f53007e) {
            this.f52796c = true;
            return a2;
        } else if (a2.f53004b != 4294967295L) {
            int i2 = this.f52797d.f52936a - 30;
            long j2 = (long) i2;
            int length = this.f52798e.length;
            if (j2 > ((long) length)) {
                do {
                    length += length;
                } while (((long) length) < j2);
                this.f52798e = Arrays.copyOf(this.f52798e, length);
            }
            if (!a(i2)) {
                this.f52795b = true;
                return this.f52797d.a();
            }
            cs a3 = this.f52797d.a();
            this.f52794a = a3.f53004b;
            return a3;
        } else {
            throw new au("Files bigger than 4GiB are not supported.");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i2, int i3) {
        long j2 = this.f52794a;
        if (j2 <= 0 || this.f52795b) {
            return -1;
        }
        int a2 = a(bArr, i2, (int) Math.min(j2, (long) i3));
        this.f52794a -= (long) a2;
        if (a2 != 0) {
            return a2;
        }
        this.f52795b = true;
        return 0;
    }
}
