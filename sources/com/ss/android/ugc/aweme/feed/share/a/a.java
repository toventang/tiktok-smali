package com.ss.android.ugc.aweme.feed.share.a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.aj;
import com.ss.android.ugc.aweme.app.s;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.x.m;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.share.h.c;
import com.zhiliaoapp.musically.R;

public final class a {
    static {
        Covode.recordClassIndex(59732);
    }

    public static boolean a(Aweme aweme) {
        return TextUtils.equals(b.g().getCurUserId(), aweme.getAuthorUid());
    }

    public static boolean b(Aweme aweme) {
        if (c(aweme) || d(aweme)) {
            return true;
        }
        if (aweme == null || !a(aweme)) {
            return false;
        }
        return true;
    }

    private static boolean c(Aweme aweme) {
        if (aweme == null || aweme.getStatus() == null || !aweme.getStatus().isReviewed() || !aweme.getStatus().isSelfSee() || !s.a.f66880a.h().c().booleanValue()) {
            return false;
        }
        return true;
    }

    private static boolean d(Aweme aweme) {
        Integer c2 = s.a.f66880a.r().c();
        if (c2 != null && c2.intValue() == 2) {
            User currentUser = BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser();
            if (aweme == null || currentUser == null || !TextUtils.equals(aweme.getRegion(), currentUser.getRegion()) || aweme.isReviewed() || a(aweme)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean a(Context context, Aweme aweme) {
        String c2;
        Integer c3 = s.a.f66880a.r().c();
        if (c3 != null && c3.intValue() == 1 && aweme != null && !aweme.isReviewed() && !a(aweme)) {
            aj<String> downloadForbiddenToast = SharePrefCache.inst().getDownloadForbiddenToast();
            if (downloadForbiddenToast == null) {
                c2 = null;
            } else {
                c2 = downloadForbiddenToast.c();
            }
            if (TextUtils.isEmpty(c2)) {
                c2 = context.getString(R.string.bbx);
            }
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(c2).a();
            return false;
        } else if (m.a(aweme) || aweme == null || aweme.getDownloadStatus() == 0) {
            return true;
        } else {
            new com.ss.android.ugc.aweme.tux.a.i.a(context).a(context.getString(R.string.c0r)).a();
            return false;
        }
    }

    public static boolean a(Aweme aweme, boolean z) {
        if (aweme != null && !c(aweme) && !d(aweme)) {
            boolean isReviewed = aweme.isReviewed();
            if (a(aweme)) {
                if (!isReviewed && com.bytedance.ies.abmock.b.a().a(true, "close_client_watermark", 0) == com.ss.android.ugc.aweme.share.h.a.f123556a) {
                    return false;
                }
                return true;
            } else if (aweme.isImage()) {
                return true;
            } else {
                if (!z || (!isReviewed && !c.a())) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
