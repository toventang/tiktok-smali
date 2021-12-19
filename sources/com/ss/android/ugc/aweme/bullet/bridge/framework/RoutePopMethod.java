package com.ss.android.ugc.aweme.bullet.bridge.framework;

import android.content.Intent;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.bullet.ui.common.g;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ax.a.e;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import h.f.b.l;
import org.json.JSONObject;

public final class RoutePopMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    public static final a f69139b = new a((byte) 0);

    /* renamed from: c  reason: collision with root package name */
    private final String f69140c = "routePop";

    static {
        Covode.recordClassIndex(42638);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(42639);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69140c;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RoutePopMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        g f2 = f();
        if (f2 != null) {
            JSONObject jSONObject2 = new JSONObject();
            e.a(jSONObject2, jSONObject);
            Intent intent = new Intent();
            intent.putExtra("serialized_data", jSONObject2.toString());
            f2.a(intent);
            f2.b();
            aVar.a(new JSONObject(), 1, "pop succeed");
            return;
        }
        aVar.a(-1, "params not valid");
    }
}
