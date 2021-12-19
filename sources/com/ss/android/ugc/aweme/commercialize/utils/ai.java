package com.ss.android.ugc.aweme.commercialize.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;

final /* synthetic */ class ai implements ah {

    /* renamed from: b  reason: collision with root package name */
    static final ah f75568b = new ai();

    static {
        Covode.recordClassIndex(46616);
    }

    private ai() {
    }

    @Override // com.ss.android.ugc.aweme.commercialize.utils.ah
    public final Video a(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        return aweme.getVideo();
    }
}
