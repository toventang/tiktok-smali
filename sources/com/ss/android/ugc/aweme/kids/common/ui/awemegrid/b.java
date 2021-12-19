package com.ss.android.ugc.aweme.kids.common.ui.awemegrid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.common.a.d;
import com.ss.android.ugc.aweme.common.a.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.kids.common.ui.a.c;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class b extends d {

    /* renamed from: d  reason: collision with root package name */
    public View f105939d;

    /* renamed from: e  reason: collision with root package name */
    private RecyclerView.ViewHolder f105940e;

    /* renamed from: f  reason: collision with root package name */
    private h.a f105941f;

    /* renamed from: g  reason: collision with root package name */
    private final String f105942g;

    /* renamed from: h  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.kids.common.ui.a.d f105943h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f105944i;

    static {
        Covode.recordClassIndex(67794);
    }

    @Override // com.ss.android.ugc.aweme.common.a.h
    public final void a(h.a aVar) {
        super.a(aVar);
        this.f105941f = aVar;
    }

    public static final class a extends RecyclerView.ViewHolder {
        static {
            Covode.recordClassIndex(67795);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(View view) {
            super(view);
            l.d(view, "");
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.f
    public final void b_(List<? extends Aweme> list) {
        if (list != null) {
            this.f76354l = list;
            notifyDataSetChanged();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final RecyclerView.ViewHolder a_(ViewGroup viewGroup) {
        MethodCollector.i(7453);
        l.d(viewGroup, "");
        if (this.f105939d != null) {
            if (this.f105940e == null) {
                View view = this.f105939d;
                if (view == null) {
                    l.b();
                }
                View a2 = com.a.a(LayoutInflater.from(view.getContext()), R.layout.abz, null, false);
                l.b(a2, "");
                FrameLayout frameLayout = (FrameLayout) a2.findViewById(R.id.c3l);
                if (frameLayout != null) {
                    frameLayout.addView(view);
                }
                a2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                this.f105940e = new a(a2);
            }
            RecyclerView.ViewHolder viewHolder = this.f105940e;
            MethodCollector.o(7453);
            return viewHolder;
        }
        RecyclerView.ViewHolder a_ = super.a_(viewGroup);
        MethodCollector.o(7453);
        return a_;
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.common.a.h
    public final void a(RecyclerView.ViewHolder viewHolder) {
        if (this.f105939d == null || !(viewHolder instanceof a)) {
            super.a(viewHolder);
            return;
        }
        h.b bVar = this.u;
        l.b(bVar, "");
        int i2 = bVar.f76366b;
        if (i2 == 0) {
            a aVar = (a) viewHolder;
            View view = aVar.itemView;
            l.b(view, "");
            ((TuxStatusView) view.findViewById(R.id.c3m)).a();
            View view2 = aVar.itemView;
            l.b(view2, "");
            TuxStatusView tuxStatusView = (TuxStatusView) view2.findViewById(R.id.c3m);
            l.b(tuxStatusView, "");
            tuxStatusView.setVisibility(0);
            View view3 = aVar.itemView;
            l.b(view3, "");
            FrameLayout frameLayout = (FrameLayout) view3.findViewById(R.id.c3l);
            l.b(frameLayout, "");
            frameLayout.setVisibility(8);
            aVar.itemView.invalidate();
        } else if (i2 != 1) {
            a aVar2 = (a) viewHolder;
            View view4 = aVar2.itemView;
            l.b(view4, "");
            TuxStatusView tuxStatusView2 = (TuxStatusView) view4.findViewById(R.id.c3m);
            l.b(tuxStatusView2, "");
            tuxStatusView2.setVisibility(8);
            View view5 = aVar2.itemView;
            l.b(view5, "");
            FrameLayout frameLayout2 = (FrameLayout) view5.findViewById(R.id.c3l);
            l.b(frameLayout2, "");
            frameLayout2.setVisibility(8);
            aVar2.itemView.invalidate();
            h.a aVar3 = this.f105941f;
            if (aVar3 != null) {
                aVar3.l();
            }
        } else {
            a aVar4 = (a) viewHolder;
            View view6 = aVar4.itemView;
            l.b(view6, "");
            ((TuxStatusView) view6.findViewById(R.id.c3m)).setStatus(com.ss.android.ugc.aweme.tux.a.g.a.b(new TuxStatusView.c()));
            View view7 = aVar4.itemView;
            l.b(view7, "");
            TuxStatusView tuxStatusView3 = (TuxStatusView) view7.findViewById(R.id.c3m);
            l.b(tuxStatusView3, "");
            tuxStatusView3.setVisibility(8);
            View view8 = aVar4.itemView;
            l.b(view8, "");
            FrameLayout frameLayout3 = (FrameLayout) view8.findViewById(R.id.c3l);
            l.b(frameLayout3, "");
            frameLayout3.setVisibility(0);
            aVar4.itemView.invalidate();
        }
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final RecyclerView.ViewHolder a(ViewGroup viewGroup, int i2) {
        l.d(viewGroup, "");
        return c.a.a(viewGroup, this.f105942g, this.f105943h, this.f105944i);
    }

    @Override // com.ss.android.ugc.aweme.common.a.l, com.ss.android.ugc.aweme.base.widget.g
    public final void a(RecyclerView.ViewHolder viewHolder, int i2) {
        l.d(viewHolder, "");
        if (viewHolder instanceof c) {
            Aweme aweme = null;
            if (this.f76354l != null && i2 >= 0) {
                List list = this.f76354l;
                if (list == null) {
                    l.b();
                }
                if (i2 < list.size()) {
                    List list2 = this.f76354l;
                    if (list2 == null) {
                        l.b();
                    }
                    aweme = (Aweme) list2.get(i2);
                }
            }
            c cVar = (c) viewHolder;
            cVar.a(aweme);
            cVar.p = true;
        }
    }

    public b(String str, com.ss.android.ugc.aweme.kids.common.ui.a.d dVar, boolean z) {
        l.d(str, "");
        l.d(dVar, "");
        this.f105942g = str;
        this.f105943h = dVar;
        this.f105944i = z;
    }
}
