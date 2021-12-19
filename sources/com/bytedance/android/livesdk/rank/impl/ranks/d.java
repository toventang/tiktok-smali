package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.livesdk.bl;
import com.bytedance.covode.number.Covode;
import h.f.a.b;
import h.z;

/* access modifiers changed from: package-private */
public final /* synthetic */ class d implements b {

    /* renamed from: a  reason: collision with root package name */
    private final RankEntranceWidget f20910a;

    static {
        Covode.recordClassIndex(12380);
    }

    d(RankEntranceWidget rankEntranceWidget) {
        this.f20910a = rankEntranceWidget;
    }

    @Override // h.f.a.b
    public final Object invoke(Object obj) {
        RankEntranceWidget rankEntranceWidget = this.f20910a;
        if (rankEntranceWidget.isViewValid() && rankEntranceWidget.f20769e != null) {
            rankEntranceWidget.f20769e.dismiss();
            if (bl.f14211a) {
                rankEntranceWidget.f20769e = null;
            }
        }
        return z.f158842a;
    }
}
