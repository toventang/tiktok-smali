package com.bytedance.android.live.wallet.d;

import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.h;
import com.bytedance.android.livesdk.wallet.f;
import com.bytedance.covode.number.Covode;
import f.a.t;
import java.util.HashMap;

public final class c implements h {

    /* renamed from: a  reason: collision with root package name */
    private final long f13120a;

    /* renamed from: b  reason: collision with root package name */
    private final long f13121b;

    static {
        Covode.recordClassIndex(7282);
    }

    @Override // com.bytedance.android.live.wallet.h
    public final int b() {
        return 10002;
    }

    @Override // com.bytedance.android.live.wallet.h
    public final t<d<f>> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("package_id", String.valueOf(this.f13120a));
        hashMap.put("anchor_id", String.valueOf(this.f13121b));
        return ((IapApi) e.a().a(IapApi.class)).buyWard(hashMap);
    }

    public c(long j2, long j3) {
        this.f13120a = j2;
        this.f13121b = j3;
    }
}
