package com.ss.android.ugc.aweme.video;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.video.preload.s;
import com.ss.android.ugc.aweme.video.simcommon.a;
import com.ss.android.ugc.playerkit.videoview.c;

public final /* synthetic */ class u implements c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f143994a = new u();

    static {
        Covode.recordClassIndex(94217);
    }

    private u() {
    }

    @Override // com.ss.android.ugc.playerkit.videoview.c
    public final boolean a(VideoUrlModel videoUrlModel) {
        return s.b().a(a.a(videoUrlModel));
    }
}
