package com.bytedance.android.livesdk.userservice;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.covode.number.Covode;
import f.a.d.g;

final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    private final long f22093a;

    static {
        Covode.recordClassIndex(13010);
    }

    j(long j2) {
        this.f22093a = j2;
    }

    @Override // f.a.d.g
    public final Object apply(Object obj) {
        long j2 = this.f22093a;
        int i2 = ((a) ((d) obj).data).f22056a;
        a aVar = new a();
        if (i2 == 1) {
            aVar.f23023e = 1;
        } else if (i2 == 2) {
            aVar.f23023e = 2;
        } else {
            aVar.f23023e = 0;
        }
        aVar.f23019a = j2;
        return aVar;
    }
}
