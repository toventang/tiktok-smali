package com.ss.android.ugc.aweme.compliance.privacy.utils;

import android.util.Log;
import com.bytedance.covode.number.Covode;
import com.ss.android.agilelogger.ALog;
import com.ss.android.ugc.aweme.app.f.c;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.api.model.n;
import com.ss.android.ugc.aweme.compliance.api.model.o;
import com.ss.android.ugc.aweme.compliance.api.model.q;
import com.ss.android.ugc.aweme.compliance.privacy.data.b;
import com.ss.android.ugc.aweme.compliance.privacy.data.f;
import com.ss.android.ugc.aweme.utils.dg;
import h.a.ag;
import h.f.b.l;
import java.util.Map;

public final class a {
    static {
        Covode.recordClassIndex(48290);
    }

    public static final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        ALog.d(str, str2);
    }

    public static final Map<String, o> a() {
        Map<String, o> account;
        n b2 = f.b();
        Map<String, o> map = null;
        if (!(b2 == null || (account = b2.getAccount()) == null)) {
            map = ag.d(account);
        }
        o a2 = b.a(0, "group_chat");
        if (!(a2 == null || map == null)) {
            map.put("group_chat", a2);
        }
        return map;
    }

    public static final String a(BaseResponse baseResponse) {
        String str;
        l.d(baseResponse, "");
        BaseResponse.ServerTimeExtra serverTimeExtra = baseResponse.extra;
        if (serverTimeExtra == null || (str = serverTimeExtra.logid) == null) {
            return "";
        }
        return str;
    }

    public static final String b(Throwable th) {
        int i2;
        l.d(th, "");
        String stackTraceString = Log.getStackTraceString(th);
        l.b(stackTraceString, "");
        StringBuilder sb = new StringBuilder("error_code = ");
        if (th instanceof com.ss.android.ugc.aweme.base.api.a.a) {
            i2 = ((com.ss.android.ugc.aweme.base.api.a.a) th).getErrorCode();
        } else {
            i2 = -1;
        }
        return sb.append(String.valueOf(i2)).append("\n").append(th.getMessage()).append("\n").append(stackTraceString).toString();
    }

    public static final String a(q qVar) {
        l.d(qVar, "");
        String b2 = dg.a().b(qVar);
        l.b(b2, "");
        return b2;
    }

    public static final String a(com.ss.android.ugc.aweme.setting.serverpush.a.f fVar) {
        l.d(fVar, "");
        return "{'comment':" + fVar.r + ", 'duet':" + fVar.s + ", 'stitch':" + fVar.u + ',' + "'download_setting':" + fVar.v + ", 'chat_set':" + fVar.C + ", 'group_chat':" + fVar.F + ", 'favorite_permission':" + fVar.J + ", 'comment_filter_status':" + fVar.O + ", 'comment_offensive_filter':" + fVar.P + ", 'author_review_all_comments':" + fVar.Q + ", 'is_show_comment_settings':" + fVar.R + ", 'sug_to_contacts':" + fVar.ah + ", 'sug_to_fb_friends':" + fVar.ai + ", 'sug_to_mutual_connections':" + fVar.aj + ", 'sug_to_who_share_link':" + fVar.ak + ", 'sug_to_interested_users':" + fVar.al + ", 'following_visibility':" + fVar.am + "}";
    }

    public static final String a(Throwable th) {
        BaseResponse.ServerTimeExtra serverTimeExtra;
        String str;
        l.d(th, "");
        if (!(th instanceof com.ss.android.ugc.aweme.base.api.a.b.a)) {
            return "";
        }
        Object rawResponse = ((com.ss.android.ugc.aweme.base.api.a.b.a) th).getRawResponse();
        if (!(rawResponse instanceof BaseResponse)) {
            rawResponse = null;
        }
        BaseResponse baseResponse = (BaseResponse) rawResponse;
        if (baseResponse == null || (serverTimeExtra = baseResponse.extra) == null || (str = serverTimeExtra.logid) == null) {
            return "";
        }
        return str;
    }

    public static final c a(c cVar, Object obj) {
        l.d(cVar, "");
        return a(cVar, "restriction", obj);
    }

    public static final c a(c cVar, String str) {
        l.d(cVar, "");
        l.d(str, "");
        c a2 = cVar.a("msg", str);
        l.b(a2, "");
        return a2;
    }

    public static final c b(c cVar, String str) {
        l.d(cVar, "");
        l.d(str, "");
        c a2 = cVar.a("logId", str);
        l.b(a2, "");
        return a2;
    }

    public static void a(String str, h.f.a.b<? super c, ? extends c> bVar) {
        l.d(str, "");
        l.d(bVar, "");
        c cVar = new c();
        l.b(cVar, "");
        String jSONObject = ((c) bVar.invoke(cVar)).a().toString();
        l.b(jSONObject, "");
        a(str, jSONObject);
    }

    public static final c a(c cVar, String str, Object obj) {
        l.d(cVar, "");
        l.d(str, "");
        if (obj == null) {
            return cVar;
        }
        if (obj instanceof Integer) {
            c a2 = cVar.a(str, (Integer) obj);
            l.b(a2, "");
            return a2;
        } else if (obj instanceof Float) {
            c a3 = cVar.a(str, (Float) obj);
            l.b(a3, "");
            return a3;
        } else if (obj instanceof Double) {
            c a4 = cVar.a(str, (Double) obj);
            l.b(a4, "");
            return a4;
        } else if (obj instanceof Boolean) {
            c a5 = cVar.a(str, (Boolean) obj);
            l.b(a5, "");
            return a5;
        } else if (obj instanceof String) {
            c a6 = cVar.a(str, (String) obj);
            l.b(a6, "");
            return a6;
        } else if (obj instanceof Long) {
            c a7 = cVar.a(str, (Long) obj);
            l.b(a7, "");
            return a7;
        } else {
            c a8 = cVar.a(str, obj.toString());
            l.b(a8, "");
            return a8;
        }
    }
}
