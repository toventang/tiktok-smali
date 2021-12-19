package com.google.android.play.core.b;

import com.bytedance.covode.number.Covode;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

/* access modifiers changed from: package-private */
public final class bl implements av {

    /* renamed from: a  reason: collision with root package name */
    private final FileChannel f53134a;

    /* renamed from: b  reason: collision with root package name */
    private final long f53135b;

    /* renamed from: c  reason: collision with root package name */
    private final long f53136c;

    static {
        Covode.recordClassIndex(32820);
    }

    public bl(FileChannel fileChannel, long j2, long j3) {
        this.f53134a = fileChannel;
        this.f53135b = j2;
        this.f53136c = j3;
    }

    @Override // com.google.android.play.core.b.av
    public final long a() {
        return this.f53136c;
    }

    @Override // com.google.android.play.core.b.av
    public final void a(MessageDigest[] messageDigestArr, long j2, int i2) {
        MappedByteBuffer map = this.f53134a.map(FileChannel.MapMode.READ_ONLY, this.f53135b + j2, (long) i2);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }
}
