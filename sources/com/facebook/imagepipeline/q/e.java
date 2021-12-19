package com.facebook.imagepipeline.q;

import com.bytedance.covode.number.Covode;
import com.facebook.h.c;
import com.facebook.imagepipeline.nativecode.a;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    private final int f48461a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f48462b;

    /* renamed from: c  reason: collision with root package name */
    private final c f48463c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f48464d;

    static {
        Covode.recordClassIndex(29222);
    }

    private b b(c cVar, boolean z) {
        return new a(this.f48461a, this.f48462b).a(cVar, z);
    }

    private b c(c cVar, boolean z) {
        return new g(this.f48461a).a(cVar, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0021, code lost:
        if (r0 == null) goto L_0x0009;
     */
    @Override // com.facebook.imagepipeline.q.c
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.imagepipeline.q.b a(com.facebook.h.c r3, boolean r4) {
        /*
            r2 = this;
            com.facebook.imagepipeline.q.c r1 = r2.f48463c
            r0 = 0
            if (r1 != 0) goto L_0x0029
        L_0x0005:
            java.lang.Integer r0 = r2.f48464d
            if (r0 != 0) goto L_0x0014
        L_0x0009:
            com.facebook.imagepipeline.q.b r0 = r2.b(r3, r4)
            if (r0 != 0) goto L_0x0038
            com.facebook.imagepipeline.q.b r0 = r2.c(r3, r4)
            return r0
        L_0x0014:
            int r1 = r0.intValue()
            if (r1 == 0) goto L_0x0024
            r0 = 1
            if (r1 != r0) goto L_0x0030
            com.facebook.imagepipeline.q.b r0 = r2.c(r3, r4)
        L_0x0021:
            if (r0 != 0) goto L_0x0038
            goto L_0x0009
        L_0x0024:
            com.facebook.imagepipeline.q.b r0 = r2.b(r3, r4)
            goto L_0x0021
        L_0x0029:
            com.facebook.imagepipeline.q.b r0 = r1.a(r3, r4)
            if (r0 != 0) goto L_0x0038
            goto L_0x0005
        L_0x0030:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Invalid ImageTranscoderType"
            r1.<init>(r0)
            throw r1
        L_0x0038:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.q.e.a(com.facebook.h.c, boolean):com.facebook.imagepipeline.q.b");
    }

    public e(int i2, boolean z, c cVar, Integer num) {
        this.f48461a = i2;
        this.f48462b = z;
        this.f48463c = cVar;
        this.f48464d = num;
    }
}
