package com.ss.android.ugc.aweme.shoutouts.review;

import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.lifecycle.ac;
import androidx.lifecycle.ad;
import androidx.lifecycle.ae;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerList;
import com.bytedance.ies.powerlist.PowerStub;
import com.bytedance.tux.c.f;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheetHandle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.ss.android.ugc.aweme.base.utils.n;
import com.ss.android.ugc.aweme.shoutouts.review.c.a;
import com.ss.android.ugc.aweme.shoutouts.review.cell.ShoutoutReviewsCell;
import com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutPopupView;
import com.ss.android.ugc.aweme.shoutouts.review.view.ShoutOutRatingBar;
import com.ss.android.ugc.aweme.shoutouts.review.view.ShoutoutsReviewHeaderTop;
import com.ss.android.ugc.aweme.shoutouts.review.view.b;
import com.zhiliaoapp.musically.R;
import h.f.b.l;
import h.f.b.m;
import h.h;
import h.i;
import h.w;
import h.z;
import java.util.Arrays;
import java.util.Objects;

public final class c extends FrameLayout implements com.ss.android.ugc.aweme.shoutouts.review.a.a {

    /* renamed from: d  reason: collision with root package name */
    public static int f133382d = n.a(240.0d);

    /* renamed from: e  reason: collision with root package name */
    public static final a f133383e = new a((byte) 0);

    /* renamed from: a  reason: collision with root package name */
    PowerList f133384a;

    /* renamed from: b  reason: collision with root package name */
    public com.ss.android.ugc.aweme.shoutouts.api.a f133385b;

    /* renamed from: c  reason: collision with root package name */
    public TuxSheetHandle f133386c;

    /* renamed from: f  reason: collision with root package name */
    private com.ss.android.ugc.aweme.shoutouts.review.view.b f133387f;

    /* renamed from: g  reason: collision with root package name */
    private final com.ss.android.ugc.aweme.shoutouts.review.view.d f133388g;

    /* renamed from: h  reason: collision with root package name */
    private long f133389h;

    /* renamed from: i  reason: collision with root package name */
    private float f133390i;

    /* renamed from: j  reason: collision with root package name */
    private float f133391j;

    /* renamed from: k  reason: collision with root package name */
    private LinearLayout f133392k;

    /* renamed from: l  reason: collision with root package name */
    private final h f133393l;

    /* renamed from: m  reason: collision with root package name */
    private final h f133394m;

    /* access modifiers changed from: package-private */
    public final ShoutOutPopupView getPopupView() {
        return (ShoutOutPopupView) this.f133393l.getValue();
    }

    /* access modifiers changed from: package-private */
    public final ShoutoutsReviewsViewModel getViewModel() {
        return (ShoutoutsReviewsViewModel) this.f133394m.getValue();
    }

    public static final class a {
        static {
            Covode.recordClassIndex(87237);
        }

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public final a getCurrentStyle() {
        com.ss.android.ugc.aweme.shoutouts.review.view.b bVar = this.f133387f;
        if (bVar != null) {
            return bVar.getCurrentStyle();
        }
        return null;
    }

    static final class d extends m implements h.f.a.a<ShoutOutPopupView> {
        final /* synthetic */ c this$0;

