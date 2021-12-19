package com.ss.android.ugc.aweme.base.ui;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.tag.TuxTag;

final /* synthetic */ class r implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Bitmap f68406a;

    /* renamed from: b  reason: collision with root package name */
    private final TuxTag f68407b;

    static {
        Covode.recordClassIndex(42113);
    }

    r(Bitmap bitmap, TuxTag tuxTag) {
        this.f68406a = bitmap;
        this.f68407b = tuxTag;
    }

    public final void run() {
        Bitmap bitmap = this.f68406a;
        TuxTag tuxTag = this.f68407b;
        if (bitmap != null) {
            tuxTag.setTagIconBitmap(bitmap);
        }
    }
}
