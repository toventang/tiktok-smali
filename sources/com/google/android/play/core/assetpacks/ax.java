package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

/* access modifiers changed from: package-private */
public final class ax extends OutputStream {

    /* renamed from: a  reason: collision with root package name */
    private final by f52853a = new by();

    /* renamed from: b  reason: collision with root package name */
    private final File f52854b;

    /* renamed from: c  reason: collision with root package name */
    private final cm f52855c;

    /* renamed from: d  reason: collision with root package name */
    private long f52856d;

    /* renamed from: e  reason: collision with root package name */
    private long f52857e;

    /* renamed from: f  reason: collision with root package name */
    private FileOutputStream f52858f;

    /* renamed from: g  reason: collision with root package name */
    private cs f52859g;

    static {
        Covode.recordClassIndex(32689);
    }

    ax(File file, cm cmVar) {
        MethodCollector.i(8791);
        this.f52854b = file;
        this.f52855c = cmVar;
        MethodCollector.o(8791);
    }

    @Override // java.io.OutputStream
    public final void write(int i2) {
        write(new byte[]{(byte) i2});
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i2, int i3) {
        int min;
        int i4 = i3;
        int i5 = i2;
        MethodCollector.i(9022);
        while (i4 > 0) {
            if (this.f52856d == 0 && this.f52857e == 0) {
                int a2 = this.f52853a.a(bArr, i5, i4);
                if (a2 == -1) {
                    MethodCollector.o(9022);
                    return;
                }
                i5 += a2;
                i4 -= a2;
                cs a3 = this.f52853a.a();
                this.f52859g = a3;
                if (a3.f53007e) {
                    this.f52856d = 0;
                    this.f52855c.b(this.f52859g.f53008f, this.f52859g.f53008f.length);
                    this.f52857e = (long) this.f52859g.f53008f.length;
                } else if (!this.f52859g.b() || this.f52859g.a()) {
                    byte[] bArr2 = this.f52859g.f53008f;
                    this.f52855c.b(bArr2, bArr2.length);
                    this.f52856d = this.f52859g.f53004b;
                } else {
                    this.f52855c.a(this.f52859g.f53008f);
                    File file = new File(this.f52854b, this.f52859g.f53003a);
                    file.getParentFile().mkdirs();
                    this.f52856d = this.f52859g.f53004b;
                    this.f52858f = new FileOutputStream(file);
                }
            }
            if (!this.f52859g.a()) {
                if (this.f52859g.f53007e) {
                    this.f52855c.a(this.f52857e, bArr, i5, i4);
                    this.f52857e += (long) i4;
                    min = i4;
                } else if (this.f52859g.b()) {
                    min = (int) Math.min((long) i4, this.f52856d);
                    this.f52858f.write(bArr, i5, min);
                    long j2 = this.f52856d - ((long) min);
                    this.f52856d = j2;
                    if (j2 == 0) {
                        this.f52858f.close();
                    }
                } else {
                    min = (int) Math.min((long) i4, this.f52856d);
                    int length = this.f52859g.f53008f.length;
                    this.f52855c.a((((long) length) + this.f52859g.f53004b) - this.f52856d, bArr, i5, min);
                    this.f52856d -= (long) min;
                }
                i5 += min;
                i4 -= min;
            }
        }
        MethodCollector.o(9022);
    }
}
