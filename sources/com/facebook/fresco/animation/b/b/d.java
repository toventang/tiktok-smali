package com.facebook.fresco.animation.b.b;

import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.a.a;
import com.facebook.fresco.animation.b.b;

public class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f47550a = d.class;

    /* renamed from: b  reason: collision with root package name */
    private final int f47551b;

    public d() {
        this(3);
    }

    static {
        Covode.recordClassIndex(28837);
    }

    public d(int i2) {
        this.f47551b = i2;
    }

    @Override // com.facebook.fresco.animation.b.b.a
    public final void a(b bVar, b bVar2, a aVar, int i2) {
        for (int i3 = 1; i3 <= this.f47551b; i3++) {
            int e2 = (i2 + i3) % aVar.e();
            if (com.facebook.common.e.a.a(2)) {
                com.facebook.common.e.a.a(f47550a, "Preparing frame %d, last drawn: %d", Integer.valueOf(e2), Integer.valueOf(i2));
            }
            bVar.a(bVar2, aVar, e2);
        }
    }
}
