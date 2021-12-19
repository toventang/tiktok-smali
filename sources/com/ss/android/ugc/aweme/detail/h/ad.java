package com.ss.android.ugc.aweme.detail.h;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.e;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.comment.CommentServiceImpl;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.story.Story;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.story.api.IStoryViewerListViewModel;
import com.ss.android.ugc.aweme.story.g;
import com.ss.android.ugc.aweme.story.model.i;
import com.ss.android.ugc.aweme.utils.y;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.p;
import java.util.List;
import java.util.Map;

public final class ad extends af {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79665a = new a((byte) 0);
    private View F;
    private View G;
    private TuxTextView H;
    private View bx;
    private TuxTextView by;
    private View bz;

    static {
        Covode.recordClassIndex(49499);
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void b(Aweme aweme) {
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void m() {
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49500);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.af
    public final void o() {
        TuxTextView tuxTextView = this.by;
        if (tuxTextView != null) {
            tuxTextView.setText(af());
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.detail.h.b
    public final void H() {
        super.H();
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        ab();
    }

    @Override // com.ss.android.ugc.aweme.detail.h.af
    public final void ab() {
        if (ac.h(bL()) || com.ss.android.ugc.aweme.story.d.a.h(bL())) {
            bZ();
        } else {
            ca();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.al, com.ss.android.ugc.aweme.feed.q.a
    public final void ax_() {
        super.ax_();
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        ab();
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void T() {
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        if (this.bv != null) {
            Activity activity = this.bv;
            l.b(activity, "");
            if (!activity.isFinishing() && az_() != null && bL() != null) {
                ab();
            }
        }
    }

    private final com.ss.android.ugc.aweme.comment.e.a bX() {
        if (az_() == null) {
            return null;
        }
        Fragment az_ = az_();
        l.b(az_, "");
        if (!az_.isAdded()) {
            return null;
        }
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        CommentService e2 = CommentServiceImpl.e();
        Fragment az_2 = az_();
        l.b(az_2, "");
        View view = az_2.getView();
        Fragment az_3 = az_();
        l.b(az_3, "");
        return e2.b(view, az_3.getChildFragmentManager(), a_(true), this, this);
    }

    private final void bY() {
        long j2;
        e activity;
        Map<String, i> map;
        i iVar;
        String aid;
        Story story;
        Aweme bL = bL();
        long j3 = 0;
        if (bL == null || (story = bL.getStory()) == null) {
            j2 = 0;
        } else {
            j2 = story.getViewerCount();
        }
        Fragment az_ = az_();
        if (!(az_ == null || (activity = az_.getActivity()) == null)) {
            g gVar = g.f137757a;
            String str = "";
            l.b(activity, str);
            IStoryViewerListViewModel a2 = gVar.a(activity, activity);
            Aweme bL2 = bL();
            if (!(bL2 == null || (aid = bL2.getAid()) == null)) {
                str = aid;
            }
            if (!(a2 == null || (map = a2.f136725c) == null || (iVar = map.get(str)) == null)) {
                j2 = (long) iVar.getTotal();
            }
        }
        if (j2 >= 0) {
            j3 = j2;
        }
        String a3 = a(j3);
        TuxTextView tuxTextView = this.H;
        if (tuxTextView != null) {
            tuxTextView.setText(a3);
        }
    }

    private final void ca() {
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        if (y.f(bL())) {
            View view = this.F;
            if (!(view == null || view.getVisibility() == 8)) {
                view.setVisibility(8);
            }
            com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
            if (aVar != null) {
                aVar.a(false);
                return;
            }
            return;
        }
        View view2 = this.F;
        if (!(view2 == null || view2.getVisibility() == 8)) {
            view2.setVisibility(8);
        }
        this.f79701m = bX();
        boolean f2 = com.ss.android.ugc.aweme.story.d.a.f(bL());
        boolean e2 = com.ss.android.ugc.aweme.story.d.a.e(bL());
        if (f2 || e2) {
            com.ss.android.ugc.aweme.comment.e.a aVar2 = this.f79701m;
            if (aVar2 != null) {
                aVar2.a(false);
                return;
            }
            return;
        }
        com.ss.android.ugc.aweme.comment.e.a aVar3 = this.f79701m;
        if (aVar3 != null) {
            aVar3.a(true);
        }
        com.ss.android.ugc.aweme.comment.e.a aVar4 = this.f79701m;
        if (aVar4 != null) {
            aVar4.a();
        }
        com.ss.android.ugc.aweme.comment.e.a aVar5 = this.f79701m;
        if (aVar5 != null) {
            aVar5.k();
        }
    }

    private final void bZ() {
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        if (y.f(bL())) {
            View view = this.F;
            if (!(view == null || view.getVisibility() == 8)) {
                view.setVisibility(8);
            }
            com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
            if (aVar != null) {
                aVar.a(false);
                return;
            }
            return;
        }
        View view2 = this.F;
        if (!(view2 == null || view2.getVisibility() == 0)) {
            view2.setVisibility(0);
        }
        com.ss.android.ugc.aweme.comment.e.a aVar2 = this.f79701m;
        if (aVar2 != null) {
            aVar2.a(false);
        }
        if (com.ss.android.ugc.aweme.story.d.a.h(bL())) {
            View view3 = this.G;
            if (!(view3 == null || view3.getVisibility() == 4)) {
                view3.setVisibility(4);
            }
            View view4 = this.bx;
            if (view4 != null && view4.getVisibility() != 4) {
                view4.setVisibility(4);
            }
        } else if (ad() || (com.ss.android.ugc.aweme.story.d.a.j(bL()) && !com.ss.android.ugc.aweme.story.d.a.k(bL()))) {
            View view5 = this.G;
            if (!(view5 == null || view5.getVisibility() == 8)) {
                view5.setVisibility(8);
            }
            View view6 = this.bx;
            if (!(view6 == null || view6.getVisibility() == 0)) {
                view6.setVisibility(0);
            }
            o();
        } else {
            View view7 = this.G;
            if (!(view7 == null || view7.getVisibility() == 0)) {
                view7.setVisibility(0);
            }
            View view8 = this.bx;
            if (!(view8 == null || view8.getVisibility() == 0)) {
                view8.setVisibility(0);
            }
            o();
            bY();
        }
    }

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.detail.h.af, com.ss.android.ugc.aweme.detail.h.b
    public final void p() {
        MethodCollector.i(6008);
        super.p();
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        if (this.bv == null) {
            MethodCollector.o(6008);
            return;
        }
        Activity activity = this.bv;
        l.b(activity, "");
        if (!activity.isFinishing()) {
            if (az_() == null) {
                MethodCollector.o(6008);
                return;
            }
            if (this.F == null) {
                Aweme bL3 = bL();
                if (bL3 != null) {
                    bL3.getAid();
                }
                Aweme bL4 = bL();
                if (bL4 != null) {
                    Integer.valueOf(bL4.getAwemeType());
                }
                Fragment az_ = az_();
                l.b(az_, "");
                ViewGroup viewGroup = (ViewGroup) az_.getView();
                View view = null;
                if (viewGroup instanceof FrameLayout) {
                    view = com.a.a(LayoutInflater.from(this.bv), R.layout.wu, viewGroup, false);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams.gravity = 80;
                    View findViewById = view.findViewById(R.id.ceq);
                    this.bx = findViewById;
                    if (findViewById != null) {
                        findViewById.setOnClickListener(new b(this));
                    }
                    this.by = (TuxTextView) view.findViewById(R.id.etr);
                    o();
                    View findViewById2 = view.findViewById(R.id.ch3);
                    this.G = findViewById2;
                    if (findViewById2 != null) {
                        findViewById2.setOnClickListener(new c(this));
                    }
                    this.H = (TuxTextView) view.findViewById(R.id.etw);
                    bY();
                    if (ad() || (com.ss.android.ugc.aweme.story.d.a.j(bL()) && !com.ss.android.ugc.aweme.story.d.a.k(bL()))) {
                        View view2 = this.G;
                        if (!(view2 == null || view2.getVisibility() == 8)) {
                            view2.setVisibility(8);
                        }
                    } else {
                        View view3 = this.G;
                        if (!(view3 == null || view3.getVisibility() == 0)) {
                            view3.setVisibility(0);
                        }
                    }
                    if (com.ss.android.ugc.aweme.story.d.a.h(bL())) {
                        View view4 = this.G;
                        if (!(view4 == null || view4.getVisibility() == 4)) {
                            view4.setVisibility(4);
                        }
                        View view5 = this.bx;
                        if (!(view5 == null || view5.getVisibility() == 4)) {
                            view5.setVisibility(4);
                        }
                    } else {
                        View view6 = this.G;
                        if (!(view6 == null || view6.getVisibility() == 0)) {
                            view6.setVisibility(0);
                        }
                        View view7 = this.bx;
                        if (!(view7 == null || view7.getVisibility() == 0)) {
                            view7.setVisibility(0);
                        }
                    }
                    View findViewById3 = view.findViewById(R.id.en3);
                    this.bz = findViewById3;
                    if (findViewById3 != null) {
                        findViewById3.setOnClickListener(new d(this));
                    }
                    l.b(view, "");
                    view.setVisibility(8);
                    viewGroup.addView(view, layoutParams);
                }
                this.F = view;
            }
            if (ad()) {
                Aweme bL5 = bL();
                if (bL5 != null) {
                    bL5.getAid();
                }
                Aweme bL6 = bL();
                if (bL6 != null) {
                    Integer.valueOf(bL6.getAwemeType());
                    MethodCollector.o(6008);
                    return;
                }
                MethodCollector.o(6008);
                return;
            }
            if (this.f79701m == null) {
                this.f79701m = bX();
            }
            if (bL() == null) {
                View view8 = this.F;
                if (view8 != null) {
                    view8.setVisibility(8);
                }
                com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
                if (aVar != null) {
                    aVar.a(false);
                    MethodCollector.o(6008);
                    return;
                }
                MethodCollector.o(6008);
                return;
            } else if (ac.h(bL()) || com.ss.android.ugc.aweme.story.d.a.h(bL())) {
                View view9 = this.F;
                if (view9 != null) {
                    view9.setVisibility(0);
                }
                com.ss.android.ugc.aweme.comment.e.a aVar2 = this.f79701m;
                if (aVar2 != null) {
                    aVar2.a(false);
                    MethodCollector.o(6008);
                    return;
                }
                MethodCollector.o(6008);
                return;
            } else {
                View view10 = this.F;
                if (view10 != null) {
                    view10.setVisibility(8);
                }
                com.ss.android.ugc.aweme.comment.e.a aVar3 = this.f79701m;
                if (aVar3 != null) {
                    aVar3.a(true);
                    MethodCollector.o(6008);
                    return;
                }
            }
        }
        MethodCollector.o(6008);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ad(com.ss.android.ugc.aweme.feed.param.b bVar) {
        super(bVar);
        l.d(bVar, "");
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b, com.ss.android.ugc.aweme.detail.i.m
    public final void a(Aweme aweme) {
        super.a(aweme);
        if (aweme != null) {
            aweme.getAid();
            Integer.valueOf(aweme.getAwemeType());
        }
    }

    static final class d implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad f79668a;

        static {
            Covode.recordClassIndex(49503);
        }

        d(ad adVar) {
            this.f79668a = adVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200)) {
                this.f79668a.ae();
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.b, com.ss.android.ugc.aweme.detail.i.m
    public final void b_(Exception exc) {
        super.b_(exc);
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad f79666a;

        static {
            Covode.recordClassIndex(49501);
        }

        b(ad adVar) {
            this.f79666a = adVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && !com.ss.android.ugc.aweme.story.d.a.k(this.f79666a.bL())) {
                this.f79666a.a("click_comment_icon");
            }
        }
    }

    static final class c implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ad f79667a;

        static {
            Covode.recordClassIndex(49502);
        }

        c(ad adVar) {
            this.f79667a = adVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            if (!com.ss.android.ugc.aweme.l.a.a.a(view, 1200) && !com.ss.android.ugc.aweme.story.d.a.k(this.f79667a.bL())) {
                this.f79667a.j("click_icon");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.af
    public final void a(com.ss.android.ugc.aweme.arch.widgets.base.b bVar) {
        p pVar;
        String str;
        if (bD() && bVar != null && (pVar = (p) bVar.a()) != null) {
            Aweme bL = bL();
            if (bL != null) {
                str = bL.getAid();
            } else {
                str = null;
            }
            if (l.a((Object) str, pVar.getFirst())) {
                long total = (long) ((i) pVar.getSecond()).getTotal();
                if (total < 0) {
                    total = 0;
                }
                String a2 = a(total);
                TuxTextView tuxTextView = this.H;
                if (tuxTextView != null) {
                    tuxTextView.setText(a2);
                }
            }
        }
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.detail.h.af, com.ss.android.ugc.aweme.detail.h.b
    public final void a(List<Aweme> list, boolean z) {
        super.a(list, z);
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        if (list != null) {
            list.size();
        }
        ab();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.util.List<java.lang.Object>, boolean] */
    @Override // com.ss.android.ugc.aweme.common.e.c, com.ss.android.ugc.aweme.detail.h.af, com.ss.android.ugc.aweme.detail.h.b
    public final void b(List<Aweme> list, boolean z) {
        super.b(list, z);
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        if (list != null) {
            list.size();
        }
        ab();
    }
}
