package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.discover.e.f;
import com.ss.android.ugc.aweme.discover.lynx.spark.a.a;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.live.b;
import com.ss.android.ugc.d.a.c;
import h.f.b.l;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

public final class a extends com.ss.android.ugc.aweme.discover.lynx.spark.a.a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1945a f82730a = new C1945a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private String f82731b = "";

    static {
        Covode.recordClassIndex(51530);
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.spark.a.a
    public final String a() {
        return "searchEnterLiveFlow";
    }

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet.a$a  reason: collision with other inner class name */
    public static final class C1945a {
        static {
            Covode.recordClassIndex(51531);
        }

        private C1945a() {
        }

        public /* synthetic */ C1945a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.discover.lynx.spark.a.a
    public final void a(JSONObject jSONObject, a.AbstractC1903a aVar) {
        EnterRoomConfig enterRoomConfig;
        boolean z;
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject("log_extra");
            if (optJSONObject != null) {
                enterRoomConfig = new EnterRoomConfig();
                enterRoomConfig.f23298b.x = optJSONObject.optString("search_id");
                enterRoomConfig.f23298b.y = optJSONObject.optString("search_keyword");
                enterRoomConfig.f23298b.A = optJSONObject.optString("search_type");
                enterRoomConfig.f23298b.f23309a = optJSONObject.optString("search_id");
                enterRoomConfig.f23298b.f23310b = optJSONObject.optString("anchor_id");
                enterRoomConfig.f23299c.L = optJSONObject.optString("enter_method");
                enterRoomConfig.f23299c.J = optJSONObject.optString("enter_from");
            } else {
                enterRoomConfig = null;
            }
            long optLong = jSONObject.optLong("start_cursor");
            if (jSONObject.optInt("has_more") == 1) {
                z = true;
            } else {
                z = false;
            }
            LiveRoomStruct liveRoomStruct = (LiveRoomStruct) b.a().a(jSONObject.optString("cur_raw_data"), LiveRoomStruct.class);
            JSONArray optJSONArray = jSONObject.optJSONArray("raw_data_list");
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                arrayList.add(b.a().a(optJSONArray.get(i2).toString(), LiveRoomStruct.class));
            }
            c.a(new f(liveRoomStruct, arrayList, optLong, enterRoomConfig, Boolean.valueOf(z)));
        } catch (Exception e2) {
            aVar.a(e2.getMessage());
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.a(jSONObject2);
    }
}
