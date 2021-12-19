package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.f.k;
import com.bytedance.android.livesdk.chatroom.ui.a;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.covode.number.Covode;
import f.a.v;
import f.a.w;
import java.util.List;

final /* synthetic */ class aj implements w {

    /* renamed from: a  reason: collision with root package name */
    private final a.AnonymousClass6 f15860a;

    /* renamed from: b  reason: collision with root package name */
    private final List f15861b;

    static {
        Covode.recordClassIndex(8751);
    }

    aj(a.AnonymousClass6 r1, List list) {
        this.f15860a = r1;
        this.f15861b = list;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        a.AnonymousClass6 r3 = this.f15860a;
        List<GiftPage> list = this.f15861b;
        if (list != null && list.size() > 0) {
            for (GiftPage giftPage : list) {
                List<u> list2 = giftPage.gifts;
                if (list2 != null && list2.size() > 0) {
                    for (u uVar : list2) {
                        if (uVar.f19759b != null) {
                            k.a(uVar.f19759b);
                        }
                    }
                    if (a.this.getView() != null) {
                        a.this.getView().post(new ak(r3));
                    }
                }
            }
        }
    }
}
