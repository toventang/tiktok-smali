package com.ss.android.ugc.aweme.effect.a;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.tools.utils.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class a<VH extends RecyclerView.ViewHolder> extends RecyclerView.a<VH> {

    /* renamed from: a  reason: collision with root package name */
    private List<Integer> f88772a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final RecyclerView f88773b;

    /* renamed from: c  reason: collision with root package name */
    public List<EffectModel> f88774c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.effect.b.a f88775d;

    static {
        Covode.recordClassIndex(55845);
    }

    private final void a() {
        this.f88772a.clear();
        Iterator<T> it = this.f88774c.iterator();
        while (it.hasNext()) {
            this.f88772a.add(Integer.valueOf(a((EffectModel) it.next())));
        }
    }

    /* access modifiers changed from: protected */
    public final int a(int i2) {
        return this.f88772a.get(i2).intValue();
    }

    public final void a(List<? extends EffectModel> list) {
        if (list != null) {
            this.f88774c.clear();
            this.f88774c.addAll(list);
            a();
            notifyDataSetChanged();
        }
    }

    private final int a(EffectModel effectModel) {
        if (i.a(effectModel.resDir)) {
            return 16;
        }
        com.ss.android.ugc.aweme.effect.b.a aVar = this.f88775d;
        if (aVar != null && aVar.a(effectModel)) {
            return 8;
        }
        com.ss.android.ugc.aweme.effect.b.a aVar2 = this.f88775d;
        if (aVar2 == null || !aVar2.b(effectModel)) {
            return 2;
        }
        return 8;
    }

    public a(RecyclerView recyclerView, com.ss.android.ugc.aweme.effect.b.a aVar) {
        this.f88773b = recyclerView;
        this.f88775d = aVar;
    }

    public final void a(int i2, int i3) {
        if (this.f88772a.size() > i2 && this.f88772a.get(i2).intValue() != i3) {
            this.f88772a.set(i2, Integer.valueOf(i3));
            notifyItemChanged(i2);
        }
    }
}
