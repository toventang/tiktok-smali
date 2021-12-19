package com.bytedance.android.e.a.a;

import com.bytedance.android.e.a.a.d;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.io.IOException;
import java.io.InputStream;

/* access modifiers changed from: package-private */
public final class c extends d.a {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f6856b = new byte[256];

    /* renamed from: c  reason: collision with root package name */
    private final InputStream f6857c;

    /* renamed from: d  reason: collision with root package name */
    private final int f6858d;

    /* renamed from: e  reason: collision with root package name */
    private int f6859e;

    static {
        Covode.recordClassIndex(3327);
    }

    @Override // com.bytedance.android.e.a.a.d.b
    public final boolean a() {
        if (this.f6858d - this.f6859e > 0) {
            return true;
        }
        return false;
    }

    @Override // com.bytedance.android.e.a.a.d.b
    public final byte b() {
        MethodCollector.i(10988);
        this.f6859e++;
        byte read = (byte) this.f6857c.read();
        MethodCollector.o(10988);
        return read;
    }

    @Override // com.bytedance.android.e.a.a.d.b
    public final void a(long j2) {
        this.f6859e = (int) (((long) this.f6859e) + j2);
        this.f6857c.skip(j2);
    }

    c(InputStream inputStream) {
        int i2;
        this.f6857c = inputStream;
        try {
            i2 = inputStream.available();
        } catch (IOException unused) {
            i2 = -1;
        }
        this.f6858d = i2;
    }

    @Override // com.bytedance.android.e.a.a.d.b
    public final byte[] b(long j2) {
        MethodCollector.i(10989);
        this.f6859e = (int) (((long) this.f6859e) + j2);
        byte[] bArr = new byte[((int) j2)];
        this.f6857c.read(bArr);
        MethodCollector.o(10989);
        return bArr;
    }

    @Override // com.bytedance.android.e.a.a.d.b
    public final String c(long j2) {
        byte[] bArr;
        MethodCollector.i(10990);
        this.f6859e = (int) (((long) this.f6859e) + j2);
        if (j2 > 256) {
            int i2 = (int) j2;
            bArr = new byte[i2];
            this.f6857c.read(bArr, 0, i2);
        } else {
            this.f6857c.read(this.f6856b, 0, (int) j2);
            bArr = this.f6856b;
        }
        String str = new String(bArr, 0, (int) j2, f6860a);
        MethodCollector.o(10990);
        return str;
    }
}
