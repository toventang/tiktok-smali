package com.ss.android.ugc.aweme.notification.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.b;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.appcontext.d;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.common.a.f;
import com.ss.android.ugc.aweme.inbox.d.j;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.notification.h.a;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

public final class h extends f<BaseNotice> {

    /* renamed from: a  reason: collision with root package name */
    public int f113203a;

    /* renamed from: b  reason: collision with root package name */
    private final HashMap<String, BaseNotice> f113204b = new HashMap<>(this.f113203a);

    /* renamed from: c  reason: collision with root package name */
    private final int f113205c = ((int) n.b(d.a(), 8.0f));

    /* renamed from: d  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.notification.a.f f113206d;

    /* renamed from: e  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.notification.a.f f113207e;

    static {
        Covode.recordClassIndex(72779);
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b(List<BaseNotice> list) {
        if (list != null) {
            list = this.f113206d.a(list);
        }
        super.b(list);
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<BaseNotice> list) {
        if (list != null) {
            list = this.f113206d.a(list);
        }
        super.b_(list);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final int c(int i2) {
        if (((BaseNotice) e().get(i2)).templateNotice != null) {
            return -10000;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewAttachedToWindow(viewHolder);
        if (!(viewHolder instanceof a)) {
            viewHolder = null;
        }
        a aVar = (a) viewHolder;
        if (aVar != null) {
            aVar.bY_();
        }
        j.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a, com.ss.android.ugc.aweme.common.a.h
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        l.d(viewHolder, "");
        super.onViewDetachedFromWindow(viewHolder);
        if (!(viewHolder instanceof a)) {
            viewHolder = null;
        }
        a aVar = (a) viewHolder;
        if (aVar != null) {
            aVar.d();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        l.d(viewGroup, "");
        int c2 = b.c(viewGroup.getContext(), R.color.c5);
        f(c2);
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        Context context = viewGroup.getContext();
        l.b(context, "");
        TuxTextView tuxTextView = new TuxTextView(context, null, 0, 6);
        tuxTextView.setTuxFont(61);
        tuxTextView.setGravity(17);
        tuxTextView.setTextColor(c2);
        tuxTextView.setText(R.string.cfo);
        Context context2 = viewGroup.getContext();
        l.b(context2, "");
        TuxTextView tuxTextView2 = new TuxTextView(context2, null, 0, 6);
        tuxTextView2.setTuxFont(61);
        tuxTextView2.setGravity(17);
        tuxTextView2.setTextColor(c2);
        tuxTextView2.setText(R.string.cgj);
        View view = a_.itemView;
        Objects.requireNonNull(view, "null cannot be cast to non-null type com.bytedance.ies.dmt.ui.widget.DmtStatusView");
        DmtStatusView dmtStatusView = (DmtStatusView) view;
        dmtStatusView.setBuilder(dmtStatusView.c().b(tuxTextView2));
        l.b(a_, "");
        return a_;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        if (i2 != -10000) {
            com.ss.android.ugc.aweme.notification.a.f fVar = this.f113206d;
            if (viewGroup == null) {
                l.b();
            }
            return fVar.a(viewGroup);
        }
        com.ss.android.ugc.aweme.notification.a.f fVar2 = this.f113207e;
        if (viewGroup == null) {
            l.b();
        }
        return fVar2.a(viewGroup);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        BaseNotice baseNotice = (BaseNotice) this.f76354l.get(i2);
        int i3 = 0;
        if (i2 <= this.f113203a - 1) {
            this.f113204b.get(baseNotice.nid);
        }
        if (viewHolder != null) {
            View view = viewHolder.itemView;
            l.b(view, "");
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i4 = marginLayoutParams.leftMargin;
            if (i2 == 0) {
                i3 = this.f113205c;
            }
            marginLayoutParams.setMargins(i4, i3, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
        if (c(i2) != -10000) {
            com.ss.android.ugc.aweme.notification.a.f fVar = this.f113206d;
            if (viewHolder == null) {
                l.b();
            }
            l.b(baseNotice, "");
            fVar.a(viewHolder, baseNotice, i2, this.f113204b);
            return;
        }
        com.ss.android.ugc.aweme.notification.a.f fVar2 = this.f113207e;
        if (viewHolder == null) {
            l.b();
        }
        l.b(baseNotice, "");
        fVar2.a(viewHolder, baseNotice, i2, this.f113204b);
    }

    public h(com.ss.android.ugc.aweme.notification.a.f fVar, com.ss.android.ugc.aweme.notification.a.f fVar2, int i2) {
        l.d(fVar, "");
        l.d(fVar2, "");
        this.f113206d = fVar;
        this.f113207e = fVar2;
        this.f113203a = i2;
    }
}
