package com.ss.android.ugc.aweme.metrics;

import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.ugc.glue.monitor.UGCMonitor;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRelationRecommendModel;
import com.ss.android.ugc.aweme.metrics.c;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.recommend.g;
import com.ss.android.ugc.aweme.utils.eu;
import h.f.b.l;

public final class u extends h<u> {
    private int X = -1;
    private String Y = "";
    private String Z = "";

    /* renamed from: a  reason: collision with root package name */
    public c f109596a;
    private String aa = "";

    /* renamed from: b  reason: collision with root package name */
    public a f109597b;

    /* renamed from: c  reason: collision with root package name */
    private String f109598c = "";

    /* renamed from: d  reason: collision with root package name */
    private b f109599d;

    /* renamed from: e  reason: collision with root package name */
    private String f109600e = "";
    private String p = "";
    private String q = "";
    private String r = "";
    private String s = "";
    private String t = "";
    private String u = "";
    private AwemeRelationRecommendModel v;

    static {
        Covode.recordClassIndex(70146);
    }

    public enum a {
        SHOW("show"),
        FOLLOW("follow"),
        ENTER_PROFILE("enter_profile"),
        PROFILE_FOLLOW("profile_follow"),
        CLOSE("close"),
        FOLLOW_CANCEL("follow_cancel"),
        PROFILE_FOLLOW_CANCEL("profile_follow_cancel"),
        DISLIKE("dislike"),
        ENTER_CHAT("enter_chat"),
        SHARE_POP_UP("share_pop_up");
        
        private final String type;

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(70147);
        }

