package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ck.t;
import com.ss.android.ugc.aweme.ck.u;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.feed.x.ae;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.z;
import h.j.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class OpenAwemeDetailMethod extends BaseCommonJavaMethod implements au, i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91103a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private String f91104b;

    static {
        Covode.recordClassIndex(57319);
    }

    private OpenAwemeDetailMethod(byte b2) {
        this();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(14, new g(OpenAwemeDetailMethod.class, "onEvent", o.class, ThreadMode.POSTING, 0, false));
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
            Covode.recordClassIndex(57320);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ OpenAwemeDetailMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.a().b(this);
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f91105a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OpenAwemeDetailMethod f91106b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.a f91107c;

        static {
            Covode.recordClassIndex(57321);
        }

        b(u uVar, OpenAwemeDetailMethod openAwemeDetailMethod, z.a aVar) {
            this.f91105a = uVar;
            this.f91106b = openAwemeDetailMethod;
            this.f91107c = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            com.ss.android.ugc.aweme.fe.method.feeds.b bVar;
            Activity activity = (Activity) this.f91106b.getActContext();
            if (activity != null) {
                bVar = (com.ss.android.ugc.aweme.fe.method.feeds.b) activity.findViewById(16908290).getTag(R.id.wu);
            } else {
                bVar = null;
            }
            ae.f95296a = bVar;
            t a2 = t.a();
            Object obj = this.f91106b.mContextRef.get();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type android.app.Activity");
            return Boolean.valueOf(t.a(a2, (Activity) obj, this.f91105a.a()));
        }
    }

    public OpenAwemeDetailMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f91104b = "";
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
        if (TextUtils.equals(oVar.f91318a, this.f91104b)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", oVar.f91319b);
            jSONObject2.put("current_time", Float.valueOf(((float) h.a(oVar.f91320c, 0L)) / 1000.0f));
            jSONObject2.put("current_item_id", oVar.f91321d);
            jSONObject2.put("react_id", this.f91104b);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            sendEvent("notification", jSONObject, 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        z.a aVar2 = new z.a();
        aVar2.element = false;
        int i2 = 1;
        if (jSONObject != null && jSONObject.has("react_id") && jSONObject.has("aweme_id") && jSONObject.has("enter_from") && 1 != 0) {
            String optString = jSONObject.optString("react_id");
            l.b(optString, "");
            this.f91104b = optString;
            String optString2 = jSONObject.optString("aweme_id");
            String optString3 = jSONObject.optString("enter_from");
            u a2 = u.a("aweme://aweme/detail/".concat(String.valueOf(optString2))).a("react_session_id", this.f91104b).a("page_type", optString3).a("refer", optString3).a("video_from", "from_feeds_operate_optimized").a("entrance_info", jSONObject.optString("entrance_info"));
            if (jSONObject.has("log_extra")) {
                JSONObject jSONObject2 = new JSONObject(jSONObject.optString("log_extra"));
                a2.a("carrier_type", jSONObject2.optString("carrier_type")).a("from_group_id", jSONObject2.optString("from_group_id")).a("refer_commodity_id", jSONObject2.optString("refer_commodity_id")).a("data_type", jSONObject2.optString("data_type")).a("previous_page", jSONObject2.optString("previous_page")).a("enter_from", jSONObject2.optString("enter_from")).a("tab_name", jSONObject2.optString("tab_name")).a("enter_method", jSONObject2.optString("enter_method"));
            }
            if (jSONObject.has("current_time")) {
                a2.a("video_current_position", (int) (jSONObject.optDouble("current_time") * 1000.0d));
            }
            if (jSONObject.has("report_reason")) {
                a2.a("ad_report_reason", jSONObject.optString("report_reason"));
            }
            if (jSONObject.has("report_reason_type")) {
                a2.a("ad_report_reason_type", jSONObject.optString("report_reason_type"));
            }
            b.i.b(new b(a2, this, aVar2), b.i.f4826c);
            aVar2.element = true;
        }
        if (aVar != null) {
            JSONObject jSONObject3 = new JSONObject();
            if (!aVar2.element) {
                i2 = -1;
            }
            jSONObject3.put("code", i2);
            aVar.a(jSONObject3);
        }
    }
}
