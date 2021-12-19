package com.android.billingclient.api;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.android.billingclient.api.h;
import com.bytedance.covode.number.Covode;
import com.google.android.gms.internal.h.b;
import java.util.List;

/* access modifiers changed from: package-private */
public final class zzh extends ResultReceiver {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ e f5908a;

    static {
        Covode.recordClassIndex(2470);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzh(e eVar, Handler handler) {
        super(handler);
        this.f5908a = eVar;
    }

    public final void onReceiveResult(int i2, Bundle bundle) {
        k kVar = this.f5908a.f5822c.f5895b.f5896a;
        if (kVar != null) {
            List<Purchase> c2 = b.c(bundle);
            h.a a2 = h.a();
            a2.f5854a = i2;
            a2.f5855b = b.b(bundle);
            kVar.a(a2.a(), c2);
        }
    }
}
