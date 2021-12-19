package com.ss.android.ugc.aweme.ecommerce.delivery.vh;

import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.i;
import androidx.lifecycle.m;
import com.bytedance.covode.number.Covode;
import com.bytedance.jedi.ext.adapter.JediSimpleViewHolder;
import com.bytedance.lighten.a.a.a;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.bytedance.lighten.a.w;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.au;
import com.ss.android.ugc.aweme.ecommerce.api.model.Image;
import com.ss.android.ugc.aweme.ecommerce.delivery.repo.dto.c;
import com.ss.android.ugc.aweme.ecommerce.ordercenter.repository.dto.Icon;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ShipFromBarHolder extends JediSimpleViewHolder<c> implements au {
    static {
        Covode.recordClassIndex(53791);
    }

    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder, com.bytedance.jedi.ext.adapter.JediViewHolder, androidx.lifecycle.k
    public final void onStateChanged(m mVar, i.a aVar) {
        super.onStateChanged(mVar, aVar);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShipFromBarHolder(android.view.ViewGroup r5) {
        /*
            r4 = this;
            java.lang.String r3 = ""
            h.f.b.l.d(r5, r3)
            android.content.Context r0 = r5.getContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r0)
            r1 = 2131558960(0x7f0d0230, float:1.874325E38)
            r0 = 0
            android.view.View r0 = com.a.a(r2, r1, r5, r0)
            h.f.b.l.b(r0, r3)
            r4.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ecommerce.delivery.vh.ShipFromBarHolder.<init>(android.view.ViewGroup):void");
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.bytedance.jedi.ext.adapter.JediSimpleViewHolder
    public final /* synthetic */ void a(c cVar) {
        Image icon;
        a thumbFirstImageUrlModel;
        c cVar2 = cVar;
        l.d(cVar2, "");
        Icon icon2 = cVar2.f85921a;
        if (!(icon2 == null || (icon = icon2.getIcon()) == null || (thumbFirstImageUrlModel = icon.toThumbFirstImageUrlModel()) == null)) {
            v a2 = r.a(thumbFirstImageUrlModel);
            a2.f39916l = R.drawable.z2;
            a2.v = w.FIT_XY;
            View view = this.itemView;
            l.b(view, "");
            a2.F = (ImageView) view.findViewById(R.id.bi7);
            a2.c();
        }
        View view2 = this.itemView;
        l.b(view2, "");
        TuxTextView tuxTextView = (TuxTextView) view2.findViewById(R.id.title);
        l.b(tuxTextView, "");
        tuxTextView.setText(cVar2.f85922b);
        View view3 = this.itemView;
        l.b(view3, "");
        TuxTextView tuxTextView2 = (TuxTextView) view3.findViewById(R.id.text);
        l.b(tuxTextView2, "");
        tuxTextView2.setText(cVar2.f85923c);
    }
}
