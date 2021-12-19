package com.ss.android.ugc.aweme.fe.method;

import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import h.a.af;
import h.a.n;
import h.f.a.b;
import h.f.b.l;
import h.j.h;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONArray;
import org.json.JSONObject;

public final class OpenShortVideoMethod extends BaseCommonJavaMethod implements au, i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91131a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private String f91132b;

    static {
        Covode.recordClassIndex(57344);
    }

    private OpenShortVideoMethod(byte b2) {
        this();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(14, new g(OpenShortVideoMethod.class, "onEvent", o.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k, com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(57345);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ OpenShortVideoMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.a().b(this);
    }

    public OpenShortVideoMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f91132b = "";
        EventBus.a(EventBus.a(), this);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final BaseCommonJavaMethod attach(WeakReference<Context> weakReference) {
        l.d(weakReference, "");
        Context context = weakReference.get();
        if (context instanceof m) {
            ((m) context).getLifecycle().a(this);
        }
        BaseCommonJavaMethod attach = super.attach(weakReference);
        l.b(attach, "");
        return attach;
    }

    @r
    public final void onEvent(o oVar) {
        l.d(oVar, "");
        if (TextUtils.equals(oVar.f91318a, this.f91132b)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", oVar.f91319b);
            jSONObject2.put("current_time", Float.valueOf(((float) h.a(oVar.f91320c, 0L)) / 1000.0f));
            jSONObject2.put("current_item_id", oVar.f91321d);
            jSONObject2.put("react_id", this.f91132b);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            sendEvent("notification", jSONObject, 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        if (jSONObject != null && jSONObject.has("current_item_id") && jSONObject.has("item_ids") && jSONObject.has("react_id") && 1 != 0) {
            this.f91132b = jSONObject.optString("react_id");
            String optString = jSONObject.optString("current_item_id");
            JSONArray optJSONArray = jSONObject.optJSONArray("item_ids");
            String optString2 = jSONObject.optString("enter_from");
            com.ss.android.common.util.g gVar = new com.ss.android.common.util.g("aweme://aweme/detaillist/".concat(String.valueOf(optString)));
            gVar.a("react_session_id", this.f91132b);
            int length = optJSONArray.length();
            if (length > 0) {
                h.j.g a2 = h.a(0, length);
                ArrayList arrayList = new ArrayList(n.a(a2, 10));
                Iterator it = a2.iterator();
                while (it.hasNext()) {
                    arrayList.add(optJSONArray.get(((af) it).a()));
                }
                gVar.a("ids", n.a(arrayList, ",", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (b) null, 62));
            }
            if (jSONObject.has("current_time")) {
                gVar.a("video_current_position", (int) (jSONObject.optDouble("current_time") * 1000.0d));
            }
            if (optString2 != null) {
                gVar.a("enter_from", optString2);
            }
            if (jSONObject.has("tracker_data")) {
                gVar.a("tracker_data", jSONObject.optString("tracker_data"));
            }
            gVar.a("video_from", "commerce_general");
            gVar.a("from_group_id", jSONObject.optString("from_group_id"));
            gVar.a("carrier_type", jSONObject.optString("carrier_type"));
            gVar.a("refer_commodity_id", jSONObject.optString("refer_commodity_id"));
            gVar.a("data_type", jSONObject.optString("data_type"));
            gVar.a("previous_page", jSONObject.optString("previous_page"));
            gVar.a("enter_method", jSONObject.optString("enter_method"));
            gVar.a("auto_route_schema", jSONObject.optString("auto_route_schema"));
            t.a(t.a(), gVar.toString());
        }
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            aVar.a(jSONObject2);
        }
    }
}
