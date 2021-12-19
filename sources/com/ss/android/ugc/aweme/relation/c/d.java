package com.ss.android.ugc.aweme.relation.c;

import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.metrics.u;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f120373a = new d();

    private d() {
    }

    static {
        Covode.recordClassIndex(78319);
    }

    public static void a(int i2, String str) {
        String str2;
        l.d(str, "");
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        if (i2 == b.NEW_VERSION_FACEBOOK.getValue()) {
            str2 = "facebook";
        } else {
            str2 = "contact";
        }
        r.a("click_authorize_reconfirm_pop_up", dVar.a("platform", str2).a("enter_from", "version_update").a("result", str).f66730a);
    }

    public static void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        r.a("exit_update_authorize_process", new com.ss.android.ugc.aweme.app.f.d().a("exit_from", str).a("enter_from", "version_update").a("enter_method", str2).f66730a);
    }

    public static void a(User user, int i2, int i3) {
        if (user != null) {
            r.a("follow", c(user, i2, i3).f66730a);
        }
    }

    public static void b(User user, int i2, int i3) {
        if (user != null) {
            r.a("follow_cancel", c(user, i2, i3).f66730a);
        }
    }

    public static void a(int i2, String str, int i3) {
        String str2 = "";
        l.d(str, str2);
        if (i2 == 1) {
            str2 = "contact_boarding";
        } else if (i2 == 2) {
            str2 = "fb_boarding";
        } else if (i2 == 3) {
            str2 = "version_update";
        }
        if (i3 == 0) {
            r.a("follow_cancel_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str2).a("to_user_id", str).f66730a);
        } else {
            r.a("follow_finish", new com.ss.android.ugc.aweme.app.f.d().a("enter_from", str2).a("to_user_id", str).f66730a);
        }
    }

    private static com.ss.android.ugc.aweme.app.f.d c(User user, int i2, int i3) {
        String str;
        String str2;
        String type;
        com.ss.android.ugc.aweme.app.f.d dVar = new com.ss.android.ugc.aweme.app.f.d();
        if (i3 == 1) {
            str = "contact_boarding";
        } else if (i3 == 2) {
            str = "fb_boarding";
        } else if (i3 != 3) {
            str = "";
        } else {
            str = "version_update";
        }
        com.ss.android.ugc.aweme.app.f.d a2 = dVar.a("enter_from", str);
        if (i3 == 1) {
            str2 = "1-1";
        } else if (i3 == 2) {
            str2 = "1-2";
        } else if (i3 != 3 || (str2 = user.getRecType()) == null) {
            str2 = "";
        }
        com.ss.android.ugc.aweme.app.f.d a3 = a2.a("rec_type", str2).a("rec_uid", user.getUid()).a("to_user_id", user.getUid()).a("impr_order", i2).a("req_id", user.getRequestId());
        if (i3 == 3) {
            a3.a("enter_method", "follow_button");
            String friendTypeStr = user.getFriendTypeStr();
            if (friendTypeStr == null) {
                friendTypeStr = "";
            }
            a3.a("relation_type", friendTypeStr);
            if (user.getFollowerStatus() == 1) {
                type = u.b.MUTUAL.getType();
            } else {
                type = u.b.SINGLE.getType();
            }
            a3.a("follow_type", type);
        }
        l.b(a3, "");
        return a3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (r7 == com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK.getValue()) goto L_0x0046;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(int r6, int r7, java.lang.String r8, long r9) {
        /*
            java.lang.String r5 = ""
            h.f.b.l.d(r8, r5)
            com.ss.android.ugc.aweme.app.f.d r4 = new com.ss.android.ugc.aweme.app.f.d
            r4.<init>()
            r0 = 1
            java.lang.String r3 = "facebook"
            java.lang.String r2 = "contact"
            r1 = 3
            if (r6 == r0) goto L_0x0048
            r0 = 2
            if (r6 == r0) goto L_0x0046
            if (r6 == r1) goto L_0x003e
        L_0x0017:
            java.lang.String r0 = "platform"
            com.ss.android.ugc.aweme.app.f.d r2 = r4.a(r0, r5)
            if (r6 != r1) goto L_0x003b
            java.lang.String r1 = "version_update"
        L_0x0021:
            java.lang.String r0 = "enter_from"
            com.ss.android.ugc.aweme.app.f.d r1 = r2.a(r0, r1)
            java.lang.String r0 = "result"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.a(r0, r8)
            java.lang.String r0 = "duration"
            com.ss.android.ugc.aweme.app.f.d r0 = r1.a(r0, r9)
            java.util.Map<java.lang.String, java.lang.String> r1 = r0.f66730a
            java.lang.String r0 = "confirm_auth_page"
            com.ss.android.ugc.aweme.common.r.a(r0, r1)
            return
        L_0x003b:
            java.lang.String r1 = "login_onboarding"
            goto L_0x0021
        L_0x003e:
            com.ss.android.ugc.aweme.relation.c.b r0 = com.ss.android.ugc.aweme.relation.c.b.NEW_VERSION_FACEBOOK
            int r0 = r0.getValue()
            if (r7 != r0) goto L_0x0048
        L_0x0046:
            r5 = r3
            goto L_0x0017
        L_0x0048:
            r5 = r2
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.relation.c.d.a(int, int, java.lang.String, long):void");
    }
}
