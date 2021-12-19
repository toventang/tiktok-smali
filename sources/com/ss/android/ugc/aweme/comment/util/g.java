package com.ss.android.ugc.aweme.comment.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.commercialize.model.ac;
import com.ss.android.ugc.aweme.commercialize.model.s;
import com.ss.android.ugc.aweme.commercialize.utils.bh;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class g {
    static {
        Covode.recordClassIndex(44869);
    }

    private static boolean a() {
        if (b.a().a(true, "enable_link_ad_migration", true)) {
            return true;
        }
        return false;
    }

    public static s a(Aweme aweme) {
        ac a2 = bh.a(aweme);
        if (a2 != null) {
            if (a2.linkType == 0) {
                if (!a()) {
                    return null;
                }
                s sVar = new s();
                sVar.setAid(aweme.getAid());
                sVar.setAvatarIcon(a2.avatarIcon);
                sVar.setButtonText(a2.buttonText);
                sVar.setCommentTime(aweme.getCreateTime());
                sVar.setCommentInfo(a2.title);
                sVar.setTitle(a2.title);
                sVar.setCommentNickName(aweme.getAuthor().getNickname());
                sVar.setUser(aweme.getAuthor());
                sVar.setCommentType(10);
                return sVar;
            } else if (a2.linkType != 1 || !com.ss.android.ugc.aweme.commercialize.e.a.b.ae(aweme)) {
                return null;
            } else {
                s sVar2 = new s();
                sVar2.setCommentTime(aweme.getCreateTime());
                sVar2.setCommentType(12);
                return sVar2;
            }
        }
        return null;
    }
}
