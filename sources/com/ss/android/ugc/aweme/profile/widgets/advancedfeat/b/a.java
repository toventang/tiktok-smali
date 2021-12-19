package com.ss.android.ugc.aweme.profile.widgets.advancedfeat.b;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.experiment.ClaCrowdsourcingEntrypoints;
import com.ss.android.ugc.aweme.experiment.o;
import com.ss.android.ugc.aweme.experiment.p;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import h.f.b.l;

public final class a {
    static {
        Covode.recordClassIndex(76024);
    }

    public static final boolean a(User user) {
        Integer displayQnaOnProfile;
        l.d(user, "");
        if (!QnaService.a().enablePublicQna() || (displayQnaOnProfile = user.getDisplayQnaOnProfile()) == null || displayQnaOnProfile.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean b(User user, boolean z) {
        l.d(user, "");
        if (user.getShowTipEntry()) {
            if (z) {
                if (!user.isPrivateAccount()) {
                    return true;
                }
                return false;
            } else if (!user.isBlock) {
                return true;
            }
        }
        return false;
    }

    public static final boolean a(User user, boolean z) {
        l.d(user, "");
        if (!o.a()) {
            return false;
        }
        if (z) {
            ClaCrowdsourcingEntrypoints a2 = p.a();
            if (a2 == null || !a2.isEnrolled()) {
                return false;
            }
        } else if (user.isTranslator) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public static final boolean c(User user, boolean z) {
        l.d(user, "");
        if (com.ss.android.ugc.aweme.shoutouts.b.a.a(user)) {
            if (z) {
                return true;
            }
            if (user.isBlock || (user.isSecret() && user.getFollowStatus() != 1 && user.getFollowStatus() != 2)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
