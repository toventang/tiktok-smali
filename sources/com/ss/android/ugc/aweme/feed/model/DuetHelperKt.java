package com.ss.android.ugc.aweme.feed.model;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class DuetHelperKt {
    static {
        Covode.recordClassIndex(59368);
    }

    private static final boolean checkDuetSetting(Aweme aweme) {
        if (aweme.author == null) {
            return false;
        }
        User user = aweme.author;
        l.b(user, "");
        int duetSetting = user.getDuetSetting();
        if (duetSetting == 0) {
            return true;
        }
        if (duetSetting != 1) {
            return false;
        }
        User user2 = aweme.author;
        l.b(user2, "");
        if (user2.getFollowStatus() == 2) {
            return true;
        }
        return false;
    }

    public static final boolean canAddDuet(Aweme aweme, boolean z) {
        int i2;
        l.d(aweme, "");
        InteractPermission interactPermission = aweme.interactPermission;
        if (interactPermission != null) {
            i2 = interactPermission.getDuet();
            if (i2 == 4) {
                return false;
            }
        } else {
            i2 = 0;
        }
        if ((z || (i2 != 2 && !aweme.isPrivate())) && aweme.canDuetVideoType() && !aweme.isWithPromotionalMusic() && aweme.duetSetting != 2) {
            return true;
        }
        return false;
    }

    public static final boolean setGrayForDuet(Aweme aweme, boolean z, boolean z2, boolean z3, boolean z4) {
        int i2;
        l.d(aweme, "");
        boolean checkDuetSetting = checkDuetSetting(aweme);
        InteractPermission interactPermission = aweme.interactPermission;
        if (interactPermission != null) {
            i2 = interactPermission.getDuet();
        } else {
            i2 = 0;
        }
        if (z2 && i2 != 3 && (z || (checkDuetSetting && i2 != 1))) {
            User user = aweme.author;
            l.b(user, "");
            if ((!user.isSecret() || z) && !z3 && !z4) {
                return false;
            }
        }
        return true;
    }
}
