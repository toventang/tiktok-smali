package com.ss.android.ugc.aweme.dsp.playpage.playview.common;

import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.a;
import com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView;
import com.ss.android.ugc.aweme.cp.i;
import com.ss.android.ugc.aweme.dsp.playpage.base.b;
import com.ss.android.ugc.aweme.dsp.playpage.playview.b.a;
import com.ss.android.ugc.aweme.dsp.playpage.playview.b.b;
import com.ss.android.ugc.aweme.dsp.playpage.playview.b.d;
import com.ss.android.ugc.aweme.dsp.playpage.playview.b.e;
import com.ss.android.ugc.aweme.dsp.widget.MDMarqueeView;
import com.ss.android.ugc.aweme.utils.bp;
import com.ss.android.ugc.aweme.utils.j;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import org.greenrobot.eventbus.EventBus;

public final class MusicInfoView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playpage.base.b f83869a;

    /* renamed from: b  reason: collision with root package name */
    public LinearLayout f83870b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playpage.playview.b.d f83871c;

    /* renamed from: d  reason: collision with root package name */
    public com.ss.android.ugc.aweme.dsp.playpage.playview.b.a.a f83872d;

    /* renamed from: e  reason: collision with root package name */
    public e f83873e;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playerservice.b.c f83874f;

    /* renamed from: g  reason: collision with root package name */
    private f.a.b.b f83875g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playpage.playview.b.a f83876h;

    /* renamed from: i  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playpage.playview.b.b f83877i;

    /* renamed from: j  reason: collision with root package name */
    private com.ss.android.ugc.aweme.dsp.playpage.playview.b.c f83878j;

    /* renamed from: k  reason: collision with root package name */
    private ViewGroup f83879k;

    /* renamed from: l  reason: collision with root package name */
    private View f83880l;

    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static final b f83882a = new b();

        static {
            Covode.recordClassIndex(52301);
        }

        b() {
        }

        public final void onClick(View view) {
            ClickAgent.onClick(view);
        }
    }

    static {
        Covode.recordClassIndex(52299);
    }

    public static final class d extends bp {
        static {
            Covode.recordClassIndex(52303);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
        }

        d() {
        }
    }

    static final class a extends com.ss.android.ugc.aweme.cp.a {

        /* renamed from: a  reason: collision with root package name */
        public View f83881a;

        static {
            Covode.recordClassIndex(52300);
        }

        @Override // com.ss.android.ugc.aweme.cp.a
        public final void a() {
            View view = this.f83881a;
            if (view != null) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                int a2 = h.g.a.a(TypedValue.applyDimension(1, 36.0f, system.getDisplayMetrics()));
                Resources system2 = Resources.getSystem();
                l.a((Object) system2, "");
                i.a(view, a2, h.g.a.a(TypedValue.applyDimension(1, 36.0f, system2.getDisplayMetrics())));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        com.ss.android.ugc.aweme.feed.e eVar;
        super.onAttachedToWindow();
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.c cVar = this.f83878j;
        if (cVar != null) {
            Context context = cVar.f83832e.getContext();
            if ((context instanceof Activity) && (eVar = cVar.f83831d) != null) {
                eVar.a((Activity) context, null);
            }
            EventBus.a(EventBus.a(), cVar);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f83869a = null;
        f.a.b.b bVar = this.f83875g;
        if (bVar != null) {
            bVar.dispose();
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.a aVar = this.f83876h;
        if (aVar != null) {
            f.a.b.b bVar2 = aVar.f83767d;
            if (bVar2 != null) {
                bVar2.dispose();
            }
            EventBus.a().b(aVar);
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.b bVar3 = this.f83877i;
        if (bVar3 != null) {
            EventBus.a().b(bVar3);
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.c cVar = this.f83878j;
        if (cVar != null) {
            com.ss.android.ugc.aweme.feed.e eVar = cVar.f83831d;
            if (eVar != null) {
                eVar.b();
            }
            EventBus.a().b(cVar);
        }
        super.onDetachedFromWindow();
    }

    public final void setPageIndex(int i2) {
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.a aVar = this.f83876h;
        if (aVar != null) {
            aVar.f83765b = i2;
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.b bVar = this.f83877i;
        if (bVar != null) {
            bVar.f83808b = i2;
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.c cVar = this.f83878j;
        if (cVar != null) {
            cVar.f83829b = i2;
        }
    }

    public static final class c extends bp {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ MusicInfoView f83883a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Context f83884b;

        static {
            Covode.recordClassIndex(52302);
        }

        @Override // com.ss.android.ugc.aweme.utils.bp
        public final void a(View view) {
            com.ss.android.ugc.aweme.dsp.playpage.base.b bVar = this.f83883a.f83869a;
            if (bVar != null) {
                new a.C1112a().a(new com.ss.android.ugc.aweme.dsp.playpage.queue.b(bVar)).a(1).b((int) (((float) n.b(this.f83884b)) * 0.73f)).a(true).c().b(false).f45299a.show(bVar.m().getSupportFragmentManager(), this.f83883a.getClass().getSimpleName());
            }
        }

        c(MusicInfoView musicInfoView, Context context) {
            this.f83883a = musicInfoView;
            this.f83884b = context;
        }
    }

    public final void setPlayPage(com.ss.android.ugc.aweme.dsp.playpage.base.b bVar) {
        int i2;
        com.ss.android.ugc.aweme.dsp.playerservice.f.a a2;
        l.d(bVar, "");
        this.f83869a = bVar;
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.a aVar = this.f83876h;
        if (aVar != null) {
            l.d(bVar, "");
            aVar.f83764a = bVar;
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.a.a aVar2 = this.f83872d;
        if (aVar2 != null) {
            l.d(bVar, "");
            aVar2.f83778e = bVar;
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.b bVar2 = this.f83877i;
        if (bVar2 != null) {
            l.d(bVar, "");
            bVar2.f83807a = bVar;
            com.ss.android.ugc.aweme.dsp.playpage.base.b bVar3 = bVar2.f83807a;
            if (!(bVar3 == null || (a2 = bVar3.a()) == null)) {
                a2.a(bVar2);
            }
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.d dVar = this.f83871c;
        if (dVar != null) {
            l.d(bVar, "");
            dVar.f83836a = bVar;
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.c cVar = this.f83878j;
        int i3 = 0;
        if (cVar != null) {
            l.d(bVar, "");
            cVar.f83828a = bVar;
            cVar.f83831d = com.ss.android.ugc.aweme.feed.service.a.a(bVar.n().f83747a, 0, cVar, cVar);
            com.ss.android.ugc.aweme.feed.e eVar = cVar.f83831d;
            if (eVar != null) {
                eVar.a();
            }
        }
        e eVar2 = this.f83873e;
        if (eVar2 != null) {
            l.d(bVar, "");
            View view = eVar2.f83846d;
            if (b.a.b(bVar)) {
                Resources system = Resources.getSystem();
                l.a((Object) system, "");
                i2 = h.g.a.a(TypedValue.applyDimension(1, 20.0f, system.getDisplayMetrics()));
            } else {
                i2 = 0;
            }
            com.bytedance.tux.h.i.b(view, null, null, null, Integer.valueOf(i2), false, 23);
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = null;
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            layoutParams = null;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
        if (marginLayoutParams2 != null) {
            marginLayoutParams2.bottomMargin = bVar.g();
            marginLayoutParams = marginLayoutParams2;
        }
        setLayoutParams(marginLayoutParams);
        View view2 = this.f83880l;
        if (view2 != null) {
            if (b.a.b(bVar)) {
                i3 = 8;
            }
            view2.setVisibility(i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00a8, code lost:
        if (r8 != null) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00ba, code lost:
        if (r0 != null) goto L_0x020d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setData(com.ss.android.ugc.aweme.dsp.playerservice.b.c r10) {
        /*
        // Method dump skipped, instructions count: 572
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.dsp.playpage.playview.common.MusicInfoView.setData(com.ss.android.ugc.aweme.dsp.playerservice.b.c):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MusicInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        l.d(context, "");
        MethodCollector.i(431);
        LayoutInflater.from(context).inflate(R.layout.am7, this);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.cgd);
        this.f83870b = linearLayout;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(b.f83882a);
        }
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.a aVar = new com.ss.android.ugc.aweme.dsp.playpage.playview.b.a(this);
        EventBus.a(EventBus.a(), aVar);
        SmartAvatarBorderView smartAvatarBorderView = aVar.f83771h;
        smartAvatarBorderView.setBorderColor(R.color.f159928l);
        smartAvatarBorderView.setOnClickListener(new a.g(smartAvatarBorderView, aVar));
        aVar.f83769f.setOnClickListener(new a.h(aVar));
        this.f83876h = aVar;
        this.f83872d = new com.ss.android.ugc.aweme.dsp.playpage.playview.b.a.a(this);
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.b bVar = new com.ss.android.ugc.aweme.dsp.playpage.playview.b.b(this);
        bVar.f83815i = new Handler(Looper.getMainLooper());
        bVar.f83812f = new com.ss.android.ugc.aweme.favorites.g.a();
        com.ss.android.ugc.aweme.favorites.g.a aVar2 = bVar.f83812f;
        if (aVar2 != null) {
            aVar2.f90639c = "music_dsp";
        }
        com.ss.android.ugc.aweme.favorites.g.a aVar3 = bVar.f83812f;
        if (aVar3 != null) {
            aVar3.a_(bVar);
        }
        LinearLayout linearLayout2 = (LinearLayout) bVar.n.findViewById(R.id.bod);
        l.b(linearLayout2, "");
        linearLayout2.setTranslationY(n.b(bVar.n.getContext(), 56.0f));
        bVar.f83811e = linearLayout2;
        TuxTextView tuxTextView = (TuxTextView) bVar.n.findViewById(R.id.cpz);
        tuxTextView.setOnClickListener(new b.f(bVar));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(n.b(bVar.n.getContext(), 2.0f));
        Drawable mutate = androidx.core.graphics.drawable.a.e(gradientDrawable).mutate();
        l.b(mutate, "");
        Context context2 = bVar.n.getContext();
        l.b(context2, "");
        int color = context2.getResources().getColor(com.ss.android.ugc.aweme.dsp.playpage.playview.b.b.o);
        TuxTextView tuxTextView2 = bVar.f83810d;
        if (tuxTextView2 != null) {
            tuxTextView2.setBackground(j.a(mutate, color));
        }
        bVar.f83810d = tuxTextView;
        bVar.f83813g = new AnimatorSet();
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(bVar.f83810d, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(400L);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(bVar.f83811e, "translationY", n.b(bVar.n.getContext(), 56.0f), 0.0f);
        ofFloat2.setDuration(400L);
        Context context3 = bVar.n.getContext();
        l.b(context3, "");
        int color2 = context3.getResources().getColor(com.ss.android.ugc.aweme.dsp.playpage.playview.b.b.o);
        Context context4 = bVar.n.getContext();
        l.b(context4, "");
        int color3 = context4.getResources().getColor(com.ss.android.ugc.aweme.dsp.playpage.playview.b.b.p);
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(color2), Integer.valueOf(color3));
        ofObject.setDuration(400L);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(n.b(bVar.n.getContext(), 2.0f));
        Drawable mutate2 = androidx.core.graphics.drawable.a.e(gradientDrawable2).mutate();
        l.b(mutate2, "");
        ofObject.addUpdateListener(new b.c(bVar, mutate2));
        animatorSet.playTogether(ofFloat, ofFloat2);
        AnimatorSet animatorSet2 = bVar.f83813g;
        if (animatorSet2 != null) {
            animatorSet2.playSequentially(animatorSet, ofObject);
        }
        AnimatorSet animatorSet3 = bVar.f83813g;
        if (animatorSet3 != null) {
            animatorSet3.addListener(new b.d(bVar));
        }
        bVar.f83814h = new AnimatorSet();
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(bVar.f83810d, "alpha", 1.0f, 0.0f);
        ofFloat3.setDuration(300L);
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(bVar.f83811e, "translationY", 0.0f, n.b(bVar.n.getContext(), 56.0f));
        ofFloat4.setDuration(300L);
        AnimatorSet animatorSet4 = bVar.f83814h;
        if (animatorSet4 != null) {
            animatorSet4.playTogether(ofFloat3, ofFloat4);
        }
        AnimatorSet animatorSet5 = bVar.f83814h;
        if (animatorSet5 != null) {
            animatorSet5.addListener(new b.e(bVar));
        }
        EventBus.a(EventBus.a(), bVar);
        this.f83877i = bVar;
        com.ss.android.ugc.aweme.dsp.playpage.playview.b.d dVar = new com.ss.android.ugc.aweme.dsp.playpage.playview.b.d(this);
        dVar.f83838c = (LinearLayout) dVar.f83841f.findViewById(R.id.bod);
        dVar.f83839d = (MDMarqueeView) dVar.f83841f.findViewById(R.id.f7j);
        dVar.f83840e = (TextView) dVar.f83841f.findViewById(R.id.f7f);
        LinearLayout linearLayout3 = dVar.f83838c;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener(d.a.f83842a);
        }
        this.f83871c = dVar;
        this.f83878j = new com.ss.android.ugc.aweme.dsp.playpage.playview.b.c(this);
        this.f83873e = new e(this);
        View findViewById = findViewById(R.id.c01);
        this.f83880l = findViewById;
        a aVar4 = new a();
        aVar4.f83881a = findViewById;
        aVar4.c();
        findViewById.setOnClickListener(new c(this, context));
        ViewGroup viewGroup = this.f83879k;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new d());
            MethodCollector.o(431);
            return;
        }
        MethodCollector.o(431);
    }
}
