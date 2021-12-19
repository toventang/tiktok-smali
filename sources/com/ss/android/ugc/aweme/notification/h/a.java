package com.ss.android.ugc.aweme.notification.h;

import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.router.SmartRouter;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.bytedance.vcloud.abrmodule.ABRConfig;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.AtMe;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CommentNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.DiggNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.FollowNotice;
import com.ss.android.ugc.aweme.notification.bean.l;
import com.ss.android.ugc.aweme.notification.h.u;
import com.ss.android.ugc.aweme.notification.utils.f;
import com.ss.android.ugc.aweme.notification.utils.i;
import com.ss.android.ugc.aweme.notification.vm.BaseNotificationVM;
import com.ss.android.ugc.aweme.profile.model.User;
import h.p;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class a extends RecyclerView.ViewHolder implements View.OnClickListener, View.OnLongClickListener {

    /* renamed from: a  reason: collision with root package name */
    private BaseNotice f113482a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, BaseNotice> f113483b;

    /* renamed from: c  reason: collision with root package name */
    private View f113484c;

    /* renamed from: d  reason: collision with root package name */
    private e f113485d;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f113486g;

    /* renamed from: h  reason: collision with root package name */
    public BaseNotificationVM f113487h;

    static {
        Covode.recordClassIndex(72974);
    }

    private static boolean c(int i2) {
        return i2 == 23 || i2 == 25 || i2 == 26 || i2 == 27;
    }

    private static boolean d(int i2) {
        return i2 == 54 || i2 == 55;
    }

    public void bY_() {
    }

    public void d() {
    }

    /* access modifiers changed from: protected */
    public boolean e() {
        return false;
    }

    public void a(e eVar) {
        this.f113485d = eVar;
    }

    /* access modifiers changed from: protected */
    public final <T extends View> T a(int i2) {
        return (T) this.itemView.findViewById(i2);
    }

    protected static boolean b(int i2) {
        if (i2 == u.a.C2910a.f113722e || i2 == u.a.C2910a.f113723f) {
            return true;
        }
        return false;
    }

    public a(View view) {
        super(view);
        this.f113484c = view;
        if (e()) {
            this.f113484c.setOnLongClickListener(this);
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\d+\\d$").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    public void onClick(View view) {
        BaseNotice baseNotice;
        ClickAgent.onClick(view);
        Map<String, BaseNotice> map = this.f113483b;
        if (map != null && (baseNotice = this.f113482a) != null) {
            map.put(baseNotice.nid, this.f113482a);
        }
    }

    public boolean onLongClick(View view) {
        int layoutPosition = getLayoutPosition();
        if (this.f113485d == null || layoutPosition < 0 || !e()) {
            return true;
        }
        this.f113485d.a(layoutPosition);
        return true;
    }

    protected static String a(CommentNotice commentNotice) {
        if (commentNotice == null) {
            return "";
        }
        switch (commentNotice.getCommentType()) {
            case ABRConfig.ABR_BANDWIDTH_PARAMETER_KEY:
            case ABRConfig.ABR_SELECT_SCENE:
                return "comment_a";
            case ABRConfig.ABR_DEFAULT_WIFI_BITRATE:
            case 15:
                return "comment_b";
            case ABRConfig.ABR_STARTUP_MAX_BITRATE:
            case 16:
                return "comment_c";
            default:
                return "";
        }
    }

    private static void a(l lVar, BaseNotice baseNotice) {
        FollowNotice followNotice = baseNotice.followNotice;
        if (followNotice != null) {
            lVar.f113264k = 0;
            lVar.f113261h = followNotice.getUser().getUid();
            int followStatus = followNotice.getUser().getFollowStatus();
            a(lVar, Collections.singletonList(followNotice.getUser()));
            if (followStatus == 0) {
                lVar.f113259f = "follow";
            } else if (followStatus == 1 || followStatus == 2) {
                lVar.f113259f = "followed";
            }
        }
    }

    private static void d(l lVar, BaseNotice baseNotice) {
        String str;
        AtMe atMe = baseNotice.atMe;
        if (atMe != null) {
            lVar.f113264k = 0;
            lVar.f113261h = atMe.getUser().getUid();
            a(lVar, Collections.singletonList(atMe.getUser()));
            Aweme aweme = atMe.getAweme();
            if (aweme != null) {
                lVar.t = aweme.getGroupId();
                String aid = aweme.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    lVar.t = aid;
                    if (d(atMe.getSubType())) {
                        str = "story";
                    } else {
                        str = UGCMonitor.TYPE_POST;
                    }
                    lVar.u = str;
                }
            }
        }
    }

    private static void a(l lVar, List<User> list) {
        String a2 = com.ss.android.ugc.aweme.ao.a.a(list);
        lVar.v = a2;
        p<Integer, Integer> b2 = com.ss.android.ugc.aweme.ao.a.b(list);
        if (a2 != null && b2 != null) {
            int intValue = b2.getFirst().intValue();
            int intValue2 = b2.getSecond().intValue();
            if (intValue != 0) {
                return;
            }
            if (intValue2 == 0) {
                lVar.w = "follow";
            } else {
                lVar.w = "follow_back";
            }
        }
    }

    private static void b(l lVar, BaseNotice baseNotice) {
        List<User> users;
        String str;
        DiggNotice diggNotice = baseNotice.diggNotice;
        if (!(diggNotice == null || (users = diggNotice.getUsers()) == null || users.size() == 0)) {
            int mergeCount = diggNotice.getMergeCount();
            a(lVar, users);
            if (mergeCount == 1) {
                lVar.f113264k = 0;
                lVar.f113261h = users.get(0).getUid();
            } else {
                lVar.f113264k = 1;
                StringBuilder sb = new StringBuilder();
                for (int i2 = 0; i2 < users.size(); i2++) {
                    User user = users.get(i2);
                    if (i2 == users.size() - 1) {
                        sb.append(user.getUid());
                    } else {
                        sb.append(user.getUid()).append(",");
                    }
                }
                lVar.f113261h = sb.toString();
            }
            if (diggNotice.getDiggType() == 3) {
                lVar.f113262i = UGCMonitor.EVENT_COMMENT;
                lVar.f113263j = diggNotice.getCid();
            } else {
                lVar.f113262i = "video";
                lVar.f113263j = diggNotice.getForwardId();
            }
            Aweme aweme = diggNotice.getAweme();
            if (aweme != null) {
                String aid = aweme.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    lVar.t = aid;
                    if (b(diggNotice.getDiggType())) {
                        str = "story";
                    } else {
                        str = UGCMonitor.TYPE_POST;
                    }
                    lVar.u = str;
                }
            }
        }
    }

    private static void c(l lVar, BaseNotice baseNotice) {
        String str;
        CommentNotice commentNotice = baseNotice.commentNotice;
        if (commentNotice != null) {
            Aweme aweme = commentNotice.getAweme();
            if (aweme != null) {
                String aid = aweme.getAid();
                if (!TextUtils.isEmpty(aid)) {
                    lVar.t = aid;
                    if (c(commentNotice.getCommentType())) {
                        str = "story";
                    } else {
                        str = UGCMonitor.TYPE_POST;
                    }
                    lVar.u = str;
                }
            }
            a(lVar, Collections.singletonList(commentNotice.getComment().getUser()));
            lVar.f113264k = 0;
            lVar.f113261h = commentNotice.getComment().getUser().getUid();
            int commentType = commentNotice.getCommentType();
            if (!(commentType == 0 || commentType == 1)) {
                if (!(commentType == 2 || commentType == 4)) {
                    if (commentType != 5) {
                        if (!(commentType == 6 || commentType == 8)) {
                            if (!(commentType == 14 || commentType == 11)) {
                                if (commentType != 12) {
                                    return;
                                }
                            }
                        }
                    }
                }
                lVar.f113262i = UGCMonitor.EVENT_COMMENT;
                lVar.f113263j = commentNotice.getForwardId();
                return;
            }
            lVar.f113262i = "video";
            lVar.f113263j = commentNotice.getForwardId();
        }
    }

    public static void b(String str, String str2, String str3) {
        SmartRouter.buildRoute(d.a(), "aweme://user/profile/").withParam("uid", str).withParam("enter_from", str3).withParam("sec_user_id", str2).withParam("previous_page", "message").withParam("enter_method", "follow_button").withParam("extra_from_pre_page", "notification_page").withParam("extra_previous_page_position", "card_head").open();
    }

    protected static void a(String str, String str2, String str3) {
        r.a("enter_personal_detail", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str2).a("enter_method", str3).a("to_user_id", str).f66730a);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, int i2, BaseNotice baseNotice, String str3, String str4, String str5, User user) {
        a(str, str2, i2, baseNotice, str3, str4, str5, -1, user);
    }

    /* access modifiers changed from: protected */
    public final void a(String str, String str2, int i2, BaseNotice baseNotice, String str3, String str4, String str5, int i3, User user) {
        if (baseNotice != null) {
            l lVar = new l();
            lVar.f113254a = str;
            lVar.f113255b = str2;
            lVar.f113260g = baseNotice.createTime;
            lVar.f113258e = str3;
            lVar.f113265l = baseNotice.logPbBean;
            lVar.o = str4;
            if (user != null) {
                lVar.p = i.a(this.f113484c.getContext(), user);
            }
            if (baseNotice.timeLineType != -1) {
                lVar.f113266m = f.a(baseNotice.timeLineType);
                lVar.n = "1002";
            }
            if (!TextUtils.isEmpty(baseNotice.getLabelText())) {
                lVar.r = baseNotice.getLabelText();
            }
            if (i2 != -1) {
                lVar.f113256c = i2;
            }
            lVar.f113257d = "";
            if (!TextUtils.isEmpty(str5)) {
                lVar.q = str5;
            }
            str2.hashCode();
            switch (str2.hashCode()) {
                case 3123:
                    if (str2.equals("at")) {
                        d(lVar, baseNotice);
                        break;
                    }
                    break;
                case 3135424:
                    if (str2.equals("fans")) {
                        a(lVar, baseNotice);
                        break;
                    }
                    break;
                case 3321751:
                    if (str2.equals("like")) {
                        b(lVar, baseNotice);
                        break;
                    }
                    break;
                case 950398559:
                    if (str2.equals(UGCMonitor.EVENT_COMMENT)) {
                        c(lVar, baseNotice);
                        break;
                    }
                    break;
            }
            if (i3 != -1) {
                lVar.s = i3;
            }
            lVar.a();
        }
    }
}
