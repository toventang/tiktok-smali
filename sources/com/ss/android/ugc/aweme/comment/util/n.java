package com.ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.comment.a.f;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f72860a = new n();

    private n() {
    }

    static {
        Covode.recordClassIndex(44881);
    }

    public static boolean a(Aweme aweme, Comment comment) {
        Aweme aweme2;
        boolean z;
        Boolean bool = null;
        if (comment != null) {
            aweme2 = comment.getAliasAweme();
        } else {
            aweme2 = null;
        }
        if (aweme2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (aweme != null) {
            bool = Boolean.valueOf(aweme.isAd());
        }
        if (!f.a() || z || bool == null || bool.booleanValue()) {
            return false;
        }
        return true;
    }
}
