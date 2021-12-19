package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.text.TextUtils;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.ui.common.g;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.sec.SecApiImpl;
import h.f.b.l;
import org.json.JSONObject;

public final class BdturingMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f68949b = new a((byte) 0);

    static {
        Covode.recordClassIndex(42501);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return "popTuringVerifyView";
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42502);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public static final class b extends com.ss.android.ugc.aweme.secapi.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ BaseBridgeMethod.a f68950a;

        static {
            Covode.recordClassIndex(42503);
        }

        b(BaseBridgeMethod.a aVar) {
            this.f68950a = aVar;
        }

        @Override // com.ss.android.ugc.aweme.secapi.a
        public final void a(boolean z, int i2) {
            this.f68950a.a(Integer.valueOf(i2));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BdturingMethod(com.bytedance.ies.bullet.c.e.a.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        Activity activity;
        String str = "";
        l.d(jSONObject, str);
        l.d(aVar, str);
        g f2 = f();
        if (f2 != null) {
            activity = f2.a();
        } else {
            activity = null;
        }
        String optString = jSONObject.optString("decision");
        if (optString != null) {
            str = optString;
        }
        if (activity == null || TextUtils.isEmpty(str)) {
            aVar.a((Object) 1);
        } else {
            SecApiImpl.a().popCaptchaV2(activity, str, new b(aVar));
        }
    }
}
