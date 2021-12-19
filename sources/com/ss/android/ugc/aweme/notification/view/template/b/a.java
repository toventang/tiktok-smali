package com.ss.android.ugc.aweme.notification.view.template.b;

import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.notice.repo.list.a.c;
import com.ss.android.ugc.aweme.notice.repo.list.a.f;
import com.ss.android.ugc.aweme.notice.repo.list.bean.MusNotice;
import com.ss.android.ugc.aweme.notice.repo.list.bean.e;
import com.ss.android.ugc.aweme.profile.model.User;
import h.a.n;
import h.f.b.l;
import java.util.List;
import org.json.JSONObject;

public final class a {
    static {
        Covode.recordClassIndex(73307);
    }

    public static final User d(MusNotice musNotice) {
        f fVar;
        List<User> list;
        l.d(musNotice, "");
        c cVar = musNotice.templateNotice.f112844b;
        if (cVar == null || (fVar = cVar.f112805d) == null || (list = fVar.f112824a) == null) {
            return null;
        }
        return (User) n.h((List) list);
    }

    public static final com.ss.android.ugc.aweme.notice.repo.a.a a(MusNotice musNotice) {
        l.d(musNotice, "");
        try {
            JSONObject b2 = b(musNotice);
            if (b2 != null) {
                String optString = b2.optString(StringSet.type);
                l.b(optString, "");
                String optString2 = b2.optString("link_id");
                l.b(optString2, "");
                String optString3 = b2.optString("item_id");
                l.b(optString3, "");
                return new com.ss.android.ugc.aweme.notice.repo.a.a(optString, optString2, optString3);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final JSONObject b(MusNotice musNotice) {
        JSONObject jSONObject;
        String str;
        l.d(musNotice, "");
        try {
            e eVar = musNotice.templateNotice;
            if (eVar == null || (str = eVar.f112851i) == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            return new JSONObject(jSONObject.optString("business_extra"));
        } catch (Exception unused) {
            return null;
        }
    }

    public static final String c(MusNotice musNotice) {
        JSONObject jSONObject;
        String str;
        l.d(musNotice, "");
        try {
            e eVar = musNotice.templateNotice;
            if (eVar == null || (str = eVar.f112851i) == null) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(str);
            }
            return jSONObject.optString("account_type");
        } catch (Exception unused) {
            return null;
        }
    }
}
