package com.ss.android.ugc.aweme;

import com.bytedance.covode.number.Covode;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.f;
import com.ss.android.ugc.aweme.cell.BasicTuxCell;
import com.ss.android.ugc.aweme.cell.ButtonCell;
import com.ss.android.ugc.aweme.cell.DisclosureCell;
import com.ss.android.ugc.aweme.cell.DividerCell;
import com.ss.android.ugc.aweme.cell.LabelCell;
import com.ss.android.ugc.aweme.cell.RadioCell;
import com.ss.android.ugc.aweme.cell.SwitchCell;
import com.ss.android.ugc.aweme.dc.a;
import h.a.n;
import h.f.b.l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class dm {

    /* renamed from: a  reason: collision with root package name */
    public final PowerList f82878a;

    /* renamed from: b  reason: collision with root package name */
    private final List<a<?>> f82879b = new ArrayList();

    static {
        Covode.recordClassIndex(51641);
    }

    public final List<a<?>> a() {
        return n.k(this.f82879b);
    }

    public dm(PowerList powerList) {
        l.d(powerList, "");
        this.f82878a = powerList;
        powerList.a(DividerCell.class, BasicTuxCell.class, SwitchCell.class, ButtonCell.class, RadioCell.class, LabelCell.class, DisclosureCell.class);
    }

    public final void a(a<?> aVar) {
        l.d(aVar, "");
        List<a<?>> list = this.f82879b;
        f<com.bytedance.ies.powerlist.b.a> state = this.f82878a.getState();
        l.b(state, "");
        aVar.a(state);
        list.add(aVar);
        this.f82878a.getState().a(aVar.d());
    }

    public final void a(int i2, List<? extends a<?>> list) {
        l.d(list, "");
        List<a<?>> list2 = this.f82879b;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            f<com.bytedance.ies.powerlist.b.a> state = this.f82878a.getState();
            l.b(state, "");
            it.next().a(state);
        }
        list2.addAll(list);
        f<com.bytedance.ies.powerlist.b.a> state2 = this.f82878a.getState();
        ArrayList arrayList = new ArrayList(n.a((Iterable) list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().d());
        }
        state2.a(i2, arrayList);
    }
}
