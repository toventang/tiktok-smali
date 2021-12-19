package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.api.IBulletService;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.bullet.impl.BulletService;
import com.ss.android.ugc.aweme.bullet.views.c;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenPopUpMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69021b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69022c;

    /* renamed from: d  reason: collision with root package name */
    private c f69023d;

    static {
        Covode.recordClassIndex(42563);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
        if (aVar == i.a.ON_DESTROY) {
            onDestroy();
        }
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42564);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69022c;
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestroy() {
        c cVar = this.f69023d;
        if (cVar != null) {
            cVar.dismiss();
        }
        this.f69023d = null;
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        String optString = jSONObject.optString("url", "");
        Activity activity = null;
        String optString2 = jSONObject.optString("data", null);
        Context e2 = e();
        if (e2 instanceof Activity) {
            activity = e2;
        }
        Activity activity2 = activity;
        if (activity2 != null) {
            c cVar = this.f69023d;
            if (cVar == null) {
                IBulletService f2 = BulletService.f();
                l.b(optString, "");
                this.f69023d = f2.a(activity2, optString, optString2, 0, 0);
            } else {
                cVar.a(activity2);
            }
        }
        aVar.a("");
    }
}
