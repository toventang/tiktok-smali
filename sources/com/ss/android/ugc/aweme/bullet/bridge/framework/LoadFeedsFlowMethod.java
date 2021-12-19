package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.google.gson.f;
import com.google.gson.g;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.fe.method.feeds.b;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import h.a.z;
import h.f.b.l;
import h.h;
import h.i;
import java.lang.reflect.Type;
import java.util.List;
import org.json.JSONObject;

public final class LoadFeedsFlowMethod extends BaseBridgeMethod implements au, com.ss.android.ugc.aweme.fe.method.feeds.api.a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f69086c = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public String f69087b = "";

    /* renamed from: d  reason: collision with root package name */
    private final String f69088d = "loadFeedsFlow";

    /* renamed from: e  reason: collision with root package name */
    private final h f69089e = i.a((h.f.a.a) new b(this));

    /* renamed from: f  reason: collision with root package name */
    private final h f69090f;

    static {
        Covode.recordClassIndex(42603);
    }

    private final com.ss.android.ugc.aweme.fe.method.feeds.b k() {
        return (com.ss.android.ugc.aweme.fe.method.feeds.b) this.f69089e.getValue();
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42604);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69088d;
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.fe.method.feeds.b> {
        final /* synthetic */ LoadFeedsFlowMethod this$0;

        static {
            Covode.recordClassIndex(42605);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LoadFeedsFlowMethod loadFeedsFlowMethod) {
            super(0);
            this.this$0 = loadFeedsFlowMethod;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.fe.method.feeds.b invoke() {
            return b.a.a(new com.ss.android.ugc.aweme.fe.method.feeds.b.a(), this.this$0.f69087b, this.this$0);
        }
    }

    static final class c extends h.f.b.m implements h.f.a.a<f> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f69091a = new c();

        static {
            Covode.recordClassIndex(42606);
        }

        c() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ f invoke() {
            return new g().a((Type) Boolean.TYPE, (Object) new LoadFeedsFlowMethod$parser$2$1()).b();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.e, com.bytedance.ies.bullet.c.e.a
    public final void a() {
        super.a();
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
    public LoadFeedsFlowMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        androidx.lifecycle.i lifecycle;
        l.d(bVar, "");
        Context e2 = e();
        m mVar = (m) (!(e2 instanceof m) ? null : e2);
        if (!(mVar == null || (lifecycle = mVar.getLifecycle()) == null)) {
            lifecycle.a(this);
        }
        this.f69090f = h.i.a((h.f.a.a) c.f69091a);
    }

    @Override // com.ss.android.ugc.aweme.fe.method.feeds.api.a
    public final void b(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        a(str, jSONObject);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        boolean z;
        List<? extends Aweme> list;
        l.d(jSONObject, "");
        l.d(aVar, "");
        int i2 = 1;
        boolean z2 = false;
        if (!jSONObject.has("react_id") || !jSONObject.has("has_more") || !jSONObject.has("aweme_list") || !jSONObject.has("page")) {
            z = false;
        } else {
            z = true;
        }
        Activity activity = null;
        if (z) {
            if (!TextUtils.isEmpty(this.f69087b) && !TextUtils.equals(this.f69087b, jSONObject.optString("react_id"))) {
                k().a();
            }
            String optString = jSONObject.optString("react_id");
            l.b(optString, "");
            this.f69087b = optString;
            com.ss.android.ugc.aweme.fe.method.feeds.b k2 = k();
            Object[] objArr = (Object[]) ((f) this.f69090f.getValue()).a(jSONObject.optString("aweme_list"), Aweme[].class);
            if (objArr == null || (list = h.a.i.j(objArr)) == null) {
                list = z.INSTANCE;
            }
            k2.a(list, jSONObject.optInt("page", 0), jSONObject.optBoolean("has_more", false), jSONObject.optBoolean("insert_before", false));
            z2 = true;
        }
        Context e2 = e();
        if (e2 instanceof Activity) {
            activity = e2;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            activity2.findViewById(16908290).setTag(R.id.wu, k());
        }
        JSONObject jSONObject2 = new JSONObject();
        if (!z2) {
            i2 = -1;
        }
        jSONObject2.put("code", i2);
        aVar.a(jSONObject2);
    }
}
