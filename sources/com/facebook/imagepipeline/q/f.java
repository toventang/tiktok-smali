package com.facebook.imagepipeline.q;

import com.bytedance.covode.number.Covode;
import com.facebook.h.b;
import com.facebook.h.c;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.n.q;

public final class f implements b {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f48465a;

    /* renamed from: b  reason: collision with root package name */
    private final int f48466b;

    static {
        Covode.recordClassIndex(29223);
    }

    @Override // com.facebook.imagepipeline.q.b
    public final String getIdentifier() {
        return "SimpleImageTranscoder";
    }

    @Override // com.facebook.imagepipeline.q.b
    public final boolean canTranscode(c cVar) {
        if (cVar == b.f47631k || cVar == b.f47621a) {
            return true;
        }
        return false;
    }

    public f(boolean z, int i2) {
        this.f48465a = z;
        this.f48466b = i2;
    }

    @Override // com.facebook.imagepipeline.q.b
    public final boolean canResize(e eVar, com.facebook.imagepipeline.common.e eVar2, d dVar) {
        if (eVar2 == null) {
            eVar2 = com.facebook.imagepipeline.common.e.f47751b;
        }
        if (!this.f48465a || q.a(eVar2, dVar, eVar, this.f48466b) <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00bd A[SYNTHETIC, Splitter:B:39:0x00bd] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00e4 A[Catch:{ OutOfMemoryError -> 0x00f2 }] */
    @Override // com.facebook.imagepipeline.q.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.imagepipeline.q.a transcode(com.facebook.imagepipeline.j.e r19, java.io.OutputStream r20, com.facebook.imagepipeline.common.e r21, com.facebook.imagepipeline.common.d r22, com.facebook.h.c r23, java.lang.Integer r24) {
        /*
        // Method dump skipped, instructions count: 291
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.q.f.transcode(com.facebook.imagepipeline.j.e, java.io.OutputStream, com.facebook.imagepipeline.common.e, com.facebook.imagepipeline.common.d, com.facebook.h.c, java.lang.Integer):com.facebook.imagepipeline.q.a");
    }
}