        static {
            Covode.recordClassIndex(87240);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(c cVar) {
            super(0);
            this.this$0 = cVar;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ShoutOutPopupView invoke() {
            ShoutOutPopupView shoutOutPopupView = (ShoutOutPopupView) this.this$0.findViewById(R.id.e3y);
            l.b(shoutOutPopupView, "");
            shoutOutPopupView.setVisibility(0);
            return shoutOutPopupView;
        }
    }

    static final class e extends m implements h.f.a.a<ShoutoutsReviewsViewModel> {
        final /* synthetic */ Context $context;

        static {
            Covode.recordClassIndex(87241);
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        e(Context context) {
            super(0);
            this.$context = context;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        @Override // h.f.a.a
        public final /* synthetic */ ShoutoutsReviewsViewModel invoke() {
            Context context = this.$context;
            Objects.requireNonNull(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
            ac a2 = ae.a((androidx.fragment.app.e) context, (ad.b) null).a(ShoutoutsReviewsViewModel.class);
            l.b(a2, "");
            return a2;
        }
    }

    static {
        Covode.recordClassIndex(87236);
    }

    public final void a() {
        this.f133388g.getHeaderSteps().setOnlyView(true);
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        MethodCollector.i(4116);
        super.onAttachedToWindow();
        Context context = getContext();
        if (context != null) {
            View findViewById = findViewById(R.id.e3f);
            l.b(findViewById, "");
            this.f133392k = (LinearLayout) findViewById;
            Resources resources = getResources();
            l.b(resources, "");
            double d2 = (double) resources.getDisplayMetrics().heightPixels;
            Double.isNaN(d2);
            CoordinatorLayout coordinatorLayout = new CoordinatorLayout(context);
            ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, ((int) (d2 * 0.9d)) - n.a(84.0d));
            LinearLayout linearLayout = this.f133392k;
            if (linearLayout == null) {
                l.a("contentLayout");
            }
            linearLayout.addView(coordinatorLayout, layoutParams);
            FrameLayout frameLayout = new FrameLayout(context);
            coordinatorLayout.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
            frameLayout.setBackground(f.a(b.f133396a).a(context));
            PowerList powerList = new PowerList(context);
            this.f133384a = powerList;
            RecyclerView.a adapter = powerList.getAdapter();
            if (adapter != null) {
                PowerStub g2 = ((PowerAdapter) adapter).g();
                if (g2 != null) {
                    com.bytedance.ies.powerlist.a.b e2 = g2.e();
                    if (!e2.a().containsKey(c.class)) {
                        e2.a().put(c.class, this);
                    } else {
                        RuntimeException runtimeException = new RuntimeException("already contains control type :" + c.class);
                        MethodCollector.o(4116);
                        throw runtimeException;
                    }
                }
                frameLayout.addView(this.f133384a, new FrameLayout.LayoutParams(-1, -1));
                PowerList powerList2 = this.f133384a;
                if (powerList2 == null) {
                    l.b();
                }
                powerList2.a(ShoutoutReviewsCell.class);
                PowerList powerList3 = this.f133384a;
                if (powerList3 == null) {
                    l.b();
                }
                powerList3.a(0, this.f133388g);
                ViewGroup.LayoutParams layoutParams2 = frameLayout.getLayoutParams();
                if (layoutParams2 != null) {
                    ((CoordinatorLayout.e) layoutParams2).a(new BottomSheetBehavior());
                    this.f133386c = new TuxSheetHandle(context, null, 0, 6);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
                    layoutParams3.gravity = 1;
                    Resources system = Resources.getSystem();
                    l.a((Object) system, "");
                    layoutParams3.topMargin = h.g.a.a(TypedValue.applyDimension(1, 4.0f, system.getDisplayMetrics()));
                    TuxSheetHandle tuxSheetHandle = this.f133386c;
                    if (tuxSheetHandle == null) {
                        l.a("sheetHandle");
                    }
                    frameLayout.addView(tuxSheetHandle, layoutParams3);
                    BottomSheetBehavior a2 = BottomSheetBehavior.a(frameLayout);
                    l.b(a2, "");
                    a2.b(f133382d - n.a(84.0d));
                    a2.f52332h = false;
                    a2.o = new C3456c(this);
                    this.f133387f = new com.ss.android.ugc.aweme.shoutouts.review.view.b(context, (byte) 0);
                    LinearLayout linearLayout2 = this.f133392k;
                    if (linearLayout2 == null) {
                        l.a("contentLayout");
                    }
                    linearLayout2.addView(this.f133387f, new FrameLayout.LayoutParams(-1, -2));
                    a(a.CREATOR_MANAGE);
                    MethodCollector.o(4116);
                    return;
                }
                NullPointerException nullPointerException = new NullPointerException("null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
                MethodCollector.o(4116);
                throw nullPointerException;
            }
            w wVar = new w("null cannot be cast to non-null type");
            MethodCollector.o(4116);
            throw wVar;
        }
        MethodCollector.o(4116);
    }

    public final void setBottomSheetCallback(com.ss.android.ugc.aweme.shoutouts.api.a aVar) {
        this.f133385b = aVar;
    }

    /* renamed from: com.ss.android.ugc.aweme.shoutouts.review.c$c  reason: collision with other inner class name */
    public static final class C3456c extends BottomSheetBehavior.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f133397a;

        /* renamed from: b  reason: collision with root package name */
        private int f133398b;

        static {
            Covode.recordClassIndex(87239);
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        C3456c(c cVar) {
            this.f133397a = cVar;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
        public final void a(View view, float f2) {
            l.d(view, "");
            int i2 = this.f133398b;
            if (i2 != 3 && i2 != 4) {
                c.a(this.f133397a).getBottomSheetCallback().a(view, f2);
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.a
        public final void a(View view, int i2) {
            com.ss.android.ugc.aweme.shoutouts.api.a aVar;
            l.d(view, "");
            this.f133398b = i2;
            c.a(this.f133397a).getBottomSheetCallback().a(view, i2);
            if (i2 == 3) {
                com.ss.android.ugc.aweme.shoutouts.api.a aVar2 = this.f133397a.f133385b;
                if (aVar2 != null) {
                    aVar2.a(true);
                }
            } else if (i2 == 4 && (aVar = this.f133397a.f133385b) != null) {
                aVar.a(false);
            }
        }
    }

    public final void setDescription(String str) {
        if (str != null) {
            this.f133388g.setDescription(str);
        }
    }

    public final void setPostIntroVideoListener(h.f.a.b<? super h.f.a.a<z>, z> bVar) {
        getPopupView().setPostIntroVideoListener(bVar);
    }

    public static final /* synthetic */ TuxSheetHandle a(c cVar) {
        TuxSheetHandle tuxSheetHandle = cVar.f133386c;
        if (tuxSheetHandle == null) {
            l.a("sheetHandle");
        }
        return tuxSheetHandle;
    }

    public final void setGotoSeeNewRequestListener(h.f.a.a<z> aVar) {
        l.d(aVar, "");
        getPopupView().setGotoSeeNewRequestListener(aVar);
    }

    public final void setReviewBottomBtnClickListener(b.a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.shoutouts.review.view.b bVar = this.f133387f;
        if (bVar != null) {
            bVar.setReviewBottomBtnClickListener(aVar);
        }
    }

    static final class b extends m implements h.f.a.b<com.bytedance.tux.c.e, z> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f133396a = new b();

        static {
            Covode.recordClassIndex(87238);
        }

        b() {
            super(1);
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        @Override // h.f.a.b
        public final /* synthetic */ z invoke(com.bytedance.tux.c.e eVar) {
            com.bytedance.tux.c.e eVar2 = eVar;
            l.d(eVar2, "");
            eVar2.f44775a = -1;
            Resources system = Resources.getSystem();
            l.a((Object) system, "");
            eVar2.f44783i = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system.getDisplayMetrics()));
            Resources system2 = Resources.getSystem();
            l.a((Object) system2, "");
            eVar2.f44784j = Float.valueOf(TypedValue.applyDimension(1, 8.0f, system2.getDisplayMetrics()));
            return z.f158842a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private c(Context context) {
        super(context, null, 0);
        l.d(context, "");
        MethodCollector.i(4314);
        this.f133388g = new com.ss.android.ugc.aweme.shoutouts.review.view.d(context, (byte) 0);
        this.f133393l = i.a((h.f.a.a) new d(this));
        this.f133394m = i.a((h.f.a.a) new e(context));
        LayoutInflater.from(context).inflate(R.layout.b0k, this);
        MethodCollector.o(4314);
    }

    @Override // com.ss.android.ugc.aweme.shoutouts.review.a.a
    public final void a(com.ss.android.ugc.aweme.shoutouts.review.b.b bVar) {
        com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state;
        Integer valueOf;
        PowerList powerList;
        com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state2;
        l.d(bVar, "");
        PowerList powerList2 = this.f133384a;
        if (powerList2 != null && (state = powerList2.getState()) != null && (valueOf = Integer.valueOf(state.c(bVar))) != null && (powerList = this.f133384a) != null && (state2 = powerList.getState()) != null) {
            state2.b(valueOf.intValue(), bVar);
        }
    }

    public final void a(int i2) {
        ShoutOutPopupView popupView = getPopupView();
        ViewGroup.LayoutParams layoutParams = popupView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        int i3 = f133382d;
        Resources system = Resources.getSystem();
        l.a((Object) system, "");
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i3 + h.g.a.a(TypedValue.applyDimension(1, 16.0f, system.getDisplayMetrics())) + i2;
        popupView.requestLayout();
        View view = popupView.f133425b;
        if (view == null) {
            l.a("clNewRequestView");
        }
        view.setVisibility(0);
        View view2 = popupView.f133425b;
        if (view2 == null) {
            l.a("clNewRequestView");
        }
        view2.findViewById(R.id.f_i).setOnClickListener(new ShoutOutPopupView.a(popupView));
    }

    public final void a(a aVar) {
        l.d(aVar, "");
        com.ss.android.ugc.aweme.shoutouts.review.view.b bVar = this.f133387f;
        if (bVar != null) {
            bVar.a(aVar);
        }
    }

    @Override // com.ss.android.ugc.aweme.shoutouts.review.a.a
    public final void a(com.ss.android.ugc.aweme.shoutouts.review.cell.a aVar) {
        com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state;
        com.bytedance.ies.powerlist.f<com.bytedance.ies.powerlist.b.a> state2;
        l.d(aVar, "");
        PowerList powerList = this.f133384a;
        androidx.fragment.app.e eVar = null;
        if (powerList != null && (state = powerList.getState()) != null && Integer.valueOf(state.c(aVar.f133415a)) != null) {
            PowerList powerList2 = this.f133384a;
            if (!(powerList2 == null || (state2 = powerList2.getState()) == null)) {
                state2.b(aVar.f133415a);
            }
            Context context = getContext();
            if (context instanceof androidx.fragment.app.e) {
                eVar = context;
            }
            androidx.fragment.app.e eVar2 = eVar;
            if (eVar2 != null) {
                new com.bytedance.tux.g.b(eVar2).a("Deleted").b();
            }
            this.f133389h--;
            float f2 = this.f133391j - ((float) aVar.f133415a.f133367e);
            this.f133391j = f2;
            if (f2 < 0.0f) {
                this.f133391j = 0.0f;
            }
            long j2 = this.f133389h;
            if (((int) j2) == 0) {
                this.f133388g.a(0.0f, 0);
            } else {
                this.f133388g.a(this.f133391j / ((float) j2), j2);
            }
        }
    }

    public /* synthetic */ c(Context context, byte b2) {
        this(context);
    }

    public final void a(int i2, int i3, String str, float f2, long j2, boolean z, boolean z2) {
        ShoutoutsReviewHeaderTop headerTop = this.f133388g.getHeaderTop();
        headerTop.f133468m = z;
        TuxTextView tuxTextView = headerTop.f133462g;
        if (tuxTextView == null) {
            l.a("tvPrice");
        }
        tuxTextView.setText(String.valueOf(i2));
        if (str != null) {
            TuxTextView tuxTextView2 = headerTop.f133463h;
            if (tuxTextView2 == null) {
                l.a("tvExchangeRate");
            }
            Context context = headerTop.getContext();
            l.b(context, "");
            String string = context.getResources().getString(R.string.bpg);
            l.b(string, "");
            String a2 = com.a.a("%s%.2f", Arrays.copyOf(new Object[]{str, Float.valueOf(((float) i3) / 100.0f)}, 2));
            l.b(a2, "");
            String a3 = com.a.a(string, Arrays.copyOf(new Object[]{a2}, 1));
            l.b(a3, "");
            tuxTextView2.setText(a3);
        } else {
            TuxTextView tuxTextView3 = headerTop.f133463h;
            if (tuxTextView3 == null) {
                l.a("tvExchangeRate");
            }
            Context context2 = headerTop.getContext();
            l.b(context2, "");
            String string2 = context2.getResources().getString(R.string.bpg);
            l.b(string2, "");
            String a4 = com.a.a(string2, Arrays.copyOf(new Object[]{"--"}, 1));
            l.b(a4, "");
            tuxTextView3.setText(a4);
        }
        if (!z2 || j2 < 10) {
            ShoutOutRatingBar shoutOutRatingBar = headerTop.f133464i;
            if (shoutOutRatingBar == null) {
                l.a("ratingBar");
            }
            Context context3 = headerTop.getContext();
            l.b(context3, "");
            shoutOutRatingBar.setStarIdleDrawable(context3.getResources().getDrawable(2131233817));
            ShoutOutRatingBar shoutOutRatingBar2 = headerTop.f133464i;
            if (shoutOutRatingBar2 == null) {
                l.a("ratingBar");
            }
            shoutOutRatingBar2.setStar(0.0f);
            TuxTextView tuxTextView4 = headerTop.f133465j;
            if (tuxTextView4 == null) {
                l.a("tvRatingCount");
            }
            tuxTextView4.setText(headerTop.getContext().getString(R.string.dhv));
            TextView textView = headerTop.f133467l;
            if (textView == null) {
                l.a("tvRatingAvg");
            }
            textView.setVisibility(8);
        } else {
            ShoutOutRatingBar shoutOutRatingBar3 = headerTop.f133464i;
            if (shoutOutRatingBar3 == null) {
                l.a("ratingBar");
            }
            shoutOutRatingBar3.setStar(f2);
            TuxTextView tuxTextView5 = headerTop.f133465j;
            if (tuxTextView5 == null) {
                l.a("tvRatingCount");
            }
            String string3 = headerTop.getContext().getString(R.string.ddq);
            l.b(string3, "");
            String a5 = com.a.a(string3, Arrays.copyOf(new Object[]{com.ss.android.ugc.aweme.i18n.b.a(j2)}, 1));
            l.b(a5, "");
            tuxTextView5.setText(a5);
            TextView textView2 = headerTop.f133467l;
            if (textView2 == null) {
                l.a("tvRatingAvg");
            }
            String a6 = com.a.a("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1));
            l.b(a6, "");
            textView2.setText(a6);
            TextView textView3 = headerTop.f133467l;
            if (textView3 == null) {
                l.a("tvRatingAvg");
            }
            textView3.setVisibility(0);
        }
        ImageView imageView = headerTop.f133466k;
        if (imageView == null) {
            l.a("ivHelp");
        }
        imageView.setOnClickListener(new ShoutoutsReviewHeaderTop.a(headerTop));
        this.f133389h = j2;
        this.f133390i = f2;
        this.f133391j = ((float) j2) * f2;
    }
}
