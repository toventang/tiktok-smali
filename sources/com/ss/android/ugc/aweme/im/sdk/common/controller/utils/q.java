package com.ss.android.ugc.aweme.im.sdk.common.controller.utils;

import com.bytedance.covode.number.Covode;
import com.facebook.drawee.f.a;
import com.facebook.drawee.f.b;
import com.facebook.imagepipeline.o.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public final class q {
    static {
        Covode.recordClassIndex(65577);
    }

    public static boolean a(String str) {
        if (str == null || !str.toLowerCase().equals("gif")) {
            return false;
        }
        return true;
    }

    public static boolean b(String str) {
        if (str == null || !str.toLowerCase().equals("webp")) {
            return false;
        }
        return true;
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, int i2, int i3) {
        a(remoteImageView, urlModel, i2, i3, null);
    }

    public static void a(RemoteImageView remoteImageView, UrlModel urlModel, int i2, int i3, d dVar) {
        a aVar;
        if (remoteImageView != null && remoteImageView.getContext() != null) {
            if (!remoteImageView.hasHierarchy()) {
                aVar = new b(remoteImageView.getContext().getResources()).a();
            } else {
                aVar = (a) remoteImageView.getHierarchy();
            }
            aVar.c(i3);
            aVar.d(i2);
            remoteImageView.setHierarchy(aVar);
            com.ss.android.ugc.aweme.im.sdk.common.controller.utils.c.a.a(remoteImageView, urlModel, dVar);
        }
    }
}
