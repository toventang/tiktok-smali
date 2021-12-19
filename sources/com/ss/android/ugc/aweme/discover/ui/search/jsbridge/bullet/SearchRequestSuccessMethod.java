package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.google.gson.f;
import com.google.gson.g;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.helper.s;
import com.ss.android.ugc.aweme.discover.model.GlobalDoodleConfig;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import org.json.JSONArray;
import org.json.JSONObject;

public final class SearchRequestSuccessMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82721b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f82722c = "searchRequestSuccess";

    static {
        Covode.recordClassIndex(51522);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51523);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82722c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchRequestSuccessMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Long l2;
        String str;
        String str2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            g gVar = new g();
            gVar.f54714d = true;
            gVar.f54716f = true;
            f b2 = gVar.b();
            GlobalDoodleConfig globalDoodleConfig = (GlobalDoodleConfig) b2.a(jSONObject.getString("global_doodle_config"), GlobalDoodleConfig.class);
            JSONObject optJSONObject = jSONObject.optJSONObject("extra");
            String str3 = null;
            if (optJSONObject != null) {
                l2 = Long.valueOf(optJSONObject.optLong("now"));
                optJSONObject.optString("logid");
                optJSONObject.optJSONArray("fatal_item_ids");
                optJSONObject.optString("search_request_id");
            } else {
                l2 = null;
            }
            LogPbBean logPbBean = (LogPbBean) b2.a(jSONObject.getString("log_pb"), LogPbBean.class);
            c.a(new com.ss.android.ugc.aweme.discover.e.m(globalDoodleConfig, logPbBean));
            if (!jSONObject.optBoolean("is_load_more")) {
                s a2 = s.a.a();
                if (globalDoodleConfig != null) {
                    str = globalDoodleConfig.getRequestKeyword();
                } else {
                    str = null;
                }
                l.b(logPbBean, "");
                String imprId = logPbBean.getImprId();
                if (globalDoodleConfig != null) {
                    str2 = globalDoodleConfig.getSearchChannel();
                    str3 = globalDoodleConfig.getNewSource();
                } else {
                    str2 = null;
                }
                a2.a(new com.ss.android.ugc.aweme.discover.helper.m(str, imprId, str2, str3, l2));
            }
            aVar.a(new JSONArray());
        } catch (Exception e2) {
            aVar.a(0, e2.getMessage());
        }
    }
}
