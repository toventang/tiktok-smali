package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.web.jsbridge2.e;
import com.bytedance.ies.web.jsbridge2.g;
import com.kakao.usermgmt.StringSet;
import org.json.JSONObject;

public final class k extends e<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f14683a;

    static {
        Covode.recordClassIndex(8156);
    }

    @Override // com.bytedance.ies.web.jsbridge2.e
    public final void onTerminate() {
        Dialog dialog = this.f14683a;
        if (dialog != null && dialog.isShowing()) {
            this.f14683a.dismiss();
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, com.bytedance.ies.web.jsbridge2.g] */
    @Override // com.bytedance.ies.web.jsbridge2.e
    public final /* synthetic */ void invoke(JSONObject jSONObject, g gVar) {
        JSONObject jSONObject2 = jSONObject;
        JSONObject optJSONObject = jSONObject2.optJSONObject("args");
        if (TextUtils.equals(jSONObject2.optString(StringSet.type), "recharge")) {
            ChargeDeal chargeDeal = new ChargeDeal();
            Bundle bundle = new Bundle();
            if (optJSONObject != null) {
                bundle.putString("KEY_CHARGE_REASON", "");
                bundle.putString("KEY_REQUEST_PAGE", "");
                chargeDeal.f18927e = optJSONObject.optInt("diamond_count");
                chargeDeal.f18924b = optJSONObject.optInt("exchange_price");
                chargeDeal.f18925c = optJSONObject.optInt("price");
                chargeDeal.f18923a = (long) optJSONObject.optInt("id");
                chargeDeal.f18928f = optJSONObject.optInt("giving_count");
            }
            Dialog payDialog = ((IWalletService) a.a(IWalletService.class)).getPayDialog(gVar.f35646a, 0, bundle, chargeDeal);
            this.f14683a = payDialog;
            payDialog.show();
        }
        finishWithSuccess();
    }
}
