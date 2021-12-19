package com.ss.android.ugc.aweme.bullet;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.c.a.p;
import com.bytedance.ies.bullet.c.c.z;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.commerce.service.ICommerceService;
import h.f.b.l;
import java.util.HashMap;
import java.util.Map;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;
import org.greenrobot.eventbus.g;
import org.greenrobot.eventbus.i;
import org.greenrobot.eventbus.j;
import org.greenrobot.eventbus.r;
import org.json.JSONObject;

public final class BulletEventObserver implements au, i, j {

    /* renamed from: a  reason: collision with root package name */
    public final b f68824a;

    /* renamed from: b  reason: collision with root package name */
    public final Activity f68825b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f68826c;

    /* renamed from: d  reason: collision with root package name */
    private long f68827d;

    static {
        Covode.recordClassIndex(42396);
    }

    @Override // org.greenrobot.eventbus.i
    public final Map<Integer, Object> getSubscriberEventTypes() {
        HashMap hashMap = new HashMap();
        hashMap.put(184, new g(BulletEventObserver.class, "onEvent", com.ss.android.sdk.webview.b.class, ThreadMode.POSTING, 0, false));
        hashMap.put(83, new g(BulletEventObserver.class, "onJsBroadcastEvent", com.ss.android.ugc.aweme.bullet.c.a.class, ThreadMode.MAIN, 0, false));
        return hashMap;
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_CREATE) {
            onCreate();
        } else if (aVar == i.a.ON_RESUME) {
            onResume();
        } else if (aVar == i.a.ON_PAUSE) {
            onPause();
        } else if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a implements p {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f68828a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f68829b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ JSONObject f68830c;

        /* renamed from: d  reason: collision with root package name */
        private final String f68831d;

        static {
            Covode.recordClassIndex(42397);
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final String a() {
            return this.f68831d;
        }

        @Override // com.bytedance.ies.bullet.c.c.a.p
        public final /* bridge */ /* synthetic */ Object b() {
            return this.f68828a;
        }

        a(String str, JSONObject jSONObject) {
            this.f68829b = str;
            this.f68830c = jSONObject;
            this.f68831d = str;
            this.f68828a = jSONObject;
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        EventBus.a().b(this);
    }

    private final com.bytedance.ies.bullet.c.c.i a() {
        b bVar = this.f68824a;
        if (bVar != null) {
            return (com.bytedance.ies.bullet.c.c.i) bVar.c(com.bytedance.ies.bullet.c.c.i.class);
        }
        return null;
    }

    @v(a = i.a.ON_CREATE)
    public final void onCreate() {
        EventBus.a(EventBus.a(), this);
        this.f68827d = System.currentTimeMillis();
    }

    @v(a = i.a.ON_PAUSE)
    public final void onPause() {
        com.bytedance.ies.bullet.service.f.a.b.b bVar;
        this.f68826c = false;
        com.bytedance.ies.bullet.c.c.i a2 = a();
        if (a2 != null) {
            bVar = a2.b();
        } else {
            bVar = null;
        }
        if (bVar == com.bytedance.ies.bullet.service.f.a.b.b.WEB) {
            a("viewDisappeared", null);
            a("invisible", null);
        }
    }

    @v(a = i.a.ON_RESUME)
    public final void onResume() {
        com.bytedance.ies.bullet.service.f.a.b.b bVar;
        this.f68826c = true;
        com.bytedance.ies.bullet.c.c.i a2 = a();
        if (a2 != null) {
            bVar = a2.b();
        } else {
            bVar = null;
        }
        if (bVar == com.bytedance.ies.bullet.service.f.a.b.b.WEB) {
            a("viewAppeared", null);
        }
    }

    @r
    public final void onEvent(com.ss.android.sdk.webview.b bVar) {
        String str;
        String str2;
        Activity activity;
        z a2;
        if (bVar != null && (str = bVar.f60179a) != null && str.length() != 0) {
            String str3 = bVar.f60179a;
            com.bytedance.ies.bullet.c.c.i a3 = a();
            if (a3 == null || (a2 = a3.a()) == null || (str2 = a2.f32074a) == null) {
                str2 = "";
            }
            if (h.m.p.a(str3, str2, true) && 1 != 0 && (activity = this.f68825b) != null && (!activity.isFinishing())) {
                activity.finish();
            }
        }
    }

    @r(a = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(com.ss.android.ugc.aweme.bullet.c.a aVar) {
        String str;
        JSONObject jSONObject;
        l.d(aVar, "");
        JSONObject jSONObject2 = aVar.f69275b;
        if (jSONObject2 != null) {
            jSONObject2.optString("eventName");
        }
        if (this.f68826c) {
            JSONObject jSONObject3 = aVar.f69275b;
            if (jSONObject3 != null) {
                str = jSONObject3.optString("eventName");
            } else {
                str = null;
            }
            if (TextUtils.equals("goods_rn_page_monitor", str)) {
                try {
                    JSONObject jSONObject4 = aVar.f69275b;
                    if (!(jSONObject4 == null || (jSONObject = jSONObject4.getJSONObject("data")) == null)) {
                        ICommerceService a2 = com.ss.android.ugc.aweme.commerce.service.a.a();
                        com.ss.android.ugc.aweme.commerce.service.a.a aVar2 = new com.ss.android.ugc.aweme.commerce.service.a.a();
                        aVar2.n = Long.valueOf(Long.valueOf(jSONObject.optString("interact_render_ts")).longValue() - this.f68827d);
                        aVar2.p = jSONObject.optString("page_id");
                        aVar2.f73508m = Long.valueOf(Long.valueOf(jSONObject.optString("ender_render_ts")).longValue() - this.f68827d);
                        aVar2.o = jSONObject.optString("session_id");
                        a2.logCommerceEvents("commerce_page_render_time", aVar2);
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
        a("notification", aVar.f69275b);
    }

    public BulletEventObserver(b bVar, Activity activity) {
        this.f68824a = bVar;
        this.f68825b = activity;
    }

    private final void a(String str, JSONObject jSONObject) {
        com.bytedance.ies.bullet.c.c.i a2 = a();
        if (a2 != null) {
            a2.onEvent(new a(str, jSONObject));
        }
    }
}
