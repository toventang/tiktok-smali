package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import android.app.Activity;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.mob.c;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.mix.services.MixFeedService;
import com.ss.android.ugc.aweme.search.n.e;
import h.f.b.l;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class OpenPlaylistMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f82685b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f82686c = "open_playlist";

    static {
        Covode.recordClassIndex(51500);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(51501);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82686c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenPlaylistMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            String optString = jSONObject.optString("mix_id");
            String optString2 = jSONObject.optString("uid");
            String optString3 = jSONObject.optString("secUid");
            boolean optBoolean = jSONObject.optBoolean("needShowDialog");
            String optString4 = jSONObject.optString("enter_groupId");
            JSONObject optJSONObject = jSONObject.optJSONObject("log_extra");
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            String optString5 = optJSONObject.optString("search_id");
            int optInt = optJSONObject.optInt("is_from_video");
            String optString6 = optJSONObject.optString("enter_from");
            optJSONObject.optString("list_item_id");
            optJSONObject.optString("search_result_id");
            String a2 = c.b.a.a(3);
            Activity j2 = f.j();
            if (j2 != null) {
                IMixFeedService k2 = MixFeedService.k();
                l.b(optString, "");
                k2.a(j2, optString4, (Aweme) null, "from_profile_mix_list", optString, optString2, optString3, optBoolean, new com.ss.android.ugc.aweme.mix.e.b(optString5, Integer.valueOf(optInt), a2, 0, 8, null), optString6);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                l.b(next, "");
                String string = optJSONObject.getString(next);
                l.b(string, "");
                linkedHashMap.put(next, string);
            }
            e.a.a(linkedHashMap);
            aVar.a(new JSONArray());
        } catch (Exception e2) {
            aVar.a(0, e2.getMessage());
            e2.printStackTrace();
        }
    }
}
