package com.ss.android.ugc.aweme.notification.view.template;

import android.text.TextUtils;
import com.bytedance.android.livesdk.utils.p;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.notice.repo.a.b;
import com.ss.android.ugc.aweme.notice.repo.list.a.c;
import com.ss.android.ugc.aweme.notice.repo.list.a.d;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notification.view.template.b.a;
import com.ss.android.ugc.aweme.profile.model.User;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f114030a = new e();

    private e() {
    }

    static {
        Covode.recordClassIndex(73319);
    }

    public static boolean b(MusNotice musNotice) {
        Boolean bool;
        c cVar;
        List<d> list;
        com.ss.android.ugc.aweme.notice.repo.list.bean.e eVar = musNotice.templateNotice;
        if (eVar == null || (cVar = eVar.f112844b) == null || (list = cVar.q) == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(!list.isEmpty());
        }
        return p.a(bool);
    }

    public static int a(MusNotice musNotice) {
        String str;
        String str2 = "";
        l.d(musNotice, str2);
        try {
            JSONObject b2 = a.b(musNotice);
            Integer num = null;
            if (b2 != null) {
                str = b2.optString(StringSet.type);
            } else {
                str = null;
            }
            User d2 = a.d(musNotice);
            if (d2 != null) {
                num = Integer.valueOf(d2.getFollowStatus());
            }
            if (TextUtils.equals(str, "video_link")) {
                User d3 = a.d(musNotice);
                if (d3 != null) {
                    String uid = d3.getUid();
                    if (uid != null) {
                        str2 = uid;
                    }
                    b.a(str2, a.a(musNotice));
                }
                if (num != null && num.intValue() == 0) {
                    return 0;
                }
                return 8;
            } else if (TextUtils.equals(str, "video_sharer")) {
                User d4 = a.d(musNotice);
                if (d4 == null) {
                    return 8;
                }
                String uid2 = d4.getUid();
                if (uid2 != null) {
                    str2 = uid2;
                }
                b.a(str2, a.a(musNotice));
                return 8;
            } else if (!b(musNotice)) {
                return 8;
            }
            return 0;
        } catch (Exception unused) {
            return 8;
        }
    }

    public static boolean a(MusNotice musNotice, String str) {
        try {
            JSONObject b2 = a.b(musNotice);
            if (b2 == null || !TextUtils.equals(str, b2.optString(StringSet.type))) {
                return false;
            }
            return true;
        } catch (Exception unused) {
        }
    }
}
