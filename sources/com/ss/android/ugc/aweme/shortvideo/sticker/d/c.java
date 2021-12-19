package com.ss.android.ugc.aweme.shortvideo.sticker.d;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.fx;
import com.ss.android.ugc.aweme.port.in.g;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import h.f.b.l;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f130263a = new c();

    private c() {
    }

    static {
        Covode.recordClassIndex(85445);
    }

    public static boolean a(VideoPublishEditModel videoPublishEditModel) {
        l.d(videoPublishEditModel, "");
        if (!fx.a() || videoPublishEditModel.isStoryEditMode) {
            return false;
        }
        if ((videoPublishEditModel.mShootMode != 15 || videoPublishEditModel.mOrigin != 1) && g.a().A().b() && !g.a().A().a()) {
            return true;
        }
        return false;
    }
}
