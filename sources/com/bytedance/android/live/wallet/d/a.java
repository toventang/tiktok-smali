package com.bytedance.android.live.wallet.d;

import com.bytedance.android.live.network.e;
import com.bytedance.android.live.network.response.d;
import com.bytedance.android.live.wallet.api.IapApi;
import com.bytedance.android.live.wallet.h;
import com.bytedance.android.livesdk.wallet.f;
import com.bytedance.covode.number.Covode;
import f.a.t;
import java.util.HashMap;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    long f13117a;

    /* renamed from: b  reason: collision with root package name */
    long f13118b;

    static {
        Covode.recordClassIndex(7280);
    }

    @Override // com.bytedance.android.live.wallet.h
    public final int b() {
        return 10001;
    }

    @Override // com.bytedance.android.live.wallet.h
    public final t<d<f>> a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("activities_id", String.valueOf(this.f13117a));
        hashMap.put("item_id", String.valueOf(this.f13118b));
        return ((IapApi) e.a().a(IapApi.class)).buyPackage(hashMap);
    }

    public a(long j2, long j3) {
        this.f13117a = j2;
        this.f13118b = j3;
    }
}
