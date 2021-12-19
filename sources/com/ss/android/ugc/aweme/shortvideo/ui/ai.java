package com.ss.android.ugc.aweme.shortvideo.ui;

import android.graphics.Bitmap;
import b.g;
import b.i;
import com.bytedance.covode.number.Covode;

final /* synthetic */ class ai implements g {

    /* renamed from: a  reason: collision with root package name */
    private final ag f131386a;

    static {
        Covode.recordClassIndex(86081);
    }

    ai(ag agVar) {
        this.f131386a = agVar;
    }

    @Override // b.g
    public final Object then(i iVar) {
        ag agVar = this.f131386a;
        if (iVar.d() == null || ((Bitmap) iVar.d()).isRecycled() || agVar.f131381f == null) {
            return null;
        }
        agVar.f131381f.setImageBitmap((Bitmap) iVar.d());
        return null;
    }
}
