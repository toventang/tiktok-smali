package com.ss.android.ugc.aweme.notification.utils;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.inbox.r;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.notice.repo.list.a.c;
import com.ss.android.ugc.aweme.notice.repo.list.a.f;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CombineLiveNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.bean.LiveMessage;
import com.ss.android.ugc.aweme.notification.bean.LiveNoticeMessageResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.eu;
import h.a.n;
import h.f.b.l;
import h.f.b.m;
import h.q;
import h.z;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

public final class e {
    static {
        Covode.recordClassIndex(73227);
    }

    public static final void a(String str, r rVar) {
        l.d(str, "");
        l.d(rVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("is_auth", "0");
        linkedHashMap.put("platform", "contact");
        String str2 = "on";
        linkedHashMap.put("did_status", com.ss.android.ugc.aweme.friends.service.a.f97047a.d().b() ? str2 : "unknown");
        if (!com.ss.android.ugc.aweme.friends.service.a.f97047a.d().a()) {
            str2 = "off";
        }
        linkedHashMap.put("uid_status", str2);
        linkedHashMap.put("position", rVar == r.TOP ? "top" : "bottom");
        com.ss.android.ugc.aweme.common.r.a(str, linkedHashMap);
    }

    public static final void a(String str) {
        l.d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("to_tab_name", str);
        com.ss.android.ugc.aweme.common.r.a("change_notification_tab", linkedHashMap);
    }

    public static final void a(String str, String str2, String str3, User user, String str4) {
        JSONObject jSONObject;
        l.d(str, "");
        l.d(str2, "");
        l.d(str3, "");
        if (str4 != null) {
            jSONObject = new JSONObject(str4);
        } else {
            jSONObject = new JSONObject();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                if (l.a((Object) next, (Object) "business_extra")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString(next));
                    Iterator<String> keys2 = jSONObject2.keys();
                    l.b(keys2, "");
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        l.b(next2, "");
                        String optString = jSONObject2.optString(next2);
                        l.b(optString, "");
                        linkedHashMap.put(next2, optString);
                    }
                } else if (!linkedHashMap.containsKey(next)) {
                    l.b(next, "");
                    String optString2 = jSONObject.optString(next);
                    l.b(optString2, "");
                    linkedHashMap.put(next, optString2);
                }
                q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                q.m223constructorimpl(h.r.a(th));
            }
        }
        a(str, str2, str3, user, linkedHashMap);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r7.getFollowerStatus() != 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.lang.String r4, java.lang.String r5, java.lang.String r6, com.ss.android.ugc.aweme.profile.model.User r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
        // Method dump skipped, instructions count: 184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.utils.e.a(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.profile.model.User, java.util.Map):void");
    }

    public static final void a(String str, int i2, String str2, int i3, String str3) {
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.common.r.a("notification_message_inner_message", new d().a("action_type", "show").a("account_type", str).a("client_order", String.valueOf(i2)).a("tab_name", f.a(Integer.valueOf(i3))).a("timeline", str2).a("template_id", str3).a("scene_id", "1002").f66730a);
    }

    static final class a extends m implements h.f.a.a<z> {
        final /* synthetic */ Throwable $error;
        final /* synthetic */ MusNotice $notice;
        final /* synthetic */ BaseResponse $resp;

        static {
            Covode.recordClassIndex(73228);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(MusNotice musNotice, BaseResponse baseResponse, Throwable th) {
            super(0);
            this.$notice = musNotice;
            this.$resp = baseResponse;
            this.$error = th;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
            if (r0 != null) goto L_0x0078;
         */
        @Override // h.f.a.a
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ h.z invoke() {
            /*
            // Method dump skipped, instructions count: 150
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.utils.e.a.invoke():java.lang.Object");
        }
    }

    public static final int a(User user) {
        if (user.getFollowStatus() == 0 && user.getFollowerStatus() == 1) {
            return 3;
        }
        return user.getFollowStatus();
    }

    public static final void b(String str) {
        l.d(str, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("tab_name", str);
        com.ss.android.ugc.aweme.common.r.a("click_notification_tab", linkedHashMap);
    }

    public static final void a(r rVar) {
        String str;
        l.d(rVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("platform", "contact");
        linkedHashMap.put("enter_method", "long_press");
        if (rVar == r.TOP) {
            str = "top";
        } else {
            str = "bottom";
        }
        linkedHashMap.put("position", str);
        com.ss.android.ugc.aweme.common.r.a("authorize_card_close", linkedHashMap);
    }

    public static final void c(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.common.r.a("click_see_all_activities", new d().a("enter_from", "notification_page").a("tab_name", str).a("notice_type", "all").a("show_cnt", 0).f66730a);
    }

    public static final void a(MusNotice musNotice) {
        User user;
        JSONObject jSONObject;
        String str;
        c cVar;
        f fVar;
        List<User> list;
        l.d(musNotice, "");
        u uVar = new u();
        uVar.f109597b = u.a.CLOSE;
        u a2 = uVar.a("notification_page");
        a2.f109596a = u.c.INBOX_NOTICE;
        com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar = musNotice.templateNotice;
        if (eVar == null || (cVar = eVar.f112844b) == null || (fVar = cVar.f112805d) == null || (list = fVar.f112824a) == null) {
            user = null;
        } else {
            user = (User) n.h((List) list);
        }
        u a3 = a2.a(user);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar2 = musNotice.templateNotice;
        if (eVar2 == null || (str = eVar2.f112851i) == null) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = new JSONObject(str);
        }
        Iterator<String> keys = jSONObject.keys();
        l.b(keys, "");
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                if (l.a((Object) next, (Object) "business_extra")) {
                    JSONObject jSONObject2 = new JSONObject(jSONObject.optString(next));
                    Iterator<String> keys2 = jSONObject2.keys();
                    l.b(keys2, "");
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        l.b(next2, "");
                        String optString = jSONObject2.optString(next2);
                        l.b(optString, "");
                        linkedHashMap.put(next2, optString);
                    }
                } else if (!linkedHashMap.containsKey(next)) {
                    l.b(next, "");
                    String optString2 = jSONObject.optString(next);
                    l.b(optString2, "");
                    linkedHashMap.put(next, optString2);
                }
                q.m223constructorimpl(z.f158842a);
            } catch (Throwable th) {
                q.m223constructorimpl(h.r.a(th));
            }
        }
        a3.a(linkedHashMap).f();
    }

    public static final void b(String str, r rVar) {
        String str2;
        l.d(str, "");
        l.d(rVar, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "notification_page");
        linkedHashMap.put("platform", str);
        if (rVar == r.TOP) {
            str2 = "top";
        } else {
            str2 = "bottom";
        }
        linkedHashMap.put("position", str2);
        com.ss.android.ugc.aweme.common.r.a("invitation_card_show", linkedHashMap);
    }

    public static final void a(LiveNoticeMessageResponse liveNoticeMessageResponse, long j2) {
        int i2;
        LiveMessage liveMessage;
        List<CombineLiveNotice> list;
        d dVar = new d();
        if (liveNoticeMessageResponse == null || (liveMessage = liveNoticeMessageResponse.liveMessage) == null || (list = liveMessage.liveNotice) == null) {
            i2 = 0;
        } else {
            i2 = list.size();
        }
        com.ss.android.ugc.aweme.common.r.a("livesdk_live_request_response", dVar.a("room_num", i2).a("duration", j2).a("enter_from_merge", "message").a("enter_method", "live_cell").a("action_type", "click").a("request_api", "/aweme/janus/v1/notice/multi/feed/").f66730a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b1 A[Catch:{ Exception -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c5 A[Catch:{ Exception -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00d2 A[Catch:{ Exception -> 0x00d6 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(com.ss.android.ugc.aweme.notification.bean.f r12, int r13) {
        /*
        // Method dump skipped, instructions count: 219
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.utils.e.a(com.ss.android.ugc.aweme.notification.bean.f, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r4.getFollowerStatus() != 0) goto L_0x0012;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void a(com.ss.android.ugc.aweme.profile.model.User r4, java.util.Map<java.lang.String, java.lang.String> r5) {
        /*
        // Method dump skipped, instructions count: 157
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.notification.utils.e.a(com.ss.android.ugc.aweme.profile.model.User, java.util.Map):void");
    }

    public static final void a(MusNotice musNotice, BaseResponse baseResponse, Throwable th) {
        l.d(musNotice, "");
        com.ss.android.ugc.aweme.notification.e.d.b(new a(musNotice, baseResponse, th));
    }

    public static final void b(User user, Integer num, String str) {
        l.d(user, "");
        l.d(str, "");
        com.ss.android.ugc.aweme.common.r.a("close_recommend_user_cell", new d().a("enter_from", "notification_page").a("rec_type", user.getRecType()).a("rec_uid", user.getUid()).a("impr_order", num).a("tab_name", str).a("relation_type", user.getFriendTypeStr()).a("req_id", user.getRequestId()).f66730a);
        u a2 = new u().a("notification_page");
        a2.f109596a = u.c.CARD;
        a2.f109597b = u.a.CLOSE;
        a2.a(user).s(user.getRequestId()).f();
    }

    public static final void c(User user, Integer num, String str) {
        String str2;
        String str3;
        u.a aVar;
        l.d(user, "");
        l.d(str, "");
        if (user.getFollowerStatus() == 1) {
            str2 = "mutual";
        } else {
            str2 = "single";
        }
        if (user.getFollowStatus() == 0) {
            str3 = "follow";
        } else {
            str3 = "follow_cancel";
        }
        com.ss.android.ugc.aweme.common.r.a(str3, new d().a("enter_method", "follow_button").a("enter_from", "notification_page").a("rec_type", user.getRecType()).a("to_user_id", user.getUid()).a("impr_order", num).a("tab_name", str).a("req_id", user.getRequestId()).a("relation_type", user.getFriendTypeStr()).a("follow_type", str2).f66730a);
        u a2 = new u().a("notification_page");
        a2.f109596a = u.c.CARD;
        if (user.getFollowStatus() == 0) {
            aVar = u.a.FOLLOW;
        } else {
            aVar = u.a.FOLLOW_CANCEL;
        }
        a2.f109597b = aVar;
        a2.a(user).s(user.getRequestId()).f();
    }

    public static final void d(User user, Integer num, String str) {
        l.d(user, "");
        l.d(str, "");
        d a2 = new d().a("enter_from", "notification_page").a("rec_type", user.getRecType()).a("to_user_id", user.getUid()).a("impr_order", num).a("tab_name", str).a("req_id", user.getRequestId()).a("impr_id", user.getUid()).a("relation_type", user.getFriendTypeStr()).a("follow_status", user.getFollowStatus());
        l.b(a2, "");
        com.ss.android.ugc.aweme.common.r.a("enter_personal_detail", eu.a(a2, user).f66730a);
        u a3 = new u().a("notification_page");
        a3.f109596a = u.c.CARD;
        a3.f109597b = u.a.ENTER_PROFILE;
        a3.a(user).s(user.getRequestId()).f();
    }

    public static final void a(User user, Integer num, String str) {
        l.d(user, "");
        l.d(str, "");
        com.ss.android.ugc.aweme.common.r.a("show_recommend_user_cell", new d().a("enter_from", "notification_page").a("rec_type", user.getRecType()).a("rec_uid", user.getUid()).a("impr_order", num).a("tab_name", str).a("req_id", user.getRequestId()).a("button_type", i.a(null, user)).a("relation_type", user.getFriendTypeStr()).f66730a);
        u a2 = new u().a("notification_page");
        a2.f109596a = u.c.CARD;
        a2.f109597b = u.a.SHOW;
        a2.a(user).s(user.getRequestId()).f();
    }
}
