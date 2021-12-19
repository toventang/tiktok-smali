package com.ss.android.ugc.aweme.bullet.bridge.common;

import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.bullet.c.e.a.b;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod;
import com.ss.android.ugc.aweme.commercialize.feed.popupwebview.AdPopUpWebBottomSheetContainer;
import h.f.b.l;
import org.json.JSONObject;

public final class SetScrollTopMethod extends BaseBridgeMethod implements au {

    /* renamed from: b  reason: collision with root package name */
    private final String f69036b = "setScrollTop";

    static {
        Covode.recordClassIndex(42575);
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.ies.bullet.c.c.a.q
    public final String d() {
        return this.f69036b;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SetScrollTopMethod(b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.bullet.bridge.BaseBridgeMethod
    public final void a(JSONObject jSONObject, BaseBridgeMethod.a aVar) {
        l.d(jSONObject, "");
        l.d(aVar, "");
        int optInt = jSONObject.optInt("top", 2);
        if (optInt == 0) {
            AdPopUpWebBottomSheetContainer.f74281i = false;
        } else if (optInt == 1) {
            AdPopUpWebBottomSheetContainer.f74281i = true;
        }
        aVar.a((Object) 1);
    }
}
