package com.bytedance.lighten.b;

import android.graphics.Bitmap;
import android.os.Build;
import com.bytedance.covode.number.Covode;
import com.facebook.imagepipeline.common.b;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.g.c;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.j.e;
import com.facebook.imagepipeline.j.g;
import com.facebook.imagepipeline.j.h;

public final class a implements c {
    static {
        Covode.recordClassIndex(24623);
    }

    @Override // com.facebook.imagepipeline.g.c
    public final com.facebook.imagepipeline.j.c a(e eVar, int i2, h hVar, b bVar) {
        com.facebook.common.h.a<Bitmap> decodeFromEncodedImageWithColorSpace = k.a().g().decodeFromEncodedImageWithColorSpace(eVar, bVar.f47742i, null, bVar.f47741h);
        try {
            com.facebook.imagepipeline.r.a aVar = bVar.f47744k;
            if (aVar != null) {
                Bitmap a2 = decodeFromEncodedImageWithColorSpace.a();
                int i3 = Build.VERSION.SDK_INT;
                if (aVar.a()) {
                    a2.setHasAlpha(true);
                }
            }
            return new d(decodeFromEncodedImageWithColorSpace, g.f48000a, eVar.d(), eVar.e());
        } finally {
            decodeFromEncodedImageWithColorSpace.close();
        }
    }
}
