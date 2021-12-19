package com.ss.android.ugc.aweme.share.m;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.commercialize.utils.br;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class j {

    /* renamed from: a  reason: collision with root package name */
    public static final j f124090a = new j();

    private j() {
    }

    static {
        Covode.recordClassIndex(81496);
    }

    public static boolean a(Aweme aweme) {
        if (aweme == null || aweme.getVideo() == null) {
            return false;
        }
        if (aweme.getAuthor() != null || br.a(aweme, 3)) {
            return true;
        }
        return false;
    }
}
