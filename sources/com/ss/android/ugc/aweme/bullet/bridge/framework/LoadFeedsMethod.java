package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.fe.method.feeds.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import h.i;
import java.util.Objects;
import org.json.JSONObject;

public final class LoadFeedsMethod extends BaseBridgeMethod implements au, com.ss.android.ugc.aweme.fe.method.feeds.api.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f69092c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String f69093b = "";

    /* renamed from: d  reason: collision with root package name */
    private final String f69094d = "loadFeeds";

    /* renamed from: e  reason: collision with root package name */
    private final h f69095e = i.a((h.f.a.a) new b(this));

    static {
        Covode.recordClassIndex(42608);
    }

    private final com.ss.android.ugc.aweme.fe.method.feeds.a k() {
        return (com.ss.android.ugc.aweme.fe.method.feeds.a) this.f69095e.getValue();
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42609);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69094d;
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.fe.method.feeds.a> {
        final /* synthetic */ LoadFeedsMethod this$0;

        static {
            Covode.recordClassIndex(42610);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LoadFeedsMethod loadFeedsMethod) {
            super(0);
            this.this$0 = loadFeedsMethod;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.fe.method.feeds.a invoke() {
            return a.C2202a.a(new com.ss.android.ugc.aweme.fe.method.feeds.b.a(), this.this$0.f69093b, this.this$0);
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e, com.bytedance.ies.bullet.c.e.a
    public final void a() {
        super.a();
        k().f91281a.dispose();
        Context e2 = e();
        if (!(e2 instanceof Activity)) {
            e2 = null;
        }
        Activity activity = (Activity) e2;
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.wu, null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoadFeedsMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        androidx.lifecycle.i lifecycle;
        l.d(bVar, "");
        Context e2 = e();
        m mVar = (m) (!(e2 instanceof m) ? null : e2);
        if (mVar != null && (lifecycle = mVar.getLifecycle()) != null) {
            lifecycle.a(this);
        }
    }

    @Override // com.ss.android.ugc.aweme.fe.method.feeds.api.a
    public final void b(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        a(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        int i2 = 1;
        boolean z = false;
        if (jSONObject.has("base_url") && jSONObject.has("react_id") && jSONObject.has("page") && jSONObject.has("size") && !jSONObject.optBoolean("clear", false)) {
            String optString = jSONObject.optString("react_id");
            l.b(optString, "");
            this.f69093b = optString;
            String optString2 = jSONObject.optString("base_url");
            int optInt = jSONObject.optInt("page");
            int optInt2 = jSONObject.optInt("size");
            k().mData.f91300a.clear();
            com.ss.android.ugc.aweme.fe.method.feeds.a k2 = k();
            l.b(optString2, "");
            Context e2 = e();
            Objects.requireNonNull(e2, "null cannot be cast to non-null type android.app.Activity");
            k2.a(optString2, optInt, optInt2, (Activity) e2);
            z = true;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!z) {
            i2 = -1;
        }
        jSONObject2.put("code", i2);
        aVar.a(jSONObject2);
    }
}
