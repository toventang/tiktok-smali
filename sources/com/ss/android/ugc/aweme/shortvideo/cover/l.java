package com.ss.android.ugc.aweme.shortvideo.cover;

import android.graphics.Bitmap;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import f.a.d.g;

final /* synthetic */ class l implements g {

    /* renamed from: a  reason: collision with root package name */
    private final VideoPublishEditModel f125260a;

    static {
        Covode.recordClassIndex(82256);
    }

    l(VideoPublishEditModel videoPublishEditModel) {
        this.f125260a = videoPublishEditModel;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        return this.f125260a.getCoverPublishModel().getEffectTextModel().mergeCoverText((Bitmap) obj);
    }
}
