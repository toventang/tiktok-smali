package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.facebook.common.d.i;
import com.facebook.common.g.h;
import com.facebook.common.h.a;
import java.nio.ByteBuffer;

public final class u implements h {

    /* renamed from: a  reason: collision with root package name */
    a<r> f48108a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48109b;

    static {
        Covode.recordClassIndex(29069);
    }

    private synchronized void e() {
        MethodCollector.i(14487);
        if (!d()) {
            MethodCollector.o(14487);
        } else {
            h.a aVar = new h.a();
            MethodCollector.o(14487);
            throw aVar;
        }
    }

    @Override // com.facebook.common.g.h
    public final synchronized int a() {
        int i2;
        MethodCollector.i(14480);
        e();
        i2 = this.f48109b;
        MethodCollector.o(14480);
        return i2;
    }

    @Override // com.facebook.common.g.h
    public final synchronized long b() {
        long nativePtr;
        MethodCollector.i(14483);
        e();
        nativePtr = this.f48108a.a().getNativePtr();
        MethodCollector.o(14483);
        return nativePtr;
    }

    @Override // com.facebook.common.g.h
    public final synchronized ByteBuffer c() {
        ByteBuffer byteBuffer;
        MethodCollector.i(14484);
        byteBuffer = this.f48108a.a().getByteBuffer();
        MethodCollector.o(14484);
        return byteBuffer;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        MethodCollector.i(14486);
        a.c(this.f48108a);
        this.f48108a = null;
        MethodCollector.o(14486);
    }

    @Override // com.facebook.common.g.h
    public final synchronized boolean d() {
        MethodCollector.i(14485);
        if (!a.a((a<?>) this.f48108a)) {
            MethodCollector.o(14485);
            return true;
        }
        MethodCollector.o(14485);
        return false;
    }

    @Override // com.facebook.common.g.h
    public final synchronized byte a(int i2) {
        boolean z;
        byte read;
        MethodCollector.i(14481);
        e();
        boolean z2 = true;
        if (i2 >= 0) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        if (i2 >= this.f48109b) {
            z2 = false;
        }
        i.a(z2);
        read = this.f48108a.a().read(i2);
        MethodCollector.o(14481);
        return read;
    }

    public u(a<r> aVar, int i2) {
        boolean z;
        i.a(aVar);
        if (i2 < 0 || i2 > aVar.a().getSize()) {
            z = false;
        } else {
            z = true;
        }
        i.a(z);
        this.f48108a = aVar.clone();
        this.f48109b = i2;
    }

    @Override // com.facebook.common.g.h
    public final synchronized int a(int i2, byte[] bArr, int i3, int i4) {
        boolean z;
        int read;
        MethodCollector.i(14482);
        e();
        if (i2 + i4 <= this.f48109b) {
            z = true;
        } else {
            z = false;
        }
        i.a(z);
        read = this.f48108a.a().read(i2, bArr, i3, i4);
        MethodCollector.o(14482);
        return read;
    }
}
