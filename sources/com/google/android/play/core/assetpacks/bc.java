package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import com.bytedance.covode.number.Covode;
import com.google.android.play.core.b.bq;
import java.util.Map;

final /* synthetic */ class bc implements bl {

    /* renamed from: a  reason: collision with root package name */
    private final bm f52865a;

    /* renamed from: b  reason: collision with root package name */
    private final Bundle f52866b;

    static {
        Covode.recordClassIndex(32695);
    }

    bc(bm bmVar, Bundle bundle) {
        this.f52865a = bmVar;
        this.f52866b = bundle;
    }

    @Override // com.google.android.play.core.assetpacks.bl
    public final Object a() {
        boolean z;
        bm bmVar = this.f52865a;
        Bundle bundle = this.f52866b;
        int i2 = bundle.getInt("session_id");
        if (i2 == 0) {
            return true;
        }
        Map<Integer, bj> map = bmVar.f52896e;
        Integer valueOf = Integer.valueOf(i2);
        if (!map.containsKey(valueOf)) {
            return true;
        }
        bj bjVar = bmVar.f52896e.get(valueOf);
        if (bjVar.f52885c.f52880c == 6) {
            z = false;
        } else {
            z = !bw.a(bjVar.f52885c.f52880c, bundle.getInt(bq.a("status", bm.a(bundle))));
        }
        return Boolean.valueOf(z);
    }
}
