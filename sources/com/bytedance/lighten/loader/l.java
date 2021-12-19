package com.bytedance.lighten.loader;

import android.graphics.Bitmap;
import android.net.Uri;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.c;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.common.b;
import com.facebook.imagepipeline.common.e;
import com.facebook.imagepipeline.d.j;
import com.facebook.imagepipeline.e.k;
import java.io.File;

final class l implements c {
    static {
        Covode.recordClassIndex(24652);
    }

    l() {
    }

    @Override // com.bytedance.lighten.a.c
    public final Bitmap a(Uri uri) {
        a<com.facebook.imagepipeline.j.c> a2 = k.a().c().a(new com.facebook.imagepipeline.d.c(uri.toString(), null, e.f47751b, b.f47734a, null, null, null));
        if (a2 != null) {
            return ((com.facebook.imagepipeline.j.b) a2.a()).d();
        }
        return null;
    }

    @Override // com.bytedance.lighten.a.c
    public final File b(Uri uri) {
        File file;
        com.facebook.c.a.e a2 = j.a().a(com.facebook.imagepipeline.o.b.fromUri(uri));
        com.facebook.b.a a3 = k.a().d().a(a2);
        if (a3 == null) {
            a3 = k.a().h().a(a2);
        }
        if (!(a3 instanceof com.facebook.b.b) || (file = ((com.facebook.b.b) a3).f46951a) == null || !file.exists()) {
            return null;
        }
        return file;
    }

    @Override // com.bytedance.lighten.a.c
    public final boolean c(Uri uri) {
        com.facebook.c.a.e a2 = j.a().a(com.facebook.imagepipeline.o.b.fromUri(uri));
        if (k.a().d().d(a2) || k.a().h().d(a2)) {
            return true;
        }
        return false;
    }
}
