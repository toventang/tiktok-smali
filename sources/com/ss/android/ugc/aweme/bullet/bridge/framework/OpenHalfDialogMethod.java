package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.google.gson.o;
import com.google.gson.q;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class OpenHalfDialogMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69114b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69115c = "openHalfDialog";

    static {
        Covode.recordClassIndex(42622);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42623);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69115c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenHalfDialogMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        int i2;
        int i3;
        l.d(jSONObject, "");
        l.d(aVar, "");
        Context e2 = e();
        if (!(e2 instanceof Activity)) {
            e2 = null;
        }
        Activity activity = (Activity) e2;
        if (activity == null) {
            aVar.a(0, "activity is null");
            return;
        }
        com.google.gson.l a2 = q.a(jSONObject.toString());
        l.b(a2, "");
        o j2 = a2.j();
        com.google.gson.l c2 = j2.c("height");
        l.b(c2, "");
        int a3 = n.a(activity, c2.g());
        com.google.gson.l c3 = j2.c("schema");
        l.b(c3, "");
        String c4 = c3.c();
        l.b(c4, "");
        com.google.gson.l c5 = j2.c("borderRadius");
        if (c5 == null || (c5 instanceof com.google.gson.n)) {
            i2 = n.a(8.0d);
        } else {
            i2 = n.a(activity, c5.g());
        }
        float f2 = (float) i2;
        com.google.gson.l c6 = j2.c("bgColor");
        if (c6 == null || (c6 instanceof com.google.gson.n)) {
            i3 = -1;
        } else {
            i3 = Color.parseColor(c6.c());
        }
        new com.ss.android.ugc.aweme.commerce.b.a(activity, a3, c4, f2, i3).show();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("code", 1);
        aVar.a(jSONObject2);
    }
}
