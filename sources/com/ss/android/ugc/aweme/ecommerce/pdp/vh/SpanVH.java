package com.ss.android.ugc.aweme.ecommerce.pdp.vh;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import h.f.b.l;

public final class SpanVH extends AbsFullSpanVH<h> implements au {
    static {
        Covode.recordClassIndex(54336);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.pdp.vh.AbsFullSpanVH, com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SpanVH(ViewGroup viewGroup) {
        super(new View(viewGroup.getContext()));
        l.d(viewGroup, "");
        MethodCollector.i(4819);
        MethodCollector.o(4819);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(Object obj) {
        h hVar = (h) obj;
        l.d(hVar, "");
        View view = this.itemView;
        l.b(view, "");
        RecyclerView.j jVar = new RecyclerView.j(-1, (int) n.b(view.getContext(), hVar.f86783a));
        jVar.leftMargin = hVar.f86785c;
        jVar.rightMargin = hVar.f86785c;
        View view2 = this.itemView;
        l.b(view2, "");
        view2.setLayoutParams(jVar);
        this.itemView.setPadding(hVar.f86785c, 0, hVar.f86785c, 0);
        this.itemView.setBackgroundColor(hVar.f86786d);
        View view3 = this.itemView;
        l.b(view3, "");
        a.C2089a.a(view3, hVar.f86784b);
    }
}