        private a(String str) {
            this.type = str;
        }
    }

    public enum b {
        SINGLE("single"),
        MUTUAL("mutual"),
        NO_RELATION("");
        
        private final String type;

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(70148);
        }

        private b(String str) {
            this.type = str;
        }
    }

    public enum c {
        CARD("card"),
        POP_UP("pop_up"),
        ITEM("item"),
        SHARE_LINK("share_link"),
        LOGIN("login"),
        PUSH("push"),
        INBOX_NOTICE("inbox_notice");
        
        private final String type;

        public final String getType() {
            return this.type;
        }

        static {
            Covode.recordClassIndex(70149);
        }

        private c(String str) {
            this.type = str;
        }
    }

    public final void b() {
        if (!TextUtils.isEmpty(this.t) || !TextUtils.isEmpty(this.C)) {
            f();
        }
    }

    public u() {
        super("follow_recommend");
        this.f109559k = true;
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.metrics.c
    public final void a() {
        String str;
        String str2;
        boolean z;
        Integer valueOf;
        a("enter_from", this.f109556h, c.a.f109562a);
        a("previous_page", this.f109598c, c.a.f109562a);
        c cVar = this.f109596a;
        String str3 = null;
        if (cVar != null) {
            str = cVar.getType();
        } else {
            str = null;
        }
        a("scene_type", str, c.a.f109562a);
        a aVar = this.f109597b;
        if (aVar != null) {
            str2 = aVar.getType();
        } else {
            str2 = null;
        }
        a("action_type", str2, c.a.f109562a);
        a("rec_type", this.C, c.a.f109562a);
        b bVar = this.f109599d;
        if (bVar != null) {
            str3 = bVar.getType();
        }
        a("follow_type", str3, c.a.f109562a);
        a("to_user_id", this.f109600e, c.a.f109562a);
        a("group_id", this.p, c.a.f109562a);
        a("author_id", this.q, c.a.f109562a);
        a("req_id", this.r, c.a.f109562a);
        a("homepage_user_id", this.s, c.a.f109562a);
        a("relation_type", this.t, c.a.f109562a);
        a("follow_status", this.X);
        a("position", this.aa);
        if (!TextUtils.isEmpty(this.u)) {
            a("enter_method", this.u);
        }
        if (this.f109596a == c.ITEM) {
            Aweme aweme = this.U;
            if (aweme == null || (valueOf = Integer.valueOf(aweme.getAwemeType())) == null || !(valueOf.intValue() == 5457744 || valueOf.intValue() == 40)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                a("story_type", "story");
            } else {
                a("story_type", UGCMonitor.TYPE_POST);
            }
        }
    }

    public final u a(String str) {
        if (str == null) {
            str = "";
        }
        this.f109556h = str;
        return this;
    }

    public final u o(String str) {
        if (str == null) {
            str = "";
        }
        this.u = str;
        return this;
    }

    public final u p(String str) {
        if (str == null) {
            str = "";
        }
        this.aa = str;
        return this;
    }

    public final u q(String str) {
        if (str == null) {
            str = "";
        }
        this.f109598c = str;
        return this;
    }

    public final u r(String str) {
        if (str == null) {
            str = "";
        }
        this.p = str;
        return this;
    }

    public final u s(String str) {
        if (str == null) {
            str = "";
        }
        this.r = str;
        return this;
    }

    public final u t(String str) {
        if (str == null) {
            str = "";
        }
        this.s = str;
        return this;
    }

    public static b b(User user) {
        if (user != null) {
            if (user.getFollowerStatus() == 1 && user.getFollowStatus() != 0 && user.getFollowStatus() != 4) {
                return b.MUTUAL;
            }
            if (user.getFollowerStatus() != 1 && (user.getFollowStatus() == 0 || user.getFollowStatus() == 4)) {
                return b.NO_RELATION;
            }
        }
        return b.SINGLE;
    }

    /* renamed from: f */
    public final u g(Aweme aweme) {
        String str;
        String str2;
        super.g(aweme);
        if (aweme != null) {
            AwemeRelationRecommendModel relationRecommendInfo = aweme.getRelationRecommendInfo();
            this.v = relationRecommendInfo;
            String str3 = "";
            if (relationRecommendInfo == null || (str = relationRecommendInfo.getFriendTypeStr()) == null) {
                str = str3;
            }
            this.t = str;
            AwemeRelationRecommendModel awemeRelationRecommendModel = this.v;
            if (awemeRelationRecommendModel == null || (str2 = awemeRelationRecommendModel.getRecType()) == null) {
                str2 = str3;
            }
            this.C = str2;
            String groupId = aweme.getGroupId();
            if (groupId == null) {
                groupId = str3;
            }
            this.p = groupId;
            String authorUid = aweme.getAuthorUid();
            if (authorUid != null) {
                str3 = authorUid;
            }
            this.q = str3;
        }
        return this;
    }

    public final u a(User user) {
        if (user != null) {
            String uid = user.getUid();
            String str = "";
            if (uid == null) {
                uid = str;
            }
            this.f109600e = uid;
            if (TextUtils.isEmpty(this.t)) {
                String friendTypeStr = user.getFriendTypeStr();
                if (friendTypeStr == null) {
                    friendTypeStr = str;
                }
                this.t = friendTypeStr;
            }
            if (TextUtils.isEmpty(this.C)) {
                String recType = user.getRecType();
                if (recType == null) {
                    recType = str;
                }
                this.C = recType;
            }
            String requestId = user.getRequestId();
            if (requestId != null) {
                str = requestId;
            }
            this.r = str;
            this.f109599d = b(user);
            eu.a(this, user);
        }
        return this;
    }

    public final u a(g gVar) {
        String str = "";
        l.d(gVar, str);
        String enterFrom = gVar.getEnterFrom();
        if (enterFrom == null) {
            enterFrom = str;
        }
        this.f109556h = enterFrom;
        String previousPage = gVar.getPreviousPage();
        if (previousPage == null) {
            previousPage = str;
        }
        this.f109598c = previousPage;
        this.f109596a = gVar.getSceneType();
        String recType = gVar.getRecType();
        if (recType == null) {
            recType = str;
        }
        this.C = recType;
        this.f109599d = gVar.getFollowType();
        String toUserId = gVar.getToUserId();
        if (toUserId == null) {
            toUserId = str;
        }
        this.f109600e = toUserId;
        String groupId = gVar.getGroupId();
        if (groupId == null) {
            groupId = str;
        }
        this.p = groupId;
        String authorId = gVar.getAuthorId();
        if (authorId == null) {
            authorId = str;
        }
        this.q = authorId;
        String reqId = gVar.getReqId();
        if (reqId == null) {
            reqId = str;
        }
        this.r = reqId;
        String homepageUserId = gVar.getHomepageUserId();
        if (homepageUserId == null) {
            homepageUserId = str;
        }
        this.s = homepageUserId;
        String friendTypeStr = gVar.getFriendTypeStr();
        if (friendTypeStr != null) {
            str = friendTypeStr;
        }
        this.t = str;
        if (gVar.getSocialInfo() != null) {
            User user = new User();
            user.setSocialInfo(gVar.getSocialInfo());
            eu.a(this, user);
        }
        return this;
    }
}
