package com.bytedance.android.livesdk.chatroom.ui;

import com.bytedance.android.live.core.f.k;
import com.bytedance.android.livesdk.gift.model.GiftPage;
import com.bytedance.android.livesdk.livesetting.gift.LivePrefetchGiftImageSetting;
import com.bytedance.android.livesdk.model.u;
import com.bytedance.covode.number.Covode;
import f.a.v;
import f.a.w;
import java.util.List;

final /* synthetic */ class cv implements w {

    /* renamed from: a  reason: collision with root package name */
    private final List f16080a;

    static {
        Covode.recordClassIndex(8901);
    }

    cv(List list) {
        this.f16080a = list;
    }

    @Override // f.a.w
    public final void subscribe(v vVar) {
        List<GiftPage> list = this.f16080a;
        if (LivePrefetchGiftImageSetting.INSTANCE.getValue() && list != null && list.size() > 0) {
            for (GiftPage giftPage : list) {
                List<u> list2 = giftPage.gifts;
                if (list2 != null && list2.size() > 0) {
                    for (u uVar : list2) {
                        if (uVar.f19759b != null) {
                            k.a(uVar.f19759b);
                        }
                    }
                }
            }
        }
    }
}
