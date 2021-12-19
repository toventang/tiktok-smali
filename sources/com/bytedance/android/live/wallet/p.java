package com.bytedance.android.live.wallet;

import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.model.BalanceStruct;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.UserBalance;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class p implements f {

    /* renamed from: a  reason: collision with root package name */
    private final i f13239a;

    static {
        Covode.recordClassIndex(7342);
    }

    p(i iVar) {
        this.f13239a = iVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        i iVar = this.f13239a;
        BalanceStruct balanceStruct = (BalanceStruct) ((d) obj).data;
        if (balanceStruct != null && balanceStruct.getValidUser() && balanceStruct.getUserBalance() != null) {
            BalanceStructExtra exchangeInfo = iVar.f13182b.getExchangeInfo();
            iVar.f13182b = balanceStruct;
            iVar.f13182b.setExchangeInfo(exchangeInfo);
            UserBalance userBalance = balanceStruct.getUserBalance();
            ((IapApi) e.a().a(IapApi.class)).getExchangeRatio(userBalance.getCurrencyType(), userBalance.getCountryCode(), 100, userBalance.getBalance(), 2).a(new com.bytedance.android.livesdk.util.rxutils.f()).a(new r(iVar), s.f13242a);
        }
    }
}
