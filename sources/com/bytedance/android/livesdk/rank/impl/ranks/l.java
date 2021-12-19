package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.livesdk.model.aa;
import com.bytedance.android.livesdk.model.message.ad;
import com.bytedance.covode.number.Covode;
import java.util.List;

final /* synthetic */ class l implements aa {

    /* renamed from: a  reason: collision with root package name */
    private final g f20930a;

    /* renamed from: b  reason: collision with root package name */
    private final List f20931b;

    static {
        Covode.recordClassIndex(12388);
    }

    l(g gVar, List list) {
        this.f20930a = gVar;
        this.f20931b = list;
    }

    @Override // com.bytedance.android.livesdk.model.aa
    public final void a() {
        g gVar = this.f20930a;
        for (ad adVar : this.f20931b) {
            gVar.x.insertMessage(adVar.f19125c, true);
        }
    }
}
