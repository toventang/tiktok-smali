package com.ss.android.ugc.tools.c;

import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.facebook.drawee.a.a.c;
import com.facebook.drawee.a.a.e;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.common.ImageDecodeOptionsBuilder;
import com.facebook.imagepipeline.common.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;

public final class b {
    static {
        Covode.recordClassIndex(98227);
    }

    private static void a(SimpleDraweeView simpleDraweeView, com.facebook.imagepipeline.o.b[] bVarArr) {
        if (bVarArr == null) {
            a.a(simpleDraweeView, (int) R.drawable.bmx);
            return;
        }
        e b2 = c.b();
        b2.f47325m = simpleDraweeView.getController();
        b2.f47322j = true;
        simpleDraweeView.setController(b2.a(bVarArr).e());
    }

    private static com.facebook.imagepipeline.o.b[] a(String str, Bitmap.Config config) {
        ImageDecodeOptionsBuilder imageDecodeOptionsBuilder = new ImageDecodeOptionsBuilder();
        imageDecodeOptionsBuilder.setBitmapConfig(config);
        imageDecodeOptionsBuilder.a(1);
        imageDecodeOptionsBuilder.f47724e = false;
        com.facebook.imagepipeline.common.b bVar = new com.facebook.imagepipeline.common.b(imageDecodeOptionsBuilder);
        com.facebook.imagepipeline.o.c a2 = com.facebook.imagepipeline.o.c.a(Uri.parse(str));
        a2.f48449f = bVar;
        return new com.facebook.imagepipeline.o.b[]{a2.a()};
    }

    public static void a(SimpleDraweeView simpleDraweeView, UrlModel urlModel, Bitmap.Config config) {
        a(simpleDraweeView, a.a(urlModel, (d) null, com.facebook.imagepipeline.common.c.MEDIUM, (com.facebook.imagepipeline.o.d) null, config));
    }

    public static void a(SimpleDraweeView simpleDraweeView, String str, Bitmap.Config config) {
        if (simpleDraweeView != null) {
            com.facebook.imagepipeline.o.b[] bVarArr = null;
            if (!TextUtils.isEmpty(str)) {
                bVarArr = a(str, config);
            }
            a(simpleDraweeView, bVarArr);
        }
    }
}
