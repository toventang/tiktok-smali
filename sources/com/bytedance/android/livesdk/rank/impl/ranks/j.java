package com.bytedance.android.livesdk.rank.impl.ranks;

import com.bytedance.android.live.network.response.d;
import com.bytedance.android.livesdk.rank.impl.api.model.e;
import com.bytedance.android.livesdk.rank.impl.api.model.g;
import com.bytedance.android.livesdk.rank.impl.d.b;
import com.bytedance.covode.number.Covode;
import f.a.d.f;
import java.util.Iterator;

/* access modifiers changed from: package-private */
public final /* synthetic */ class j implements f {

    /* renamed from: a  reason: collision with root package name */
    private final g f20928a;

    static {
        Covode.recordClassIndex(12386);
    }

    j(g gVar) {
        this.f20928a = gVar;
    }

    @Override // f.a.d.f
    public final void accept(Object obj) {
        g gVar = this.f20928a;
        d dVar = (d) obj;
        if (dVar == null || dVar.data == null || ((com.bytedance.android.livesdk.rank.impl.api.model.f) dVar.data).f20646a == null || ((com.bytedance.android.livesdk.rank.impl.api.model.f) dVar.data).f20646a.isEmpty()) {
            gVar.a(-1, (String) null, (String) null, "score_display_config_empty");
            return;
        }
        Iterator<e> it = ((com.bytedance.android.livesdk.rank.impl.api.model.f) dVar.data).f20646a.iterator();
        while (it.hasNext()) {
            e next = it.next();
            if (next.f20643a == g.HOURLY_RANK_ENTRANCE.getValue()) {
                b.a().f20661a = next;
            } else if (next.f20643a == g.HOURLY_RANK_LIST.getValue()) {
                b.a().f20662b = next;
            } else if (next.f20643a == g.HOURLY_RANK_BOTTOM.getValue()) {
                b.a().f20663c = next;
            }
        }
    }
}
