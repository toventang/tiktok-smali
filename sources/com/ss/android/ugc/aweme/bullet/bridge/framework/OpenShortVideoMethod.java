package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.k;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.fe.method.o;
import com.ss.android.ugc.aweme.search.n.e;
import h.a.af;
import h.a.n;
import h.f.b.l;
import h.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class OpenShortVideoMethod extends BaseBridgeMethod implements au, i, j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69130b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f69131c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    private final String f69132d = "open_short_video";

    /* renamed from: e  reason: collision with root package name */
    private k.a f69133e = k.a.PRIVATE;

    /* renamed from: f  reason: collision with root package name */
    private String f69134f = "";

    /* renamed from: g  reason: collision with root package name */
    private final h f69135g;

    public interface b {
        static {
            Covode.recordClassIndex(42632);
        }

        boolean a(JSONObject jSONObject);

        boolean a(JSONObject jSONObject, Bundle bundle);
    }

    static {
        Covode.recordClassIndex(42630);
    }

    private final b k() {
        return (b) this.f69135g.getValue();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(14, new g(OpenShortVideoMethod.class, "onEvent", o.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42631);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q, com.bytedance.ies.bullet.c.c.a.e
    public final k.a b() {
        return this.f69133e;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69132d;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e, com.bytedance.ies.bullet.c.e.a
    public final void a() {
        EventBus.a().b(this);
    }

    static final class c extends h.f.b.m implements h.f.a.a<b> {
        final /* synthetic */ com.bytedance.ies.bullet.c.e.a.b $contextProviderFactory;

        static {
            Covode.recordClassIndex(42633);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(com.bytedance.ies.bullet.c.e.a.b bVar) {
            super(0);
            this.$contextProviderFactory = bVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ b invoke() {
            com.bytedance.ies.bullet.c.e.a.c b2 = this.$contextProviderFactory.b(b.class);
            if (b2 != null) {
                return b2.b();
            }
            return null;
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e
    public final void a(k.a aVar) {
        l.d(aVar, "");
        this.f69133e = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenShortVideoMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
        this.f69135g = h.i.a((h.f.a.a) new c(bVar));
        EventBus.a(EventBus.a(), this);
    }

    private static Map<String, String> b(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            l.b(next, "");
            String string = jSONObject.getString(next);
            l.b(string, "");
            linkedHashMap.put(next, string);
        }
        return linkedHashMap;
    }

    @r
    public final void onEvent(o oVar) {
        l.d(oVar, "");
        if (TextUtils.equals(oVar.f91318a, this.f69134f)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", oVar.f91319b);
            jSONObject2.put("current_time", Float.valueOf(((float) h.j.h.a(oVar.f91320c, 0L)) / 1000.0f));
            jSONObject2.put("current_item_id", oVar.f91321d);
            jSONObject2.put("react_id", this.f69134f);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            a("notification", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Context e2;
        b k2;
        JSONObject jSONObject2 = jSONObject;
        l.d(jSONObject2, "");
        l.d(aVar, "");
        if (((jSONObject2.has("current_item_id") && jSONObject2.has("item_ids") && jSONObject2.has("react_id")) || ((k2 = k()) != null && k2.a(jSONObject2))) && 1 != 0) {
            this.f69134f = jSONObject2.optString("react_id");
            String optString = jSONObject2.optString("current_item_id");
            JSONArray optJSONArray = jSONObject2.optJSONArray("item_ids");
            String optString2 = jSONObject2.optString("enter_from");
            Bundle bundle = new Bundle();
            bundle.putString("id", optString);
            bundle.putString("react_session_id", this.f69134f);
            int length = optJSONArray.length();
            if (length > 0) {
                h.j.g a2 = h.j.h.a(0, length);
                ArrayList arrayList = new ArrayList(n.a(a2, 10));
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    arrayList.add(optJSONArray.get(((af) it).a()));
                }
                bundle.putString("ids", n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (h.f.a.b) null, 62));
            }
            if (jSONObject2.has("current_time")) {
                jSONObject2 = jSONObject2;
                bundle.putString("video_current_position", String.valueOf(jSONObject2.optDouble("current_time") * 1000.0d));
            }
            if (optString2 != null) {
                bundle.putString("enter_from", optString2);
            }
            if (jSONObject2.has("tracker_data")) {
                bundle.putString("tracker_data", jSONObject2.optString("tracker_data"));
                try {
                    this.f69131c.putAll(b(new JSONObject(jSONObject2.optString("tracker_data"))));
                } catch (JSONException e3) {
                    String.valueOf(e3.getStackTrace());
                }
            }
            bundle.putString("video_from", "general_search");
            bundle.putString("from_group_id", jSONObject2.optString("from_group_id"));
            bundle.putString("carrier_type", jSONObject2.optString("carrier_type"));
            bundle.putString("refer_commodity_id", jSONObject2.optString("refer_commodity_id"));
            bundle.putString("data_type", jSONObject2.optString("data_type"));
            bundle.putString("previous_page", jSONObject2.optString("previous_page"));
            bundle.putString("enter_method", jSONObject2.optString("enter_method"));
            bundle.putString("enter_method", jSONObject2.optString("enter_method"));
            bundle.putString("auto_route_schema", jSONObject2.optString("auto_route_schema"));
            JSONObject optJSONObject = jSONObject2.optJSONObject("log");
            if (optJSONObject != null) {
                bundle.putString("search_result_id", optJSONObject.optString("search_result_id"));
                bundle.putString("impr_id", optJSONObject.optString("impr_id"));
                bundle.putString("playlist_search_id", optJSONObject.optString("search_id"));
                bundle.putInt("is_from_video", optJSONObject.optInt("is_from_video"));
                bundle.putString("key_search_type", optJSONObject.optString("search_type"));
                bundle.putInt("item_size", length);
                if (optJSONObject.has("token_type")) {
                    HashMap hashMap = new HashMap();
                    String optString3 = optJSONObject.optString("token_type");
                    l.b(optString3, "");
                    hashMap.put("token_type", optString3);
                    bundle.putSerializable("feed_param_extra", hashMap);
                }
                this.f69131c.putAll(b(optJSONObject));
            }
            b k3 = k();
            if ((k3 == null || !k3.a(jSONObject2, bundle)) && (e2 = e()) != null) {
                SmartRouter.buildRoute(e2, "aweme://aweme/detaillist/".concat(String.valueOf(optString))).withParam(bundle).open();
            }
            e.a.a(this.f69131c);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("code", 1);
        aVar.a(jSONObject3);
    }
}
