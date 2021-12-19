package com.bytedance.android.live.wallet;

import android.os.SystemClock;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.wallet.model.BalanceStructExtra;
import com.bytedance.android.live.wallet.model.g;
import com.bytedance.android.livesdk.wallet.b.a;
import com.bytedance.covode.number.Covode;
import f.a.d.f;

/* access modifiers changed from: package-private */
public final /* synthetic */ class n implements f {

    /* renamed from: a  reason: collision with root package name */
    private final i f13236a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13237b;

    static {
        Covode.recordClassIndex(7340);
    }

    n(i iVar, long j2) {
        this.f13236a = iVar;
        this.f13237b = j2;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        i iVar = this.f13236a;
        long j2 = this.f13237b;
        g gVar = (g) ((d) obj).data;
        if (gVar != null) {
            BalanceStructExtra balanceStructExtra = iVar.f13181a.f13235d;
            iVar.f13181a = gVar;
            i.a(gVar.f13233b);
            if (iVar.f13181a.f13234c != null && iVar.f13181a.f13234c.getEnableExchange()) {
                iVar.f13181a.f13235d = balanceStructExtra;
                iVar.a(gVar.f13234c.getCurrency(), gVar.f13234c.getRegion(), gVar.f13234c.getBalance());
            }
        }
        iVar.f13183c.onNext(Long.valueOf(iVar.b()));
        a.a(0, SystemClock.uptimeMillis() - j2, null);
    }
}
