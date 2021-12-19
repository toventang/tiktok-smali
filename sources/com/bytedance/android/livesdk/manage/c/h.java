package com.bytedance.android.livesdk.manage.c;

import androidx.c.d;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.manage.a;
import com.bytedance.android.livesdk.r;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;

public final class h extends a {
    static {
        Covode.recordClassIndex(11242);
    }

    @Override // com.bytedance.android.livesdk.manage.c.a
    public final void a(int i2) {
        List<? extends AssetsModel> list = a.b.f18870a.f18862a;
        d dVar = new d();
        ArrayList arrayList = new ArrayList();
        for (AssetsModel assetsModel : list) {
            if (assetsModel.getResourceType() == 5) {
                arrayList.add(assetsModel);
                dVar.c(assetsModel.getId(), Long.valueOf(System.currentTimeMillis()));
                a.a(assetsModel, (com.bytedance.android.livesdk.gift.assets.a) null, i2);
            }
        }
        r.a(arrayList, dVar);
    }
}
