package com.ss.android.ugc.aweme.multi.maker;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.tux.g.b;
import com.ss.android.ugc.aweme.ab;
import com.ss.android.ugc.aweme.base.ui.anchor.f;
import com.ss.android.ugc.aweme.base.utils.f;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.android.ugc.aweme.multi.c;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.zhiliaoapp.musically.R;
import h.a.ag;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends o implements i, j {

    /* renamed from: d  reason: collision with root package name */
    private com.ss.android.ugc.aweme.app.f.d f110947d;

    static {
        Covode.recordClassIndex(71181);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(161, new g(d.class, "onWebViewFinish", com.ss.android.ugc.aweme.crossplatform.b.d.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final String l() {
        return "app_page";
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final boolean m() {
        return true;
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final c i() {
        return new d();
    }

    @Override // com.ss.android.ugc.aweme.multi.maker.o
    public final int k() {
        return ab.LIVE_EVENT.getTYPE();
    }

    private static boolean n() {
        try {
            return f.a.f68431a.c();
        } catch (Exception unused) {
            return false;
        }
    }

    private JSONObject u() {
        String str;
        JSONObject jSONObject = new JSONObject();
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null) {
            jSONObject.put("live_event_id", f.a.a(anchorCommonStruct.getSchema()));
            if (!TextUtils.isEmpty(anchorCommonStruct.getExtra())) {
                try {
                    if (new JSONObject(anchorCommonStruct.getExtra()).optBoolean("is_paid_event", false)) {
                        str = "0";
                    } else {
                        str = "1";
                    }
                    jSONObject.put("is_free_event", str);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
        return jSONObject;
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void b(com.ss.android.ugc.aweme.app.f.d dVar) {
        l.d(dVar, "");
        a(dVar, u());
        super.b(dVar);
    }

    @Override // com.ss.android.ugc.aweme.multi.c, com.ss.android.ugc.aweme.multi.maker.o
    public final void c(com.ss.android.ugc.aweme.app.f.d dVar) {
        l.d(dVar, "");
        a(dVar, u());
        super.c(dVar);
    }

    @r
    public final void onWebViewFinish(com.ss.android.ugc.aweme.crossplatform.b.d dVar) {
        Map<String, String> map;
        String str;
        String str2 = "";
        l.d(dVar, str2);
        String str3 = null;
        if (j()) {
            com.ss.android.ugc.aweme.app.f.d a2 = t().a("duration", dVar.f78593a);
            AnchorCommonStruct anchorCommonStruct = this.f110994h;
            if (anchorCommonStruct != null) {
                str = anchorCommonStruct.getSchema();
            } else {
                str = null;
            }
            String a3 = f.a.a(str);
            if (a3 == null) {
                a3 = str2;
            }
            com.ss.android.ugc.aweme.common.r.a("multi_anchor_stay_time", a2.a("live_event_id", a3).f66730a);
        }
        com.ss.android.ugc.aweme.app.f.d t = t();
        com.ss.android.ugc.aweme.app.f.d dVar2 = this.f110947d;
        if (dVar2 == null || (map = dVar2.f66730a) == null) {
            map = ag.a();
        }
        com.ss.android.ugc.aweme.app.f.d a4 = t.a(new HashMap<>(map)).a("duration", dVar.f78593a);
        AnchorCommonStruct anchorCommonStruct2 = this.f110994h;
        if (anchorCommonStruct2 != null) {
            str3 = anchorCommonStruct2.getSchema();
        }
        String a5 = f.a.a(str3);
        if (a5 != null) {
            str2 = a5;
        }
        com.ss.android.ugc.aweme.common.r.a("multi_anchor_stay_time", a4.a("live_event_id", str2).f66730a);
        EventBus.a().b(this);
    }

    @Override // com.ss.android.ugc.aweme.multi.c
    public final void d(com.ss.android.ugc.aweme.app.f.d dVar) {
        String schema;
        String str = "";
        l.d(dVar, str);
        this.f110947d = dVar;
        Activity r = r();
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e || !com.ss.android.ugc.aweme.lancet.j.b() || com.ss.android.ugc.aweme.lancet.j.c()) {
            com.ss.android.ugc.aweme.lancet.j.f107226e = n();
        }
        if (!com.ss.android.ugc.aweme.lancet.j.f107226e) {
            new b(r).e(R.string.de7).b();
            return;
        }
        a(dVar, u());
        o.a(this, dVar, false, false, 6);
        AnchorCommonStruct anchorCommonStruct = this.f110994h;
        if (anchorCommonStruct != null && (schema = anchorCommonStruct.getSchema()) != null) {
            EventBus.a(EventBus.a(), this);
            String a2 = f.a.a(schema);
            Bundle bundle = new Bundle();
            bundle.putFloat("bundle_dialog_screen_size", 0.95f);
            StringBuilder sb = new StringBuilder("&live_event_enter_from=anchor&group_id=");
            String aid = o().getAid();
            if (aid == null) {
                aid = str;
            }
            bundle.putString("bundle_url_extra_param", sb.append(aid).toString());
            IUserService createIUserServicebyMonsterPlugin = BaseUserService.createIUserServicebyMonsterPlugin(false);
            l.b(createIUserServicebyMonsterPlugin, str);
            String currentUserID = createIUserServicebyMonsterPlugin.getCurrentUserID();
            ILiveOuterService s = LiveOuterService.s();
            l.b(s, str);
            com.ss.android.ugc.aweme.live.c d2 = s.d();
            if (a2 != null) {
                str = a2;
            }
            d2.a(r, str, currentUserID.toString(), bundle, new f.a.DialogInterface$OnDismissListenerC1545a(System.currentTimeMillis()));
        }
    }
}
