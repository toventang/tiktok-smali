package com.facebook.fresco.animation.b.c;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.covode.number.Covode;
import com.facebook.fresco.animation.b.c;
import com.facebook.imagepipeline.a.a.a;
import com.facebook.imagepipeline.a.c.d;

public class b implements c {

    /* renamed from: b  reason: collision with root package name */
    private static final Class<?> f47553b = b.class;

    /* renamed from: a  reason: collision with root package name */
    public final com.facebook.fresco.animation.b.b f47554a;

    /* renamed from: c  reason: collision with root package name */
    private a f47555c;

    /* renamed from: d  reason: collision with root package name */
    private d f47556d;

    /* renamed from: e  reason: collision with root package name */
    private final d.a f47557e;

    @Override // com.facebook.fresco.animation.b.c
    public final int a() {
        return this.f47555c.c();
    }

    @Override // com.facebook.fresco.animation.b.c
    public final int b() {
        return this.f47555c.d();
    }

    static {
        Covode.recordClassIndex(28840);
    }

    @Override // com.facebook.fresco.animation.b.c
    public final void a(Rect rect) {
        a a2 = this.f47555c.a(rect);
        if (a2 != this.f47555c) {
            this.f47555c = a2;
            this.f47556d = new d(this.f47555c, this.f47557e);
        }
    }

    public b(com.facebook.fresco.animation.b.b bVar, a aVar) {
        AnonymousClass1 r2 = new d.a() {
            /* class com.facebook.fresco.animation.b.c.b.AnonymousClass1 */

            static {
                Covode.recordClassIndex(28841);
            }

            @Override // com.facebook.imagepipeline.a.c.d.a
            public final com.facebook.common.h.a<Bitmap> a(int i2) {
                return b.this.f47554a.a(i2);
            }
        };
        this.f47557e = r2;
        this.f47554a = bVar;
        this.f47555c = aVar;
        this.f47556d = new d(this.f47555c, r2);
    }

    @Override // com.facebook.fresco.animation.b.c
    public final boolean a(int i2, Bitmap bitmap) {
        try {
            this.f47556d.a(i2, bitmap);
            return true;
        } catch (IllegalStateException e2) {
            com.facebook.common.e.a.b(f47553b, e2, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(i2));
            return false;
        }
    }
}
