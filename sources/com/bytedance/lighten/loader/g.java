package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.c.b;
import com.bytedance.lighten.a.c.h;
import com.facebook.c.a.e;
import com.facebook.c.a.j;
import com.facebook.imagepipeline.c.f;
import com.facebook.imagepipeline.o.a;

final class g extends a {

    /* renamed from: a  reason: collision with root package name */
    private h f39981a;

    /* renamed from: b  reason: collision with root package name */
    private com.bytedance.lighten.a.c.g f39982b;

    static {
        Covode.recordClassIndex(24645);
    }

    @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
    public final String getName() {
        return this.f39981a.a();
    }

    @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
    public final e getPostprocessorCacheKey() {
        return new j(this.f39981a.a());
    }

    public g(h hVar) {
        this.f39981a = hVar;
    }

    @Override // com.facebook.imagepipeline.o.a, com.facebook.imagepipeline.o.d
    public final com.facebook.common.h.a<Bitmap> process(Bitmap bitmap, final f fVar) {
        if (this.f39982b == null) {
            this.f39982b = new com.bytedance.lighten.a.c.g() {
                /* class com.bytedance.lighten.loader.g.AnonymousClass1 */

                static {
                    Covode.recordClassIndex(24646);
                }

                @Override // com.bytedance.lighten.a.c.g
                public final b a(int i2, int i3, Bitmap.Config config) {
                    return new y(fVar.a(i2, i3, config));
                }
            };
        }
        y yVar = (y) this.f39981a.a(bitmap, this.f39982b);
        try {
            com.facebook.common.h.a<Bitmap> b2 = com.facebook.common.h.a.b(yVar.f40047a);
            com.facebook.common.h.a.c(yVar.f40047a);
            return b2;
        } catch (Throwable th) {
            if (yVar != null) {
                com.facebook.common.h.a.c(yVar.f40047a);
                throw th;
            }
            throw th;
        }
    }
}
