package com.ss.android.ugc.aweme.upvote.event;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.InteractPermission;
import com.ss.android.ugc.aweme.upvote.service.a;
import h.a.i;
import h.f.b.l;

public final class c {
    static {
        Covode.recordClassIndex(92980);
    }

    public static final d a(d dVar, Aweme aweme, String str) {
        String str2;
        l.d(dVar, "");
        Integer num = null;
        if (aweme != null) {
            str2 = aweme.getAid();
            InteractPermission interactPermission = aweme.getInteractPermission();
            if (interactPermission != null) {
                num = Integer.valueOf(interactPermission.getUpvote());
            }
        } else {
            str2 = null;
        }
        a(dVar, str2, num, str);
        return dVar;
    }

    public static final <T extends com.ss.android.ugc.aweme.metrics.c<?>> T a(T t, Aweme aweme, String str) {
        Integer num;
        String str2;
        l.d(t, "");
        if (!(aweme == null || aweme.getAid() == null)) {
            String aid = aweme.getAid();
            l.b(aid, "");
            InteractPermission interactPermission = aweme.getInteractPermission();
            if (interactPermission != null) {
                num = Integer.valueOf(interactPermission.getUpvote());
            } else {
                num = null;
            }
            if (!a(aid, num, str)) {
                return t;
            }
            a aVar = a.f142308a;
            String aid2 = aweme.getAid();
            l.b(aid2, "");
            a c2 = aVar.c(aid2);
            if (c2 == null) {
                return t;
            }
            String str3 = "1";
            if (c2.f142218a) {
                str2 = str3;
            } else {
                str2 = "0";
            }
            com.ss.android.ugc.aweme.metrics.c a2 = t.a("is_recommend", str2).a("recommend_cnt", c2.f142219b);
            if (!c2.f142220c) {
                str3 = "0";
            }
            a2.a("is_self", str3);
        }
        return t;
    }

    public static final boolean a(String str, Integer num, String str2) {
        if (i.a(new String[]{"homepage_hot", "notification_page"}, str2)) {
            num = a.f142308a.b(str);
        }
        if (num == null || num.intValue() != 0) {
            return false;
        }
        return true;
    }

    public static final d a(d dVar, String str, Integer num, String str2) {
        a c2;
        String str3;
        l.d(dVar, "");
        if (str == null || !a(str, num, str2) || (c2 = a.f142308a.c(str)) == null) {
            return dVar;
        }
        String str4 = "1";
        if (c2.f142218a) {
            str3 = str4;
        } else {
            str3 = "0";
        }
        d a2 = dVar.a("is_recommend", str3).a("recommend_cnt", c2.f142219b);
        if (!c2.f142220c) {
            str4 = "0";
        }
        a2.a("is_self", str4);
        return dVar;
    }
}
