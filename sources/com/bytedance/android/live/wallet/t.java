package com.bytedance.android.live.wallet;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class t implements f {

    /* renamed from: a  reason: collision with root package name */
    private final i f13243a;

    static {
        Covode.recordClassIndex(7346);
    }

    t(i iVar) {
        this.f13243a = iVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        this.f13243a.f13181a.f13235d = (BalanceStructExtra) ((d) obj).data;
    }
}
