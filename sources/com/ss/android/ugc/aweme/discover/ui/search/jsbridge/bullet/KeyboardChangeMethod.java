package com.ss.android.ugc.aweme.discover.ui.search.jsbridge.bullet;

import android.app.Activity;
import androidx.fragment.app.e;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.bytedance.ies.ugc.appcontext.f;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.discover.model.KeyboardModel;
import h.f.b.l;
import org.json.JSONObject;

public final class KeyboardChangeMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f82656b = "KeyboardChange";

    static {
        Covode.recordClassIndex(51485);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f82656b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KeyboardChangeMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        try {
            int optInt = jSONObject.optInt("pop_up");
            Activity j2 = f.j();
            if (j2 != null && (j2 instanceof e)) {
                ac a2 = ae.a((e) j2, (ad.b) null).a(KeyboardModel.class);
                l.b(a2, "");
                ((KeyboardModel) a2).getKeyboardStatus().setValue(Integer.valueOf(optInt));
            }
            aVar.a((Object) new JSONObject());
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.discover.ui.search.b.a(e2, "KeyboardChange");
            aVar.a(0, e2.getMessage());
            e2.printStackTrace();
        }
    }
}
