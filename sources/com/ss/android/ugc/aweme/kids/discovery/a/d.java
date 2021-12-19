package com.ss.android.ugc.aweme.kids.discovery.a;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import h.f.b.l;

public final class d extends a {

    /* renamed from: b  reason: collision with root package name */
    public final e f106399b;

    static {
        Covode.recordClassIndex(67993);
    }

    public d(e eVar) {
        l.d(eVar, "");
        this.f106399b = eVar;
    }

    @Override // com.ss.android.ugc.aweme.kids.discovery.a.a, com.ss.android.ugc.aweme.kids.discovery.a.e.b
    public final void a(int i2) {
        super.a(i2);
        if (i2 == 2) {
            DmtStatusView dmtStatusView = this.f106377a;
            if (dmtStatusView != null) {
                dmtStatusView.setVisibility(8);
            }
            e eVar = this.f106399b;
            DmtStatusView dmtStatusView2 = this.f106377a;
            if (dmtStatusView2 != null) {
                int i3 = 0;
                for (g gVar : eVar.f106388b) {
                    if (!l.a(gVar.itemView, dmtStatusView2)) {
                        i3++;
                    } else if (i3 >= 0 && i3 < eVar.f106388b.size()) {
                        g remove = eVar.f106388b.remove(i3);
                        l.b(remove, "");
                        g gVar2 = remove;
                        eVar.f106389c.b(gVar2.f106416a);
                        gVar2.setIsRecyclable(false);
                        eVar.f106390d.f106419b.addLast(Integer.valueOf(gVar2.f106416a));
                        eVar.notifyItemRemoved(i3);
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }
}
