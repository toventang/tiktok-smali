package com.ss.android.ugc.aweme.video.util;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.abmock.b;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.video.b.af;
import com.ss.android.ugc.aweme.video.b.h;
import com.ss.android.ugc.aweme.video.v;
import com.toutiao.proxyserver.u;
import org.json.JSONObject;

public final class c {
    static {
        Covode.recordClassIndex(94221);
    }

    private static boolean a() {
        return b.a().a(true, "use_video_cache_http_dns", false);
    }

    public static JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        jSONObject.put("playerType", v.O().a().toString());
        jSONObject.put("from", "PlayerCommonParamManager");
        jSONObject.put("is_break_resume_check_enabled", com.ss.android.ugc.aweme.player.c.a());
        jSONObject.put("is_force_request_validation", com.ss.android.ugc.aweme.player.c.b());
        jSONObject.put("is_play_link_select_enabled", h.a());
        jSONObject.put("is_preload_enabled", a.a());
        jSONObject.put("need_pre_load_in_settings", SharePrefCache.inst().getVideoPreload().c());
        jSONObject.put("weak_net_pre_load_switch_in_settings", SharePrefCache.inst().getWeakNetPreLoadSwitch().c());
        boolean z = true;
        if (b.a().a(true, "use_ttnet", 1) != af.f143276a) {
            z = false;
        }
        jSONObject.put("video_cache_use_ttnet", z);
        return jSONObject;
    }

    public static com.ss.android.ugc.aweme.app.f.c a(com.ss.android.ugc.aweme.app.f.c cVar) {
        if (cVar == null) {
            cVar = new com.ss.android.ugc.aweme.app.f.c();
        }
        cVar.a("playerType", v.O().a().toString());
        cVar.a("from", "PlayerCommonParamManager");
        cVar.a("is_break_resume_check_enabled", Boolean.valueOf(com.ss.android.ugc.aweme.player.c.a()));
        cVar.a("is_force_request_validation", Boolean.valueOf(com.ss.android.ugc.aweme.player.c.b()));
        cVar.a("is_play_link_select_enabled", Boolean.valueOf(h.a()));
        cVar.a("is_preload_enabled", Boolean.valueOf(a.a()));
        cVar.a("need_pre_load_in_settings", SharePrefCache.inst().getVideoPreload().c());
        cVar.a("weak_net_pre_load_switch_in_settings", SharePrefCache.inst().getWeakNetPreLoadSwitch().c());
        cVar.a("use_video_cache_http_dns", Boolean.valueOf(a()));
        cVar.a("video_cache_use_ttnet", Boolean.valueOf(u.f154997l));
        return cVar;
    }
}
