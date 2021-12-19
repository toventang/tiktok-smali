package com.ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.app.f.d;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.qrcode.view.QRCodePermissionActivity;
import h.f.b.l;
import java.util.Objects;
import org.json.JSONObject;

public final class OpenScanMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69024b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69025c = "scan";

    static {
        Covode.recordClassIndex(42565);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42566);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69025c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpenScanMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        JSONObject jSONObject2;
        l.d(jSONObject, "");
        l.d(aVar, "");
        r.a("qr_code_scan_enter", new d().a("enter_from", "h5").f66730a);
        if (jSONObject.has("args")) {
            jSONObject2 = jSONObject.getJSONObject("args");
        } else {
            jSONObject2 = null;
        }
        QRCodePermissionActivity.a(e());
        if (jSONObject2 != null && jSONObject2.has("should_close_self") && jSONObject2.getBoolean("should_close_self") && (e() instanceof Activity)) {
            Context e2 = e();
            Objects.requireNonNull(e2, "null cannot be cast to non-null type android.app.Activity");
            ((Activity) e2).finish();
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("code", 1);
        aVar.a(jSONObject3);
    }
}
