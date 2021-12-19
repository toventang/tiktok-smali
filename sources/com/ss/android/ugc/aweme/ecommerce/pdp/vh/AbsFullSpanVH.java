package com.ss.android.ugc.aweme.ecommerce.pdp.vh;

import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.pdp.view.compat.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public abstract class AbsFullSpanVH<ITEM> extends JediSimpleViewHolder<ITEM> implements au {
    static {
        Covode.recordClassIndex(54288);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public final void i() {
        super.i();
        a((i) null);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediViewHolder
    public void e() {
        super.e();
        View view = this.itemView;
        l.b(view, "");
        a.C2089a.a(view, true);
    }

    public final void m() {
        View view = this.itemView;
        l.b(view, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof StaggeredGridLayoutManager.b)) {
            layoutParams = null;
        }
        StaggeredGridLayoutManager.b bVar = (StaggeredGridLayoutManager.b) layoutParams;
        if (bVar != null) {
            bVar.f3934b = true;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AbsFullSpanVH(View view) {
        super(view);
        l.d(view, "");
    }

    public final void a(i iVar) {
        this.itemView.setTag(R.id.abh, iVar);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final void a(ITEM item, int i2, List<Object> list) {
        System.currentTimeMillis();
        super.a(item, i2, list);
    }
}
