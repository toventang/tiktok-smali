package com.ss.android.ugc.aweme.upvote.detail.bubble;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.covode.number.Covode;
import com.ss.android.ugc.aweme.tux.business.upvote.UpvoteBubbleView;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModel;
import com.ss.android.ugc.aweme.upvote.detail.bubble.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.z;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class a {

    /* renamed from: e  reason: collision with root package name */
    public static final int f142070e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f142071f = new b((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public boolean f142072a;

    /* renamed from: b  reason: collision with root package name */
    public h.f.a.b<? super View, z> f142073b;

    /* renamed from: c  reason: collision with root package name */
    public final FrameLayout f142074c;

    /* renamed from: d  reason: collision with root package name */
    public final UpvoteListViewModel f142075d;

    /* renamed from: g  reason: collision with root package name */
    private final h f142076g = i.a((h.f.a.a) new d(this));

    /* renamed from: h  reason: collision with root package name */
    private final f.a.b.a f142077h = new f.a.b.a();

    /* renamed from: i  reason: collision with root package name */
    private final h f142078i = i.a((h.f.a.a) new c(this));

    /* renamed from: j  reason: collision with root package name */
    private int f142079j;

    /* renamed from: k  reason: collision with root package name */
    private String f142080k;

    /* renamed from: l  reason: collision with root package name */
    private String f142081l;

    public final C3786a a() {
        return (C3786a) this.f142076g.getValue();
    }

    public final AnimatorSet b() {
        return (AnimatorSet) this.f142078i.getValue();
    }

    public static final class b {
        static {
            Covode.recordClassIndex(92850);
        }

        private b() {
        }

        public /* synthetic */ b(byte b2) {
            this();
        }
    }

    public final void d() {
        if (this.f142081l != null) {
            if (b().isRunning() || this.f142072a) {
                a(false);
            }
        }
    }

    public final void e() {
        if (this.f142081l != null && !this.f142072a && !b().isRunning()) {
            c();
        }
    }

    static final class d extends m implements h.f.a.a<C3786a> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92853);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ C3786a invoke() {
            View findViewById = this.this$0.f142074c.findViewById(R.id.fcf);
            l.b(findViewById, "");
            View findViewById2 = this.this$0.f142074c.findViewById(R.id.fcg);
            l.b(findViewById2, "");
            return new C3786a((UpvoteBubbleView) findViewById, (UpvoteBubbleView) findViewById2);
        }
    }

    static {
        Covode.recordClassIndex(92848);
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        f142070e = h.g.a.a(TypedValue.applyDimension(1, 10.0f, system.getDisplayMetrics()));
    }

    private final void g() {
        a().f142082a.getBubbleTouchArea().setOnClickListener(new e(this));
        a().f142083b.getBubbleTouchArea().setClickable(false);
    }

    static final class c extends m implements h.f.a.a<AnimatorSet> {
        final /* synthetic */ a this$0;

        static {
            Covode.recordClassIndex(92851);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(a aVar) {
            super(0);
            this.this$0 = aVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ AnimatorSet invoke() {
            C3786a a2 = this.this$0.a();
            l.d(a2, "");
            AnimatorSet animatorSet = new AnimatorSet();
            float translationY = a2.f142082a.getTranslationY();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(200L);
            ofFloat.addUpdateListener(new b.c(a2, translationY));
            ofFloat.addListener(new b.d(a2, translationY));
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat2.setDuration(200L);
            ofFloat2.setStartDelay(150);
            ofFloat2.addUpdateListener(new b.e(a2, translationY));
            ofFloat2.addListener(new b.f(a2, translationY));
            animatorSet.setInterpolator(com.bytedance.tux.a.a.a.c());
            animatorSet.play(ofFloat);
            animatorSet.play(ofFloat2);
            animatorSet.addListener(new C3787a(this));
            return animatorSet;
        }

        /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.a$c$a  reason: collision with other inner class name */
        public static final class C3787a implements Animator.AnimatorListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f142084a;

            static {
                Covode.recordClassIndex(92852);
            }

            public final void onAnimationCancel(Animator animator) {
                l.c(animator, "");
            }

            public final void onAnimationRepeat(Animator animator) {
                l.c(animator, "");
            }

            public final void onAnimationStart(Animator animator) {
                l.c(animator, "");
            }

            public C3787a(c cVar) {
                this.f142084a = cVar;
            }

            public final void onAnimationEnd(Animator animator) {
                l.c(animator, "");
                a aVar = this.f142084a.this$0;
                C3786a a2 = aVar.a();
                UpvoteBubbleView upvoteBubbleView = a2.f142082a;
                a2.f142082a = a2.f142083b;
                a2.f142083b = upvoteBubbleView;
                aVar.f();
                aVar.c();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public static final class f implements f.a.d.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f142086a;

        static {
            Covode.recordClassIndex(92855);
        }

        f(a aVar) {
            this.f142086a = aVar;
        }

        @Override // f.a.d.a
        public final void a() {
            this.f142086a.f142072a = false;
            List<com.ss.android.ugc.aweme.upvote.c.h> list = this.f142086a.f142075d.f142047a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (T t : list) {
                    String text = t.getText();
                    if (!(text == null || text.length() == 0 || t.getBubbleHidden())) {
                        this.f142086a.b().start();
                        return;
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        if (this.f142074c.isAttachedToWindow() && !this.f142072a) {
            this.f142072a = true;
            f.a.b.b cG_ = f.a.h.a.a(f.a.e.e.a.d.f157241a).a(3000, TimeUnit.MILLISECONDS).b(f.a.h.a.b(f.a.k.a.f158006c)).a(f.a.a.a.a.a(f.a.a.b.a.f157156a)).a(new f(this)).cG_();
            l.b(cG_, "");
            f.a.j.a.a(cG_, this.f142077h);
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        String text;
        com.ss.android.ugc.aweme.upvote.c.e value = this.f142075d.a().getValue();
        if (value != null) {
            l.b(value, "");
            g();
            while (this.f142079j < this.f142075d.f142047a.size()) {
                com.ss.android.ugc.aweme.upvote.c.h hVar = this.f142075d.f142047a.get(this.f142079j);
                if (value.getHasMore() && this.f142079j == this.f142075d.f142047a.size() - 5) {
                    UpvoteListViewModel.a(this.f142075d, null, null, value.getCursor(), 3);
                }
                this.f142079j++;
                if (!hVar.getBubbleHidden() && (text = hVar.getText()) != null && text.length() != 0) {
                    b.a(a().f142083b, hVar);
                    return;
                }
            }
            b.a(a().f142083b, value.getUpvotes(), (int) value.getTotal());
            this.f142079j = 0;
        }
    }

    /* access modifiers changed from: package-private */
    public static final class e implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f142085a;

        static {
            Covode.recordClassIndex(92854);
        }

        e(a aVar) {
            this.f142085a = aVar;
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
            h.f.a.b<? super View, z> bVar = this.f142085a.f142073b;
            if (bVar != null) {
                l.b(view, "");
                bVar.invoke(view);
            }
        }
    }

    public final void a(boolean z) {
        this.f142077h.a();
        b().cancel();
        this.f142072a = false;
        if (z) {
            this.f142081l = null;
        }
    }

    private final void a(com.ss.android.ugc.aweme.upvote.c.e eVar) {
        this.f142081l = this.f142075d.f142048b;
        this.f142079j = 0;
        b.a(a().f142082a, eVar.getUpvotes(), (int) eVar.getTotal());
        a().f142082a.setAlpha(1.0f);
        a().f142083b.setAlpha(0.0f);
        f();
    }

    /* renamed from: com.ss.android.ugc.aweme.upvote.detail.bubble.a$a  reason: collision with other inner class name */
    public static final class C3786a {

        /* renamed from: a  reason: collision with root package name */
        public UpvoteBubbleView f142082a;

        /* renamed from: b  reason: collision with root package name */
        public UpvoteBubbleView f142083b;

        static {
            Covode.recordClassIndex(92849);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3786a)) {
                return false;
            }
            C3786a aVar = (C3786a) obj;
            return l.a(this.f142082a, aVar.f142082a) && l.a(this.f142083b, aVar.f142083b);
        }

        public final int hashCode() {
            UpvoteBubbleView upvoteBubbleView = this.f142082a;
            int i2 = 0;
            int hashCode = (upvoteBubbleView != null ? upvoteBubbleView.hashCode() : 0) * 31;
            UpvoteBubbleView upvoteBubbleView2 = this.f142083b;
            if (upvoteBubbleView2 != null) {
                i2 = upvoteBubbleView2.hashCode();
            }
            return hashCode + i2;
        }

        public final String toString() {
            return "BubbleGroup(curBubble=" + this.f142082a + ", nextBubble=" + this.f142083b + ")";
        }

        public C3786a(UpvoteBubbleView upvoteBubbleView, UpvoteBubbleView upvoteBubbleView2) {
            l.d(upvoteBubbleView, "");
            l.d(upvoteBubbleView2, "");
            this.f142082a = upvoteBubbleView;
            this.f142083b = upvoteBubbleView2;
        }
    }

    public a(FrameLayout frameLayout, UpvoteListViewModel upvoteListViewModel) {
        l.d(frameLayout, "");
        l.d(upvoteListViewModel, "");
        this.f142074c = frameLayout;
        this.f142075d = upvoteListViewModel;
    }

    public static /* synthetic */ void a(a aVar, boolean z, boolean z2) {
        com.ss.android.ugc.aweme.upvote.c.e value;
        if (!aVar.f142075d.c() && (value = aVar.f142075d.a().getValue()) != null) {
            l.b(value, "");
            if (!z2 && !aVar.b().isRunning() && !aVar.f142072a) {
                if (aVar.f142081l == null) {
                    aVar.a(value);
                }
                aVar.c();
            }
            if (!z || !l.a((Object) aVar.f142080k, (Object) aVar.f142075d.f142048b)) {
                aVar.f142080k = aVar.f142075d.f142048b;
                if (z2) {
                    aVar.a(true);
                    aVar.a(value);
                    aVar.c();
                }
            }
        }
    }
}
