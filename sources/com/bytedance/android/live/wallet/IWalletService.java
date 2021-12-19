package com.bytedance.android.live.wallet;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.bytedance.android.livesdk.wallet.c;
import com.bytedance.android.livesdkapi.depend.d.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.t;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public interface IWalletService extends com.bytedance.android.live.base.a {

    public interface a {
        static {
            Covode.recordClassIndex(7182);
        }

        void a(Dialog dialog, h hVar);

        void b(Dialog dialog, h hVar);
    }

    static {
        Covode.recordClassIndex(7181);
    }

    void configPackagePurchaseHelper(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, m mVar);

    d createRechargeDialogFragment(e eVar, b bVar, Bundle bundle, com.bytedance.android.livesdkapi.depend.d.b.d dVar);

    com.bytedance.android.live.wallet.f.a.a getBasePayPresenter(Activity activity, com.bytedance.android.live.wallet.api.a aVar, String str, String str2, int i2, com.bytedance.android.live.wallet.f.b.a aVar2);

    Dialog getConsumeDialog(Activity activity, Bundle bundle, JSONObject jSONObject, a aVar, String str);

    Fragment getDiamondRechargeFragment(Context context, Bundle bundle);

    Fragment getFirstChargeRewardFragment(int i2, int i3);

    Map<String, com.bytedance.ies.web.a.d> getLiveWalletJSB(WeakReference<Context> weakReference, com.bytedance.ies.web.a.a aVar);

    Dialog getPayDialog(Context context, int i2, Bundle bundle, ChargeDeal chargeDeal);

    c getPipoPayHelper();

    List<c> getRechargeItemCache();

    int getRechargeType();

    void handleExceptionForAll(com.bytedance.android.livesdk.wallet.a.a aVar, Activity activity);

    t<com.bytedance.android.live.network.response.d<Object>> isFirstCharge();

    int isFirstConsume(com.bytedance.android.live.base.model.user.b bVar);

    void openWallet(Activity activity);

    void setRechargeItemCache(List<c> list, int i2);

    void showExchangeConfirmDialog(Context context, a aVar, b bVar);

    d showRechargeDialog(e eVar, Bundle bundle, DataChannel dataChannel, f fVar);

    void showTurnOnAutoExchangeDialog(Context context, DataChannel dataChannel);

    d walletCenter();
}
