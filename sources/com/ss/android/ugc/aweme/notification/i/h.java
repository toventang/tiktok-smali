package com.ss.android.ugc.aweme.notification.i;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.u;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.MtEmptyView;
import com.bytedance.ies.dmt.ui.widget.d;
import com.bytedance.tux.status.TuxStatusView;
import com.ss.android.ugc.aweme.notification.i.i;
import com.ss.android.ugc.aweme.notification.vm.NotificationVM;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import java.util.Objects;

public final class h extends i.a {

    /* renamed from: b  reason: collision with root package name */
    public static final a f113770b = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public Animator f113771a;

    /* renamed from: d  reason: collision with root package name */
    private final h.h f113772d = com.ss.android.ugc.aweme.notification.b.a.a(new C2914h(this));

    /* renamed from: e  reason: collision with root package name */
    private final h.h f113773e = com.ss.android.ugc.aweme.notification.b.a.a(new j(this));

    /* renamed from: f  reason: collision with root package name */
    private final h.h f113774f = com.ss.android.ugc.aweme.notification.b.a.a(new d(this));

    /* renamed from: g  reason: collision with root package name */
    private final h.h f113775g = com.ss.android.ugc.aweme.notification.b.a.a(new i(this));

    static {
        Covode.recordClassIndex(73145);
    }

    private final int m() {
        return ((Number) this.f113772d.getValue()).intValue();
    }

    public final NotificationVM b() {
        return (NotificationVM) this.f113773e.getValue();
    }

    public final DmtStatusView h() {
        return (DmtStatusView) this.f113774f.getValue();
    }

    public final TuxStatusView i() {
        return (TuxStatusView) this.f113775g.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(73146);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    static final class d extends m implements h.f.a.a<DmtStatusView> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(73149);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ DmtStatusView invoke() {
            return this.this$0.c(R.id.eg_);
        }
    }

    static final class i extends m implements h.f.a.a<TuxStatusView> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(73154);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        i(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ TuxStatusView invoke() {
            return this.this$0.c(R.id.ega);
        }
    }

    static final class j extends m implements h.f.a.a<NotificationVM> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(73155);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        j(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ NotificationVM invoke() {
            return NotificationVM.a.a(this.this$0.j());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.i.h$h  reason: collision with other inner class name */
    static final class C2914h extends m implements h.f.a.a<Integer> {
        final /* synthetic */ h this$0;

        static {
            Covode.recordClassIndex(73153);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C2914h(h hVar) {
            super(0);
            this.this$0 = hVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ Integer invoke() {
            return Integer.valueOf(this.this$0.l().getResources().getDimensionPixelSize(R.dimen.a0s));
        }
    }

    /* access modifiers changed from: package-private */
    public static final class g implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f113781a;

        static {
            Covode.recordClassIndex(73152);
        }

        g(h hVar) {
            this.f113781a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            this.f113781a.b().k();
        }
    }

    static final class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f113776a;

        static {
            Covode.recordClassIndex(73147);
        }

        b(h hVar) {
            this.f113776a = hVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            TuxStatusView i2 = this.f113776a.i();
            l.b(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            h.a(i2, ((Integer) animatedValue).intValue());
        }
    }

    public static final class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f113777a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f113778b;

        static {
            Covode.recordClassIndex(73148);
        }

        public final void onAnimationCancel(Animator animator) {
            if (!this.f113778b) {
                this.f113777a.i().setVisibility(8);
            }
            this.f113777a.f113771a = null;
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f113778b) {
                this.f113777a.i().setVisibility(8);
            }
            this.f113777a.f113771a = null;
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f113778b) {
                this.f113777a.i().setVisibility(0);
                this.f113777a.i().a();
            }
        }

        c(h hVar, boolean z) {
            this.f113777a = hVar;
            this.f113778b = z;
        }
    }

    static final class e<T> implements u {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f113779a;

        static {
            Covode.recordClassIndex(73150);
        }

        e(h hVar) {
            this.f113779a = hVar;
        }

        @Override // androidx.lifecycle.u
        public final /* synthetic */ void onChanged(Object obj) {
            com.ss.android.ugc.aweme.notice.repo.list.bean.f f2 = this.f113779a.b().f();
            if (f2 != null) {
                this.f113779a.a(f2.f112859d, f2.f112860e, f2.f112861f);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f113780a;

        static {
            Covode.recordClassIndex(73151);
        }

        f(h hVar) {
            this.f113780a = hVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            i iVar = this.f113780a.f113784c;
            if (iVar == null) {
                l.a("fragment");
            }
            l.d(f.class, "");
            i.a aVar = iVar.o().get(f.class);
            if (aVar != null) {
                Objects.requireNonNull(aVar, "null cannot be cast to non-null type com.ss.android.ugc.aweme.notification.widget.QnAWidget");
                ((f) aVar).x();
                return;
            }
            throw new IllegalStateException("Cannot find widget: " + f.class.getSimpleName());
        }
    }

    public final void a(boolean z) {
        int i2;
        int i3;
        Animator animator = this.f113771a;
        if (animator != null && animator.isRunning()) {
            animator.cancel();
        }
        if (z) {
            i2 = -m();
            i3 = 0;
        } else {
            i2 = 0;
            i3 = -m();
        }
        ValueAnimator ofInt = ObjectAnimator.ofInt(i2, i3);
        a(i(), i2);
        ofInt.addUpdateListener(new b(this));
        ofInt.addListener(new c(this, z));
        l.b(ofInt, "");
        ofInt.setDuration(200L);
        ofInt.start();
        this.f113771a = ofInt;
    }

    public static void a(View view, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i2;
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // com.ss.android.ugc.aweme.notification.i.i.a
    public final void a(View view, Bundle bundle) {
        l.d(view, "");
        super.a(view, bundle);
        a(R.string.djs, R.string.dk4, 2131231278);
        b().c().observe(j(), new e(this));
    }

    public final void a(int i2, int i3, int i4) {
        androidx.fragment.app.e l2 = l();
        d.a c2 = new d.a(l2).a(i4).b(i2).c(i3);
        l.b(c2, "");
        if (i2 == R.string.ct && QnaService.a().enablePublicQna()) {
            c2.a(com.bytedance.ies.dmt.ui.widget.a.SOLID, R.string.cr, new f(this));
        }
        MtEmptyView a2 = MtEmptyView.a(l2);
        a2.setStatus(c2.f33648a);
        l.b(a2, "");
        a2.a(androidx.core.content.b.c(a2.getContext(), R.color.bx), j().getResources().getDrawable(R.drawable.nb), (int) n.b(l2, 30.0f), (int) n.b(l2, 84.0f));
        com.bytedance.ies.dmt.ui.widget.d dVar = new d.a(l2).b(R.string.cso).b("").f33648a;
        DmtStatusView.a a3 = DmtStatusView.a.a(l2).a().a(R.string.h2z, R.string.h2y, R.string.h35, new g(this));
        if (!com.ss.android.ugc.aweme.notification.utils.l.a()) {
            a3.b(a2);
        } else {
            a3.a(dVar);
        }
        h().setBuilder(a3);
    }
}
