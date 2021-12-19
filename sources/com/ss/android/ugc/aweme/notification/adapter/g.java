package com.ss.android.ugc.aweme.notification.adapter;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AnnouncementNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import h.f.b.l;

public final class g {
    static {
        Covode.recordClassIndex(72778);
    }

    public static final int a(MusNotice musNotice) {
        l.d(musNotice, "");
        if (musNotice.templateNotice != null) {
            return -10000;
        }
        if ((musNotice.type == 1 || musNotice.type == 11) && musNotice.announcement != null) {
            AnnouncementNotice announcementNotice = musNotice.announcement;
            l.b(announcementNotice, "");
            if (announcementNotice.getChallenge() != null) {
                return 101;
            }
        }
        if (musNotice.type == 31 && musNotice.commentNotice != null) {
            CommentNotice commentNotice = musNotice.commentNotice;
            l.b(commentNotice, "");
            if (commentNotice.isReplyWithVideo()) {
                return 1003;
            }
        }
        return musNotice.type;
    }
}
