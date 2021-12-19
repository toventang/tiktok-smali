package com.ss.android.ugc.aweme.share;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.b;
import com.ss.android.ugc.aweme.base.h.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeBubbleBusiness;
import com.ss.android.ugc.aweme.feed.model.AwemeBubbleInfo;
import com.ss.android.ugc.aweme.feed.x.ab;
import com.ss.android.ugc.aweme.utils.in;
import h.f.b.l;
import java.util.Map;
import org.json.JSONObject;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f124428a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f124429b;

    /* renamed from: c  reason: collision with root package name */
    public static final y f124430c = new y();

    private y() {
    }

    static {
        Covode.recordClassIndex(81697);
    }

    private static boolean a() {
        StringBuilder sb = new StringBuilder("promote_guide_shown_history_");
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        long a2 = d.c().a(sb.append(g2.getCurUserId()).toString());
        if (a2 != 0 && System.currentTimeMillis() - a2 <= 86400000) {
            return true;
        }
        return false;
    }

    public static final void c(Aweme aweme) {
        l.d(aweme, "");
        r.a("Promote_bubble_click", b(aweme).f66730a);
    }

    public static final boolean a(Aweme aweme) {
        l.d(aweme, "");
        f124428a = false;
        f124429b = false;
        if (!d(aweme)) {
            return false;
        }
        AwemeBubbleInfo bubbleInfo = aweme.getBubbleInfo();
        if ((bubbleInfo == null || bubbleInfo.getType() != 3) && a()) {
            return false;
        }
        return true;
    }

    public static com.ss.android.ugc.aweme.app.f.d b(Aweme aweme) {
        com.ss.android.ugc.aweme.app.f.d a2 = new com.ss.android.ugc.aweme.app.f.d().a("author_id", aweme.getAuthorUid()).a("group_id", aweme.getAid()).a("enter_from", "personal_homepage").a("is_self", in.a(aweme.getAuthorUid()) ? 1 : 0);
        try {
            String logExtra = aweme.getBubbleInfo().getLogExtra();
            if (logExtra != null) {
                Map<String, Object> a3 = ab.a(new JSONObject(logExtra));
                l.b(a3, "");
                for (Map.Entry<String, Object> entry : a3.entrySet()) {
                    a2.a(entry.getKey(), entry.getValue());
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        l.b(a2, "");
        return a2;
    }

    private static boolean d(Aweme aweme) {
        AwemeBubbleInfo bubbleInfo;
        AwemeBubbleInfo bubbleInfo2;
        String text;
        IAccountUserService g2 = b.g();
        l.b(g2, "");
        if (!g2.isLogin() || !in.a(aweme.getAuthorUid()) || aweme.getHasPromoteEntry() != 1 || (bubbleInfo = aweme.getBubbleInfo()) == null || bubbleInfo.getBiz() != AwemeBubbleBusiness.PROMOTE.getValue() || (bubbleInfo2 = aweme.getBubbleInfo()) == null || (text = bubbleInfo2.getText()) == null || text.length() == 0) {
            return false;
        }
        return true;
    }
}
