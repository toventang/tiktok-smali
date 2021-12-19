package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.fe.method.o;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.j.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class OpenAwemeDetailMethod extends BaseBridgeMethod implements au, i, j {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69098b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69099c = "openAwemeDetail";

    /* renamed from: d  reason: collision with root package name */
    private String f69100d = "";

    static {
        Covode.recordClassIndex(42613);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(14, new g(OpenAwemeDetailMethod.class, "onEvent", o.class, ThreadMode.POSTING, 0, false));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42614);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69099c;
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e, com.bytedance.ies.bullet.c.e.a
    public final void a() {
        super.a();
        EventBus.a().b(this);
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f69101a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OpenAwemeDetailMethod f69102b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.a f69103c;

        static {
            Covode.recordClassIndex(42615);
        }

        b(u uVar, OpenAwemeDetailMethod openAwemeDetailMethod, z.a aVar) {
            this.f69101a = uVar;
            this.f69102b = openAwemeDetailMethod;
            this.f69103c = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.fe.method.feeds.b bVar;
            Context e2 = this.f69102b.e();
            if (!(e2 instanceof Activity)) {
                e2 = null;
            }
            Activity activity = (Activity) e2;
            if (activity != null) {
                bVar = (com.ss.android.ugc.aweme.fe.method.feeds.b) activity.findViewById(16908290).getTag(R.id.wu);
            } else {
                bVar = null;
            }
            ae.f95296a = bVar;
            Context e3 = this.f69102b.e();
            if (!(e3 instanceof Activity)) {
                e3 = null;
            }
            Activity activity2 = (Activity) e3;
            if (activity2 != null) {
                return Boolean.valueOf(t.a(t.a(), activity2, this.f69101a.f71178a.a()));
            }
            return null;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenAwemeDetailMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        androidx.lifecycle.i lifecycle;
        l.d(bVar, "");
        Context e2 = e();
        m mVar = (m) (!(e2 instanceof m) ? null : e2);
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.a(this);
        }
        EventBus.a(EventBus.a(), this);
    }

    @r
    public final void onEvent(o oVar) {
        l.d(oVar, "");
        if (TextUtils.equals(oVar.f91318a, this.f69100d)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", oVar.f91319b);
            jSONObject2.put("current_time", Float.valueOf(((float) h.a(oVar.f91320c, 0L)) / 1000.0f));
            jSONObject2.put("current_item_id", oVar.f91321d);
            jSONObject2.put("react_id", this.f69100d);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            a("notification", jSONObject);
        }
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        z.a aVar2 = new z.a();
        aVar2.element = false;
        int i2 = 1;
        if (jSONObject.has("react_id") && jSONObject.has("aweme_id") && jSONObject.has("enter_from") && 1 != 0) {
            String optString = jSONObject.optString("react_id");
            l.b(optString, "");
            this.f69100d = optString;
            String optString2 = jSONObject.optString("aweme_id");
            String optString3 = jSONObject.optString("enter_from");
            u a2 = u.a("aweme://aweme/detail/".concat(String.valueOf(optString2))).a("react_session_id", this.f69100d).a("page_type", optString3).a("refer", optString3).a("video_from", "from_feeds_operate_optimized").a("entrance_info", jSONObject.optString("entrance_info"));
            if (jSONObject.has("log_extra")) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("log_extra"));
                a2.a("carrier_type", jSONObject2.optString("carrier_type")).a("from_group_id", jSONObject2.optString("from_group_id")).a("refer_commodity_id", jSONObject2.optString("refer_commodity_id")).a("data_type", jSONObject2.optString("data_type")).a("previous_page", jSONObject2.optString("previous_page")).a("enter_from", jSONObject2.optString("enter_from")).a("tab_name", jSONObject2.optString("tab_name"));
            }
            if (jSONObject.has("current_time")) {
                a2.a("video_current_position", (int) (jSONObject.optDouble("current_time") * 1000.0d));
            }
            b.i.b(new b(a2, this, aVar2), b.i.f4826c);
            aVar2.element = true;
        }
        JSONObject jSONObject3 = new JSONObject();
        if (!aVar2.element) {
            i2 = -1;
        }
        jSONObject3.put("code", i2);
        aVar.a(jSONObject3);
    }
}
