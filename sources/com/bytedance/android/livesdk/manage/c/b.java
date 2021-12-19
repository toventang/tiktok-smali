package com.bytedance.android.livesdk.manage.c;

import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.manage.a;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.r;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.covode.number.Covode;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class b extends a {
    static {
        Covode.recordClassIndex(11235);
    }

    @Override // com.bytedance.android.livesdk.manage.c.a
    public final void a(int i2) {
        GiftManager inst = GiftManager.inst();
        l.b(inst, "");
        List<GiftPage> giftPageList = inst.getGiftPageList();
        ArrayList arrayList = new ArrayList();
        for (GiftPage giftPage : giftPageList) {
            for (u uVar : giftPage.gifts) {
                l.b(uVar, "");
                if (uVar.f19770m && uVar.n != 0) {
                    arrayList.add(Long.valueOf(uVar.n));
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        for (AssetsModel assetsModel : a.b.f18870a.f18862a) {
            if (arrayList.contains(Long.valueOf(assetsModel.getId())) && ((double) (currentTimeMillis - r.a(assetsModel.getId()))) > this.f18887a && assetsModel.getResourceType() != 5) {
                a.a(assetsModel, (com.bytedance.android.livesdk.gift.assets.a) null, i2);
                r.a(assetsModel.getId(), currentTimeMillis);
            }
        }
    }
}
