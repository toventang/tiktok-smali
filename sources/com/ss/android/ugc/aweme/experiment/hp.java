package com.ss.android.ugc.aweme.experiment;

import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.ss.android.ugc.aweme.base.v;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

public final /* synthetic */ class hp implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final Aweme f90227a;

    static {
        Covode.recordClassIndex(56598);
    }

    public hp(Aweme aweme) {
        this.f90227a = aweme;
    }

    public final void run() {
        Video video;
        Aweme aweme = this.f90227a;
        if (aweme != null && (video = aweme.getVideo()) != null) {
            r.c(r.a(v.a(video.getOriginCover())).b());
        }
    }
}
