package com.ss.android.ugc.aweme.ecommerce.router;

import android.net.Uri;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.lifecycle.v;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.ECommerceService;
import org.json.JSONObject;

public final class Strategy$lifecycleObserver$1 implements au {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ m f87144a;

    static {
        Covode.recordClassIndex(54675);
    }

    @Override // androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        if (aVar == i.a.ON_DESTROY) {
            onDestory();
        }
    }

    @v(a = i.a.ON_DESTROY)
    public final void onDestory() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("tiktokec_fallback_is_reconstructed", this.f87144a.f87187k ? 1 : 0);
        jSONObject.put("tiktokec_fallback_type", this.f87144a.f87183g.toString());
        Uri uri = this.f87144a.f87184h;
        if (uri != null) {
            jSONObject.put("tiktokec_fallback_scheme", uri.getScheme() + "://" + uri.getAuthority() + uri.getPath());
        }
        ECommerceService.createIECommerceServicebyMonsterPlugin(false).postEvent("rd_tiktokec_fallback_reconstructed", jSONObject);
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    Strategy$lifecycleObserver$1(m mVar) {
        this.f87144a = mVar;
    }
}
