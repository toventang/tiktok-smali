package com.bytedance.android.live.wallet;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.wallet.model.AutoExchangeData;
import com.bytedance.android.livesdk.ab.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final i f13192a;

    /* renamed from: b  reason: collision with root package name */
    private final String f13193b;

    static {
        Covode.recordClassIndex(7318);
    }

    j(i iVar, String str) {
        this.f13192a = iVar;
        this.f13193b = str;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        String str = this.f13193b;
        d dVar = (d) obj;
        i.a(((AutoExchangeData) dVar.data).getAfter());
        b.a.a("livesdk_auto_balance_exchange_setting").a("status", Boolean.valueOf(((AutoExchangeData) dVar.data).getAfter())).a("request_from", str).b();
    }
}
