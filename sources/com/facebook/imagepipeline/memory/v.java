package com.facebook.imagepipeline.memory;

import com.bytedance.covode.number.Covode;
import com.facebook.common.d.m;
import com.facebook.common.g.i;
import com.facebook.common.g.k;
import com.facebook.common.g.l;
import java.io.IOException;
import java.io.InputStream;

public final class v implements i {

    /* renamed from: a  reason: collision with root package name */
    private final l f48110a;

    /* renamed from: b  reason: collision with root package name */
    private final s f48111b;

    static {
        Covode.recordClassIndex(29070);
    }

    @Override // com.facebook.common.g.i
    public final /* synthetic */ k a() {
        return new w(this.f48111b);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public u a(InputStream inputStream) {
        w wVar = new w(this.f48111b);
        try {
            return a(inputStream, wVar);
        } finally {
            wVar.close();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public u a(byte[] bArr) {
        w wVar = new w(this.f48111b, bArr.length);
        try {
            wVar.write(bArr, 0, bArr.length);
            u c2 = wVar.a();
            wVar.close();
            return c2;
        } catch (IOException e2) {
            throw m.b(e2);
        } catch (Throwable th) {
            wVar.close();
            throw th;
        }
    }

    @Override // com.facebook.common.g.i
    public final /* synthetic */ k a(int i2) {
        return new w(this.f48111b, i2);
    }

    public v(s sVar, l lVar) {
        this.f48111b = sVar;
        this.f48110a = lVar;
    }

    private u a(InputStream inputStream, w wVar) {
        this.f48110a.a(inputStream, wVar);
        return wVar.a();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public u a(InputStream inputStream, int i2) {
        w wVar = new w(this.f48111b, i2);
        try {
            return a(inputStream, wVar);
        } finally {
            wVar.close();
        }
    }
}
