package com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.graphics.PointF;
import android.view.View;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.scale.c;
import com.ss.android.ugc.aweme.shortvideo.util.bt;
import h.j.h;
import h.p;

public final class m {

    /* renamed from: a  reason: collision with root package name */
    static final p<PointF, PointF> f129417a = new p<>(new PointF(0.445f, 0.05f), new PointF(0.55f, 0.95f));

    static {
        Covode.recordClassIndex(84955);
    }

    public static final c a(View view) {
        if (view == null || !(view instanceof c)) {
            return null;
        }
        return (c) view;
    }

    public static final boolean a(MediaModel mediaModel) {
        if (mediaModel == null || !mediaModel.b() || !b(mediaModel) || bt.a()) {
            return false;
        }
        return true;
    }

    private static final boolean b(MediaModel mediaModel) {
        if (mediaModel == null) {
            return false;
        }
        int b2 = h.b(mediaModel.f109400l, mediaModel.f109401m);
        int c2 = h.c(mediaModel.f109400l, mediaModel.f109401m);
        if (b2 >= 4096 || c2 >= 2160) {
            return true;
        }
        return false;
    }
}
