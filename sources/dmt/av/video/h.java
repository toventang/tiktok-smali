package dmt.av.video;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.facebook.common.h.a;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.common.d;
import com.facebook.imagepipeline.common.e;
import com.facebook.imagepipeline.e.k;
import com.facebook.imagepipeline.j.c;
import h.f.b.l;

public final class h {
    static {
        Covode.recordClassIndex(104226);
    }

    public static final boolean a(SingleImageCoverBitmapData singleImageCoverBitmapData) {
        if (singleImageCoverBitmapData == null || singleImageCoverBitmapData.getPreviewBitmapUri() == null) {
            return false;
        }
        return true;
    }

    public static final Bitmap b(SingleImageCoverBitmapData singleImageCoverBitmapData) {
        c cVar;
        if (singleImageCoverBitmapData == null) {
            return null;
        }
        if (singleImageCoverBitmapData.getPreviewBitmapUri() != null) {
            return r.b().a(singleImageCoverBitmapData.getPreviewBitmapUri());
        }
        if (singleImageCoverBitmapData.getItemCoverWidth() <= 0) {
            return null;
        }
        k a2 = k.a();
        l.b(a2, "");
        a<c> a3 = a2.c().a(new com.facebook.imagepipeline.d.c(com.ss.android.ugc.tools.utils.h.d(singleImageCoverBitmapData.getSourcePath()).toString(), new d(singleImageCoverBitmapData.getItemCoverWidth(), singleImageCoverBitmapData.getItemCoverWidth()), e.f47751b, new ImageDecodeOptionsBuilder().setBitmapConfig(Bitmap.Config.RGB_565).a(), null, null, null));
        if (a3 != null) {
            cVar = a3.a();
        } else {
            cVar = null;
        }
        if (!(cVar instanceof com.facebook.imagepipeline.j.d)) {
            cVar = null;
        }
        com.facebook.imagepipeline.j.d dVar = (com.facebook.imagepipeline.j.d) cVar;
        if (dVar != null) {
            return dVar.f47984a;
        }
        return null;
    }
}
