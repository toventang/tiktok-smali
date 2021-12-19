package com.bytedance.android.livesdk.manage.c;

import androidx.c.d;
import com.bytedance.android.live.u.h;
import com.bytedance.android.livesdk.gift.assets.AssetsModel;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.manage.a;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.android.livesdk.r;
import com.bytedance.android.livesdk.service.assets.GiftManager;
import com.bytedance.covode.number.Covode;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.List;

public final class c extends a {
    static {
        Covode.recordClassIndex(11236);
    }

    static final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f18888a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ ArrayList f18889b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f18890c;

        static {
            Covode.recordClassIndex(11237);
        }

        a(c cVar, ArrayList arrayList, int i2) {
            this.f18888a = cVar;
            this.f18889b = arrayList;
            this.f18890c = i2;
        }

        public final void run() {
            c.a(this.f18889b, n.k(a.b.f18870a.f18862a), this.f18890c);
        }
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
        if (h.c()) {
            h.b(new a(this, arrayList, i2));
        } else {
            a(arrayList, a.b.f18870a.f18862a, i2);
        }
    }

    public static void a(ArrayList<Long> arrayList, List<? extends AssetsModel> list, int i2) {
        ArrayList arrayList2 = new ArrayList();
        d dVar = new d();
        for (AssetsModel assetsModel : list) {
            if (arrayList.contains(Long.valueOf(assetsModel.getId())) && assetsModel.getResourceType() != 5) {
                dVar.c(assetsModel.getId(), Long.valueOf(System.currentTimeMillis()));
                arrayList2.add(assetsModel);
                com.bytedance.android.livesdk.manage.a.a(assetsModel, (com.bytedance.android.livesdk.gift.assets.a) null, i2);
            }
        }
        r.a(arrayList2, dVar);
    }
}
