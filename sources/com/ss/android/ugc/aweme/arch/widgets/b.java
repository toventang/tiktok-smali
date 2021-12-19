package com.ss.android.ugc.aweme.arch.widgets;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.arch.widgets.base.e;
import com.ss.android.ugc.aweme.common.a.f;
import java.util.ArrayList;

public abstract class b extends f {

    /* renamed from: a  reason: collision with root package name */
    protected e f66992a;

    /* renamed from: b  reason: collision with root package name */
    protected DataCenter f66993b;

    /* renamed from: c  reason: collision with root package name */
    protected RecyclerView f66994c;

    /* renamed from: d  reason: collision with root package name */
    private ArrayList<ListItemWidget> f66995d = new ArrayList<>();

    static {
        Covode.recordClassIndex(41294);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        return null;
    }

    /* access modifiers changed from: protected */
    public abstract ListItemWidget b(int i2);

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f66994c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f66994c = null;
    }

    /* access modifiers changed from: protected */
    public final ListItemWidget a(int i2) {
        if (i2 < this.f66995d.size()) {
            return this.f66995d.get(i2);
        }
        ListItemWidget b2 = b(i2);
        this.f66992a.a(b2);
        this.f66995d.add(b2);
        return b2;
    }

    public b(e eVar, DataCenter dataCenter) {
        this.f66992a = eVar;
        this.f66993b = dataCenter;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        if (viewHolder instanceof a) {
            a aVar = (a) viewHolder;
            ListItemWidget listItemWidget = aVar.f66991a;
            if (!(listItemWidget == null || listItemWidget.f66990a == null || listItemWidget.f66990a.getLayoutPosition() != i2)) {
                listItemWidget.f66990a = null;
            }
            aVar.f66991a = a(i2);
            aVar.f66991a.a(aVar);
        }
    }
}
