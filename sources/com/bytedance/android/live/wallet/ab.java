package com.bytedance.android.live.wallet;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d;
import androidx.fragment.app.e;
import androidx.lifecycle.m;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.bytedance.android.livesdk.ui.a;
import com.bytedance.android.livesdk.wallet.c;
import com.bytedance.android.livesdkapi.depend.d.b.b;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import f.a.t;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class ab implements IWalletService {
    static {
        Covode.recordClassIndex(7230);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void configPackagePurchaseHelper(a aVar, DataChannel dataChannel, m mVar) {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public d createRechargeDialogFragment(e eVar, b bVar, Bundle bundle, com.bytedance.android.livesdkapi.depend.d.b.d dVar) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public com.bytedance.android.live.wallet.f.a.a<?> getBasePayPresenter(Activity activity, com.bytedance.android.live.wallet.api.a aVar, String str, String str2, int i2, com.bytedance.android.live.wallet.f.b.a aVar2) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Dialog getConsumeDialog(Activity activity, Bundle bundle, JSONObject jSONObject, IWalletService.a aVar, String str) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Fragment getDiamondRechargeFragment(Context context, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Fragment getFirstChargeRewardFragment(int i2, int i3) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Dialog getPayDialog(Context context, int i2, Bundle bundle, ChargeDeal chargeDeal) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public c getPipoPayHelper() {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public int getRechargeType() {
        return 0;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void handleExceptionForAll(com.bytedance.android.livesdk.wallet.a.a aVar, Activity activity) {
        l.d(aVar, "");
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public t<com.bytedance.android.live.network.response.d<Object>> isFirstCharge() {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public int isFirstConsume(com.bytedance.android.live.base.model.user.b bVar) {
        return 0;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void openWallet(Activity activity) {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void setRechargeItemCache(List<c> list, int i2) {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void showExchangeConfirmDialog(Context context, a aVar, b bVar) {
        l.d(context, "");
        l.d(aVar, "");
        l.d(bVar, "");
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public d showRechargeDialog(e eVar, Bundle bundle, DataChannel dataChannel, f fVar) {
        l.d(eVar, "");
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void showTurnOnAutoExchangeDialog(Context context, DataChannel dataChannel) {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public d walletCenter() {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public List<c> getRechargeItemCache() {
        return new ArrayList();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Map<String, com.bytedance.ies.web.a.d> getLiveWalletJSB(WeakReference<Context> weakReference, com.bytedance.ies.web.a.a aVar) {
        return new LinkedHashMap();
    }
}
