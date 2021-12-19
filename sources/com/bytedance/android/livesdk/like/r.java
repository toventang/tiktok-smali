package com.bytedance.android.livesdk.like;

import android.graphics.Bitmap;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.like.LikeHelper;
import com.bytedance.covode.number.Covode;
import f.a.d.g;

final /* synthetic */ class r implements g {

    /* renamed from: a  reason: collision with root package name */
    private final ImageModel f18353a;

    static {
        Covode.recordClassIndex(10333);
    }

    r(ImageModel imageModel) {
        this.f18353a = imageModel;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        ImageModel imageModel = this.f18353a;
        LikeHelper.c cVar = new LikeHelper.c((byte) 0);
        cVar.f18329c = (Bitmap) obj;
        cVar.f18327a = false;
        cVar.f18328b = imageModel.mUri;
        return cVar;
    }
}
