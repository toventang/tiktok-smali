package com.ss.android.ugc.aweme.discover.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.a;
import com.bytedance.covode.number.Covode;
import com.bytedance.lighten.a.r;
import com.bytedance.lighten.a.v;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.discover.adapter.viewholder.b;
import com.ss.android.ugc.aweme.discover.model.SearchEffect;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;
import java.util.Objects;

public final class y extends f<SearchEffect> {

    /* renamed from: a  reason: collision with root package name */
    private boolean f80685a = true;

    static {
        Covode.recordClassIndex(50183);
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<SearchEffect> list) {
        super.b_(list);
        ai_();
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final int c_(View view) {
        if (this.f80685a) {
            return super.c_(view);
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        Context context;
        if (viewGroup != null) {
            context = viewGroup.getContext();
        } else {
            context = null;
        }
        View a2 = a.a(LayoutInflater.from(context), R.layout.avf, viewGroup, false);
        l.b(a2, "");
        return new b(a2);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        Objects.requireNonNull(viewHolder, "null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.adapter.viewholder.SearchEffectViewHolder");
        b bVar = (b) viewHolder;
        Object obj = this.f76354l.get(i2);
        l.b(obj, "");
        SearchEffect searchEffect = (SearchEffect) obj;
        l.d(searchEffect, "");
        bVar.f80630a.setText(searchEffect.name());
        if (((long) searchEffect.useCount()) < 0) {
            bVar.f80631b.setVisibility(8);
        } else {
            String a2 = com.ss.android.ugc.aweme.i18n.b.a((long) searchEffect.useCount());
            View view = bVar.itemView;
            l.b(view, "");
            Context context = view.getContext();
            l.b(context, "");
            String quantityString = context.getResources().getQuantityString(R.plurals.hu, searchEffect.useCount(), a2);
            l.b(quantityString, "");
            bVar.f80631b.setText(quantityString);
        }
        if (TextUtils.isEmpty(searchEffect.hint())) {
            bVar.f80632c.setVisibility(8);
        } else {
            bVar.f80632c.setText(searchEffect.hint());
        }
        UrlModel icon = searchEffect.icon();
        if (icon != null) {
            v a3 = r.a(com.ss.android.ugc.aweme.base.v.a(icon));
            a3.E = bVar.f80633d;
            a3.c();
        }
        bVar.itemView.setOnClickListener(new b.View$OnClickListenerC1880b(bVar, searchEffect));
        bVar.f80634e.setOnClickListener(new b.c(bVar, searchEffect));
    }
}
