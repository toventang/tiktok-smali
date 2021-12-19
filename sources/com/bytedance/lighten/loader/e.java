package com.bytedance.lighten.loader;

import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.b.b.a;
import com.facebook.fresco.animation.b.b.b;
import com.facebook.fresco.animation.b.b.d;

final class e implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f39970a = d.class;

    /* renamed from: b  reason: collision with root package name */
    private final int f39971b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f39972c;

    /* renamed from: d  reason: collision with root package name */
    private f f39973d;

    static {
        Covode.recordClassIndex(24643);
    }

    public e(int[] iArr, f fVar) {
        this(iArr, fVar, (byte) 0);
    }

    private e(int[] iArr, f fVar, byte b2) {
        this.f39971b = 3;
        this.f39972c = iArr;
        this.f39973d = fVar;
    }

    @Override // com.facebook.fresco.animation.b.b.a
    public final void a(b bVar, com.facebook.fresco.animation.b.b bVar2, com.facebook.fresco.animation.a.a aVar, int i2) {
        for (int i3 = 1; i3 <= this.f39971b; i3++) {
            int[] iArr = this.f39972c;
            int i4 = iArr[(this.f39973d.f39975b + i3) % iArr.length];
            if (i4 >= this.f39973d.f39974a.e()) {
                com.facebook.common.e.a.c(f39970a, "Preparing frame %d, last drawn: %d, but preparing frame is out of bounds", Integer.valueOf(i4), Integer.valueOf(i2));
                return;
            }
            if (com.facebook.common.e.a.a(2)) {
                com.facebook.common.e.a.a(f39970a, "Preparing frame %d, last drawn: %d", Integer.valueOf(i4), Integer.valueOf(i2));
            }
            bVar.a(bVar2, aVar, i4);
        }
    }
}
