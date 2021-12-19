package com.bytedance.android.livesdk.manage.c;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.manage.a;
import com.bytedance.android.livesdk.r;
import com.bytedance.covode.number.Covode;

public final class g extends a {
    static {
        Covode.recordClassIndex(11241);
    }

    @Override // com.bytedance.android.livesdk.manage.c.a
    public final void a(int i2) {
        long currentTimeMillis = System.currentTimeMillis();
        for (AssetsModel assetsModel : a.b.f18870a.f18862a) {
            if (((double) (currentTimeMillis - r.a(assetsModel.getId()))) > this.f18887a && assetsModel.getResourceType() == 5) {
                a.a(assetsModel, (com.bytedance.android.livesdk.gift.assets.a) null, i2);
                r.a(assetsModel.getId(), currentTimeMillis);
            }
        }
    }
}
