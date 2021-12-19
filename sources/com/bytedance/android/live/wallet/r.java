package com.bytedance.android.live.wallet;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class r implements f {

    /* renamed from: a  reason: collision with root package name */
    private final i f13241a;

    static {
        Covode.recordClassIndex(7344);
    }

    r(i iVar) {
        this.f13241a = iVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f13241a.f13182b.setExchangeInfo((BalanceStructExtra) ((d) obj).data);
    }
}
