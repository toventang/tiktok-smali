package com.ss.android.ugc.aweme.comment.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.jedi.arch.ext.list.a.e;
import com.bytedance.jedi.arch.g;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.arch.e;
import com.ss.android.ugc.aweme.comment.model.GifEmoji;
import com.ss.android.ugc.aweme.comment.util.m;
import com.zhiliaoapp.musically.R;
import h.f.b.l;

public final class ab extends e<GifEmoji> {

    /* renamed from: d  reason: collision with root package name */
    private final ae f71332d;

    static {
        Covode.recordClassIndex(43916);
    }

    @Override // com.ss.android.ugc.aweme.base.arch.e
    public final JediViewHolder<? extends g, GifEmoji> a(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        return new SearchGifViewHolder(viewGroup, this.f71332d);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        Context context;
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        if (!(viewGroup == null || (context = viewGroup.getContext()) == null)) {
            View view = a_.itemView;
            if (!(view instanceof DmtStatusView)) {
                view = null;
            }
            DmtStatusView dmtStatusView = (DmtStatusView) view;
            if (dmtStatusView != null) {
                dmtStatusView.setLayoutParams(new RecyclerView.j(-2, -1));
                TuxTextView a2 = m.a(context);
                a2.setTextColorRes(R.attr.bg);
                a2.setText(R.string.bn8);
                TuxTextView a3 = m.a(context);
                a3.setTextColorRes(R.attr.bg);
                a3.setText(R.string.b40);
                dmtStatusView.setBuilder(DmtStatusView.a.a(context).b(a3).c(a2));
            }
        }
        l.b(a_, "");
        return a_;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private ab(androidx.lifecycle.m mVar, ae aeVar) {
        super(mVar, new ac(), (e.b) null);
        l.d(mVar, "");
        l.d(aeVar, "");
        this.f71332d = aeVar;
    }

    public /* synthetic */ ab(androidx.lifecycle.m mVar, ae aeVar, byte b2) {
        this(mVar, aeVar);
    }
}
