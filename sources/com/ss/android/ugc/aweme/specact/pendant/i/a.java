package com.ss.android.ugc.aweme.specact.pendant.i;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.v2.instrumentation.ClickAgent;
import com.bytedance.common.utility.n;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.ugc.appcontext.d;
import com.kakao.usermgmt.StringSet;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.local_test.a;
import com.ss.android.ugc.aweme.pendant.OptimizedLottieAnimationView;
import com.ss.android.ugc.aweme.pendant.b;
import com.ss.android.ugc.aweme.specact.pendant.c.a.a.a;
import com.ss.android.ugc.aweme.specact.pendant.c.b.a;
import com.ss.android.ugc.aweme.specact.pendant.c.c.a;
import com.ss.android.ugc.aweme.specact.pendant.c.d.b;
import com.ss.android.ugc.aweme.specact.pendant.c.e.b;
import com.ss.android.ugc.aweme.specact.pendant.h.c;
import com.ss.android.ugc.aweme.specact.pendant.h.g;
import com.ss.android.ugc.aweme.specact.pendant.h.h;
import com.ss.android.ugc.aweme.specact.pendant.views.a;
import com.ss.android.ugc.aweme.specact.pendant.views.b;
import com.ss.android.ugc.aweme.utils.gb;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public final class a implements View.OnClickListener, com.ss.android.ugc.aweme.specact.pendant.e.a {

    /* renamed from: f  reason: collision with root package name */
    public static final C3491a f134316f = new C3491a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    public com.ss.android.ugc.aweme.specact.pendant.views.b f134317a;

    /* renamed from: b  reason: collision with root package name */
    public View.OnClickListener f134318b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f134319c;

    /* renamed from: d  reason: collision with root package name */
    public UgAwemeActivitySetting f134320d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f134321e;

    /* renamed from: g  reason: collision with root package name */
    private ViewGroup f134322g;

    /* renamed from: h  reason: collision with root package name */
    private com.ss.android.ugc.aweme.specact.pendant.views.a f134323h;

    /* renamed from: i  reason: collision with root package name */
    private int f134324i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f134325j;

    /* renamed from: k  reason: collision with root package name */
    private int f134326k;

    /* renamed from: l  reason: collision with root package name */
    private boolean f134327l;

    static {
        Covode.recordClassIndex(87842);
    }

    /* renamed from: com.ss.android.ugc.aweme.specact.pendant.i.a$a  reason: collision with other inner class name */
    public static final class C3491a {
        static {
            Covode.recordClassIndex(87843);
        }

        private C3491a() {
        }

        public /* synthetic */ C3491a(byte b2) {
            this();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final boolean g() {
        return this.f134321e;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final boolean j() {
        return this.f134325j;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void a(boolean z, boolean z2) {
        com.ss.android.ugc.aweme.specact.pendant.views.b bVar;
        if (a()) {
            int i2 = 0;
            if (z2) {
                this.f134326k = 0;
            }
            if (this.f134325j != z || this.f134319c != z2) {
                this.f134325j = z;
                this.f134319c = z2;
                if (z2) {
                    this.f134321e = false;
                }
                int i3 = this.f134324i;
                int i4 = 8;
                if (i3 == 0) {
                    com.ss.android.ugc.aweme.specact.pendant.views.a aVar = this.f134323h;
                    if (aVar != null) {
                        if (z) {
                            i4 = 0;
                        }
                        aVar.setVisibility(i4);
                    }
                    if (this.f134319c && e()) {
                        com.ss.android.ugc.aweme.specact.pendant.views.a aVar2 = this.f134323h;
                        if (aVar2 != null) {
                            aVar2.a();
                        }
                        this.f134327l = false;
                    }
                } else if (i3 == 1 && (bVar = this.f134317a) != null) {
                    if (!z) {
                        i2 = 8;
                    }
                    bVar.setVisibility(i2);
                }
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void a(boolean z, String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        this.f134324i = z ? 1 : 0;
        this.f134325j = true;
        this.f134321e = false;
        this.f134327l = false;
        this.f134326k = 0;
        int i2 = 8;
        if (z) {
            com.ss.android.ugc.aweme.specact.pendant.views.b bVar = this.f134317a;
            if (bVar != null) {
                bVar.a();
            }
            com.ss.android.ugc.aweme.specact.pendant.views.a aVar = this.f134323h;
            if (aVar != null) {
                aVar.setVisibility(8);
            }
            com.ss.android.ugc.aweme.specact.pendant.views.b bVar2 = this.f134317a;
            if (bVar2 != null) {
                bVar2.setVisibility(0);
            }
        } else {
            com.ss.android.ugc.aweme.specact.pendant.views.b bVar3 = this.f134317a;
            if (bVar3 != null) {
                bVar3.setVisibility(8);
            }
            com.ss.android.ugc.aweme.specact.pendant.views.a aVar2 = this.f134323h;
            if (aVar2 != null) {
                aVar2.setVisibility(0);
            }
            com.ss.android.ugc.aweme.specact.pendant.views.a aVar3 = this.f134323h;
            if (aVar3 != null) {
                l.d(str, "");
                l.d(str2, "");
                aVar3.f134349j = str;
                aVar3.f134350k = str2;
                if (!aVar3.f134340a) {
                    aVar3.f134351l = true;
                    aVar3.getSmartImageView().setVisibility(0);
                    aVar3.getSmallSmartImageView().setVisibility(8);
                    aVar3.a(80.0f, 80.0f);
                    aVar3.getSmartImageView().setImageURI(str);
                } else {
                    aVar3.getSmartImageView().setVisibility(8);
                    aVar3.getSmallSmartImageView().setVisibility(0);
                    aVar3.a(32.0f, 107.0f);
                    aVar3.getSmallSmartImageView().setImageURI(str2);
                }
                ImageView closeView = aVar3.getCloseView();
                if (aVar3.f134351l) {
                    i2 = 0;
                }
                closeView.setVisibility(i2);
                aVar3.getCloseView().setOnClickListener(new a.b(aVar3));
                aVar3.setBackground(null);
            }
        }
        if (c.a(c.a())) {
            a(false, false);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final boolean d() {
        if (this.f134324i == 1) {
            return true;
        }
        return false;
    }

    private final Context k() {
        Context context;
        ViewGroup viewGroup = this.f134322g;
        if (viewGroup == null || (context = viewGroup.getContext()) == null) {
            return d.a();
        }
        return context;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final boolean e() {
        com.ss.android.ugc.aweme.specact.pendant.views.a aVar = this.f134323h;
        if (aVar == null || !aVar.getStaticPendantIsFold()) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void f() {
        com.ss.android.ugc.aweme.specact.pendant.views.b bVar;
        if (d() && (bVar = this.f134317a) != null) {
            bVar.a();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void h() {
        com.ss.android.ugc.aweme.specact.pendant.views.a aVar = this.f134323h;
        if (aVar != null) {
            aVar.setVisibility(0);
        }
        this.f134325j = true;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void i() {
        com.ss.android.ugc.aweme.specact.pendant.views.a aVar = this.f134323h;
        if (aVar != null) {
            aVar.setVisibility(8);
        }
        this.f134325j = false;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final boolean a() {
        if (this.f134322g == null) {
            return false;
        }
        com.ss.android.ugc.aweme.specact.pendant.views.b bVar = this.f134317a;
        if (bVar != null && bVar.getParent() != null) {
            return true;
        }
        com.ss.android.ugc.aweme.specact.pendant.views.a aVar = this.f134323h;
        if (aVar == null || aVar.getParent() == null) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void b() {
        com.ss.android.ugc.aweme.specact.pendant.views.b bVar;
        if (a() && d() && (bVar = this.f134317a) != null) {
            bVar.f134360a = 0;
            bVar.getProgressBarTimerView().setVisibility(4);
            OptimizedLottieAnimationView lottieView = bVar.getLottieView();
            lottieView.a(0, 64);
            lottieView.setRepeatCount(0);
            lottieView.setRepeatMode(1);
            lottieView.a(new b.i());
            lottieView.a();
        }
    }

    public static final class b implements a.AbstractC3492a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f134328a;

        static {
            Covode.recordClassIndex(87844);
        }

        @Override // com.ss.android.ugc.aweme.specact.pendant.views.a.AbstractC3492a
        public final void a() {
            String aid;
            if (this.f134328a.a()) {
                if (c.a() == null) {
                    aid = "";
                } else {
                    Aweme a2 = c.a();
                    if (a2 == null) {
                        l.b();
                    }
                    aid = a2.getAid();
                }
                l.b(aid, "");
                boolean z = this.f134328a.f134319c;
                h.a("finished", "non_tracker", 0, aid, z ? 1 : 0, "close", this.f134328a.f134320d);
                this.f134328a.f134321e = true;
                this.f134328a.a(false, false);
                b.C2935b.f114627a.b();
            }
        }

        b(a aVar) {
            this.f134328a = aVar;
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void c() {
        MethodCollector.i(10721);
        if (a()) {
            this.f134322g = null;
            com.ss.android.ugc.aweme.specact.pendant.views.b bVar = this.f134317a;
            if (bVar == null) {
                l.b();
            }
            if (bVar.getParent() != null) {
                com.ss.android.ugc.aweme.specact.pendant.views.b bVar2 = this.f134317a;
                if (bVar2 == null) {
                    l.b();
                }
                ViewParent parent = bVar2.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeView(this.f134317a);
                } else {
                    NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    MethodCollector.o(10721);
                    throw nullPointerException;
                }
            }
            com.ss.android.ugc.aweme.specact.pendant.views.a aVar = this.f134323h;
            if (aVar == null) {
                l.b();
            }
            if (aVar.getParent() != null) {
                com.ss.android.ugc.aweme.specact.pendant.views.a aVar2 = this.f134323h;
                if (aVar2 == null) {
                    l.b();
                }
                ViewParent parent2 = aVar2.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(this.f134323h);
                } else {
                    NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    MethodCollector.o(10721);
                    throw nullPointerException2;
                }
            }
        }
        this.f134317a = null;
        this.f134323h = null;
        this.f134325j = false;
        MethodCollector.o(10721);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void a(UgAwemeActivitySetting ugAwemeActivitySetting) {
        this.f134320d = ugAwemeActivitySetting;
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final boolean a(int i2) {
        if (i2 <= 0 || i2 > this.f134326k + 1) {
            return false;
        }
        return true;
    }

    public final void onClick(View view) {
        ClickAgent.onClick(view);
        View.OnClickListener onClickListener = this.f134318b;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void b(String str) {
        ViewGroup.LayoutParams layoutParams;
        int b2;
        l.d(str, "");
        com.ss.android.ugc.aweme.specact.pendant.views.a aVar = this.f134323h;
        if (aVar != null) {
            l.d(str, "");
            com.ss.android.ugc.aweme.specact.pendant.c.a.a.a aVar2 = aVar.f134341b;
            int i2 = 1;
            if (aVar2 == null || !aVar2.f134115b) {
                if (aVar.f134343d == null) {
                    aVar.f134342c = aVar.findViewById(R.id.e3c);
                    aVar.f134343d = (TextView) aVar.findViewById(R.id.e3d);
                }
                TextView textView = aVar.f134343d;
                if (textView != null) {
                    textView.setText(str);
                }
                View view = aVar.f134342c;
                ViewGroup.LayoutParams layoutParams2 = null;
                if (view != null) {
                    layoutParams = view.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (str.length() <= 11) {
                    b2 = (int) n.b(aVar.getContext(), 80.0f);
                } else {
                    b2 = (int) n.b(aVar.getContext(), 300.0f);
                    i2 = 0;
                }
                if (layoutParams != null) {
                    layoutParams.width = b2;
                }
                View view2 = aVar.f134342c;
                if (view2 != null) {
                    view2.setLayoutParams(layoutParams);
                }
                TextView textView2 = aVar.f134343d;
                if (textView2 != null) {
                    layoutParams2 = textView2.getLayoutParams();
                }
                Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) layoutParams2;
                layoutParams3.gravity = i2;
                TextView textView3 = aVar.f134343d;
                if (textView3 != null) {
                    textView3.setLayoutParams(layoutParams3);
                }
                View view3 = aVar.f134342c;
                if (view3 == null) {
                    l.b();
                }
                aVar.f134341b = new com.ss.android.ugc.aweme.specact.pendant.c.a.a.a(aVar, view3);
                com.ss.android.ugc.aweme.specact.pendant.c.a.a.a aVar3 = aVar.f134341b;
                if (aVar3 != null) {
                    aVar3.f134116c.setCanDrag(false);
                    aVar3.f134117d.setVisibility(4);
                    aVar3.f134117d.postDelayed(new a.c(aVar3), 100);
                }
                r.a("widget_bubble2_show", new com.ss.android.ugc.aweme.app.f.d().a(StringSet.type, "tapme_short_inform").f66730a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void d(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.specact.pendant.views.b bVar = this.f134317a;
        if (bVar != null) {
            l.d(str, "");
            if (bVar.f134366g == null) {
                bVar.f134363d = bVar.findViewById(R.id.cj9);
                bVar.f134364e = bVar.findViewById(R.id.cj7);
                bVar.f134365f = bVar.findViewById(R.id.cj8);
                bVar.f134366g = (TextView) bVar.findViewById(R.id.cj_);
                bVar.f134367h = bVar.findViewById(R.id.a7x);
                View view = bVar.f134367h;
                if (view != null) {
                    view.setOnClickListener(new b.n(bVar));
                }
            }
            TextView textView = bVar.f134366g;
            if (textView != null) {
                textView.setText(str);
            }
            View view2 = bVar.f134363d;
            if (view2 == null) {
                l.b();
            }
            View view3 = bVar.f134364e;
            if (view3 == null) {
                l.b();
            }
            View view4 = bVar.f134365f;
            if (view4 == null) {
                l.b();
            }
            bVar.f134370k = new com.ss.android.ugc.aweme.specact.pendant.c.d.b(bVar, view2, view3, view4);
            com.ss.android.ugc.aweme.specact.pendant.c.d.b bVar2 = bVar.f134370k;
            if (bVar2 != null) {
                bVar2.f134171d.setVisibility(4);
                bVar2.f134171d.postDelayed(new b.c(bVar2), 1000);
            }
            r.a("widget_bubble2_show", new com.ss.android.ugc.aweme.app.f.d().a(StringSet.type, "watch_video").f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void a(ViewGroup viewGroup) {
        int i2;
        MethodCollector.i(10554);
        l.d(viewGroup, "");
        if (a()) {
            MethodCollector.o(10554);
            return;
        }
        this.f134322g = viewGroup;
        if (this.f134317a == null) {
            com.ss.android.ugc.aweme.specact.pendant.views.b bVar = new com.ss.android.ugc.aweme.specact.pendant.views.b(k(), (byte) 0);
            bVar.setOnClickListener(this);
            this.f134317a = bVar;
        }
        if (this.f134323h == null) {
            com.ss.android.ugc.aweme.specact.pendant.views.a aVar = new com.ss.android.ugc.aweme.specact.pendant.views.a(k(), (byte) 0);
            aVar.setOnClickListener(this);
            aVar.setSubViewListener(new b(this));
            this.f134323h = aVar;
        }
        com.ss.android.ugc.aweme.specact.pendant.views.b bVar2 = this.f134317a;
        if (bVar2 == null) {
            l.b();
        }
        if (bVar2.getParent() != null) {
            com.ss.android.ugc.aweme.specact.pendant.views.b bVar3 = this.f134317a;
            if (bVar3 == null) {
                l.b();
            }
            ViewParent parent = bVar3.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f134317a);
            } else {
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.o(10554);
                throw nullPointerException;
            }
        }
        com.ss.android.ugc.aweme.specact.pendant.views.a aVar2 = this.f134323h;
        if (aVar2 == null) {
            l.b();
        }
        if (aVar2.getParent() != null) {
            com.ss.android.ugc.aweme.specact.pendant.views.a aVar3 = this.f134323h;
            if (aVar3 == null) {
                l.b();
            }
            ViewParent parent2 = aVar3.getParent();
            if (parent2 != null) {
                ((ViewGroup) parent2).removeView(this.f134323h);
            } else {
                NullPointerException nullPointerException2 = new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                MethodCollector.o(10554);
                throw nullPointerException2;
            }
        }
        if ((viewGroup instanceof FrameLayout) || (viewGroup instanceof RelativeLayout)) {
            viewGroup.addView(this.f134317a);
            viewGroup.addView(this.f134323h);
        }
        int c2 = n.c(k(), ((float) n.e(k())) + 0.0f);
        if (g.a()) {
            i2 = 80;
        } else {
            i2 = 70;
        }
        int i3 = c2 + i2;
        com.ss.android.ugc.aweme.specact.pendant.views.b bVar4 = this.f134317a;
        if (bVar4 == null) {
            l.b();
        }
        ViewGroup.LayoutParams layoutParams = bVar4.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.width = -2;
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).topMargin = (int) n.b(k(), (float) i3);
        }
        com.ss.android.ugc.aweme.specact.pendant.views.b bVar5 = this.f134317a;
        if (bVar5 == null) {
            l.b();
        }
        bVar5.setLayoutParams(layoutParams);
        com.ss.android.ugc.aweme.specact.pendant.views.a aVar4 = this.f134323h;
        if (aVar4 == null) {
            l.b();
        }
        ViewGroup.LayoutParams layoutParams2 = aVar4.getLayoutParams();
        layoutParams2.height = -2;
        layoutParams2.width = -2;
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams2).topMargin = (int) n.b(k(), (float) i3);
        }
        com.ss.android.ugc.aweme.specact.pendant.views.a aVar5 = this.f134323h;
        if (aVar5 == null) {
            l.b();
        }
        aVar5.setLayoutParams(layoutParams2);
        MethodCollector.o(10554);
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void c(String str) {
        l.d(str, "");
        com.ss.android.ugc.aweme.specact.pendant.views.b bVar = this.f134317a;
        if (bVar != null) {
            l.d(str, "");
            if (bVar.f134362c == null) {
                bVar.f134361b = bVar.findViewById(R.id.e3c);
                bVar.f134362c = (TextView) bVar.findViewById(R.id.e3d);
            }
            TextView textView = bVar.f134362c;
            if (textView != null) {
                textView.setText(str);
            }
            View view = bVar.f134361b;
            if (view == null) {
                l.b();
            }
            bVar.f134369j = new com.ss.android.ugc.aweme.specact.pendant.c.b.a(bVar, view);
            com.ss.android.ugc.aweme.specact.pendant.c.b.a aVar = bVar.f134369j;
            if (aVar != null) {
                aVar.f134137c.setPivotX(com.ss.android.ugc.aweme.specact.pendant.c.b.a.a(aVar.f134137c.getContext(), 20.0f));
                aVar.f134137c.setPivotY(com.ss.android.ugc.aweme.specact.pendant.c.b.a.a(aVar.f134137c.getContext(), 25.0f));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(ObjectAnimator.ofFloat(aVar.f134137c, "scaleX", 1.3f, 1.0f), ObjectAnimator.ofFloat(aVar.f134137c, "scaleY", 1.3f, 1.0f));
                animatorSet.setDuration(297L);
                animatorSet.addListener(new a.c(aVar));
                animatorSet.setTarget(aVar.f134137c);
                AnimatorSet animatorSet2 = new AnimatorSet();
                animatorSet2.playTogether(ObjectAnimator.ofFloat(aVar.f134137c, "scaleX", 0.0f, 1.3f), ObjectAnimator.ofFloat(aVar.f134137c, "scaleY", 0.0f, 1.3f));
                animatorSet2.setDuration(528L);
                animatorSet2.addListener(new a.d(aVar, animatorSet));
                animatorSet2.setTarget(aVar.f134137c);
                aVar.f134137c.setVisibility(0);
                animatorSet2.start();
                aVar.f134135a = false;
            }
            r.a("widget_bubble2_show", new com.ss.android.ugc.aweme.app.f.d().a(StringSet.type, "tapme_timer_short_inform").f66730a);
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void a(String str) {
        com.ss.android.ugc.aweme.specact.pendant.views.b bVar;
        AnimatorSet animatorSet;
        if (str != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("canival_ratio", 1);
                boolean optBoolean = jSONObject.optBoolean("show_points");
                int optInt2 = jSONObject.optInt("display_amount");
                LocalTestApi localTestApi = a.C2792a.f108997a.f108996a;
                l.b(localTestApi, "");
                localTestApi.getSpecActDebugService().a("SpecPendant", "onTaskDoneResult: showPoints:" + optBoolean + "  ratio:" + optInt + "  displayAmount:" + optInt2);
                if (optBoolean && optInt2 > 0 && (bVar = this.f134317a) != null) {
                    Animator animator = bVar.f134371l;
                    if (animator != null) {
                        animator.cancel();
                    }
                    String concat = "+".concat(String.valueOf(optInt2));
                    if (optInt > 1) {
                        String str2 = "+" + (optInt2 / optInt);
                        bVar.getBonusTextView().setTranslationY(bVar.a(2.0f));
                        bVar.getBonusTextView().setVisibility(0);
                        ObjectAnimator duration = ObjectAnimator.ofFloat(bVar.getBonusTextView(), "translationY", bVar.a(7.0f)).setDuration(333L);
                        l.b(duration, "");
                        ObjectAnimator duration2 = ObjectAnimator.ofPropertyValuesHolder(bVar.getBonusTextView(), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("translationY", bVar.a(7.0f), bVar.a(6.0f))).setDuration(133L);
                        l.b(duration2, "");
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.playSequentially(duration, duration2);
                        animatorSet2.addListener(new b.j(bVar, str2));
                        Animator c2 = bVar.c();
                        c2.addListener(new b.k(bVar, concat));
                        animatorSet = new AnimatorSet();
                        animatorSet.playSequentially(animatorSet2, c2);
                    } else {
                        bVar.getBonusTextView().setTranslationY(bVar.a(6.0f));
                        bVar.getBonusTextView().setScaleY(0.0f);
                        bVar.getBonusTextView().setVisibility(0);
                        Animator c3 = bVar.c();
                        c3.addListener(new b.l(bVar, concat));
                        animatorSet = new AnimatorSet();
                        animatorSet.play(c3);
                    }
                    bVar.f134371l = animatorSet;
                    Animator animator2 = bVar.f134371l;
                    if (animator2 != null) {
                        animator2.addListener(new b.h(bVar));
                        animator2.start();
                    }
                }
            } catch (JSONException unused) {
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void b(boolean z, boolean z2) {
        if ((!z || !z2) && !d()) {
            i();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void a(int i2, int i3) {
        com.ss.android.ugc.aweme.specact.pendant.views.b bVar;
        if (a() && d() && (bVar = this.f134317a) != null && i2 >= 0 && i3 >= 0 && i2 <= i3 && bVar.f134360a <= i2) {
            bVar.getProgressBarTimerView().setVisibility(0);
            ValueAnimator ofFloat = ValueAnimator.ofFloat((float) bVar.f134360a, (float) i2);
            l.b(ofFloat, "");
            ofFloat.setDuration(1000L);
            ofFloat.setInterpolator(new LinearInterpolator());
            ofFloat.addUpdateListener(new b.o(bVar, i3));
            bVar.f134360a = i2;
            ofFloat.start();
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void b(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.specact.pendant.views.a aVar = this.f134323h;
        if (aVar != null) {
            l.d(str, "");
            l.d(str2, "");
            com.ss.android.ugc.aweme.specact.pendant.c.c.a aVar2 = aVar.f134352m;
            if (aVar2 == null || !aVar2.f134149b) {
                aVar.f134344e = aVar.findViewById(R.id.cj9);
                aVar.f134345f = aVar.findViewById(R.id.cj7);
                aVar.f134346g = aVar.findViewById(R.id.cj8);
                aVar.f134347h = (TextView) aVar.findViewById(R.id.cj_);
                aVar.f134348i = aVar.findViewById(R.id.a7x);
                View view = aVar.f134348i;
                if (view != null) {
                    view.setOnClickListener(new a.e(aVar, str2));
                }
                TextView textView = aVar.f134347h;
                if (textView != null) {
                    textView.setText(str);
                }
                View view2 = aVar.f134344e;
                if (view2 == null) {
                    l.b();
                }
                View view3 = aVar.f134345f;
                if (view3 == null) {
                    l.b();
                }
                View view4 = aVar.f134346g;
                if (view4 == null) {
                    l.b();
                }
                aVar.f134352m = new com.ss.android.ugc.aweme.specact.pendant.c.c.a(aVar, view2, view3, view4);
                com.ss.android.ugc.aweme.specact.pendant.c.c.a aVar3 = aVar.f134352m;
                if (aVar3 != null) {
                    aVar3.f134152e.setVisibility(4);
                    aVar3.f134152e.postDelayed(new a.c(aVar3), 100);
                }
                r.a("widget_bubble2_show", new com.ss.android.ugc.aweme.app.f.d().a(StringSet.type, str2).f66730a);
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void a(String str, String str2) {
        l.d(str, "");
        l.d(str2, "");
        com.ss.android.ugc.aweme.specact.pendant.views.b bVar = this.f134317a;
        if (bVar != null) {
            l.d(str, "");
            l.d(str2, "");
            com.ss.android.ugc.aweme.specact.pendant.c.e.b bVar2 = bVar.f134368i;
            if (bVar2 == null || !bVar2.f134189c) {
                if (bVar.f134362c == null) {
                    bVar.f134361b = bVar.findViewById(R.id.e3c);
                    bVar.f134362c = (TextView) bVar.findViewById(R.id.e3d);
                    bVar.f134363d = bVar.findViewById(R.id.cj9);
                    bVar.f134364e = bVar.findViewById(R.id.cj7);
                    bVar.f134365f = bVar.findViewById(R.id.cj8);
                    bVar.f134366g = (TextView) bVar.findViewById(R.id.cj_);
                    bVar.f134367h = bVar.findViewById(R.id.a7x);
                    View view = bVar.f134367h;
                    if (view != null) {
                        view.setOnClickListener(new b.c(bVar));
                    }
                }
                TextView textView = bVar.f134366g;
                if (textView != null) {
                    textView.setText(str);
                }
                TextView textView2 = bVar.f134362c;
                if (textView2 != null) {
                    textView2.setText(str2);
                }
                View view2 = bVar.f134361b;
                if (view2 == null) {
                    l.b();
                }
                View view3 = bVar.f134363d;
                if (view3 == null) {
                    l.b();
                }
                View view4 = bVar.f134364e;
                if (view4 == null) {
                    l.b();
                }
                View view5 = bVar.f134365f;
                if (view5 == null) {
                    l.b();
                }
                bVar.f134368i = new com.ss.android.ugc.aweme.specact.pendant.c.e.b(bVar, view2, view3, view4, view5);
                com.ss.android.ugc.aweme.specact.pendant.c.e.b bVar3 = bVar.f134368i;
                if (bVar3 != null) {
                    bVar3.f134193g.setVisibility(4);
                    bVar3.f134193g.postDelayed(new b.d(bVar3), 100);
                }
                r.onEventV3("widget_bubble_show");
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.specact.pendant.e.a
    public final void a(String str, int i2, boolean z) {
        float width;
        l.d(str, "");
        int i3 = this.f134326k + 1;
        this.f134326k = i3;
        if (!this.f134327l && i3 >= i2) {
            this.f134327l = true;
            if (this.f134323h != null) {
                boolean a2 = gb.a();
                com.ss.android.ugc.aweme.specact.pendant.views.a aVar = this.f134323h;
                if (aVar == null) {
                    l.b();
                }
                l.d(str, "");
                aVar.f134340a = true;
                aVar.setCanDrag(false);
                aVar.setCloseViewStatus(z);
                aVar.f134351l = z;
                ViewParent parent = aVar.getParent();
                Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
                View view = (View) parent;
                if (!a2) {
                    width = n.b(aVar.getContext(), -80.0f);
                } else {
                    width = (float) view.getWidth();
                }
                aVar.animate().setListener(new a.d(aVar, str, a2)).x(width).y(aVar.getY()).setInterpolator(new DecelerateInterpolator()).setDuration(200).start();
            }
        }
    }
}
