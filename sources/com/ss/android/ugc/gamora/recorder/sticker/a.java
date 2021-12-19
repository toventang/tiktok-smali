package com.ss.android.ugc.gamora.recorder.sticker;

import android.content.Context;
import android.view.View;
import androidx.appcompat.app.d;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.shortvideo.sticker.c;
import com.ss.android.ugc.aweme.sticker.panel.l;
import com.ss.android.ugc.aweme.sticker.presenter.handler.b;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.b;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.tools.utils.r;
import com.zhiliaoapp.musically.R;
import java.util.Map;

public final class a extends b implements l {

    /* renamed from: a  reason: collision with root package name */
    public com.bytedance.ies.dmt.ui.tooltip.a f148283a;

    /* renamed from: b  reason: collision with root package name */
    private Effect f148284b;

    /* renamed from: c  reason: collision with root package name */
    private View f148285c;

    /* renamed from: d  reason: collision with root package name */
    private final d f148286d;

    /* renamed from: e  reason: collision with root package name */
    private final h.f.a.a<Boolean> f148287e;

    static {
        Covode.recordClassIndex(97727);
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a() {
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(l.a aVar) {
        h.f.b.l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void b(l.a aVar) {
        h.f.b.l.d(aVar, "");
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void cw_() {
        com.bytedance.ies.dmt.ui.tooltip.a aVar;
        com.bytedance.ies.dmt.ui.tooltip.a aVar2 = this.f148283a;
        if (aVar2 != null && aVar2.isShowing() && (aVar = this.f148283a) != null) {
            aVar.dismiss();
        }
    }

    @Override // com.ss.android.ugc.aweme.sticker.panel.l
    public final void a(View view) {
        h.f.b.l.d(view, "");
        this.f148285c = view;
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.sticker.a$a  reason: collision with other inner class name */
    static final class View$OnClickListenerC3998a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f148288a;

        static {
            Covode.recordClassIndex(97728);
        }

        View$OnClickListenerC3998a(a aVar) {
            this.f148288a = aVar;
        }

        public final void onClick(View view) {
            com.bytedance.ies.dmt.ui.tooltip.a aVar;
            ClickAgent.onClick(view);
            com.bytedance.ies.dmt.ui.tooltip.a aVar2 = this.f148288a.f148283a;
            if (aVar2 != null && aVar2.isShowing() && (aVar = this.f148288a.f148283a) != null) {
                aVar.dismiss();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x007b, code lost:
        if (h.f.b.l.a((java.lang.Object) r1, (java.lang.Object) r0) != false) goto L_0x000f;
     */
    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a r6) {
        /*
        // Method dump skipped, instructions count: 140
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.gamora.recorder.sticker.a.a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.a):boolean");
    }

    public a(d dVar, h.f.a.a<Boolean> aVar) {
        h.f.b.l.d(dVar, "");
        h.f.b.l.d(aVar, "");
        this.f148286d = dVar;
        this.f148287e = aVar;
    }

    @Override // com.ss.android.ugc.aweme.sticker.presenter.handler.b
    public final void a(com.ss.android.ugc.aweme.sticker.presenter.handler.c.b bVar, com.ss.android.ugc.aweme.sticker.presenter.handler.c.a aVar) {
        int i2;
        ViewPager viewPager;
        PagerAdapter pagerAdapter;
        Map<Integer, com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.d<Fragment>> map;
        com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.d<Fragment> dVar;
        View view;
        RecyclerView recyclerView;
        RecyclerView.i layoutManager;
        View c2;
        float f2;
        h.f.b.l.d(bVar, "");
        h.f.b.l.d(aVar, "");
        Effect effect = aVar.f135378a;
        this.f148284b = effect;
        if (c.a(effect)) {
            i2 = R.string.dat;
        } else {
            i2 = R.string.dau;
        }
        View view2 = this.f148285c;
        if (view2 != null) {
            viewPager = (ViewPager) view2.findViewById(R.id.fkd);
            if (viewPager != null) {
                pagerAdapter = viewPager.getAdapter();
            }
            pagerAdapter = null;
        } else {
            viewPager = null;
            pagerAdapter = null;
        }
        if (!(pagerAdapter instanceof b.a)) {
            pagerAdapter = null;
        }
        b.a aVar2 = (b.a) pagerAdapter;
        if (aVar2 != null && (map = aVar2.f136393b) != null && (dVar = map.get(Integer.valueOf(viewPager.getCurrentItem()))) != null && (view = dVar.l().getView()) != null && (recyclerView = (RecyclerView) view.findViewById(R.id.eb9)) != null && (layoutManager = recyclerView.getLayoutManager()) != null && (c2 = layoutManager.c(aVar.f135379b)) != null) {
            h.f.b.l.b(c2, "");
            if (aVar.f135379b % 5 == 1 || aVar.f135379b % 5 == 2) {
                f2 = r.a(this.f148286d, 12.0f);
            } else {
                f2 = r.a(this.f148286d, 22.0f);
            }
            Context context = c2.getContext();
            h.f.b.l.b(context, "");
            com.bytedance.ies.dmt.ui.tooltip.b a2 = new com.bytedance.ies.dmt.ui.tooltip.b(context).b(48).a(c2).a(3000L).a(i2);
            a2.f33543a.f33557l = (int) f2;
            com.bytedance.ies.dmt.ui.tooltip.a a3 = a2.a(new View$OnClickListenerC3998a(this)).a();
            this.f148283a = a3;
            if (a3 != null) {
                a3.a();
            }
        }
    }
}
