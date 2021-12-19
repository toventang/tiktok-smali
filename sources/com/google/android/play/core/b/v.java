package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* access modifiers changed from: package-private */
public final class v implements av {

    /* renamed from: a  reason: collision with root package name */
    private final ByteBuffer f53178a;

    static {
        Covode.recordClassIndex(32861);
    }

    public v(ByteBuffer byteBuffer) {
        this.f53178a = byteBuffer.slice();
    }

    @Override // com.google.android.play.core.b.av
    public final long a() {
        return (long) this.f53178a.capacity();
    }

    @Override // com.google.android.play.core.b.av
    public final void a(MessageDigest[] messageDigestArr, long j2, int i2) {
        ByteBuffer slice;
        MethodCollector.i(6691);
        synchronized (this.f53178a) {
            try {
                int i3 = (int) j2;
                this.f53178a.position(i3);
                this.f53178a.limit(i3 + i2);
                slice = this.f53178a.slice();
            } finally {
                MethodCollector.o(6691);
            }
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            slice.position(0);
            messageDigest.update(slice);
        }
    }
}
