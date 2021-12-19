package com.ss.android.ugc.aweme.commercialize.playfun;

import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.lighten.a.o;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.commercialize.playfun.a.g;
import com.ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemePlayFunModel;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.utils.hh;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import java.util.Objects;

public final class AdPlayFunView extends FrameLayout implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public SmartImageView f74930a;

    /* renamed from: b  reason: collision with root package name */
    TextView f74931b;

    /* renamed from: c  reason: collision with root package name */
    public e f74932c;

    /* renamed from: d  reason: collision with root package name */
    DataCenter f74933d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f74934e;

    /* renamed from: f  reason: collision with root package name */
    public Aweme f74935f;

    /* renamed from: g  reason: collision with root package name */
    AwemePlayFunModel f74936g;

    /* renamed from: h  reason: collision with root package name */
    public boolean f74937h;

    /* renamed from: i  reason: collision with root package name */
    final c f74938i;

    /* renamed from: j  reason: collision with root package name */
    private View f74939j;

    /* renamed from: k  reason: collision with root package name */
    private final h f74940k;

    /* renamed from: l  reason: collision with root package name */
    private View f74941l;

    /* renamed from: m  reason: collision with root package name */
    private final b f74942m;
    private final GestureDetector n;
    private final View.OnLayoutChangeListener o;

    static final class e implements com.ss.android.ugc.aweme.commercialize.j.b {

        /* renamed from: a  reason: collision with root package name */
        public static final e f74947a = new e();

        static {
            Covode.recordClassIndex(46207);
        }

        e() {
        }
    }

    static {
        Covode.recordClassIndex(46202);
    }

    public AdPlayFunView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, (byte) 0);
    }

    /* access modifiers changed from: package-private */
    public final i getAdDepend() {
        return (i) this.f74940k.getValue();
    }

    static final class a extends m implements h.f.a.a<i> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f74943a = new a();

        static {
            Covode.recordClassIndex(46203);
        }

        a() {
            super(0);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ i invoke() {
            return CommercializeAdServiceImpl.a().a(19);
        }
    }

    public final e getStateContext() {
        e eVar = this.f74932c;
        if (eVar == null) {
            l.a("stateContext");
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        View findViewById = ((ViewGroup) parent).findViewById(R.id.q0);
        this.f74941l = findViewById;
        if (findViewById != null) {
            findViewById.addOnLayoutChangeListener(this.o);
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e eVar = this.f74932c;
        if (eVar == null) {
            l.a("stateContext");
        }
        eVar.a();
        View view = this.f74941l;
        if (view != null) {
            view.removeOnLayoutChangeListener(this.o);
        }
    }

    /* access modifiers changed from: protected */
    public final void onFinishInflate() {
        super.onFinishInflate();
        View findViewById = findViewById(R.id.fx);
        l.b(findViewById, "");
        this.f74930a = (SmartImageView) findViewById;
        View findViewById2 = findViewById(R.id.fy);
        l.b(findViewById2, "");
        this.f74931b = (TextView) findViewById2;
        View findViewById3 = findViewById(R.id.fw);
        l.b(findViewById3, "");
        this.f74939j = findViewById3;
        SmartImageView smartImageView = this.f74930a;
        if (smartImageView == null) {
            l.a("eggImageView");
        }
        smartImageView.setOnTouchListener(this);
        TextView textView = this.f74931b;
        if (textView == null) {
            l.a("eggTitleView");
        }
        textView.setOnTouchListener(this);
        View view = this.f74939j;
        if (view == null) {
            l.a("eggBackgroundView");
        }
        view.setOnTouchListener(this);
        this.f74932c = new e(this);
    }

    public final c a() {
        int b2;
        int a2;
        View findViewById;
        c cVar = new c();
        int a3 = n.a(getContext());
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        Activity activity = (Activity) context;
        if (activity == null || (findViewById = activity.findViewById(R.id.dp7)) == null) {
            b2 = hh.b();
        } else {
            b2 = f.a(findViewById) + findViewById.getHeight();
        }
        View view = this.f74941l;
        if (view != null) {
            a2 = f.a(view);
        } else {
            a2 = f.a(this) + getHeight();
        }
        TextView textView = this.f74931b;
        if (textView == null) {
            l.a("eggTitleView");
        }
        textView.measure(0, 0);
        TextView textView2 = this.f74931b;
        if (textView2 == null) {
            l.a("eggTitleView");
        }
        int measuredHeight = textView2.getMeasuredHeight();
        float f2 = (float) a3;
        cVar.f74989a = (int) (0.587f * f2);
        float b3 = ((float) (a2 - b2)) - (((float) (cVar.f74989a + measuredHeight)) + (n.b(getContext(), 16.0f) * 2.0f));
        if (b3 >= 0.0f) {
            cVar.f74990b = ((float) b2) + (b3 / 2.0f) + n.b(getContext(), 16.0f);
        } else {
            cVar.f74989a += (int) b3;
            cVar.f74990b = ((float) b2) + n.b(getContext(), 16.0f);
        }
        cVar.f74991c = (f2 - ((float) cVar.f74989a)) / 2.0f;
        cVar.f74992d = n.b(getContext(), 86.0f) / ((float) cVar.f74989a);
        return cVar;
    }

    public final void b() {
        e eVar = this.f74932c;
        if (eVar == null) {
            l.a("stateContext");
        }
        if (!l.a((Object) eVar.f74996b, (Object) "IdleState") && !l.a((Object) eVar.f74996b, (Object) "WidgetShowState") && !l.a((Object) eVar.f74996b, (Object) "FinishState")) {
            d dVar = eVar.f75007m.get(eVar.f74996b);
            if (dVar != null) {
                dVar.e();
            }
            eVar.f74996b = "WidgetShowState";
            PointF c2 = eVar.c();
            eVar.f74999e.setPivotX(((float) eVar.f74995a.f74989a) / 2.0f);
            eVar.f74999e.setPivotY(((float) eVar.f74995a.f74989a) / 2.0f);
            eVar.f74999e.setTranslationX(c2.x);
            eVar.f74999e.setTranslationY(c2.y);
            eVar.f74999e.setScaleX(eVar.f74995a.f74992d);
            eVar.f74999e.setScaleY(eVar.f74995a.f74992d);
            eVar.f74999e.setRotation(0.0f);
            eVar.f75000f.setAlpha(0.0f);
            eVar.f74998d.setAlpha(0.0f);
            d dVar2 = eVar.f75007m.get(eVar.f74996b);
            if (dVar2 != null) {
                dVar2.a();
            }
        }
    }

    public final void setPaused(boolean z) {
        this.f74937h = z;
    }

    public static final class b extends GestureDetector.SimpleOnGestureListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPlayFunView f74944a;

        static {
            Covode.recordClassIndex(46204);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        b(AdPlayFunView adPlayFunView) {
            this.f74944a = adPlayFunView;
        }

        public final boolean onDown(MotionEvent motionEvent) {
            return this.f74944a.getStateContext().b();
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            AwemeRawAd awemeRawAd;
            i adDepend;
            AwemeRawAd awemeRawAd2;
            AdPlayFunView adPlayFunView = this.f74944a;
            Aweme aweme = adPlayFunView.f74935f;
            if (!(aweme == null || aweme.getAwemeRawAd() == null)) {
                e eVar = adPlayFunView.f74932c;
                if (eVar == null) {
                    l.a("stateContext");
                }
                AwemeRawAd awemeRawAd3 = null;
                if (l.a((Object) eVar.f75006l, (Object) "popupmask")) {
                    e eVar2 = adPlayFunView.f74932c;
                    if (eVar2 == null) {
                        l.a("stateContext");
                    }
                    d dVar = eVar2.f75007m.get(eVar2.f74996b);
                    if (dVar != null) {
                        dVar.d();
                    }
                    Aweme aweme2 = adPlayFunView.f74935f;
                    if (aweme2 != null) {
                        awemeRawAd2 = aweme2.getAwemeRawAd();
                    } else {
                        awemeRawAd2 = null;
                    }
                    e eVar3 = adPlayFunView.f74932c;
                    if (eVar3 == null) {
                        l.a("stateContext");
                    }
                    com.ss.android.ugc.aweme.ad.d.a.a(awemeRawAd2, "otherclick", eVar3.f75006l, null);
                } else {
                    e eVar4 = adPlayFunView.f74932c;
                    if (eVar4 == null) {
                        l.a("stateContext");
                    }
                    if (l.a((Object) eVar4.f74996b, (Object) "EggShowState")) {
                        long currentTimeMillis = System.currentTimeMillis();
                        Aweme aweme3 = adPlayFunView.f74935f;
                        if (aweme3 != null) {
                            awemeRawAd3 = aweme3.getAwemeRawAd();
                        }
                        e eVar5 = adPlayFunView.f74932c;
                        if (eVar5 == null) {
                            l.a("stateContext");
                        }
                        String str = eVar5.f75006l;
                        e eVar6 = adPlayFunView.f74932c;
                        if (eVar6 == null) {
                            l.a("stateContext");
                        }
                        com.ss.android.ugc.aweme.ad.d.a.a(awemeRawAd3, "click", str, Long.valueOf(currentTimeMillis - eVar6.f75004j));
                    } else {
                        Aweme aweme4 = adPlayFunView.f74935f;
                        if (aweme4 != null) {
                            awemeRawAd = aweme4.getAwemeRawAd();
                        } else {
                            awemeRawAd = null;
                        }
                        e eVar7 = adPlayFunView.f74932c;
                        if (eVar7 == null) {
                            l.a("stateContext");
                        }
                        com.ss.android.ugc.aweme.ad.d.a.a(awemeRawAd, "click", eVar7.f75006l, null);
                    }
                    Aweme aweme5 = adPlayFunView.f74935f;
                    if (!(aweme5 == null || (adDepend = adPlayFunView.getAdDepend()) == null)) {
                        Context context = adPlayFunView.getContext();
                        l.b(context, "");
                        adDepend.a(context, aweme5, e.f74947a);
                    }
                }
            }
            return this.f74944a.getStateContext().b();
        }
    }

    public static final class c extends com.bytedance.lighten.a.c.d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPlayFunView f74945a;

        static {
            Covode.recordClassIndex(46205);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        c(AdPlayFunView adPlayFunView) {
            this.f74945a = adPlayFunView;
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, Throwable th) {
            AwemeRawAd awemeRawAd;
            if (view != null) {
                this.f74945a.setVisibility(8);
                if (this.f74945a.f74935f != null) {
                    Aweme aweme = this.f74945a.f74935f;
                    if (aweme != null) {
                        awemeRawAd = aweme.getAwemeRawAd();
                    } else {
                        awemeRawAd = null;
                    }
                    com.bytedance.ies.ugc.aweme.rich.a.a.a("draw_ad", "othershow_fail", awemeRawAd).b("refer", "popupbadge").b();
                    com.ss.android.ugc.aweme.commercialize.playfun.b.a.a(this.f74945a.f74935f, false, "display", null, null);
                }
            }
        }

        @Override // com.bytedance.lighten.a.c.k
        public final void a(Uri uri, View view, o oVar, Animatable animatable) {
            if (view != null) {
                if (com.ss.android.ugc.aweme.ad.feed.h.a.d(this.f74945a.f74935f) && this.f74945a.f74934e) {
                    e stateContext = this.f74945a.getStateContext();
                    c a2 = this.f74945a.a();
                    l.d(a2, "");
                    stateContext.f74995a = a2;
                    ViewGroup.LayoutParams layoutParams = AdPlayFunView.a(this.f74945a).getLayoutParams();
                    layoutParams.width = this.f74945a.getStateContext().f74995a.f74989a;
                    layoutParams.height = layoutParams.width;
                    AdPlayFunView.a(this.f74945a).setLayoutParams(layoutParams);
                    e stateContext2 = this.f74945a.getStateContext();
                    stateContext2.f74996b = "IdleState";
                    d dVar = stateContext2.f75007m.get(stateContext2.f74996b);
                    if (dVar != null) {
                        dVar.a();
                    }
                }
                com.ss.android.ugc.aweme.commercialize.playfun.b.a.a(this.f74945a.f74935f, true, "display", null, null);
            }
        }
    }

    public final void setStateContext(e eVar) {
        l.d(eVar, "");
        this.f74932c = eVar;
    }

    public static final /* synthetic */ SmartImageView a(AdPlayFunView adPlayFunView) {
        SmartImageView smartImageView = adPlayFunView.f74930a;
        if (smartImageView == null) {
            l.a("eggImageView");
        }
        return smartImageView;
    }

    public final void a(Aweme aweme) {
        AwemePlayFunModel awemePlayFunModel;
        AwemeRawAd awemeRawAd;
        this.f74935f = aweme;
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null) {
            awemePlayFunModel = null;
        } else {
            awemePlayFunModel = awemeRawAd.getPlayFunModel();
        }
        this.f74936g = awemePlayFunModel;
        e eVar = this.f74932c;
        if (eVar == null) {
            l.a("stateContext");
        }
        eVar.f74997c = this.f74936g;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        String str;
        View view2 = this.f74939j;
        if (view2 == null) {
            l.a("eggBackgroundView");
        }
        if (l.a(view, view2)) {
            e eVar = this.f74932c;
            if (eVar == null) {
                l.a("stateContext");
            }
            eVar.a("popupmask");
        } else {
            SmartImageView smartImageView = this.f74930a;
            if (smartImageView == null) {
                l.a("eggImageView");
            }
            if (l.a(view, smartImageView)) {
                e eVar2 = this.f74932c;
                if (eVar2 == null) {
                    l.a("stateContext");
                }
                e eVar3 = this.f74932c;
                if (eVar3 == null) {
                    l.a("stateContext");
                }
                if (l.a((Object) eVar3.f74996b, (Object) "EggShowState")) {
                    str = "popupbadge";
                } else {
                    str = "badge";
                }
                eVar2.a(str);
            } else {
                TextView textView = this.f74931b;
                if (textView == null) {
                    l.a("eggTitleView");
                }
                if (l.a(view, textView)) {
                    e eVar4 = this.f74932c;
                    if (eVar4 == null) {
                        l.a("stateContext");
                    }
                    eVar4.a("popupbadgetext");
                }
            }
        }
        return this.n.onTouchEvent(motionEvent);
    }

    private /* synthetic */ AdPlayFunView(Context context, AttributeSet attributeSet, byte b2) {
        this(context, attributeSet, (char) 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private AdPlayFunView(Context context, AttributeSet attributeSet, char c2) {
        super(context, attributeSet, 0);
        l.d(context, "");
        MethodCollector.i(3050);
        this.f74940k = i.a((h.f.a.a) a.f74943a);
        b bVar = new b(this);
        this.f74942m = bVar;
        this.n = new GestureDetector(context, bVar);
        this.o = new d(this);
        this.f74938i = new c(this);
        MethodCollector.o(3050);
    }

    static final class d implements View.OnLayoutChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AdPlayFunView f74946a;

        static {
            Covode.recordClassIndex(46206);
        }

        d(AdPlayFunView adPlayFunView) {
            this.f74946a = adPlayFunView;
        }

        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            e stateContext = this.f74946a.getStateContext();
            g gVar = null;
            if (l.a((Object) stateContext.f74996b, (Object) "WidgetShowState")) {
                d dVar = stateContext.f75007m.get("WidgetShowState");
                if (dVar instanceof g) {
                    gVar = dVar;
                }
                g gVar2 = gVar;
                if (gVar2 != null && gVar2.f74994b.f75003i) {
                    gVar2.f74965c = a.a(gVar2.f74994b.f74999e, gVar2.f74994b.c().y);
                    Animator animator = gVar2.f74965c;
                    if (animator != null) {
                        animator.start();
                    }
                }
            } else if (l.a((Object) stateContext.f74996b, (Object) "EggShowState")) {
                d dVar2 = stateContext.f75007m.get("EggShowState");
                if (dVar2 instanceof com.ss.android.ugc.aweme.commercialize.playfun.a.c) {
                    gVar = dVar2;
                }
                com.ss.android.ugc.aweme.commercialize.playfun.a.c cVar = gVar;
                if (cVar != null) {
                    cVar.h();
                }
            }
        }
    }
}
