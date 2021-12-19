package com.ss.android.ugc.aweme.feed.x;

import android.content.Context;
import android.text.TextUtils;
import b.i;
import com.bytedance.covode.number.Covode;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.s;
import com.ss.android.ugc.aweme.experiment.q;
import com.ss.android.ugc.aweme.feed.ac;
import com.ss.android.ugc.aweme.feed.background.c;
import com.ss.android.ugc.aweme.feed.i.ag;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.param.b;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.metrics.al;
import org.json.JSONException;
import org.json.JSONObject;

public final class n {
    static {
        Covode.recordClassIndex(60381);
    }

    public static void a(ag agVar, b bVar, String str) {
        i.b(new o(agVar, str, bVar), r.a());
    }

    static final /* synthetic */ Object a(ag agVar, String str, b bVar) {
        String str2;
        int i2 = agVar.f93450a;
        String str3 = "";
        if (i2 == 19) {
            str3 = "head";
            str2 = "click_head";
        } else if (i2 == 18) {
            str3 = StringSet.name;
            str2 = "click_name";
        } else {
            str2 = str3;
        }
        s sVar = new s();
        try {
            sVar.a("group_id", ((Aweme) agVar.f93451b).getAid());
            sVar.a("request_id", str);
            if (m.d((Aweme) agVar.f93451b)) {
                sVar.a("is_photo", "1");
            }
            sVar.a("to_user_id", ((Aweme) agVar.f93451b).getAuthorUid());
            sVar.a("author_id", ((Aweme) agVar.f93451b).getAuthorUid());
            r.onEvent(MobClick.obtain().setEventName(str3).setLabelName(bVar.getEventType()).setValue(((Aweme) agVar.f93451b).getAuthor().getUid()).setJsonObject(sVar.a()));
            sVar.a("enter_from", bVar.getEventType());
            sVar.a("enter_method", str2);
            r.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(((Aweme) agVar.f93451b).getAuthor().getUid()).setJsonObject(sVar.a()));
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void a(Context context, Aweme aweme, JSONObject jSONObject, b bVar, String str) {
        String str2;
        int pageType = bVar.getPageType();
        if (pageType == 0) {
            str2 = "homepage_hot";
        } else if (pageType == 1) {
            str2 = "homepage_follow";
        } else if (pageType == 7) {
            str2 = "homepage_fresh";
        } else {
            return;
        }
        i.b(new p(jSONObject, aweme, str, context, str2, aweme.getAid(), bVar), r.a());
    }

    static final /* synthetic */ Object a(JSONObject jSONObject, Aweme aweme, String str, String str2, String str3, b bVar) {
        try {
            jSONObject.put("display", "full");
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("to_user_id", aweme.getAuthorUid());
            jSONObject.put("author_id", aweme.getAuthorUid());
            if (ac.b(str)) {
                jSONObject.put("enter_fullscreen", "1");
                jSONObject.put("content_type", ac.g(aweme));
            }
            if (!TextUtils.isEmpty(aweme.getRepostFromGroupId())) {
                jSONObject.put("is_reposted", "1");
                jSONObject.put("repost_from_group_id", aweme.getRepostFromGroupId());
                jSONObject.put("repost_from_user_id", aweme.getRepostFromUserId());
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        r.a("show", str2, str3, 0, jSONObject);
        if (ac.b(str)) {
            jSONObject.put("enter_from", str2);
            r.b("show", jSONObject);
        }
        d a2 = new d().a("enter_from", str2).a("group_id", str3).a("author_id", aweme.getAuthorUid()).a("log_pb", ac.a.f91473a.a(com.ss.android.ugc.aweme.metrics.ac.a(str3, 0))).a("_staging_flag", 0).a("feed_count", aweme.getFeedCount()).a("order", com.ss.android.ugc.aweme.metrics.ac.b(aweme, bVar.getPageType()));
        if (!c.a()) {
            r.a("video_show", a2.f66730a);
        }
        String aT = com.ss.android.ugc.aweme.commercialize.e.a.b.aT(aweme);
        if (!TextUtils.isEmpty(aT)) {
            if (aweme.isAd()) {
                a2.a("ad_id", aweme.getAwemeRawAd().getAdId());
            }
            try {
                a2.a("study_id", Integer.parseInt(aT));
            } catch (NumberFormatException e3) {
                e3.printStackTrace();
            }
            r.a("ads_bls_ugc_show", a2.f66730a);
        }
        if (q.a()) {
            return null;
        }
        new al().a(str).c(aweme, bVar.getPageType()).f();
        return null;
    }

    static final /* synthetic */ Object a(boolean z, String str, String str2, String str3, String str4, b bVar) {
        String str5;
        String str6;
        MobClick obtain = MobClick.obtain();
        if (z) {
            str5 = "slide_down";
        } else {
            str5 = "slide_up";
        }
        r.onEvent(obtain.setEventName(str5).setLabelName("homepage_hot").setJsonObject(new com.ss.android.ugc.aweme.app.f.c().a("request_id", str).a("author_id", str2).a("from_group_id", str3).a("to_group_id", str4).a()));
        d a2 = new d().a("request_id", str).a("author_id", str2).a("from_group_id", str3).a("to_group_id", str4).a("log_pb", ac.a.f91473a.a(str4));
        if (z) {
            str6 = "homepage_hot_slide_down";
        } else {
            str6 = "homepage_hot_slide_up";
        }
        if (c.a()) {
            return null;
        }
        if (TextUtils.equals("homepage_hot", bVar.getEventType())) {
            a2.a("log_pb", ac.a.f91473a.a(str));
            a2.a("enter_play_method", "manul_play");
            r.a(str6, com.ss.android.ugc.aweme.metrics.ac.a(a2.f66730a));
            return null;
        }
        r.a(str6, a2.f66730a);
        return null;
    }
}
