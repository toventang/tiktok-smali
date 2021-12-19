package com.google.android.play.core.assetpacks;

import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.b;
import com.google.android.play.core.b.bg;
import java.io.File;

final class as {

    /* renamed from: a  reason: collision with root package name */
    static final b f52824a = new b("ExtractChunkTaskHandler");

    /* renamed from: b  reason: collision with root package name */
    final byte[] f52825b = new byte[8192];

    /* renamed from: c  reason: collision with root package name */
    final ac f52826c;

    /* renamed from: d  reason: collision with root package name */
    final bg<dj> f52827d;

    /* renamed from: e  reason: collision with root package name */
    final bg<w> f52828e;

    /* renamed from: f  reason: collision with root package name */
    final ay f52829f;

    static {
        Covode.recordClassIndex(32684);
    }

    as(ac acVar, bg<dj> bgVar, bg<w> bgVar2, ay ayVar) {
        this.f52826c = acVar;
        this.f52827d = bgVar;
        this.f52828e = bgVar2;
        this.f52829f = ayVar;
    }

    /* access modifiers changed from: package-private */
    public final File a(ar arVar) {
        File a2 = this.f52826c.a(arVar.f52904k, arVar.f52815a, arVar.f52816b, arVar.f52817c);
        if (!a2.exists()) {
            a2.mkdirs();
        }
        return a2;
    }
}
