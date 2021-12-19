package com.ss.android.ugc.aweme.recommend;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;

public final class g implements Serializable {
    public static final a Companion = new a((byte) 0);
    private final String authorId;
    private final String enterFrom;
    private final u.b followType;
    private final String friendTypeStr;
    private final String groupId;
    private final String homepageUserId;
    private final String previousPage;
    private final String recType;
    private final String reqId;
    private final u.c sceneType;
    private final String socialInfo;
    private final String toUserId;

    static {
        Covode.recordClassIndex(78043);
    }

    public static final u.b getFollowType(User user) {
        return a.a(user);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(78044);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        public static u.b a(User user) {
            if (user == null) {
                return null;
            }
            if (user.getFollowerStatus() == 1) {
                return u.b.MUTUAL;
            }
            return u.b.SINGLE;
        }
    }

    public final String getAuthorId() {
        return this.authorId;
    }

    public final String getEnterFrom() {
        return this.enterFrom;
    }

    public final u.b getFollowType() {
        return this.followType;
    }

    public final String getFriendTypeStr() {
        return this.friendTypeStr;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getHomepageUserId() {
        return this.homepageUserId;
    }

    public final String getPreviousPage() {
        return this.previousPage;
    }

    public final String getRecType() {
        return this.recType;
    }

    public final String getReqId() {
        return this.reqId;
    }

    public final u.c getSceneType() {
        return this.sceneType;
    }

    public final String getSocialInfo() {
        return this.socialInfo;
    }

    public final String getToUserId() {
        return this.toUserId;
    }

    public g(String str, String str2, u.c cVar, String str3, u.b bVar, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.enterFrom = str;
        this.previousPage = str2;
        this.sceneType = cVar;
        this.recType = str3;
        this.followType = bVar;
        this.toUserId = str4;
        this.groupId = str5;
        this.authorId = str6;
        this.reqId = str7;
        this.homepageUserId = str8;
        this.friendTypeStr = str9;
        this.socialInfo = str10;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(String str, String str2, u.c cVar, String str3, u.b bVar, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, h.f.b.g gVar) {
        this(str, str2, cVar, str3, bVar, str4, str5, str6, str7, str8, (i2 & 1024) != 0 ? "" : str9, (i2 & 2048) != 0 ? null : str10);
    }
}
