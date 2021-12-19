package com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder;

import android.view.View;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.address.a.a;
import h.f.b.l;
import java.util.Objects;

public final class DescItemViewHolder extends JediSimpleViewHolder<a> implements au {
    static {
        Covode.recordClassIndex(52707);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DescItemViewHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558939(0x7f0d021b, float:1.8743208E38)
            r0 = 0
            android.view.View r0 = com.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.address.edit.viewholder.DescItemViewHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(a aVar) {
        a aVar2 = aVar;
        l.d(aVar2, "");
        View view = this.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.tux.input.TuxTextView");
        ((TuxTextView) view).setText(aVar2.f84261a.f84313g);
    }
}
