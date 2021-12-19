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
import com.ss.android.ugc.aweme.feed.model.Aweme;
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

public final class OpenFeedsFlowMethod extends BaseCommonJavaMethod implements au, i, j {

    /* renamed from: a  reason: collision with root package name */
    public static final a f91118a = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    private String f91119b;

    static {
        Covode.recordClassIndex(57333);
    }

    private OpenFeedsFlowMethod(byte b2) {
        this();
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(14, new g(OpenFeedsFlowMethod.class, "onEvent", o.class, ThreadMode.POSTING, 0, false));
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
            Covode.recordClassIndex(57334);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ OpenFeedsFlowMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.a().b(this);
    }

    public final com.ss.android.ugc.aweme.fe.method.feeds.a c() {
        Activity activity = (Activity) getActContext();
        if (activity != null) {
            return (com.ss.android.ugc.aweme.fe.method.feeds.a) activity.findViewById(16908290).getTag(R.id.wu);
        }
        return null;
    }

    static final class b<V> implements Callable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ u f91120a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OpenFeedsFlowMethod f91121b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ z.a f91122c;

        static {
            Covode.recordClassIndex(57335);
        }

        b(u uVar, OpenFeedsFlowMethod openFeedsFlowMethod, z.a aVar) {
            this.f91120a = uVar;
            this.f91121b = openFeedsFlowMethod;
            this.f91122c = aVar;
        }

        @Override // java.util.concurrent.Callable
        public final /* synthetic */ Object call() {
            ae.f95296a = this.f91121b.c();
            t a2 = t.a();
            Object obj = this.f91121b.mContextRef.get();
            Objects.requireNonNull(obj, "null cannot be cast to non-null type android.app.Activity");
            return Boolean.valueOf(t.a(a2, (Activity) obj, this.f91120a.a()));
        }
    }

    public OpenFeedsFlowMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f91119b = "";
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
        if (TextUtils.equals(oVar.f91318a, this.f91119b)) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("play_state", oVar.f91319b);
            jSONObject2.put("current_time", Float.valueOf(((float) h.a(oVar.f91320c, 0L)) / 1000.0f));
            jSONObject2.put("current_item_id", oVar.f91321d);
            jSONObject2.put("react_id", this.f91119b);
            jSONObject.put("data", jSONObject2);
            jSONObject.put("eventName", "video_state_change");
            sendEvent("notification", jSONObject, 3);
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        String aid;
        z.a aVar2 = new z.a();
        aVar2.element = false;
        int i2 = 1;
        if (jSONObject != null && jSONObject.has("react_id") && jSONObject.has("enter_from") && 1 != 0) {
            String optString = jSONObject.optString("react_id");
            l.b(optString, "");
            this.f91119b = optString;
            com.ss.android.ugc.aweme.fe.method.feeds.a c2 = c();
            if (c2 != null) {
                if (c2.getItems().size() > 0) {
                    if (jSONObject.has("aweme_id")) {
                        aid = jSONObject.optString("aweme_id");
                    } else {
                        aid = ((Aweme) c2.getItems().get(0)).getAid();
                    }
                    String optString2 = jSONObject.optString("enter_from");
                    u a2 = u.a("aweme://aweme/detail/".concat(String.valueOf(aid))).a("react_session_id", this.f91119b).a("page_type", optString2).a("refer", optString2).a("video_from", "from_feeds_operate").a("from_group_id", jSONObject.optString("from_group_id")).a("carrier_type", jSONObject.optString("carrier_type")).a("refer_commodity_id", jSONObject.optString("refer_commodity_id")).a("data_type", jSONObject.optString("data_type")).a("previous_page", jSONObject.optString("previous_page")).a("enter_method", jSONObject.optString("enter_method")).a("is_new_low_quality_user", c2.mData.f91302c ? 1 : 0);
                    if (jSONObject.has("current_time")) {
                        a2.a("video_current_position", (int) (jSONObject.optDouble("current_time") * 1000.0d));
                    }
                    b.i.b(new b(a2, this, aVar2), b.i.f4826c);
                    aVar2.element = true;
                } else if (TextUtils.equals(jSONObject.optString("enter_from"), "feed_low_quality")) {
                    com.ss.android.ugc.aweme.common.r.onEventV3("ads_specialist_show_fail");
                    return;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (!aVar2.element) {
                i2 = -1;
            }
            jSONObject2.put("code", i2);
            aVar.a(jSONObject2);
        }
    }
}
