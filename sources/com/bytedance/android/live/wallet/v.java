package com.bytedance.android.live.wallet;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.m;
import com.bytedance.android.live.design.widget.LiveCheckBox;
import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.t.a;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.c.b;
import com.bytedance.android.live.wallet.i;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.RevenueExchange;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.android.livesdk.chatroom.interaction.PackagePurchaseHelper;
import com.bytedance.android.livesdk.j.ao;
import com.bytedance.android.livesdk.l.b;
import com.bytedance.android.livesdk.livesetting.wallet.CanRechargeSetting;
import com.bytedance.android.livesdk.livesetting.wallet.HideChargeIconForUserSetting;
import com.bytedance.android.livesdk.livesetting.wallet.LiveRechargeDialogTypeSetting;
import com.bytedance.android.livesdk.model.ChargeDeal;
import com.bytedance.android.livesdk.util.rxutils.f;
import com.bytedance.android.livesdk.wallet.DiamondPackageExtra;
import com.bytedance.android.livesdk.wallet.c;
import com.bytedance.android.livesdkapi.host.IHostApp;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import f.a.t;
import h.f.b.l;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class v implements IWalletService {
    static {
        Covode.recordClassIndex(7348);
    }

    private static String getBannerUrl(DataChannel dataChannel) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Fragment getDiamondRechargeFragment(Context context, Bundle bundle) {
        return null;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Dialog getPayDialog(Context context, int i2, Bundle bundle, ChargeDeal chargeDeal) {
        return null;
    }

    @Override // com.bytedance.android.live.base.a
    public void onInit() {
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public d walletCenter() {
        return i.a.f13191a;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public c getPipoPayHelper() {
        return new b(0);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public List<c> getRechargeItemCache() {
        return e.f13122g.a();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public int getRechargeType() {
        if (LiveRechargeDialogTypeSetting.INSTANCE.getValue() == 0) {
            return 2;
        }
        return 3;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public t<d<Object>> isFirstCharge() {
        return ((IapApi) e.a().a(IapApi.class)).isFirstCharge().a(new f());
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void openWallet(Activity activity) {
        if (CanRechargeSetting.INSTANCE.getValue()) {
            ((IHostApp) a.a(IHostApp.class)).openWallet(activity);
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public int isFirstConsume(com.bytedance.android.live.base.model.user.b bVar) {
        if (bVar.getUserHonor() == null || bVar.getUserHonor().p() == null || bVar.getUserHonor().p().size() <= 1 || bVar.getUserHonor().p().get(1) == null || bVar.getUserHonor().p().get(1).f19790d != 0) {
            return 0;
        }
        return 1;
    }

    private void checkExchange(Bundle bundle) {
        BalanceStructExtra balanceStructExtra = walletCenter().f().f13235d;
        BalanceStructExtra exchangeInfo = walletCenter().e().getExchangeInfo();
        UserBalance userBalance = walletCenter().e().getUserBalance();
        RevenueExchange revenueExchange = walletCenter().f().f13234c;
        if (revenueExchange == null || !revenueExchange.getEnableExchange() || balanceStructExtra == null) {
            if (walletCenter().e().getValidUser() && exchangeInfo != null && userBalance != null) {
                bundle.putInt("key_bundle_show_balance", -1);
                if (exchangeInfo.getMaxCoins() > 0) {
                    bundle.putInt("key_bundle_can_exchange", 2);
                } else if (userBalance.getBalance() > 0) {
                    bundle.putInt("key_bundle_can_exchange", 1);
                }
            }
        } else if (revenueExchange.getBalance() > 0) {
            bundle.putInt("key_bundle_show_balance", -2);
            if (balanceStructExtra.getMaxCoins() > 0) {
                bundle.putInt("key_bundle_can_exchange", 2);
            } else {
                bundle.putInt("key_bundle_can_exchange", 1);
            }
        } else if (!walletCenter().e().getValidUser() || exchangeInfo == null || userBalance == null || userBalance.getBalance() <= 0) {
            bundle.putInt("key_bundle_show_balance", -2);
            if (balanceStructExtra.getMaxCoins() > 0) {
                bundle.putInt("key_bundle_can_exchange", 2);
            } else if (revenueExchange.getBalance() > 0) {
                bundle.putInt("key_bundle_can_exchange", 1);
            }
        } else {
            bundle.putInt("key_bundle_show_balance", -1);
            if (exchangeInfo.getMaxCoins() > 0) {
                bundle.putInt("key_bundle_can_exchange", 2);
            } else if (userBalance.getBalance() > 0) {
                bundle.putInt("key_bundle_can_exchange", 1);
            }
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void handleExceptionForAll(com.bytedance.android.livesdk.wallet.a.a aVar, Activity activity) {
        com.bytedance.android.live.wallet.g.a.a(aVar, activity);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Fragment getFirstChargeRewardFragment(int i2, int i3) {
        com.bytedance.android.live.wallet.b.a aVar = new com.bytedance.android.live.wallet.b.a();
        aVar.f13053a = i2;
        aVar.f13054b = i3;
        return aVar;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void lambda$showTurnOnAutoExchangeDialog$3$WalletService(DialogInterface dialogInterface, int i2) {
        b.a.a("livesdk_auto_balance_exchange_click").a("click", "turn_on").b();
        walletCenter().a("auto_exchange_window");
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void setRechargeItemCache(List<c> list, int i2) {
        DiamondPackageExtra diamondPackageExtra;
        if (!(i2 == -1 || (diamondPackageExtra = e.f13122g.f13128e) == null)) {
            diamondPackageExtra.recentlyPurchasedPacketId = i2;
        }
        if (!com.bytedance.common.utility.collection.b.a((Collection) list)) {
            e.f13122g.a(list);
        }
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Map<String, com.bytedance.ies.web.a.d> getLiveWalletJSB(WeakReference<Context> weakReference, com.bytedance.ies.web.a.a aVar) {
        HashMap hashMap = new HashMap();
        com.bytedance.android.live.wallet.e.d dVar = new com.bytedance.android.live.wallet.e.d();
        hashMap.put("getPurchaseItemList", new com.bytedance.android.live.wallet.e.c(weakReference.get(), aVar, dVar));
        hashMap.put("charge", new com.bytedance.android.live.wallet.e.b(weakReference.get(), aVar, dVar));
        return hashMap;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void showTurnOnAutoExchangeDialog(Context context, DataChannel dataChannel) {
        b.a aVar = new b.a(context);
        aVar.f18296m = false;
        aVar.a(R.string.e2j).b(R.string.e2i).a(R.string.e2g, (DialogInterface.OnClickListener) new z(this), false).b(R.string.e2a, aa.f13005a, false).a().show();
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void configPackagePurchaseHelper(com.bytedance.android.livesdk.ui.a aVar, DataChannel dataChannel, m mVar) {
        new PackagePurchaseHelper(aVar, dataChannel, mVar);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public void showExchangeConfirmDialog(Context context, a aVar, b bVar) {
        MethodCollector.i(9611);
        b.a aVar2 = new b.a(context);
        aVar2.f18287d = R.drawable.bxn;
        aVar2.f18296m = false;
        b.a a2 = aVar2.a(bVar.f13046a);
        a2.f18285b = bVar.f13047b;
        a2.a(bVar.f13049d, (DialogInterface.OnClickListener) new w(aVar), false).b(bVar.f13048c, (DialogInterface.OnClickListener) new x(aVar), false);
        if (bVar.f13051f) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.b5e, (ViewGroup) null);
            LiveCheckBox liveCheckBox = (LiveCheckBox) inflate.findViewById(R.id.a54);
            liveCheckBox.setText(bVar.f13050e);
            liveCheckBox.setOnCheckedChangeListener(new y(aVar));
            aVar2.f18292i = inflate;
        }
        aVar2.a().show();
        MethodCollector.o(9611);
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public androidx.fragment.app.d createRechargeDialogFragment(androidx.fragment.app.e eVar, com.bytedance.android.livesdkapi.depend.d.b.b bVar, Bundle bundle, com.bytedance.android.livesdkapi.depend.d.b.d dVar) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        l.d(eVar, "");
        l.d(bundle, "");
        com.bytedance.android.live.wallet.a.i iVar = new com.bytedance.android.live.wallet.a.i();
        iVar.f12969b = eVar;
        iVar.f12979l = null;
        iVar.f12980m = bVar;
        iVar.setArguments(bundle);
        iVar.f12968a = dVar;
        return iVar;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public androidx.fragment.app.d showRechargeDialog(androidx.fragment.app.e eVar, Bundle bundle, DataChannel dataChannel, f fVar) {
        if (HideChargeIconForUserSetting.INSTANCE.getValue() || !CanRechargeSetting.INSTANCE.getValue()) {
            return null;
        }
        androidx.fragment.app.i iVar = (androidx.fragment.app.i) dataChannel.b(ao.class);
        int i2 = 1;
        if (!bundle.containsKey("key_bundle_banner_url") || TextUtils.isEmpty(bundle.getString("key_bundle_banner_url"))) {
            String bannerUrl = getBannerUrl(dataChannel);
            i2 = 1 ^ (TextUtils.isEmpty(bannerUrl) ? 1 : 0);
            bundle.putString("key_bundle_banner_url", bannerUrl);
        }
        bundle.putInt("key_bundle_charge_type", i2);
        checkExchange(bundle);
        l.d(eVar, "");
        l.d(bundle, "");
        com.bytedance.android.live.wallet.a.i iVar2 = new com.bytedance.android.live.wallet.a.i();
        iVar2.f12969b = eVar;
        iVar2.setArguments(bundle);
        iVar2.f12979l = fVar;
        if (iVar == null || iVar.a("RechargeDialog") != null) {
            return null;
        }
        iVar2.show(iVar, "RechargeDialog");
        return iVar2;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public Dialog getConsumeDialog(Activity activity, Bundle bundle, JSONObject jSONObject, IWalletService.a aVar, String str) {
        com.bytedance.android.live.wallet.a.b bVar = new com.bytedance.android.live.wallet.a.b(activity, bundle.getString("KEY_REQUEST_PAGE"));
        h a2 = new com.bytedance.android.live.wallet.d.b(jSONObject).a();
        if (a2 != null) {
            bVar.a(a2);
        }
        bVar.f12941i = aVar;
        bVar.a(str);
        return bVar;
    }

    @Override // com.bytedance.android.live.wallet.IWalletService
    public com.bytedance.android.live.wallet.f.a.a getBasePayPresenter(Activity activity, com.bytedance.android.live.wallet.api.a aVar, String str, String str2, int i2, com.bytedance.android.live.wallet.f.b.a aVar2) {
        com.bytedance.android.live.wallet.f.a.c cVar = new com.bytedance.android.live.wallet.f.a.c(activity, aVar, str);
        cVar.a(aVar2);
        return cVar;
    }
}
