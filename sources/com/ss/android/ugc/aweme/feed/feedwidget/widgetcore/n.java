package com.ss.android.ugc.aweme.feed.feedwidget.widgetcore;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f93148a = new n();

    private n() {
    }

    static {
        Covode.recordClassIndex(59091);
    }

    public static boolean a(Aweme aweme) {
        if (aweme == null || !aweme.isAd() || aweme.getAwemeRawAd() == null) {
            return false;
        }
        return true;
    }

    public static boolean b(Aweme aweme) {
        if (aweme == null || aweme.getAuthor() == null) {
            return false;
        }
        User author = aweme.getAuthor();
        if (author == null) {
            l.b();
        }
        if (!author.isAdFake()) {
            return true;
        }
        return false;
    }
}
