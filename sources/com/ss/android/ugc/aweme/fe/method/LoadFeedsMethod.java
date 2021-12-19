package com.ss.android.ugc.aweme.fe.method;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.fe.method.feeds.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.h;
import java.lang.ref.WeakReference;
import java.util.Objects;
import org.json.JSONObject;

public final class LoadFeedsMethod extends BaseCommonJavaMethod implements au, com.ss.android.ugc.aweme.fe.method.feeds.api.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f91088b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public String f91089a;

    /* renamed from: c  reason: collision with root package name */
    private final h f91090c;

    static {
        Covode.recordClassIndex(57302);
    }

    private LoadFeedsMethod(byte b2) {
        this();
    }

    private final com.ss.android.ugc.aweme.fe.method.feeds.a c() {
        return (com.ss.android.ugc.aweme.fe.method.feeds.a) this.f91090c.getValue();
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
            Covode.recordClassIndex(57303);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private /* synthetic */ LoadFeedsMethod() {
        this((com.bytedance.ies.web.a.a) null);
    }

    static final class b extends h.f.b.m implements h.f.a.a<com.ss.android.ugc.aweme.fe.method.feeds.a> {
        final /* synthetic */ LoadFeedsMethod this$0;

        static {
            Covode.recordClassIndex(57304);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(LoadFeedsMethod loadFeedsMethod) {
            super(0);
            this.this$0 = loadFeedsMethod;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ com.ss.android.ugc.aweme.fe.method.feeds.a invoke() {
            return a.C2202a.a(new com.ss.android.ugc.aweme.fe.method.feeds.b.a(), this.this$0.f91089a, this.this$0);
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        c().f91281a.dispose();
        Activity activity = (Activity) getActContext();
        if (activity != null) {
            activity.findViewById(16908290).setTag(R.id.wu, null);
        }
    }

    public LoadFeedsMethod(com.bytedance.ies.web.a.a aVar) {
        super(aVar);
        this.f91090c = h.i.a((h.f.a.a) new b(this));
        this.f91089a = "";
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

    @Override // com.ss.android.ugc.aweme.fe.method.feeds.api.a
    public final void b(String str, JSONObject jSONObject) {
        l.d(str, "");
        l.d(jSONObject, "");
        sendEvent(str, jSONObject, 3);
    }

    @Override // com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod
    public final void handle(JSONObject jSONObject, BaseCommonJavaMethod.a aVar) {
        int i2 = 1;
        boolean z = false;
        if (jSONObject != null && jSONObject.has("base_url") && jSONObject.has("react_id") && jSONObject.has("page") && jSONObject.has("size") && !jSONObject.optBoolean("clear", false)) {
            String optString = jSONObject.optString("react_id");
            l.b(optString, "");
            this.f91089a = optString;
            String optString2 = jSONObject.optString("base_url");
            int optInt = jSONObject.optInt("page");
            int optInt2 = jSONObject.optInt("size");
            c().mData.f91300a.clear();
            com.ss.android.ugc.aweme.fe.method.feeds.a c2 = c();
            l.b(optString2, "");
            Context actContext = getActContext();
            Objects.requireNonNull(actContext, "null cannot be cast to non-null type android.app.Activity");
            c2.a(optString2, optInt, optInt2, (Activity) actContext);
            z = true;
        }
        if (aVar != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (!z) {
                i2 = -1;
            }
            jSONObject2.put("code", i2);
            aVar.a(jSONObject2);
        }
    }
}
