package com.ss.android.ugc.aweme.shortvideo.l;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.c.g;
import com.facebook.imagepipeline.d.j;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.j.c;
import com.facebook.imagepipeline.j.d;
import com.facebook.imagepipeline.o.b;

public final class o {
    static {
        Covode.recordClassIndex(84359);
    }

    public static a<c> a(Bitmap bitmap) {
        return a.a(new d(bitmap, g.a(), com.facebook.imagepipeline.j.g.f48000a));
    }

    public static void a(a<c> aVar, String str) {
        k.a().c().a(j.a().a(b.fromUri("file://".concat(String.valueOf(str))), null), aVar);
    }
}
