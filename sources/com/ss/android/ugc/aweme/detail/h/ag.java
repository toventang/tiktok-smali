package com.ss.android.ugc.aweme.detail.h;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.metrics.ac;
import com.ss.android.ugc.aweme.utils.y;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.List;

public final class ag extends af {

    /* renamed from: a  reason: collision with root package name */
    public static final a f79682a = new a((byte) 0);
    private View F;
    private View G;
    private TuxTextView H;
    private View bx;

    static {
        Covode.recordClassIndex(49519);
    }

    public static final class a {
        static {
            Covode.recordClassIndex(49520);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
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

    @Override // com.ss.android.ugc.aweme.feed.q.a, com.ss.android.ugc.aweme.detail.h.af, com.ss.android.ugc.aweme.detail.h.b
    public final void p() {
        super.p();
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
    }

    private final void bX() {
        String str;
        AwemeStatistics statistics;
        Aweme bL = bL();
        if (bL == null || (statistics = bL.getStatistics()) == null) {
            str = null;
        } else {
            str = com.ss.android.ugc.aweme.i18n.b.a(statistics.getPlayCount());
        }
        TuxTextView tuxTextView = this.H;
        if (tuxTextView != null) {
            if (str == null) {
                str = "0";
            }
            tuxTextView.setText(str);
        }
    }

    private final void bY() {
        Aweme bL = bL();
        if (bL != null) {
            bL.getAid();
        }
        Aweme bL2 = bL();
        if (bL2 != null) {
            Integer.valueOf(bL2.getAwemeType());
        }
        View view = this.F;
        if (!(view == null || view.getVisibility() == 0)) {
            view.setVisibility(0);
        }
        com.ss.android.ugc.aweme.comment.e.a aVar = this.f79701m;
        if (aVar != null) {
            aVar.a(false);
        }
        if (com.ss.android.ugc.aweme.story.d.a.h(bL())) {
            View view2 = this.G;
            if (!(view2 == null || view2.getVisibility() == 4)) {
                view2.setVisibility(4);
            }
        } else {
            View view3 = this.G;
            if (!(view3 == null || view3.getVisibility() == 0)) {
                view3.setVisibility(0);
            }
            bX();
        }
        View view4 = this.n;
        if (!(view4 == null || view4.getVisibility() == 8)) {
            view4.setVisibility(8);
        }
        com.ss.android.ugc.aweme.tcm.api.service.a aVar2 = this.p;
        if (aVar2 != null) {
            aVar2.b();
        }
    }

    @Override // com.ss.android.ugc.aweme.detail.h.af
    public final void ab() {
        if (com.ss.android.ugc.aweme.story.d.a.d(bL())) {
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
                }
            } else if (ac.h(bL()) || com.ss.android.ugc.aweme.story.d.a.h(bL())) {
                bY();
            } else {
                Aweme bL3 = bL();
                if (bL3 != null) {
                    bL3.getAid();
                }
                Aweme bL4 = bL();
                if (bL4 != null) {
                    Integer.valueOf(bL4.getAwemeType());
                }
                View view2 = this.F;
                if (!(view2 == null || view2.getVisibility() == 8)) {
                    view2.setVisibility(8);
                }
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
        } else {
            View view3 = this.F;
            if (view3 != null && view3.getVisibility() != 8) {
                view3.setVisibility(8);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void m() {
        MethodCollector.i(3834);
        super.m();
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
            if (!activity.isFinishing()) {
                if (az_() == null) {
                    MethodCollector.o(3834);
                    return;
                }
                Boolean bool = this.aI;
                l.b(bool, "");
                if (bool.booleanValue()) {
                    MethodCollector.o(3834);
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
                        view = com.a.a(LayoutInflater.from(this.bv), R.layout.wy, viewGroup, false);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                        layoutParams.gravity = 80;
                        this.G = view.findViewById(R.id.cg3);
                        this.H = (TuxTextView) view.findViewById(R.id.etu);
                        bX();
                        if (com.ss.android.ugc.aweme.story.d.a.h(bL())) {
                            View view2 = this.G;
                            if (!(view2 == null || view2.getVisibility() == 4)) {
                                view2.setVisibility(4);
                            }
                        } else {
                            View view3 = this.G;
                            if (!(view3 == null || view3.getVisibility() == 0)) {
                                view3.setVisibility(0);
                            }
                        }
                        View findViewById = view.findViewById(R.id.en3);
                        this.bx = findViewById;
                        if (findViewById != null) {
                            findViewById.setOnClickListener(new b(this));
                        }
                        l.b(view, "");
                        view.setVisibility(8);
                        viewGroup.addView(view, layoutParams);
                    }
                    this.F = view;
                }
                MethodCollector.o(3834);
                return;
            }
        }
        MethodCollector.o(3834);
    }

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ag f79683a;

        static {
            Covode.recordClassIndex(49521);
        }

        b(ag agVar) {
            this.f79683a = agVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f79683a.ae();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ag(com.ss.android.ugc.aweme.feed.param.b bVar) {
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

    /* access modifiers changed from: protected */
    @Override // com.ss.android.ugc.aweme.detail.h.b
    public final void b(Aweme aweme) {
        if (aweme != null) {
            aweme.getAid();
            Integer.valueOf(aweme.getAwemeType());
        }
        super.b(aweme);
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
